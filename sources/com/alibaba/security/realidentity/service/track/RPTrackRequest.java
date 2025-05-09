package com.alibaba.security.realidentity.service.track;

import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.realidentity.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RPTrackRequest extends HttpRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RPTrackHttpModel request;

    public RPTrackRequest(String str, String str2) {
        super(str, str2);
    }

    public static /* synthetic */ Object ipc$super(RPTrackRequest rPTrackRequest, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/service/track/RPTrackRequest");
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public String apiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3948e054", new Object[]{this});
        }
        return "mtop.verifycenter.rp.log";
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public String body() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("270aae97", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request", b.a(this.request));
        return b.a((Object) hashMap);
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public Class classType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("ac7cbb06", new Object[]{this});
        }
        return Object.class;
    }

    public RPTrackHttpModel getRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RPTrackHttpModel) ipChange.ipc$dispatch("9e7177ee", new Object[]{this});
        }
        return this.request;
    }

    public void setRequest(RPTrackHttpModel rPTrackHttpModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e188acc", new Object[]{this, rPTrackHttpModel});
        } else {
            this.request = rPTrackHttpModel;
        }
    }
}
