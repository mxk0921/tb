package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.request.base.FileInfo;
import com.taobao.orange.OConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kn2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(856686622);
    }

    public static JSONObject b(ifh ifhVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c2c8986f", new Object[]{ifhVar, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(uj4.appKeyName, (Object) ifhVar.f21291a);
        jSONObject.put(uj4.appIdName, (Object) ifhVar.b);
        jSONObject.put(uj4.deviceIdName, (Object) ifhVar.c);
        jSONObject.put(uj4.sessionIdName, (Object) str2);
        jSONObject.put(uj4.requestIdName, (Object) str);
        jSONObject.put(uj4.opCodeName, (Object) ifhVar.e);
        return jSONObject;
    }

    public static p5o c(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3, String str4) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p5o) ipChange.ipc$dispatch("6f3a0a5d", new Object[]{jSONObject, jSONObject2, str, str2, str3, str4});
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type", (Object) str);
        jSONObject3.put("version", (Object) uj4.version);
        jSONObject3.put("headers", (Object) jSONObject2);
        jSONObject3.put("data", (Object) jSONObject);
        String a2 = xkv.a(jSONObject3.toString());
        p5o p5oVar = new p5o();
        p5oVar.f25893a = a2;
        p5oVar.b = str3;
        return p5oVar;
    }

    public static JSONArray a(FileInfo[] fileInfoArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("dc2f01d3", new Object[]{fileInfoArr});
        }
        JSONArray jSONArray = new JSONArray();
        for (FileInfo fileInfo : fileInfoArr) {
            JSONObject jSONObject = new JSONObject();
            String str = fileInfo.fileName;
            if (str != null) {
                jSONObject.put("fileName", (Object) str);
            }
            String str2 = fileInfo.absolutePath;
            if (str2 != null) {
                jSONObject.put("absolutePath", (Object) str2);
            }
            Long l = fileInfo.lastModified;
            if (l != null) {
                jSONObject.put("lastModified", (Object) l);
            }
            Long l2 = fileInfo.contentLength;
            if (l2 != null) {
                jSONObject.put(OConstant.DIMEN_CONTENT_LENGTH, (Object) l2);
            }
            String str3 = fileInfo.contentType;
            if (str3 != null) {
                jSONObject.put("contentType", (Object) str3);
            }
            String str4 = fileInfo.contentMD5;
            if (str4 != null) {
                jSONObject.put("contentMD5", (Object) str4);
            }
            String str5 = fileInfo.contentEncoding;
            if (str5 != null) {
                jSONObject.put("contentEncoding", (Object) str5);
            }
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }
}
