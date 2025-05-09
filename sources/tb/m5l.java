package tb;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m5l extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KET_OPEN_URL_H5_OLD_COMPONENT = "__oldComponent";
    public static final String KEY_H5_DATA_PREFIX = "data=";
    public static final String KEY_H5_POST_DATA = "postdata";
    public static final String KEY_H5_QUERY_DATA = "querydata";
    public static final String KEY_OPEN_URL_H5_IS_POST_URL = "isPostUrl";
    public static final String TYPE_OPEN_URL_H5 = "H5";
    public static final String TYPE_OPEN_URL_METHOD_GET = "get";
    public static final String TYPE_OPEN_URL_METHOD_POST = "post";
    public static final String TYPE_OPEN_URL_NATIVE = "Native";
    public static final String TYPE_OPEN_URL_WEEX = "Weex";
    public int j = 102;
    public final int k = 204800;

    static {
        t2o.a(155189324);
    }

    public m5l() {
        b();
    }

    public static /* synthetic */ Object ipc$super(m5l m5lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/OpenUrlSubscriber");
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71617dc", new Object[]{this, str});
        } else if (str != null && str.length() >= this.k) {
            HashMap hashMap = new HashMap();
            hashMap.put("intent_size", String.valueOf(str.length()));
            qdv.a("FAIL_BINDER_TRANSATION", "intent has to many data in jump to native ", hashMap);
        }
    }

    public void r(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512971bf", new Object[]{this, str, jSONObject});
            return;
        }
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            for (String str2 : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str2)) {
                    Object obj = jSONObject.get(str2);
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Integer) obj).intValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str2, (String) obj);
                    }
                }
            }
        }
        if (str.contains("disableForResult=true")) {
            xq0.c().a(this.b).d(bundle).c(str);
        } else {
            xq0.c().a(this.b).b(this.j).d(bundle).c(str);
        }
    }

    public void s(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea19e455", new Object[]{this, str, jSONObject});
        }
    }

    public void q(String str, JSONObject jSONObject, String str2) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d677d53", new Object[]{this, str, jSONObject, str2});
            return;
        }
        String string = jSONObject != null ? jSONObject.getString("__oldComponent") : null;
        if (TextUtils.isEmpty(str2)) {
            str2 = "post";
        }
        if (string == null || jSONObject == null) {
            str2 = "get";
        }
        if ("get".equals(str2)) {
            xq0.c().a(this.b).b(this.j).c(str);
            return;
        }
        Bundle bundle = new Bundle();
        if (string != null) {
            try {
                String encode = Uri.encode(string);
                bundle.putString("postdata", "data=" + encode);
            } catch (Exception unused) {
                UnifyLog.m(this.c.c(), "OpenUrlSubscriber", "oldComponent encode 失败", string);
            }
        }
        bundle.putBoolean("isPostUrl", true);
        try {
            jSONObject2 = JSON.parseObject(string);
        } catch (Throwable unused2) {
            jSONObject2 = new JSONObject();
        }
        xq0.c().a(this.b).b(this.j).d(bundle).g(xq0.c().a(this.b).f(str, jSONObject2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r4.equals("Weex") == false) goto L_0x0075;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    @Override // tb.l12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(tb.lcu r11) {
        /*
            r10 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "OpenUrlSubscriber"
            com.android.alibaba.ip.runtime.IpChange r4 = tb.m5l.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0017
            java.lang.String r3 = "8fbad8af"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r10
            r0[r1] = r11
            r4.ipc$dispatch(r3, r0)
            return
        L_0x0017:
            tb.gsb r4 = r10.g()
            if (r4 == 0) goto L_0x00e1
            com.alibaba.fastjson.JSONObject r5 = r4.getFields()
            if (r5 != 0) goto L_0x0025
            goto L_0x00e1
        L_0x0025:
            com.alibaba.fastjson.JSONObject r4 = r4.getFields()
            r5 = 0
            java.lang.String r4 = r4.toJSONString()     // Catch: Exception -> 0x003b
            java.lang.Class<com.alibaba.android.ultron.trade.event.model.OpenUrlEventModel> r6 = com.alibaba.android.ultron.trade.event.model.OpenUrlEventModel.class
            java.lang.Object r6 = com.alibaba.fastjson.JSON.parseObject(r4, r6)     // Catch: Exception -> 0x003b
            com.alibaba.android.ultron.trade.event.model.OpenUrlEventModel r6 = (com.alibaba.android.ultron.trade.event.model.OpenUrlEventModel) r6     // Catch: Exception -> 0x003b
            r10.p(r4)     // Catch: Exception -> 0x003a
            goto L_0x004a
        L_0x003a:
            r5 = r6
        L_0x003b:
            tb.fdd r4 = r10.c
            java.lang.String r4 = r4.c()
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.String r7 = "onHandleEvent JSON.parseObject failed"
            com.taobao.android.ultron.common.utils.UnifyLog.m(r4, r3, r7, r6)
            r6 = r5
        L_0x004a:
            if (r6 != 0) goto L_0x004d
            return
        L_0x004d:
            java.lang.String r4 = r6.getPageType()
            java.lang.String r5 = r6.getUrl()
            com.alibaba.fastjson.JSONObject r7 = r6.getParams()
            if (r4 == 0) goto L_0x00e1
            if (r5 != 0) goto L_0x005f
            goto L_0x00e1
        L_0x005f:
            int r8 = r10.j
            int r8 = r8 + r1
            r10.j = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "activityRequestCode"
            r11.m(r9, r8)
            r8 = -1
            int r9 = r4.hashCode()
            switch(r9) {
                case -1968751561: goto L_0x008b;
                case 2285: goto L_0x0080;
                case 2692129: goto L_0x0077;
                default: goto L_0x0075;
            }
        L_0x0075:
            r0 = -1
            goto L_0x0095
        L_0x0077:
            java.lang.String r1 = "Weex"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0095
            goto L_0x0075
        L_0x0080:
            java.lang.String r0 = "H5"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0089
            goto L_0x0075
        L_0x0089:
            r0 = 1
            goto L_0x0095
        L_0x008b:
            java.lang.String r0 = "Native"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0094
            goto L_0x0075
        L_0x0094:
            r0 = 0
        L_0x0095:
            switch(r0) {
                case 0: goto L_0x00c5;
                case 1: goto L_0x00ad;
                case 2: goto L_0x0099;
                default: goto L_0x0098;
            }
        L_0x0098:
            goto L_0x00d8
        L_0x0099:
            tb.fdd r0 = r10.c
            java.lang.String r0 = r0.c()
            java.lang.String r1 = "跳转到weex页面"
            java.lang.String[] r2 = new java.lang.String[]{r5}
            com.taobao.android.ultron.common.utils.UnifyLog.m(r0, r3, r1, r2)
            r10.s(r5, r7)
            goto L_0x00d8
        L_0x00ad:
            tb.fdd r0 = r10.c
            java.lang.String r0 = r0.c()
            java.lang.String r1 = "跳转到h5页面"
            java.lang.String[] r2 = new java.lang.String[]{r5}
            com.taobao.android.ultron.common.utils.UnifyLog.m(r0, r3, r1, r2)
            java.lang.String r0 = r6.getMethod()
            r10.q(r5, r7, r0)
            goto L_0x00d8
        L_0x00c5:
            tb.fdd r0 = r10.c
            java.lang.String r0 = r0.c()
            java.lang.String r1 = "跳转到native页面"
            java.lang.String[] r2 = new java.lang.String[]{r5}
            com.taobao.android.ultron.common.utils.UnifyLog.m(r0, r3, r1, r2)
            r10.r(r5, r7)
        L_0x00d8:
            tb.fdd r0 = r10.c
            tb.mcu r0 = r0.g()
            r0.p(r11)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.m5l.j(tb.lcu):void");
    }
}
