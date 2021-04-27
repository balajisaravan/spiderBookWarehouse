package com.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BookWarehouseDtoList {

    @XmlElement
    List<BookWarehouseDto> bookWarehouseDto;

    public List<BookWarehouseDto> getBookWarehouseDto() {
        return bookWarehouseDto;
    }

    public void setBookWarehouseDto(List<BookWarehouseDto> bookWarehouseDto) {
        this.bookWarehouseDto = bookWarehouseDto;
    }

    @Override
    public String toString() {
        return "BookWarehouseDtoList{" +
                "bookWarehouseDto=" + bookWarehouseDto +
                '}';
    }
}
