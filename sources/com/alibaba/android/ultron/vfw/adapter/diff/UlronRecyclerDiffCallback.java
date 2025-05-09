package com.alibaba.android.ultron.vfw.adapter.diff;

import android.text.TextUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import tb.rcv;
import tb.t2o;
import tb.tcv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class UlronRecyclerDiffCallback extends DiffUtil.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<IDMComponent> f2307a;
    public final List<IDMComponent> b;
    public final boolean c;
    public int d = 0;

    static {
        t2o.a(157286555);
    }

    public UlronRecyclerDiffCallback(List<IDMComponent> list, List<IDMComponent> list2, boolean z) {
        this.f2307a = list;
        this.b = list2;
        this.c = z;
    }

    public static /* synthetic */ Object ipc$super(UlronRecyclerDiffCallback ulronRecyclerDiffCallback, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/adapter/diff/UlronRecyclerDiffCallback");
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55460a16", new Object[]{this})).intValue();
        }
        return this.d;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        List<IDMComponent> list = this.b;
        if (!(list == null || this.f2307a == null)) {
            if (list.size() <= i || this.f2307a.size() <= i2) {
                return false;
            }
            IDMComponent iDMComponent = this.b.get(i);
            IDMComponent iDMComponent2 = this.f2307a.get(i2);
            if (iDMComponent == null) {
                z = true;
            } else {
                z = false;
            }
            if (iDMComponent2 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                return false;
            }
            if (!tcv.b(iDMComponent2.getKey()) && !rcv.a(iDMComponent2) && (this.c || iDMComponent == iDMComponent2)) {
                z3 = true;
            }
            if (!z3) {
                this.d++;
            }
        }
        return z3;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i, int i2) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("501767f6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        List<IDMComponent> list = this.b;
        if (list == null || this.f2307a == null || list.size() <= i || this.f2307a.size() <= i2) {
            return false;
        }
        IDMComponent iDMComponent = this.b.get(i);
        IDMComponent iDMComponent2 = this.f2307a.get(i2);
        if (iDMComponent == null) {
            z = true;
        } else {
            z = false;
        }
        if (iDMComponent2 != null) {
            z2 = false;
        }
        if (z2 || z) {
            return false;
        }
        return TextUtils.equals(iDMComponent.getKey(), iDMComponent2.getKey());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8e07243", new Object[]{this})).intValue();
        }
        List<IDMComponent> list = this.f2307a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc12e44a", new Object[]{this})).intValue();
        }
        List<IDMComponent> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
