package com.taobao.tmgcashier.constant;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum TMGCashierRenderType {
    RENDER_TYPE_WEEX;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TMGCashierRenderType tMGCashierRenderType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tmgcashier/constant/TMGCashierRenderType");
    }

    public static TMGCashierRenderType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMGCashierRenderType) ipChange.ipc$dispatch("4c3aafa1", new Object[]{str});
        }
        return (TMGCashierRenderType) Enum.valueOf(TMGCashierRenderType.class, str);
    }
}
