package com.jojoldu.book.springboot.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LogController {

    private static final Log LOG = LogFactory.getLog(LogController.class);

    @RequestMapping("/log")
    @ResponseBody
    public void logExam() {
        LOG.trace(">>> trace log");
        LOG.debug(">>> debug log");
        LOG.info(">>> info log");
        LOG.warn(">>> warn log");
    }

    @RequestMapping("/error-log")
    @ResponseBody
    public void logError() {
        LOG.error(">>> error log");
    }

//    @Scheduled(fixedDelay = 1000)
//    public void logErrorScheduled() {
//        LOG.error(">>> error scheduled");
//    }
//
//    @Scheduled(fixedDelay = 1500)
//    public void logInfoScheduled() {
//        LOG.info(">>> info scheduled");
//    }
}
