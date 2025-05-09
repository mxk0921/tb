package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class deg extends l10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HANDLEDINAMICXEVENT = 1544903441687469454L;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, b20> f17758a = new HashMap();

    static {
        t2o.a(295699228);
    }

    public deg() {
        d();
    }

    public static /* synthetic */ Object ipc$super(deg degVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultronnew/events/LVDinamicXEventDispatcher");
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5fe58e2", new Object[]{this});
            return;
        }
        ((HashMap) this.f17758a).put("tlToast", new dfg());
        ((HashMap) this.f17758a).put("tlOpenUrl", new reg());
        ((HashMap) this.f17758a).put("tlMtop", new meg());
        ((HashMap) this.f17758a).put("tlTrack", new hfg());
    }

    @Override // tb.l10
    public void c(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, xea xeaVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86174a8b", new Object[]{this, dXEvent, objArr, dXRuntimeContext, xeaVar});
            return;
        }
        fl6 S = dXRuntimeContext.S();
        if (!(S instanceof beg) || objArr == null || objArr.length == 0) {
            hha.b("LVDinamicXEventDispatcher", "handleEvent | context error.");
            return;
        }
        JSONObject i = dXRuntimeContext.i();
        String str = (String) objArr[0];
        if (TextUtils.isEmpty(str) || i == null) {
            hha.b("LVDinamicXEventDispatcher", "handleEvent | eventCode null.");
            return;
        }
        peg g = ((beg) S).g();
        if (g == null || (jSONObject = g.g) == null) {
            hha.b("LVDinamicXEventDispatcher", "handleEvent | node null.");
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray == null || jSONArray.isEmpty()) {
            hha.b("LVDinamicXEventDispatcher", "handleEvent | no responseEvents.");
            return;
        }
        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            if (jSONObject2 != null) {
                String string = jSONObject2.getString("type");
                if (!TextUtils.isEmpty(string)) {
                    b20 b20Var = (b20) ((HashMap) this.f17758a).get(string);
                    if (b20Var != null) {
                        b20Var.a(dXRuntimeContext.h(), d8v.a(jSONObject2.getJSONObject("fields"), i, dXRuntimeContext), i);
                    }
                    hha.b("LVDinamicXEventDispatcher", "handleEvent | execute event " + string + "  subscriber=" + b20Var);
                } else {
                    return;
                }
            }
        }
    }
}
