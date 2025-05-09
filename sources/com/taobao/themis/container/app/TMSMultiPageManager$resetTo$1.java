package com.taobao.themis.container.app;

import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kas;
import tb.qml;
import tb.tll;
import tb.x5d;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSMultiPageManager$resetTo$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ITMSPage $needPopPage;
    public final /* synthetic */ TMSMultiPageManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSMultiPageManager$resetTo$1(ITMSPage iTMSPage, TMSMultiPageManager tMSMultiPageManager) {
        super(0);
        this.$needPopPage = iTMSPage;
        this.this$0 = tMSMultiPageManager;
    }

    public static /* synthetic */ Object ipc$super(TMSMultiPageManager$resetTo$1 tMSMultiPageManager$resetTo$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/app/TMSMultiPageManager$resetTo$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        x5d pageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ITMSPage iTMSPage = this.$needPopPage;
        ckf.f(iTMSPage, "needPopPage");
        if (qml.z(iTMSPage)) {
            this.$needPopPage.destroy();
            View findViewById = TMSMultiPageManager.h(this.this$0).findViewById(R.id.tms_fragment_container);
            ckf.f(findViewById, "mActivity.findViewById(R…d.tms_fragment_container)");
            RelativeLayout relativeLayout = (RelativeLayout) findViewById;
            tll pageContext = this.$needPopPage.getPageContext();
            View view = null;
            if (!(pageContext == null || (pageContainer = pageContext.getPageContainer()) == null)) {
                view = pageContainer.getView();
            }
            relativeLayout.removeView(view);
            return;
        }
        kas i = TMSMultiPageManager.i(this.this$0);
        ITMSPage iTMSPage2 = this.$needPopPage;
        ckf.f(iTMSPage2, "needPopPage");
        i.j(iTMSPage2, false);
    }
}
