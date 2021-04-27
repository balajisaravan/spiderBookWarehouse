package com.serviceRestServer;

import com.dao.BookWarehouseDao;
import com.dto.BookWarehouseDto;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class BookWarehouseRestServerServiceImpl implements BookWarehouseRestServerService {

    private BookWarehouseDao bookWarehouseDao;

    //ObjectToString
    @Override
    public String addBookFromClientToServer(BookWarehouseDto bookWarehouseDto) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(getBookWarehouseDao().addBookSave(bookWarehouseDto));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }

    @Override
    public String updateBookFromClientToServer(BookWarehouseDto bookWarehouseDto) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(getBookWarehouseDao().update(bookWarehouseDto));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }

    @Override
    public String convertAllBookWarehouseDtoToJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(getBookWarehouseDao().getAllBooks());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }

    @Override
    public String convertBookWarehouseDtoToJsonByBookId(int bookId) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(getBookWarehouseDao().getDetailsByBookId(bookId));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }

    @Override
    public String convertBookWarehouseDtoToJsonByBookName(String bookName) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(getBookWarehouseDao().getDetailsByBookName(bookName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }

    @Override
    public String convertBookWarehouseDtoToJsonBySellerName(String sellerName) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(getBookWarehouseDao().getDetailsBySellerName(sellerName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }

    @Override
    public String deleteBookFromClientToServer(int bookId) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
             return objectMapper.writeValueAsString(getBookWarehouseDao().delete(bookId));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }

    public BookWarehouseDao getBookWarehouseDao() {
        return bookWarehouseDao;
    }

    public void setBookWarehouseDao(BookWarehouseDao bookWarehouseDao) {
        this.bookWarehouseDao = bookWarehouseDao;
    }

}
