package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jdt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<zzp, List<zet>> f21940a = new ConcurrentHashMap<>();

    public List<zzp> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("85a13c36", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<zzp, List<zet>> entry : this.f21940a.entrySet()) {
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }

    public void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edbd5146", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            d(i, new byi(Integer.valueOf(i2)));
        }
    }

    public void d(int i, byi byiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5d0218", new Object[]{this, new Integer(i), byiVar});
            return;
        }
        for (Map.Entry<zzp, List<zet>> entry : this.f21940a.entrySet()) {
            entry.getKey();
            List<zet> value = entry.getValue();
            if (value != null) {
                Iterator<zet> it = value.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zet next = it.next();
                        if (i == next.b) {
                            Integer num = byiVar.f16715a;
                            if (num != null) {
                                next.f32713a = num.intValue();
                            }
                        }
                    }
                }
            }
        }
    }

    public void e(zzp zzpVar, zet zetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecceeacb", new Object[]{this, zzpVar, zetVar});
        } else if (this.f21940a.containsKey(zzpVar)) {
            this.f21940a.get(zzpVar).remove(zetVar);
            if (this.f21940a.get(zzpVar).isEmpty()) {
                this.f21940a.remove(zzpVar);
            }
        }
    }

    public void a(List<zzp> list, zet zetVar) {
        onf onfVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31182468", new Object[]{this, list, zetVar});
            return;
        }
        for (zzp zzpVar : list) {
            if (!(zzpVar == null || (onfVar = zzpVar.e) == null || !onfVar.f25507a.contains("/messagesdkwrapper.so"))) {
                if (this.f21940a.get(zzpVar) == null) {
                    fs7.e("TaskSource", "-------addTask", "list is empty " + zzpVar.toString());
                } else {
                    fs7.e("TaskSource", "-------addTask", "exist old task is ongoing " + zzpVar.toString());
                }
            }
            List<zet> list2 = this.f21940a.get(zzpVar);
            if (list2 == null) {
                list2 = Collections.synchronizedList(new ArrayList());
                this.f21940a.put(zzpVar, list2);
            } else {
                fs7.g("TaskSource", "addTask", "exist old task is ongoing");
            }
            list2.add(zetVar);
        }
    }
}
