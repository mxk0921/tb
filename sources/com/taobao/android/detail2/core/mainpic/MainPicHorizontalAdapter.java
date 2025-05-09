package com.taobao.android.detail2.core.mainpic;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.a;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicDinamicXViewHolder;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicImageViewHolder;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicVideoViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.so7;
import tb.t0i;
import tb.t2o;
import tb.txj;
import tb.u0i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainPicHorizontalAdapter extends RecyclerView.Adapter<MainPicAbsViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final a.b b;
    public final MainPicAbsViewHolder.a c;
    public t0i e;
    public final MainPicContainer f;
    public boolean g;

    /* renamed from: a  reason: collision with root package name */
    public final List<u0i> f7212a = new ArrayList();
    public final List<MainPicAbsViewHolder> d = new ArrayList();

    static {
        t2o.a(352322129);
    }

    public MainPicHorizontalAdapter(MainPicContainer mainPicContainer, a.b bVar, MainPicAbsViewHolder.a aVar) {
        this.b = bVar;
        this.c = aVar;
        this.f = mainPicContainer;
        V();
    }

    public static /* synthetic */ Object ipc$super(MainPicHorizontalAdapter mainPicHorizontalAdapter, String str, Object... objArr) {
        if (str.hashCode() == 1707705895) {
            return new Integer(super.getItemViewType(((Number) objArr[0]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/MainPicHorizontalAdapter");
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfe8b053", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            MainPicAbsViewHolder mainPicAbsViewHolder = (MainPicAbsViewHolder) it.next();
            if (mainPicAbsViewHolder != null) {
                mainPicAbsViewHolder.d0();
            }
        }
    }

    public final boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9148dda3", new Object[]{this})).booleanValue();
        }
        if (this.b.d() == null || this.b.d().w0 == null || this.b.d().w0.a() == null) {
            return false;
        }
        return true;
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4518f4", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            MainPicAbsViewHolder mainPicAbsViewHolder = (MainPicAbsViewHolder) it.next();
            if (mainPicAbsViewHolder != null) {
                mainPicAbsViewHolder.destroy();
            }
        }
    }

    public int P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d2179dc", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i < ((ArrayList) this.f7212a).size()) {
            return i;
        }
        int size = ((ArrayList) this.f7212a).size() - U();
        if (size == 0) {
            return 0;
        }
        return ((i - ((ArrayList) this.f7212a).size()) % size) + U();
    }

    public int Q(List<u0i> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a22f309", new Object[]{this, list, new Boolean(z)})).intValue();
        }
        if (z) {
            return list.size() + 1;
        }
        return list.size();
    }

    public List<u0i> S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ceeea342", new Object[]{this});
        }
        return this.f7212a;
    }

    public int T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dff1df9", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f7212a).size();
    }

    public int U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfe105e0", new Object[]{this})).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < ((ArrayList) this.f7212a).size(); i2++) {
            u0i u0iVar = (u0i) ((ArrayList) this.f7212a).get(i2);
            if (u0iVar != null && MainPicVideoViewHolder.i.equals(u0iVar.e())) {
                i++;
            }
        }
        return i;
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d38c9aa", new Object[]{this});
            return;
        }
        t0i t0iVar = new t0i();
        this.e = t0iVar;
        t0iVar.c(MainPicImageViewHolder.l, MainPicImageViewHolder.m);
        this.e.c(MainPicVideoViewHolder.i, MainPicVideoViewHolder.j);
    }

    /* renamed from: W */
    public void onBindViewHolder(MainPicAbsViewHolder mainPicAbsViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e58a1d9", new Object[]{this, mainPicAbsViewHolder, new Integer(i)});
            return;
        }
        txj.e(txj.TAG_MAIN_PIC, i + "bindViewHolder" + mainPicAbsViewHolder);
        mainPicAbsViewHolder.c0((u0i) ((ArrayList) this.f7212a).get(P(i)));
    }

    /* renamed from: X */
    public MainPicAbsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainPicAbsViewHolder) ipChange.ipc$dispatch("c8057cdf", new Object[]{this, viewGroup, new Integer(i)});
        }
        MainPicAbsViewHolder a2 = this.e.a(this.f, this.b, this.c, viewGroup, i);
        if (!((ArrayList) this.d).contains(a2)) {
            ((ArrayList) this.d).add(a2);
        }
        return a2;
    }

    /* renamed from: Y */
    public void onViewRecycled(MainPicAbsViewHolder mainPicAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f5e682", new Object[]{this, mainPicAbsViewHolder});
            return;
        }
        txj.e(txj.TAG_MAIN_PIC, "mainpic onViewRecycled: " + mainPicAbsViewHolder);
        if (mainPicAbsViewHolder != null && !N()) {
            mainPicAbsViewHolder.t0();
        }
    }

    public int Z(List<u0i> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2e152a3", new Object[]{this, list, new Boolean(z)})).intValue();
        }
        int itemCount = getItemCount();
        ((ArrayList) this.f7212a).clear();
        if (list == null) {
            return itemCount;
        }
        ((ArrayList) this.f7212a).addAll(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f7212a).iterator();
        while (it.hasNext()) {
            u0i u0iVar = (u0i) it.next();
            if (u0iVar instanceof so7) {
                this.e.c(u0iVar.e(), MainPicDinamicXViewHolder.i);
                so7 so7Var = (so7) u0iVar;
                this.b.h().e(this.e.b(u0iVar.e()), so7Var.e);
                arrayList.add(so7Var.e);
            }
        }
        this.b.h().b(arrayList);
        this.g = z;
        return itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return Q(this.f7212a, this.g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        List<u0i> list = this.f7212a;
        if (list == null || ((ArrayList) list).size() == 0) {
            return super.getItemViewType(i);
        }
        int P = P(i);
        u0i u0iVar = (u0i) ((ArrayList) this.f7212a).get(P);
        if (u0iVar == null) {
            return super.getItemViewType(P);
        }
        return this.e.b(u0iVar.e());
    }
}
