package pl.bookstore.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.bookstore.dao.AuthorDao;
import pl.bookstore.entity.Author;

public class AuthorConverter implements Converter<String, Author> {

    @Autowired
    private AuthorDao authorDao;

    @Override
    public Author convert(String s) {
        return authorDao.findById(Long.parseLong(s));
    }
}
