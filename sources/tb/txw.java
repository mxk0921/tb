package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.adapter.biz.plugins.watermask.view.BottomWaterMaskView;
import com.taobao.tao.adapter.biz.plugins.watermask.view.LastWaterMaskView;
import com.taobao.tao.adapter.biz.plugins.watermask.view.VideoWaterBgView;
import com.taobao.taobao.R;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class txw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIR_NAME = "marvel_watermark_gg";

    static {
        t2o.a(793772107);
    }

    public static String a(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3867642", new Object[]{context, str, new Integer(i), new Integer(i2)});
        }
        String c = yxw.c(context, str, i, i2);
        if (new File(c).exists()) {
            return c;
        }
        VideoWaterBgView videoWaterBgView = new VideoWaterBgView(context, i, i2);
        videoWaterBgView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        videoWaterBgView.layout(0, 0, videoWaterBgView.getMeasuredWidth(), videoWaterBgView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(videoWaterBgView.getMeasuredWidth(), videoWaterBgView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        videoWaterBgView.draw(new Canvas(createBitmap));
        try {
            tgw.f(createBitmap, c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    public static Bitmap b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("832fe9d7", new Object[]{context, str, str2});
        }
        BottomWaterMaskView bottomWaterMaskView = new BottomWaterMaskView(context, str, str2);
        int a2 = tgw.a(context, 35.0f);
        bottomWaterMaskView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(a2, 1073741824));
        bottomWaterMaskView.layout(0, 0, bottomWaterMaskView.getMeasuredWidth(), a2);
        Bitmap createBitmap = Bitmap.createBitmap(bottomWaterMaskView.getMeasuredWidth(), bottomWaterMaskView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        bottomWaterMaskView.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static String c(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92a8eeff", new Object[]{context, str, str2, new Boolean(z)});
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            String str3 = File.separator;
            sb.append(str3);
            sb.append("watermark_tbLive");
            sb.append(str3);
            sb.append("watermark.png");
            return sb.toString();
        }
        String b = yxw.b(context, str);
        if (new File(b).exists()) {
            return b;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            String str4 = File.separator;
            sb2.append(str4);
            sb2.append(DIR_NAME);
            sb2.append(str4);
            sb2.append("watermark.png");
            tgw.f(b(context, str, sb2.toString()), b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public static String d(Context context, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a960f28", new Object[]{context, str, bitmap});
        }
        String d = yxw.d(context, str);
        if (new File(d).exists()) {
            return d;
        }
        View e = e(context, bitmap);
        int a2 = tgw.a(context, 70.0f);
        int a3 = tgw.a(context, 70.0f);
        e.measure(View.MeasureSpec.makeMeasureSpec(a2, 1073741824), View.MeasureSpec.makeMeasureSpec(a3, 1073741824));
        e.layout(0, 0, e.getMeasuredWidth(), e.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(a2, a3, Bitmap.Config.ARGB_8888);
        e.draw(new Canvas(createBitmap));
        try {
            tgw.f(createBitmap, d);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return d;
    }

    public static View e(Context context, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("663765e7", new Object[]{context, bitmap});
        }
        int a2 = tgw.a(context, 2.0f);
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundResource(R.drawable.share_cricle_white_bg);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setPadding(a2, a2, a2, a2);
        imageView.setImageBitmap(bitmap);
        return imageView;
    }

    public static String f(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c44494b", new Object[]{context, str, str2, str3});
        }
        String e = yxw.e(context, str);
        if (new File(e).exists()) {
            return e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        String str4 = File.separator;
        sb.append(str4);
        sb.append(DIR_NAME);
        sb.append(str4);
        sb.append("search_icon.png");
        String sb2 = sb.toString();
        LastWaterMaskView lastWaterMaskView = new LastWaterMaskView(context, str, str2, sb2, str3 + str4 + DIR_NAME + str4 + "tab_bar.png");
        lastWaterMaskView.measure(View.MeasureSpec.makeMeasureSpec(tgw.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(tgw.c(), Integer.MIN_VALUE));
        lastWaterMaskView.layout(0, 0, lastWaterMaskView.getMeasuredWidth(), lastWaterMaskView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(lastWaterMaskView.getMeasuredWidth(), lastWaterMaskView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        lastWaterMaskView.draw(new Canvas(createBitmap));
        try {
            tgw.f(createBitmap, e);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return e;
    }
}
