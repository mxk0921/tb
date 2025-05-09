package com.taobao.search.searchdoor.activate;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.ViewCompat;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.DoorListViewModel;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class NestedScrollContainer extends FrameLayout implements NestedScrollingParent2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792966);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollContainer(Context context) {
        super(context);
        ckf.g(context, "context");
        ViewCompat.setNestedScrollingEnabled(this, true);
    }

    public static /* synthetic */ Object ipc$super(NestedScrollContainer nestedScrollContainer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/NestedScrollContainer");
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(view, "p0");
        ckf.g(view2, p1.d);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
        } else {
            ckf.g(view, "p0");
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        ckf.g(view, "target");
        if (i4 > 0) {
            DoorListViewModel.a aVar = DoorListViewModel.Companion;
            Context context = getContext();
            ckf.f(context, "getContext(...)");
            if (aVar.a(context, i4) != 0) {
                onScrollChanged(0, 0, 0, 0);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            return;
        }
        ckf.g(view, "target");
        ckf.g(iArr, "consumed");
        if (i2 < 0) {
            DoorListViewModel.a aVar = DoorListViewModel.Companion;
            Context context = getContext();
            ckf.f(context, "getContext(...)");
            int a2 = aVar.a(context, i2);
            iArr[1] = a2;
            if (a2 != 0) {
                onScrollChanged(0, 0, 0, 0);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        ckf.g(view, "child");
        ckf.g(view2, "target");
        return i == 2;
    }
}
