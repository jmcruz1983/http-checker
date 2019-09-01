package com.evpn.httpchecker.client;

import org.junit.Test;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.junit.runner.RunWith;

import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.client.HttpClientErrorException;

@RunWith(MockitoJUnitRunner.class)
public class AmazonCheckIpClientMockTest {

    private String checkIpUrl = "http://checkip.amazonaws.com/";

    @InjectMocks
    AmazonCheckIpClient client = new AmazonCheckIpClient();

    @Mock
    private RestTemplate restTemplate;

    @Before
    public void setup() {
        ReflectionTestUtils.setField(client, "checkIpUrl", checkIpUrl);
    }

    @Test(expected = HttpClientErrorException.NotFound.class)
    public void checkPageNotFoundErrorTest() {
        Mockito.doThrow(HttpClientErrorException.create(HttpStatus.NOT_FOUND, "", null,  null, null))
                .when(restTemplate).getForEntity(checkIpUrl, String.class);
        client.checkMyIp();
        Mockito.verify(restTemplate, Mockito.times(1)).getForEntity(checkIpUrl, String.class);
    }
}