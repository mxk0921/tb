package com.taobao.ask.nav;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.ASK_CONST$ERROR;
import com.taobao.ask.AskToast;
import com.taobao.tao.log.TLog;
import tb.amo;
import tb.jd8;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.zc1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVSocialAskPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(817889305);
    }

    private void checkPublisherAvailable(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d29063", new Object[]{this, str, wVCallBackContext});
            return;
        }
        if (str == null) {
            str = "";
        }
        JSONObject parseObject = JSON.parseObject(str);
        String string = parseObject.getString("type");
        String string2 = parseObject.getString("scene");
        if ("answer".equals(string) || "question".equals(string)) {
            boolean a2 = jd8.a(string, string2);
            nsw nswVar = new nsw();
            nswVar.j("HY_SUCCESS");
            nswVar.a(amo.a.POINT_NAME, Boolean.valueOf(a2));
            wVCallBackContext.success(nswVar);
            return;
        }
        nsw nswVar2 = new nsw();
        nswVar2.j("HY_FAILED");
        nswVar2.b("code", ASK_CONST$ERROR.INVALID_PARAMS.getCode());
        wVCallBackContext.error(nswVar2);
    }

    public static /* synthetic */ Object ipc$super(WVSocialAskPlugin wVSocialAskPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ask/nav/WVSocialAskPlugin");
    }

    private void toast(String str, WVCallBackContext wVCallBackContext) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96bc4b5", new Object[]{this, str, wVCallBackContext});
            return;
        }
        if (str == null) {
            str = "";
        }
        JSONObject parseObject = JSON.parseObject(str);
        String string = parseObject.getString("type");
        String string2 = parseObject.getString("imageUrl");
        String string3 = parseObject.getString("text");
        String string4 = parseObject.getString("androidDuration");
        float floatValue = parseObject.containsKey("bottom") ? parseObject.getFloatValue("bottom") : -1.0f;
        boolean equals = "LONG".equals(string4);
        if (floatValue > 0.0f) {
            floatValue = zc1.i(floatValue);
        }
        boolean showToast = AskToast.showToast(this.mContext, string, string2, string3, floatValue, equals ? 1 : 0);
        nsw nswVar = new nsw();
        if (showToast) {
            str2 = "HY_SUCCESS";
        } else {
            str2 = "HY_FAILED";
        }
        nswVar.j(str2);
        if (showToast) {
            wVCallBackContext.success(nswVar);
            TLog.loge("ASK", "WVSocialAskPlugin toast success");
            return;
        }
        wVCallBackContext.error(nswVar);
        TLog.loge("ASK", "WVSocialAskPlugin toast failed");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void openPublish(java.lang.String r11, android.taobao.windvane.jsbridge.WVCallBackContext r12) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "ASK"
            java.lang.String r2 = "itemInfo"
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.ask.nav.WVSocialAskPlugin.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001d
            java.lang.String r1 = "814f9073"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r10
            r0 = 1
            r2[r0] = r11
            r11 = 2
            r2[r11] = r12
            r3.ipc$dispatch(r1, r2)
            return
        L_0x001d:
            if (r11 != 0) goto L_0x0021
            java.lang.String r11 = ""
        L_0x0021:
            com.alibaba.fastjson.JSONObject r11 = com.alibaba.fastjson.JSON.parseObject(r11)
            r3 = 0
            java.lang.String r4 = "https://h5.m.taobao.com/ask-everyone/publish.htm?"
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: Exception -> 0x007b
            android.net.Uri$Builder r4 = r4.buildUpon()     // Catch: Exception -> 0x007b
            java.util.Set r11 = r11.entrySet()     // Catch: Exception -> 0x007b
            java.util.Iterator r11 = r11.iterator()     // Catch: Exception -> 0x007b
            r5 = r3
            r6 = r5
        L_0x003a:
            boolean r7 = r11.hasNext()     // Catch: Exception -> 0x006c
            if (r7 == 0) goto L_0x006e
            java.lang.Object r7 = r11.next()     // Catch: Exception -> 0x006c
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: Exception -> 0x006c
            java.lang.Object r8 = r7.getKey()     // Catch: Exception -> 0x006c
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: Exception -> 0x006c
            java.lang.Object r7 = r7.getValue()     // Catch: Exception -> 0x006c
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: Exception -> 0x006c
            java.lang.String r9 = "type"
            boolean r9 = r9.equals(r8)     // Catch: Exception -> 0x006c
            if (r9 == 0) goto L_0x0060
            r5 = r7
        L_0x0060:
            boolean r9 = r2.equals(r8)     // Catch: Exception -> 0x006c
            if (r9 == 0) goto L_0x0068
            r6 = r7
            goto L_0x003a
        L_0x0068:
            r4.appendQueryParameter(r8, r7)     // Catch: Exception -> 0x006c
            goto L_0x003a
        L_0x006c:
            r11 = move-exception
            goto L_0x007e
        L_0x006e:
            java.lang.String r11 = "callFromWindvane"
            java.lang.String r7 = "true"
            r4.appendQueryParameter(r11, r7)     // Catch: Exception -> 0x006c
            android.net.Uri r3 = r4.build()     // Catch: Exception -> 0x006c
            goto L_0x0096
        L_0x007b:
            r11 = move-exception
            r5 = r3
            r6 = r5
        L_0x007e:
            r11.printStackTrace()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "WVSocialAskPlugin openPublish error "
            r4.<init>(r7)
            java.lang.String r11 = r11.getMessage()
            r4.append(r11)
            java.lang.String r11 = r4.toString()
            com.taobao.tao.log.TLog.loge(r1, r11)
        L_0x0096:
            android.util.Pair r11 = tb.aix.sureSessionId(r3)
            java.lang.Object r3 = r11.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r11 = r11.second
            android.net.Uri r11 = (android.net.Uri) r11
            tb.aix.registerListener(r3, r12)
            if (r11 == 0) goto L_0x00e7
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 != 0) goto L_0x00dd
            java.lang.String r12 = "question"
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x00dd
            com.alibaba.fastjson.JSONObject r12 = new com.alibaba.fastjson.JSONObject     // Catch: Exception -> 0x00d9
            r12.<init>()     // Catch: Exception -> 0x00d9
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r6)     // Catch: Exception -> 0x00d9
            r12.put(r2, r0)     // Catch: Exception -> 0x00d9
            tb.kq6 r0 = tb.kq6.b()     // Catch: Exception -> 0x00d9
            java.lang.String r12 = r0.c(r12)     // Catch: Exception -> 0x00d9
            android.net.Uri$Builder r0 = r11.buildUpon()     // Catch: Exception -> 0x00d9
            java.lang.String r1 = "cacheDataId"
            android.net.Uri$Builder r12 = r0.appendQueryParameter(r1, r12)     // Catch: Exception -> 0x00d9
            android.net.Uri r11 = r12.build()     // Catch: Exception -> 0x00d9
            goto L_0x00dd
        L_0x00d9:
            r12 = move-exception
            r12.printStackTrace()
        L_0x00dd:
            android.content.Context r12 = r10.mContext
            com.taobao.android.nav.Nav r12 = com.taobao.android.nav.Nav.from(r12)
            r12.toUri(r11)
            goto L_0x00f5
        L_0x00e7:
            com.taobao.ask.ASK_CONST$ERROR r11 = com.taobao.ask.ASK_CONST$ERROR.INVALID_PARAMS
            com.alibaba.fastjson.JSONObject r11 = r11.toJSONObject()
            tb.aix.callback(r3, r0, r0, r11)
            java.lang.String r11 = "WVSocialAskPlugin openPublish failed"
            com.taobao.tao.log.TLog.loge(r1, r11)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.ask.nav.WVSocialAskPlugin.openPublish(java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        TLog.loge("ASK", "WVSocialAskPlugin:" + str + "," + str2);
        if ("openPublish".equals(str)) {
            openPublish(str2, wVCallBackContext);
            return true;
        } else if ("toast".equals(str)) {
            toast(str2, wVCallBackContext);
            return true;
        } else if (!"checkPublisherAvailable".equals(str)) {
            return false;
        } else {
            checkPublisherAvailable(str2, wVCallBackContext);
            return true;
        }
    }
}
