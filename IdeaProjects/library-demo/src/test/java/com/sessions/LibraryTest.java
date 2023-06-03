package com.sessions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class LibraryTest {
  Library library;
  @BeforeAll
  public static void beforeAll()
  {
      System.out.println("Initiating Test Process");
  }
  @BeforeEach
  public void setup()
  {library= new Library();
      System.out.println("Setup Initiated");
  }

    @Test
    public void the_default_number_of_books_in_library_should_be_1_Initially()
    {
        //Library library= new Library();
        int totalNumberOfBooks=library.getBooks().size();
        assertEquals(1,totalNumberOfBooks);
    }
@Test
    public void the_ID_of_next_book_is_2_size_of_books_List_increases_by1_when_added_created_book_is_present_in_the_list()
{//Library library=new Library();

    Book createdbook=library.addToCatalogue("Agni Siragugal","Abdul Kalam",300,432.5);

assertEquals(2,createdbook.getId());
assertThat(library.getBooks().size(),equalTo(2));
assertThat(library.getBooks(),hasItem(createdbook));
}
@Test
    public void findBookByName_should_return_bookname_when_called_with_available_book()
{
   // Library library= new Library();
    Book book= library.findBookByName("The God Of Small Things");
    assertNotNull(book);

}
@Test
public void findBookByName_should_return_NULL_when_called_with_not_available_book()
{
    //Library library= new Library();
    Book book= library.findBookByName("UNKNOWN");
    assertNull(book);

}
}