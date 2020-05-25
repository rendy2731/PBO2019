public class Field {
    private int bambooHeight[] = new int [10];

    public Field(int[] arr) {
        bambooHeight = arr;
    }

    public void setTinggiBambu(int index, int height) {
        this.bambooHeight[index] = height;
    }

    public int[] getBambooHeight() {
        return this.bambooHeight;
    }

    public int getBambooHeight(int index) {
        return this.bambooHeight[index];
    }

    public int getMinTall() {
        int min = bambooHeight[0];

        for (int i = 0; i < bambooHeight.length; i++) {
            min = min < bambooHeight[i] ? min : bambooHeight[i];
        }
        return min;
    }


    
}