package com.alipay.android.msp.network.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.yj4;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcRequestData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f3712a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;

    public String getApi_name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea4b7b3", new Object[]{this});
        }
        return this.b;
    }

    public String getApi_version() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8c3c49c", new Object[]{this});
        }
        return this.c;
    }

    public String getAuth_key() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93fa5cfb", new Object[]{this});
        }
        return this.e;
    }

    public String getDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b1ef52d", new Object[]{this});
        }
        return this.h;
    }

    public String getImei() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fb5387b", new Object[]{this});
        }
        return this.l;
    }

    public String getImsi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e6b9a09", new Object[]{this});
        }
        return this.k;
    }

    public Map<String, String> getKeyValueMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ca78bdf0", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("namespace", this.f3712a);
        hashMap.put("api_name", this.b);
        hashMap.put("api_version", this.c);
        hashMap.put("params", this.d);
        hashMap.put(yj4.PARAM_MEDIA_INFO_AUTHKEY, this.e);
        hashMap.put("version", this.f);
        hashMap.put("user_agent", this.g);
        hashMap.put(MspGlobalDefine.SESSION, this.i);
        hashMap.put("tid", this.j);
        hashMap.put("imei", this.l);
        hashMap.put("imsi", this.k);
        hashMap.put("dispatchtype", this.o);
        hashMap.put("mspParam", this.p);
        return hashMap;
    }

    public String getMac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5683d280", new Object[]{this});
        }
        return this.m;
    }

    public String getMspParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d35400", new Object[]{this});
        }
        return this.p;
    }

    public String getNamespace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c37174", new Object[]{this});
        }
        return this.f3712a;
    }

    public String getOs_id() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c48fa359", new Object[]{this});
        }
        return this.n;
    }

    public String getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63f8f7fd", new Object[]{this});
        }
        return this.d;
    }

    public String getSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59f62c99", new Object[]{this});
        }
        return this.i;
    }

    public String getTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this});
        }
        return this.j;
    }

    public String getUser_agent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dde5b3d2", new Object[]{this});
        }
        return this.g;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.f;
    }

    public void setApi_name(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cf9923", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void setApi_version(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("776bfdc2", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void setAuth_key(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762e9cdb", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void setDevice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98699de9", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void setDispatchType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa0be67", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public void setImei(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71175b", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void setImsi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d386e78d", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void setMac(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6883605e", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void setMspParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f748676", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public void setNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e878ea", new Object[]{this, str});
        } else {
            this.f3712a = str;
        }
    }

    public void setOs_id(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3d5da5", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void setParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacff519", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd2ef65", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void setTid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30138b9e", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void setUser_agent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ba4de4", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public JSONObject toJsonParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8ca6490", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("namespace", (Object) this.f3712a);
        jSONObject.put("api_name", (Object) this.b);
        jSONObject.put("api_version", (Object) this.c);
        jSONObject.put("params", JSON.parse(this.d));
        jSONObject.put(yj4.PARAM_MEDIA_INFO_AUTHKEY, (Object) this.e);
        jSONObject.put("version", (Object) this.f);
        jSONObject.put("user_agent", (Object) this.g);
        jSONObject.put(MspGlobalDefine.SESSION, (Object) this.i);
        jSONObject.put("tid", (Object) this.j);
        jSONObject.put("imei", (Object) this.l);
        jSONObject.put("imsi", (Object) this.k);
        return jSONObject;
    }
}
