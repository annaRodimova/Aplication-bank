package Chat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Chat {
    public ArrayList<String> words (String questions) {
        String word = "";
        ArrayList<String> questionsUser = new ArrayList<>();
        for (int i = 0; i < questions.length(); i++) {
            if(questions.charAt(i) == ' ') {
                questionsUser.add(word);
                word = "";
                continue;
            }
            word = word + questions.charAt(i);
        }
        return questionsUser;
    }

    public String responceOutput (String questions) {
        String ResponceToUser = "";
        Template template = new Template();
        String resultMetods = recogmitionQuestion(questions);

        if (template.questions11.equals(resultMetods)) {
            ResponceToUser = "Денежные средства переведутся в течении суток с момента совершения операции";
        }
        else if (template.questions22.equals(resultMetods)) {
            ResponceToUser = "Баланс обновится в течении 10 минут после совершения операции";
        }
        else if (template.questions33.equals(resultMetods)) {
            ResponceToUser = "Баланс вы можете узнать, повалившись в окно операции на главной странице приложения";
        }
        else  if (template.questions44.equals(resultMetods)) {
            ResponceToUser = "счет вы можете узнать на главной странице приложения в выпадающем списке";
        }
        ///
        else  if (template.questions55.equals(resultMetods)) {
            ResponceToUser = "счет вы можете узнать на главной странице приложения в выпадающем списке";
        }
        else  if (template.questions66.equals(resultMetods)) {
            ResponceToUser = "счет вы можете узнать на главной странице приложения в выпадающем списке";
        }
        else  if (template.questions77.equals(resultMetods)) {
            ResponceToUser = "счет вы можете узнать на главной странице приложения в выпадающем списке";
        }
        else  if (template.questions88.equals(resultMetods)) {
            ResponceToUser = "счет вы можете узнать на главной странице приложения в выпадающем списке";
        }
        else  if (template.questions99.equals(resultMetods)) {
            ResponceToUser = "счет вы можете узнать на главной странице приложения в выпадающем списке";
        }
        else  if (template.questions100.equals(resultMetods)) {
            ResponceToUser = "счет вы можете узнать на главной странице приложения в выпадающем списке";
        }
        else  if (template.questions111.equals(resultMetods)) {
            ResponceToUser = "счет вы можете узнать на главной странице приложения в выпадающем списке";
        }

        return ResponceToUser;
    }


    public String recogmitionQuestion (String Question) {
        String QuestionUser = "";
        ArrayList<String> WORDS = new ArrayList<>();
        WORDS = words(Question);
        Template template = new Template();
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
        arrayLists = template.getArray();
        int result = 0;
        for (int i = 0; i < WORDS.size(); i++) {
            for (int x = 0; x < arrayLists.size(); x++) {
                for (int z = 0; z < arrayLists.get(x).size(); z++) {
                    if (WORDS.get(i).equals(arrayLists.get(x).get(z))) {
                        result++;
                        if (result == 3) {
                            QuestionUser = arrayLists.get(x).get(0) + arrayLists.get(x).get(1) + arrayLists.get(x).get(2);
                        }
                    }
                }
            }
        }
        return QuestionUser;
    }
}
