package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.splash.entity.ErrorInfo;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import com.taobao.uikit.extend.component.error.Error;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltb/gas;", "Ltb/a3c;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class gas implements a3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TBErrorViewWidget f19838a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f19839a;
        public final /* synthetic */ bbs b;

        public a(ITMSPage iTMSPage, bbs bbsVar) {
            this.f19839a = iTMSPage;
            this.b = bbsVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            tll pageContext;
            x5d pageContainer;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ITMSPage iTMSPage = this.f19839a;
            if (!(iTMSPage == null || (pageContext = iTMSPage.getPageContext()) == null || (pageContainer = pageContext.getPageContainer()) == null)) {
                pageContainer.a();
            }
            this.b.o0();
        }
    }

    static {
        t2o.a(847249423);
        t2o.a(835715167);
    }

    public gas(Context context) {
        ckf.g(context, "mContext");
        this.f19838a = new TBErrorViewWidget(context);
    }

    @Override // tb.a3c
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f19838a;
    }

    @Override // tb.a3c
    public void showErrorInfo(ErrorInfo errorInfo, bbs bbsVar, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b985e5a", new Object[]{this, errorInfo, bbsVar, iTMSPage});
            return;
        }
        ckf.g(errorInfo, "errorInfo");
        ckf.g(bbsVar, "instance");
        this.f19838a.setTopic("themisPageName");
        this.f19838a.setError(Error.Factory.newError(errorInfo.d, errorInfo.e));
        this.f19838a.setStatus(TBErrorViewWidget.Status.STATUS_NETWORK_ERROR);
        this.f19838a.setRefreshButton(new a(iTMSPage, bbsVar));
        this.f19838a.setVisibility(0);
    }
}
