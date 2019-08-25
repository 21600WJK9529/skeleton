package com.winston.Domain1.DependantPackage;

//Can't exist without some sort of person to belong to.
public class Gender {

    private String genderId;
    private String desc;

    private Gender(){
    }
    //Builder
    public static class Builder{
        //Necessary build variables
        private String genderId;
        private String desc;

        public Builder id(String id){
            this.genderId = id;
            return this;
        }
        public Builder desc(String desc){
            this.desc = desc;
            return this;
        }
        //Return gender
        public Gender build(){
            return new Gender(this);
        }
    }
    //Using gender variables with builder, takes away underlined red "this" ln27
    public Gender(Builder builder){
        this.genderId = builder.genderId;
        this.desc = builder.desc;
    }
//Alt-Ins getters and toString
    public String getGenderId() {
        return genderId;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderId='" + genderId + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
