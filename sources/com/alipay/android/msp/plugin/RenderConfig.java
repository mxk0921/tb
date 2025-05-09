package com.alipay.android.msp.plugin;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RenderConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isPreRend;
    public RenderTime mRenderTime;
    public ITemplateLoadedCallback mTemplateLoadedCallback;

    public RenderConfig(boolean z) {
        this.isPreRend = z;
    }

    public void setRenderTime(RenderTime renderTime) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42082fb8", new Object[]{this, renderTime});
        } else {
            this.mRenderTime = renderTime;
        }
    }

    public RenderConfig setTemplateLoadedCallback(ITemplateLoadedCallback iTemplateLoadedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderConfig) ipChange.ipc$dispatch("c8ef1a06", new Object[]{this, iTemplateLoadedCallback});
        }
        this.mTemplateLoadedCallback = iTemplateLoadedCallback;
        return this;
    }
}
