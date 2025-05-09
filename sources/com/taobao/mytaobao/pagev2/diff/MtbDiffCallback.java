package com.taobao.mytaobao.pagev2.diff;

import androidx.recyclerview.widget.DiffUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.h3j;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/mytaobao/pagev2/diff/MtbDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbDiffCallback extends DiffUtil.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<h3j> f11290a;
    public final List<h3j> b;

    static {
        t2o.a(745537944);
    }

    public MtbDiffCallback(List<h3j> list, List<h3j> list2) {
        ckf.h(list, "oldList");
        ckf.h(list2, "newList");
        this.f11290a = list;
        this.b = list2;
    }

    public static /* synthetic */ Object ipc$super(MtbDiffCallback mtbDiffCallback, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/diff/MtbDiffCallback");
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.b.get(i2).d()) {
            return false;
        }
        return ckf.b(this.b.get(i2).b(), this.f11290a.get(i).b());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("501767f6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return ckf.b(ckf.p(this.f11290a.get(i).f(), this.f11290a.get(i).a()), ckf.p(this.b.get(i2).f(), this.b.get(i2).a()));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8e07243", new Object[]{this})).intValue();
        }
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc12e44a", new Object[]{this})).intValue();
        }
        return this.f11290a.size();
    }
}
