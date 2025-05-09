package tb;

import android.text.TextUtils;
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

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qdu extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<ggc> j;
    public nh3 k;
    public final JSONObject l = Util.d();

    static {
        t2o.a(350224417);
    }

    public static /* synthetic */ Object ipc$super(qdu qduVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/adam/ultronExt/TransToEventChainSubscriber");
    }

    public final List<ggc> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b00aa518", new Object[]{this});
        }
        if (this.j == null) {
            ArrayList arrayList = new ArrayList();
            this.j = arrayList;
            arrayList.add(new b9v());
        }
        return this.j;
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
        } else if (b8vVar != null) {
            String h = b8vVar.h();
            if (!TextUtils.isEmpty(h) && !TextUtils.isEmpty(h.trim())) {
                HashMap hashMap = new HashMap();
                Object i = b8vVar.i("extraParams");
                hashMap.put("originArgs", i);
                hashMap.put("global_adam_config", this.l);
                JSONObject jSONObject = new JSONObject();
                Util.b(i, jSONObject);
                hashMap.put("event_adam_config", jSONObject);
                if (this.k == null) {
                    this.k = new nh3();
                }
                jh3 jh3Var = new jh3();
                jh3Var.d(hashMap);
                try {
                    DXEvent dXEvent = (DXEvent) b8vVar.i(f8v.KEY_DXEVENT);
                    HashMap hashMap2 = (HashMap) b8vVar.i("bizParams");
                    DXRuntimeContext dXRuntimeContext = hashMap2 == null ? null : (DXRuntimeContext) hashMap2.get(sj8.PARSER_KEY_DX_RUNTIMECONTEXT);
                    jh3Var.c(dXRuntimeContext);
                    HashMap<String, String> c = Util.c("ultron", h, dXRuntimeContext);
                    hashMap.put("utParams", c);
                    this.k.a(x(), dXEvent, new Object[]{h, sj8.i(b8vVar)}, jh3Var);
                    Util.m("exposure_transUtrToEvChain", c);
                } catch (Throwable th) {
                    AppMonitor.Counter.commit("ADAM_MONITOR", "HandleEvent-ERROR", "msg = " + th.toString(), 1.0d);
                    TLog.logi(null, "LOG_ADAM", "execute evChain from ultron error: " + th.getMessage());
                }
            }
        }
    }
}
