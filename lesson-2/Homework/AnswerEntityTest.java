package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

public class AnswerEntityTest{

    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
        // 		if (obj == null) return false;
    }
    @Test
    public void shouldReturnTrueWhenThisEqualObj(){
        AnswerEntity an1 = new AnswerEntity();
        assertTrue(an1.equals(an1));
        // 		if (this == obj) return true;
    }
    @Test
    public void shouldReturnFalseWhenClassObjectNotEqual(){
        AnswerEntity an1 = new getClass();
        String an2 = "ABCD";
        assertFalse(an1.equals(an2));
        //    		if (getClass() != obj.getClass()) return false;
    }
    @Test
    public void shouldReturnFalseWhenOtherAnswerTextIsNotNull(){
        AnswerEntity an1 = new getAnswerText();
        an1 = null;
        String an2 = "EFGH";
        assertFalse(an1.equals(an2));
        // 		if (answerText == null) if (other.answerText != null) return false;
    }
    @Test
    public void shouldReturnFalseWhenIdNullAndOtherIdNotNull(){
        AnswerEntity an1 = new getId();
        an1 = null;
        AnswerEntity an2 = new getId();
        an2 = 5;
        // if (id == null) if (other.id != null)return false;
    }
    @Test
    public void shouldReturnFalseWhenQuestionNullAndOtherQuestionNotNull(){
        AnswerEntity an1 = new getQuestion();
        an1 = null;
        String an2 = "IJKL";
        // if (question == null) {if (other.question != null) return false;
    }
}
