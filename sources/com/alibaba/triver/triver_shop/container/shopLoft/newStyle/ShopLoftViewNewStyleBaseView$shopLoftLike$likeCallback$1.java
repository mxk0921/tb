package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.view.View;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import kotlin.jvm.internal.Lambda;
import tb.brf;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.jpu;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1 extends Lambda implements g1a<String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $ifLike;
    public final /* synthetic */ ShopLoftViewNewStyleBaseView this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean $ifLike;
        public final /* synthetic */ String $likeCountStr;
        public final /* synthetic */ ShopLoftViewNewStyleBaseView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShopLoftViewNewStyleBaseView shopLoftViewNewStyleBaseView, boolean z, String str) {
            super(0);
            this.this$0 = shopLoftViewNewStyleBaseView;
            this.$ifLike = z;
            this.$likeCountStr = str;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            DinamicXEngine f = this.this$0.v().f();
            View p = this.this$0.p();
            if (p != null) {
                ShopExtKt.x0(f, p, brf.a(jpu.a("ifLike", String.valueOf(!this.$ifLike)), jpu.a("likeCountStr", this.$likeCountStr)));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1(ShopLoftViewNewStyleBaseView shopLoftViewNewStyleBaseView, boolean z) {
        super(1);
        this.this$0 = shopLoftViewNewStyleBaseView;
        this.$ifLike = z;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1 shopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1");
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
        ckf.g(str, "likeCountStr");
        r54.C(new AnonymousClass1(this.this$0, this.$ifLike, str));
    }
}
