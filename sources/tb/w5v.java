package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.android.upp.d;
import com.taobao.android.upp.f;
import com.taobao.tao.log.TLog;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w5v extends ir1<Map<String, Object>, Map<String, Object>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR = "error";
    public static final String NAME = "UCP";
    public static final String TAG = "UCP";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, f> f30476a = new ConcurrentHashMap(10);
    public final Map<String, List<f>> b = new ConcurrentHashMap(10);
    public final Map<String, List<f>> c = new ConcurrentHashMap(10);
    public final Map<String, SoftReference<d.c>> d = new HashMap(5);
    public final Map<String, SoftReference<d.b>> e = new HashMap(5);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final w5v f30477a = new w5v();

        static {
            t2o.a(404750706);
        }

        public static /* synthetic */ w5v a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w5v) ipChange.ipc$dispatch("12963582", new Object[0]);
            }
            return f30477a;
        }
    }

    static {
        t2o.a(404750705);
        t2o.a(404750397);
    }

    public static /* synthetic */ Object ipc$super(w5v w5vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/UcpSolution");
    }

    public static w5v p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w5v) ipChange.ipc$dispatch("132e3898", new Object[0]);
        }
        return a.a();
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ddd22b82", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5bbce6f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3806261b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.ir1
    public Map<String, String> j(kq4 kq4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("27cc6433", new Object[]{this, kq4Var});
        }
        return null;
    }

    @Override // tb.ir1
    public boolean l(kq4 kq4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7406ca9", new Object[]{this, kq4Var})).booleanValue();
        }
        return false;
    }

    @Override // tb.ir1
    public void m(kq4 kq4Var, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8efbc90", new Object[]{this, kq4Var, runnable});
        }
    }

    public void n(String str, Object obj, d.b bVar, d.c cVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cbb61d", new Object[]{this, str, obj, bVar, cVar});
            return;
        }
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = String.valueOf(obj.hashCode());
        }
        if (cVar != null) {
            SoftReference softReference = new SoftReference(cVar);
            Map<String, SoftReference<d.c>> map = this.d;
            ((HashMap) map).put(str2 + str, softReference);
        }
        if (bVar != null) {
            SoftReference softReference2 = new SoftReference(bVar);
            Map<String, SoftReference<d.b>> map2 = this.e;
            ((HashMap) map2).put(str2 + str, softReference2);
        }
    }

    /* renamed from: o */
    public Map<String, Object> c(kq4 kq4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("29ee0fc3", new Object[]{this, kq4Var});
        }
        return null;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6790ea1", new Object[]{this})).booleanValue();
        }
        return eyu.b();
    }

    /* renamed from: r */
    public void k(kq4 kq4Var, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d935f5", new Object[]{this, kq4Var, map});
        }
    }

    public String s(String str, Activity activity, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81ea127d", new Object[]{this, str, activity, str2});
        }
        return t(str, activity, str2, null, null, null);
    }

    public void u(String str, Object obj) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc67e416", new Object[]{this, str, obj});
            return;
        }
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = String.valueOf(obj.hashCode());
        }
        Map<String, SoftReference<d.c>> map = this.d;
        ((HashMap) map).remove(str2 + str);
        Map<String, SoftReference<d.b>> map2 = this.e;
        ((HashMap) map2).remove(str2 + str);
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa92e800", new Object[]{this, str});
            return;
        }
        try {
            synchronized (this) {
                if (!q()) {
                    LogUtils.e("UCP", "unregisterResourceSpace", "upp is closed.");
                    return;
                }
                f fVar = (f) ((ConcurrentHashMap) this.f30476a).remove(str);
                if (fVar != null) {
                    List list = (List) ((ConcurrentHashMap) this.b).get(fVar.b());
                    if (list != null && !list.isEmpty()) {
                        list.remove(fVar);
                    }
                    List list2 = (List) ((ConcurrentHashMap) this.c).get(fVar.a());
                    if (list2 != null && !list2.isEmpty()) {
                        list2.remove(fVar);
                    }
                    LogUtils.e("UCP", "unregisterResourceSpace", fVar);
                }
            }
        } catch (Throwable th) {
            TLog.loge("UCP", "unregisterResourceSpace", th);
        }
    }

    public String t(String str, Object obj, String str2, JSONObject jSONObject, d.b bVar, com.taobao.android.upp.a aVar) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66c9471", new Object[]{this, str, obj, str2, jSONObject, bVar, aVar});
        }
        try {
            synchronized (this) {
                if (!q()) {
                    LogUtils.f("UCP", "registerResourceSpace", "upp is closed.");
                    return "";
                }
                if (obj != null) {
                    str3 = obj.hashCode() + str;
                } else {
                    str3 = "kUCPCommonInstanceId";
                }
                f fVar = new f(str2, jSONObject, str3, bVar, aVar);
                ((ConcurrentHashMap) this.f30476a).put(fVar.c(), fVar);
                List list = (List) ((ConcurrentHashMap) this.b).get(str2);
                if (list == null) {
                    list = new ArrayList(10);
                    ((ConcurrentHashMap) this.b).put(str2, list);
                }
                list.add(fVar);
                List list2 = (List) ((ConcurrentHashMap) this.c).get(fVar.a());
                if (list2 == null) {
                    list2 = new ArrayList(10);
                    ((ConcurrentHashMap) this.c).put(fVar.a(), list2);
                }
                list2.add(fVar);
                LogUtils.e("UCP", "registerResourceSpace", fVar);
                bnv.b("UCP", "register", str, str2, str3, jSONObject);
                UtUtils.d("UCP", UtUtils.g(), "Register", str, str2, com.taobao.android.behavir.util.a.c("instanceId", fVar.a(), "params", jSONObject));
                return fVar.c();
            }
        } catch (Throwable th) {
            TLog.loge("UCP", "registerResourceSpace", th);
            return "";
        }
    }
}
