package tb;

import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import org.android.agoo.common.AgooConstants;
import tb.z2k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class q5o implements mjd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f26526a = "";
    public String b = "";
    public String c = "";
    public int d = 1;
    public String e = "";

    public static /* synthetic */ void i(q5o q5oVar, String str, String str2, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6de0dc", new Object[]{q5oVar, str, str2, map, new Integer(i), obj});
        } else if (obj == null) {
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                map = new LinkedHashMap();
            }
            q5oVar.h(str, str2, map);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: userTracker");
        }
    }

    @Override // tb.mjd
    public void a(a3o a3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d9f2192", new Object[]{this, a3oVar});
            return;
        }
        ckf.g(a3oVar, "request");
        String apiName = a3oVar.d().getApiName();
        ckf.f(apiName, "request.mtopRequest.apiName");
        this.b = apiName;
        this.f26526a = a3oVar.f();
        this.c = String.valueOf(System.currentTimeMillis());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("requestTime", this.c);
        linkedHashMap.put("useAttachedQueue", "true");
        i(this, "nextrpc-main-request", null, linkedHashMap, 2, null);
        UnifyLog.d("NextRPCStreamV2", "onExecute id=" + a3oVar.f(), new Object[0]);
    }

    public final Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bd5c65c1", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("requestTime", this.c);
        hashMap.put(tmu.CURRENT_TIME, String.valueOf(System.currentTimeMillis()));
        hashMap.put(z2k.d.ATTACHED_RESPONSE_HEADER_REQ_NUM, String.valueOf(this.d));
        return hashMap;
    }

    public final void h(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9c07d", new Object[]{this, str, str2, map});
            return;
        }
        map.put("isStream", "true");
        wuv.b(str, this.b, str2, map);
    }

    @Override // tb.mjd
    public void b(l7j l7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76bd30b8", new Object[]{this, l7jVar});
            return;
        }
        h("nextrpc-main-response-finish", null, g());
        UnifyLog.d("NextRPCStreamV2", "mtop onFinish id=" + this.f26526a, new Object[0]);
    }

    @Override // tb.mjd
    public void c(z0i z0iVar, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("734014e3", new Object[]{this, z0iVar, new Boolean(z)});
            return;
        }
        ckf.g(z0iVar, "mainResponse");
        this.d = z0iVar.h();
        this.e = z0iVar.a();
        boolean isEmpty = z0iVar.b().isEmpty();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        linkedHashMap.put("isAllAttachedResponse", str);
        linkedHashMap.put("traceId", this.e);
        linkedHashMap.putAll(g());
        if (!isEmpty) {
            str2 = "hasNextData";
        } else {
            str2 = "noNextData";
        }
        h("nextrpc-main-response-success", str2, linkedHashMap);
        UnifyLog.d("NextRPCStreamV2", "mtop onReceiveData id=" + this.f26526a + ",seqNum=" + this.d, new Object[0]);
    }

    @Override // tb.mjd
    public void d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384e3f7f", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, AgooConstants.MESSAGE_BODY);
        ckf.g(jSONObject, "headerJson");
        Map<String, String> t = a.t(g());
        Set<String> keySet = jSONObject.keySet();
        ckf.f(keySet, "headerJson.keys");
        for (String str2 : keySet) {
            ckf.f(str2, "key");
            String string = jSONObject.getString(str2);
            ckf.f(string, "headerJson.getString(key)");
            t.put(str2, string);
        }
        h("nextrpc-attached-response", "", t);
        UnifyLog.d("NextRPCStreamV2", "mtop onReceiveAccsData id=" + this.f26526a, new Object[0]);
    }

    @Override // tb.mjd
    public void f(k7j k7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e4aa36", new Object[]{this, k7jVar});
            return;
        }
        i(this, "nextrpc-main-response-failed", null, null, 6, null);
        StringBuilder sb = new StringBuilder("mtop onError id=");
        sb.append(this.f26526a);
        sb.append("，errorCode=");
        String str = null;
        sb.append(k7jVar != null ? k7jVar.b : null);
        sb.append(", retMsg=");
        if (k7jVar != null) {
            str = k7jVar.c;
        }
        sb.append(str);
        UnifyLog.d("NextRPCStreamV2", sb.toString(), new Object[0]);
    }

    @Override // tb.mjd
    public void onTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13bc209", new Object[]{this});
            return;
        }
        i(this, "nextrpc-timeout", null, null, 6, null);
        UnifyLog.d("NextRPCStreamV2", "onTimeout id=" + this.f26526a, new Object[0]);
    }

    @Override // tb.mjd
    public void a(fj9 fj9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7630b985", new Object[]{this, fj9Var, new Boolean(z)});
            return;
        }
        ckf.g(fj9Var, "finishResult");
        UnifyLog.d("NextRPCStreamV2", "onNextRPCFinish id=" + this.f26526a + "，type=" + fj9Var.a() + "，removeTask=" + z, new Object[0]);
    }
}
