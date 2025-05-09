package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class StaggeredGridSmoothScroller extends LinearSmoothScroller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f10667a;

    static {
        t2o.a(486539662);
    }

    public StaggeredGridSmoothScroller(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(StaggeredGridSmoothScroller staggeredGridSmoothScroller, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/recycleview/StaggeredGridSmoothScroller");
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b976b8e7", new Object[]{this, new Integer(i)});
        } else {
            this.f10667a = i;
        }
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
        }
        return mve.c("scroll_speed", 50) / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a25518", new Object[]{this, view, state, action});
            return;
        }
        int calculateDxToMakeVisible = calculateDxToMakeVisible(view, -1);
        int calculateDyToMakeVisible = calculateDyToMakeVisible(view, -1);
        int calculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((calculateDxToMakeVisible * calculateDxToMakeVisible) + (calculateDyToMakeVisible * calculateDyToMakeVisible)));
        if (calculateTimeForDeceleration > 0) {
            action.update(-calculateDxToMakeVisible, (-calculateDyToMakeVisible) - this.f10667a, calculateTimeForDeceleration, this.mDecelerateInterpolator);
        }
    }
}
