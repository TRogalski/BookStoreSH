INSERT INTO publishers(name) VALUES("Wydawnictwo Zysk i S-ka");
INSERT INTO publishers(name) VALUES("Wydawnictwo MUZA S.A.");

INSERT INTO authors(firstName, lastName) VALUES("Stephen", "Hawking")
INSERT INTO authors(firstName, lastName) VALUES("George", "Orwell")
INSERT INTO authors(firstName, lastName) VALUES("Anonymous", "Anounymous")

INSERT INTO books(title, id_publisher) VALUES("Krótka historia czasu", 1);
INSERT INTO books(title, id_publisher) VALUES("Krótkie odpowiedzi na wielkie pytania", 1);
INSERT INTO books(title, id_publisher) VALUES("Czarne dziury", 1);

INSERT INTO books(title, id_publisher) VALUES("Rok 1984", 2);

INSERT INTO books_authors(id_author, id_book) VALUES(1, 1), (1, 2), (1, 3), (2, 4), (3, 3)