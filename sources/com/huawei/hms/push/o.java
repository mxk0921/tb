package com.huawei.hms.push;

import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o {
    private int B;
    private String D;
    private int b;
    private String c;
    private String d;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String r;
    private String s;
    private String z;

    /* renamed from: a  reason: collision with root package name */
    private String f5448a = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private String j = "";
    private String k = "";
    private String q = "";
    private int t = k.STYLE_DEFAULT.ordinal();
    private String u = "";
    private String v = "";
    private String w = "";
    private int x = 0;
    private int y = 0;
    private String A = "";
    private String C = "";
    private String E = "";
    private String F = "";

    public o(byte[] bArr, byte[] bArr2) {
        Charset charset = m.f5445a;
        this.r = new String(bArr, charset);
        this.s = new String(bArr2, charset);
    }

    private JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(RemoteMessageConst.MessageBody.MSG_CONTENT, jSONObject);
        jSONObject2.put("group", this.f5448a);
        jSONObject2.put("tag", this.A);
        jSONObject2.put(RemoteMessageConst.Notification.AUTO_CANCEL, this.x);
        jSONObject2.put("visibility", this.y);
        jSONObject2.put("when", this.z);
        return jSONObject2;
    }

    private JSONObject b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cmd", this.g);
        jSONObject2.put("content", this.h);
        jSONObject2.put(RemoteMessageConst.Notification.NOTIFY_ICON, this.i);
        jSONObject2.put(RemoteMessageConst.Notification.NOTIFY_TITLE, this.j);
        jSONObject2.put("notifySummary", this.k);
        jSONObject2.put("param", jSONObject);
        return jSONObject2;
    }

    private void c(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("ap")) {
            String string = jSONObject.getString("ap");
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(string) || string.length() >= 48) {
                this.d = string.substring(0, 48);
                return;
            }
            int length = 48 - string.length();
            for (int i = 0; i < length; i++) {
                sb.append("0");
            }
            sb.append(string);
            this.d = sb.toString();
        }
    }

    private boolean d(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has(RemoteMessageConst.Notification.CLICK_ACTION)) {
            this.m = jSONObject.getString(RemoteMessageConst.Notification.CLICK_ACTION);
        }
        if (jSONObject.has(RemoteMessageConst.Notification.INTENT_URI)) {
            this.c = jSONObject.getString(RemoteMessageConst.Notification.INTENT_URI);
        }
        if (jSONObject.has("appPackageName")) {
            this.l = jSONObject.getString("appPackageName");
            return true;
        }
        HMSLog.d("PushSelfShowLog", "appPackageName is null");
        return false;
    }

    private boolean e(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(RemoteMessageConst.MSGID)) {
            Object obj = jSONObject.get(RemoteMessageConst.MSGID);
            if (obj instanceof String) {
                this.e = (String) obj;
                return true;
            } else if (!(obj instanceof Integer)) {
                return true;
            } else {
                this.e = String.valueOf(((Integer) obj).intValue());
                return true;
            }
        } else {
            HMSLog.i("PushSelfShowLog", "msgId == null");
            return false;
        }
    }

    private boolean f(JSONObject jSONObject) {
        HMSLog.d("PushSelfShowLog", "enter parseNotifyParam");
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.NOTIFY_DETAIL);
            if (jSONObject2.has("style")) {
                this.t = jSONObject2.getInt("style");
            }
            this.u = jSONObject2.optString("bigTitle");
            this.v = jSONObject2.optString("bigContent");
            this.E = jSONObject2.optString("icon");
            return true;
        } catch (JSONException e) {
            HMSLog.i("PushSelfShowLog", e.toString());
            return false;
        }
    }

    private void g(JSONObject jSONObject) {
        this.f5448a = jSONObject.optString("group");
        HMSLog.d("PushSelfShowLog", "NOTIFY_GROUP:" + this.f5448a);
        this.x = jSONObject.optInt(RemoteMessageConst.Notification.AUTO_CANCEL, 1);
        HMSLog.d("PushSelfShowLog", "autoCancel: " + this.x);
        this.y = jSONObject.optInt("visibility", 0);
        this.z = jSONObject.optString("when");
        this.A = jSONObject.optString("tag");
    }

    private boolean h(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("param");
            if (jSONObject2.has("autoClear")) {
                this.b = jSONObject2.getInt("autoClear");
            } else {
                this.b = 0;
            }
            if (!"app".equals(this.g) && !"cosa".equals(this.g)) {
                if ("url".equals(this.g)) {
                    k(jSONObject2);
                    return true;
                } else if (!CountValue.T_RP.equals(this.g)) {
                    return true;
                } else {
                    j(jSONObject2);
                    return true;
                }
            }
            d(jSONObject2);
            return true;
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "ParseParam error ", e);
            return false;
        }
    }

    private boolean i(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(RemoteMessageConst.MessageBody.PS_CONTENT)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.PS_CONTENT);
            this.g = jSONObject2.getString("cmd");
            this.h = jSONObject2.optString("content");
            this.i = jSONObject2.optString(RemoteMessageConst.Notification.NOTIFY_ICON);
            this.j = jSONObject2.optString(RemoteMessageConst.Notification.NOTIFY_TITLE);
            this.k = jSONObject2.optString("notifySummary");
            this.D = jSONObject2.optString(RemoteMessageConst.Notification.TICKER);
            if ((!jSONObject2.has(RemoteMessageConst.MessageBody.NOTIFY_DETAIL) || f(jSONObject2)) && jSONObject2.has("param")) {
                return h(jSONObject2);
            }
        }
        return false;
    }

    private boolean j(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has("appPackageName")) {
            this.l = jSONObject.getString("appPackageName");
        }
        if (!jSONObject.has("rpt") || !jSONObject.has("rpl")) {
            HMSLog.d("PushSelfShowLog", "rpl or rpt is null");
            return false;
        }
        this.o = jSONObject.getString("rpl");
        this.p = jSONObject.getString("rpt");
        if (!jSONObject.has("rpct")) {
            return true;
        }
        this.q = jSONObject.getString("rpct");
        return true;
    }

    private boolean k(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has("url")) {
            this.n = jSONObject.getString("url");
            if (jSONObject.has("appPackageName")) {
                this.l = jSONObject.getString("appPackageName");
            }
            if (!jSONObject.has("rpt") || !jSONObject.has("rpl")) {
                return true;
            }
            this.o = jSONObject.getString("rpl");
            this.p = jSONObject.getString("rpt");
            if (!jSONObject.has("rpct")) {
                return true;
            }
            this.q = jSONObject.getString("rpct");
            return true;
        }
        HMSLog.d("PushSelfShowLog", "url is null");
        return false;
    }

    private JSONObject q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("style", this.t);
        jSONObject.put("bigTitle", this.u);
        jSONObject.put("bigContent", this.v);
        jSONObject.put("bigPic", this.w);
        return jSONObject;
    }

    private JSONObject u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoClear", this.b);
        jSONObject.put("url", this.n);
        jSONObject.put("rpl", this.o);
        jSONObject.put("rpt", this.p);
        jSONObject.put("rpct", this.q);
        jSONObject.put("appPackageName", this.l);
        jSONObject.put(RemoteMessageConst.Notification.CLICK_ACTION, this.m);
        jSONObject.put(RemoteMessageConst.Notification.INTENT_URI, this.c);
        return jSONObject;
    }

    public String l() {
        return this.E;
    }

    public String m() {
        return this.c;
    }

    public byte[] n() {
        try {
            return a(a(b(u()), q())).toString().getBytes(m.f5445a);
        } catch (JSONException e) {
            HMSLog.e("PushSelfShowLog", "getMsgData failed JSONException:", e);
            return new byte[0];
        }
    }

    public String o() {
        HMSLog.d("PushSelfShowLog", "msgId =" + this.e);
        return this.e;
    }

    public String p() {
        return this.A;
    }

    public int r() {
        return this.B;
    }

    public String s() {
        return this.k;
    }

    public String t() {
        return this.j;
    }

    public int v() {
        return this.t;
    }

    public String w() {
        return this.D;
    }

    public byte[] x() {
        return this.s.getBytes(m.f5445a);
    }

    public boolean y() {
        try {
            if (TextUtils.isEmpty(this.r)) {
                HMSLog.d("PushSelfShowLog", "msg is null");
                return false;
            }
            JSONObject jSONObject = new JSONObject(this.r);
            g(jSONObject);
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.MSG_CONTENT);
            if (!e(jSONObject2)) {
                return false;
            }
            this.f = jSONObject2.optString("dispPkgName");
            c(jSONObject2);
            this.B = jSONObject2.optInt("notifyId", -1);
            this.C = jSONObject2.optString("data");
            this.F = jSONObject2.optString(RemoteMessageConst.ANALYTIC_INFO);
            return i(jSONObject2);
        } catch (JSONException unused) {
            HMSLog.d("PushSelfShowLog", "parse message exception.");
            return false;
        } catch (Exception e) {
            HMSLog.d("PushSelfShowLog", e.toString());
            return false;
        }
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("dispPkgName", this.f);
        jSONObject3.put(RemoteMessageConst.MSGID, this.e);
        jSONObject3.put("ap", this.d);
        jSONObject3.put("notifyId", this.B);
        jSONObject3.put(RemoteMessageConst.MessageBody.PS_CONTENT, jSONObject);
        jSONObject3.put(RemoteMessageConst.MessageBody.NOTIFY_DETAIL, jSONObject2);
        jSONObject3.put(RemoteMessageConst.Notification.TICKER, this.D);
        jSONObject3.put("data", this.C);
        return jSONObject3;
    }

    public String b() {
        return this.F;
    }

    public int d() {
        return this.x;
    }

    public String g() {
        return this.u;
    }

    public int e() {
        return this.b;
    }

    public String f() {
        return this.v;
    }

    public String j() {
        return this.f;
    }

    public String c() {
        return this.l;
    }

    public String k() {
        return this.f5448a;
    }

    public String h() {
        return this.g;
    }

    public String i() {
        return this.h;
    }

    public String a() {
        return this.m;
    }

    public void a(int i) {
        this.B = i;
    }
}
