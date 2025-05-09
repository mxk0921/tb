package com.taobao.android.detail2.core.framework.view.navbar;

import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.cxj;
import tb.dh7;
import tb.reo;
import tb.seo;
import tb.t2o;
import tb.txj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RightNavAdapter extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final cxj b;
    public final dh7 c;

    /* renamed from: a  reason: collision with root package name */
    public List<seo> f7189a = new ArrayList();
    public final reo d = new reo();

    static {
        t2o.a(352322086);
    }

    public RightNavAdapter(cxj cxjVar, dh7 dh7Var, List<seo> list) {
        this.b = cxjVar;
        this.c = dh7Var;
        this.f7189a.addAll(list);
    }

    public static /* synthetic */ Object ipc$super(RightNavAdapter rightNavAdapter, String str, Object... objArr) {
        if (str.hashCode() == 1707705895) {
            return new Integer(super.getItemViewType(((Number) objArr[0]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/navbar/RightNavAdapter");
    }

    public void M(List<seo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7d4ef4", new Object[]{this, list});
            return;
        }
        this.f7189a.clear();
        if (list != null && !list.isEmpty()) {
            this.f7189a.addAll(list);
        }
        notifyDataSetChanged();
    }

    public void N(List<seo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c1301d", new Object[]{this, list});
        } else {
            O(list, false);
        }
    }

    public void O(List<seo> list, boolean z) {
        final ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63658657", new Object[]{this, list, new Boolean(z)});
        } else if (this.b.j().N().Y0() <= 0 || !z || this.b.l() == null || !this.b.l().f() || this.f7189a.isEmpty()) {
            M(list);
        } else {
            final List<seo> list2 = this.f7189a;
            if (list == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(list);
            }
            try {
                DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback(this) { // from class: com.taobao.android.detail2.core.framework.view.navbar.RightNavAdapter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/navbar/RightNavAdapter$1");
                    }

                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public boolean areContentsTheSame(int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                        }
                        if (((seo) list2.get(i)) == ((seo) arrayList.get(i2))) {
                            return true;
                        }
                        return false;
                    }

                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public boolean areItemsTheSame(int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("501767f6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                        }
                        return ((seo) list2.get(i)).a((seo) arrayList.get(i2));
                    }

                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public int getNewListSize() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Number) ipChange2.ipc$dispatch("f8e07243", new Object[]{this})).intValue();
                        }
                        return arrayList.size();
                    }

                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public int getOldListSize() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Number) ipChange2.ipc$dispatch("cc12e44a", new Object[]{this})).intValue();
                        }
                        return list2.size();
                    }
                });
                this.f7189a = arrayList;
                calculateDiff.dispatchUpdatesTo(this);
            } catch (Throwable th) {
                txj.f(txj.TAG_FAST_ANIM, "Nav 局部刷新失败，自动降级为全部刷新。", th);
                M(list);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<seo> list = this.f7189a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        List<seo> list = this.f7189a;
        if (list == null) {
            return super.getItemViewType(i);
        }
        seo seoVar = list.get(i);
        if (seoVar == null) {
            return super.getItemViewType(i);
        }
        return this.d.c(seoVar.d());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
        } else if (viewHolder instanceof RightNavBarIconHolder) {
            ((RightNavBarIconHolder) viewHolder).d0(this.f7189a.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        return this.d.a(i, viewGroup, this.c, this.b);
    }
}
