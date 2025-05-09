package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z5s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final z5s f32557a = new z5s();

        static {
            t2o.a(856686600);
        }

        public static /* synthetic */ z5s a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z5s) ipChange.ipc$dispatch("31d6d4fe", new Object[0]);
            }
            return f32557a;
        }
    }

    static {
        t2o.a(856686598);
    }

    public static synchronized z5s a() {
        synchronized (z5s.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z5s) ipChange.ipc$dispatch("3560a64", new Object[0]);
            }
            return b.a();
        }
    }

    public z24 b(byte[] bArr, String str, String str2, String str3) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z24) ipChange.ipc$dispatch("c633b5ab", new Object[]{this, bArr, str, str2, str3});
        }
        JSONObject parseObject = JSON.parseObject(str);
        z24 z24Var = new z24();
        z24Var.f = bArr;
        if (parseObject.containsKey("type")) {
            z24Var.g = parseObject.getString("type");
        }
        if (parseObject.containsKey("headers")) {
            JSONObject jSONObject = (JSONObject) parseObject.get("headers");
            if (jSONObject.containsKey(uj4.appKeyName)) {
                z24Var.f32478a = jSONObject.getString(uj4.appKeyName);
            }
            if (jSONObject.containsKey(uj4.appIdName)) {
                jSONObject.getString(uj4.appIdName);
            }
            if (jSONObject.containsKey(uj4.requestIdName)) {
                z24Var.b = jSONObject.getString(uj4.requestIdName);
            }
            if (jSONObject.containsKey(uj4.opCodeName)) {
                z24Var.e = jSONObject.getString(uj4.opCodeName);
            }
            if (jSONObject.containsKey(uj4.replyIdName)) {
                jSONObject.getString(uj4.replyIdName);
            }
            if (jSONObject.containsKey(uj4.replyCode)) {
                z24Var.d = jSONObject.getString(uj4.replyCode);
            }
            if (jSONObject.containsKey(uj4.sessionIdName)) {
                z24Var.c = jSONObject.getString(uj4.sessionIdName);
            }
            if (jSONObject.containsKey(uj4.replyMsg)) {
                jSONObject.getString(uj4.replyMsg);
            }
        }
        if (parseObject.containsKey("data")) {
            z24Var.h = parseObject.getJSONObject("data");
        }
        return z24Var;
    }

    public String c(String str, String str2, String str3, byte[] bArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c8d66ee", new Object[]{this, str, str2, str3, bArr});
        }
        return new String(wp1.f(bArr), "utf-8");
    }

    public z5s() {
    }
}
