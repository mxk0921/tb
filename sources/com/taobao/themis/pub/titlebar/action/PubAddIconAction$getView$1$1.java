package com.taobao.themis.pub.titlebar.action;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.pub_kit.widget.PubAddIconActionView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import tb.bbs;
import tb.ckf;
import tb.fbs;
import tb.g1a;
import tb.jpu;
import tb.pl4;
import tb.tm2;
import tb.u3n;
import tb.v3n;
import tb.xhv;
import tb.y2n;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/taobao/themis/pub_kit/widget/PubAddIconActionView;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Lcom/taobao/themis/pub_kit/widget/PubAddIconActionView;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubAddIconAction$getView$1$1 extends Lambda implements g1a<PubAddIconActionView, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ PubAddIconAction this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubAddIconAction$getView$1$1(PubAddIconAction pubAddIconAction) {
        super(1);
        this.this$0 = pubAddIconAction;
    }

    public static /* synthetic */ Object ipc$super(PubAddIconAction$getView$1$1 pubAddIconAction$getView$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/titlebar/action/PubAddIconAction$getView$1$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(PubAddIconActionView pubAddIconActionView) {
        invoke2(pubAddIconActionView);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PubAddIconActionView pubAddIconActionView) {
        bbs instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974eddd0", new Object[]{this, pubAddIconActionView});
            return;
        }
        ckf.g(pubAddIconActionView, AdvanceSetting.NETWORK_TYPE);
        ITMSPage t = PubAddIconAction.t(this.this$0);
        if (!(t == null || (instance = t.getInstance()) == null)) {
            fbs.c(instance, new a(this.this$0));
        }
        PubUserGuideModule v = PubAddIconAction.v(this.this$0);
        if (v != null) {
            this.this$0.y(v);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements y2n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PubAddIconAction f13708a;

        public a(PubAddIconAction pubAddIconAction) {
            this.f13708a = pubAddIconAction;
        }

        @Override // tb.y2n.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule != null) {
                ITMSPage t = PubAddIconAction.t(this.f13708a);
                ckf.d(t);
                Pair a2 = jpu.a("miniapp_id", t.getInstance().L());
                Pair a3 = jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule));
                Pair a4 = jpu.a("spm", "Page_MiniApp.1.NavBar.2");
                ITMSPage t2 = PubAddIconAction.t(this.f13708a);
                ckf.d(t2);
                Pair a5 = jpu.a(pl4.KEY_PAGE_ID, t2.getPageParams().e().g());
                ITMSPage t3 = PubAddIconAction.t(this.f13708a);
                ckf.d(t3);
                v3n.a("Page_MiniApp_Button-NavBar-2", kotlin.collections.a.k(a2, a3, a4, a5, jpu.a("pageUrl", t3.c())));
            }
        }
    }
}
