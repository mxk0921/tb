package com.alibaba.ariver.app.api.ui.titlebar;

import android.graphics.Bitmap;
import android.view.View;
import com.alibaba.ariver.app.api.Page;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface TitleBar {
    void attachPage(Page page);

    View getContent();

    View getDivider();

    Bitmap getImgTitle();

    String getSubTitle();

    String getTitle();

    int getTitleColor();

    String getTransparentTitle();

    void onDestroy();

    void setDivider(View view);

    void setTitle(String str, String str2, String str3, String str4, boolean z);

    void setTitleColor(int i, boolean z, boolean z2);

    void setTransparentTitle(String str);

    void showBackButton(boolean z);

    void showOptionMenu(boolean z);

    void showTitleLoading(boolean z);
}
