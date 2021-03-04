package Chat;

import Chat.Pattern.Actions;
import Chat.Pattern.Questions;
import Chat.Pattern.Word;

import java.util.ArrayList;
import java.util.Locale;

public class Template {
    private ArrayList<ArrayList<String>> questionsArray = new ArrayList<>();
    ArrayList<String> questions1 = new ArrayList<>();
    ArrayList<String> questions2 = new ArrayList<>();
    ArrayList<String> questions3 = new ArrayList<>();
    ArrayList<String> questions4 = new ArrayList<>();
    ArrayList<String> questions5 = new ArrayList<>();
    ArrayList<String> questions6 = new ArrayList<>();
    ArrayList<String> questions7 = new ArrayList<>();
    ArrayList<String> questions8 = new ArrayList<>();
    ArrayList<String> questions9 = new ArrayList<>();
    ArrayList<String> questions10 = new ArrayList<>();
    ArrayList<String> questions1111 = new ArrayList<>();

    String questions11 = Questions.WHEN.toString().toLowerCase(Locale.ROOT) + Actions.TRANSFER.toString().toLowerCase(Locale.ROOT) + Word.MONEY.toString().toLowerCase(Locale.ROOT);
    String questions22 = Questions.WHEN.toString().toLowerCase(Locale.ROOT) + Actions.UPDATE.toString().toLowerCase(Locale.ROOT) + Word.BALANCE.toString().toLowerCase(Locale.ROOT);
    String questions33 = Questions.WHERE.toString().toLowerCase(Locale.ROOT) + Actions.SHOW.toString().toLowerCase(Locale.ROOT) + Word.BALANCE.toString().toLowerCase(Locale.ROOT);
    String questions44 = Questions.WHERE.toString().toLowerCase(Locale.ROOT) + Actions.SHOW.toString().toLowerCase(Locale.ROOT) + Word.SCORE.toString().toLowerCase(Locale.ROOT);
    String questions55 = Questions.WHERE.toString().toLowerCase(Locale.ROOT) + Actions.SHOW.toString().toLowerCase(Locale.ROOT) + Word.OPERATION.toString().toLowerCase(Locale.ROOT);
    String questions66 = Questions.HOW.toString().toLowerCase(Locale.ROOT) + Actions.DISCOVER.toString().toLowerCase(Locale.ROOT) + Word.SCORE.toString().toLowerCase(Locale.ROOT);
    String questions77 = Questions.HOW.toString().toLowerCase(Locale.ROOT) + Actions.DISCOVER.toString().toLowerCase(Locale.ROOT) + Word.BALANCE.toString().toLowerCase(Locale.ROOT);
    String questions88 = Questions.WHY.toString().toLowerCase(Locale.ROOT) + Actions.TRANSFER.toString().toLowerCase(Locale.ROOT) + Word.MONEY.toString().toLowerCase(Locale.ROOT);
    String questions99 = Questions.WHY.toString().toLowerCase(Locale.ROOT) + Actions.SHOW.toString().toLowerCase(Locale.ROOT) + Word.BALANCE.toString().toLowerCase(Locale.ROOT);
    String questions100 = Questions.WHY.toString().toLowerCase(Locale.ROOT) + Actions.FIND.toString().toLowerCase(Locale.ROOT) + Word.SCORE.toString().toLowerCase(Locale.ROOT);
    String questions111 = Questions.HOW.toString().toLowerCase(Locale.ROOT) + Actions.OPEN.toString().toLowerCase(Locale.ROOT) + Word.SCORE.toString().toLowerCase(Locale.ROOT);

    public ArrayList<ArrayList<String>> getArray() {
        questions1.add(Questions.WHEN.toString().toLowerCase(Locale.ROOT));
        questions1.add(Actions.TRANSFER.toString().toLowerCase(Locale.ROOT));
        questions1.add(Word.MONEY.toString().toLowerCase(Locale.ROOT));

        questions2.add(Questions.WHEN.toString().toLowerCase(Locale.ROOT));
        questions2.add(Actions.UPDATE.toString().toLowerCase(Locale.ROOT));
        questions2.add(Word.BALANCE.toString().toLowerCase(Locale.ROOT));

        questions3.add(Questions.WHERE.toString().toLowerCase(Locale.ROOT));
        questions3.add(Actions.SHOW.toString().toLowerCase(Locale.ROOT));
        questions3.add(Word.BALANCE.toString().toLowerCase(Locale.ROOT));


        questions4.add(Questions.WHERE.toString().toLowerCase(Locale.ROOT));
        questions4.add(Actions.SHOW.toString().toLowerCase(Locale.ROOT));
        questions4.add(Word.SCORE.toString().toLowerCase(Locale.ROOT));

        questions5.add(Questions.WHERE.toString().toLowerCase(Locale.ROOT));
        questions5.add(Actions.SHOW.toString().toLowerCase(Locale.ROOT));
        questions5.add(Word.OPERATION.toString().toLowerCase(Locale.ROOT));

        questions6.add(Questions.HOW.toString().toLowerCase(Locale.ROOT));
        questions6.add(Actions.DISCOVER.toString().toLowerCase(Locale.ROOT));
        questions6.add(Word.SCORE.toString().toLowerCase(Locale.ROOT));

        questions7.add(Questions.HOW.toString().toLowerCase(Locale.ROOT));
        questions7.add(Actions.DISCOVER.toString().toLowerCase(Locale.ROOT));
        questions7.add(Word.BALANCE.toString().toLowerCase(Locale.ROOT));

        questions8.add(Questions.WHY.toString().toLowerCase(Locale.ROOT));
        questions8.add(Actions.TRANSFER.toString().toLowerCase(Locale.ROOT));
        questions8.add(Word.MONEY.toString().toLowerCase(Locale.ROOT));

        questions9.add(Questions.WHY.toString().toLowerCase(Locale.ROOT));
        questions9.add(Actions.SHOW.toString().toLowerCase(Locale.ROOT));
        questions9.add(Word.BALANCE.toString().toLowerCase(Locale.ROOT));

        questions10.add(Questions.WHY.toString().toLowerCase(Locale.ROOT));
        questions10.add(Actions.FIND.toString().toLowerCase(Locale.ROOT));
        questions10.add(Word.SCORE.toString().toLowerCase(Locale.ROOT));

        questions1111.add(Questions.HOW.toString().toLowerCase(Locale.ROOT));
        questions1111.add(Actions.OPEN.toString().toLowerCase(Locale.ROOT));
        questions1111.add(Word.SCORE.toString().toLowerCase(Locale.ROOT));


        questionsArray.add(questions1);
        questionsArray.add(questions2);
        questionsArray.add(questions3);
        questionsArray.add(questions4);
        questionsArray.add(questions5);
        questionsArray.add(questions6);
        questionsArray.add(questions7);
        questionsArray.add(questions8);
        questionsArray.add(questions9);
        questionsArray.add(questions10);
        questionsArray.add(questions1111);

        return questionsArray;
    }

}
