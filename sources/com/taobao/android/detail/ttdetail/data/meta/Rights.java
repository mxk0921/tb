package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.dt4;
import tb.t2o;
import tb.uf7;

/* compiled from: Taobao */
@MappingKey(key = "tradeConsumerProtection")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Rights extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "consumerProtection";
    private JSONObject data;
    private String params;
    private String passValue;
    private String strength;
    private b channel = initChannel();
    private ArrayList<c> rights = initRights();
    private b special = initSpecialChannel();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements dt4.a<c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Rights rights) {
        }

        /* renamed from: b */
        public c a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("fd38a34d", new Object[]{this, obj});
            }
            return new c((JSONObject) obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        static {
            t2o.a(912261702);
        }

        public b(JSONObject jSONObject) {
            uf7.c(jSONObject.getString("title"));
            uf7.c(jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        static {
            t2o.a(912261703);
        }

        public c(JSONObject jSONObject) {
            uf7.c(jSONObject.getString("serviceId"));
            uf7.c(jSONObject.getString("title"));
            uf7.c(jSONObject.getString("desc"));
            jSONObject.getIntValue("type");
        }
    }

    static {
        t2o.a(912261700);
    }

    public Rights(JSONObject jSONObject) {
        super(jSONObject);
        this.data = jSONObject;
        this.params = jSONObject.getString("params");
        this.passValue = jSONObject.getString("passValue");
        this.strength = jSONObject.getString("strength");
    }

    private b initChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fd15691d", new Object[]{this});
        }
        JSONObject jSONObject = this.data.getJSONObject("channel");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return new b(jSONObject);
    }

    private ArrayList<c> initRights() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9d07c0e8", new Object[]{this});
        }
        return dt4.a(this.data.getJSONArray("items"), new a(this));
    }

    private b initSpecialChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("63432a84", new Object[]{this});
        }
        JSONObject jSONObject = this.data.getJSONObject("special");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return new b(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(Rights rights, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Rights");
    }
}
