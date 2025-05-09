package com.taobao.android.sku.hybrid;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.hybrid.a;
import com.taobao.android.sku.utils.SkuLogUtils;
import tb.g3q;
import tb.kpw;
import tb.kxf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TicketPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "TBDetailTicketSkuView";

    static {
        t2o.a(442499206);
    }

    public static /* synthetic */ Object ipc$super(TicketPlugin ticketPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/hybrid/TicketPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        SkuLogUtils.x("TicketPlugin.execute");
        a.C0485a a2 = a.a();
        if (a2 == null || a2.f9447a != null || !"doBuy".equals(str)) {
            return false;
        }
        g3q g3qVar = a2.f9447a;
        g3qVar.a(5, kxf.a(str2));
        g3qVar.a(3, null);
        return true;
    }
}
