package com.ta.utdid2.device;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.upload.HttpResponse;
import com.ta.audid.utils.UtdidLogger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UtdidResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(966787141);
    }

    public static boolean response(HttpResponse httpResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62d8a01c", new Object[]{httpResponse})).booleanValue();
        }
        try {
            str = new String(httpResponse.data, "UTF-8");
        } catch (Exception e) {
            Object[] objArr = {e};
            str = "";
            UtdidLogger.d(str, objArr);
        }
        if (HttpResponse.checkSignature(str, httpResponse.signature)) {
            return BizResponse.isSuccess(BizResponse.parseResult(str).code);
        }
        return false;
    }
}
