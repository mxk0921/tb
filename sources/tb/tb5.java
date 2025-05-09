package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tb5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_EVENT_ADAMEVENTHANDLER = -6706146806808532893L;

    /* renamed from: a  reason: collision with root package name */
    public nh3 f28610a;
    public final JSONObject b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(350224409);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(350224408);
    }

    public tb5(JSONObject jSONObject) {
        ckf.h(jSONObject, "defaultConfig");
        this.b = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(tb5 tb5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/adam/dx/DXAdamEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
            return;
        }
        ckf.h(objArr, "args");
        ckf.h(dXRuntimeContext, "runtimeContext");
        super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb5() {
        /*
            r2 = this;
            com.alibaba.fastjson.JSONObject r0 = com.taobao.android.adam.common.Util.d()
            java.lang.String r1 = "Util.getDefaultAdamConfig()"
            tb.ckf.c(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tb5.<init>():void");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        nh3 nh3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null) {
            String str = null;
            JSONObject jSONObject = null;
            JSONObject jSONObject2 = null;
            int i = 0;
            for (Object obj : objArr) {
                i++;
                if (i == 0) {
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    str = (String) obj;
                } else if (i != 1) {
                    if (!(obj instanceof JSONObject)) {
                        obj = null;
                    }
                    JSONObject jSONObject3 = (JSONObject) obj;
                    Object obj2 = jSONObject3 != null ? jSONObject3.get("parserAdamConfigPrefix") : null;
                    if (!(obj2 instanceof JSONObject)) {
                        obj2 = null;
                    }
                    jSONObject = (JSONObject) obj2;
                } else {
                    if (!(obj instanceof JSONObject)) {
                        obj = null;
                    }
                    jSONObject2 = (JSONObject) obj;
                    Object obj3 = jSONObject2 != null ? jSONObject2.get("parserAdamConfigPrefix") : null;
                    if (!(obj3 instanceof JSONObject)) {
                        obj3 = null;
                    }
                    jSONObject = (JSONObject) obj3;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (this.f28610a == null) {
                    this.f28610a = new nh3();
                }
                jh3 jh3Var = new jh3();
                jh3Var.c(dXRuntimeContext);
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("event_adam_config", a(jSONObject, hashMap));
                hashMap.put("global_adam_config", this.b);
                hashMap.put("utParams", Util.c("adamEventHandler", str, dXRuntimeContext));
                jh3Var.d(hashMap);
                try {
                    nh3Var = this.f28610a;
                } catch (Throwable th) {
                    AppMonitor.Counter.commit("ADAM_MONITOR", "AdamEvHandler-ERROR", "msg = " + th.toString(), 1.0d);
                    TLog.logi(null, "LOG_ADAM", "execute evChain from adamEventHandler error: " + th.getMessage());
                }
                if (nh3Var != null) {
                    nh3Var.b(null, dXEvent, new Object[]{str, jSONObject2}, jh3Var);
                    Util.m("exposure_dxAdamEventHandler", null);
                    return;
                }
                ckf.s();
                throw null;
            }
        }
    }

    public final JSONObject a(JSONObject jSONObject, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("215917f0", new Object[]{this, jSONObject, hashMap});
        }
        ckf.h(hashMap, "userCtx");
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            if (ckf.b(key, "showloading")) {
                jSONObject2.put((JSONObject) "showLoading", (String) Boolean.valueOf(ckf.b("true", entry.getValue())));
            } else if (ckf.b(key, "rendertype")) {
                jSONObject2.put((JSONObject) "renderType", (String) entry.getValue());
            } else if (ckf.b(key, "readCurTemplate")) {
                jSONObject2.put((JSONObject) "readCurTemplate", (String) entry.getValue());
            } else if (ckf.b(key, yg.CACHE_KEY_TEMPLATE_INFO)) {
                Object value = entry.getValue();
                if (!(value instanceof JSONArray)) {
                    value = null;
                }
                JSONArray<Object> jSONArray = (JSONArray) value;
                if (jSONArray != null) {
                    for (Object obj : jSONArray) {
                        List z0 = wsq.z0(obj.toString(), new String[]{","}, false, 0, 6, null);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put((JSONObject) "url", z0.size() > 0 ? (String) z0.get(0) : null);
                        jSONObject3.put((JSONObject) "name", z0.size() > 1 ? (String) z0.get(1) : null);
                        jSONObject3.put((JSONObject) "version", z0.size() > 2 ? (String) z0.get(2) : null);
                        arrayList.add(jSONObject3);
                    }
                }
            }
        }
        hashMap.put("templates", arrayList);
        return jSONObject2;
    }
}
