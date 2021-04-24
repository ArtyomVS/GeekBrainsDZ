

public class Cat implements CanRun, CanJump{
    private String name;
    private int maxRun;
    private int maxJump;

    public Cat(String name, int maxRun, int maxJump){
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    @Override
    public double run (int length){
        System.out.print("Кот " + name + " пытается пробежать " + length + " метр(а)(ов)...  ");
        if (maxRun > length){
            System.out.println(name + " с лёгкостью пробегает дистанцию. Он мог бы бежать и дольше, ведь его рекорд " + maxRun + " метра(ов)");
        }
        else{
            System.out.println(name + " падает в канаву. Он не может так долго бежать, ведь его рекорд всего лишь " + maxRun + " метра(ов)");
        }
        return length;
    }
    @Override
    public double jump (int height){
        System.out.print("Кот " + name + " пытается прыгнуть на " + height + " метр(а)(ов)...  ");
        if (maxJump > height){
            System.out.println(name + " успешно покоряет высоту. Он мог бы прыгнуть и ещё выше, ведь его рекорд " + maxJump + " метра(ов)");
        }
        else{
            System.out.println(name + " стукается лбом о препятствие. Он не может так высоко прыгнуть, ведь его рекорд всего лишь " + maxJump + " метра(ов)");
        }
        return height;
    }
}
