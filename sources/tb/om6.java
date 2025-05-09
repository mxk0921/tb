package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class om6 extends s00<iew, exb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597109);
    }

    public om6(dxb<iew, exb> dxbVar, Comparator<iew> comparator, boolean z, boolean z2) {
        super(dxbVar, comparator, z, z2);
    }

    public static /* synthetic */ Object ipc$super(om6 om6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/videoc/core/impl/DXVideoManager");
    }

    @Override // tb.s00
    public boolean D(List<iew> list, List<iew> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90635fc8", new Object[]{this, list, list2})).booleanValue();
        }
        if (list2.size() != list.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).b() != list2.get(i).b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public List<iew> q(List<iew> list, iew iewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6757a2a7", new Object[]{this, list, iewVar});
        }
        ArrayList arrayList = new ArrayList();
        for (iew iewVar2 : list) {
            if (iewVar2.b() != iewVar.b()) {
                arrayList.add(iewVar2);
            }
        }
        arrayList.add(iewVar);
        return arrayList;
    }

    /* renamed from: H */
    public List<iew> t(List<iew> list, iew iewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bb32276", new Object[]{this, list, iewVar});
        }
        ArrayList arrayList = new ArrayList();
        for (iew iewVar2 : list) {
            if (iewVar2.b() != iewVar.b()) {
                arrayList.add(iewVar2);
            }
        }
        return arrayList;
    }

    /* renamed from: I */
    public List<exb> u(iew iewVar, List<iew> list, pic<exb> picVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c5bf0ae3", new Object[]{this, iewVar, list, picVar});
        }
        ArrayList arrayList = new ArrayList();
        for (exb exbVar : picVar.i()) {
            Integer k = picVar.k(exbVar);
            if (k == null || k.intValue() < 0 || k.intValue() > list.size() - 1) {
                return null;
            }
            if (iewVar.b() == list.get(k.intValue()).b()) {
                arrayList.add(exbVar);
            }
        }
        return arrayList;
    }

    /* renamed from: J */
    public int v(iew iewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db2b2738", new Object[]{this, iewVar})).intValue();
        }
        return iewVar.b();
    }

    @Override // tb.s00
    public List<iew> r(List<iew> list, List<iew> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a5efd318", new Object[]{this, list, list2});
        }
        if (list2 == null || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (iew iewVar : list) {
            Iterator<iew> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (iewVar.b() == it.next().b()) {
                        break;
                    }
                } else {
                    arrayList.add(iewVar);
                    break;
                }
            }
        }
        arrayList.addAll(list2);
        return arrayList;
    }

    @Override // tb.s00
    public pic<exb> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pic) ipChange.ipc$dispatch("c828bac9", new Object[]{this});
        }
        return new x16();
    }
}
