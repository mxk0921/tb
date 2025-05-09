package com.alipay.mobile.verifyidentity.ui.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ResUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Drawable getPaddingDrawable(int i, int i2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("2d52a2f2", new Object[]{new Integer(i), new Integer(i2), context});
        }
        if (context != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
            Resources resources = context.getResources();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = 320;
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2, options);
            Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth() + ((int) (displayMetrics.density * 6.0f)), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Rect rect = new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight());
            canvas.drawBitmap(decodeResource, rect, rect, (Paint) null);
            return new BitmapDrawable(resources, createBitmap);
        }
        throw new IllegalArgumentException("Invalid context");
    }
}
