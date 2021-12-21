package automationtextgenerator;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class AutomationTextGenerationMain {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AutomationTextGenerationMain window = new AutomationTextGenerationMain();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }


    private static JFrame frame;
    private static JTextField txtChooseWhomYou;
    private static JTextField txtBirthdayCards;
    private static JFrame controllingFrame;
    private static JComboBox comboBox_1;
    private static JTextField txtIfYouWant;


    public AutomationTextGenerationMain() {
        initialize();
    }


    private static void initialize() {


        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(139, 0, 0));
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{434, 0};
        gridBagLayout.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
        frame.getContentPane().setLayout(gridBagLayout);

        txtBirthdayCards = new JTextField();
        txtBirthdayCards.setEditable(false);
        txtBirthdayCards.setForeground(new Color(255, 255, 255));
        txtBirthdayCards.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
        txtBirthdayCards.setBackground(new Color(0, 128, 0));
        txtBirthdayCards.setHorizontalAlignment(SwingConstants.CENTER);
        txtBirthdayCards.setText("Holiday Cards");
        GridBagConstraints gbc_txtBirthdayCards = new GridBagConstraints();
        gbc_txtBirthdayCards.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtBirthdayCards.insets = new Insets(0, 0, 5, 0);
        gbc_txtBirthdayCards.gridx = 0;
        gbc_txtBirthdayCards.gridy = 1;
        frame.getContentPane().add(txtBirthdayCards, gbc_txtBirthdayCards);
        txtBirthdayCards.setColumns(10);

        txtChooseWhomYou = new JTextField();
        txtChooseWhomYou.setEditable(false);
        txtChooseWhomYou.setForeground(new Color(255, 255, 255));
        txtChooseWhomYou.setFont(new Font("Times New Roman", Font.BOLD, 18));
        txtChooseWhomYou.setBackground(new Color(0, 128, 0));
        txtChooseWhomYou.setHorizontalAlignment(SwingConstants.CENTER);
        txtChooseWhomYou.setText("Choose person and holiday & press \"Start\"");
        GridBagConstraints gbc_txtChooseWhomYou = new GridBagConstraints();
        gbc_txtChooseWhomYou.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtChooseWhomYou.insets = new Insets(0, 0, 5, 0);
        gbc_txtChooseWhomYou.gridx = 0;
        gbc_txtChooseWhomYou.gridy = 2;
        frame.getContentPane().add(txtChooseWhomYou, gbc_txtChooseWhomYou);
        txtChooseWhomYou.setColumns(10);

        comboBox_1 = new JComboBox();
        comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        comboBox_1.setBackground(new Color(245, 222, 179));
        GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
        gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
        gbc_comboBox_1.gridx = 0;
        gbc_comboBox_1.gridy = 3;
        frame.getContentPane().add(comboBox_1, gbc_comboBox_1);
        comboBox_1.addItem("Choose holiday");
        comboBox_1.addItem("Happy Birthday");
        comboBox_1.addItem("Happy New Year");
        comboBox_1.addItem("The 8th of March");


        JComboBox comboBox = new JComboBox();
        comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        comboBox.setBackground(new Color(245, 222, 179));
        GridBagConstraints gbc_comboBox = new GridBagConstraints();
        gbc_comboBox.insets = new Insets(0, 0, 5, 0);
        gbc_comboBox.gridx = 0;
        gbc_comboBox.gridy = 4;
        frame.getContentPane().add(comboBox, gbc_comboBox);
        comboBox.addItem("Choose receiver");
        comboBox.addItem("Mother");
        comboBox.addItem("Father");
        comboBox.addItem("Brother");
        comboBox.addItem("Sister");
        comboBox.addItem("Granny");
        comboBox.addItem("Grand dad");
        JButton btnNewButton = new JButton("start");
        btnNewButton.setBackground(new Color(255, 215, 0));
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                char exclamationMark = '!';
                char comma = ',';
                String dear = "Dear";
                Random getRandomText = new Random();


                String getSelectedHoliday = (String) comboBox_1.getSelectedItem();
                String getSelectedMemberOfFamily = (String) comboBox.getSelectedItem();

                String firstCongratulation = dear + " " + getSelectedMemberOfFamily + " " + comma
                        + "we wish you a " + getSelectedHoliday + exclamationMark;
                String secondCongratulation = dear + " " + getSelectedMemberOfFamily + " " + comma
                        + "we wish you to be a millionaire in a " + getSelectedHoliday + exclamationMark;

                String firstCongratulationIfChangeText = dear + " " + getSelectedMemberOfFamily + " " + comma
                        + "we wish you all the best in a " + getSelectedHoliday + exclamationMark;
                String secondCongratulationIfChangeText = dear + " " + getSelectedMemberOfFamily + " " + comma
                        + "we congratulate you with a " + getSelectedHoliday + exclamationMark;

                String happyNewYearCongratulationText = "We wish you a Merry Christmas and a Happy New Year" + exclamationMark;
                String happyNewYearCongratulationTextSecondVariant = "We wish you dreams to come true in a " + getSelectedHoliday + exclamationMark;

                String happyNewYearCongratulationIfChangeText = "We wish you all the best in a " + getSelectedHoliday + exclamationMark;
                String happyNewYearCongratulationIfChangeTextSecond = "We wish you a " + getSelectedHoliday + exclamationMark;

                String eightOfMarchCongratulationText = dear + " " + getSelectedMemberOfFamily + " " + comma
                        + "we wish you to be pretty, as always, at " + getSelectedHoliday + exclamationMark;
                String eightOfMarchCongratulationTextSecondVariant = dear + " " + getSelectedMemberOfFamily + " " + comma
                        + "we wish you to be awesome, as always, at " + getSelectedHoliday + exclamationMark;

                String eightOfMarchCongratulationIfChangeText = dear + " " + getSelectedMemberOfFamily + " " + comma
                        + "we wish you dreams to come true at " + getSelectedHoliday + exclamationMark;
                String eightOfMarchCongratulationIfChangeTextSecondVariant = dear + " " + getSelectedMemberOfFamily + " " + comma
                        + "we congratulate you with " + getSelectedHoliday + exclamationMark;

                String eightOfMarchGenerationForNoReceiver = "We wish you to be pretty, as always, at "
                        + getSelectedHoliday + exclamationMark;
                String eightOfMarchGenerationForNoReceiverSecondVariant = "We wish you to be awesome, as always, at "
                        + getSelectedHoliday + exclamationMark;

                String eightOfMarchGenerationForNoReceiverIfChange = "We wish you dreams to come true at "
                        + getSelectedHoliday + exclamationMark;
                String eightOfMarchGenerationForNoReceiverIfChangeSecondVariant = "We congratulate you with "
                        + getSelectedHoliday + exclamationMark;

                String happyBirthdayForNoReceiver = "We wish you a " + getSelectedHoliday + exclamationMark;
                String happyBirthdayForNoReceiverSecondVariant = "We wish you to be a millionaire in a "
                        + getSelectedHoliday + exclamationMark;

                String happyBirthdayForNoReceiverIfChange = "We wish you all the best in a "
                        + getSelectedHoliday + exclamationMark;
                String happyBirthdayForNoReceiverIfChangeSecondVariant = "We congratulate you with a "
                        + getSelectedHoliday + exclamationMark;


                String[] firstCongratulationArray = {firstCongratulation, secondCongratulation};

                String[] secondCongratulationArray = {firstCongratulationIfChangeText, secondCongratulationIfChangeText};

                String[] happyNewYearCongratulationArray = {happyNewYearCongratulationText
                        , happyNewYearCongratulationTextSecondVariant};
                String[] happyNewYearCongratulationArrayIfChangeText = {happyNewYearCongratulationIfChangeText
                        , happyNewYearCongratulationIfChangeTextSecond};

                String[] eightOfMarchCongratulationArray = {eightOfMarchCongratulationText
                        , eightOfMarchCongratulationTextSecondVariant};
                String[] eightOfMarchCongratulationArraySecondVariant = {eightOfMarchCongratulationIfChangeText
                        , eightOfMarchCongratulationIfChangeTextSecondVariant};

                String[] eightOfMarchCongratulationArrayForNoReceiver = {eightOfMarchGenerationForNoReceiver
                        , eightOfMarchGenerationForNoReceiverSecondVariant};
                String[] eightOfMarchCongratulationArrayForNoReceiverIfChange = {eightOfMarchGenerationForNoReceiverIfChange
                        , eightOfMarchGenerationForNoReceiverIfChangeSecondVariant};

                String[] hbForNoReceiver = {happyBirthdayForNoReceiver
                        , happyBirthdayForNoReceiverSecondVariant};
                String[] hbForNoReceiverSecondArray = {happyBirthdayForNoReceiverIfChange
                        , happyBirthdayForNoReceiverIfChangeSecondVariant};


                ImageIcon icon = new ImageIcon("C:\\Users\\12.png");
                ImageIcon icon1 = new ImageIcon("C:\\Users\\8.png");
                ImageIcon icon2 = new ImageIcon("C:\\Users\\13.png");
                ImageIcon icon3 = new ImageIcon("C:\\Users\\14.png");
                ImageIcon icon4 = new ImageIcon("C:\\Users\\15.png");
                ImageIcon icon5 = new ImageIcon("C:\\Users\\16.jpg");


                if (getSelectedMemberOfFamily.equals("Mother")) {
                    if (getSelectedHoliday.equals("Happy Birthday")) {

                        List<String[]> firstCongratulationsList = new ArrayList<>();
                        firstCongratulationsList.add(firstCongratulationArray);

                        for (String[] currentArray : firstCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);

                            if (code == JOptionPane.YES_OPTION) {

                                List<String[]> secondCongratulationsList = new ArrayList<>();
                                secondCongratulationsList.add(secondCongratulationArray);

                                for (String[] currentArray2 : secondCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon3);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    } else if (getSelectedHoliday.equals("The 8th of March")) {
                        List<String[]> eightOfMarchCongratulationsList = new ArrayList<>();
                        eightOfMarchCongratulationsList.add(eightOfMarchCongratulationArray);

                        for (String[] currentArray : eightOfMarchCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon1);

                            if (code == JOptionPane.YES_OPTION) {

                                List<String[]> eightOfMarchSecondVariantCongratulationsList = new ArrayList<>();
                                eightOfMarchSecondVariantCongratulationsList.add(eightOfMarchCongratulationArraySecondVariant);

                                for (String[] currentArray2 : eightOfMarchSecondVariantCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon5);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }
                        }
                    } else if (getSelectedHoliday.equals("Happy New Year")) {


                        List<String[]> firstCongratulationsList = new ArrayList<>();
                        firstCongratulationsList.add(firstCongratulationArray);

                        for (String[] currentArray : firstCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon2);

                            if (code == JOptionPane.YES_OPTION) {

                                List<String[]> secondCongratulationsList = new ArrayList<>();
                                secondCongratulationsList.add(secondCongratulationArray);

                                for (String[] currentArray2 : secondCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon4);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    } else {
                        JOptionPane.showMessageDialog(controllingFrame,
                                "Wrong choice. Try again.",
                                "Error Message",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }

                if (getSelectedMemberOfFamily.equals("Father")) {
                    if (getSelectedHoliday.equals("Happy Birthday")) {

                        List<String[]> firstCongratulationsList = new ArrayList<>();
                        firstCongratulationsList.add(firstCongratulationArray);

                        for (String[] currentArray : firstCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);

                            if (code == JOptionPane.YES_OPTION) {

                                List<String[]> secondCongratulationsList = new ArrayList<>();
                                secondCongratulationsList.add(secondCongratulationArray);

                                for (String[] currentArray2 : secondCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon3);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    } else if (getSelectedHoliday.equals("Happy New Year")) {

                        List<String[]> firstCongratulationsList = new ArrayList<>();
                        firstCongratulationsList.add(firstCongratulationArray);

                        for (String[] currentArray : firstCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];


                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon2);

                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> secondCongratulationsList = new ArrayList<>();
                                secondCongratulationsList.add(secondCongratulationArray);

                                for (String[] currentArray2 : secondCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon4);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    } else {
                        JOptionPane.showMessageDialog(controllingFrame,
                                "Wrong choice. Try again.",
                                "Error Message",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }

                if (getSelectedMemberOfFamily.equals("Brother")) {
                    if (getSelectedHoliday.equals("Happy Birthday")) {

                        List<String[]> firstCongratulationsList = new ArrayList<>();
                        firstCongratulationsList.add(firstCongratulationArray);

                        for (String[] currentArray : firstCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);

                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> secondCongratulationsList = new ArrayList<>();
                                secondCongratulationsList.add(secondCongratulationArray);

                                for (String[] currentArray2 : secondCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon3);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    } else if (getSelectedHoliday.equals("Happy New Year")) {


                        List<String[]> firstCongratulationsList = new ArrayList<>();
                        firstCongratulationsList.add(firstCongratulationArray);

                        for (String[] currentArray : firstCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon2);


                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> secondCongratulationsList = new ArrayList<>();
                                secondCongratulationsList.add(secondCongratulationArray);

                                for (String[] currentArray2 : secondCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon4);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    } else {
                        JOptionPane.showMessageDialog(controllingFrame,
                                "Wrong choice. Try again.",
                                "Error Message",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }

                if (getSelectedMemberOfFamily.equals("Sister")) {
                    if (getSelectedHoliday.equals("Happy Birthday")) {

                        List<String[]> firstCongratulationsList = new ArrayList<>();
                        firstCongratulationsList.add(firstCongratulationArray);

                        for (String[] currentArray : firstCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);

                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> secondCongratulationsList = new ArrayList<>();
                                secondCongratulationsList.add(secondCongratulationArray);

                                for (String[] currentArray2 : secondCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon3);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    } else if (getSelectedHoliday.equals("The 8th of March")) {

                        List<String[]> eightOfMarchCongratulationsList = new ArrayList<>();
                        eightOfMarchCongratulationsList.add(eightOfMarchCongratulationArray);

                        for (String[] currentArray : eightOfMarchCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon1);

                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> eightOfMarchSecondVariantCongratulationsList = new ArrayList<>();
                                eightOfMarchSecondVariantCongratulationsList.add(eightOfMarchCongratulationArraySecondVariant);


                                for (String[] currentArray2 : eightOfMarchSecondVariantCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon5);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }
                        }
                    } else if (getSelectedHoliday.equals("Happy New Year")) {

                        List<String[]> firstCongratulationsList = new ArrayList<>();
                        firstCongratulationsList.add(firstCongratulationArray);

                        for (String[] currentArray : firstCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon2);

                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> secondCongratulationsList = new ArrayList<>();
                                secondCongratulationsList.add(secondCongratulationArray);

                                for (String[] currentArray2 : secondCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon4);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    } else {
                        JOptionPane.showMessageDialog(controllingFrame,
                                "Wrong choice. Try again.",
                                "Error Message",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }

                if (getSelectedMemberOfFamily.equals("Granny")) {
                    if (getSelectedHoliday.equals("Happy Birthday")) {

                        List<String[]> firstCongratulationsList = new ArrayList<>();
                        firstCongratulationsList.add(firstCongratulationArray);

                        for (String[] currentArray : firstCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);

                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> secondCongratulationsList = new ArrayList<>();
                                secondCongratulationsList.add(secondCongratulationArray);

                                for (String[] currentArray2 : secondCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];


                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon3);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    } else if (getSelectedHoliday.equals("The 8th of March")) {

                        List<String[]> eightOfMarchCongratulationsList = new ArrayList<>();
                        eightOfMarchCongratulationsList.add(eightOfMarchCongratulationArray);

                        for (String[] currentArray : eightOfMarchCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon1);

                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> eightOfMarchSecondVariantCongratulationsList = new ArrayList<>();
                                eightOfMarchSecondVariantCongratulationsList.add(eightOfMarchCongratulationArraySecondVariant);

                                for (String[] currentArray2 : eightOfMarchSecondVariantCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon5);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }
                        }
                    } else if (getSelectedHoliday.equals("Happy New Year")) {

                        List<String[]> firstCongratulationsList = new ArrayList<>();
                        firstCongratulationsList.add(firstCongratulationArray);

                        for (String[] currentArray : firstCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon2);

                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> secondCongratulationsList = new ArrayList<>();
                                secondCongratulationsList.add(secondCongratulationArray);

                                for (String[] currentArray2 : secondCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon4);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    } else {
                        JOptionPane.showMessageDialog(controllingFrame,


                                "Wrong choice. Try again.",
                                "Error Message",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }

                if (getSelectedMemberOfFamily.equals("Grand dad")) {
                    if (getSelectedHoliday.equals("Happy Birthday")) {

                        List<String[]> firstCongratulationsList = new ArrayList<>();
                        firstCongratulationsList.add(firstCongratulationArray);

                        for (String[] currentArray : firstCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);

                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> secondCongratulationsList = new ArrayList<>();
                                secondCongratulationsList.add(secondCongratulationArray);

                                for (String[] currentArray2 : secondCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon3);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    } else if (getSelectedHoliday.equals("Happy New Year")) {

                        List<String[]> firstCongratulationsList = new ArrayList<>();
                        firstCongratulationsList.add(firstCongratulationArray);

                        for (String[] currentArray : firstCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon2);

                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> secondCongratulationsList = new ArrayList<>();
                                secondCongratulationsList.add(secondCongratulationArray);

                                for (String[] currentArray2 : secondCongratulationsList) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon4);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }

                    } else {
                        JOptionPane.showMessageDialog(controllingFrame,
                                "Wrong choice. Try again.",
                                "Error Message",
                                JOptionPane.ERROR_MESSAGE);
                    }

                } else if (getSelectedHoliday.equals("Happy New Year")) {
                    if (getSelectedMemberOfFamily.equals("Choose receiver")) {


                        List<String[]> happyNewYearCongratulationsList = new ArrayList<>();
                        happyNewYearCongratulationsList.add(happyNewYearCongratulationArray);

                        for (String[] currentArray : happyNewYearCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon2);

                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> happyNewYearComgratulationIfChageText = new ArrayList<>();
                                happyNewYearComgratulationIfChageText.add(happyNewYearCongratulationArrayIfChangeText);

                                for (String[] currentArray2 : happyNewYearComgratulationIfChageText) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon4);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    }
                } else if (getSelectedHoliday.equals("The 8th of March")) {
                    if (getSelectedMemberOfFamily.equals("Choose receiver")) {


                        List<String[]> eightOfMarchCongratulationsList = new ArrayList<>();
                        eightOfMarchCongratulationsList.add(eightOfMarchCongratulationArrayForNoReceiver);

                        for (String[] currentArray : eightOfMarchCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon2);

                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> eightOfMarchCongratulationIfChangeTextForNoReceiver = new ArrayList<>();
                                eightOfMarchCongratulationIfChangeTextForNoReceiver.add(eightOfMarchCongratulationArrayForNoReceiverIfChange);

                                for (String[] currentArray2 : eightOfMarchCongratulationIfChangeTextForNoReceiver) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon4);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    }


                } else if (getSelectedHoliday.equals("Happy Birthday")) {
                    if (getSelectedMemberOfFamily.equals("Choose receiver")) {


                        List<String[]> birthdayCongratulationsList = new ArrayList<>();
                        birthdayCongratulationsList.add(hbForNoReceiver);

                        for (String[] currentArray : birthdayCongratulationsList) {

                            String chosenString = currentArray[getRandomText.nextInt(currentArray.length)];

                            int code = JOptionPane.showConfirmDialog(null, chosenString, "Click yes if you want to change the card and no if you want to finish",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon2);

                            if (code == JOptionPane.YES_OPTION) {
                                List<String[]> birthdayCongratulationIfChangeTextForNoReceiver = new ArrayList<>();
                                birthdayCongratulationIfChangeTextForNoReceiver.add(hbForNoReceiverSecondArray);

                                for (String[] currentArray2 : birthdayCongratulationIfChangeTextForNoReceiver) {

                                    String chosenString2 = currentArray2[getRandomText.nextInt(currentArray2.length)];

                                    JOptionPane.showConfirmDialog(null, chosenString2, "YES - CHANGE TEXT / NO - FINISH",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon4);
                                }
                            } else if (code == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Good luck to you, I believe in you");
                            }

                        }
                    }


                } else if (getSelectedHoliday.equals("Choose holiday")) {
                    if (getSelectedMemberOfFamily.equals("Choose receiver")) {
                        JOptionPane.showMessageDialog(controllingFrame,
                                "Wrong choice. Try again.",
                                "Error Message",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }


            }

        });
        GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
        gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
        gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
        gbc_btnNewButton.gridx = 0;
        gbc_btnNewButton.gridy = 6;
        frame.getContentPane().add(btnNewButton, gbc_btnNewButton);

        txtIfYouWant = new JTextField();
        txtIfYouWant.setEditable(false);
        txtIfYouWant.setHorizontalAlignment(SwingConstants.CENTER);
        txtIfYouWant.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        txtIfYouWant.setForeground(new Color(255, 255, 255));
        txtIfYouWant.setBackground(new Color(139, 0, 0));
        txtIfYouWant.setText("If you want to change the card press \"Yes\" and if you want to finish press \"no\"");
        GridBagConstraints gbc_txtIfYouWant = new GridBagConstraints();
        gbc_txtIfYouWant.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtIfYouWant.gridx = 0;
        gbc_txtIfYouWant.gridy = 7;
        frame.getContentPane().add(txtIfYouWant, gbc_txtIfYouWant);
        txtIfYouWant.setColumns(10);


    }
}



