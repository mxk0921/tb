package com.alipay.android.msp.framework.dynfun;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UtilsMig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Date;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TplMsg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALL_N_FIND_ALL_TPL = "findAllTpl";
    public static final String CALL_N_READ_NATIVE_DYN_DATA = "readNativeDynData";
    public static final String CALL_N_REGISTER_NATIVE_FUN = "registerNativeFun";
    public static final String CALL_N_WRITE_NATIVE_DYN_DATA = "writeNativeDynData";
    public static final String VALUE_E_EXCEPTION = "12";
    public static final String VALUE_E_NO_IMPL = "11";
    public static final String VALUE_E_NO_TARGET = "10";
    public static final String VALUE_T_FUNCTION = "f";
    public static final String VALUE_T_NATIVE = "n";
    public static final String VALUE_T_NATIVE_RETURN = "b";
    public static final String VALUE_T_RETURN = "r";
    public static final int VALUE_V_1 = 1;

    /* renamed from: a  reason: collision with root package name */
    public static int f3605a;
    public final JSONObject d;
    public final String e;
    public final String fo;
    public final TplIdentity fr;
    public final String id;
    public final String t;
    public final TplIdentity to;
    public final int v = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface TplMsgErrValue {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class TplMsgPayloadCall {
        @JSONField(name = "a")

        /* renamed from: a  reason: collision with root package name */
        public List<Object> f3606a;
        @JSONField(name = "n")
        public String n;

        public TplMsgPayloadCall() {
        }

        public TplMsgPayloadCall(String str, List<Object> list) {
            this.n = str;
            this.f3606a = list;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class TplMsgPayloadResponse {
        @JSONField(name = "n")
        public String n;
        @JSONField(name = "r")
        public Object r;

        public TplMsgPayloadResponse() {
        }

        public TplMsgPayloadResponse(String str, Object obj) {
            this.n = str;
            this.r = obj;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface TplMsgTypeValue {
    }

    public TplMsg(String str, String str2, String str3, TplIdentity tplIdentity, TplIdentity tplIdentity2, JSONObject jSONObject, String str4) {
        this.id = str;
        this.fo = str2;
        this.t = str3;
        this.fr = tplIdentity;
        this.to = tplIdentity2;
        this.d = jSONObject;
        this.e = str4;
    }

    public static TplMsg generate(String str, String str2, TplIdentity tplIdentity, TplIdentity tplIdentity2, JSONObject jSONObject, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TplMsg) ipChange.ipc$dispatch("db7430ae", new Object[]{str, str2, tplIdentity, tplIdentity2, jSONObject, str3});
        }
        int i = f3605a;
        long j = i;
        f3605a = i + 1;
        return new TplMsg("_e_" + ((new Date().getTime() / 1000) % 100000000) + "_" + j + "_" + UtilsMig.getRandomString(8), str, str2, tplIdentity, tplIdentity2, jSONObject, str3);
    }

    public JSONObject toJSON() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0ef9c0a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("v", (Object) Integer.valueOf(this.v));
        jSONObject.put("id", (Object) this.id);
        jSONObject.put("fo", (Object) this.fo);
        jSONObject.put("t", (Object) this.t);
        TplIdentity tplIdentity = this.fr;
        if (tplIdentity != null) {
            jSONObject.put("fr", (Object) tplIdentity.toJSON());
        }
        TplIdentity tplIdentity2 = this.to;
        if (tplIdentity2 != null) {
            jSONObject.put("to", (Object) tplIdentity2.toJSON());
        }
        jSONObject.put("d", (Object) this.d);
        jSONObject.put("e", (Object) this.e);
        return jSONObject;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "<TplMsg @" + super.hashCode() + " v" + this.v + ", " + this.id + ", " + this.e + " (" + this.fo + "), " + this.t + ", " + this.fr + " -> " + this.to + ", " + this.d + '>';
    }

    public static TplMsg fromJSON(JSONObject jSONObject) throws AssertionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TplMsg) ipChange.ipc$dispatch("b4596ee1", new Object[]{jSONObject});
        }
        try {
            if (!jSONObject.containsKey("v") || jSONObject.getIntValue("v") != 1) {
                throw new AssertionError("Invalid tplMsg version ".concat(String.valueOf(jSONObject)));
            }
            return new TplMsg(jSONObject.containsKey("id") ? jSONObject.getString("id") : null, jSONObject.containsKey("fo") ? jSONObject.getString("fo") : null, jSONObject.containsKey("t") ? jSONObject.getString("t") : null, jSONObject.containsKey("fr") ? TplIdentity.fromJSON(jSONObject.getJSONObject("fr")) : null, jSONObject.containsKey("to") ? TplIdentity.fromJSON(jSONObject.getJSONObject("to")) : null, jSONObject.containsKey("d") ? jSONObject.getJSONObject("d") : null, jSONObject.containsKey("e") ? jSONObject.getString("e") : null);
        } catch (Throwable th) {
            LogUtil.record(8, "TplMsg", "TplMsg.fromJSON", "exception");
            th.printStackTrace();
            return null;
        }
    }
}
