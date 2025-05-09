package com.taobao.android.dinamicx.eventchain;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.t2o;
import tb.v4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXAtomicFTData {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FT_ACTION_FINISH = "finish";
    public static final String FT_ACTION_NONE = "none";
    public static final String FT_ACTION_START = "start";

    /* renamed from: a  reason: collision with root package name */
    public final String f7310a;
    public final String b;
    public final String c;
    public final JSONObject d;
    public final boolean e;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface FTAction {
    }

    static {
        t2o.a(444596670);
    }

    public DXAtomicFTData(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.b = jSONObject.getString("scene");
            this.f7310a = a(jSONObject.getString("action"));
            this.c = jSONObject.getString(v4s.PARAM_UPLOAD_STAGE);
            this.e = "true".equals(jSONObject.getString("forceParamsLog"));
            this.d = jSONObject;
        }
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("628f7969", new Object[]{this, str});
        }
        if (str == null) {
            return "none";
        }
        if (str.equals("finish")) {
            return "finish";
        }
        if (!str.equals("start")) {
            return "none";
        }
        return "start";
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this});
        }
        return this.f7310a;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("806e2002", new Object[]{this});
        }
        return this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this});
        }
        return this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a4ae2b1", new Object[]{this});
        }
        return this.c;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1816f08", new Object[]{this})).booleanValue();
        }
        return this.e;
    }
}
