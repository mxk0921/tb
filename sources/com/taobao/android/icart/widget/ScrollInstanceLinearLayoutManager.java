package com.taobao.android.icart.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.engine.CartVEngine;
import com.taobao.nestedscroll.recyclerview.layoutmanager.InternalLinearLayoutManager;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ScrollInstanceLinearLayoutManager extends InternalLinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<Integer, Integer> b = new HashMap();
    public boolean c = true;
    public a d = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    static {
        t2o.a(478151103);
    }

    public ScrollInstanceLinearLayoutManager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(ScrollInstanceLinearLayoutManager scrollInstanceLinearLayoutManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -579854207) {
            super.onLayoutCompleted((RecyclerView.State) objArr[0]);
            return null;
        } else if (hashCode == 514551467) {
            return new Boolean(super.canScrollVertically());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/icart/widget/ScrollInstanceLinearLayoutManager");
        }
    }

    public void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        if (!this.c || !super.canScrollVertically()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fcf9613", new Object[]{this, state})).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        try {
            int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
            int i2 = -((int) findViewByPosition(findFirstVisibleItemPosition).getY());
            for (int i3 = 0; i3 < findFirstVisibleItemPosition; i3++) {
                if (((HashMap) this.b).get(Integer.valueOf(i3)) == null) {
                    i = 0;
                } else {
                    i = ((Integer) ((HashMap) this.b).get(Integer.valueOf(i3))).intValue();
                }
                i2 += i;
            }
            return i2;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd702081", new Object[]{this, state});
            return;
        }
        super.onLayoutCompleted(state);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((HashMap) this.b).put(Integer.valueOf(i), Integer.valueOf(getChildAt(i).getHeight()));
        }
        a aVar = this.d;
        if (aVar != null) {
            ((CartVEngine.d) aVar).a(state);
        }
    }

    public void z(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f48e101", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public ScrollInstanceLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
