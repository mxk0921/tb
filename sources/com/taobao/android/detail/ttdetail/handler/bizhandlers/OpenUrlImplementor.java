package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.net.URLEncoder;
import tb.h1p;
import tb.jov;
import tb.t2o;
import tb.tgh;
import tb.ze7;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OpenUrlImplementor implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openUrl";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_url";
    public static final String PARAMS_PARAMS = "params";
    public static final String PARAMS_URL = "url";

    /* renamed from: a  reason: collision with root package name */
    public final Context f6820a;
    public final ze7 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface PageType {
        public static final String H5 = "H5";
        public static final String NATIVE = "NATIVE";
        public static final String POPLAYER = "POPLAYER";
    }

    static {
        t2o.a(912261922);
        t2o.a(912261826);
    }

    public OpenUrlImplementor(Context context, ze7 ze7Var) {
        this.f6820a = context;
        this.b = ze7Var;
    }

    public static /* synthetic */ ze7 b(OpenUrlImplementor openUrlImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("8e364d9c", new Object[]{openUrlImplementor});
        }
        return openUrlImplementor.b;
    }

    public final void c(Bundle bundle, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63df453", new Object[]{this, bundle, str, obj});
        } else if (!TextUtils.isEmpty(str)) {
            if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
    }

    public final Bundle d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b3cf6e4b", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : jSONObject.keySet()) {
            c(bundle, str, jSONObject.get(str));
        }
        return bundle;
    }

    public final Bundle e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("a0a316ed", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : jSONObject.keySet()) {
            bundle.putString(str, String.valueOf(jSONObject.get(str)));
            c(bundle, str, jSONObject.get(str));
        }
        return bundle;
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3afb3139", new Object[]{this, str});
            return;
        }
        try {
            jov.k(this.f6820a, str);
        } catch (Throwable th) {
            tgh.c("OpenUrlHandler", "toH5 exception: ", th);
        }
    }

    public void g(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d84bbbcd", new Object[]{this, str, jSONObject});
            return;
        }
        try {
            Bundle d = d(jSONObject.getJSONObject("params"));
            if (d == null) {
                d = e(jSONObject.getJSONObject("nativeParams"));
            }
            if (d == null) {
                jov.k(this.f6820a, str);
            } else {
                jov.j(this.f6820a, d, str);
            }
        } catch (Throwable th) {
            tgh.c("OpenUrlHandler", "toNative exception: ", th);
        }
    }

    public void h(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc7818c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (Uri.parse(str).getScheme() == null) {
                str = h1p.HTTPS_PREFIX + parse.getSchemeSpecificPart();
            }
            try {
                StringBuilder sb = new StringBuilder("poplayer://abcd?openType=directly&uuid=");
                sb.append(System.currentTimeMillis());
                sb.append("&params=");
                sb.append(URLEncoder.encode("{\"url\":\"" + str + "\"}", "UTF-8"));
                jov.k(this.f6820a, sb.toString());
            } catch (Throwable th) {
                tgh.c("OpenUrlHandler", "toPoplayer exception", th);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r3.equals("H5") != false) goto L_0x0088;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    @Override // tb.zre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(tb.ir r8, com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam... r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenUrlImplementor.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "5228eae5"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r7
            r5[r1] = r8
            r5[r0] = r9
            java.lang.Object r8 = r3.ipc$dispatch(r4, r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x001f:
            if (r8 != 0) goto L_0x0022
            return r2
        L_0x0022:
            com.alibaba.fastjson.JSONObject r8 = r8.a()
            if (r8 != 0) goto L_0x0029
            return r2
        L_0x0029:
            java.lang.String r3 = "url"
            java.lang.String r3 = r8.getString(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0037
            return r2
        L_0x0037:
            com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenUrlImplementor$1 r4 = new com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenUrlImplementor$1
            r4.<init>(r3, r8)
            boolean r9 = tb.jov.i(r9)
            r9 = r9 ^ r1
            java.lang.String r9 = tb.jov.b(r3, r4, r9)
            java.lang.String r3 = "pageType"
            java.lang.String r3 = r8.getString(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r5 = "NATIVE"
            if (r4 == 0) goto L_0x0055
            r3 = r5
        L_0x0055:
            java.lang.String r3 = r3.toUpperCase()
            int r4 = r3.hashCode()
            r6 = -1999289321(0xffffffff88d54417, float:-1.2835479E-33)
            if (r4 == r6) goto L_0x007f
            r5 = 2285(0x8ed, float:3.202E-42)
            if (r4 == r5) goto L_0x0076
            r0 = 1446763936(0x563bdda0, float:5.1640137E13)
            if (r4 == r0) goto L_0x006c
            goto L_0x0087
        L_0x006c:
            java.lang.String r0 = "POPLAYER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0087
            r0 = 0
            goto L_0x0088
        L_0x0076:
            java.lang.String r2 = "H5"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0087
            goto L_0x0088
        L_0x007f:
            boolean r0 = r3.equals(r5)
            if (r0 == 0) goto L_0x0087
            r0 = 1
            goto L_0x0088
        L_0x0087:
            r0 = -1
        L_0x0088:
            if (r0 == 0) goto L_0x0094
            if (r0 == r1) goto L_0x0090
            r7.f(r9)
            goto L_0x0097
        L_0x0090:
            r7.g(r9, r8)
            goto L_0x0097
        L_0x0094:
            r7.h(r9)
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenUrlImplementor.a(tb.ir, com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam[]):boolean");
    }
}
