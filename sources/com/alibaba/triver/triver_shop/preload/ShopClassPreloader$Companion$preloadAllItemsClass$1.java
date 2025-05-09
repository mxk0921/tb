package com.alibaba.triver.triver_shop.preload;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.olo;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopClassPreloader$Companion$preloadAllItemsClass$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ShopClassPreloader$Companion$preloadAllItemsClass$1 INSTANCE = new ShopClassPreloader$Companion$preloadAllItemsClass$1();

    public ShopClassPreloader$Companion$preloadAllItemsClass$1() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(ShopClassPreloader$Companion$preloadAllItemsClass$1 shopClassPreloader$Companion$preloadAllItemsClass$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/preload/ShopClassPreloader$Companion$preloadAllItemsClass$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            new olo(false);
        }
    }
}
