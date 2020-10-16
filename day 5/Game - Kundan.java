package com.quizapplication;

public class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"What is the distance between Surat and Delhi?","Who is the PM of India?","What is the capital of India?"};
    String[] options1={"1153.1km","Narender Modi","Delhi"};
    String[] options2={"1134","Rahul Gandhi","Mumbai"};
    String[] options3={"1258","Amit Shah","Banglore"};
    String[] options4={"1495","Uday Thakre","Lucknow"};
    int[] answers={2,3,4};


    public void initGame()
    {

        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }


        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("You Played Very Well!!");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("Sorry I cant Help You");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }

}
