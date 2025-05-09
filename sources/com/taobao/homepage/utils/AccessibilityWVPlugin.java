package com.taobao.homepage.utils;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.u60;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AccessibilityWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809127);
    }

    private void doAccessibilityCheck(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39116153", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.a("isOpen", Boolean.valueOf(u60.d(this.mContext)));
        wVCallBackContext.success(nswVar);
    }

    public static /* synthetic */ Object ipc$super(AccessibilityWVPlugin accessibilityWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/utils/AccessibilityWVPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"isScreenReaderOpen".equals(str)) {
            return false;
        }
        doAccessibilityCheck(str2, wVCallBackContext);
        return true;
    }
}
