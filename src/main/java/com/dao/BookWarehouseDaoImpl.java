package com.dao;

import com.controller.BookWarehouseController;
import com.dto.BookWarehouseDto;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BookWarehouseDaoImpl implements BookWarehouseDao {

    private JdbcTemplate jdbcTemplate;

    private static final Logger logger = LogManager.getLogger(BookWarehouseController.class);

    @Override
    public int addBookSave(BookWarehouseDto bookWarehouseDto) {
        BasicConfigurator.configure();
        String sql = "insert into bookwarehouseDto(bookId,bookName,author,description,price,publishYear,sellerName,publication) values("
                + bookWarehouseDto.getBookId() + ",'" + bookWarehouseDto.getBookName() + "','" + bookWarehouseDto.getAuthor() + "','" + bookWarehouseDto.getDescription() + "','"
                + bookWarehouseDto.getPrice() + "','" + bookWarehouseDto.getPublishYear() + "','" + bookWarehouseDto.getSellerName() + "','"
                + bookWarehouseDto.getPublication() + "')";
        try {
            return getJdbcTemplate().update(sql);
        } catch (DataAccessException e) {
            getLogger().info("Inside addBookSave method", e);
        }
        return 0;
    }

    @Override
    public List<BookWarehouseDto> getAllBooks() {
        try {
            return getJdbcTemplate().query("select * from bookwarehouseDto", new RowMapper<BookWarehouseDto>() {
                public BookWarehouseDto mapRow(ResultSet rs, int row) throws SQLException {
                    BookWarehouseDto bookWarehouseDto = new BookWarehouseDto();
                    bookWarehouseDto.setBookId(rs.getInt(1));
                    bookWarehouseDto.setBookName(rs.getString(2));
                    bookWarehouseDto.setAuthor(rs.getString(3));
                    bookWarehouseDto.setDescription(rs.getString(4));
                    bookWarehouseDto.setPrice(rs.getString(5));
                    bookWarehouseDto.setPublishYear(rs.getString(6));
                    bookWarehouseDto.setSellerName(rs.getString(7));
                    bookWarehouseDto.setPublication(rs.getString(8));

                    return bookWarehouseDto;
                }
            });
        } catch (DataAccessException e){
            getLogger().info("Inside getAllBooks method", e);
        }
        return null;
    }

    public BookWarehouseDto getDetailsByBookId(int bookId) {
        String sql = "select * from bookwarehouseDto where bookId = ?";
        try {
            return getJdbcTemplate().queryForObject(sql, new Object[]{bookId},
                    new BeanPropertyRowMapper<BookWarehouseDto>(BookWarehouseDto.class));
        } catch (DataAccessException e) {
            getLogger().info("Inside getDetailsByBookId method", e);
        }
        return null;
    }

    @Override
    public List<BookWarehouseDto> getDetailsByBookName(String bookName) {
        try {
            return getJdbcTemplate().query("select * from bookwarehouseDto where bookName = '" + bookName + "'", new RowMapper<BookWarehouseDto>() {
                public BookWarehouseDto mapRow(ResultSet rs, int row) throws SQLException {
                    BookWarehouseDto bookWarehouseDto = new BookWarehouseDto();
                    bookWarehouseDto.setBookId(rs.getInt(1));
                    bookWarehouseDto.setBookName(rs.getString(2));
                    bookWarehouseDto.setAuthor(rs.getString(3));
                    bookWarehouseDto.setDescription(rs.getString(4));
                    bookWarehouseDto.setPrice(rs.getString(5));
                    bookWarehouseDto.setPublishYear(rs.getString(6));
                    bookWarehouseDto.setSellerName(rs.getString(7));
                    bookWarehouseDto.setPublication(rs.getString(8));

                    return bookWarehouseDto;
                }
            });
        }catch (DataAccessException e){
            getLogger().info("Inside getDetailsByBookName method", e);
        }
        return null;
    }

    @Override
    public List<BookWarehouseDto> getDetailsBySellerName(String sellerName) {
        try {
            return getJdbcTemplate().query("select * from bookwarehouseDto where sellerName = '" + sellerName + "'", new RowMapper<BookWarehouseDto>() {
                public BookWarehouseDto mapRow(ResultSet rs, int row) throws SQLException {
                    BookWarehouseDto bookWarehouseDto = new BookWarehouseDto();
                    bookWarehouseDto.setBookId(rs.getInt(1));
                    bookWarehouseDto.setBookName(rs.getString(2));
                    bookWarehouseDto.setAuthor(rs.getString(3));
                    bookWarehouseDto.setDescription(rs.getString(4));
                    bookWarehouseDto.setPrice(rs.getString(5));
                    bookWarehouseDto.setPublishYear(rs.getString(6));
                    bookWarehouseDto.setSellerName(rs.getString(7));
                    bookWarehouseDto.setPublication(rs.getString(8));

                    return bookWarehouseDto;
                }
            });
        }catch (DataAccessException e){
            getLogger().info("Inside getDetailsBySellerName method", e);
        }
        return null;
    }

    @Override
    public int update(BookWarehouseDto bookWarehouseDto) {
        String sql = "update bookwarehouseDto set bookName='" + bookWarehouseDto.getBookName() + "', author='" + bookWarehouseDto.getAuthor()
                + "', description='" + bookWarehouseDto.getDescription() + "',price='" + bookWarehouseDto.getPrice() + "',publishYear='"
                + bookWarehouseDto.getPublishYear() + "',sellerName='" + bookWarehouseDto.getSellerName() + "',publication='" + bookWarehouseDto.getPublication() + "' where bookId="
                + bookWarehouseDto.getBookId() + "";
        try {
            return getJdbcTemplate().update(sql);
        } catch (DataAccessException e){
            getLogger().info("Inside update method", e);
        }
        return 0;
    }

    @Override
    public int delete(int bookId) {
        String sql = "delete from bookwarehouseDto where bookId=" + bookId + "";
        try{
            return getJdbcTemplate().update(sql);
        }catch (DataAccessException e){
            getLogger().info("Inside delete method", e);
        }
        return 0;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public static Logger getLogger() {
        return logger;
    }
}
