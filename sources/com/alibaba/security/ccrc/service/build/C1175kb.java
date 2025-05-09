package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import com.alibaba.security.wukong.config.Algo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.kb  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1175kb extends AbstractC1172jb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public C1175kb(Context context, Algo algo, AbstractC1157eb ebVar) {
        super(context, algo, ebVar);
    }

    public static /* synthetic */ Object ipc$super(C1175kb kbVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/kb");
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1172jb
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        return null;
    }
}
