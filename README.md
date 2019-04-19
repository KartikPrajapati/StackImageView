# StackImageView
StackImageView Provides horizontally overlapping of circular images with lots of customization. You can customize StackImageView as per your requirements from both layout XML file and JAVA file.
<br/><br/>
![screenshot1](https://github.com/KartikPrajapati/StackImageView/blob/master/screenshot1.jpg)
<br/><br/>
There are lots of customization option available as below:
- Max visible images.
- Gap between images.
- CircularImage dimension & background color.
- CircularImage border color & width.
- CircularImage loader visibility, dimension, color.
- CircularImage placeholder visibility, dimension, source image.
- CountView dimension & background color.
- CountView text size & color.
- CountView border color & width.
- CountView image visibility instead of text.
- CountView image dimension & source image.
- CountView position.
- CountView text font.
- Overlapping type.
## Gradle
Add following line of code into your top level build.gradle file :
```
repositories {
        google()
        jcenter()
    }
```
Add following line of code into your app level build.gradle file :
```
dependencies {
    ...
    compile 'com.kartik.stackimageview:stackimageview:0.0.2'
}
```
## Usage
For display images in circular shape with horizontally overlapping, use **StackImageView** in your layout XML file.
### XML
```javascript
<com.kartikp.stackimageview.customviews.StackImageView
        android:id="@+id/stackImageView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        app:siv_max_visible_image="5"
        app:siv_image_gap="-10dp"
        app:siv_image_dimen="65dp"
        app:siv_image_border_width="5dp"
        app:siv_image_border_color="#FFFFFF"
        app:siv_image_loader_visible="true"
        app:siv_image_placeholder_dimen="18dp"
        app:siv_image_loader_color="#FFFFFF"
        app:siv_image_placeholder_visible="true"
        app:siv_image_placeholder_dimen="25dp"
        app:siv_image_placeholder_source="@drawable/ic_uses_1_icon"
        app:siv_image_bg_color="#656565"
        app:siv_count_dimen="65dp"
        app:siv_count_border_width="5dp"
        app:siv_count_border_color="#FFFFFF"
        app:siv_count_position="after"
        app:siv_count_bg_color="#656565"
        app:siv_count_text_size="21sp"
        app:siv_count_text_color="#FFFFFF"
        app:siv_count_text_font="@font/lobster"
        app:siv_count_image_instead_of_text="true"
        app:siv_count_image_dimen="30dp"
        app:siv_count_image_source="@drawable/ic_more_icon"
        app:siv_overlap_type="bottom_to_top"/>
```
### JAVA
```javascript
stackImageView = findViewById(R.id.stackImageView);
stackImageView.setImageUrlArrayList(getImageUrlList());
stackImageView.setStackImageViewClickListener(new StackImageViewClickListener()
{
    @Override
    public void onStackImageViewClick()
    {
        // Handle StackImageView Click.
    }
});
stackImageView.setMaxVisibleCircularImage(5);
stackImageView.setGapBetweenViews(-10);
stackImageView.setCircularImageDimen(65);
stackImageView.setCircularImageBorderWidth(5);
stackImageView.setCircularImageBorderColor(Color.parseColor("#FFFFFF"));
stackImageView.setCircularImageLoaderVisible(true);
stackImageView.setCircularImageLoaderDimen(20);
stackImageView.setCircularImageLoaderColor(Color.parseColor("#FFFFFF"));
stackImageView.setCircularImagePHVisible(true);
stackImageView.setCircularImagePHDimen(25);
stackImageView.setCircularImagePH(R.drawable.ic_uses_1_icon);
stackImageView.setCircularImageLoadingFailedBgColor(Color.parseColor("#656565"));

stackImageView.setCountViewDimen(65);
stackImageView.setCountViewBorderWidth(5);
stackImageView.setCountViewBorderColor(Color.WHITE);
stackImageView.setCountViewPosition(StackImageView.COUNT_VIEW_POSITION_AFTER);
stackImageView.setCountViewBgColor(Color.parseColor("#656565"));
stackImageView.setCountViewTextSize(21);
stackImageView.setCountViewTextColor(Color.parseColor("#FFFFFF"));
stackImageView.setCountViewTextFont(R.font.lobster);
stackImageView.setCountViewImageInsteadOfText(true);
stackImageView.setCountViewImageDimen(30);
stackImageView.setCountViewImageSource(R.drawable.ic_more_icon);
// It is compulasory to initialize StackImageView.
stackImageView.initViews();
```
## Release Notes
- 0.0.6
  - Solve CircularImageView & CountView border issue.
  - Add support for CountView text font.
  - Add comments on each functions to better understand function mechanism.
  - Improve naming convension.
- 0.0.5
  - Code optimization of maxVisibleImage() & countTextViewPosition().
  - Fix CountTextView background color issue.
  - Fix CircularImage placeholder dimension issue.
- 0.0.4
  - Add getter - setter methods for customization from JAVA file.
  - Add support for dynamic customization.
  - Fix CountTextView text size issue.
  - Improve CountTextView text size handling mechanism.
- 0.0.3
  - Add new customization features.
  - Remove redundunt customization features.
  - Fix CircularImage border issue.
- 0.0.2
  - Fix bugs & prevent crashes.
- 0.0.1
  - Initial release.
## Author
Kartik Prajapati
> kartikp0109@gmail.com
## License
````
Copyright 2018 Kartik Prajapati

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
````
