package com.alibaba.triver.triver_shop.shop2023;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.bdw;
import tb.ckf;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Default2023Shop$onContentPageStartScroll$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Default2023Shop this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Default2023Shop f3287a;

        public a(Default2023Shop default2023Shop) {
            this.f3287a = default2023Shop;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$onContentPageStartScroll$1$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            Default2023Shop.Z1(this.f3287a, false);
            Default2023Shop.X1(this.f3287a, true);
            d1a k1 = Default2023Shop.k1(this.f3287a);
            Default2023Shop.Y1(this.f3287a, null);
            if (k1 != null) {
                k1.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Default2023Shop$onContentPageStartScroll$1(Default2023Shop default2023Shop) {
        super(0);
        this.this$0 = default2023Shop;
    }

    public static /* synthetic */ Object ipc$super(Default2023Shop$onContentPageStartScroll$1 default2023Shop$onContentPageStartScroll$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$onContentPageStartScroll$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ViewGroup i1 = Default2023Shop.i1(this.this$0);
        if (i1 != null) {
            ViewGroup i12 = Default2023Shop.i1(this.this$0);
            if (i12 != null) {
                bdw.f(i1, i12.getHeight(), 0L, new a(this.this$0), 2, null).start();
            } else {
                ckf.y("bottomBarContainer");
                throw null;
            }
        } else {
            ckf.y("bottomBarContainer");
            throw null;
        }
    }
}
