package mbaas.com.nifcloud.ncmbcameraquickstart;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExecuteUITest {

    ViewInteraction tvTitle;
    ViewInteraction tvCMTitle;
    ViewInteraction imgMain;
    ViewInteraction btnStart;

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Before
    public void setup() {
        tvTitle = onView(withId(R.id.textview));
        tvCMTitle = onView(withId(R.id.textView));
        imgMain = onView(withId(R.id.imageView));
        btnStart = onView(withId(R.id.button));
    }

    @Test
    public void initialScreen() {
        tvTitle.check(matches(isDisplayed()));
        tvTitle.check(matches(withText("NIFCLOUD mobile backend")));
        tvCMTitle.check(matches(isDisplayed()));
        tvCMTitle.check(matches(withText("Camera Upload")));
        imgMain.check(matches(isDisplayed()));
        btnStart.check(matches(withText("camera")));
    }

}