package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.meta.Data;
import com.alibaba.security.wukong.model.multi.stream.StreamRiskSample;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class Ib<T extends StreamRiskSample, D extends Data> extends Hb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(Ib ib, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Ib");
    }

    public abstract void a(CcrcService ccrcService, T t, D d);
}
