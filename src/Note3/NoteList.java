package Note3;

public class NoteList { 
    int number, ram, hd;   // Задаем типы данных для полей класса
    String developer, colour, system;

    public NoteList(int number, String developer, int ram, int hd, String system, String colour) {  //Создаем конструктор
        this.number = number;
        this.developer = developer;        
        this.ram = ram;
        this.hd = hd;
        this.system = system;
        this.colour = colour;
    }

    public static StringBuilder getHD(NoteList[] store, int hd) {  // Ф-ция получения данных HD
        StringBuilder result = new StringBuilder();
        for (NoteList el : store) {
            if (hd == el.hd) {  // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
                result.append("developer: "+ el.developer +", "+ "RAM: "+ el.ram +", "+"HD: "+ el.hd +", "+ "System: "+ el.system + ", "+ "colour: " + el.colour + "\n");

            }
        }
        return result;
    }

    public static StringBuilder getRAM(NoteList[] store, int ram) {   // Ф-ция получения данных RAM
        StringBuilder result = new StringBuilder();
        for (NoteList el : store) {
            if (ram == el.ram) {   // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
                result.append("developer: "+ el.developer +", "+ "RAM: "+ el.ram +", "+"HD: "+ el.hd +", "+ "System: "+ el.system + ", "+ "colour: " + el.colour + "\n");
            }
        }
        return result;
    }

    public static StringBuilder getSystem(NoteList[] store, String system) {   // Ф-ция получения данных System OS
        StringBuilder result = new StringBuilder();
        for (NoteList el : store) {     // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
            if (el.system.equalsIgnoreCase(system)) {         
                result.append("developer: "+ el.developer +", "+ "RAM: "+ el.ram +", "+"HD: "+ el.hd +", "+ "System: "+ el.system +", " + "colour: "+ el.colour + "\n");
            }
        }
        return result;
    }

    public static StringBuilder getColour(NoteList[] store, String colour) {  // Ф-ция получения данных по цветам
        StringBuilder result = new StringBuilder();
        for (NoteList el : store) {   // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
            if (colour.equalsIgnoreCase(el.colour)) {
                result.append("developer: "+ el.developer +", "+ "RAM: "+ el.ram +", "+"HD: "+ el.hd +", "+ "System: "+ el.system +", "+ "colour: " + el.colour + "\n");
            }
        }
        return result;
    }

    public static StringBuilder getDeveloper(NoteList[] store, String developer) {   // Ф-ция получения данных производителя
        StringBuilder result = new StringBuilder();
        for (NoteList el : store) {   // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
            if (developer.equalsIgnoreCase(el.developer)) {
                result.append("developer: "+ el.developer +", "+ "RAM: "+ el.ram +", "+"HD: "+ el.hd +", "+ "System: "+ el.system +", "+ "colour: " + el.colour + "\n");
            }
        }
        return result;    
    }

    @Override
    public String toString() {           // Переопределенная ф-ция toString вывода данных
        return String.format("number: %d, developer: %s, RAM: %d, HD: %d, System: %s, colour: %s", number, developer, ram, hd, system, colour);
    }

}
