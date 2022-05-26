package kpo.lab12.task4;

public class Main {

    public static void main(String[] args) {

        MailService mailService = new MailService();
        Man ivan = new Man("Иван");
        Man petr = new Man("Петр");
        Man sidor = new Man("Сидор");

        mailService.addMember(ivan, Paper.Magazine);
        mailService.addMember(petr, Paper.News);
        mailService.addMember(sidor, Paper.Magazine);
        mailService.addMember(sidor, Paper.News);

        mailService.addPaper(Paper.Magazine, "Playboy");
        mailService.addPaper(Paper.News, "Daily Bugle");

    }
}
