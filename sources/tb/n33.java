package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.e0d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class n33 implements e0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wuj f24480a;

    static {
        t2o.a(834666528);
        t2o.a(839909566);
    }

    public n33(String str, String str2, String str3, String str4) {
        ckf.g(str, "url");
        ckf.g(str2, "sessionId");
        ckf.g(str3, "frameId");
        ckf.g(str4, "loaderId");
        wuj wujVar = new wuj(str2);
        wuj.i(str2, str4, str, str3);
        this.f24480a = wujVar;
    }

    @Override // tb.e0d
    public void a(e0d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f72ad1d", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "request");
        if (aVar.d() != null) {
            wuj wujVar = this.f24480a;
            String d = aVar.d();
            ckf.d(d);
            euj eujVar = new euj(d);
            eujVar.b = aVar.b();
            eujVar.d = aVar.c();
            Map<String, String> a2 = aVar.a();
            if (a2 != null) {
                eujVar.c = a2;
            }
            wujVar.f(eujVar);
        }
    }

    @Override // tb.e0d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591cf755", new Object[]{this});
        } else {
            this.f24480a.c();
        }
    }

    @Override // tb.e0d
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98da566a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "errorMsg");
        this.f24480a.b(str);
    }

    @Override // tb.e0d
    public void d(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("468c3af9", new Object[]{this, bArr});
            return;
        }
        ckf.g(bArr, "data");
        this.f24480a.a(bArr);
    }

    @Override // tb.e0d
    public void e(String str, int i, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27647f93", new Object[]{this, str, new Integer(i), new Boolean(z), map});
            return;
        }
        ckf.g(str, "url");
        wuj wujVar = this.f24480a;
        kuj kujVar = new kuj(str);
        kujVar.b = i;
        kujVar.d = z;
        kujVar.c = map;
        wujVar.g(kujVar);
    }

    @Override // tb.e0d
    public void f(String str, int i, boolean z, Map<String, ? extends List<String>> map) {
        LinkedHashMap linkedHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1193541", new Object[]{this, str, new Integer(i), new Boolean(z), map});
            return;
        }
        ckf.g(str, "url");
        wuj wujVar = this.f24480a;
        kuj kujVar = new kuj(str);
        kujVar.b = i;
        kujVar.d = z;
        if (map == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap(v3i.e(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        kujVar.c = linkedHashMap;
        wujVar.g(kujVar);
    }
}
