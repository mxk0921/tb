package tb;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class huw implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements pvh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f20910a;

        public a(huw huwVar, vq vqVar) {
            this.f20910a = vqVar;
        }

        @Override // tb.pvh
        public void b(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a9647d2", new Object[]{this, objArr});
            }
        }

        @Override // tb.pvh
        public void release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            }
        }

        @Override // tb.pvh
        public void a(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9cf6c61", new Object[]{this, objArr});
                return;
            }
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof HashMap) {
                    this.f20910a.d(new ExecutingResult((HashMap) obj, "result"));
                    return;
                }
            }
            this.f20910a.d(new ExecutingResult());
        }
    }

    static {
        t2o.a(980418621);
        t2o.a(144703491);
    }

    public final ExecuteResult a(kdb kdbVar, Map<String, ?> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("38bbff3d", new Object[]{this, kdbVar, map, vqVar});
        }
        String str = (String) map.get("eventName");
        a aVar = new a(this, vqVar);
        if (kdbVar == null) {
            c("404", "context = null", vqVar);
            return null;
        }
        Map<String, Object> f = kdbVar.f();
        if (f == null) {
            c("404", "userDataMap = null", vqVar);
            return null;
        }
        com.taobao.android.weex_framework.a aVar2 = (com.taobao.android.weex_framework.a) f.get("instance");
        if (aVar2 != null) {
            aVar2.addEventListener(str, aVar);
            vqVar.c(new FinishResult(new JSONObject(), "result"));
        }
        return null;
    }

    public final ExecuteResult b(kdb kdbVar, Map<String, ?> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a5b40320", new Object[]{this, kdbVar, map, vqVar});
        }
        String str = (String) map.get("eventName");
        if (kdbVar == null) {
            c("404", "context = null", vqVar);
            return null;
        }
        Map<String, Object> f = kdbVar.f();
        if (f == null) {
            c("404", "userDataMap = null", vqVar);
            return null;
        }
        com.taobao.android.weex_framework.a aVar = (com.taobao.android.weex_framework.a) f.get("instance");
        if (aVar != null) {
            aVar.removeEventListener(str);
            vqVar.c(new FinishResult(new JSONObject(), "result"));
        }
        return null;
    }

    public final void c(String str, String str2, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d53ea0", new Object[]{this, str, str2, vqVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", (Object) str);
        jSONObject.put("errorMessage", (Object) str2);
        vqVar.b(new ErrorResult("500", "", jSONObject));
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ?> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        str.hashCode();
        if (str.equals("addEventListener")) {
            return a(kdbVar, map, vqVar);
        }
        if (!str.equals("removeEventListener")) {
            return new ErrorResult("404", "error", (Map<String, ? extends Object>) null);
        }
        return b(kdbVar, map, vqVar);
    }
}
