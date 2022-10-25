
public class Example3 {

    private String placeHolder = null;

    public Example3() {
        this.placeHolder = "Test String";
    }

    private String getPlaceHolder(){
        return this.placeHolder;
    }

    @Override
    public boolean equals(Object obj) {
        Example3 object = (Example3) obj;
        return this.getPlaceHolder().equals(object.getPlaceHolder());
    }
}