# StackImageView
StackImageView Provides horizontally overlapping of circular images with lots of customization.
<br/>
<br/>
![screenshot1](https://github.com/KartikPrajapati/StackImageView/blob/master/screenshot1.jpg)
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
    compile 'com.kartikp.stackimageview:stackimageview:0.0.5'
}
```
## Usage
For display images in circular shape with horizontally overlapping, use **StackImageView** in your layout XML file.
### XML
```javascript
<com.kartikp.stackimageview.StackImageView
        android:id="@+id/stackImageView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        app:maxVisibleProfileImage="5"
        app:gapBetweenViews="-10dp"
        app:profileImageBorderColor="#DC143C"
        app:profileImageBorderWidth="2dp"
        app:profileImageDimen="65dp"
        app:profileImageLoaderVisible="true"
        app:profileImagePlaceHolder="@drawable/ic_star_icon"
        app:countTextViewBg="#000080"
        app:countTextViewBorderColor="#3CB371"
        app:countTextViewColor="#FF8C00"
        app:countTextViewImageInsteadOfText="true"
        app:countTextViewImageSource="@drawable/ic_star_icon"
        app:countTextViewPosition="after"/>
```
You have to use following proprties in your XML to customize **StackImageView** as per your requirements.
> Properties :
- `app:maxVisibleProfileImage="5"` (integer) -> default 5
- `app:gapBetweenViews="-10dp"` (dimension) -> default -10dp
- `app:profileImageBorderColor="#DC143C"` (color) -> default PINK
- `app:profileImageBorderWidth="2dp"` (dimension) -> default 2dp
- `app:profileImageDimen="65dp" `(dimension) -> default 60dp
- `app:profileImageLoaderVisible="true"` (boolean)-> default true
- `app:profileImagePlaceHolder="@drawable/ic_launcher_icon"` (resource) -> default ic_launcher.png
- `app:countTextViewBg="#000080"` (color) -> default BLUE
- `app:countTextViewBorderColor="#3CB371"` (color) -> default GREEN
- `app:countTextViewColor="#FF8C00"` (color) -> default ORANGE
- `app:countTextViewImageInsteadOfText="true"` (boolean) -> default false

   and other more properties.
### JAVA
```javascript
StackImageView stackImageView = findViewById(R.id.stackImageView);
// Set image url list.
stackImageView.setImageUrlArrayList(getImageUrlList());
stackImageView.setMaxVisibleProfileImage(4);
stackImageView.setGapBetweenViews(20);
stackImageView.setProfileImageBorderColor(Color.RED);
stackImageView.setProfileImageBorderWidth(5);
stackImageView.setProfileImageDimen(150);
stackImageView.setProfileImageLoaderVisible(true);
stackImageView.setProfileImagePlaceHolder(R.drawable.ic_image_placeholder_icon);
stackImageView.setCountTextViewBg(Color.parseColor("#0000FF"));
stackImageView.setCountTextViewBorderColor(Color.WHITE);
stackImageView.setCountTextViewColor(Color.parseColor("#FFFFFF"));
stackImageView.setCountTextViewImageInsteadOfText(false);
stackImageView.initViews();
```
## Credits
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
