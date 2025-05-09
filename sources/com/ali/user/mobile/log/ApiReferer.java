package com.ali.user.mobile.log;

import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.info.AppInfo;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.session.constants.SessionConstants;
import java.io.Serializable;
import java.util.UUID;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ApiReferer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "loginsdk.ApiReferer";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Refer implements Serializable {
        public String errorCode;
        public String errorMessage;
        public String eventName;
        public String site;
        public String userId;

        static {
            t2o.a(68157525);
        }

        public Refer() {
        }

        public Refer(String str) {
            this.eventName = str;
        }
    }

    static {
        t2o.a(68157524);
    }

    public static String generateApiReferer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("977dfaf1", new Object[0]);
        }
        try {
            String eventTrace = SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getEventTrace();
            if (TextUtils.isEmpty(eventTrace)) {
                return JSON.toJSONString(new Refer(LoginConstants.EVENT_SESSION_INVALID));
            }
            return eventTrace;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String generateSdkSessionTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7706aa", new Object[0]);
        }
        LoginTLogAdapter.e(TAG, "new fresh generateSdkSessionTraceId");
        return UUID.randomUUID().toString();
    }

    public static String generateTraceId(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d5ae83a", new Object[]{str, str2}) : generateTraceId(str, str2, "");
    }

    public static String getApiRefer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c02e447d", new Object[0]);
        }
        if (DataProviderFactory.getApplicationContext() != null) {
            return DataProviderFactory.getApplicationContext().getSharedPreferences("userinfo", 4).getString(SessionConstants.EVENT_TRACE, "");
        }
        return "";
    }

    public static String generateTraceId(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d15930", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str4 = str + "_" + AppInfo.getInstance().getUtdid() + "_" + (System.currentTimeMillis() / 1000);
        if (!TextUtils.isEmpty(str2)) {
            str4 = str4 + "_" + str2.replaceAll("_", "");
        }
        if (TextUtils.isEmpty(str3)) {
            return str4;
        }
        return str4 + "_" + str3;
    }
}
