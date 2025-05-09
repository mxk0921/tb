package tb;

import android.text.TextUtils;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ts2 {
    public static ts2 b = new ts2();

    /* renamed from: a  reason: collision with root package name */
    public final yp7 f28925a = new yp7();

    static {
        t2o.a(693108767);
    }

    public static synchronized ts2 c() {
        ts2 ts2Var;
        synchronized (ts2.class) {
            try {
                if (b == null) {
                    b = new ts2();
                }
                ts2Var = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ts2Var;
    }

    public boolean a(String str, String str2) {
        ScheduleDTOModule f;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (f = this.f28925a.f(str, str2)) == null || TextUtils.isEmpty(f.getBizId()) || TextUtils.isEmpty(f.getOutId())) {
            return false;
        }
        return true;
    }

    public void b() {
        this.f28925a.b();
    }

    public List<ScheduleDTOModule> d() {
        return this.f28925a.g();
    }

    public boolean e() {
        return this.f28925a.h();
    }

    public void f(ScheduleDTOModule scheduleDTOModule) {
        if (scheduleDTOModule != null) {
            String bizId = scheduleDTOModule.getBizId();
            String outId = scheduleDTOModule.getOutId();
            if (!TextUtils.isEmpty(bizId) && !TextUtils.isEmpty(outId)) {
                yp7 yp7Var = this.f28925a;
                Map<String, ScheduleDTOModule> d = yp7Var.d();
                if (d != null) {
                    d.put(abi.a(bizId + outId), scheduleDTOModule);
                } else {
                    d = new HashMap<>();
                }
                yp7Var.k(yp7.CACHE_KEY, (Serializable) d);
            }
        }
    }

    public void g(List<ScheduleDTOModule> list) {
        if (!(list == null || list.isEmpty())) {
            for (ScheduleDTOModule scheduleDTOModule : list) {
                if (scheduleDTOModule != null && !TextUtils.isEmpty(scheduleDTOModule.getOutId()) && !TextUtils.isEmpty(scheduleDTOModule.getBizId())) {
                    this.f28925a.l(list);
                }
            }
        }
    }

    public void h(String str, String str2) {
        this.f28925a.i(str, str2);
    }

    public void i(boolean z) {
        this.f28925a.m(true);
    }
}
