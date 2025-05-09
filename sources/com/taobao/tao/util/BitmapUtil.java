package com.taobao.tao.util;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import tb.bwr;
import tb.fwr;
import tb.hjp;
import tb.lr7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BitmapUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(666894618);
    }

    public static Bitmap combineBitmap(Bitmap bitmap, Bitmap bitmap2) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d494ad33", new Object[]{bitmap, bitmap2});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = (width * 2) / 15;
        int i2 = (int) (i * 0.3d);
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        Matrix matrix = new Matrix();
        if (width2 != 0) {
            f = i / width2;
        } else {
            f = 1.0f;
        }
        matrix.postScale(f, f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width2, height2, matrix, true);
        Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(createBitmap, i2, (float) (i2 * 1.2d), (Paint) null);
        canvas.save(31);
        canvas.restore();
        return createBitmap2;
    }

    public static Bitmap createViewBitmap(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4e97da79", new Object[]{view});
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Bitmap bitmap = null;
        try {
            Bitmap.Config config = Bitmap.Config.RGB_565;
            if (measuredWidth * measuredHeight <= 41472000) {
                config = Bitmap.Config.ARGB_8888;
            }
            bitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, config);
            Canvas canvas = new Canvas(bitmap);
            Drawable background = view.getBackground();
            if (background != null) {
                background.draw(canvas);
            } else {
                canvas.drawColor(-1);
            }
            view.draw(canvas);
        } catch (Exception unused) {
        }
        return bitmap;
    }

    public static Bitmap drawTextAtBitmap(Context context, Bitmap bitmap, String str, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8466b708", new Object[]{context, bitmap, str, new Float(f), new Float(f2)});
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setFilterBitmap(true);
        if (!bitmap.isRecycled()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        }
        paint.setColor(context.getResources().getColor(R.color.share_text_text_color));
        paint.setTextSize(lr7.b(context, 25.0f));
        canvas.drawText(str, f, f2, paint);
        canvas.save(31);
        canvas.restore();
        return createBitmap;
    }

    public static Bitmap mergeBitmapMerge(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4) {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        Bitmap bitmap5 = bitmap2;
        Bitmap bitmap6 = bitmap3;
        Bitmap bitmap7 = bitmap4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a057f756", new Object[]{bitmap, bitmap5, bitmap6, bitmap7});
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Rect rect7 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            if (bitmap5 != null) {
                if (bitmap2.getWidth() != width) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap5, width, (int) (((bitmap2.getHeight() * 1.0f) / bitmap2.getWidth()) * width), false);
                    bitmap2.recycle();
                    bitmap5 = createScaledBitmap;
                }
                rect2 = new Rect(0, 0, bitmap5.getWidth(), bitmap5.getHeight());
                rect = new Rect(0, height - (bitmap5.getHeight() / 2), bitmap5.getWidth(), (bitmap5.getHeight() / 2) + height);
                height += bitmap5.getHeight() / 2;
            } else {
                rect2 = null;
                rect = null;
            }
            if (bitmap6 != null) {
                if (bitmap3.getWidth() != width) {
                    Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap6, width, (int) (((bitmap3.getHeight() * 1.0f) / bitmap3.getWidth()) * width), false);
                    bitmap3.recycle();
                    bitmap6 = createScaledBitmap2;
                }
                rect4 = new Rect(0, 0, bitmap6.getWidth(), bitmap6.getHeight());
                rect3 = new Rect(0, height, bitmap6.getWidth(), bitmap6.getHeight() + height);
                height += bitmap6.getHeight();
            } else {
                rect4 = null;
                rect3 = null;
            }
            if (bitmap7 != null) {
                if (bitmap4.getWidth() != width) {
                    Bitmap createScaledBitmap3 = Bitmap.createScaledBitmap(bitmap7, width, (int) (((bitmap4.getHeight() * 1.0f) / bitmap4.getWidth()) * width), false);
                    bitmap4.recycle();
                    bitmap7 = createScaledBitmap3;
                }
                Rect rect8 = new Rect(0, 0, bitmap7.getWidth(), bitmap7.getHeight());
                rect5 = new Rect(0, height - 5, bitmap7.getWidth(), height + bitmap7.getHeight());
                height += bitmap7.getHeight();
                rect6 = rect8;
            } else {
                rect6 = null;
                rect5 = null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(bitmap, rect7, rect7, (Paint) null);
            bitmap.recycle();
            if (bitmap5 != null) {
                canvas.drawBitmap(bitmap5, rect2, rect, (Paint) null);
                bitmap5.recycle();
            }
            if (bitmap6 != null) {
                canvas.drawBitmap(bitmap6, rect4, rect3, (Paint) null);
                bitmap6.recycle();
            }
            if (bitmap7 != null) {
                canvas.drawBitmap(bitmap7, rect6, rect5, (Paint) null);
                bitmap7.recycle();
            }
            return createBitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            fwr.b("mergeBitmapMerge", "err: " + th.getMessage());
            return null;
        }
    }

    public static Bitmap drawWaterMark(Bitmap bitmap) {
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f8ad5dc5", new Object[]{bitmap});
        }
        if ("false".equals(OrangeConfig.getInstance().getConfig("android_share", "drawWaterMark", "true"))) {
            return bitmap;
        }
        try {
            Application a2 = hjp.a();
            String config = OrangeConfig.getInstance().getConfig("android_share", "drawWaterMarkAppName", a2.getApplicationInfo().loadLabel(a2.getPackageManager()).toString());
            Object obj = bwr.h().e().templateParams.get("nick");
            if (!TextUtils.isEmpty(config) && obj != null && !TextUtils.isEmpty(obj.toString())) {
                String str = config + "@" + obj;
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                paint.setFilterBitmap(true);
                if (!bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                }
                paint.setTextSize(22.0f);
                paint.setColor(-1);
                paint.setShadowLayer(3.0f, 2.0f, 2.0f, Color.parseColor("#000000"));
                canvas.drawText(str, 20, height - 42, paint);
                canvas.save(31);
                canvas.restore();
                return createBitmap;
            }
            return bitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            fwr.b("drawWaterMark", "err: " + th.getMessage());
            return bitmap;
        }
    }
}
