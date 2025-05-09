package com.taobao.search.m3.more;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MoreButton extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int h;
    private final String url;
    private int w;

    static {
        t2o.a(815792416);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreButton(Context context, int i, int i2, int i3, String str) {
        super(context);
        ckf.g(context, "context");
        ckf.g(str, "url");
        this.w = i;
        this.h = i2;
        this.url = str;
        setScaleType(ImageView.ScaleType.FIT_XY);
        setImageUrl(str);
        setPadding(0, i3, 0, i3);
    }

    public static /* synthetic */ Object ipc$super(MoreButton moreButton, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/more/MoreButton");
    }

    public final int getH() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("746cb72c", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public final int getW() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("754017bb", new Object[]{this})).intValue();
        }
        return this.w;
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setMeasuredDimension(this.w, this.h);
        }
    }

    public final void setH(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fd6f6", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public final void setW(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f88847", new Object[]{this, new Integer(i)});
        } else {
            this.w = i;
        }
    }

    public final void updateUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30541df7", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.url;
        }
        setImageUrl(str);
    }
}
