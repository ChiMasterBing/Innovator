package com.innovator.solve;

import java.io.Serializable;

public enum Topic implements Serializable {
    Grade3("Grade_3_Questions", "grade_3","Grade_3"), Grade4("Grade_4_Questions", "grade_4","Grade_4"),
    Grade5("Grade_5_Questions", "grade_5","Grade_5"), Grade6("Grade_6_Questions","grade_6", "Grade_6"),
    Grade7("Grade_7_Questions" , "grade_7","Grade_7"),Grade8("Grade_8_Questions" , "grade_8","Grade_8"),
    Grade9("Grade_9_Questions" , "grade_9","Grade_9");
    private String picRootFolderName, picNamePrefix, questionFolderName;

    Topic(String picRootFolderName, String picNamePrefix, String questionFolderName) {
        this.picRootFolderName = picRootFolderName;
        this.picNamePrefix = picNamePrefix;
        this.questionFolderName = questionFolderName;
    }

    public String getPicRootFolderName() {
        return picRootFolderName;
    }

    public String getPicNamePrefix() {
        return picNamePrefix;
    }

    public String getQuestionFolderName() {
        return questionFolderName;
    }
}
/*
	enum predefined methods:
		public static enum-type [] values() //returns list of enums
		public static enum-type valueOf(String str) //(reverse toString)
		final int ordinal() //returns the ordinal value/its place in the list
		final int compareTo(enum-type e) //returns negative if invoking ordinal is less than e ordinal.
		//compare for equality by ==. equals() only returns true if ordinals are the same in the same enum collection.

	Enums can have constants

	enum Apple{
		Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);//these are ctor calls; RedDel is not given a price & called the default ctor.
		private int price;

		//ctor
		Apple(int p){price = p;}

		Apple(){price = -1;}

		int getPrice(){return price;}
	}
	//to print price, do Apple.Winesap.getPrice()

Enumerations inherit Java.lang.Enum.
 */