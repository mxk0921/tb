package com.taobao.search.jarvis.rcmd.cell;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.uikit.SearchUrlImageView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class XslUrlImageView extends SearchUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float ratio = 1.0f;

    static {
        t2o.a(815792314);
    }

    public XslUrlImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(XslUrlImageView xslUrlImageView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/rcmd/cell/XslUrlImageView");
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (this.ratio * View.MeasureSpec.getSize(i)), 1073741824));
        }
    }

    public void setRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978378f0", new Object[]{this, new Float(f)});
            return;
        }
        if (f < 0.0f) {
            f = -f;
        }
        this.ratio = f;
        requestLayout();
    }

    public XslUrlImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public XslUrlImageView(Context context) {
        super(context);
    }
}
