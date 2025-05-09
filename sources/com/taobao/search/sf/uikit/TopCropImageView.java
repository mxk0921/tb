package com.taobao.search.sf.uikit;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TopCropImageView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final TUrlImageView innerImageView;

    static {
        t2o.a(815793474);
    }

    public TopCropImageView(Context context) {
        super(context);
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        this.innerImageView = tUrlImageView;
        tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        tUrlImageView.setAdjustViewBounds(true);
        tUrlImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(tUrlImageView);
    }

    public static /* synthetic */ Object ipc$super(TopCropImageView topCropImageView, String str, Object... objArr) {
        if (str.hashCode() == 1907907562) {
            super.measureChildWithMargins((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/uikit/TopCropImageView");
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b85bea", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.measureChildWithMargins(view, i, i2, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i4);
        }
    }

    public final void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        ckf.g(str, "url");
        this.innerImageView.setImageUrl(str);
    }
}
