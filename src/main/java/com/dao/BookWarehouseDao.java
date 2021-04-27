package com.dao;

import com.dto.BookWarehouseDto;

import java.util.List;

public interface BookWarehouseDao {

    /**
     * TO save into database
     * @param bookWarehouseDto
     * @return
     */
    int addBookSave(BookWarehouseDto bookWarehouseDto);

    /**
     * To get all book from database
     * @return
     */
    List<BookWarehouseDto> getAllBooks();

    /**
     * To get book by id
     * @param bookId
     * @return
     */
    BookWarehouseDto getDetailsByBookId(int bookId);

    /**
     * To get book by bookName
     * @param bookName
     * @return
     */
    List<BookWarehouseDto> getDetailsByBookName(String bookName);

    /**
     * To get book by sellerName
     * @param sellerName
     * @return
     */
    List<BookWarehouseDto> getDetailsBySellerName(String sellerName);

    /**
     * To update into database
     * @param bookWarehouseDto
     * @return
     */
    int update(BookWarehouseDto bookWarehouseDto);

    /**
     * To delete into database
     * @param bookId
     * @return
     */
    int delete(int bookId);

}
