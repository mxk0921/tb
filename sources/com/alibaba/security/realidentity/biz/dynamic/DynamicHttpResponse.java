package com.alibaba.security.realidentity.biz.dynamic;

import android.text.TextUtils;
import com.alibaba.security.common.http.model.HttpResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DynamicHttpResponse extends HttpResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String result;

    public static /* synthetic */ Object ipc$super(DynamicHttpResponse dynamicHttpResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/biz/dynamic/DynamicHttpResponse");
    }

    @Override // com.alibaba.security.common.http.model.HttpResponse
    public boolean isSuccessful() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("349bd9ef", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.result);
    }
}
