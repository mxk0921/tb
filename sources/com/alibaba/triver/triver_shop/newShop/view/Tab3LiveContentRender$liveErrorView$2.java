package com.alibaba.triver.triver_shop.newShop.view;

import android.view.View;
import android.widget.TextView;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.mop;
import tb.npp;
import tb.vpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Tab3LiveContentRender$liveErrorView$2 extends Lambda implements d1a<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Tab3LiveContentRender this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Tab3LiveContentRender f3167a;

        public a(Tab3LiveContentRender tab3LiveContentRender) {
            this.f3167a = tab3LiveContentRender;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            npp.Companion.b("tab3 click retry");
            TaoliveOpenLiveRoom y = Tab3LiveContentRender.y(this.f3167a);
            if (y != null) {
                y.callPlatform(PlatformListenerEnum.callVideoStart, new Object[0]);
            }
            Tab3LiveContentRender.A(this.f3167a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Tab3LiveContentRender f3168a;

        public b(Tab3LiveContentRender tab3LiveContentRender) {
            this.f3168a = tab3LiveContentRender;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            vpd I;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            npp.Companion.b("tab3 click goHomePage");
            ShopDataParser o = Tab3LiveContentRender.x(this.f3168a).o();
            if (o != null && (I = o.I()) != null) {
                I.d(mop.KEY_SHOP_INDEX, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab3LiveContentRender$liveErrorView$2(Tab3LiveContentRender tab3LiveContentRender) {
        super(0);
        this.this$0 = tab3LiveContentRender;
    }

    public static /* synthetic */ Object ipc$super(Tab3LiveContentRender$liveErrorView$2 tab3LiveContentRender$liveErrorView$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/Tab3LiveContentRender$liveErrorView$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final View invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("287bc381", new Object[]{this});
        }
        View inflate = View.inflate(Tab3LiveContentRender.q(this.this$0), R.layout.view_tab3_live_error_layout, null);
        ((TextView) inflate.findViewById(R.id.shop_live_retry_text)).setOnClickListener(new a(this.this$0));
        ((TextView) inflate.findViewById(R.id.shop_live_go_home_page_text)).setOnClickListener(new b(this.this$0));
        return inflate;
    }
}
