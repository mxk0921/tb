package com.taobao.tao.topmultitab.service.appexit;

import android.app.Activity;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bqa;
import tb.cfc;
import tb.h8x;
import tb.r5a;
import tb.st3;
import tb.t2o;
import tb.wcc;
import tb.xcc;
import tb.xti;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TaoAppExitServiceImpl implements ITaoAppExitService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaoAppExitProxy";
    private AtomicBoolean isExit;
    private wcc mHomePageContext;
    private IPullDownService mPullDownService;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Timer f12800a;

        public a(Timer timer) {
            this.f12800a = timer;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/appexit/TaoAppExitServiceImpl$1");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TaoAppExitServiceImpl.access$000(TaoAppExitServiceImpl.this).set(false);
            this.f12800a.cancel();
        }
    }

    static {
        t2o.a(729810144);
        t2o.a(729810143);
    }

    public static /* synthetic */ AtomicBoolean access$000(TaoAppExitServiceImpl taoAppExitServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("47238b56", new Object[]{taoAppExitServiceImpl});
        }
        return taoAppExitServiceImpl.isExit;
    }

    private void backHomeInSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("522a72d4", new Object[]{this});
            return;
        }
        IPullDownService iPullDownService = this.mPullDownService;
        if (iPullDownService != null) {
            iPullDownService.secondBackHome();
            bqa.d(TAG, "在二楼 双击back回到首页");
        }
    }

    private void clickBackTrack(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7654b1", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = "Event_AndroidHomeBack_2";
        } else {
            str = "Event_AndroidHomeBack_1";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_HomeTab", (Object) "1");
            r5a.h("Page_Home", 19999, str, jSONObject);
        } catch (Throwable th) {
            bqa.d(TAG, "出现异常： " + th);
        }
    }

    private Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar == null) {
            bqa.d(TAG, "getActivity mHomePageContext == null");
            return null;
        }
        IHomePageProviderService iHomePageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class);
        if (iHomePageProviderService == null) {
            bqa.d(TAG, "getActivity pageProviderService == null");
            return null;
        }
        z6d pageProvider = iHomePageProviderService.getPageProvider();
        if (pageProvider != null) {
            return pageProvider.k1();
        }
        return null;
    }

    @Override // com.taobao.tao.topmultitab.service.appexit.ITaoAppExitService
    public boolean exitBy2Click() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e93999d6", new Object[]{this})).booleanValue();
        }
        if (h8x.a()) {
            backHomeInSecondFloor();
            return true;
        }
        Activity activity = getActivity();
        if (activity == null) {
            bqa.d(TAG, "activity == null");
            return false;
        } else if (!this.isExit.get()) {
            this.isExit.set(true);
            st3.c();
            clickBackTrack(false);
            String q = Localization.q(R.string.taobao_app_1000_1_16133);
            if (xti.d()) {
                q = Localization.q(R.string.taobao_app_1000_1_16167);
            }
            TBToast.makeText(activity, q, 0L).show();
            Timer timer = new Timer("App Finish Two back");
            timer.schedule(new a(timer), 2000L);
            bqa.d(TAG, "fist back click");
            return false;
        } else {
            clickBackTrack(true);
            activity.moveTaskToBack(true);
            LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(new Intent("HOMEPAGE_EXIT_BY_TWO_CLICK"));
            bqa.d(TAG, "back click exit");
            return true;
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.mHomePageContext = null;
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        this.mHomePageContext = wccVar;
        this.isExit = new AtomicBoolean();
        this.mPullDownService = (IPullDownService) wccVar.a(IPullDownService.class);
    }
}
