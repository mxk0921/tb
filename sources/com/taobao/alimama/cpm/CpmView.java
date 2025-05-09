package com.taobao.alimama.cpm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.vm2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CpmView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ImageView mAdImageView;

    static {
        t2o.a(1017118785);
    }

    public CpmView(Context context) {
        super(context);
        ImageView imageView = new ImageView(getContext());
        this.mAdImageView = imageView;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (vm2.o()) {
            this.mAdImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            this.mAdImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        addView(this.mAdImageView);
    }

    public static /* synthetic */ Object ipc$super(CpmView cpmView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/cpm/CpmView");
    }

    public void updateAdBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb69e4c", new Object[]{this, bitmap});
        } else {
            this.mAdImageView.setImageBitmap(bitmap);
        }
    }

    public void updateAdGif(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e9614", new Object[]{this, bitmapDrawable});
        } else {
            this.mAdImageView.setImageDrawable(bitmapDrawable);
        }
    }
}
