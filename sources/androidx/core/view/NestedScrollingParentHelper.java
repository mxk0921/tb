package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NestedScrollingParentHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mNestedScrollAxesNonTouch;
    private int mNestedScrollAxesTouch;

    public NestedScrollingParentHelper(ViewGroup viewGroup) {
    }

    public int getNestedScrollAxes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ae0ec59", new Object[]{this})).intValue();
        }
        return this.mNestedScrollAxesTouch | this.mNestedScrollAxesNonTouch;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491be8b2", new Object[]{this, view, view2, new Integer(i)});
        } else {
            onNestedScrollAccepted(view, view2, i, 0);
        }
    }

    public void onStopNestedScroll(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a4d786", new Object[]{this, view});
        } else {
            onStopNestedScroll(view, 0);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
        } else if (i2 == 1) {
            this.mNestedScrollAxesNonTouch = i;
        } else {
            this.mNestedScrollAxesTouch = i;
        }
    }

    public void onStopNestedScroll(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
        } else if (i == 1) {
            this.mNestedScrollAxesNonTouch = 0;
        } else {
            this.mNestedScrollAxesTouch = 0;
        }
    }
}
