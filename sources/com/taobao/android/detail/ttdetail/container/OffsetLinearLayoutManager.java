package com.taobao.android.detail.ttdetail.container;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OffsetLinearLayoutManager extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Integer> f6734a = new HashMap();

    static {
        t2o.a(912261517);
    }

    public OffsetLinearLayoutManager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(OffsetLinearLayoutManager offsetLinearLayoutManager, String str, Object... objArr) {
        if (str.hashCode() == -579854207) {
            super.onLayoutCompleted((RecyclerView.State) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/container/OffsetLinearLayoutManager");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5038489", new Object[]{this, state})).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        try {
            int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
            int i2 = -((int) findViewByPosition(findFirstVisibleItemPosition).getY());
            for (int i3 = 0; i3 < findFirstVisibleItemPosition; i3++) {
                if (((HashMap) this.f6734a).get(Integer.valueOf(i3)) == null) {
                    i = 0;
                } else {
                    i = ((Integer) ((HashMap) this.f6734a).get(Integer.valueOf(i3))).intValue();
                }
                i2 += i;
            }
            return i2;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue();
        }
        return false;
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
        tgh.b("OffsetLinearLayoutManager", "count:" + childCount);
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            ((HashMap) this.f6734a).put(Integer.valueOf(i2), Integer.valueOf(childAt.getHeight()));
            i += childAt.getHeight();
            tgh.b("OffsetLinearLayoutManager", "view:" + childAt);
        }
        tgh.b("OffsetLinearLayoutManager", "totalHeight:" + i);
    }
}
