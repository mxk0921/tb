package com.alibaba.security.client.smart.core.core;

import com.alibaba.security.ccrc.service.build.W;
import com.alibaba.security.client.smart.core.model.BxParseResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WukongBhNativeParser extends W {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WukongBhNativeParser wukongBhNativeParser, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/client/smart/core/core/WukongBhNativeParser");
    }

    private native BxParseResult nativeWukongBxFeatureProcess(List<String> list, String str);

    public BxParseResult a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BxParseResult) ipChange.ipc$dispatch("4cbcbe22", new Object[]{this, list, str});
        }
        if (!b()) {
            return null;
        }
        return nativeWukongBxFeatureProcess(list, str);
    }
}
