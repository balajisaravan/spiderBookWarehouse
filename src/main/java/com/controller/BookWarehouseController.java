package com.controller;

import com.customValidation.BookWarehouseCustomValidation;
import com.dto.BookWarehouseDto;
import com.service.BookWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.validation.Valid;

@Controller
public class BookWarehouseController {

    @Autowired
    private BookWarehouseService bookWarehouseService;

    @Autowired
    private BookWarehouseCustomValidation bookWarehouseCustomValidation;

    private static final Logger logger = LogManager.getLogger(BookWarehouseController.class);

    @RequestMapping(value = "/addBook", method = RequestMethod.GET)
    public String addBook(Model model) {
        BasicConfigurator.configure();
        getLogger().info("Inside addBook method");
        model.addAttribute("bookWarehouseDto", new BookWarehouseDto());

        return "addBookPage";
    }

    @RequestMapping(value = "/addBookSave", method = RequestMethod.POST)
    public String addBookSave(@Valid @ModelAttribute BookWarehouseDto bookWarehouseDto, BindingResult bindingResult) {
        bookWarehouseCustomValidation.validate(bookWarehouseDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "addBookPage";
        } else {
            bookWarehouseService.addBookSave(bookWarehouseDto);

            return "redirect:/getAllBooks";
        }

    }

    @RequestMapping(value = "/getAllBooks")
    public String getAllBooks(Model model) {
        List<BookWarehouseDto> bookWarehouseDto = bookWarehouseService.getAllBooks();
        model.addAttribute("bookWarehouseDto", bookWarehouseDto);

        return "getAllBooksPage";
    }

    @RequestMapping(value = "/edit/{bookId}", method = RequestMethod.GET)
    public String edit(@PathVariable int bookId, Model model) {
        BookWarehouseDto bookWarehouseDto = bookWarehouseService.getDetailsByBookId(bookId);
        model.addAttribute("bookWarehouseDto", bookWarehouseDto);

        return "editPage";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String getAllBooks(@ModelAttribute BookWarehouseDto bookWarehouseDto) {
        bookWarehouseService.update(bookWarehouseDto);

        return "redirect:/getAllBooks";
    }

    @RequestMapping(value = "/delete/{bookId}", method = RequestMethod.GET)
    public String delete(@PathVariable int bookId) {
        bookWarehouseService.delete(bookId);

        return "redirect:/getAllBooks";
    }
    public static Logger getLogger() {
        return logger;
    }

}
