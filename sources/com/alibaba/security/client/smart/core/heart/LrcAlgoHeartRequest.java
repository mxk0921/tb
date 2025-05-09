package com.alibaba.security.client.smart.core.heart;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.AbstractC1173k;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
@AbstractC1173k(apiName = "mtop.alibaba.lrc.sdk.heartbeat")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LrcAlgoHeartRequest extends BaseRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, Object> mRequestMap;

    public LrcAlgoHeartRequest(String str, Map<String, Object> map) {
        super(str);
        this.mRequestMap = map;
    }

    public static /* synthetic */ Object ipc$super(LrcAlgoHeartRequest lrcAlgoHeartRequest, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/client/smart/core/heart/LrcAlgoHeartRequest");
    }

    @Override // com.alibaba.security.ccrc.common.http.model.BaseRequest
    public String body() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("270aae97", new Object[]{this});
        }
        return JsonUtils.toJSONString(this.mRequestMap);
    }
}
