package com.taobao.themis.pub.splash;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.title.titlebar.TMSBaseTitleBar;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import tb.a90;
import tb.ckf;
import tb.e3n;
import tb.f3n;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/pub/splash/PubLoadingTitleBar;", "Lcom/taobao/themis/container/title/titlebar/TMSBaseTitleBar;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Ltb/xhv;", "attachPage", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "themis_pub_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubLoadingTitleBar extends TMSBaseTitleBar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(844103715);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubLoadingTitleBar(Context context) {
        super(context);
        ckf.g(context, "context");
        a();
    }

    public static /* synthetic */ Object ipc$super(PubLoadingTitleBar pubLoadingTitleBar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/splash/PubLoadingTitleBar");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c402d2", new Object[]{this});
            return;
        }
        getMTitleView().addLeftAction(new e3n());
        getMTitleView().addRightAction(new f3n());
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, tb.y0e
    public void attachPage(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        for (a90 a90Var : getMTitleView().getActions()) {
            a90Var.i(iTMSPage);
        }
    }
}
