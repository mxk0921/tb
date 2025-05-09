package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.b;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.android.ucp.algo.NativeAlgo;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p6n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends b.a implements ke4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AtomicBoolean b = new AtomicBoolean(false);
        private final ke4 c;
        private final String d;
        private final Map<String, Object> e;

        static {
            t2o.a(404750350);
            t2o.a(404750639);
        }

        public a(ke4 ke4Var, String str, Map<String, Object> map) {
            this.c = ke4Var;
            this.d = str;
            this.e = map;
        }

        private void f(String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject});
                return;
            }
            p6n.a(jSONObject, false);
            this.c.a(str, str2, str3, jSONObject);
            LogUtils.e("PythonExecutor", this.d, "error", str2, str3);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/PythonExecutor$OnceComputerCallback");
        }

        @Override // tb.ke4
        public void a(String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f84e7f62", new Object[]{this, str, str2, str3, jSONObject});
            } else if (!this.b.getAndSet(true)) {
                f(str, str2, str3, jSONObject);
            }
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (!this.b.getAndSet(true)) {
                f(this.d, "timeout", "timeout", com.taobao.android.behavir.util.a.d("code", 1001, "error", com.taobao.android.behavir.util.a.b("code", 1001), "model", com.taobao.android.behavir.util.a.c("input", this.e, "name", this.d)));
            }
        }

        @Override // tb.ke4
        public void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c939cdb", new Object[]{this, str, jSONObject});
            } else if (!this.b.getAndSet(true)) {
                p6n.a(jSONObject, true);
                this.c.b(str, jSONObject);
                LogUtils.e("PythonExecutor", this.d, "success");
            }
        }
    }

    static {
        t2o.a(404750349);
    }

    public static /* synthetic */ void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{jSONObject, new Boolean(z)});
        } else {
            b(jSONObject, z);
        }
    }

    public static void b(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137a1f8d", new Object[]{jSONObject, new Boolean(z)});
        } else if (jSONObject != null) {
            jSONObject.put("success", (Object) Boolean.valueOf(z));
        }
    }

    public static void c(String str, Map<String, Object> map, boolean z, ke4 ke4Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf44435a", new Object[]{str, map, new Boolean(z), ke4Var, new Integer(i)});
            return;
        }
        a aVar = new a(ke4Var, str, map);
        if (i > 0) {
            xzh.a().postDelayed(aVar, i);
        }
        if (NativeAlgo.isEnableNativeAlgo(str)) {
            NativeAlgo.run(str, map, aVar);
        } else if (z) {
            me4.c("BehaviR", str, map, aVar);
        } else {
            me4.b("BehaviR", str, map, aVar);
        }
    }
}
