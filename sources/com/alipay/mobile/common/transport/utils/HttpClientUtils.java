package com.alipay.mobile.common.transport.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.params.HttpParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class HttpClientUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int removeIntParamter(HttpUriRequest httpUriRequest, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60c8befd", new Object[]{httpUriRequest, str})).intValue();
        }
        HttpParams params = httpUriRequest.getParams();
        if (params == null) {
            return -1;
        }
        try {
            int intParameter = params.getIntParameter(str, -1);
            if (intParameter == -1) {
                return intParameter;
            }
            params.removeParameter(str);
            return intParameter;
        } catch (Throwable th) {
            LogCatUtil.warn("HttpClientUtils", "removeIntParamter fail.", th);
            return -1;
        }
    }

    public static String removeParamter(HttpUriRequest httpUriRequest, String str) {
        Object parameter;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("322de8cf", new Object[]{httpUriRequest, str});
        }
        try {
            HttpParams params = httpUriRequest.getParams();
            if (params == null || (parameter = params.getParameter(str)) == null) {
                return "";
            }
            params.removeParameter(str);
            if (parameter instanceof String) {
                str2 = (String) parameter;
            } else {
                LogCatUtil.warn("HttpClientUtils", "[removeParamter] parameter type = ".concat(parameter.getClass().getName()));
                str2 = parameter.toString();
            }
            return TextUtils.isEmpty(str2) ? "" : str2;
        } catch (Throwable th) {
            LogCatUtil.warn("HttpClientUtils", "removeParamter fail.", th);
            return "";
        }
    }
}
