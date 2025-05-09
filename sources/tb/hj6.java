package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hj6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TRACKCLICK = -1826592666711771899L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends TypeReference<HashMap<String, String>> {
        public a(hj6 hj6Var) {
        }
    }

    static {
        t2o.a(729809033);
    }

    public static /* synthetic */ Object ipc$super(hj6 hj6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/eventhandler/ut/DXTrackClickEventHandler");
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b521660", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        String string = jSONObject.getString("arg1");
        TBS.Ext.commitEvent("Page_Home", 2101, string, jSONObject.getString("arg2"), jSONObject.getString("arg3"), k4v.e(jSONObject2));
        cqv.u("Page_Home", string + "_BehaviX_UT", null, null, hqv.s(jSONObject2));
    }

    public final void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1db604", new Object[]{this, str, jSONObject});
            return;
        }
        Object k = a3b.k(jSONObject, str.substring(0, str.lastIndexOf(46)));
        if (k instanceof JSONObject) {
            s2b.c().b().b((JSONObject) k);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    public final void c(String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cb44ae0", new Object[]{this, str, strArr, jSONObject});
            return;
        }
        Object k = a3b.k(jSONObject, str.replace(strArr[strArr.length - 1], "passOnTrack"));
        if (k instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) k;
            if (jSONObject2.size() <= 0) {
                bqa.d(ij6.TAG, "properties.size() <= 0");
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties((Map) JSON.parseObject(jSONObject2.toJSONString(), new a(this), new Feature[0]));
        }
        Object k2 = a3b.k(jSONObject, str.replace(strArr[strArr.length - 1], "nextPageUtparam"));
        if (k2 instanceof JSONObject) {
            JSONObject jSONObject3 = (JSONObject) k2;
            if (jSONObject3.size() <= 0) {
                bqa.d(ij6.TAG, "pageUtParam.size() <= 0");
            } else {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(jSONObject3));
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if (!(obj2 instanceof String) || !(obj instanceof JSONObject)) {
            bqa.d(ij6.TAG, "arg1不是string类型或者arg0不是JSONObject");
            return;
        }
        String str = (String) obj2;
        String[] split = str.split("\\.");
        if (split.length <= 0) {
            bqa.d(ij6.TAG, "长度小于等于0");
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        c(str, split, jSONObject);
        JSONObject a2 = ib1.a(split, str, jSONObject);
        if (a2 == null) {
            bqa.d(ij6.TAG, "clickUtParam == null");
            return;
        }
        a(a2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("clickParam", (Object) a2);
        sbq.b(jSONObject2);
        fct.a(jSONObject2);
        b(str, jSONObject);
    }
}
