package com.alibaba.triver.triver_shop.shop2023.nativeview;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.inp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023PullDownHelper$attachTo$2 extends Lambda implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Shop2023PullDownHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023PullDownHelper$attachTo$2(Shop2023PullDownHelper shop2023PullDownHelper) {
        super(1);
        this.this$0 = shop2023PullDownHelper;
    }

    public static /* synthetic */ Object ipc$super(Shop2023PullDownHelper$attachTo$2 shop2023PullDownHelper$attachTo$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023PullDownHelper$attachTo$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z) {
        TUrlImageView x;
        TUrlImageView w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
            return;
        }
        TUrlImageView a2 = Shop2023PullDownHelper.a(this.this$0);
        String str = null;
        if (a2 != null) {
            inp g = this.this$0.g();
            a2.setImageUrl((g == null || (w = g.w()) == null) ? null : w.getImageUrl());
            TUrlImageView b = Shop2023PullDownHelper.b(this.this$0);
            if (b != null) {
                inp g2 = this.this$0.g();
                if (!(g2 == null || (x = g2.x()) == null)) {
                    str = x.getImageUrl();
                }
                b.setImageUrl(str);
                return;
            }
            ckf.y("ivMore");
            throw null;
        }
        ckf.y("ivBack");
        throw null;
    }
}
