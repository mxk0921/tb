package com.taobao.android.dinamicx.view;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXLinearLayoutManager extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7348a = true;

    static {
        t2o.a(444597154);
    }

    public DXLinearLayoutManager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DXLinearLayoutManager dXLinearLayoutManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -574012007) {
            return new Boolean(super.canScrollHorizontally());
        }
        if (hashCode == 514551467) {
            return new Boolean(super.canScrollVertically());
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/view/DXLinearLayoutManager");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        if (!this.f7348a || !super.canScrollVertically()) {
            return false;
        }
        return true;
    }

    public void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        } else {
            this.f7348a = z;
        }
    }

    public DXLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
        }
        return this.f7348a && super.canScrollHorizontally();
    }
}
