package com.gchr.wiremock;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.core.io.ClassPathResource;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * @author gongchunru
 * Date：2017/11/15.
 * Time：16:34
 */
public class MockServer {

    public static void main(String[] args) throws Exception {
        configureFor(8062);
        removeAllMappings();
        mock("/order/1","1");
        mock("/order/2","2");
    }

    private static void mock(String url, String file) throws Exception {
        ClassPathResource resource = new ClassPathResource("response/"+file+".txt");
        String content = StringUtils.join(FileUtils.readLines(resource.getFile(),"UTF-8").toArray());
        stubFor(get(urlPathEqualTo(url)).willReturn(aResponse().withBody(content).withStatus(200)));
    }
}
