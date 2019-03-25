package pl.bookstore.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.bookstore.dao.PublisherDao;
import pl.bookstore.entity.Publisher;

public class PublisherConverter implements Converter<String, Publisher> {

    @Autowired
    private PublisherDao publisherDao;

    @Override
    public Publisher convert(String s) {
        return publisherDao.findById(Long.parseLong(s));
    }
}
