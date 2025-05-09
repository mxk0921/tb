package com.alibaba.triver.triver_shop.newShop.view.embed;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class WebSwipeBigCardComponent$init$1 extends FunctionReferenceImpl implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public WebSwipeBigCardComponent$init$1(WebSwipeBigCardComponent webSwipeBigCardComponent) {
        super(1, webSwipeBigCardComponent, WebSwipeBigCardComponent.class, "updateIndexFromWeb", "updateIndexFromWeb(I)V", 0);
    }

    public static /* synthetic */ Object ipc$super(WebSwipeBigCardComponent$init$1 webSwipeBigCardComponent$init$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/embed/WebSwipeBigCardComponent$init$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num) {
        invoke(num.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
        } else {
            ((WebSwipeBigCardComponent) this.receiver).y(i);
        }
    }
}
