package com.geektech.testapp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewAction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.net.PortUnreachableException;

@RunWith(AndroidJUnit4.class)
public class AndroidMathTest {
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void simpleAndroidPlusTest() {
        onView(withId(R.id.et_one)).perform(typeText("3"));
        onView(withId(R.id.et_two)).perform(typeText("3"));
        onView(withId(R.id.btn_plus)).perform(click());
        onView(withId(R.id.txt_number)).check(matches(withText("6")));
    }

    @Test
    public void simpleAndroidDivideTest() {
        onView(withId(R.id.et_one)).perform(typeText("4"));
        onView(withId(R.id.et_two)).perform(typeText("2"));
        onView(withId(R.id.btn_divide)).perform(click());
        onView(withId(R.id.txt_number)).check(matches(withText("2")));
    }

    @Test
    public void checkOnDisplay() {
        onView(withId(R.id.txt_number)).check(matches(isDisplayed()));
    }

}
