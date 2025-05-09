package com.taobao.android.searchbaseframe.chitu;

import android.os.Parcel;
import android.text.TextUtils;
import anet.channel.request.BodyEntry;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.http.HttpNetwork;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.lib.RequestInfoBean;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.g6p;
import tb.j3p;
import tb.r5j;
import tb.sr3;
import tb.t2o;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ChiTuRewriteUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERVERS = "servers";
    public static final String SERVER_REWRITE = "serverRewrite";
    public static final Map<String, RequestInfoBean> c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public String f9338a;
    public final yko b;

    static {
        t2o.a(993001718);
    }

    public ChiTuRewriteUtils(yko ykoVar) {
        this.b = ykoVar;
    }

    public static /* synthetic */ yko a(ChiTuRewriteUtils chiTuRewriteUtils) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("42df30ed", new Object[]{chiTuRewriteUtils});
        }
        return chiTuRewriteUtils.b;
    }

    public String b(String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51e28c51", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && this.b.e().a()) {
            try {
                String string = this.b.r().a().getString("serverRewrite", "");
                if (!(TextUtils.isEmpty(string) || (optJSONObject = new JSONObject(string).optJSONObject(SERVERS)) == null || (optJSONObject2 = optJSONObject.optJSONObject(str)) == null)) {
                    String optString = optJSONObject2.optString("server");
                    if (!TextUtils.isEmpty(optString)) {
                        return optString;
                    }
                }
            } catch (JSONException unused) {
                this.b.l().b("chitu", "获取改写host失败");
            }
        }
        return "";
    }

    public final Map<String, Object> c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7e51f00c", new Object[]{this, map});
        }
        String str = map.get("params");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return JSON.parseObject(str);
    }

    public String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22db902", new Object[]{this, str, str2});
        }
        if (!this.b.e().a()) {
            return str;
        }
        String b = b(str2);
        if (TextUtils.isEmpty(b)) {
            return str;
        }
        Map<String, String> f = g6p.f(str);
        d(f, str2);
        return g6p.c(b, f);
    }

    public void g(r5j r5jVar, byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf558a1e", new Object[]{this, r5jVar, bArr, str});
        } else if (this.b.e().a() && sr3.c(this.b)) {
            try {
                JSONObject jSONObject = new JSONObject((Map) r5jVar.b);
                f(g6p.b("http://mtop.taobao.com/" + ((r5j.a) r5jVar.f16602a).f27124a + "/" + ((r5j.a) r5jVar.f16602a).b, "data", jSONObject.toString()), bArr, str, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void f(final String str, final byte[] bArr, final String str2, final boolean z) {
        String str3;
        final JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16a2612", new Object[]{this, str, bArr, str2, new Boolean(z)});
        } else if (this.b.e().a() && !TextUtils.isEmpty(this.f9338a) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && bArr != null) {
            try {
                str3 = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                str3 = "";
            }
            try {
                jSONObject = new JSONObject(str3);
            } catch (JSONException e2) {
                e2.printStackTrace();
                jSONObject = new JSONObject();
            }
            ((HashMap) c).put(str2, new RequestInfoBean(str, str3));
            HttpNetwork httpNetwork = new HttpNetwork(j3p.f());
            RequestImpl requestImpl = new RequestImpl(this.f9338a);
            if (this.b.g().b() != -1) {
                requestImpl.setBizId(this.b.g().b());
            }
            requestImpl.setConnectTimeout(20000);
            requestImpl.setReadTimeout(20000);
            requestImpl.setRetryTime(0);
            requestImpl.setMethod("post");
            requestImpl.setBodyEntry(new BodyEntry() { // from class: com.taobao.android.searchbaseframe.chitu.ChiTuRewriteUtils.1
                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // anet.channel.request.BodyEntry
                public String getContentType() {
                    return "application/json";
                }

                @Override // anet.channel.request.BodyEntry
                public int writeTo(OutputStream outputStream) throws IOException {
                    String str4;
                    ChiTuRewriteUtils.a(ChiTuRewriteUtils.this).g().getUtdid();
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", str);
                    hashMap.put("result", jSONObject);
                    hashMap.put("alias", str2);
                    if (z) {
                        str4 = "true";
                    } else {
                        str4 = "false";
                    }
                    hashMap.put("mtop", str4);
                    outputStream.write(new JSONObject(hashMap).toString().getBytes("UTF-8"));
                    outputStream.close();
                    return bArr.length;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
                }
            });
            httpNetwork.asyncSend(requestImpl, null, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "chitu"
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.searchbaseframe.chitu.ChiTuRewriteUtils.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001a
            java.lang.String r2 = "fef60f76"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r9
            r4[r0] = r10
            r10 = 2
            r4[r10] = r11
            r3.ipc$dispatch(r2, r4)
            return
        L_0x001a:
            if (r10 != 0) goto L_0x001d
            return
        L_0x001d:
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 == 0) goto L_0x0024
            return
        L_0x0024:
            tb.yko r3 = r9.b
            tb.vr3 r3 = r3.e()
            boolean r3 = r3.a()
            if (r3 != 0) goto L_0x0031
            return
        L_0x0031:
            tb.yko r3 = r9.b
            tb.zmo r3 = r3.r()
            android.content.SharedPreferences r3 = r3.a()
            r4 = 0
            java.lang.String r5 = "serverRewrite"
            java.lang.String r6 = ""
            java.lang.String r3 = r3.getString(r5, r6)     // Catch: JSONException -> 0x0051
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: JSONException -> 0x0051
            if (r5 != 0) goto L_0x005d
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: JSONException -> 0x0051
            r5.<init>(r3)     // Catch: JSONException -> 0x0051
            goto L_0x005e
        L_0x0051:
            tb.yko r3 = r9.b
            tb.c4p r3 = r3.l()
            java.lang.String r5 = "serverRewrite json格式异常"
            r3.b(r2, r5)
        L_0x005d:
            r5 = r4
        L_0x005e:
            java.lang.String r3 = "debug"
            java.lang.String r6 = "true"
            r10.put(r3, r6)
            if (r5 == 0) goto L_0x00e6
            java.lang.String r3 = "groupAlias"
            java.lang.String r3 = r5.optString(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r7 = "chituGroupAlias"
            if (r6 != 0) goto L_0x0079
            r10.put(r7, r3)
        L_0x0079:
            tb.yko r6 = r9.b
            tb.tr3 r6 = r6.d()
            java.lang.String r6 = r6.b
            java.lang.String r8 = "chituBiz"
            r10.put(r8, r6)
            java.lang.String r6 = "servers"
            org.json.JSONObject r5 = r5.optJSONObject(r6)
            java.util.Map r6 = r9.c(r10)
            if (r6 == 0) goto L_0x0096
            r6.put(r7, r3)
        L_0x0096:
            if (r5 == 0) goto L_0x00da
            org.json.JSONObject r11 = r5.optJSONObject(r11)
            if (r11 == 0) goto L_0x00da
            java.lang.String r3 = "reqs"
            org.json.JSONArray r11 = r11.optJSONArray(r3)
            if (r11 == 0) goto L_0x00da
        L_0x00a7:
            int r3 = r11.length()
            if (r1 >= r3) goto L_0x00da
            org.json.JSONObject r3 = r11.getJSONObject(r1)     // Catch: JSONException -> 0x00b2
            goto L_0x00c0
        L_0x00b2:
            r3 = move-exception
            tb.yko r5 = r9.b
            tb.c4p r5 = r5.l()
            java.lang.String r7 = "reqs json格式异常"
            r5.e(r2, r7, r3)
            r3 = r4
        L_0x00c0:
            if (r3 == 0) goto L_0x00d8
            java.lang.String r5 = "key"
            java.lang.String r5 = r3.optString(r5)
            java.lang.String r7 = "val"
            java.lang.String r3 = r3.optString(r7)
            r10.put(r5, r3)
            if (r6 == 0) goto L_0x00d8
            r6.put(r5, r3)
        L_0x00d8:
            int r1 = r1 + r0
            goto L_0x00a7
        L_0x00da:
            if (r6 == 0) goto L_0x00e6
            java.lang.String r11 = "params"
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r6)
            r10.put(r11, r0)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.searchbaseframe.chitu.ChiTuRewriteUtils.d(java.util.Map, java.lang.String):void");
    }
}
