package com.taobao.android.fluid.business.videocollection.dramacollection.view;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearSmoothScroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TopSlowSmoothScroller extends LinearSmoothScroller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713716);
    }

    public TopSlowSmoothScroller(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TopSlowSmoothScroller topSlowSmoothScroller, String str, Object... objArr) {
        if (str.hashCode() == -1142219598) {
            return new Float(super.calculateSpeedPerPixel((DisplayMetrics) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/videocollection/dramacollection/view/TopSlowSmoothScroller");
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
        }
        return super.calculateSpeedPerPixel(displayMetrics) * 2.5f;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int getVerticalSnapPreference() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
        }
        return -1;
    }
}
