package com.alibaba.security.realidentity.biz.biometrics;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.common.http.model.HttpRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EventRequest extends HttpRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String eventCode;
    public String eventData;
    public String name;
    @JSONField(serialize = false)
    public boolean sessionless;

    public EventRequest(String str, String str2, boolean z) {
        super(str, str2);
        this.sessionless = z;
    }

    public static /* synthetic */ Object ipc$super(EventRequest eventRequest, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/biz/biometrics/EventRequest");
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public String apiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3948e054", new Object[]{this});
        }
        if (!this.sessionless) {
            return "mtop.verifycenter.rp.event";
        }
        return "mtop.verifycenter.rp.event.sessionless";
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public Class classType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("ac7cbb06", new Object[]{this});
        }
        return EventHttpResponse.class;
    }
}
