package com.taobao.android.tbelder.jsplugins;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbelder.TBElder;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBElderWXModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "TBElder";

    public static /* synthetic */ Object ipc$super(TBElderWXModule tBElderWXModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbelder/jsplugins/TBElderWXModule");
    }

    @JSMethod(uiThread = false)
    public boolean isElderFont() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("843ec47a", new Object[]{this})).booleanValue();
        }
        return TBElder.b();
    }

    @JSMethod(uiThread = false)
    public boolean isElderHome() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5178e50a", new Object[]{this})).booleanValue();
        }
        return TBElder.c();
    }
}
