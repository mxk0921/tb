package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.c;
import com.android.taobao.safeclean.d;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class mal {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<pq6>> f23890a = new HashMap();

    static {
        t2o.a(654311451);
        t2o.a(654311441);
    }

    public mal() {
        try {
            c("clean", d.i());
            c(rf2.KEY_ADDITION, c.c());
            OrangeConfig.getInstance().registerListener(new String[]{"safe_clean_android"}, new obk() { // from class: tb.kal
                @Override // tb.obk
                public final void onConfigUpdate(String str, Map map) {
                    mal.this.e(str, map);
                }
            }, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void c(String str, pq6 pq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14bb11b7", new Object[]{this, str, pq6Var});
            return;
        }
        synchronized (this.f23890a) {
            try {
                if (this.f23890a.containsKey(str)) {
                    this.f23890a.get(str).add(pq6Var);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pq6Var);
                    this.f23890a.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b678131f", new Object[]{this, str, str2, str3});
            return;
        }
        Iterator it = new ArrayList((Collection) ((HashMap) this.f23890a).get(str)).iterator();
        while (it.hasNext()) {
            Log.e("OrangeSource", "dispatch orange config data:" + str3);
            ((pq6) it.next()).a("orange", str2, str3);
        }
    }

    public final /* synthetic */ void e(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23613b25", new Object[]{this, str, map});
        } else if (str.equalsIgnoreCase("safe_clean_android")) {
            boolean booleanValue = Boolean.valueOf(OrangeConfig.getInstance().getConfig("safe_clean_android", "safe_clean_enabled", "true")).booleanValue();
            Log.e("OrangeSource", "receive clean mode orange config switch:" + booleanValue);
            if (!booleanValue) {
                o7h.b().k(Boolean.FALSE);
                return;
            }
            o7h.b().k(Boolean.TRUE);
            g("clean", map);
            g(rf2.KEY_ADDITION, map);
        }
    }

    public final /* synthetic */ void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77efc59", new Object[]{this, str, str2, str3});
        } else {
            d(str, str2, str3);
        }
    }

    public final void g(final String str, Map<String, String> map) {
        final String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d148b50", new Object[]{this, str, map});
            return;
        }
        if (str.equals("clean")) {
            str2 = OrangeConfig.getInstance().getConfig("safe_clean_android", "clean_model", "");
        } else {
            str2 = OrangeConfig.getInstance().getConfig("safe_clean_android", "addition_model", "");
        }
        Log.e("OrangeSource", "receive mode orange config data:" + str2);
        if (!TextUtils.isEmpty(str2) && !"{}".equals(str2)) {
            final String str3 = map.get("configVersion");
            if (TextUtils.isEmpty(str3) || !str3.equalsIgnoreCase(o7h.b().f())) {
                ist.b(new Runnable() { // from class: tb.lal
                    @Override // java.lang.Runnable
                    public final void run() {
                        mal.this.f(str, str3, str2);
                    }
                });
            }
        }
    }
}
