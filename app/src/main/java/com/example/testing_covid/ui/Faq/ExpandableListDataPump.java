package com.example.testing_covid.ui.Faq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> faq1 = new ArrayList<String>();
        faq1.add("The most common symptoms of COVID-19 are fever, dry cough, and tiredness.");


        List<String> faq2 = new ArrayList<String>();
        faq2.add("The time between exposure to COVID-19 and the moment when symptoms start is commonly around five to six days but can range from 1 – 14 days.");


        List<String> faq3 = new ArrayList<String>();
        faq3.add("When grocery shopping, keep at least 1-metre distance from others and avoid touching your eyes, mouth and nose. Once home, wash your hands thoroughly and also after handling and storing your purchased products.");

        List<String> faq4 = new ArrayList<String>();
        faq4.add("There is currently no confirmed case of COVID-19 transmitted through food or food packaging.");

        List<String> faq5 = new ArrayList<String>();
        faq5.add("The most important thing to know about coronavirus on surfaces is that they can easily be+ cleaned with common household disinfectants that will kill the virus. Studies have shown that the COVID-19 virus can survive for up to 72 hours on plastic and stainless steel, less than 4 hours on copper and less than 24 hours on cardboard.");

        List<String> faq6 = new ArrayList<String>();
        faq6.add("Most people who get COVID-19 will be able to recover at home Use a separate room and bathroom for sick household members Wash your hands often with soap and water for at least 20 seconds, especially after blowing your nose, coughing, or sneezing; going to the bathroom; and before eating or preparing food.");

        List<String> faq7 = new ArrayList<String>();
        faq7.add("Avoid close contact with people who are sick.Stay home when you are sick, except to get medical care.Cover your coughs and sneezes with a tissue and throw the tissue in the trash.Wash your hands often with soap and water for at least 20 seconds.Clean and disinfect frequently touched surfaces and objects, like tables, countertops, light switches, doorknobs, and cabinet handles.");

        List<String> faq8 = new ArrayList<String>();
        faq8.add("Maybe; not everyone needs to be tested for COVID-19.If you have symptoms of COVID-19 and want to get tested, call your healthcare provider first. Most people will have mild illness and can recover at home without medical care and may not need to be tested.");

        List<String> faq9 = new ArrayList<String>();
        faq9.add("For COVID-19, a close contact is defined as anyone who was within 6 feet of an infected person for at least 15 minutes starting from 48 hours before the person began feeling sick until the time the patient was isolated.");

        List<String> faq10 = new ArrayList<String>();
        faq10
                .add("There is currently no known risk associated with being in the same room at a funeral or visitation service with the body of someone who died of COVID-19.learn how to protect yourself from respiratory illnesses, like COVID-19, if you decide to attend a funeral or visitation.");


        expandableListDetail.put("what are the symptoms of covid19?", faq1);
        expandableListDetail.put("How long does it take to develop symptoms after exposure to covid19?", faq2);
        expandableListDetail.put("How to grocery shop safely?", faq3);
        expandableListDetail.put("Does packed food transmit covid19?", faq4);
        expandableListDetail.put("How long does the virus survive on surfaces?", faq5);
        expandableListDetail.put("What should i do if i get suck or someone in house gets sick??\n", faq6);
        expandableListDetail.put("How can I protect my child from covid19?", faq7);
        expandableListDetail.put("Should I be tested for a current Infection?", faq8);
        expandableListDetail.put("who is considered as close contact to someone with covid19?", faq9);
        expandableListDetail.put("Am I at risk if i go to the funeral service of someone who died of covid19?", faq10);
        return expandableListDetail;
    }
}
