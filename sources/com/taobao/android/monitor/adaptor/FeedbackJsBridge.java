package com.taobao.android.monitor.adaptor;

import android.content.SharedPreferences;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.gjv;
import tb.kpw;
import tb.nsw;
import tb.s59;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FeedbackJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_FEEDBACK = "reportFeedbackFullTrace";
    private static final String ACTION_SNAPSHOT_ID = "getSnapshotID";
    public static final String CLASS_FEEDBACK = "H5FeedbackBridge";

    public static /* synthetic */ Object ipc$super(FeedbackJsBridge feedbackJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/monitor/adaptor/FeedbackJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        TLog.loge("applicationmonitor_adaptor", "FeedbackJsBridge execute", "action = " + str);
        if (ACTION_FEEDBACK.equals(str)) {
            try {
                if (s59.c(wVCallBackContext.getWebview().getContext(), JSON.parseObject(str2))) {
                    wVCallBackContext.success();
                } else {
                    TLog.loge("applicationmonitor_adaptor", "FeedbackJsBridge", "reportFullstrace result false! ");
                    wVCallBackContext.error("please check params");
                }
            } catch (JSONException e) {
                TLog.loge("applicationmonitor_adaptor", "FeedbackJsBridge", "reportFullstrace e! " + e.getMessage());
                wVCallBackContext.error(e.getMessage());
            }
            return true;
        } else if (!ACTION_SNAPSHOT_ID.equals(str)) {
            return false;
        } else {
            try {
                SharedPreferences sharedPreferences = wVCallBackContext.getWebview().getContext().getSharedPreferences(gjv.INNER_USER_CONFIG, 0);
                String str3 = "";
                if (sharedPreferences != null) {
                    str3 = sharedPreferences.getString("snapshotid", str3);
                }
                if (!TextUtils.isEmpty(str3)) {
                    nsw nswVar = new nsw();
                    nswVar.b("snapshotID", str3);
                    wVCallBackContext.success(nswVar);
                } else {
                    TLog.loge("applicationmonitor_adaptor", "FeedbackJsBridge", "getSnapshotID result null! ");
                    wVCallBackContext.error("Can't get the snapshotID");
                }
            } catch (JSONException e2) {
                TLog.loge("applicationmonitor_adaptor", "FeedbackJsBridge", "reportFullstrace e! " + e2.getMessage());
                wVCallBackContext.error(e2.getMessage());
            }
            return true;
        }
    }
}
