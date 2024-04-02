import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.view.View
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.test.core.app.ApplicationProvider
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withSubstring
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.cineasteapp.MovieDetailActivity
import com.example.cineasteapp.R
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher
import org.junit.Test

class IntentInstrumentedTest {
    @Test
    fun testDetailActivityInstantiation() {
        val pokreniDetalje = Intent(ApplicationProvider.getApplicationContext(), MovieDetailActivity::class.java)
        pokreniDetalje.putExtra("movie_title", "Armageddon")
        launchActivity<MovieDetailActivity>(pokreniDetalje)
        onView(withId(R.id.movie_title)).check(matches(withText("Armageddon")))
        onView(withId(R.id.movie_genre)).check(matches(withText("scifi")))
        onView(withId(R.id.movie_poster)).check(matches(withImage(R.drawable.scifi)))
        onView(withId(R.id.movie_overview)).check(
            matches(
                withSubstring(
                    "After discovering that an asteroid the size of Texas will impact Earth in less than a month, NASA recruits a misfit team of deep-core drillers to save the planet."
                )
            )
        )
    }

    private fun withImage(@DrawableRes id: Int) = object : TypeSafeMatcher<View>() {
        override fun describeTo(description: Description) {
            description.appendText("Drawable does not contain image with id: $id")
        }

        override fun matchesSafely(item: View): Boolean {
            val context: Context = item.context
            val bitmap: Bitmap? = ContextCompat.getDrawable(context, id)?.toBitmap()
            return item is ImageView && item.drawable.toBitmap().sameAs(bitmap)
        }
    }
}