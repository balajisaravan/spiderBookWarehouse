package com.customValidation;

import com.dto.BookWarehouseDto;
import org.apache.log4j.BasicConfigurator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class BookWarehouseCustomValidation implements Validator {

    private static final Logger logger = LogManager.getLogger(BookWarehouseCustomValidation.class);

    @Override
    public boolean supports(Class<?> clazz) {
        return BookWarehouseDto.class.equals(clazz);
    }

    @Override
    public void validate(Object bookWarehouseDto, Errors bindingResult) {
        BasicConfigurator.configure();
        getLogger().info("inside the customvalidator validate method");

        ValidationUtils.rejectIfEmptyOrWhitespace(bindingResult, "bookName","bookWarehouseDto.bookName","*BookName cannot be empty");

        String author = ((BookWarehouseDto) bookWarehouseDto).getAuthor();

        if (author.isEmpty()) {
            bindingResult.rejectValue("author","bookWarehouseDto.author");
        }

        String price = ((BookWarehouseDto) bookWarehouseDto).getPrice();

        if (price.isEmpty()) {
            bindingResult.rejectValue("price","bookWarehouseDto.price");
        }

        String sellerName = ((BookWarehouseDto) bookWarehouseDto).getSellerName();

        if (sellerName.isEmpty()) {
            bindingResult.rejectValue("sellerName","bookWarehouseDto.sellerName");
        }
    }
    public static Logger getLogger() {
        return logger;
    }

}
