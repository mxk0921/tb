package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ift {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static List<zzp> a(List<zzp> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ae7b1953", new Object[]{list});
        }
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (zzp zzpVar : list) {
            if (!xh4.r) {
                if (zzpVar.h) {
                    z = true;
                }
                if (arrayList.size() < 5) {
                    arrayList.add(zzpVar);
                } else if (zzpVar.h) {
                    arrayList.remove(arrayList.size() - 1);
                    arrayList.add(0, zzpVar);
                }
                if (z && arrayList.size() == 5) {
                    break;
                }
            } else if (zzpVar.i) {
                arrayList.add(zzpVar);
            } else if (i < 3) {
                arrayList.add(zzpVar);
                i++;
            }
        }
        if (!xh4.r) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((zzp) it.next()).i) {
                        break;
                    }
                } else if (arrayList.size() > 4) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }
}
