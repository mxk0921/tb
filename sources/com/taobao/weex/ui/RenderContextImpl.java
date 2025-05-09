package com.taobao.weex.ui;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.dom.RenderContext;
import com.taobao.weex.ui.component.WXComponent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RenderContextImpl implements RenderContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, WXComponent> mRegistry = new ConcurrentHashMap();
    private WXSDKInstance mWXSDKInstance;

    static {
        t2o.a(985661652);
        t2o.a(985661596);
    }

    public RenderContextImpl(WXSDKInstance wXSDKInstance) {
        this.mWXSDKInstance = wXSDKInstance;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mWXSDKInstance = null;
        try {
            this.mRegistry.clear();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.weex.dom.RenderContext
    public WXComponent getComponent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("bc2c2e3", new Object[]{this, str});
        }
        return this.mRegistry.get(str);
    }

    public int getComponentCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54936782", new Object[]{this})).intValue();
        }
        return this.mRegistry.size();
    }

    @Override // com.taobao.weex.dom.RenderContext
    public WXSDKInstance getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("19215a70", new Object[]{this});
        }
        return this.mWXSDKInstance;
    }

    public WXSDKInstance getWXSDKInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("169676dd", new Object[]{this});
        }
        return this.mWXSDKInstance;
    }

    public void registerComponent(String str, WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db753fd0", new Object[]{this, str, wXComponent});
        } else {
            this.mRegistry.put(str, wXComponent);
        }
    }

    @Override // com.taobao.weex.dom.RenderContext
    public WXComponent unregisterComponent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("a6e351c9", new Object[]{this, str});
        }
        return this.mRegistry.remove(str);
    }
}
