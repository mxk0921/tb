package com.alibaba.triver.triver_shop.newShop.view.component;

import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.remote.view.RemoteLoadingView;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.npp;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipContentComponentV2$openTab3$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ RemoteLoadingView $remoteLoadingView;
    public final /* synthetic */ FlagShipContentComponentV2 this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV2$openTab3$2$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ RemoteLoadingView $remoteLoadingView;
        public final /* synthetic */ FlagShipContentComponentV2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FlagShipContentComponentV2 flagShipContentComponentV2, RemoteLoadingView remoteLoadingView) {
            super(0);
            this.this$0 = flagShipContentComponentV2;
            this.$remoteLoadingView = remoteLoadingView;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV2$openTab3$2$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            MarginSupportFrameLayout s1 = FlagShipContentComponentV2.s1(this.this$0);
            if (s1 != null) {
                s1.removeView(this.$remoteLoadingView);
                MarginSupportFrameLayout s12 = FlagShipContentComponentV2.s1(this.this$0);
                if (s12 != null) {
                    kew.a(s12, ShopExtKt.u(this.this$0.n()));
                } else {
                    ckf.y("tab3Container");
                    throw null;
                }
            } else {
                ckf.y("tab3Container");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV2$openTab3$2(FlagShipContentComponentV2 flagShipContentComponentV2, RemoteLoadingView remoteLoadingView) {
        super(0);
        this.this$0 = flagShipContentComponentV2;
        this.$remoteLoadingView = remoteLoadingView;
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV2$openTab3$2 flagShipContentComponentV2$openTab3$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV2$openTab3$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        npp.Companion.b("tab3 show error , widget sdk remote failed");
        r54.C(new AnonymousClass1(this.this$0, this.$remoteLoadingView));
    }
}
