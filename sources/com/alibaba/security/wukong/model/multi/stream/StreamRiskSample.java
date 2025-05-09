package com.alibaba.security.wukong.model.multi.stream;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.meta.Data;
import com.alibaba.security.wukong.model.multi.MultiModelRiskSample;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class StreamRiskSample<T extends Data> extends MultiModelRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public StreamRiskSample(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(StreamRiskSample streamRiskSample, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/multi/stream/StreamRiskSample");
    }

    public void detect(CcrcService ccrcService, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314a9ddc", new Object[]{this, ccrcService, t});
        } else {
            detect(ccrcService, t, true);
        }
    }

    public abstract void detect(CcrcService ccrcService, T t, boolean z);

    public StreamRiskSample(String str, Map<String, Object> map) {
        super(str, map);
    }
}
