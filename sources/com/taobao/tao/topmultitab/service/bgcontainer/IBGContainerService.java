package com.taobao.tao.topmultitab.service.bgcontainer;

import android.graphics.Bitmap;
import android.view.View;
import com.taobao.tao.topmultitab.service.base.IHomePageService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IBGContainerService extends IHomePageService {
    public static final String SERVICE_NAME = "BGContainerService";

    void createView(View view);

    Bitmap getBGContainerScreenShot();

    int getCurrentBgViewId();

    int getLastHeaderScrollDistance();

    void reset();

    void setBGContainerVisibility(int i);

    void setBgView(View view);

    void updateBGContainerAlpha(int i, float f);

    void updateBgView(View view);

    void updateHeaderView();
}
