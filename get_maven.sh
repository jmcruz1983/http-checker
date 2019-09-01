#!/usr/bin/env bash

set -e

export PATH=/usr/local/bin:$PATH

#BINs
curl_bin=`which curl`
mkdir_bin=`which mkdir`
unzip_bin=`which unzip`

# VARs
mvn_ver=3.6.1
mvn_ver_major=${mvn_ver%%.*}
no_color='\033[0m'
green_color='\e[92m'

# DIRs
base_dir=$( cd "$( dirname "$0" )" && pwd )
target_dir=$base_dir/target
dw_dir=$target_dir/downloads

#URLs
mvn_url="http://ftp.cixug.es/apache/maven/maven-$mvn_ver_major/$mvn_ver/binaries/apache-maven-$mvn_ver-bin.zip"

print_green(){
    printf "$green_color$1$no_color\n"
}

# Set up dir
$mkdir_bin -p $dw_dir

# Setup maven
mvn_home=$target_dir/apache-maven-$mvn_ver
if [ ! -d $mvn_home ]; then
    # Download maven
    mvn_zip=$dw_dir/apache-maven-$mvn_ver-bin.zip
    print_green "> Setting Up Maven Version $mvn_ver"
    if [ ! -f $mvn_zip ]; then
        $curl_bin -s -o $mvn_zip $mvn_url
    fi
    # Extract maven
    if [ -f $mvn_zip ]; then
        $unzip_bin -qq -o $mvn_zip -d $target_dir
    fi
fi

# Add to path mvn home
if [ -d $mvn_home ]; then
  export M2_HOME=$mvn_home
  export PATH=$PATH:$mvn_home/bin
fi

print_green "> Maven Version $mvn_ver is set"