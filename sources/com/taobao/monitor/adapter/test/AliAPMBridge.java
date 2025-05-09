package com.taobao.monitor.adapter.test;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import java.util.Map;
import tb.kpw;
import tb.mdd;
import tb.out;
import tb.vxm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AliAPMBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ADD_SUBTASK = "addSubTask";
    private static final String ACTION_BEGIN_SUBTASK = "beginSubtask";
    private static final String ACTION_END_SUBTASK = "endSubtask";
    public static final String API_SERVER_NAME = "AliAPMBridge";

    public static /* synthetic */ Object ipc$super(AliAPMBridge aliAPMBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/adapter/test/AliAPMBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (ACTION_BEGIN_SUBTASK.equals(str)) {
            return beginSubtask(str2, wVCallBackContext);
        }
        if (ACTION_END_SUBTASK.equals(str)) {
            return endSubtask(str2, wVCallBackContext);
        }
        if (ACTION_ADD_SUBTASK.equals(str)) {
            return addSubTask(str2, wVCallBackContext);
        }
        return false;
    }

    private boolean addSubTask(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed4e7656", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString(BaseMnnRunUnit.KEY_TASK_NAME);
            long longValue = parseObject.getLong("beginTimestamp").longValue();
            long longValue2 = parseObject.getLong("endTimestamp").longValue();
            JSONObject jSONObject = parseObject.getJSONObject("extra");
            if (TextUtils.isEmpty(string)) {
                wVCallBackContext.error("'taskName' Parameter missing");
                return false;
            } else if (longValue <= 0) {
                wVCallBackContext.error("'beginTimestamp' Parameter invalid");
                return false;
            } else if (longValue2 <= 0) {
                wVCallBackContext.error("'endTimestamp' Parameter invalid");
                return false;
            } else {
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview instanceof View) {
                    Map<String, Object> map = jSONObject == null ? null : (Map) JSON.toJavaObject(jSONObject, Map.class);
                    mdd g = vxm.b.g((View) webview);
                    g.g(string, out.b(longValue));
                    g.n(string, out.b(longValue2), map);
                    return true;
                }
                wVCallBackContext.error("IWVWebView invalid");
                return false;
            }
        } catch (Exception e) {
            wVCallBackContext.error(e.getMessage());
            return false;
        }
    }

    private boolean beginSubtask(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd0fb2e", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString(BaseMnnRunUnit.KEY_TASK_NAME);
            long longValue = parseObject.getLong("beginTimestamp").longValue();
            if (TextUtils.isEmpty(string)) {
                wVCallBackContext.error("'taskName' Parameter missing");
                return false;
            } else if (longValue <= 0) {
                wVCallBackContext.error("'beginTimestamp' Parameter invalid");
                return false;
            } else {
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview instanceof View) {
                    vxm.b.g((View) webview).g(string, out.b(longValue));
                    return true;
                }
                wVCallBackContext.error("IWVWebView invalid");
                return false;
            }
        } catch (Exception e) {
            wVCallBackContext.error(e.getMessage());
            return false;
        }
    }

    private boolean endSubtask(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b84ca53c", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString(BaseMnnRunUnit.KEY_TASK_NAME);
            long longValue = parseObject.getLong("endTimestamp").longValue();
            JSONObject jSONObject = parseObject.getJSONObject("extra");
            if (TextUtils.isEmpty(string)) {
                wVCallBackContext.error("'taskName' Parameter missing");
                return false;
            } else if (longValue <= 0) {
                wVCallBackContext.error("'endTimestamp' Parameter invalid");
                return false;
            } else {
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview instanceof View) {
                    vxm.b.g((View) webview).n(string, out.b(longValue), jSONObject == null ? null : (Map) JSON.toJavaObject(jSONObject, Map.class));
                    return true;
                }
                wVCallBackContext.error("IWVWebView invalid");
                return false;
            }
        } catch (Exception e) {
            wVCallBackContext.error(e.getMessage());
            return false;
        }
    }
}
