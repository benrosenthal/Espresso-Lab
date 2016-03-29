package com.example.espressolab;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by User_1_Benjamin_Rosenthal on 3/28/16.
 */



@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule
            = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testIfAllDisplayed() throws Exception {
        onView(withId(R.id.username_edittext)).check(matches(isDisplayed()));
        onView(withId(R.id.password_edittext)).check(matches(isDisplayed()));
        onView(withId(R.id.submit_button)).check(matches(isDisplayed()));
    }

    @Test
    public void testSubmitButtonIsClickable() throws Exception {
        onView(withId(R.id.submit_button)).perform(click());
    }
}

