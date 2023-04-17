package hw7;

public class hw7 {


    public static void main(String[] args) {
        Author tolstoi = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Воина и мир", 1867,tolstoi);

        Author gamilton = new Author("Эдмонд", "Гамильтон");
        Book starKings = new Book("Звёздные короли", 1947,gamilton);



        System.out.println("Автор книги - " + tolstoi.getName() + " " + tolstoi.getSurname());
        System.out.println("Название книги - " + warAndPeace.getNameBook());
        System.out.println("Дата публикации - " + warAndPeace.getYearBook());

        System.out.println("Автор книги - " + gamilton.getName() + " " + gamilton.getSurname());
        System.out.println("Название книги - " + starKings.getNameBook());
        System.out.println("Дата публикации - " + starKings.getYearBook());

        starKings.setYearBook(1948);
        System.out.println("Дата публикации - " + starKings.getYearBook());
    }
}
