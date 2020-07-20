package KKK;

public class Main {
    public static void main(String[] args){

        collaborator[] collaboratorArray = new collaborator[5]; // Вначале объявляем массив объектов
        
        collaboratorArray[0] = new collaborator("Ivanov", "Ivan", "Ivanovich", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 40);
        collaboratorArray[1] = new collaborator("Sam", "Sam", "Sam", "Engineer", "Sam@mailbox.com", "8999999999", 30000, 50);
        collaboratorArray[2] = new collaborator("Tom", "Tom", "Tom", "Engineer", "Tom@mailbox.com", "8888888888", 40000, 20);
        collaboratorArray[3] = new collaborator("Gerry", "Gerry", "Gerry", "Engineer", "Gerry@mailbox.com", "877777777", 50000, 25);
        collaboratorArray[4] = new collaborator("Daria", "Daria", "Daria", "Engineer", "Daria@mailbox.com", "866666666", 60000, 45);

        for(int i = 0; i<collaboratorArray.length; i++){
            if(collaboratorArray[i].age>40) {
                collaboratorArray[i].showCollaborator();
            }
        }
    }
}