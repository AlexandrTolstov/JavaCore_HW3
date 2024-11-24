public enum Gender {
    MAN("Мужчина"), WOMAN("Женщина");
    String gender;
    Gender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
}
