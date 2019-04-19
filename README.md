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
StackImageView stackImageView = findViewById(R.id.stackImageView);
stackImageView.setImageLists(setImageResources());
stackImageView.setOnImageClickListener(new OnImageClickListener()
{
    @Override
    public void onClick() 
    {
        // Handle StackImageView Click.
    }
});
stackImageView.setMaxVisibleImage(5);
stackImageView.setImageGap(-25);
stackImageView.setImageDimen(65);
stackImageView.setImageBorderWidth(3);
stackImageView.setImageBorderColor(R.color.coral);
stackImageView.setImageLoaderVisibility(true);
stackImageView.setImageLoaderDimen(16);
stackImageView.setImageLoaderColor(R.color.white);
stackImageView.setImagePHVisibility(true);
stackImageView.setImagePHDimen(30);
stackImageView.setImagePlaceHolder(R.drawable.ic_ph_2_icon);
stackImageView.setImageBackgroundColor(R.color.dark_cyan);

stackImageView.setCountDimen(65);
stackImageView.setCountBorderColor(R.color.coral);
stackImageView.setCountViewPosition(StackImageView.COUNT_POSITION_AFTER);
stackImageView.setCountBgColor(R.color.dark_cyan);
stackImageView.setCountTextSize(R.dimen.text_size_20_sp);
stackImageView.setCountTextColor(Color.parseColor("#FFFFFF"));
stackImageView.setCountTextFont(R.font.sofia_regular);
stackImageView.setCountImageInsteadOfText(true);
stackImageView.setCountImageDimen(30);
stackImageView.setCountImageSource(R.drawable.ic_more_icon);
stackImageView.setOverlapType(StackImageView.BOTTOM_TO_TOP_OVERLAP);

private ArrayList<Object> setImageResources() 
{
    ArrayList<Object> imageLists = new ArrayList<>();
    imageLists.add(R.drawable.ic_flower_1_image);
    imageLists.add(R.drawable.ic_flower_2_image);
    imageLists.add(R.drawable.ic_flower_3_image);
    imageLists.add(R.drawable.ic_flower_4_image);
    return imageLists;
}

```
## Release Notes
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
