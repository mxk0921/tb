package com.taobao.android.order.bundle.widget.recycle;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nestedscroll.recyclerview.layoutmanager.InternalLinearLayoutManager;
import tb.t2o;
import tb.vel;
import tb.z9v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderLinearLayoutManager extends InternalLinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b = false;
    public final Context c;
    public vel d;
    public boolean e;

    static {
        t2o.a(713032011);
    }

    public OrderLinearLayoutManager(Context context) {
        super(context);
        this.c = context;
    }

    public static /* synthetic */ Object ipc$super(OrderLinearLayoutManager orderLinearLayoutManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -579854207) {
            super.onLayoutCompleted((RecyclerView.State) objArr[0]);
            return null;
        } else if (hashCode == -574012007) {
            return new Boolean(super.canScrollHorizontally());
        } else {
            if (hashCode == 514551467) {
                return new Boolean(super.canScrollVertically());
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/order/bundle/widget/recycle/OrderLinearLayoutManager");
        }
    }

    public void A(vel velVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7862388b", new Object[]{this, velVar});
        } else {
            this.d = velVar;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
        }
        return super.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        if (this.b) {
            return false;
        }
        return super.canScrollVertically();
    }

    public void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a2b58f", new Object[]{this, new Boolean(z)});
        } else {
            this.b = !z;
        }
    }

    public OrderLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd702081", new Object[]{this, state});
            return;
        }
        int itemCount = state.getItemCount();
        if (!this.e && (context = this.c) != null && this.d != null && itemCount >= 2) {
            this.e = true;
            z9v.u(context).B("apmClientLayoutComplete", false, null);
            this.d.f().put("rv_layout_completed", Long.valueOf(System.currentTimeMillis()));
        }
        super.onLayoutCompleted(state);
    }
}
