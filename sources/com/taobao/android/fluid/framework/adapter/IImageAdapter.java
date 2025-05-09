package com.taobao.android.fluid.framework.adapter;

import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.taobao.tao.image.ImageStrategyConfig;
import tb.la2;
import tb.r8e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IImageAdapter extends IAdapter {
    public static final String ADAPTER_NAME = "IImageAdapter";
    public static final String IMAGE_ORIGIN_MODE_NORMAL_BIZID = "9102";
    public static final int IMAGE_ORIGIN_MODE_TEST_BIZID = 9101;

    String decideUrl(String str, int i, int i2);

    ImageStrategyConfig getImageStrategyConfig();

    ImageStrategyConfig getImageStrategyConfig(r8e r8eVar);

    void load(String str, ImageView imageView);

    void load(String str, la2<String, BitmapDrawable> la2Var);
}
