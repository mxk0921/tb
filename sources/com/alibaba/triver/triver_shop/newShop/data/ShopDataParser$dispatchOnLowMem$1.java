package com.alibaba.triver.triver_shop.newShop.data;

import android.content.ComponentCallbacks2;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopDataParser$dispatchOnLowMem$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopDataParser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopDataParser$dispatchOnLowMem$1(ShopDataParser shopDataParser) {
        super(0);
        this.this$0 = shopDataParser;
    }

    public static /* synthetic */ Object ipc$super(ShopDataParser$dispatchOnLowMem$1 shopDataParser$dispatchOnLowMem$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/data/ShopDataParser$dispatchOnLowMem$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        try {
            Iterator it = ShopDataParser.a(this.this$0).iterator();
            while (it.hasNext()) {
                ((ComponentCallbacks2) it.next()).onLowMemory();
                Throwable th = Result.m1111exceptionOrNullimpl(Result.m1108constructorimpl(xhv.INSTANCE));
                if (th != null) {
                    npp.Companion.c("catching block has error", th);
                }
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th2) {
            obj = Result.m1108constructorimpl(b.a(th2));
        }
        Throwable th3 = Result.m1111exceptionOrNullimpl(obj);
        if (th3 != null) {
            npp.Companion.c("catching block has error", th3);
        }
    }
}
