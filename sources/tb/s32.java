package tb;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.tao.MytaobaoApplication;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s32 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MEASURE_LOAD_WEB = "loadPathMonitor";
    public static final String MODULE_NAME = "Page_Basement";
    public static final String POINT_LOAD_WEB = "TaoFriendPageLoadWebTime";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Boolean> f27773a;
    public long b;
    public long c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27774a;

        public a(String str) {
            this.f27774a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (Object) this.f27774a);
            s32.this.g("deprecatedCode", jSONObject, 1.0d, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final s32 f27775a = new s32(null);

        static {
            t2o.a(745537610);
        }

        public static /* synthetic */ s32 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s32) ipChange.ipc$dispatch("58a78b15", new Object[0]);
            }
            return f27775a;
        }
    }

    static {
        t2o.a(745537608);
    }

    public /* synthetic */ s32(a aVar) {
        this();
    }

    public static s32 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s32) ipChange.ipc$dispatch("4387b8fb", new Object[0]);
        }
        return b.a();
    }

    @Deprecated
    public synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4824feb", new Object[]{this, str, str2});
        } else if (!MtbGlobalEnv.p()) {
            String str3 = str + str2;
            if (!((HashMap) this.f27773a).containsKey(str3)) {
                ((HashMap) this.f27773a).put(str3, Boolean.TRUE);
                f3j.c(MODULE_NAME, str, str2);
            }
        }
    }

    @Deprecated
    public synchronized void b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc40b57", new Object[]{this, str, str2, new Boolean(z)});
        } else if (!MtbGlobalEnv.p()) {
            String str3 = str + str2;
            if (Boolean.TRUE == ((HashMap) this.f27773a).get(str3)) {
                if (z) {
                    ((HashMap) this.f27773a).put(str3, Boolean.FALSE);
                    f3j.d(MODULE_NAME, str, str2);
                } else {
                    ((HashMap) this.f27773a).remove(str3);
                    f3j.d(MODULE_NAME, str, str2);
                }
            }
        }
    }

    public void f(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ed81c3", new Object[]{this, str, new Double(d)});
        } else if (!MtbGlobalEnv.p()) {
            g(str, null, d, false);
        }
    }

    public void g(String str, JSONObject jSONObject, double d, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218198b", new Object[]{this, str, jSONObject, new Double(d), new Boolean(z)});
        } else if (!MtbGlobalEnv.p()) {
            if (jSONObject == null || jSONObject.isEmpty()) {
                str2 = null;
            } else {
                str2 = jSONObject.toJSONString();
            }
            h(str, str2, d, z);
        }
    }

    @Deprecated
    public void h(String str, String str2, double d, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4560cc6e", new Object[]{this, str, str2, new Double(d), new Boolean(z)});
        } else if (!MtbGlobalEnv.p()) {
            if (!z) {
                f3j.a(MODULE_NAME, str, str2, d);
                return;
            }
            synchronized (this) {
                try {
                    if (!((HashMap) this.f27773a).containsKey(str)) {
                        ((HashMap) this.f27773a).put(str, Boolean.TRUE);
                        f3j.a(MODULE_NAME, str, str2, d);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d861e7b6", new Object[]{this, str});
        } else if (!MtbGlobalEnv.p()) {
            Coordinator.execute(new a(str));
        }
    }

    public void j(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768a6687", new Object[]{this, str, str2, str3});
        } else if (!MtbGlobalEnv.p()) {
            f3j.b(MODULE_NAME, str, null, str2, str3);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9ca70f", new Object[]{this, str});
        } else if (!MtbGlobalEnv.p()) {
            f3j.e(MODULE_NAME, str, null);
        }
    }

    public s32() {
        this.f27773a = new HashMap();
        if (!MtbGlobalEnv.p()) {
            AppMonitor.register(MODULE_NAME, "TaoFriendPageLoadTime", MeasureSet.create(new String[]{"fullPathMonitor"}));
            AppMonitor.register(MODULE_NAME, POINT_LOAD_WEB, MeasureSet.create(new String[]{MEASURE_LOAD_WEB}));
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8375", new Object[]{this});
        } else if (!MtbGlobalEnv.p()) {
            g("renderSuccess", null, 1.0d, true);
            b("TaoFriendPageLoadTime", "fullPathMonitor", true);
            b(POINT_LOAD_WEB, MEASURE_LOAD_WEB, true);
            h("coldLaunchTime", "app_mtb_TimeSeconds=" + this.b, System.currentTimeMillis() - this.c, true);
        }
    }

    public void d(Bundle bundle) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252621f8", new Object[]{this, bundle});
            return;
        }
        StringBuilder sb = new StringBuilder("我淘页面创建, 死亡恢复:");
        if (bundle == null) {
            z = false;
        }
        sb.append(z);
        z6t.W(sb.toString());
        if (!MtbGlobalEnv.p()) {
            this.b = (System.currentTimeMillis() - c21.g().getLong("startProcessSystemTime", MytaobaoApplication.onCreateTimeMillis)) / 1000;
            this.c = System.currentTimeMillis();
            a("TaoFriendPageLoadTime", "fullPathMonitor");
            g("enterMyTaobao", null, 1.0d, true);
        }
    }
}
