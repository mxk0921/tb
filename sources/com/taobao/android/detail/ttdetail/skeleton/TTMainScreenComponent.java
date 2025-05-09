package com.taobao.android.detail.ttdetail.skeleton;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.oa4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTMainScreenComponent extends oa4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class RecyclerViewListener extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262236);
        }

        public static /* synthetic */ Object ipc$super(RecyclerViewListener recyclerViewListener, String str, Object... objArr) {
            if (str.hashCode() == -1177043419) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/TTMainScreenComponent$RecyclerViewListener");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (TTMainScreenComponent.u(null)) {
                TTMainScreenComponent.v(null, false);
                int w = TTMainScreenComponent.w(null) - TTMainScreenComponent.x(null).findFirstVisibleItemPosition();
                if (w >= 0 && w < TTMainScreenComponent.y(null).getChildCount()) {
                    TTMainScreenComponent.y(null).scrollBy(0, TTMainScreenComponent.y(null).getChildAt(w).getTop());
                }
            }
        }
    }

    static {
        t2o.a(912262235);
        t2o.a(912262221);
    }

    public static /* synthetic */ Object ipc$super(TTMainScreenComponent tTMainScreenComponent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/TTMainScreenComponent");
    }

    public static /* synthetic */ boolean u(TTMainScreenComponent tTMainScreenComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("842c1125", new Object[]{tTMainScreenComponent})).booleanValue();
        }
        throw null;
    }

    public static /* synthetic */ boolean v(TTMainScreenComponent tTMainScreenComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f6e93d9", new Object[]{tTMainScreenComponent, new Boolean(z)})).booleanValue();
        }
        throw null;
    }

    public static /* synthetic */ int w(TTMainScreenComponent tTMainScreenComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e9d0a33", new Object[]{tTMainScreenComponent})).intValue();
        }
        throw null;
    }

    public static /* synthetic */ LinearLayoutManager x(TTMainScreenComponent tTMainScreenComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayoutManager) ipChange.ipc$dispatch("9999bd8e", new Object[]{tTMainScreenComponent});
        }
        throw null;
    }

    public static /* synthetic */ RecyclerView y(TTMainScreenComponent tTMainScreenComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("12236125", new Object[]{tTMainScreenComponent});
        }
        throw null;
    }
}
