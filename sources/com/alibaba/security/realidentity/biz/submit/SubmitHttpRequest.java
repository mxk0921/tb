package com.alibaba.security.realidentity.biz.submit;

import com.alibaba.security.common.http.model.HttpRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SubmitHttpRequest extends HttpRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SubmitHttpRequest(String str, String str2) {
        super(str, str2);
    }

    public static /* synthetic */ Object ipc$super(SubmitHttpRequest submitHttpRequest, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/biz/submit/SubmitHttpRequest");
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public String apiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3948e054", new Object[]{this});
        }
        return "mtop.verifycenter.rp.submit";
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public Class classType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("ac7cbb06", new Object[]{this});
        }
        return SubmitHttpResponse.class;
    }
}
