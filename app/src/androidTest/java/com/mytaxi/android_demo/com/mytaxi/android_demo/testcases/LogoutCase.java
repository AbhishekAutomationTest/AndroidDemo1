package com.mytaxi.android_demo.com.mytaxi.android_demo.testcases;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.idling.CountingIdlingResource;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.ActivityRule;
import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.com.mytaxi.android_demo.keywordLibrary.KeywordLibrary;
import com.mytaxi.android_demo.com.mytaxi.android_demo.pageobjects.ObjectRepository;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.espresso.UiController;
import static android.support.test.espresso.Espresso.onIdle;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.action.ViewActions.swipeRight;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
@RunWith(AndroidJUnit4.class)
public class LogoutCase{

    KeywordLibrary key = new KeywordLibrary();

    @Rule public final ActivityRule<MainActivity> mActivityRule = new ActivityRule<>(MainActivity.class);

    ObjectRepository or = new ObjectRepository();

    @Test
    public void Logout() throws InterruptedException {

        key.verifyElement("textSearch");
        Thread.sleep(2000);
        key.clickElement("left_nav_button");
        Thread.sleep(2000);
        key.clickElement("logout");

        /*
        onView(withId(R.id.textSearch)).check(matches(isDisplayed()));
        Thread.sleep(4000);
        onView(withContentDescription("Open navigation drawer")).perform(click());
        Thread.sleep(2000);
        onView(withText("Logout")).perform(click());*/

    }

}
