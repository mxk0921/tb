package com.alibaba.triver.triver_shop.newShop.view;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.ut.mini.UTAnalytics;
import java.util.Hashtable;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Tab3LiveContentRender$onViewSelectedByViewPager$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Tab3LiveContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab3LiveContentRender$onViewSelectedByViewPager$1(Tab3LiveContentRender tab3LiveContentRender) {
        super(0);
        this.this$0 = tab3LiveContentRender;
    }

    public static /* synthetic */ Object ipc$super(Tab3LiveContentRender$onViewSelectedByViewPager$1 tab3LiveContentRender$onViewSelectedByViewPager$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/Tab3LiveContentRender$onViewSelectedByViewPager$1");
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
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(Tab3LiveContentRender.q(this.this$0));
        Tab3LiveContentRender tab3LiveContentRender = this.this$0;
        try {
            String pageSpmUrl = UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl((Activity) Tab3LiveContentRender.q(tab3LiveContentRender));
            npp.Companion.b(ckf.p("tab3 live get spm url : ", pageSpmUrl));
            TaoliveOpenLiveRoom y = Tab3LiveContentRender.y(tab3LiveContentRender);
            if (y != null) {
                PlatformListenerEnum platformListenerEnum = PlatformListenerEnum.updateUserTrackData;
                Hashtable hashtable = new Hashtable();
                hashtable.put("spm-url", pageSpmUrl);
                hashtable.put("entrySpm", pageSpmUrl);
                xhv xhvVar = xhv.INSTANCE;
                y.callPlatform(platformListenerEnum, hashtable);
            }
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
