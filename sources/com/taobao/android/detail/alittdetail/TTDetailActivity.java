package com.taobao.android.detail.alittdetail;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.security.ccrc.service.CcrcContext;
import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.detail.alittdetail.share.ShareUtils;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.platformization.business.BizLifecycle;
import com.taobao.taobaocompat.lifecycle.IUtActivityNotTrack;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import com.ut.share.business.ShareContent;
import com.ut.share.business.interf.IShareContainer;
import java.util.ArrayList;
import java.util.List;
import tb.a6r;
import tb.acq;
import tb.b5m;
import tb.bw6;
import tb.ens;
import tb.guk;
import tb.ihn;
import tb.lnm;
import tb.n4l;
import tb.nj7;
import tb.pq4;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.vbl;
import tb.wpg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDetailActivity extends TTDetailBaseActivity implements IUtActivityNotTrack, a6r, IShareContainer, ShareContentCallBack, ShareUtils.a, ihn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View s;
    public List<lnm> t;
    public CcrcBHService u;
    public boolean v;
    public final OnScreenChangedListener w = new a();
    public final MessageQueue.IdleHandler x = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            guk.a(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            FragmentManager supportFragmentManager;
            Fragment findFragmentByTag;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            } else if (vbl.E() && (findFragmentByTag = (supportFragmentManager = TTDetailActivity.this.getSupportFragmentManager()).findFragmentByTag(n4l.DETAIL_COMMENT_FRAGMENT_TAG)) != null) {
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                beginTransaction.remove(findFragmentByTag);
                beginTransaction.commitAllowingStateLoss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            if (!Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sDisableAllPreload)) && vbl.j0() && !pq4.a(TTDetailActivity.this) && !tq4.e(TTDetailActivity.this) && TTDetailActivity.D3(TTDetailActivity.this) == null) {
                TTDetailActivity.E3(TTDetailActivity.this, new ArrayList());
                lnm lnmVar = new lnm(TTDetailActivity.this);
                lnmVar.k();
                lnm lnmVar2 = new lnm(TTDetailActivity.this);
                lnmVar2.k();
                TTDetailActivity.D3(TTDetailActivity.this).add(lnmVar);
                TTDetailActivity.D3(TTDetailActivity.this).add(lnmVar2);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends BizLifecycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(TTDetailBaseActivity tTDetailBaseActivity) {
            super(tTDetailBaseActivity);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -695050278) {
                super.b(((Boolean) objArr[0]).booleanValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alittdetail/TTDetailActivity$3");
        }

        @Override // com.taobao.android.detail.ttdetail.platformization.business.BizLifecycle, tb.mng
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6925fda", new Object[]{this, new Boolean(z)});
                return;
            }
            super.b(z);
            if (!z) {
                TTDetailActivity.F3(TTDetailActivity.this);
            }
        }
    }

    static {
        t2o.a(354418690);
        t2o.a(775946454);
        t2o.a(775946324);
        t2o.a(663748661);
        t2o.a(927989801);
        t2o.a(354418780);
        t2o.a(354418767);
    }

    public static /* synthetic */ List D3(TTDetailActivity tTDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f09ae2ac", new Object[]{tTDetailActivity});
        }
        return tTDetailActivity.t;
    }

    public static /* synthetic */ List E3(TTDetailActivity tTDetailActivity, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("10c66a59", new Object[]{tTDetailActivity, list});
        }
        tTDetailActivity.t = list;
        return list;
    }

    public static /* synthetic */ void F3(TTDetailActivity tTDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ada567c", new Object[]{tTDetailActivity});
        } else {
            tTDetailActivity.H3();
        }
    }

    public static /* synthetic */ Object ipc$super(TTDetailActivity tTDetailActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1194167969:
                super.p3();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alittdetail/TTDetailActivity");
        }
    }

    public final void G3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f835ecab", new Object[]{this});
            return;
        }
        this.v = false;
        CcrcContext.init(this, nj7.c());
        if (vbl.m()) {
            CcrcBHService bHService = CcrcBHService.getBHService("ccrc_taobao_crawler_risk");
            this.u = bHService;
            if (bHService != null) {
                bHService.activate();
            }
        }
    }

    public final void H3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b05e0214", new Object[]{this});
            return;
        }
        if (this.t == null) {
            Looper.myQueue().addIdleHandler(this.x);
        }
        CcrcBHService ccrcBHService = this.u;
        if (ccrcBHService != null && !this.v) {
            ccrcBHService.detect(null);
            this.v = true;
        }
    }

    @Override // tb.a6r
    public boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d44aa950", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.ihn
    public boolean X1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d39a51a", new Object[]{this})).booleanValue();
        }
        List<lnm> list = this.t;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.TTDetailBaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.taobao.uikit.actionbar.ShareContentCallBack
    public Object getQueryShareParameters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("febe4434", new Object[]{this});
        }
        ShareContent a2 = ShareUtils.a(q3());
        if (b5m.H().isI18nEdition()) {
            a2.businessId = "1_" + b5m.H().getLocation();
        } else {
            a2.businessId = "1";
        }
        UserBehaviorTracker.l(this, UserBehaviorUtils.COMPONENT_NAME_NAVI_BAR, UserBehaviorUtils.ACTION_NAVI_BAR_MORE, null);
        return a2;
    }

    @Override // com.ut.share.business.interf.IShareContainer
    public View getShareContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f072ab61", new Object[]{this});
        }
        return this.s;
    }

    @Override // tb.ihn
    public List<lnm> i2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("37b407ab", new Object[]{this});
        }
        return this.t;
    }

    @Override // com.taobao.android.detail.ttdetail.TTDetailBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        List<lnm> list = this.t;
        if (list != null) {
            for (lnm lnmVar : list) {
                if (lnmVar != null) {
                    lnmVar.o();
                }
            }
            this.t = null;
        }
        CcrcBHService ccrcBHService = this.u;
        if (ccrcBHService != null) {
            ccrcBHService.deActivate();
        }
        TBAutoSizeConfig.x().h0(this.w);
        try {
            Looper.myQueue().removeIdleHandler(this.x);
        } catch (Exception e) {
            tgh.b("TTDetailActivity", "onDestroy() removeIdleHandler exception: " + e);
        }
    }

    @Override // com.taobao.android.detail.alittdetail.share.ShareUtils.a
    public void onUpdateShareContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfac20a1", new Object[]{this, view});
        } else {
            this.s = view;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.TTDetailBaseActivity
    public void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472d8ea1", new Object[]{this});
            return;
        }
        wpg.c(getIntent(), this);
        super.p3();
    }

    @Override // com.taobao.android.detail.ttdetail.TTDetailBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        TaobaoEvnInitializer.initialize();
        A3(new ens().g(QueryParamsManager.DEFAULT_CART_FROM).h("detail"));
        z3(new c(this));
        G3();
        super.onCreate(bundle);
        TaobaoEvnInitializer.overrideOrImplementDefaultBehaviors(this, q3());
        if (bw6.a(this)) {
            Toast.makeText(this, "in TTD", 0).show();
        }
        TBAutoSizeConfig.x().d0(this.w);
    }
}
