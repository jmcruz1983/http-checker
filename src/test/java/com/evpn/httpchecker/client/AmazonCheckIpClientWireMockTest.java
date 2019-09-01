package com.evpn.httpchecker.client;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;

import com.github.tomakehurst.wiremock.client.WireMock;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import org.springframework.test.annotation.DirtiesContext;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(
    webEnvironment = RANDOM_PORT,
    properties = {
        "AmazonCheckIp.url=http://localhost:9090/version",
    }
)
@AutoConfigureWireMock(port = 9090)
@DirtiesContext
public class AmazonCheckIpClientWireMockTest {

    @Autowired
    AmazonCheckIpClient client;

    @Test(expected = HttpClientErrorException.NotFound.class)
    public void checkPageNotFoundErrorTest() {
        stubFor(get("/version")
                .willReturn(WireMock.notFound()));
        client.checkMyIp();
        verify(getRequestedFor(urlEqualTo("/version")));
    }
}