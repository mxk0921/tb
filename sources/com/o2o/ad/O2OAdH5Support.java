package com.o2o.ad;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import tb.cw4;
import tb.h4o;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.uc0;
import tb.yv4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O2OAdH5Support extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ID = "o2oactionid";
    private static final String CLICK_ID = "o2oclickid";
    private static final String MESSAGE = "message";

    static {
        t2o.a(1019215873);
    }

    public static /* synthetic */ Object ipc$super(O2OAdH5Support o2OAdH5Support, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/o2o/ad/O2OAdH5Support");
    }

    private void notifyError(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48320cd", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            nsw nswVar = new nsw("HY_FAILED");
            nswVar.b("message", str);
            wVCallBackContext.error(nswVar);
        }
    }

    public void commitO2OClickEvent(String str, WVCallBackContext wVCallBackContext) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7b3cb5", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Uri parse = Uri.parse(str);
        String str3 = "";
        if (parse.isHierarchical()) {
            str2 = parse.getQueryParameter("etype");
        } else {
            str2 = str3;
        }
        String a2 = new uc0().a(str, str2);
        if (wVCallBackContext != null) {
            nsw nswVar = new nsw();
            nswVar.k();
            if (a2 != null) {
                str3 = a2;
            }
            nswVar.b(CLICK_ID, str3);
            wVCallBackContext.success(nswVar);
        }
    }

    public void commitO2OExpoEvent(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628c684b", new Object[]{this, str, str2, wVCallBackContext});
            return;
        }
        O2OAdvertising.instance().buildIfsExposure(str).b(str2).a();
        if (wVCallBackContext != null) {
            wVCallBackContext.success(nsw.RET_SUCCESS);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        String str4 = null;
        if ("commitO2OExpoEvent".equals(str)) {
            JSONObject parseObject = JSON.parseObject(str2);
            try {
                str3 = parseObject.getString("expo");
                try {
                    str4 = parseObject.getString("namespace");
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                str3 = null;
            }
            if (!TextUtils.isEmpty(str3)) {
                commitO2OExpoEvent(str3, str4, wVCallBackContext);
            } else {
                TaoLog.Logd("AlimamaSdk", "error executing js, action = " + str + ", params = " + str2);
                notifyError("Param ifs is needed", wVCallBackContext);
            }
            return true;
        } else if ("genO2OClickIdBy".equals(str) || "commitO2OClickEvent".equals(str)) {
            try {
                str4 = JSON.parseObject(str2).getString("url");
            } catch (Exception unused3) {
            }
            if (!TextUtils.isEmpty(str4)) {
                commitO2OClickEvent(str4, wVCallBackContext);
            } else {
                TaoLog.Logd("AlimamaSdk", "error executing js, action = " + str + ", params = " + str2);
                notifyError("Param url and isOpenPage are needed", wVCallBackContext);
            }
            return true;
        } else if ("actionAdCommitter".equals(str)) {
            try {
                JSONObject jSONObject = JSON.parseObject(str2).getJSONObject("params");
                String string = jSONObject.getString("url");
                String string2 = jSONObject.getString("namespace");
                if (string2 == null) {
                    string2 = jSONObject.getString(DxContainerActivity.PARAMS_NAMESPACE);
                }
                String string3 = jSONObject.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
                String string4 = jSONObject.getString("type");
                String string5 = jSONObject.getString("args");
                str4 = new yv4(string, string4).b(string2).c(string3).a(TextUtils.isEmpty(string5) ? null : h4o.b(string5));
            } catch (Exception unused4) {
                TaoLog.Logd("AlimamaSdk", "error executing js, action = " + str + ", params = " + str2);
                notifyError("o2o cpa click params parse error", wVCallBackContext);
            }
            if (wVCallBackContext != null) {
                nsw nswVar = new nsw();
                nswVar.k();
                if (str4 == null) {
                    str4 = "";
                }
                nswVar.b(ACTION_ID, str4);
                wVCallBackContext.success(nswVar);
            }
            return true;
        } else if (!"commitCPSEvent".equals(str)) {
            return false;
        } else {
            try {
                new cw4().a(h4o.a(JSON.parseObject(str2).getJSONObject("params").getJSONObject("eventData")));
            } catch (Exception unused5) {
                TaoLog.Logd("AlimamaSdk", "error executing js, action = " + str + ", params = " + str2);
                notifyError("o2o cps click params parse error", wVCallBackContext);
            }
            if (wVCallBackContext != null) {
                wVCallBackContext.success(nsw.RET_SUCCESS);
            }
            return true;
        }
    }
}
