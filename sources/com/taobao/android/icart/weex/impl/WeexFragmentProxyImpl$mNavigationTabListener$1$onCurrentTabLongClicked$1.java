package com.taobao.android.icart.weex.impl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.c9x;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Ltb/xhv;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class WeexFragmentProxyImpl$mNavigationTabListener$1$onCurrentTabLongClicked$1 extends Lambda implements g1a<String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WeexFragmentProxyImpl$mNavigationTabListener$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexFragmentProxyImpl$mNavigationTabListener$1$onCurrentTabLongClicked$1(WeexFragmentProxyImpl$mNavigationTabListener$1 weexFragmentProxyImpl$mNavigationTabListener$1) {
        super(1);
        this.this$0 = weexFragmentProxyImpl$mNavigationTabListener$1;
    }

    public static /* synthetic */ Object ipc$super(WeexFragmentProxyImpl$mNavigationTabListener$1$onCurrentTabLongClicked$1 weexFragmentProxyImpl$mNavigationTabListener$1$onCurrentTabLongClicked$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/impl/WeexFragmentProxyImpl$mNavigationTabListener$1$onCurrentTabLongClicked$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(String str) {
        invoke2(str);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, str});
            return;
        }
        c9x.a aVar = c9x.Companion;
        if (str == null) {
            str = "";
        }
        aVar.d(str);
        BaseICartFragment G = WeexFragmentProxyImpl.G(this.this$0.f8065a);
        BaseICartFragment G2 = WeexFragmentProxyImpl.G(this.this$0.f8065a);
        ckf.f(G2, "mFragment");
        G.u2(new WeexFragmentProxyImpl(G2, WeexFragmentProxyImpl.F(this.this$0.f8065a), WeexFragmentProxyImpl.I(this.this$0.f8065a)));
    }
}
