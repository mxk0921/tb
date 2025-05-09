package tb;

import android.text.TextUtils;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yp7 {
    public static final String CACHE_KEY = "CalendarList";
    public static final String CACHE_MODULE = "Calendar";
    public static final String CACHE_SYNC_FLAG = "CalendarSyncFlag";
    public static fdb d;
    public static final String e = yp7.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public Map<String, ScheduleDTOModule> f32257a;
    public final fdb.i b = new a(this);
    public final fdb.g c = new b(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements fdb.g {
        public b(yp7 yp7Var) {
        }

        @Override // tb.fdb.g
        public void onObjectRemoveCallback(String str, boolean z) {
            String str2 = yp7.e;
            TLog.logd(str2, "onObjectRemoveCallback, key=" + str + ", success=" + z);
        }
    }

    static {
        t2o.a(693108768);
    }

    public static fdb c() {
        fdb fdbVar = d;
        if (fdbVar != null) {
            return fdbVar;
        }
        fdb w = AVFSCacheManager.getInstance().cacheForModule(CACHE_MODULE).Z(yp7.class.getClassLoader()).L(new op()).w();
        d = w;
        return w;
    }

    public void b() {
        j(CACHE_KEY);
        j(CACHE_SYNC_FLAG);
    }

    public Map<String, ScheduleDTOModule> d() {
        Object e2;
        Map<String, ScheduleDTOModule> map = this.f32257a;
        if ((map == null || map.isEmpty()) && (e2 = e(CACHE_KEY)) != null && (e2 instanceof Map)) {
            this.f32257a = (Map) e2;
        }
        if (this.f32257a == null) {
            this.f32257a = new HashMap();
        }
        return this.f32257a;
    }

    public Object e(String str) {
        if (!Login.checkSessionValid()) {
            return null;
        }
        try {
            fdb c = c();
            return c.d0(str + Login.getUserId());
        } catch (Exception unused) {
            return null;
        }
    }

    public ScheduleDTOModule f(String str, String str2) {
        if (this.f32257a == null) {
            d();
        }
        Map<String, ScheduleDTOModule> map = this.f32257a;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Map<String, ScheduleDTOModule> map2 = this.f32257a;
        return map2.get(abi.a(str + str2));
    }

    public List<ScheduleDTOModule> g() {
        ArrayList arrayList = new ArrayList();
        if (this.f32257a == null) {
            d();
        }
        Map<String, ScheduleDTOModule> map = this.f32257a;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, ScheduleDTOModule> entry : this.f32257a.entrySet()) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public boolean h() {
        if (e(CACHE_SYNC_FLAG) != null) {
            return true;
        }
        return false;
    }

    public void i(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map<String, ScheduleDTOModule> map = this.f32257a;
            map.remove(abi.a(str + str2));
            k(CACHE_KEY, (Serializable) this.f32257a);
        }
    }

    public boolean j(String str) {
        if (!Login.checkSessionValid()) {
            return false;
        }
        try {
            fdb c = c();
            c.D(str + Login.getUserId(), this.c);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean k(String str, Serializable serializable) {
        if (serializable != null && Login.checkSessionValid()) {
            try {
                fdb c = c();
                c.m0(str + Login.getUserId(), serializable, this.b);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void l(List<ScheduleDTOModule> list) {
        if (this.f32257a == null) {
            d();
        }
        if (!(list == null || list.isEmpty())) {
            for (ScheduleDTOModule scheduleDTOModule : list) {
                if (scheduleDTOModule != null && !TextUtils.isEmpty(scheduleDTOModule.getOutId()) && !TextUtils.isEmpty(scheduleDTOModule.getBizId())) {
                    Map<String, ScheduleDTOModule> map = this.f32257a;
                    map.put(abi.a(scheduleDTOModule.getBizId() + scheduleDTOModule.getBizId()), scheduleDTOModule);
                }
            }
            k(CACHE_KEY, (Serializable) this.f32257a);
        }
    }

    public void m(boolean z) {
        k(CACHE_SYNC_FLAG, Boolean.valueOf(z));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements fdb.i {
        public a(yp7 yp7Var) {
        }

        @Override // tb.fdb.i
        public void onObjectSetCallback(String str, boolean z) {
        }
    }
}
