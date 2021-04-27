package com.serviceRestServer;

import com.dto.BookWarehouseDto;

public interface BookWarehouseRestServerService {

    String addBookFromClientToServer(BookWarehouseDto bookWarehouseDto);

    String updateBookFromClientToServer(BookWarehouseDto bookWarehouseDto);

    String convertAllBookWarehouseDtoToJson();

    String convertBookWarehouseDtoToJsonByBookId(int bookId);

    String convertBookWarehouseDtoToJsonByBookName(String bookName);

    String convertBookWarehouseDtoToJsonBySellerName(String sellerName);

    String deleteBookFromClientToServer(int bookId);

}
