package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class cak {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFY_ID = "notifyId";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, d.i> f16940a = new HashMap<>();

    static {
        t2o.a(503317343);
    }

    public static boolean c(d.j jVar, d.j jVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3471004c", new Object[]{jVar, jVar2})).booleanValue();
        }
        if (jVar == jVar2) {
            return true;
        }
        String a2 = jVar.a("notifyId", "");
        String a3 = jVar2.a("notifyId", "");
        if (TextUtils.isEmpty(a2) || !TextUtils.equals(a2, a3)) {
            return false;
        }
        return true;
    }

    public void a(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("622b0ffe", new Object[]{this, str, map});
            return;
        }
        d.i iVar = this.f16940a.get(str);
        if (iVar != null) {
            d.j jVar = iVar.f11975a;
            jVar.c.a(jVar, map);
        }
    }

    public final Set<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("898d25f3", new Object[]{this});
        }
        return this.f16940a.keySet();
    }

    public void d(String str, d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c565d63f", new Object[]{this, str, jVar});
        } else {
            this.f16940a.put(jVar.a("notifyId", String.valueOf(System.currentTimeMillis())), new d.i(jVar));
        }
    }

    public void e(String str, d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e819306", new Object[]{this, str, jVar});
            return;
        }
        Set<Map.Entry<String, d.i>> entrySet = this.f16940a.entrySet();
        if (entrySet != null) {
            Iterator<Map.Entry<String, d.i>> it = entrySet.iterator();
            while (it.hasNext()) {
                if (c(it.next().getValue().f11975a, jVar)) {
                    it.remove();
                }
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2b4dcc", new Object[]{this});
        } else {
            this.f16940a.clear();
        }
    }
}
