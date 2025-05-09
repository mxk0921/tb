package com.taobao.live.home.dinamic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.nkr;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBLFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private nkr mBuilder;

    static {
        t2o.a(806355463);
    }

    public TBLFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TBLFrameLayout tBLFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/view/TBLFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (this.mBuilder != null) {
            r0h.b("DXTBLVWebViewWidgetNode", "TBLFrameLayout onDetachedFromWindow" + this);
            this.mBuilder.a();
            this.mBuilder = null;
        }
    }

    public void setTBLiveH5ContainerBuilder(nkr nkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb0e300f", new Object[]{this, nkrVar});
        } else {
            this.mBuilder = nkrVar;
        }
    }

    public TBLFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TBLFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TBLFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
