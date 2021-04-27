package com.controllerRestServer;

import com.dto.BookWarehouseDto;
import com.serviceRestServer.BookWarehouseRestServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@RestController
public class BookWarehouseRestServerController {

    @Autowired
    private BookWarehouseRestServerService bookWarehouseRestServerService;

    private static final Logger logger = LogManager.getLogger(BookWarehouseRestServerController.class);

    @RequestMapping(value = "/addBookFromClientToServer", method = RequestMethod.POST)
    public String addBookFromClientToServer(@RequestBody BookWarehouseDto bookWarehouseDto) {
        BasicConfigurator.configure();
        getLogger().info("Inside addBookFromClientToServer method");

        return bookWarehouseRestServerService.addBookFromClientToServer(bookWarehouseDto);
    }

    @RequestMapping(value = "/updateBookFromClientToServer", method = RequestMethod.POST)
    public String updateBookFromClientToServer(@RequestBody BookWarehouseDto bookWarehouseDto) {
        BasicConfigurator.configure();
        getLogger().info("Inside updateBookFromClientToServer method");

        return bookWarehouseRestServerService.updateBookFromClientToServer(bookWarehouseDto);
    }

    @RequestMapping(value = "/convertAllBookWarehouseDtoToJson", method = RequestMethod.GET)
    public String convertAllBookWarehouseDtoToJson() {
        BasicConfigurator.configure();
        getLogger().info("Inside BookWarehouseRestServerController method");

        return bookWarehouseRestServerService.convertAllBookWarehouseDtoToJson();
    }

    @RequestMapping(value = "/convertBookWarehouseDtoToJsonByBookId/{bookId}", method = RequestMethod.GET)
    public String convertBookWarehouseDtoToJsonByBookId(@PathVariable int bookId) {
        getLogger().info("Inside convertBookWarehouseDtoToJsonByBookId method");

        return bookWarehouseRestServerService.convertBookWarehouseDtoToJsonByBookId(bookId);
    }

    @RequestMapping(value = "/convertBookWarehouseDtoToJsonByBookName/{bookName}", method = RequestMethod.GET)
    public String convertBookWarehouseDtoToJsonBybookName(@PathVariable String bookName) {
        getLogger().info("Inside convertBookWarehouseDtoToJsonBybookName method");

        return bookWarehouseRestServerService.convertBookWarehouseDtoToJsonByBookName(bookName);
    }

    @RequestMapping(value = "/convertBookWarehouseDtoToJsonBySellerName/{sellerName}", method = RequestMethod.GET)
    public String convertBookWarehouseDtoToJsonBysellerName(@PathVariable String sellerName) {
        getLogger().info("Inside convertBookWarehouseDtoToJsonBySellerName method");

        return bookWarehouseRestServerService.convertBookWarehouseDtoToJsonBySellerName(sellerName);
    }

    @RequestMapping(value = "/deleteBookFromClientToServer/{bookId}", method = RequestMethod.GET)
    public String deleteBookFromClientToServer(@PathVariable int bookId) {
        BasicConfigurator.configure();
        getLogger().info("Inside deleteBookFromClientToServer method");

        return bookWarehouseRestServerService.deleteBookFromClientToServer(bookId);
    }

    public static Logger getLogger() {
        return logger;
    }
}
