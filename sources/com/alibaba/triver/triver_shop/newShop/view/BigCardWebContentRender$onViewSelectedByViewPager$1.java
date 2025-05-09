package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class BigCardWebContentRender$onViewSelectedByViewPager$1 extends FunctionReferenceImpl implements g1a<String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BigCardWebContentRender$onViewSelectedByViewPager$1(BigCardWebContentRender bigCardWebContentRender) {
        super(1, bigCardWebContentRender, BigCardWebContentRender.class, "sendWebEvent", "sendWebEvent(Ljava/lang/String;)V", 0);
    }

    public static /* synthetic */ Object ipc$super(BigCardWebContentRender$onViewSelectedByViewPager$1 bigCardWebContentRender$onViewSelectedByViewPager$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/BigCardWebContentRender$onViewSelectedByViewPager$1");
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
        ckf.g(str, "p0");
        BigCardWebContentRender.b((BigCardWebContentRender) this.receiver, str);
    }
}
