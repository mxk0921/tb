package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.TTDHintBannerController;
import com.ut.share.utils.Constants;
import tb.t2o;
import tb.vaj;

/* compiled from: Taobao */
@MappingKey(key = DnsPreference.KEY_TRADE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Trade extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject afterAddToCartAction;
    private a hintBanner;
    private final String redirectUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6766a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final JSONObject g;
        public final String h;
        public final String i;

        static {
            t2o.a(912261713);
        }

        public a(JSONObject jSONObject) {
            this.f6766a = Trade.nullToEmpty(jSONObject.getString("text"));
            this.b = Trade.nullToEmpty(jSONObject.getString("subText"));
            this.c = Trade.nullToEmpty(jSONObject.getString(vaj.KEY_BG_COLOR));
            this.h = Trade.nullToEmpty(jSONObject.getString("textColor"));
            this.i = Trade.nullToEmpty(jSONObject.getString("buttonTextColor"));
            this.d = Trade.nullToEmpty(jSONObject.getString("buttonText"));
            this.e = Trade.nullToEmpty(jSONObject.getString("eventId"));
            this.f = Trade.nullToEmpty(jSONObject.getString("url"));
            this.g = jSONObject.getJSONObject("fields");
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("73519e11", new Object[]{this});
            }
            return this.c;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("62bd2aa4", new Object[]{this});
            }
            return this.d;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2f33becb", new Object[]{this});
            }
            return this.i;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dd90ef3a", new Object[]{this});
            }
            return this.e;
        }

        public JSONObject e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this});
            }
            return this.g;
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a099e802", new Object[]{this});
            }
            return this.b;
        }

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
            }
            return this.f6766a;
        }

        public String h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1e093f79", new Object[]{this});
            }
            return this.h;
        }

        public String i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.f;
        }
    }

    static {
        t2o.a(912261712);
    }

    public Trade(JSONObject jSONObject) {
        super(jSONObject);
        this.redirectUrl = jSONObject.getString(Constants.WEIBO_REDIRECTURL_KEY);
        JSONObject jSONObject2 = jSONObject.getJSONObject(TTDHintBannerController.TAG);
        if (jSONObject2 != null) {
            this.hintBanner = new a(jSONObject2);
        }
        this.afterAddToCartAction = jSONObject.getJSONObject("afterAddToCartAction");
    }

    public static /* synthetic */ Object ipc$super(Trade trade, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Trade");
    }

    public static String nullToEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8ed2fc4", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public JSONObject getAfterAddToCartAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fcb7b633", new Object[]{this});
        }
        return this.afterAddToCartAction;
    }

    public a getHintBanner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("18538316", new Object[]{this});
        }
        return this.hintBanner;
    }

    public String getRedirectUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e51785c", new Object[]{this});
        }
        return this.redirectUrl;
    }
}
