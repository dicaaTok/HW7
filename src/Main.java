//1. Создать интерфейс HavingSuperAbility (имеющий супер способность) добавить в него 1 абстрактный метод applySuperAbility();

//2. Создать абстрактный класс Hero с полями здоровье, урон и тип супер способности и реализовать интерфейс HavingSuperAbility.

//3. Создать 3 класса героев Magic, Medic, Warrior и наследовать их от класса Hero. В каждом классе по своему реализовать метод applySuperAbility() следующим образом - просто распечатать что то вроде того “Warrior применил супер способность CRITICAL DAMAGE”.

//        4. В классе Main создать массив из 3х разных героев, затем через цикл применить супер способность каждого героя.

//        5. В классе медик добавить поле healPoints, затем добавить метод increaseExperience, в котором бы при вызове увеличивалось количество единиц лечения на 10%.

//        6. При прохождении через массив в пункте 4 увеличить опыт лечения медика, сделав приведение типов (Type Casting)
public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] ss;
        ss = new HavingSuperAbility[]{new Warrior(), new Magic(), new Medic()};
        for (HavingSuperAbility aa : ss) {
            aa.applySuperAbility();
            if (aa instanceof Medic) {
                ((Medic) aa).getXP();
            }
        }

    }
}