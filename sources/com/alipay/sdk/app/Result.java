package com.alipay.sdk.app;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Result {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62e82389", new Object[0]);
        }
        ResultStatus resultState = ResultStatus.getResultState(ResultStatus.CANCELED.getStatus());
        return parseResult(resultState.getStatus(), resultState.getMemo(), "");
    }

    public static String getDoubleRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68ea0e31", new Object[0]);
        }
        ResultStatus resultState = ResultStatus.getResultState(ResultStatus.DOUBLE_REQUEST.getStatus());
        return parseResult(resultState.getStatus(), resultState.getMemo(), "");
    }

    public static String getInvokeAlipayFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4339f623", new Object[0]);
        }
        ResultStatus resultStatus = ResultStatus.INVOKE_ALIPAY_FAIL;
        return parseResult(resultStatus.getStatus(), resultStatus.getMemo(), "");
    }

    public static String getNotInstalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5327bebc", new Object[0]);
        }
        ResultStatus resultStatus = ResultStatus.ALIPAY_NOT_INSTALLED;
        return parseResult(resultStatus.getStatus(), resultStatus.getMemo(), "");
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
}
