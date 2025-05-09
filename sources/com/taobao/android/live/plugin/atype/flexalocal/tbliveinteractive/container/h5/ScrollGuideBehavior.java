package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.taobao.taobao.R;
import tb.iw0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ScrollGuideBehavior extends CoordinatorLayout.Behavior<LinearLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699883);
    }

    public ScrollGuideBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ Object ipc$super(ScrollGuideBehavior scrollGuideBehavior, String str, Object... objArr) {
        if (str.hashCode() == -838279131) {
            return new Boolean(super.onDependentViewChanged((CoordinatorLayout) objArr[0], (CoordinatorLayout) objArr[1], (View) objArr[2]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/container/h5/ScrollGuideBehavior");
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("753c57e3", new Object[]{this, coordinatorLayout, linearLayout, view})).booleanValue() : view.getId() == R.id.design_bottom_sheet;
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1320b0", new Object[]{this, coordinatorLayout, linearLayout, view})).booleanValue();
        }
        float y = view.getY();
        if (BottomSheetBehavior.from((FrameLayout) view).getState() == 3) {
            i = iw0.a(coordinatorLayout.getContext(), 22.0f);
        } else {
            i = iw0.a(coordinatorLayout.getContext(), 7.0f);
        }
        linearLayout.setTranslationY((y - iw0.a(coordinatorLayout.getContext(), 2.0f)) - i);
        return super.onDependentViewChanged(coordinatorLayout, (CoordinatorLayout) linearLayout, view);
    }
}
