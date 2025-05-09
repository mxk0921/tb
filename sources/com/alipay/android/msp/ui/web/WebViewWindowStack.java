package com.alipay.android.msp.ui.web;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WebViewWindowStack {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Stack<IWebViewWindow> f3734a = new Stack<>();

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!isEmpty()) {
            Iterator<IWebViewWindow> it = this.f3734a.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
            this.f3734a.clear();
        }
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.f3734a.isEmpty();
    }

    public IWebViewWindow popJsWebViewWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWebViewWindow) ipChange.ipc$dispatch("f7b4b4f5", new Object[]{this});
        }
        return this.f3734a.pop();
    }

    public void pushJsWebViewWindow(IWebViewWindow iWebViewWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3beed222", new Object[]{this, iWebViewWindow});
        } else {
            this.f3734a.push(iWebViewWindow);
        }
    }
}
