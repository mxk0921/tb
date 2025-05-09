package com.taobao.tao.flexbox.layoutmanager.view.layoutmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearSmoothScroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CustomLinearSmoothScroller extends LinearSmoothScroller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static float f12403a = 1.0f;

    static {
        t2o.a(503317515);
    }

    public CustomLinearSmoothScroller(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(CustomLinearSmoothScroller customLinearSmoothScroller, String str, Object... objArr) {
        if (str.hashCode() == -1142219598) {
            return new Float(super.calculateSpeedPerPixel((DisplayMetrics) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/layoutmanager/CustomLinearSmoothScroller");
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue();
        }
        return i3 - i;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
        }
        float calculateSpeedPerPixel = super.calculateSpeedPerPixel(displayMetrics);
        float f = f12403a;
        if (f <= 0.0f) {
            f = 1.0f;
        }
        return calculateSpeedPerPixel * (1.0f / f);
    }
}
