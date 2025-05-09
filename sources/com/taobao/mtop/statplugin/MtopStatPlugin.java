package com.taobao.mtop.statplugin;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import anetwork.channel.stat.NetworkStat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import org.json.JSONException;
import org.json.JSONObject;
import tb.fsw;
import tb.kpw;
import tb.kzu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopStatPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_SERVER_NAME = "MtopStatPlugin";
    private static final String TAG = "mtopsdk.MtopStatPlugin";

    public static /* synthetic */ Object ipc$super(MtopStatPlugin mtopStatPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mtop/statplugin/MtopStatPlugin");
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        fsw.h(API_SERVER_NAME, MtopStatPlugin.class);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "register MtopStatPlugin succeed!");
        }
    }

    @WindVaneInterface
    public void commitUT(WVCallBackContext wVCallBackContext, String str) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e715a4", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            if (TBSdkLog.isPrintLog()) {
                TBSdkLog.d(TAG, "[commitUT] params=" + str);
            }
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("pageName");
            int i = jSONObject.getInt("eventId");
            String optString = jSONObject.optString("arg1");
            String optString2 = jSONObject.optString("arg2");
            String optString3 = jSONObject.optString("arg3");
            JSONObject optJSONObject = jSONObject.optJSONObject("args");
            if (optJSONObject != null) {
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String obj = keys.next().toString();
                    hashMap2.put(obj, optJSONObject.optString(obj));
                }
                hashMap = hashMap2;
            } else {
                hashMap = null;
            }
            kzu.b(string, i, optString, optString2, optString3, hashMap);
            wVCallBackContext.success();
        } catch (JSONException e) {
            TBSdkLog.e(TAG, "JSON解析失败", e);
            wVCallBackContext.error("JSON解析失败");
        } catch (Exception e2) {
            TBSdkLog.e(TAG, "发生异常", e2);
            wVCallBackContext.error("发生异常");
        }
    }

    @WindVaneInterface
    public void getStat(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc1d158", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            String string = new JSONObject(str).getString("url");
            String str2 = NetworkStat.getNetworkStat().get(string);
            if (TBSdkLog.isPrintLog()) {
                TBSdkLog.d(TAG, "[getStat] url=" + string + " stat=" + str2);
            }
            if (StringUtils.isNotBlank(str)) {
                wVCallBackContext.success(str2);
            } else {
                wVCallBackContext.error(str2);
            }
        } catch (JSONException e) {
            TBSdkLog.e(TAG, "JSON解析失败", e);
            wVCallBackContext.error("JSON解析失败");
        } catch (Exception e2) {
            TBSdkLog.e(TAG, "发生异常", e2);
            wVCallBackContext.error("发生异常");
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("get".equals(str)) {
            getStat(wVCallBackContext, str2);
            return true;
        } else if (!"commitUT".equals(str)) {
            return false;
        } else {
            commitUT(wVCallBackContext, str2);
            return true;
        }
    }
}
