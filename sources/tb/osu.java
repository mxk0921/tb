package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class osu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Collection<IPopData> a(Collection<IPopData> collection) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("e09fe493", new Object[]{collection});
        }
        if (collection != null) {
            i = collection.size();
        }
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IPopData iPopData : collection) {
            if (c(iPopData)) {
                arrayList.add(iPopData);
            }
        }
        return arrayList;
    }

    public static esu b(e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (esu) ipChange.ipc$dispatch("713f7b3e", new Object[]{e3bVar});
        }
        if (e3bVar != null) {
            return e3bVar.g().f();
        }
        return null;
    }

    public static boolean c(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a39b505", new Object[]{iPopData})).booleanValue();
        }
        if (iPopData == null || iPopData.getUCPConfig() == null || !iPopData.getUCPConfig().enable() || !h3b.g()) {
            return false;
        }
        return true;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5af80c6", new Object[0])).booleanValue();
        }
        return mve.a("newHomePopUcpEnable", true);
    }

    public static void e(esu esuVar, String str, int i, String str2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741f4512", new Object[]{esuVar, str, new Integer(i), str2});
            return;
        }
        if (esuVar == null) {
            z = false;
        }
        vhm.g(str, str2, z, "");
        if (esuVar != null) {
            esuVar.e(str, i, str2);
        }
    }

    public static long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94748d3", new Object[0])).longValue();
        }
        return mve.c("newUcpPopTimeoutMs", 3000);
    }
}
