package com.springboot.sampleforspboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pdfReport")
@Primary
public class PdfReport implements Report{

    @Override
    public String whichrep() {
        String r = "in pdf rep";
        return r;
    }
}
