package com.taobao.search.m3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dgw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BaseItemView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int lastWidth;

    static {
        t2o.a(815792316);
    }

    public BaseItemView(Context context) {
        super(context);
        setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
    }

    public static /* synthetic */ Object ipc$super(BaseItemView baseItemView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/BaseItemView");
    }

    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int getWrapContentWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe693fa7", new Object[]{this})).intValue();
        }
        return 0;
    }

    public boolean isWrapContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("920aeb50", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), getFixedHeight());
        if (this.lastWidth != getMeasuredWidth()) {
            onWidthChanged();
            this.lastWidth = getMeasuredWidth();
        }
        if (isWrapContent()) {
            setMeasuredDimension(getWrapContentWidth(), getFixedHeight());
        }
    }

    public void onWidthChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.lastWidth = 0;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        return true;
    }
}
