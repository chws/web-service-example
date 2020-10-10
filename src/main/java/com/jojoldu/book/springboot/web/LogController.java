package com.jojoldu.book.springboot.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LogController {
    private static final Log LOG = LogFactory.getLog( LogController.class );

    @RequestMapping("/log")
    @ResponseBody
    public void logExam() {
        LOG.debug( ">>> debug log" );
        LOG.info( ">>> info log" );
        LOG.warn( ">>> warn log" );
        LOG.error( ">>> error log" );
    }
}
