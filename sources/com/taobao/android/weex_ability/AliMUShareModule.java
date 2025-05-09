package com.taobao.android.weex_ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.e5x;
import tb.lpd;
import tb.pvh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AliMUShareModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "share";

    static {
        t2o.a(980418563);
    }

    public AliMUShareModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(AliMUShareModule aliMUShareModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/AliMUShareModule");
    }

    @MUSMethod(uiThread = true)
    public void doShare(String str, pvh pvhVar) {
        lpd d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21fae34e", new Object[]{this, str, pvhVar});
        } else if (!getInstance().isDestroyed() && (d = e5x.b().d()) != null) {
            d.a(getInstance().getUIContext(), str, pvhVar);
        }
    }
}
