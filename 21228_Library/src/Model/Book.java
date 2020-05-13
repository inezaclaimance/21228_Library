/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Book {
    @Id
    private String BookId;
    private String title;
    private String publishingHouse;
    @Temporal(value = TemporalType.DATE)
    private Date dateOfpublication;
    private String author;
    private Integer Pages;
    private BookCategory bookCategory;
 

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String BookId) {
        this.BookId = BookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Date getDateOfpublication() {
        return dateOfpublication;
    }

    public void setDateOfpublication(Date dateOfpublication) {
        this.dateOfpublication = dateOfpublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return Pages;
    }

    public void setPages(Integer Pages) {
        this.Pages = Pages;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }
    
}
