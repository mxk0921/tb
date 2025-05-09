package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.pipeline.render.FlattenedNodeMutation;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class d5z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d5z INSTANCE = new d5z();

    static {
        t2o.a(598737465);
    }

    public final e7z a(e7z e7zVar, waz wazVar, List<FlattenedNodeMutation> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e7z) ipChange.ipc$dispatch("b1fec8a2", new Object[]{this, e7zVar, wazVar, list});
        }
        ckf.g(list, "mutations");
        waz b = e7zVar == null ? null : e7zVar.b();
        if (b == null && wazVar != null) {
            e7z e7zVar2 = new e7z(wazVar, 0, 0, null, 14, null);
            list.add(FlattenedNodeMutation.Companion.a(null, e7zVar2));
            d(e7zVar2);
            b(e7zVar2, list, yz3.i(), e7zVar2.a());
            return e7zVar2;
        } else if (b != null && wazVar == null) {
            list.add(FlattenedNodeMutation.Companion.b(null, new e7z(b, 0, 0, null, 14, null)));
            return null;
        } else if (b == null || wazVar == null) {
            return null;
        } else {
            e7z e7zVar3 = new e7z(wazVar, 0, 0, null, 14, null);
            INSTANCE.d(e7zVar3);
            if (!h(e7zVar, e7zVar3, list)) {
                list.add(FlattenedNodeMutation.Companion.a(null, e7zVar3));
            }
            b(e7zVar3, list, e7zVar.a(), e7zVar3.a());
            return e7zVar3;
        }
    }

    public final boolean c(e7z e7zVar, e7z e7zVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77bacaa6", new Object[]{this, e7zVar, e7zVar2})).booleanValue();
        }
        return true;
    }

    public final void d(e7z e7zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d248777c", new Object[]{this, e7zVar});
        } else {
            e(e7zVar.a(), e7zVar.b(), 0, 0);
        }
    }

    public final void e(List<e7z> list, waz wazVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d467ee04", new Object[]{this, list, wazVar, new Integer(i), new Integer(i2)});
            return;
        }
        for (waz wazVar2 : wazVar.c()) {
            boolean g = g(wazVar2);
            boolean f = f(wazVar2);
            if (!g) {
                list.add(new e7z(wazVar2, i, i2, null, 8, null));
            }
            if (g || f) {
                e(list, wazVar2, eaz.d(wazVar2.i().a().a()) + i, eaz.e(wazVar2.i().a().a()) + i2);
            }
        }
    }

    public final boolean f(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c743c1", new Object[]{this, wazVar})).booleanValue();
        }
        return false;
    }

    public final boolean g(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9451537d", new Object[]{this, wazVar})).booleanValue();
        }
        return wazVar.z();
    }

    public final boolean h(e7z e7zVar, e7z e7zVar2, List<FlattenedNodeMutation> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f89d42", new Object[]{this, e7zVar, e7zVar2, list})).booleanValue();
        }
        boolean c = c(e7zVar, e7zVar2);
        if (!c || ckf.b(e7zVar, e7zVar2)) {
            iiz.Companion.k("Cannot update node");
        } else {
            list.add(FlattenedNodeMutation.Companion.c(e7zVar, e7zVar2));
        }
        return c;
    }

    public final void b(e7z e7zVar, List<FlattenedNodeMutation> list, List<e7z> list2, List<e7z> list3) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da466d6", new Object[]{this, e7zVar, list, list2, list3});
            return;
        }
        int size = list2.size();
        int size2 = list3.size();
        if (size != 0 || size2 != 0) {
            if (size == 0) {
                for (e7z e7zVar2 : list3) {
                    list.add(FlattenedNodeMutation.Companion.a(e7zVar, e7zVar2));
                    d(e7zVar2);
                    b(e7zVar2, list, yz3.i(), e7zVar2.a());
                }
            } else if (size2 == 0) {
                for (e7z e7zVar3 : list2) {
                    list.add(FlattenedNodeMutation.Companion.b(e7zVar, e7zVar3));
                }
            } else {
                int i2 = size2 - 1;
                int i3 = size - 1;
                int i4 = 0;
                while (i <= i3 && i4 <= i2) {
                    e7z e7zVar4 = list2.get(i);
                    e7z e7zVar5 = list3.get(i4);
                    if (!h(e7zVar4, e7zVar5, list)) {
                        break;
                    }
                    i4++;
                    i++;
                    d(e7zVar5);
                    b(e7zVar5, list, e7zVar4.a(), e7zVar5.a());
                }
                while (i <= i3 && i4 <= i2) {
                    e7z e7zVar6 = list2.get(i3);
                    e7z e7zVar7 = list3.get(i2);
                    if (!h(e7zVar6, e7zVar7, list)) {
                        break;
                    }
                    i3--;
                    i2--;
                    d(e7zVar7);
                    b(e7zVar7, list, e7zVar6.a(), e7zVar7.a());
                }
                HashMap hashMap = new HashMap();
                while (i <= i3) {
                    e7z e7zVar8 = list2.get(i);
                    Integer d = e7zVar8.d();
                    if (d != null) {
                        hashMap.put(Integer.valueOf(d.intValue()), e7zVar8);
                    }
                    i++;
                }
                while (i4 <= i2) {
                    e7z e7zVar9 = list3.get(i4);
                    Integer d2 = e7zVar9.d();
                    if (d2 != null && !hashMap.isEmpty()) {
                        e7z e7zVar10 = (e7z) hashMap.get(d2);
                        if (e7zVar10 == null || ckf.b(e7zVar10, i04.l0(list2))) {
                            a(null, e7zVar9.b(), list);
                        } else {
                            hashMap.remove(d2);
                        }
                    }
                    i4++;
                }
                while (i <= i3 && i4 <= i2) {
                    e7z e7zVar11 = list2.get(i);
                    e7z e7zVar12 = list3.get(i4);
                    if (h(e7zVar11, e7zVar12, list)) {
                        d(e7zVar12);
                        b(e7zVar12, list, e7zVar11.a(), e7zVar12.a());
                    }
                    i4++;
                    i++;
                }
                for (e7z e7zVar13 : hashMap.values()) {
                    FlattenedNodeMutation.a aVar = FlattenedNodeMutation.Companion;
                    ckf.f(e7zVar13, "oldChild");
                    list.add(aVar.b(e7zVar, e7zVar13));
                }
            }
        }
    }
}
