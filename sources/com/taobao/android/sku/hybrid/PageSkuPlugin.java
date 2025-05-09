package com.taobao.android.sku.hybrid;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PageSkuPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "Page_Sku";
    private b mSkuExecutor = new b();

    static {
        t2o.a(442499201);
    }

    public static /* synthetic */ Object ipc$super(PageSkuPlugin pageSkuPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/hybrid/PageSkuPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        return this.mSkuExecutor.d(str, str2, wVCallBackContext);
    }
}
