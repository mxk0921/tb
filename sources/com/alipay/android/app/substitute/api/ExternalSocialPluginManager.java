package com.alipay.android.app.substitute.api;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExternalSocialPluginManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ExternalSocialPluginManager b = new ExternalSocialPluginManager();

    /* renamed from: a  reason: collision with root package name */
    public IExternalSocialPlugin f3506a;

    public static ExternalSocialPluginManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExternalSocialPluginManager) ipChange.ipc$dispatch("74067886", new Object[0]);
        }
        return b;
    }

    public IExternalSocialPlugin getSocialPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IExternalSocialPlugin) ipChange.ipc$dispatch("4f0bcc3f", new Object[]{this});
        }
        return this.f3506a;
    }

    public void registerSocialPlugin(IExternalSocialPlugin iExternalSocialPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf63b788", new Object[]{this, iExternalSocialPlugin});
        } else {
            this.f3506a = iExternalSocialPlugin;
        }
    }

    public void unRegisterSocialPlugin(IExternalSocialPlugin iExternalSocialPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30db8a6f", new Object[]{this, iExternalSocialPlugin});
        } else if (iExternalSocialPlugin == this.f3506a) {
            this.f3506a = null;
        }
    }
}
