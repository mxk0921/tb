package com.taobao.search.refactor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.srp.SrpWidget;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.search.refactor.MSChildPageWidget;
import com.taobao.search.sf.DecorationProvider;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.acx;
import tb.asi;
import tb.auc;
import tb.ay4;
import tb.b64;
import tb.bsi;
import tb.c3p;
import tb.ckf;
import tb.cxk;
import tb.d1a;
import tb.esi;
import tb.evn;
import tb.fcj;
import tb.frh;
import tb.g6p;
import tb.gnh;
import tb.grh;
import tb.gu1;
import tb.hji;
import tb.hml;
import tb.i04;
import tb.jcj;
import tb.jrh;
import tb.k4k;
import tb.kae;
import tb.kr3;
import tb.l3p;
import tb.ltf;
import tb.meq;
import tb.nde;
import tb.njg;
import tb.nun;
import tb.o02;
import tb.o4p;
import tb.oox;
import tb.otf;
import tb.pwc;
import tb.run;
import tb.sen;
import tb.stc;
import tb.t2o;
import tb.t2p;
import tb.ude;
import tb.vee;
import tb.vfw;
import tb.x02;
import tb.ye0;
import tb.zyo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MSChildPageWidget extends meq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public c3p m;
    public fcj n;
    public jcj o;
    public otf p;
    public boolean q;
    public esi r;
    public oox s;
    public boolean t;
    public final njg u;
    public boolean v;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements vee {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static final void b(MSChildPageWidget mSChildPageWidget, frh frhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6af20306", new Object[]{mSChildPageWidget, frhVar});
                return;
            }
            ckf.g(mSChildPageWidget, "this$0");
            ckf.g(frhVar, "$it");
            oox s3 = MSChildPageWidget.s3(mSChildPageWidget);
            if (s3 != null) {
                s3.v2();
            }
            run l0 = frhVar.l0();
            ckf.d(l0);
            if (!TextUtils.isEmpty(l0.b())) {
                hji a2 = hji.a();
                run l02 = frhVar.l0();
                ckf.d(l02);
                String b = l02.b();
                ckf.d(b);
                a2.b(b, null);
            }
        }

        @Override // tb.vee
        public void onPullRefreshTrigger(int i) {
            asi asiVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e9733bb", new Object[]{this, new Integer(i)});
                return;
            }
            MSChildPageWidget.x3(MSChildPageWidget.this);
            MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.a) ((acx) MSChildPageWidget.this.getModel()).e()).getTotalSearchResult();
            final frh frhVar = null;
            if (metaResult != null) {
                asiVar = metaResult.getCombo(0);
            } else {
                asiVar = null;
            }
            if (asiVar instanceof frh) {
                frhVar = (frh) asiVar;
            }
            if (frhVar != null) {
                final MSChildPageWidget mSChildPageWidget = MSChildPageWidget.this;
                run l0 = frhVar.l0();
                if (l0 == null || l0.c()) {
                    o02 e = ((acx) mSChildPageWidget.getModel()).e();
                    ckf.e(e, "null cannot be cast to non-null type com.taobao.search.refactor.MSDataSource");
                    ((jrh) e).G0();
                    return;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.ybz
                    @Override // java.lang.Runnable
                    public final void run() {
                        MSChildPageWidget.a.b(MSChildPageWidget.this, frhVar);
                    }
                }, 500L);
            }
        }

        @Override // tb.vee
        public void onReachTopTrigger(oox ooxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e881d3b", new Object[]{this, ooxVar});
                return;
            }
            ckf.g(ooxVar, "widget");
            ooxVar.getModel().e().postEvent(new zyo());
            MetaResult metaResult = (MetaResult) ooxVar.getModel().e().getTotalSearchResult();
            nun nunVar = null;
            asi combo = metaResult != null ? metaResult.getCombo(0) : null;
            frh frhVar = combo instanceof frh ? (frh) combo : null;
            if (frhVar != null && frhVar.Y()) {
                run l0 = frhVar.l0();
                if (l0 != null) {
                    nunVar = l0.a();
                }
                if (nunVar != null) {
                    frhVar.a0();
                    MSChildPageWidget mSChildPageWidget = MSChildPageWidget.this;
                    run l02 = frhVar.l0();
                    ckf.d(l02);
                    nun a2 = l02.a();
                    ckf.d(a2);
                    MSChildPageWidget.w3(mSChildPageWidget, a2);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public b(View view) {
            this.b = view;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/MSChildPageWidget$dismissToast$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            ROOT_VIEW view = MSChildPageWidget.this.getView();
            ckf.d(view);
            ((FrameLayout) view).removeView(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class d implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
                return;
            }
            ckf.g(view, "componentView");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 85;
            ((stc) MSChildPageWidget.this.t2()).getView().addView(view, layoutParams);
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
                return;
            }
            ckf.g(view, "componentView");
            ((stc) MSChildPageWidget.this.t2()).getView().removeView(view);
        }
    }

    static {
        t2o.a(815792862);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MSChildPageWidget(final Activity activity, ude udeVar, acx<? extends com.taobao.android.meta.data.a<asi, MetaResult<asi>>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        this.u = kotlin.a.b(new d1a() { // from class: tb.vbz
            @Override // tb.d1a
            public final Object invoke() {
                View A;
                A = MSChildPageWidget.A(activity, this);
                return A;
            }
        });
        subscribeEvent(this);
        ((com.taobao.android.meta.data.a) acxVar.e()).subscribe(this);
    }

    public static final void C(MSChildPageWidget mSChildPageWidget, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8fba88c", new Object[]{mSChildPageWidget, new Boolean(z)});
            return;
        }
        ckf.g(mSChildPageWidget, "this$0");
        mSChildPageWidget.G3(z);
    }

    public static final void E(View view, final MSChildPageWidget mSChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0fc2e0c", new Object[]{view, mSChildPageWidget});
            return;
        }
        ckf.g(mSChildPageWidget, "this$0");
        view.animate().setListener(new AnimatorListenerAdapter() { // from class: com.taobao.search.refactor.MSChildPageWidget$f$a
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(MSChildPageWidget$f$a mSChildPageWidget$f$a, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/MSChildPageWidget$showRefreshGuide$1$1");
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    ((stc) MSChildPageWidget.this.t2()).getView().removeView(MSChildPageWidget.t3(MSChildPageWidget.this));
                }
            }
        }).alpha(0.0f).start();
    }

    public static final void F(MSChildPageWidget mSChildPageWidget, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24aeb327", new Object[]{mSChildPageWidget, view});
            return;
        }
        ckf.g(mSChildPageWidget, "this$0");
        ckf.g(view, "$rootView");
        mSChildPageWidget.z3(view);
    }

    public static /* synthetic */ Object ipc$super(MSChildPageWidget mSChildPageWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1675097257:
                super.f3(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1422304200:
                super.Z2();
                return null;
            case -1204637568:
                super.z();
                return null;
            case -1156728158:
                super.A2((kae) objArr[0], (esi) objArr[1], (String) objArr[2]);
                return null;
            case -312974318:
                super.n3();
                return null;
            case -110087884:
                return super.R2((String) objArr[0]);
            case 303778162:
                super.b3();
                return null;
            case 595460133:
                super.J2();
                return null;
            case 1782635559:
                super.onChildAdded((nde) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/MSChildPageWidget");
        }
    }

    public static final /* synthetic */ oox s3(MSChildPageWidget mSChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oox) ipChange.ipc$dispatch("42a40c18", new Object[]{mSChildPageWidget});
        }
        return mSChildPageWidget.s;
    }

    public static final /* synthetic */ View t3(MSChildPageWidget mSChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5ad9ae04", new Object[]{mSChildPageWidget});
        }
        return mSChildPageWidget.B3();
    }

    public static final /* synthetic */ void w3(MSChildPageWidget mSChildPageWidget, nun nunVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51faa3a3", new Object[]{mSChildPageWidget, nunVar});
        } else {
            mSChildPageWidget.I3(nunVar);
        }
    }

    public static final /* synthetic */ void x3(MSChildPageWidget mSChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b756f1", new Object[]{mSChildPageWidget});
        } else {
            mSChildPageWidget.L3();
        }
    }

    @Override // com.taobao.android.meta.structure.childpage.MetaChildPageWidget
    public void A2(kae<BaseTypedBean, ?> kaeVar, esi esiVar, String str) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0dbaa2", new Object[]{this, kaeVar, esiVar, str});
            return;
        }
        ckf.g(kaeVar, "widget");
        ckf.g(esiVar, "header");
        ckf.g(str, "type");
        RESULT totalSearchResult = ((com.taobao.android.meta.data.a) ((acx) getModel()).e()).getTotalSearchResult();
        ckf.e(totalSearchResult, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
        if (!((CommonSearchResult) totalSearchResult).isPullRefreshEnabled) {
            super.A2(kaeVar, esiVar, str);
            return;
        }
        ((stc) t2()).h(esiVar);
        if (TextUtils.equals(str, "list") && (view = kaeVar.getView()) != null) {
            view.setBackgroundColor(DecorationProvider.d(getActivity()));
        }
    }

    public final void A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9153fc02", new Object[]{this});
            return;
        }
        oox ooxVar = this.s;
        if (ooxVar != null) {
            ooxVar.v2();
        }
    }

    public final View B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("851292a5", new Object[]{this});
        }
        return (View) this.u.getValue();
    }

    @Override // com.taobao.android.meta.structure.childpage.MetaChildPageWidget
    public void C2(boolean z) {
        boolean z2;
        CommonSearchResult commonSearchResult;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e369ca", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.s == null) {
            String[] Q = o4p.Q();
            Activity activity = getActivity();
            ckf.f(activity, "getActivity(...)");
            MODEL model = getModel();
            ckf.e(model, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>>");
            oox ooxVar = new oox(Q, activity, this, (acx) model, null, null);
            this.s = ooxVar;
            ooxVar.ensureView();
            oox ooxVar2 = this.s;
            ckf.d(ooxVar2);
            ooxVar2.t2(DecorationProvider.d(getActivity()));
            esi esiVar = new esi(this.s);
            esiVar.o();
            esiVar.t("list");
            this.r = esiVar;
            ((acx) getModel()).c().Q0(new a());
        }
        oox ooxVar3 = this.s;
        ckf.d(ooxVar3);
        ROOT_VIEW view = ooxVar3.getView();
        ckf.d(view);
        if (((FrameLayout) view).getParent() == null) {
            esi esiVar2 = this.r;
            ckf.d(esiVar2);
            ((stc) t2()).h(esiVar2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && z2) {
            ((stc) t2()).j().commit();
        }
        ((stc) t2()).j().resetScrollNode();
        oox ooxVar4 = this.s;
        ckf.d(ooxVar4);
        RESULT lastSearchResult = ((com.taobao.android.meta.data.a) ((acx) getModel()).e()).getLastSearchResult();
        if (lastSearchResult instanceof CommonSearchResult) {
            commonSearchResult = (CommonSearchResult) lastSearchResult;
        } else {
            commonSearchResult = null;
        }
        if (commonSearchResult == null || !commonSearchResult.isPullRefreshEnabled) {
            z3 = false;
        }
        ooxVar4.u2(z3);
    }

    public final void C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50a11a27", new Object[]{this});
        } else if (!this.v) {
            bsi w2 = w2();
            ckf.e(w2, "null cannot be cast to non-null type com.taobao.search.refactor.MSConfig");
            if (((grh) w2).u1()) {
                ltf.a(this, this);
                this.v = true;
            }
        }
    }

    public final void E3() {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ad3fe", new Object[]{this});
            return;
        }
        ((stc) t2()).j().setScrollable(false);
        this.q = true;
        c3p c3pVar = this.m;
        if (c3pVar != null && (linearLayout = (LinearLayout) c3pVar.getView()) != null) {
            linearLayout.setVisibility(8);
        }
    }

    public final void F3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eedf380", new Object[]{this, new Boolean(z)});
        } else if (!this.q) {
            if (this.m == null) {
                x02 v2 = v2();
                ckf.f(v2, "getCreatorParam(...)");
                v2.e = new d();
                c3p a2 = c3p.CREATOR.a(v2);
                this.m = a2;
                ckf.d(a2);
                a2.attachToContainer();
                c3p c3pVar = this.m;
                ckf.d(c3pVar);
                c3pVar.a3();
                c3p c3pVar2 = this.m;
                ckf.d(c3pVar2);
                c3pVar2.B = false;
                c3p c3pVar3 = this.m;
                ckf.d(c3pVar3);
                c3pVar3.R2();
                c3p c3pVar4 = this.m;
                ckf.d(c3pVar4);
                c3pVar4.B = true ^ l3p.INSTANCE.d();
            }
            MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.a) ((acx) getModel()).e()).getLastSearchResult();
            if (metaResult != null && ((CommonSearchResult) metaResult).floatBarBean != null) {
                c3p c3pVar5 = this.m;
                ckf.d(c3pVar5);
                c3pVar5.O2(z);
            }
        }
    }

    public final void G3(boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86daf817", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            if (o4p.C1("floatBarDelay")) {
                Handler handler = new Handler();
                Runnable wbzVar = new Runnable() { // from class: tb.wbz
                    @Override // java.lang.Runnable
                    public final void run() {
                        MSChildPageWidget.D(MSChildPageWidget.this);
                    }
                };
                if (this.m != null) {
                    j = 500;
                } else {
                    j = 0;
                }
                handler.postDelayed(wbzVar, j);
            } else {
                F3(true);
            }
            M3();
        }
        H3();
    }

    public final void H3() {
        MSearchResult mSearchResult;
        MuiseBean muiseBean;
        TemplateBean template;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dfda21", new Object[]{this});
            return;
        }
        o02 e = ((acx) getModel()).e();
        ckf.f(e, "getScopeDatasource(...)");
        com.taobao.android.meta.data.a aVar = (com.taobao.android.meta.data.a) e;
        RESULT lastSearchResult = aVar.getLastSearchResult();
        if (lastSearchResult instanceof MSearchResult) {
            mSearchResult = (MSearchResult) lastSearchResult;
        } else {
            mSearchResult = null;
        }
        if (mSearchResult != null && (muiseBean = mSearchResult.popupBean) != null && (template = aVar.getTemplate(muiseBean.type)) != null) {
            jcj jcjVar = this.o;
            if (jcjVar != null) {
                jcjVar.destroyAndRemoveFromParent();
            }
            Activity activity = getActivity();
            ckf.f(activity, "getActivity(...)");
            MODEL model = getModel();
            ckf.f(model, "getModel(...)");
            jcj jcjVar2 = new jcj(activity, this, (acx) model, template, (ViewGroup) getView(), new ye0((ViewGroup) getView()));
            jcjVar2.bindWithData(muiseBean);
            jcjVar2.attachToContainer();
            this.o = jcjVar2;
        }
    }

    public final void I3(nun nunVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cacf14e2", new Object[]{this, nunVar});
        } else if (!this.t) {
            this.t = true;
            final View B3 = B3();
            LottieAnimationView lottieAnimationView = (LottieAnimationView) B3.findViewById(R.id.lottie_guide);
            if (nunVar.e() <= 0 || nunVar.a() <= 0) {
                lottieAnimationView.getLayoutParams().width = lottieAnimationView.getLayoutParams().height;
            } else {
                lottieAnimationView.getLayoutParams().width = (int) ((nunVar.e() / nunVar.a()) * lottieAnimationView.getLayoutParams().height);
            }
            ((TextView) B3.findViewById(R.id.tv_guide)).setText(nunVar.c());
            lottieAnimationView.setImageAssetsFolder("");
            lottieAnimationView.playAnimation();
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setAnimationFromUrl(nunVar.b());
            ((stc) t2()).getView().addView(B3());
            B3.setAlpha(0.0f);
            B3.animate().alpha(1.0f).start();
            B3.postDelayed(new Runnable() { // from class: tb.xbz
                @Override // java.lang.Runnable
                public final void run() {
                    MSChildPageWidget.E(B3, this);
                }
            }, 3000L);
            K3();
        }
    }

    @Override // com.taobao.android.meta.structure.childpage.MetaChildPageWidget
    public void J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("237e0025", new Object[]{this});
            return;
        }
        super.J2();
        C3();
    }

    public final void J3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42438872", new Object[]{this, new Integer(i)});
            return;
        }
        int dip2px = DensityUtil.dip2px(Globals.getApplication(), 20.0f) + i + ((stc) t2()).j().getListStart();
        final View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_combo_toast, (ViewGroup) getView(), false);
        ckf.f(inflate, "inflate(...)");
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        ckf.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = dip2px;
        layoutParams2.gravity = 1;
        ROOT_VIEW view = getView();
        ckf.d(view);
        ((FrameLayout) view).addView(inflate);
        ((TextView) inflate.findViewById(R.id.tv_combo_toast)).setText(Localization.q(R.string.taobao_app_1005_1_16654));
        inflate.setAlpha(0.0f);
        inflate.animate().alphaBy(1.0f);
        inflate.postDelayed(new Runnable() { // from class: tb.ubz
            @Override // java.lang.Runnable
            public final void run() {
                MSChildPageWidget.F(MSChildPageWidget.this, inflate);
            }
        }, 800L);
    }

    public final void K3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea4804d", new Object[]{this});
            return;
        }
        evn.a aVar = evn.Companion;
        o02 e = ((acx) getModel()).e();
        ckf.e(e, "null cannot be cast to non-null type com.taobao.search.refactor.MSDataSource");
        sen.l("Page_SearchItemList_RefreshGuide_QueryExposure", aVar.a((jrh) e));
    }

    public final void M3() {
        MSearchResult mSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1e994c", new Object[]{this});
            return;
        }
        RESULT totalSearchResult = ((com.taobao.android.meta.data.a) ((acx) getModel()).e()).getTotalSearchResult();
        if (totalSearchResult instanceof MSearchResult) {
            mSearchResult = (MSearchResult) totalSearchResult;
        } else {
            mSearchResult = null;
        }
        if (mSearchResult != null && mSearchResult.getUseNativeTopBar() && !mSearchResult.newSearch) {
            fcj fcjVar = this.n;
            if (fcjVar != null) {
                o02 e = ((acx) getModel()).e();
                ckf.e(e, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonBaseDatasource");
                fcjVar.z2((CommonBaseDatasource) e);
                return;
            }
            Activity activity = getActivity();
            ckf.f(activity, "getActivity(...)");
            MODEL model = getModel();
            ckf.e(model, "null cannot be cast to non-null type com.taobao.search.sf.CommonModelAdapter");
            this.n = new fcj(activity, this, (b64) model, null, new k4k());
        }
    }

    @Override // tb.meq, com.taobao.android.meta.structure.childpage.MetaChildPageWidget
    public ay4<gu1, ? extends pwc> R2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("f9703134", new Object[]{this, str});
        }
        ckf.g(str, "type");
        if (!ckf.b("topHeader", str)) {
            return super.R2(str);
        }
        bsi w2 = w2();
        ckf.e(w2, "null cannot be cast to non-null type com.taobao.search.refactor.MSConfig");
        return ((grh) w2).v1();
    }

    @Override // com.taobao.android.meta.structure.childpage.MetaChildPageWidget
    public void Z2() {
        gnh gnhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab395c38", new Object[]{this});
            return;
        }
        super.Z2();
        if (((acx) getModel()).g()) {
            D3();
        }
        y3();
        Activity activity = this.mActivity;
        if (activity instanceof gnh) {
            gnhVar = (gnh) activity;
        } else {
            gnhVar = null;
        }
        if (gnhVar != null) {
            gnhVar.k1();
        }
    }

    @Override // com.taobao.android.meta.structure.childpage.MetaChildPageWidget
    public void b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.b3();
        D3();
        postEvent(hml.a(0));
        ((stc) t2()).j().updateHeaderOffset();
        y3();
    }

    @Override // com.taobao.android.meta.structure.childpage.MetaChildPageWidget
    public void f3(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c280b57", new Object[]{this, new Boolean(z)});
            return;
        }
        C3();
        otf otfVar = this.p;
        if (otfVar != null) {
            otfVar.onEventMainThread(t2p.a(z, false, ((acx) getModel()).e()));
        }
        super.f3(z);
        if (o4p.C1("childPageRenderDelay")) {
            new Handler().post(new Runnable() { // from class: tb.tbz
                @Override // java.lang.Runnable
                public final void run() {
                    MSChildPageWidget.C(MSChildPageWidget.this, z);
                }
            });
        } else {
            G3(z);
        }
        oox ooxVar = this.s;
        if (ooxVar != null) {
            ooxVar.v2();
        }
    }

    @Override // com.taobao.android.meta.structure.childpage.MetaChildPageWidget
    public void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed586412", new Object[]{this});
            return;
        }
        super.n3();
        M3();
    }

    @Override // tb.abx
    public void onChildAdded(nde ndeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a40dc27", new Object[]{this, ndeVar});
            return;
        }
        super.onChildAdded(ndeVar);
        if (ndeVar instanceof otf) {
            this.p = (otf) ndeVar;
        }
    }

    public final void onEventMainThread(cxk cxkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc487a3", new Object[]{this, cxkVar});
            return;
        }
        ckf.g(cxkVar, "event");
        if (ckf.b(cxkVar.f17414a, ((acx) getModel()).e())) {
            E3();
        }
    }

    public final void y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9641e2d4", new Object[]{this});
            return;
        }
        MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.a) ((acx) getModel()).e()).getTotalSearchResult();
        if (metaResult != null && metaResult.isSuccess() && ((acx) getModel()).g()) {
            ude parent = getParent();
            ckf.e(parent, "null cannot be cast to non-null type com.taobao.android.meta.srp.SrpWidget<com.taobao.search.refactor.MSDataSource, com.taobao.search.refactor.MSCombo, com.taobao.search.sf.datasource.CommonSearchResult>");
            SrpWidget srpWidget = (SrpWidget) parent;
            if (srpWidget.n3()) {
                srpWidget.b3();
                srpWidget.c3();
            }
            ((stc) t2()).j().rebuildScrollHeaders();
        }
    }

    @Override // com.taobao.android.meta.structure.childpage.MetaChildPageWidget
    public void z() {
        MSearchResult mSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b832b080", new Object[]{this});
            return;
        }
        super.z();
        RESULT totalSearchResult = ((com.taobao.android.meta.data.a) ((acx) getModel()).e()).getTotalSearchResult();
        if (totalSearchResult instanceof MSearchResult) {
            mSearchResult = (MSearchResult) totalSearchResult;
        } else {
            mSearchResult = null;
        }
        if (mSearchResult != null) {
            mSearchResult.hasTopHeader = false;
        }
    }

    public final void z3(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffd228e", new Object[]{this, view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
        ofFloat.addListener(new b(view));
        ofFloat.start();
    }

    public static final View A(Activity activity, MSChildPageWidget mSChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bb24c173", new Object[]{activity, mSChildPageWidget});
        }
        ckf.g(activity, "$activity");
        ckf.g(mSChildPageWidget, "this$0");
        return LayoutInflater.from(activity).inflate(R.layout.sf_tbsearch_pull_refresh_guide, (ViewGroup) ((stc) mSChildPageWidget.t2()).getView(), false);
    }

    public static final void D(MSChildPageWidget mSChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8086dc9", new Object[]{mSChildPageWidget});
            return;
        }
        ckf.g(mSChildPageWidget, "this$0");
        mSChildPageWidget.F3(true);
    }

    public final void D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3569ea4a", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        List<kae<?, ?>> d2 = M2().d("sceneHeader");
        if (d2 != null) {
            for (kae<?, ?> kaeVar : d2) {
                if ((kaeVar instanceof auc) && ((auc) kaeVar).p()) {
                    arrayList.add(kaeVar);
                }
            }
        }
        List<kae<?, ?>> d3 = M2().d("topHeader");
        if (d3 != null) {
            for (kae<?, ?> kaeVar2 : d3) {
                if ((kaeVar2 instanceof auc) && ((auc) kaeVar2).p()) {
                    arrayList.add(kaeVar2);
                }
            }
        }
        postEvent(kr3.a(null, null, null, arrayList));
    }

    public final void L3() {
        ResultMainInfoBean m0;
        asi combo;
        List<BaseCellBean> t;
        BaseCellBean baseCellBean;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf1a592", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("query", ((com.taobao.android.meta.data.a) ((acx) getModel()).e()).getKeyword());
        RESULT totalSearchResult = ((com.taobao.android.meta.data.a) ((acx) getModel()).e()).getTotalSearchResult();
        String str = null;
        CommonSearchResult commonSearchResult = totalSearchResult instanceof CommonSearchResult ? (CommonSearchResult) totalSearchResult : null;
        if (commonSearchResult != null) {
            JSONObject jSONObject = commonSearchResult.pageInfo;
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    hashMap.put(key, value != null ? value.toString() : null);
                }
            }
            Map<String, String> map = commonSearchResult.getMainInfo().pageTraceArgs;
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.a) ((acx) getModel()).e()).getTotalSearchResult();
        if (!(metaResult == null || (combo = metaResult.getCombo(0)) == null || (t = combo.t()) == null || (baseCellBean = (BaseCellBean) i04.m0(t)) == null)) {
            i = baseCellBean.pageNo;
        }
        hashMap.put("srp_seq", String.valueOf(i));
        MetaResult metaResult2 = (MetaResult) ((com.taobao.android.meta.data.a) ((acx) getModel()).e()).getTotalSearchResult();
        asi combo2 = metaResult2 != null ? metaResult2.getCombo(0) : null;
        frh frhVar = combo2 instanceof frh ? (frh) combo2 : null;
        if (!(frhVar == null || (m0 = frhVar.m0()) == null)) {
            str = m0.rn;
        }
        hashMap.put("refresh_first_rn", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("utLogMap", g6p.d(JSON.toJSONString(hashMap)));
        sen.m("Page_SearchItemList", "Search-RefreshExposure", 19997, hashMap2);
    }
}
