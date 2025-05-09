package com.alipay.sdk.m.f;

import com.alipay.sdk.auth.widget.WebViewWindow;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Stack<WebViewWindow> f4535a = new Stack<>();

    public void a(WebViewWindow webViewWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899101be", new Object[]{this, webViewWindow});
        } else {
            this.f4535a.push(webViewWindow);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return this.f4535a.isEmpty();
    }

    public WebViewWindow c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebViewWindow) ipChange.ipc$dispatch("e0c36002", new Object[]{this});
        }
        return this.f4535a.pop();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!b()) {
            Iterator<WebViewWindow> it = this.f4535a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f4535a.clear();
        }
    }
}
