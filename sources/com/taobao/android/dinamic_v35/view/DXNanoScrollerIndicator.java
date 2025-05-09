package com.taobao.android.dinamic_v35.view;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeScrollerIndicator;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNanoScrollerIndicator extends DXNativeScrollerIndicator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final double DEFAULT_INDICATOR_RATIO = 0.5d;
    private double indicatorRatio = 0.5d;
    private boolean flag = false;

    static {
        t2o.a(444596439);
    }

    public DXNanoScrollerIndicator(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DXNanoScrollerIndicator dXNanoScrollerIndicator, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 41028494) {
            super.refreshScrollIndicator(((Number) objArr[0]).doubleValue(), ((Number) objArr[1]).doubleValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamic_v35/view/DXNanoScrollerIndicator");
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (!this.flag) {
            refreshScrollIndicator(vu3.b.GEO_NOT_SUPPORT);
            setRadii((float) (getMeasuredHeight() * 0.5d));
            this.flag = true;
        }
    }

    public void refreshScrollIndicator(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b63390", new Object[]{this, new Double(d)});
        } else {
            super.refreshScrollIndicator(d, this.indicatorRatio, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIndicatorRatio(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d459b19", new Object[]{this, new Double(d)});
        } else {
            this.indicatorRatio = d;
        }
    }
}
