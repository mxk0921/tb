package com.taobao.themis.container.title.titlebar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.adapter.IGlobalMenuAdapter;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.ArrayList;
import kotlin.Metadata;
import tb.a07;
import tb.a1e;
import tb.a90;
import tb.b81;
import tb.bbs;
import tb.btc;
import tb.ckf;
import tb.gn1;
import tb.huc;
import tb.lxt;
import tb.npd;
import tb.p8s;
import tb.q9s;
import tb.qml;
import tb.qx;
import tb.t2o;
import tb.tll;
import tb.wsq;
import tb.x5d;
import tb.xcs;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/taobao/themis/container/title/titlebar/DefaultTitleBar;", "Lcom/taobao/themis/container/title/titlebar/TMSBaseTitleBar;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Ltb/xhv;", "attachPage", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "Companion", TplMsg.VALUE_T_NATIVE_RETURN, "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DefaultTitleBar extends TMSBaseTitleBar {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public final d g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            bbs instance;
            Object systemService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                systemService = DefaultTitleBar.this.getMContext().getSystemService("input_method");
            } catch (Throwable th) {
                TMSLogger.c("UniTitleBar", "backClick cause error", th);
            }
            if (systemService != null) {
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                ITMSPage mPage = DefaultTitleBar.this.getMPage();
                if (mPage != null && (instance = mPage.getInstance()) != null) {
                    instance.G(TMSBackPressedType.TITLE_BAR_BACK_ACTION);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        static {
            t2o.a(835715207);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements huc.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ npd b;

        public c(npd npdVar) {
            this.b = npdVar;
        }

        @Override // tb.huc.c
        public void a(JSONObject jSONObject) {
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("449ab257", new Object[]{this, jSONObject});
            } else if (jSONObject != null && !ckf.b(jSONObject.getString("WV.Meta.Share.Disabled"), "true") && (string = jSONObject.getString("WV.Meta.Share.BizId")) != null && string.length() != 0) {
                String string2 = jSONObject.getString("WV.Meta.Share.BizId");
                String string3 = jSONObject.getString("WV.Meta.Share.Url");
                ArrayList arrayList = null;
                if (string3 == null) {
                    ITMSPage mPage = DefaultTitleBar.this.getMPage();
                    if (mPage == null) {
                        string3 = null;
                        if (string2 != null && string2.length() != 0 && string3 != null && string3.length() != 0) {
                            ckf.f(string2, "businessId");
                            String string4 = jSONObject.getString("WV.Meta.Share.Title");
                            String string5 = jSONObject.getString("WV.Meta.Share.Text");
                            String string6 = jSONObject.getString("WV.Meta.Share.Image");
                            String string7 = jSONObject.getString("WV.Meta.Share.Targets");
                            if (string7 != null && !ckf.b(string7, "all")) {
                                arrayList = new ArrayList(wsq.z0(string7, new String[]{","}, false, 0, 6, null));
                            }
                            this.b.l1(new IShareAdapter.b(string2, string3, string4, string5, string6, null, null, arrayList, 96, null));
                            return;
                        }
                        return;
                    }
                    string3 = mPage.c();
                }
                if (string2 != null) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d extends qx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/title/titlebar/DefaultTitleBar$uniTitleBarPosition$1");
        }

        @Override // tb.qx
        public void commit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
                return;
            }
            ITMSPage mPage = DefaultTitleBar.this.getMPage();
            if (mPage != null) {
                mPage.A(qx.TARGET, qx.EVENT_NAME, generatePosition());
            }
        }
    }

    static {
        t2o.a(835715205);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTitleBar(Context context) {
        super(context);
        int i;
        ckf.g(context, "context");
        gn1 gn1Var = new gn1();
        b81 b81Var = new b81();
        a1e mTitleView = getMTitleView();
        gn1Var.s(new a());
        mTitleView.addLeftAction(gn1Var);
        getMTitleView().addLeftAction(b81Var);
        if (q9s.m1()) {
            b81Var.r(xcs.a(getMContext(), 216.0f));
        } else {
            int c2 = xcs.c(getMContext()) - getMTitleView().getContentView().findViewById(R.id.right_panel).getMeasuredWidth();
            View l = gn1Var.l(getMContext());
            if (l == null) {
                i = 0;
            } else {
                i = l.getMeasuredWidth();
            }
            b81Var.r((c2 - i) - xcs.a(getMContext(), 24.0f));
        }
        this.g = new d();
    }

    public static /* synthetic */ Object ipc$super(DefaultTitleBar defaultTitleBar, String str, Object... objArr) {
        if (str.hashCode() == 485366694) {
            super.attachPage((ITMSPage) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/title/titlebar/DefaultTitleBar");
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, tb.y0e
    public void attachPage(ITMSPage iTMSPage) {
        huc hucVar;
        x5d pageContainer;
        x5d pageContainer2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        super.attachPage(iTMSPage);
        ViewGroup viewGroup = (ViewGroup) getMTitleView().getContentView();
        this.g.getSafeAreaInsets()[0] = xcs.f(getMContext(), xcs.d(getMContext()));
        this.g.setImmersive(qml.j(iTMSPage));
        tll pageContext = iTMSPage.getPageContext();
        btc btcVar = null;
        View view = (pageContext == null || (pageContainer2 = pageContext.getPageContainer()) == null) ? null : pageContainer2.getView();
        if ((view instanceof ViewGroup ? (ViewGroup) view : null) == null || !q9s.x()) {
            lxt.e(viewGroup, null, this.g);
        } else {
            tll pageContext2 = iTMSPage.getPageContext();
            View view2 = (pageContext2 == null || (pageContainer = pageContext2.getPageContainer()) == null) ? null : pageContainer.getView();
            if (view2 != null) {
                lxt.e(viewGroup, ((ViewGroup) view2).getChildAt(0), this.g);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        IGlobalMenuAdapter iGlobalMenuAdapter = (IGlobalMenuAdapter) p8s.b(IGlobalMenuAdapter.class);
        if (iGlobalMenuAdapter != null) {
            btcVar = iGlobalMenuAdapter.getMoreAction(iTMSPage);
        }
        if (btcVar != null && (btcVar instanceof a90)) {
            a90 a90Var = (a90) btcVar;
            getMTitleView().addRightAction(a90Var);
            a90Var.i(iTMSPage);
            Window.c g = qml.g(iTMSPage);
            if (g != null && g.b()) {
                btcVar.hide();
            } else {
                btcVar.show();
            }
        }
        npd npdVar = (npd) iTMSPage.getExtension(npd.class);
        if (npdVar != null && (hucVar = (huc) iTMSPage.getExtension(huc.class)) != null) {
            hucVar.o0(new c(npdVar));
        }
    }
}
