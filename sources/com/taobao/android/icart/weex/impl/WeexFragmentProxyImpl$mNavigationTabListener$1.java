package com.taobao.android.icart.weex.impl;

import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragment;
import com.taobao.android.icart.weex.dialog.DebugDialog;
import tb.c9x;
import tb.ckf;
import tb.cw6;
import tb.j2e;
import tb.ypj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class WeexFragmentProxyImpl$mNavigationTabListener$1 implements ypj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeexFragmentProxyImpl f8065a;

    public WeexFragmentProxyImpl$mNavigationTabListener$1(WeexFragmentProxyImpl weexFragmentProxyImpl) {
        this.f8065a = weexFragmentProxyImpl;
    }

    @Override // tb.ypj
    public void onCurrentTabClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77f6793", new Object[]{this});
            return;
        }
        j2e H = WeexFragmentProxyImpl.H(this.f8065a);
        if (H != null) {
            j2e.a.a(H, "listTop", null, 2, null);
        }
    }

    @Override // tb.ypj
    public void onCurrentTabDoubleTap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c22ad2be", new Object[]{this});
        }
    }

    @Override // tb.ypj
    public void onCurrentTabLongClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79eae8f7", new Object[]{this});
        } else if (cw6.b()) {
            BaseICartFragment G = WeexFragmentProxyImpl.G(this.f8065a);
            ckf.f(G, "mFragment");
            FragmentActivity activity = G.getActivity();
            ckf.d(activity);
            new DebugDialog(activity).d(new WeexFragmentProxyImpl$mNavigationTabListener$1$onCurrentTabLongClicked$1(this)).e(c9x.Companion.a());
        }
    }

    @Override // tb.ypj
    public void onNavigationTabMessageChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd5f3e0", new Object[]{this, str});
        }
    }
}
