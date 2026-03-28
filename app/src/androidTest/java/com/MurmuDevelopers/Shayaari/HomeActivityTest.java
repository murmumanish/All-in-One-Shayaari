package com.MurmuDevelopers.Shayaari;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.allOf;

import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;





@RunWith(AndroidJUnit4.class)
public class HomeActivityTest {

    @Rule
    public ActivityScenarioRule<HomeActivity> rule = new ActivityScenarioRule<>(HomeActivity.class);


    @Before
    public void setUp() {
        Intents.init();
    }

    @After
    public void tearDown() {
        Intents.release();
    }

    @Test
    public void AttitudeShayaari() {
        onView(withId(R.id.cardview1)).perform(click());

        intended(allOf(
                hasComponent(ShayaariListActivity.class.getName()),
                hasExtra("json_file", "attitude.json"),
                hasExtra("title", "Attitude Shayari"),
                hasExtra("color", (int) 0xFFEAC9E8)
        ));
    }
    /*
    @Test
    public void FunnyShayaari(){

        // Click on CardView
        onView(withId(R.id.cardview2)).perform(click());

        // Verify the Activity Launched
        intended(hasComponent(ShayaariListActivity.class.getName()));

        // Verify the Intent Extras
        intended(allOf(hasComponent(ShayaariListActivity.class.getName()),
                hasExtra("json_file", "funny.json"),
                hasExtra("title", "Funny Shayari"),
                hasExtra("color", 0xFFF0F1A5)
        ));

    }


    @Test
    public void RomanticShayaari(){

        // Click on CardView
        onView(withId(R.id.cardview3)).perform(click());

        // Verify the Activity Launched
        intended(hasComponent(ShayaariListActivity.class.getName()));

        // Verify the Intent Extras
        intended(allOf(hasComponent(ShayaariListActivity.class.getName()),
                hasExtra("json_file", "romantic.json"),
                hasExtra("title", "Romantic Shayari"),
                hasExtra("color", 0xFFC1A4F8)
        ));

    }


    @Test
    public void LoveShayaari(){

        // Click on CardView
        onView(withId(R.id.cardview4)).perform(click());

        // Verify the Activity Launched
        intended(hasComponent(ShayaariListActivity.class.getName()));

        // Verify the Intent Extras
        intended(allOf(hasComponent(ShayaariListActivity.class.getName()),
                hasExtra("json_file", "love.json"),
                hasExtra("title", "Love Shayari"),
                hasExtra("color", 0xFFEDC0D2)
        ));

    }


    @Test
    public void DostiShayaari(){

        // Click on CardView
        onView(withId(R.id.cardview5)).perform(click());

        // Verify the Activity Launched
        intended(hasComponent(ShayaariListActivity.class.getName()));

        // Verify the Intent Extras
        intended(allOf(hasComponent(ShayaariListActivity.class.getName()),
                hasExtra("json_file", "dosti.json"),
                hasExtra("title", "Dosti Shayari"),
                hasExtra("color", 0xFFB6FAA5)
        ));

    }


    @Test
    public void GirlsShayaari(){

        // Click on CardView
        onView(withId(R.id.cardview6)).perform(click());

        // Verify the Activity Launched
        intended(hasComponent(ShayaariListActivity.class.getName()));

        // Verify the Intent Extras
        intended(allOf(hasComponent(ShayaariListActivity.class.getName()),
                hasExtra("json_file", "girls.json"),
                hasExtra("title", "Girls Shayari"),
                hasExtra("color", 0xFF43CBFF)
        ));

    }

    /*
    // Testing Drawer
    @Test
    public void TestingDrawerShare(){



        // Open Drawer
        onView(withId(R.id._drawer)).perform(click());

        // Click on Share
        onView(withId(R.id.share)).perform(click());

        // Verify the intent has ACTION_VIEW and correct data
        intended(allOf(
                hasAction(Intent.ACTION_VIEW),
                hasData(Uri.parse("https://t.me/allinoneshayaari"))
        ));
    }

    @Test
    public void TestingDrawerContactDeveloper(){
        // Open Drawer
        onView(withId(R.id._drawer)).perform(click());

        // Click on Contact Developer
        onView(withId(R.id.contact_developer)).perform(click());

        // Verify the Activity Launched
        intended(hasComponent(ContactDeveloperActivity.class.getName()));
    }
    */

}
