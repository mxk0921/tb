package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.z2k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dh1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f17809a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public dh1(JSONObject jSONObject, String str, a3o a3oVar) {
        JSONObject jSONObject2;
        ckf.g(jSONObject, "jsonHeaders");
        ckf.g(str, "strBody");
        ckf.g(a3oVar, "request");
        this.f17809a = jSONObject;
        this.c = str;
        if (ckf.b(a3oVar.b(), Boolean.TRUE)) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = JSON.parseObject(str);
            ckf.f(jSONObject2, "JSONObject.parseObject(strBody)");
        }
        this.b = jSONObject2;
        this.d = g();
        this.e = i();
        this.f = h();
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.d;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("615be7c7", new Object[]{this});
        }
        return this.b;
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7bf95bef", new Object[]{this});
        }
        return this.f17809a;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f085b797", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e644dfdc", new Object[]{this});
        }
        return this.c;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3099ebce", new Object[]{this});
        }
        return String.valueOf(this.f17809a.get("bizName"));
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c77f72b4", new Object[]{this})).intValue();
        }
        Object obj = this.f17809a.get(z2k.d.ATTACHED_RESPONSE_HEADER_REQ_NUM);
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        Integer m = ssq.m(String.valueOf(obj));
        if (m != null) {
            return m.intValue();
        }
        return -1;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9668fa5b", new Object[]{this})).booleanValue();
        }
        Object obj = this.f17809a.get("success");
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(String.valueOf(obj));
    }
}
