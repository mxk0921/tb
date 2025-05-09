package com.taobao.themis.taobao.container;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.splash.entity.ErrorInfo;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.uikit.extend.utils.NetUtil;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import tb.bbs;
import tb.ckf;
import tb.p8s;
import tb.q9s;
import tb.r8s;
import tb.rjf;
import tb.s9s;
import tb.t2o;
import tb.tll;
import tb.wsq;
import tb.x5d;
import tb.y2c;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/taobao/container/TMSErrorPage;", "Ltb/y2c;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/taobao/themis/container/splash/entity/ErrorInfo;", "errorInfo", "Ltb/bbs;", "instance", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Ltb/xhv;", "showErrorInfo", "(Lcom/taobao/themis/container/splash/entity/ErrorInfo;Ltb/bbs;Lcom/taobao/themis/kernel/page/ITMSPage;)V", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSErrorPage implements y2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13750a;
    public final TBErrorView b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ErrorInfo b;

        public b(ErrorInfo errorInfo) {
            this.b = errorInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) p8s.b(INavigatorAdapter.class);
            if (iNavigatorAdapter != null) {
                Context access$getMContext$p = TMSErrorPage.access$getMContext$p(TMSErrorPage.this);
                this.b.getClass();
                ckf.f(null, "errorInfo.buttonUrl");
                INavigatorAdapter.b.a(iNavigatorAdapter, access$getMContext$p, null, null, null, null, 16, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbs f13752a;
        public final /* synthetic */ ErrorInfo b;
        public final /* synthetic */ ITMSPage c;

        public c(bbs bbsVar, ErrorInfo errorInfo, ITMSPage iTMSPage) {
            this.f13752a = bbsVar;
            this.b = errorInfo;
            this.c = iTMSPage;
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
            this.f13752a.o0();
            if (this.b.f13498a) {
                ITMSPage iTMSPage = this.c;
                if (iTMSPage != null && (pageContext = iTMSPage.getPageContext()) != null && (pageContainer = pageContext.getPageContainer()) != null) {
                    pageContainer.hideErrorView();
                    return;
                }
                return;
            }
            this.f13752a.f0();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbs f13753a;

        public d(bbs bbsVar) {
            this.f13753a = bbsVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f13753a.G(TMSBackPressedType.TITLE_BAR_BACK_ACTION);
            }
        }
    }

    static {
        t2o.a(847249418);
        t2o.a(835715166);
    }

    public TMSErrorPage(Context context) {
        ckf.g(context, "mContext");
        this.f13750a = context;
        TBErrorView tBErrorView = new TBErrorView(context);
        this.b = tBErrorView;
        tBErrorView.setBackgroundColor(Color.parseColor("#f4f4f4"));
        if (q9s.Z()) {
            tBErrorView.setOnClickListener(a.INSTANCE);
        }
    }

    public static final /* synthetic */ Context access$getMContext$p(TMSErrorPage tMSErrorPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e4999df8", new Object[]{tMSErrorPage});
        }
        return tMSErrorPage.f13750a;
    }

    @Override // tb.y2c
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.y2c
    public void showErrorInfo(ErrorInfo errorInfo, bbs bbsVar, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b985e5a", new Object[]{this, errorInfo, bbsVar, iTMSPage});
            return;
        }
        ckf.g(errorInfo, "errorInfo");
        ckf.g(bbsVar, "instance");
        this.b.setTitle(errorInfo.b);
        if (NetUtil.isNetworkConnected(this.f13750a)) {
            if (TextUtils.isEmpty(errorInfo.c)) {
                errorInfo.c = rjf.a(this.f13750a, R.string.tms_kit_refresh_tip);
            }
            this.b.setSubTitle(errorInfo.c);
        }
        Error newError = Error.Factory.newError(errorInfo.d, errorInfo.e);
        HashMap hashMap = new HashMap();
        hashMap.put("appId", bbsVar.L());
        hashMap.put("appName", r8s.f(bbsVar));
        hashMap.put("frameType", r8s.c(bbsVar));
        hashMap.put(RVConstants.EXTRA_APPTYPE, "tms");
        hashMap.put("templateId", r8s.w(bbsVar));
        String openModel = bbsVar.c0().getOpenModel();
        if (TextUtils.equals(openModel, "afc_open_link") || TextUtils.equals(openModel, "browser_link")) {
            hashMap.put("isFromOuter", "true");
        }
        newError.extras = hashMap;
        if (iTMSPage == null || iTMSPage.c().length() <= 0) {
            newError.url = bbsVar.e0();
        } else {
            newError.url = iTMSPage.c();
        }
        if (!TextUtils.isEmpty(null)) {
            this.b.setIconUrl(null);
        } else {
            String str = newError.url;
            ckf.f(str, "error.url");
            if (a(str)) {
                this.b.setStatus(TBErrorView.Status.STATUS_EMPTY);
                this.b.setIcon(R.drawable.hu_dong_error_icon_new);
            } else {
                this.b.setIconUrl("https://gw.alicdn.com/tfs/TB1a.purYr1gK0jSZFDXXb9yVXa-416-416.png");
            }
        }
        this.b.setError(newError);
        TBErrorView tBErrorView = this.b;
        TBErrorView.ButtonType buttonType = TBErrorView.ButtonType.BUTTON_LEFT;
        tBErrorView.setButtonVisibility(buttonType, 8);
        TBErrorView tBErrorView2 = this.b;
        TBErrorView.ButtonType buttonType2 = TBErrorView.ButtonType.BUTTON_RIGHT;
        tBErrorView2.setButtonVisibility(buttonType2, 8);
        s9s s9sVar = s9s.INSTANCE;
        boolean b2 = s9sVar.b();
        String a2 = s9sVar.a();
        if (b2) {
            this.b.setButtonVisibility(buttonType2, 8);
        }
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(bbsVar.L())) {
            String L = bbsVar.L();
            ckf.f(L, "instance.appId");
            if (wsq.O(a2, L, false, 2, null)) {
                this.b.setButtonVisibility(buttonType2, 8);
            }
        }
        if (TextUtils.isEmpty(errorInfo.f) || TextUtils.isEmpty(null)) {
            q9s q9sVar = q9s.INSTANCE;
            if (q9sVar.I1() && (bbsVar.O() == TMSContainerType.EMBEDDED || bbsVar.a0() == TMSSolutionType.WEB_SINGLE_PAGE || (bbsVar.a0() == TMSSolutionType.UNIAPP && q9sVar.z2()))) {
                errorInfo.f = rjf.a(this.f13750a, R.string.tms_kit_refresh_page);
                this.b.setButtonVisibility(buttonType, 0);
                this.b.setButton(buttonType, errorInfo.f, new c(bbsVar, errorInfo, iTMSPage));
            } else if (iTMSPage != null && ErrorInfo.buttonActionType.back == null) {
                errorInfo.f = rjf.a(this.f13750a, R.string.tms_kit_close_page);
                this.b.setButtonVisibility(buttonType, 0);
                this.b.setButton(buttonType, errorInfo.f, new d(bbsVar));
            }
        } else {
            this.b.setButtonVisibility(buttonType, 0);
            this.b.setButton(buttonType, errorInfo.f, new b(errorInfo));
        }
    }

    public final boolean a(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8396a7d", new Object[]{this, str})).booleanValue();
        }
        try {
            String o3 = q9s.INSTANCE.o3();
            if (o3.length() == 0) {
                jSONArray = new JSONArray();
                jSONArray.add("pages-fast.m.taobao.com/wow/z/hdwk/hd25spring");
                jSONArray.add("huodong.taobao.com/wow/z/hdwk/hd25spring");
            } else {
                jSONArray = JSON.parseArray(o3);
            }
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                if (wsq.O(str, it.next().toString(), false, 2, null)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TMSLogger.c("TMSErrorPage", "isHuDongSpring", th);
        }
        return false;
    }
}
