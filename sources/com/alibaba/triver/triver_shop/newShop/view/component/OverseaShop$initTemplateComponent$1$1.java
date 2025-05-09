package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final /* synthetic */ class OverseaShop$initTemplateComponent$1$1 extends FunctionReferenceImpl implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public OverseaShop$initTemplateComponent$1$1(OverseaShop overseaShop) {
        super(0, overseaShop, OverseaShop.class, "canGoBack", "canGoBack()Z", 0);
    }

    public static /* synthetic */ Object ipc$super(OverseaShop$initTemplateComponent$1$1 overseaShop$initTemplateComponent$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/OverseaShop$initTemplateComponent$1$1");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean, boolean] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue() : ((OverseaShop) this.receiver).c();
    }
}
