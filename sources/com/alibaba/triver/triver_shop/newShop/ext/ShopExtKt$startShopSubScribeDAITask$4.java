package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.ckf;
import tb.d1a;
import tb.jpu;
import tb.npp;
import tb.ssq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$startShopSubScribeDAITask$4 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref$BooleanRef $alreadyPaused;
    public final /* synthetic */ Context $fragmentActivity;
    public final /* synthetic */ boolean $isSubScribe;
    public final /* synthetic */ ShopDataParser $shopData;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements DAICallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.tmall.android.dai.DAICallback
        public void onError(DAIError dAIError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("326e086b", new Object[]{this, dAIError});
            } else {
                npp.Companion.b(ckf.p("inshop_subscribe_guide dai error : ", dAIError == null ? null : Integer.valueOf(dAIError.errorCode)));
            }
        }

        @Override // com.tmall.android.dai.DAICallback
        public void onSuccess(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f85dc9a6", new Object[]{this, objArr});
                return;
            }
            ckf.g(objArr, "p0");
            npp.Companion.b(ckf.p("inshop_subscribe_guide dai success : ", objArr));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$startShopSubScribeDAITask$4(Ref$BooleanRef ref$BooleanRef, Context context, ShopDataParser shopDataParser, boolean z) {
        super(0);
        this.$alreadyPaused = ref$BooleanRef;
        this.$fragmentActivity = context;
        this.$shopData = shopDataParser;
        this.$isSubScribe = z;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$startShopSubScribeDAITask$4 shopExtKt$startShopSubScribeDAITask$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$startShopSubScribeDAITask$4");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (!this.$alreadyPaused.element && !((FragmentActivity) this.$fragmentActivity).isDestroyed() && !((FragmentActivity) this.$fragmentActivity).isFinishing()) {
            ShopDataParser shopDataParser = this.$shopData;
            boolean z = this.$isSubScribe;
            try {
                String N0 = shopDataParser.N0();
                DAI.runCompute("inshop_subscribe_guide", kotlin.collections.a.i(jpu.a("sellerId", N0 == null ? null : ssq.o(N0)), jpu.a("isSubscribe", Integer.valueOf(z ? 1 : 0))), new a());
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
        }
    }
}
