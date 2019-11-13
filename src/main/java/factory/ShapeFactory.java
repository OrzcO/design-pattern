package factory;

public class ShapeFactory {

    private enum shape{
        Circle("circle"), Square("square"), Rectangle("rectangle");

        private String type;
        private shape(String type) {
            this.type = type;
        }
    }

    public static Shape create(String name) {
        Shape ret = null;
        if (name != null) {
            switch (name.toLowerCase()) {
                case "circle":
                    ret = new Circle();
                    break;
                case "rectangle":
                    ret = new Rectangle();
                    break;
                default:
                    ret = new Square();
                    break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        String[] params = new String[]{"circle", "rectangle", "square", "nothing"};
        for (String param : params) {
            System.out.println("param is : " + param);
            create(param).draw();
        }
    }
}
