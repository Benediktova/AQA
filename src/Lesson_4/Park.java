package Lesson_4;
/*
Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
 */
public class Park {
    public class Attractions {
        private String nameAttraction;
        private String openingHours;
        private float price;

        public Attractions(String nameAttraction, String openingHours, float price) {
            this.nameAttraction = nameAttraction;
            this.openingHours = openingHours;
            this.price = price;
        }

        public String getNameAttraction(){
            return nameAttraction;
        }

        public String getOpeningHours(){
            return openingHours;
        }

        public float getPrice(){
            return price;
        }
    }
}
