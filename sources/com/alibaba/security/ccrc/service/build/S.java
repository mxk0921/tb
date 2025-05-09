package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@M(name = {"bhDeactivate"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class S extends K {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(S s, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/S");
    }

    @Override // com.alibaba.security.ccrc.service.build.K
    public boolean a(Context context, String str, String str2, L l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ddda4f0", new Object[]{this, context, str, str2, l})).booleanValue();
        }
        String str3 = (String) JsonUtils.toMap(str2).get("ccrcCode");
        if (TextUtils.isEmpty(str3)) {
            K.a(l, "参数异常", null);
            return true;
        }
        CcrcBHService.getBHService(str3).deActivate();
        K.a(l, null);
        return true;
    }
}
