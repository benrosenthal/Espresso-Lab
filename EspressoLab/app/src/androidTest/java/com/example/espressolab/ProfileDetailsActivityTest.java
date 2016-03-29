package com.example.espressolab;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.not;

/**
 * Created by User_1_Benjamin_Rosenthal on 3/28/16.
 */
@RunWith(AndroidJUnit4.class)
public class ProfileDetailsActivityTest {

    @Rule
    public ActivityTestRule<ProfileDetailsActivity> mActivityRule
            = new ActivityTestRule<ProfileDetailsActivity>(ProfileDetailsActivity.class);

    @Test
    public void testIfAllDisplayed() throws Exception {
        onView(withId(R.id.userProfileName)).check(matches(isDisplayed()));
        onView(withId(R.id.emailAddress)).check(matches(isDisplayed()));
    }

    @Test
    public void testIfAllHaveText() throws Exception {
        onView(withId(R.id.userProfileName)).check(matches(not(null)));
        onView(withId(R.id.emailAddress)).check(matches(not(null)));
    }
}
