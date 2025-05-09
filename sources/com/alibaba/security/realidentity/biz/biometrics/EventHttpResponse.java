package com.alibaba.security.realidentity.biz.biometrics;

import com.alibaba.security.common.http.model.HttpResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EventHttpResponse extends HttpResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> result;

    public static /* synthetic */ Object ipc$super(EventHttpResponse eventHttpResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/biz/biometrics/EventHttpResponse");
    }

    @Override // com.alibaba.security.common.http.model.HttpResponse
    public boolean isSuccessful() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("349bd9ef", new Object[]{this})).booleanValue();
        }
        Map<String, Object> map = this.result;
        if (map == null || map.isEmpty()) {
            return false;
        }
        return true;
    }
}
