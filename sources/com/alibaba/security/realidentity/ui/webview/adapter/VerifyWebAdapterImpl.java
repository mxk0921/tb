package com.alibaba.security.realidentity.ui.webview.adapter;

import android.content.Context;
import com.alibaba.security.realidentity.n;
import com.android.alibaba.ip.runtime.IpChange;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class VerifyWebAdapterImpl implements IVerifyWebAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private boolean isUseSysH5Container() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1aa7750f", new Object[]{this})).booleanValue();
        }
        if (2 == n.h.intValue()) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.security.realidentity.ui.webview.adapter.IVerifyWebAdapter
    public BaseWebViewProxy getWebViewType(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseWebViewProxy) ipChange.ipc$dispatch("e15d986d", new Object[]{this, context, str});
        }
        if (isUseSysH5Container()) {
            return getSysWebViewProvider(context, str);
        }
        return new WindvaneProvider().of(context, str);
    }

    public static BaseWebViewProxy getSysWebViewProvider(Context context, String str) {
        try {
            Object newInstance = Class.forName("com.alibaba.security.realidentity.mfa.web.view.SysWebViewProvider").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            return (BaseWebViewProxy) newInstance.getClass().getMethod(pg1.ATOM_of, Context.class, String.class).invoke(newInstance, context, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
