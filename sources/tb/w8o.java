package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.resource.PackageInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class w8o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<PackageInfo, s8o> f30519a = new HashMap<>();

    static {
        t2o.a(843055398);
    }

    public final synchronized List<s8o> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d1eee8fd", new Object[]{this, str});
        }
        ckf.g(str, "id");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<PackageInfo, s8o> entry : this.f30519a.entrySet()) {
            if (ckf.b(entry.getKey().b(), str)) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public final synchronized void b(s8o s8oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3f8394", new Object[]{this, s8oVar});
            return;
        }
        ckf.g(s8oVar, "resourcePackage");
        this.f30519a.put(s8oVar.a(), s8oVar);
    }
}
