package com.taobao.mytaobao.homepage.plugin;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kgj;
import tb.kpw;
import tb.s32;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MytaobaoRereshPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537739);
    }

    public static /* synthetic */ Object ipc$super(MytaobaoRereshPlugin mytaobaoRereshPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/homepage/plugin/MytaobaoRereshPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        s32 c = s32.c();
        c.i("MytaobaoRereshPlugin.execute," + str);
        if ("refresh".equals(str)) {
            kgj.b(true, kgj.ACTION_REFRESH_PAGE, new String[0]);
            return true;
        } else if (!"forceRefreshWhenShow".equals(str)) {
            return false;
        } else {
            kgj.b(true, kgj.ACTION_REFRESH_PAGE_WHEN_SHOW, new String[0]);
            return true;
        }
    }
}
