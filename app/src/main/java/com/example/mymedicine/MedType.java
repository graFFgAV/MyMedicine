package com.example.mymedicine;

public class MedType {

    private String name;
    private int imageResourceId;

    public static final MedType[] Type = {
            new MedType("Лор", R.drawable.kisa),
            new MedType("НЕЙРО ХИРУРГИЯ", R.drawable.kisa),
            new MedType("УРОЛОГИЯ", R.drawable.kisa),
            new MedType("ОФТАЛЬМОЛОГИЯ", R.drawable.kisa),
            new MedType("СТОМАТО- ЛОГИЯ", R.drawable.kisa),
            new MedType("АНЕСТЕЗИОЛОГИЯ", R.drawable.kisa),
            new MedType("ОБЩАЯ ХИРУРГИЯ", R.drawable.kisa)
    };

    private MedType(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
