package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.updown.TaoLiveKtUpDownActionType;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.sdk.controller.BaseListAdapter;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zs2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<IRecyclerModel> f32984a = new ArrayList<>();
    public RecyclerView b;
    public BaseListAdapter c;
    public final dba d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$kmp$live$updown$TaoLiveKtUpDownActionType;

        static {
            int[] iArr = new int[TaoLiveKtUpDownActionType.values().length];
            $SwitchMap$com$taobao$kmp$live$updown$TaoLiveKtUpDownActionType = iArr;
            try {
                iArr[TaoLiveKtUpDownActionType.RemoveAction.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$kmp$live$updown$TaoLiveKtUpDownActionType[TaoLiveKtUpDownActionType.InsertAction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$kmp$live$updown$TaoLiveKtUpDownActionType[TaoLiveKtUpDownActionType.ReplaceAction.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(779092938);
    }

    public zs2(dba dbaVar) {
        this.d = dbaVar;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f32984a.clear();
        }
    }

    public RecModel c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("9e38fee4", new Object[]{this, new Integer(i)});
        }
        if (this.f32984a.isEmpty() || i > this.f32984a.size() - 1 || i < 0) {
            return null;
        }
        return (RecModel) this.f32984a.get(i);
    }

    public void d(List<z3t> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1672bbf", new Object[]{this, list, new Integer(i)});
        } else if (list != null && !list.isEmpty()) {
            for (z3t z3tVar : list) {
                if (z3tVar.a() != null) {
                    int i2 = a.$SwitchMap$com$taobao$kmp$live$updown$TaoLiveKtUpDownActionType[z3tVar.a().ordinal()];
                    if (i2 == 1) {
                        m(z3tVar.b());
                    } else if (i2 == 2) {
                        e(z3tVar.b(), z3tVar.c(), i);
                    } else if (i2 == 3) {
                        n(z3tVar.b(), z3tVar.c(), i);
                    }
                }
            }
        }
    }

    public final void e(int i, List<TaoLiveKtSwitchModel> list, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1359b1f0", new Object[]{this, new Integer(i), list, new Integer(i2)});
        } else if (list != null && !list.isEmpty() && i >= 0 && i <= this.f32984a.size()) {
            if (list.size() == 1) {
                this.f32984a.add(i, nln.a(list.get(0), this.d));
                BaseListAdapter baseListAdapter = this.c;
                if (baseListAdapter != null) {
                    baseListAdapter.Z(this.f32984a);
                    x5t.h("CacheManagerForKMP", "insertModelAt " + i + " mRecList.size() " + this.f32984a.size());
                    h(i);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                for (TaoLiveKtSwitchModel taoLiveKtSwitchModel : list) {
                    arrayList.add(nln.a(taoLiveKtSwitchModel, this.d));
                }
                this.f32984a.addAll(i, arrayList);
                BaseListAdapter baseListAdapter2 = this.c;
                if (baseListAdapter2 != null) {
                    baseListAdapter2.Z(this.f32984a);
                    x5t.h("CacheManagerForKMP", "insertModelListAt " + i + " mRecList.size() " + this.f32984a.size());
                    i(arrayList, i);
                }
            }
            if (i == i2 + 1) {
                k();
            }
        }
    }

    public final void f(String str, Exception exc) {
        dba dbaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1033ea3d", new Object[]{this, str, exc});
        } else if (pvs.L0() && (dbaVar = this.d) != null) {
            n2o.a(dbaVar.S(), str, exc);
        }
    }

    public final void g(int i) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d809a144", new Object[]{this, new Integer(i)});
        } else if (!pvs.w() || (recyclerView = this.b) == null || !recyclerView.isComputingLayout()) {
            this.c.notifyItemChanged(i);
        } else {
            try {
                a("notifyItemChangedWhileRecyclerViewComputingLayout");
                this.c.notifyItemChanged(i);
            } catch (Exception e) {
                f("notifyItemChangedWhileRecyclerViewComputingLayout", e);
                o3s.b("CacheManagerForKMP", "notifyItemChanged catch Exception: " + e.getMessage());
            }
        }
    }

    public final void h(int i) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d65a78a8", new Object[]{this, new Integer(i)});
        } else if (!pvs.w() || (recyclerView = this.b) == null || !recyclerView.isComputingLayout()) {
            this.c.notifyItemInserted(i);
        } else {
            try {
                a("notifyItemInsertedWhileRecyclerViewComputingLayout");
                this.c.notifyItemInserted(i);
            } catch (Exception e) {
                f("notifyItemInsertedWhileRecyclerViewComputingLayout", e);
                o3s.b("CacheManagerForKMP", "notifyItemInserted catch Exception: " + e.getMessage());
            }
        }
    }

    public final void i(List<RecModel> list, int i) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e4cb52", new Object[]{this, list, new Integer(i)});
        } else if (!pvs.w() || (recyclerView = this.b) == null || !recyclerView.isComputingLayout()) {
            this.c.notifyItemRangeInserted(i, list.size());
        } else {
            try {
                a("notifyItemRangeInsertedWhileRecyclerViewComputingLayout");
                this.c.notifyItemRangeInserted(i, list.size());
            } catch (Exception e) {
                f("notifyItemRangeInsertedWhileRecyclerViewComputingLayout", e);
                o3s.b("CacheManagerForKMP", "notifyItemRangeInserted catch Exception: " + e.getMessage());
            }
        }
    }

    public final void j(int i) {
        RecyclerView recyclerView;
        dba dbaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaab9718", new Object[]{this, new Integer(i)});
        } else if (!pvs.w() || (recyclerView = this.b) == null || !recyclerView.isComputingLayout()) {
            this.c.notifyItemRemoved(i);
        } else {
            try {
                a("notifyItemRemovedWhileRecyclerViewComputingLayout");
                this.c.notifyItemRemoved(i);
            } catch (Exception e) {
                if (pvs.L0() && (dbaVar = this.d) != null) {
                    n2o.a(dbaVar.S(), "notifyItemRemovedWhileRecyclerViewComputingLayout", e);
                }
                o3s.b("CacheManagerForKMP", "notifyItemRemoved catch Exception: " + e.getMessage());
            }
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6859094", new Object[]{this});
        } else {
            sjr.g().c("com.taobao.taolive.room.disable_update_scroll_bgimg", null, vx9.e());
        }
    }

    public void l(RecModel recModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9370a744", new Object[]{this, recModel, new Integer(i)});
        } else if (i >= 0 && i < this.f32984a.size()) {
            this.f32984a.set(i, recModel);
            BaseListAdapter baseListAdapter = this.c;
            if (baseListAdapter != null) {
                baseListAdapter.Z(this.f32984a);
            }
        }
    }

    public void o(BaseListAdapter baseListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99221a77", new Object[]{this, baseListAdapter});
            return;
        }
        this.c = baseListAdapter;
        if (baseListAdapter != null) {
            baseListAdapter.Z(this.f32984a);
        }
    }

    public void p(TaoLiveKtSwitchModel taoLiveKtSwitchModel, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8605756d", new Object[]{this, taoLiveKtSwitchModel, map});
        } else if (taoLiveKtSwitchModel != null) {
            RecModel a2 = nln.a(taoLiveKtSwitchModel, this.d);
            a2.initParams = map;
            this.f32984a.add(a2);
            iba.q1(fkx.i(taoLiveKtSwitchModel), this.d);
        }
    }

    public void q(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46db97ca", new Object[]{this, recyclerView});
        } else {
            this.b = recyclerView;
        }
    }

    public void r(TaoLiveKtSwitchModel taoLiveKtSwitchModel, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2e0054", new Object[]{this, taoLiveKtSwitchModel, map});
        } else if (taoLiveKtSwitchModel != null) {
            RecModel a2 = nln.a(taoLiveKtSwitchModel, this.d);
            a2.initParams = map;
            this.f32984a.set(0, a2);
        }
    }

    public final void a(String str) throws Exception {
        f(str, null);
        Class<? super Object> superclass = this.b.getClass().getSuperclass();
        if (superclass != null) {
            Field declaredField = superclass.getDeclaredField("mLayoutOrScrollCounter");
            declaredField.setAccessible(true);
            declaredField.set(this.b, 0);
        }
    }

    public final void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36514802", new Object[]{this, new Integer(i)});
        } else if (!this.f32984a.isEmpty() && i <= this.f32984a.size() - 1 && i >= 0) {
            this.f32984a.remove(i);
            BaseListAdapter baseListAdapter = this.c;
            if (baseListAdapter != null) {
                baseListAdapter.Z(this.f32984a);
                x5t.h("CacheManagerForKMP", "removeModelAtIndex " + i + " mRecList.size() " + this.f32984a.size());
                j(i);
            }
        }
    }

    public final void n(int i, List<TaoLiveKtSwitchModel> list, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a162ea0", new Object[]{this, new Integer(i), list, new Integer(i2)});
        } else if (list != null && !list.isEmpty() && i >= 0 && i <= this.f32984a.size() - 1) {
            this.f32984a.set(i, nln.a(list.get(0), this.d));
            BaseListAdapter baseListAdapter = this.c;
            if (baseListAdapter != null) {
                baseListAdapter.Z(this.f32984a);
                x5t.h("CacheManagerForKMP", "replaceModelAtIndex " + i + " mRecList.size() " + this.f32984a.size());
                g(i);
            }
            if (i == i2 + 1) {
                k();
            }
        }
    }
}
