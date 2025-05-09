package com.taobao.search.musie;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.tao.timestamp.TimeStampManager;
import tb.ckf;
import tb.pvh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MUSSearchTimeModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792638);
    }

    public MUSSearchTimeModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(MUSSearchTimeModule mUSSearchTimeModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSSearchTimeModule");
    }

    @MUSMethod
    public final void getTime(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e669633", new Object[]{this, pvhVar});
            return;
        }
        ckf.g(pvhVar, "callback");
        pvhVar.b(String.valueOf(TimeStampManager.instance().getCurrentTimeStamp() / 1000));
    }
}
