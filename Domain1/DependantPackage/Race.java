package com.winston.Domain1.DependantPackage;

//Can't exist without some sort of person to belong to.
public class Race {
    private String raceId;
    private String desc;

    private Race(){
    }
    //explanation in Gender
    public static class Builder {

        private String raceId;
        private String desc;

        public Builder raceID(String raceID){
            this.raceId = raceID;
            return this;
        }
        public Builder desc(String desc){
            this.desc = desc;
            return this;
        }

        public Race build(){
            return new Race(this);
        }
    }

    public Race(Builder builder){

        this.raceId = builder.raceId;
        this.desc = builder.desc;

    }

    public String getRaceId() {
        return raceId;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceId='" + raceId + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
