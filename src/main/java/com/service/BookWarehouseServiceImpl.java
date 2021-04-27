package com.service;

import com.dao.BookWarehouseDao;
import com.dto.BookWarehouseDto;
import com.dto.BookWarehouseDtoList;

import java.util.ArrayList;
import java.util.List;

public class BookWarehouseServiceImpl implements BookWarehouseService {

    private OxmService oxmService;
    private BookWarehouseDao bookWarehouseDao;

    @Override
    public int addBookSave(BookWarehouseDto bookWarehouseDto) {

        return getBookWarehouseDao().addBookSave(bookWarehouseDto);
    }

    @Override
    public List<BookWarehouseDto> getAllBooks() {

        return getBookWarehouseDao().getAllBooks();
    }

    @Override
    public BookWarehouseDto getDetailsByBookId(int bookId) {

        return getBookWarehouseDao().getDetailsByBookId(bookId);
    }

    @Override
    public List<BookWarehouseDto> getDetailsByBookName(String bookName) {

        return getBookWarehouseDao().getDetailsByBookName(bookName);
    }

    @Override
    public int update(BookWarehouseDto bookWarehouseDto) {

        return getBookWarehouseDao().update(bookWarehouseDto);
    }

    @Override
    public int delete(int bookId) {

        return getBookWarehouseDao().delete(bookId);
    }

    @Override
    public String convertAllBookWarehouseDtoToXml() {
        BookWarehouseDtoList bookWarehouseDtoList = new BookWarehouseDtoList();
        bookWarehouseDtoList.setBookWarehouseDto(new ArrayList<>(bookWarehouseDao.getAllBooks()));

        return getOxmService().convertAllBookWarehouseDtoToXml(bookWarehouseDtoList);
    }

    @Override
    public Object convertXmlToAllBookWarehouseDto(String xml) {

        return getOxmService().convertXmlToObject(xml);
    }

    public OxmService getOxmService() {
        return oxmService;
    }

    public void setOxmService(OxmService oxmService) {
        this.oxmService = oxmService;
    }

    public BookWarehouseDao getBookWarehouseDao() {
        return bookWarehouseDao;
    }

    public void setBookWarehouseDao(BookWarehouseDao bookWarehouseDao) {
        this.bookWarehouseDao = bookWarehouseDao;
    }


}
