package com.alibaba.security.ccrc.common.http.model;

import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.build.C1171ja;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseRequest implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String ccrcCode;
    public String clientInfo = JsonUtils.toJSONString(C1171ja.a(CcrcContextImpl.getContext()));
    public String pId;

    public BaseRequest(String str) {
        this.ccrcCode = str;
    }

    public String body() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("270aae97", new Object[]{this});
        }
        return JsonUtils.toJSONString(this);
    }
}
