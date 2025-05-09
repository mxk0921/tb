package com.alibaba.idst.nls.nlsclientsdk.util;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TimeStampLogUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String caseId;
    private static TimeStampLogUtil instance;
    private static JSONObject jsonObject;
    private static String taskId;
    private static String TAG = "TimeStamp";
    private static boolean printSwith = false;

    static {
        t2o.a(199229490);
    }

    private TimeStampLogUtil() {
        jsonObject = new JSONObject();
    }

    public static TimeStampLogUtil getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeStampLogUtil) ipChange.ipc$dispatch("5b01596f", new Object[0]);
        }
        if (instance == null) {
            instance = new TimeStampLogUtil();
        }
        return instance;
    }

    public static void printLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3d6dbc", new Object[]{str, str2, str3});
        } else if (printSwith) {
            if (str2 != null) {
                taskId = str2;
            }
            long currentTimeMillis = System.currentTimeMillis();
            jsonObject.put("tag", (Object) str);
            jsonObject.put("content", (Object) str3);
            jsonObject.put("time", (Object) Long.valueOf(currentTimeMillis));
            jsonObject.put("task_id", (Object) taskId);
            jsonObject.put("fileName", (Object) caseId);
            jsonObject.toJSONString();
        }
    }

    public static void setCaseId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ad0a3e", new Object[]{str});
        } else {
            caseId = str;
        }
    }
}
