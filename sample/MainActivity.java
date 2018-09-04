package app.com.testgradlestackimage;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.kartikp.stackimageview.customviews.StackImageView;
import com.kartikp.stackimageview.interfaces.StackImageViewClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControls();
    }

    private void initControls()
    {
        // This is compulsory.
        StackImageView stackImageView = findViewById(R.id.stackImageView);
        stackImageView.setImageUrlArrayList(getStackImageModelList());
        stackImageView.setStackImageViewClickListener(new StackImageViewClickListener()
        {
            @Override
            public void onStackImageViewClick()
            {
                Toast.makeText(MainActivity.this, "onStackImageViewClick() method call.", Toast.LENGTH_SHORT).show();
            }
        });

        // This is optional code(below for runtime changes).
        stackImageView.setMaxVisibleCircularImage(5);
        stackImageView.setGapBetweenViews(-10);
        stackImageView.setCircularImageDimen(60);
        stackImageView.setCircularImageBorderWidth(5);
        stackImageView.setCircularImageBorderColor(Color.parseColor("#800080"));
        stackImageView.setCircularImageLoadingFailedBgColor(Color.parseColor("#338800"));
        stackImageView.setCircularImageLoaderVisible(true);
        stackImageView.setCircularImageLoaderDimen(20);
        stackImageView.setCircularImageLoaderColor(Color.parseColor("#23FF67"));
        stackImageView.setCircularImagePHVisible(true);
        stackImageView.setCircularImagePH(R.drawable.ic_uses_1_icon);
        stackImageView.setCircularImagePHDimen(25);
        stackImageView.setCountViewDimen(60);
        stackImageView.setCountViewBorderWidth(5);
        stackImageView.setCountViewBorderColor(Color.parseColor("#CCCCCC"));
        stackImageView.setCountViewPosition(StackImageView.COUNT_VIEW_POSITION_AFTER);
        stackImageView.setCountViewBgColor(Color.parseColor("#00FF99"));
        stackImageView.setCountViewTextSize(22);
        stackImageView.setCountViewTextColor(Color.parseColor("#33333F"));
        stackImageView.setCountViewImageInsteadOfText(true);
        stackImageView.setCountViewImageSource(R.drawable.ic_uses_2_icon);
        stackImageView.setCountViewImageDimen(23);

        // This is compulsory.
        stackImageView.initViews();

        /*stackImageView.setMaxVisibleCircularImage(6);
        stackImageView.setGapBetweenViews(-10);
        stackImageView.setCircularImageDimen(55);
        stackImageView.setCircularImageBorderWidth(4);
        stackImageView.setCircularImageBorderColor(Color.parseColor("#8F5080"));
        stackImageView.setCircularImageLoadingFailedBgColor(Color.parseColor("#338800"));
        stackImageView.setCircularImageLoaderVisible(true);
        stackImageView.setCircularImageLoaderDimen(20);
        stackImageView.setCircularImageLoaderColor(Color.parseColor("#23FF67"));
        stackImageView.setCircularImagePHVisible(true);
        stackImageView.setCircularImagePH(R.drawable.ic_uses_1_icon);
        stackImageView.setCircularImagePHDimen(25);
        stackImageView.setCountViewDimen(55);
        stackImageView.setCountViewBorderWidth(4);
        stackImageView.setCountViewBorderColor(Color.parseColor("#FF009C"));
        stackImageView.setCountViewPosition(StackImageView.COUNT_VIEW_POSITION_AFTER);
        stackImageView.setCountViewBgColor(Color.parseColor("#00FF99"));
        stackImageView.setCountViewTextSize(26);
        stackImageView.setCountViewTextColor(Color.parseColor("#F0333F"));
        stackImageView.setCountViewImageInsteadOfText(true);
        stackImageView.setCountViewImageSource(R.drawable.ic_uses_1_icon);
        stackImageView.setCountViewImageDimen(27);*/
    }

    private ArrayList<String> getStackImageModelList()
    {
        ArrayList<String> stackImageModelArrayList = new ArrayList<>();
        stackImageModelArrayList.add("http://img.timeinc.net/time/daily/2010/1011/poy_nomination_agassi.jpg");
        stackImageModelArrayList.add("https://www.diethelmtravel.com/wp-content/uploads/2016/04/bill-gates-wealthiest-person.jpg");
        stackImageModelArrayList.add("http://www.tiig-eg.com/uploads/d991c-person.jpg");
        stackImageModelArrayList.add("https://engineering.unl.edu/images/staff/Kayla_Person-small.jpg");
        stackImageModelArrayList.add("https://i.pinimg.com/originals/84/c0/2d/84c02d14934ede220f0de14224faff6b.jpg");
        stackImageModelArrayList.add("http://www.pick-health.com/wp-content/uploads/2013/08/happy-person.jpg");
        stackImageModelArrayList.add("https://www.thewrap.com/wp-content/uploads/2015/11/Donald-Trump.jpg");
        stackImageModelArrayList.add("http://img.timeinc.net/time/daily/2010/1011/poy_nomination_agassi.jpg");
        stackImageModelArrayList.add("https://www.diethelmtravel.com/wp-content/uploads/2016/04/bill-gates-wealthiest-person.jpg");
        stackImageModelArrayList.add("http://www.tiig-eg.com/uploads/d991c-person.jpg");

        return stackImageModelArrayList;
    }

}
