package com.taobao.themis.pub.titlebar;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub.titlebar.action.PubMoreCloseAction;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import com.taobao.themis.pub_kit.guide.PubAddIconGuide;
import com.taobao.themis.pub_kit.guide.model.PubNavBarModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.fbs;
import tb.lqw;
import tb.qml;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubTitleBar$initTitleBarActions$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ITMSPage $page;
    public final /* synthetic */ PubUserGuideModule $pubUserGuideModule;
    public final /* synthetic */ PubTitleBar this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements PubAddIconGuide.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PubTitleBar f13702a;
        public final /* synthetic */ ITMSPage b;

        public a(PubTitleBar pubTitleBar, ITMSPage iTMSPage) {
            this.f13702a = pubTitleBar;
            this.b = iTMSPage;
        }

        @Override // com.taobao.themis.pub_kit.guide.PubAddIconGuide.b
        public final void onDismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
                return;
            }
            PubMoreCloseAction pubMoreCloseAction = (PubMoreCloseAction) this.f13702a.getAction(PubMoreCloseAction.class);
            if (pubMoreCloseAction != null) {
                pubMoreCloseAction.E();
            }
            PubContainerContext g = fbs.g(this.b.getInstance());
            if (g != null) {
                g.setAddIconGuideIsShowing(false);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubTitleBar$initTitleBarActions$1(PubUserGuideModule pubUserGuideModule, PubTitleBar pubTitleBar, ITMSPage iTMSPage) {
        super(0);
        this.$pubUserGuideModule = pubUserGuideModule;
        this.this$0 = pubTitleBar;
        this.$page = iTMSPage;
    }

    public static /* synthetic */ Object ipc$super(PubTitleBar$initTitleBarActions$1 pubTitleBar$initTitleBarActions$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/titlebar/PubTitleBar$initTitleBarActions$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PubContainerContext g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        PubUserGuideModule pubUserGuideModule = this.$pubUserGuideModule;
        if (pubUserGuideModule != null) {
            PubNavBarModel navbar = pubUserGuideModule.getNavbar();
            if (navbar == null) {
                navbar = new PubNavBarModel();
            }
            if (navbar.getEnableAddIconButton()) {
                PubTitleBar.access$initAddIconAction(this.this$0, this.$page, this.$pubUserGuideModule);
            }
            PubTitleBar.access$initRecommendGuide(this.this$0, this.$page, this.$pubUserGuideModule);
            lqw.d().b(PubTitleBar.access$getMAddIconStatusEventListener$p(this.this$0));
            if (qml.z(this.$page)) {
                PubTitleBar.access$initPopWindows(this.this$0, this.$page, this.$pubUserGuideModule);
                return;
            }
            PubContainerContext g2 = fbs.g(this.$page.getInstance());
            if ((g2 == null ? null : g2.getPubAddIconGuide()) == null && (g = fbs.g(this.$page.getInstance())) != null) {
                g.setPubAddIconGuide(new PubAddIconGuide(PubTitleBar.access$getMContext(this.this$0), this.$pubUserGuideModule, PubTitleBar.access$getMHomePagePopDataList$p(this.this$0), new a(this.this$0, this.$page)));
            }
        }
    }
}
