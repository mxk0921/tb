package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.LimitDialog;
import com.taobao.tao.util.TaoHelper;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i4p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792187);
    }

    public static String a(g4p g4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4b0d155", new Object[]{g4pVar});
        }
        String str = "http://mtop.taobao.com/" + g4pVar.f19724a + "/" + g4pVar.b;
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(g4pVar.f);
        yko ykoVar = yak.f31939a;
        if (ykoVar != null) {
            jSONObject.put("utd_id", (Object) ykoVar.g().getUtdid());
        }
        Map<String, String> map = g4pVar.g;
        if (map != null && !((HashMap) map).isEmpty()) {
            jSONObject.put("params", JSON.toJSON(g4pVar.g));
        }
        return f6p.b(str, "data", jSONObject.toString());
    }

    public static void b(MtopRequest mtopRequest, g4p g4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f2d6211", new Object[]{mtopRequest, g4pVar});
        } else if (mtopRequest != null && g4pVar != null) {
            HashMap hashMap = new HashMap();
            if (!g4pVar.e) {
                yko ykoVar = yak.f31939a;
                if (ykoVar != null) {
                    ykoVar.c().d(g4pVar.f, g4pVar.h);
                    p80.o(yak.f31939a, g4pVar.f, g4pVar.h);
                }
            } else if (g4pVar.g != null) {
                yko ykoVar2 = yak.f31939a;
                if (ykoVar2 != null) {
                    ykoVar2.c().d(g4pVar.g, g4pVar.h);
                    p80.o(yak.f31939a, g4pVar.g, g4pVar.h);
                }
                hashMap.put("params", JSON.toJSONString(g4pVar.g));
            }
            Map<String, String> map = g4pVar.f;
            if (map != null) {
                hashMap.putAll(map);
            }
            if (hashMap.size() > 0) {
                mtopRequest.setData(JSON.toJSONString(hashMap));
            }
        }
    }

    public static org.json.JSONObject c(byte[] bArr, v5p v5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("692cddd", new Object[]{bArr, v5pVar});
        }
        org.json.JSONObject d = d(bArr, v5pVar);
        if (d == null) {
            return null;
        }
        org.json.JSONObject optJSONObject = d.optJSONObject("data");
        if (optJSONObject != null) {
            return optJSONObject;
        }
        return d;
    }

    public static org.json.JSONObject d(byte[] bArr, v5p v5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("91f0a04c", new Object[]{bArr, v5pVar});
        }
        if (!(bArr == null || bArr.length == 0)) {
            try {
                String str = new String(bArr, "UTF-8");
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    return new org.json.JSONObject(str);
                } catch (JSONException e) {
                    e.printStackTrace();
                    v5p.b(v5pVar, "JsonConvert", "-1", e.getMessage());
                    return null;
                }
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                v5p.b(v5pVar, "ByteDataConvert", "-1", e2.getMessage());
            }
        }
        return null;
    }

    public static q3p e(String str, g4p g4pVar) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q3p) ipChange.ipc$dispatch("a77e9716", new Object[]{str, g4pVar});
        }
        if (TextUtils.isEmpty(str)) {
            return new q3p();
        }
        HashMap hashMap = new HashMap();
        if (g4pVar.e && (map = g4pVar.g) != null) {
            hashMap.putAll(map);
        }
        Map<String, String> map2 = g4pVar.f;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        return a5p.a(f6p.c(str, hashMap), g4pVar.h);
    }

    public static m4p f(g4p g4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m4p) ipChange.ipc$dispatch("d570e00b", new Object[]{g4pVar});
        }
        return g(g4pVar, null);
    }

    public static m4p g(g4p g4pVar, v5p v5pVar) {
        String str;
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m4p) ipChange.ipc$dispatch("9beff0da", new Object[]{g4pVar, v5pVar});
        }
        h4p h4pVar = new h4p();
        if (g4pVar == null) {
            v5p.b(v5pVar, "Request", "-1", "mtopInfo is null");
            h4pVar.f23773a = false;
            return h4pVar;
        }
        yko ykoVar = yak.f31939a;
        if (ykoVar != null) {
            String b = ykoVar.c().b(g4pVar.h);
            if (!TextUtils.isEmpty(b)) {
                return e(b, g4pVar);
            }
        }
        String str2 = g4pVar.f19724a;
        String str3 = g4pVar.b;
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str2);
        mtopRequest.setVersion(str3);
        b(mtopRequest, g4pVar);
        Map<String, String> map = g4pVar.f;
        if (map == null || ((HashMap) map).isEmpty()) {
            hashMap = new HashMap();
            str = "";
        } else {
            hashMap = new HashMap(g4pVar.f);
            str = (String) hashMap.get("appId");
        }
        hashMap.put("apiVersion", str3);
        hashMap.put("appId", str);
        hashMap.put("apiName", str2);
        Map<String, String> map2 = g4pVar.g;
        if (map2 != null && !((HashMap) map2).isEmpty()) {
            hashMap.putAll(g4pVar.g);
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            hashMap.put("errCode", "-1");
            hashMap.put("errMsg", "api or version is null");
            v5p.c(v5pVar, "Request", hashMap);
            return h4pVar;
        }
        mtopRequest.setNeedSession(g4pVar.c);
        mtopRequest.setNeedEcode(g4pVar.d);
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, TaoHelper.getTTID());
        build.setBizId(89);
        if (!TextUtils.isEmpty(g4pVar.j)) {
            build.setBizTopic(g4pVar.j).setPageIndex(g4pVar.k.intValue());
        }
        MethodEnum methodEnum = g4pVar.i;
        if (methodEnum != null) {
            build.reqMethod(methodEnum);
        }
        MtopResponse syncRequest = build.syncRequest();
        p80.d(yak.f31939a, g4pVar.h, mtopRequest, syncRequest, build);
        byte[] bytedata = syncRequest.getBytedata();
        h4pVar.d = syncRequest.getRetCode();
        h4pVar.e = syncRequest.getRetMsg();
        if ("SUCCESS".equalsIgnoreCase(h4pVar.d)) {
            h4pVar.f23773a = true;
        } else {
            h4pVar.f23773a = false;
            h4pVar.c = LimitDialog.setErrorResponse(syncRequest);
        }
        if (bytedata != null) {
            h4pVar.b = bytedata;
        }
        String str4 = g4pVar.h;
        if (g4pVar.e) {
            str4 = str4 + "-" + ((String) ((HashMap) g4pVar.f).get("appId"));
        }
        yko ykoVar2 = yak.f31939a;
        if (ykoVar2 != null) {
            ykoVar2.c().f(a(g4pVar), h4pVar.b, str4, true);
        }
        syncRequest.getMtopStat();
        try {
            hashMap.put("mtopTraceId", build.mtopProp.falcoId);
            List<String> list = syncRequest.getHeaderFields().get("eagleeye-traceid");
            if (list != null && list.size() > 0) {
                hashMap.put("eagleeyeTraceId", list.get(0));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!h4pVar.f23773a) {
            hashMap.put("errCode", h4pVar.d);
            hashMap.put("errMsg", h4pVar.e);
            hashMap.put("isApiLocked", String.valueOf(h4pVar.c));
            v5p.c(v5pVar, "Request", hashMap);
        } else {
            v5p.d(v5pVar, "Request", hashMap);
        }
        return h4pVar;
    }
}
