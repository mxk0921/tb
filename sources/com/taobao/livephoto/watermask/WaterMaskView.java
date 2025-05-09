package com.taobao.livephoto.watermask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.io.File;
import tb.ayw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WaterMaskView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WaterMaskView";

    static {
        t2o.a(732954648);
    }

    public WaterMaskView(Context context, Drawable drawable, String str) {
        super(context);
        initView(str, drawable);
    }

    private void initView(String str, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d554d0ca", new Object[]{this, str, drawable});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) View.inflate(getContext(), R.layout.water_mask_view, this);
        ((ImageView) linearLayout.findViewById(R.id.water_mask_img)).setImageDrawable(drawable);
        ((TextView) linearLayout.findViewById(R.id.water_mask_text)).setText(str);
    }

    public static /* synthetic */ Object ipc$super(WaterMaskView waterMaskView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/livephoto/watermask/WaterMaskView");
    }

    public static String saveBitmapAsFile(Context context, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63d21e2b", new Object[]{context, drawable, str});
        }
        WaterMaskView waterMaskView = new WaterMaskView(context, drawable, str);
        waterMaskView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        waterMaskView.layout(0, 0, waterMaskView.getMeasuredWidth(), waterMaskView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(waterMaskView.getMeasuredWidth(), waterMaskView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        waterMaskView.draw(new Canvas(createBitmap));
        try {
            String str2 = context.getFilesDir().getPath() + File.separator + System.currentTimeMillis() + ".jpg";
            ayw.d(createBitmap, str2);
            return str2;
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "saveBitmapToFile: ", e);
            return "";
        }
    }
}
