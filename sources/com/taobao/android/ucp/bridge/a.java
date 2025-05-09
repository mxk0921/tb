package com.taobao.android.ucp.bridge;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.t2o;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static JSONArray f9828a;
    public static volatile JSONArray b;

    static {
        t2o.a(404750753);
    }

    public static JSONArray a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[0]);
        }
        if (b == null) {
            String l = v82.l("enableTabbarControl", "");
            if (TextUtils.isEmpty(l)) {
                l = "[{\"bizCode\":\"homePage\",\"block\":\"bottomBar\",\"materialType\":\"alienEffect\",\"materialSubType\":\"rocket\",\"display\":true,\"trackInfo\":{\"bizType\":\"2\",\"bizCode\":\"homePage\",\"block\":\"bottomBar\",\"materialType\":\"alienEffect\",\"materialSubType\":\"rocket\"}},{\"bizCode\":\"message\",\"block\":\"bottomBar\",\"materialType\":\"commonMark\",\"materialSubType\":\"num\",\"display\":true,\"trackInfo\":{\"bizType\":\"1\",\"bizCode\":\"message\",\"block\":\"bottomBar\",\"materialType\":\"commonMark\",\"materialSubType\":\"num\"}},{\"bizCode\":\"message\",\"block\":\"bottomBar\",\"materialType\":\"commonMark\",\"materialSubType\":\"text\",\"display\":true,\"trackInfo\":{\"bizType\":\"1\",\"bizCode\":\"message\",\"block\":\"bottomBar\",\"materialType\":\"commonMark\",\"materialSubType\":\"text\"}},{\"bizCode\":\"cart\",\"block\":\"bottomBar\",\"materialType\":\"commonMark\",\"materialSubType\":\"num\",\"display\":true,\"trackInfo\":{\"bizType\":\"1\",\"bizCode\":\"cart\",\"block\":\"bottomBar\",\"materialType\":\"commonMark\",\"materialSubType\":\"num\"}}]";
            }
            b = JSON.parseArray(l);
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r19, java.lang.String r20, java.lang.String r21, com.alibaba.fastjson.JSONObject r22, com.alibaba.fastjson.JSONObject r23) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.ucp.bridge.a.b(java.lang.String, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject):boolean");
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65374f0a", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            TLog.loge("UCP", "policiesStr is null");
        } else {
            f9828a = JSON.parseArray(str);
            TLog.loge("UCP", "update policiesStr" + str);
        }
    }
}
