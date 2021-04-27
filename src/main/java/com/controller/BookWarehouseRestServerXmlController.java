package com.controller;

import com.service.BookWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@RestController
public class BookWarehouseRestServerXmlController
{

    @Autowired
    private BookWarehouseService bookWarehouseService;

    private static final Logger logger = LogManager.getLogger(BookWarehouseController.class);

    @RequestMapping(value ="/convertAllBookWarehouseDtoToXml", produces = {"application/xml"})
    public String convertAllBookWarehouseDtoToXml(){
        BasicConfigurator.configure();
        getLogger().info("Inside convertAllBookWarehouseDtoToXml method");

        return bookWarehouseService.convertAllBookWarehouseDtoToXml();
    }

    @RequestMapping(value ="/convertXmlToAllBookWarehouseDto")
    public Object convertXmlToAllBookWarehouseDto(){
        String xml = bookWarehouseService.convertAllBookWarehouseDtoToXml();
        getLogger().info("Inside convertAllBookWarehouseDtoToXml method"+bookWarehouseService.convertXmlToAllBookWarehouseDto(xml));

        return bookWarehouseService.convertXmlToAllBookWarehouseDto(xml);
    }

    public static Logger getLogger() {
        return logger;
    }

}
