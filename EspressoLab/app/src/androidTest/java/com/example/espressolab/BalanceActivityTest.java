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
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

/**
 * Created by User_1_Benjamin_Rosenthal on 3/28/16.
 */
@RunWith(AndroidJUnit4.class)
public class BalanceActivityTest {

    String starter = "1,400,378";
    String minus = "100";


    @Rule
    public ActivityTestRule<BalanceActivity> mActivityRule
            = new ActivityTestRule<BalanceActivity>(BalanceActivity.class);

    @Test
    public void testIfAllDisplayed() throws Exception {
        onView(withId(R.id.currentBalanceText)).check(matches(isDisplayed()));
        onView(withId(R.id.currentBalanceView)).check(matches(isDisplayed()));
        onView(withId(R.id.decreaseButton)).check(matches(isDisplayed()));
        onView(withId(R.id.increaseButton)).check(matches(isDisplayed()));
        onView(withId(R.id.userName)).check(matches(isDisplayed()));
    }

    @Test
    public void testViewBalance() throws Exception {
        onView(withId(R.id.currentBalanceView)).check(matches(not(null)));
        //onView(withId(R.id.currentBalanceView)).check(matches(withText(not(containsString("")))));
    }

    @Test
    public void testUserNameClickable() throws Exception {
        onView(withId(R.id.userName)).perform(click());
    }

    @Test
    public void testDecreaseFunctionality() throws Exception {
        onView(withId(R.id.userName)).check(matches(withText("$1,300,378")));
    }

    @Test
    public void testIncreaseFunctionality() throws Exception {
        onView(withId(R.id.userName)).check(matches(withText("$1,500,378")));
    }
}
