package com.alipay.android.app.pay;

import com.alipay.android.msp.pay.results.ResultStatus;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Result {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3481a;
    public static String b;

    public static String getCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62e82389", new Object[0]);
        }
        ResultStatus resultState = ResultStatus.getResultState(ResultStatus.CANCELED.getStatus());
        return parseResult(resultState.getStatus(), resultState.getMemo(), "");
    }

    public static boolean getH5PayFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca001ffc", new Object[0])).booleanValue();
        }
        return f3481a;
    }

    public static String getH5Result() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("712bb639", new Object[0]);
        }
        return b;
    }

    public static String getParamsError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c7c478d", new Object[0]);
        }
        ResultStatus resultState = ResultStatus.getResultState(ResultStatus.PARAMS_ERROR.getStatus());
        return parseResult(resultState.getStatus(), resultState.getMemo(), "");
    }

    public static String parseResult(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c48ece0", new Object[]{new Integer(i), str, str2});
        }
        return "resultStatus={" + i + "};memo={" + str + "};result={" + str2 + "}";
    }

    public static void setH5PayFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dfaf9e8", new Object[]{new Boolean(z)});
        } else {
            f3481a = z;
        }
    }

    public static void setH5Result(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f286b5d", new Object[]{str});
        } else {
            b = str;
        }
    }
}
