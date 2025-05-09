package com.taobao.android;

import android.graphics.drawable.Drawable;
import tb.aq0;
import tb.xp0;
import tb.yp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface AliUrlImageViewInterface {
    AliImageStrategyConfigBuilderInterface newImageStrategyConfigBuilder(String str);

    AliImageStrategyConfigBuilderInterface newImageStrategyConfigBuilder(String str, int i);

    void setAutoRelease(boolean z);

    void setCornerRadius(float f, float f2, float f3, float f4);

    void setDarkModeOverlay(boolean z, int i);

    void setEnableSizeInLayoutParams(boolean z);

    void setImageUrl(String str);

    void setImageUrl(String str, yp0 yp0Var);

    void setOrientation(int i);

    void setPlaceHoldForeground(Drawable drawable);

    void setPlaceHoldImageResId(int i);

    void setRatio(float f);

    void setReusableImageShape(boolean z);

    void setShape(int i);

    void setSkipAutoSize(boolean z);

    void setStrategyConfig(Object obj);

    void setStrokeColor(int i);

    void setStrokeWidth(float f);

    void succListener(xp0<aq0> xp0Var);
}
