package com.taobao.tao.topmultitab.service.statusbar;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.tao.topmultitab.service.festival.IFestivalService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.tao.util.SystemBarDecorator;
import java.util.Map;
import tb.bqa;
import tb.cfc;
import tb.j6d;
import tb.l6c;
import tb.t2o;
import tb.v20;
import tb.wcc;
import tb.xcc;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class StatusBarServiceImpl implements IStatusBarService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TAB_COLOR_UNSET = 0;
    public static final int TAB_DARK_COLOR = 2;
    public static final int TAB_LIGHT_COLOR = 1;
    private static final String TAG = "StatusBarServiceImpl";
    private l6c mFestivalChangeListener;
    private wcc mHomeContext;
    private v20 mPageLifeCycleListener;
    private IPullDownService.a mPullSecondFloorListener;
    private int tabDarkStatus = 0;
    private final int SKIN_COLOR_UNSET = 0;
    private final int SKIN_DARK_COLOR = 2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends v20 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 797441118) {
                super.onPause();
                return null;
            } else if (hashCode == 1928110205) {
                super.onResume((String) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/topmultitab/service/statusbar/StatusBarServiceImpl$1");
            }
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
                return;
            }
            super.onPause();
            Context access$000 = StatusBarServiceImpl.access$000(StatusBarServiceImpl.this);
            if (access$000 != null) {
                StatusBarServiceImpl.access$200(StatusBarServiceImpl.this, access$000);
            }
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onResume(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72eca07d", new Object[]{this, str});
                return;
            }
            super.onResume(str);
            Context access$000 = StatusBarServiceImpl.access$000(StatusBarServiceImpl.this);
            if (access$000 != null) {
                StatusBarServiceImpl.access$100(StatusBarServiceImpl.this, access$000);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements IPullDownService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService.a
        public void onEnterPullSecondFloor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11729e81", new Object[]{this});
                return;
            }
            Context access$000 = StatusBarServiceImpl.access$000(StatusBarServiceImpl.this);
            if (access$000 != null) {
                StatusBarServiceImpl.access$300(StatusBarServiceImpl.this, access$000, false);
            }
        }

        @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService.a
        public void onExitPullSecondFloor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e74a49d", new Object[]{this});
                return;
            }
            Context access$000 = StatusBarServiceImpl.access$000(StatusBarServiceImpl.this);
            if (access$000 != null) {
                StatusBarServiceImpl.access$100(StatusBarServiceImpl.this, access$000);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements l6c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.l6c
        public void onFestivalChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d12b9844", new Object[]{this});
                return;
            }
            Context access$000 = StatusBarServiceImpl.access$000(StatusBarServiceImpl.this);
            if (access$000 != null) {
                StatusBarServiceImpl.access$100(StatusBarServiceImpl.this, access$000);
            }
        }
    }

    static {
        t2o.a(729810360);
        t2o.a(729810359);
    }

    public static /* synthetic */ Context access$000(StatusBarServiceImpl statusBarServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d27fd408", new Object[]{statusBarServiceImpl});
        }
        return statusBarServiceImpl.getCurActivity();
    }

    public static /* synthetic */ void access$100(StatusBarServiceImpl statusBarServiceImpl, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd63f079", new Object[]{statusBarServiceImpl, context});
        } else {
            statusBarServiceImpl.updateStatusBarOnEnterHomepage(context);
        }
    }

    public static /* synthetic */ void access$200(StatusBarServiceImpl statusBarServiceImpl, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1e283a", new Object[]{statusBarServiceImpl, context});
        } else {
            statusBarServiceImpl.updateStatusBarOnExitHomepage(context);
        }
    }

    public static /* synthetic */ void access$300(StatusBarServiceImpl statusBarServiceImpl, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20345239", new Object[]{statusBarServiceImpl, context, new Boolean(z)});
        } else {
            statusBarServiceImpl.enableImmersiveStatusBar(context, z);
        }
    }

    private l6c createFestivalChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6c) ipChange.ipc$dispatch("417b612a", new Object[]{this});
        }
        return new c();
    }

    private v20 createPageLifeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v20) ipChange.ipc$dispatch("5a2f7158", new Object[]{this});
        }
        return new a();
    }

    private IPullDownService.a createSecondFloorListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPullDownService.a) ipChange.ipc$dispatch("3b6f81bb", new Object[]{this});
        }
        return new b();
    }

    private void enableImmersiveStatusBar(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66e213c", new Object[]{this, context, new Boolean(z)});
            return;
        }
        try {
            new SystemBarDecorator((Activity) context).enableImmersiveStatusBar(z);
        } catch (Throwable th) {
            bqa.d(TAG, "innerUpdateStatusBar error:" + th);
        }
    }

    private Context getCurActivity() {
        IHomePageProviderService iHomePageProviderService;
        z6d pageProvider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("5c003f38", new Object[]{this});
        }
        wcc wccVar = this.mHomeContext;
        if (wccVar == null || (iHomePageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class)) == null || (pageProvider = iHomePageProviderService.getPageProvider()) == null) {
            return null;
        }
        return pageProvider.k1();
    }

    private int getDarkStatusFromSkin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a86acf5f", new Object[]{this})).intValue();
        }
        Map<String, String> g = FestivalMgr.i().g();
        String str = g.get("navStyle");
        if (!TextUtils.equals(g.get("isFestivalOn"), "1")) {
            return 2;
        }
        if (TextUtils.equals(str, "0") || TextUtils.equals(str, "1")) {
            return 1;
        }
        if (TextUtils.equals(str, "2")) {
            return 2;
        }
        return 0;
    }

    private void registerFestivalChangeListener() {
        IFestivalService iFestivalService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0612ba6", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomeContext;
        if (wccVar != null && (iFestivalService = (IFestivalService) wccVar.a(IFestivalService.class)) != null) {
            this.mFestivalChangeListener = createFestivalChangeListener();
            iFestivalService.getFestivalChangeRegister().a(this.mFestivalChangeListener);
        }
    }

    private void registerHomepageLifeListener() {
        j6d pageLifeCycleRegister;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef220a28", new Object[]{this});
            return;
        }
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) this.mHomeContext.a(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null && (pageLifeCycleRegister = iHomePageLifecycleService.getPageLifeCycleRegister()) != null) {
            v20 createPageLifeListener = createPageLifeListener();
            this.mPageLifeCycleListener = createPageLifeListener;
            pageLifeCycleRegister.a(createPageLifeListener);
        }
    }

    private void registerPullSecondFloorListener() {
        IPullDownService iPullDownService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c31eab", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomeContext;
        if (wccVar != null && (iPullDownService = (IPullDownService) wccVar.a(IPullDownService.class)) != null) {
            IPullDownService.a createSecondFloorListener = createSecondFloorListener();
            this.mPullSecondFloorListener = createSecondFloorListener;
            iPullDownService.addPullSecondFloorListener(createSecondFloorListener);
        }
    }

    private void unRegisterFestivalChangeListener() {
        IFestivalService iFestivalService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6fd01f", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomeContext;
        if (wccVar != null && this.mFestivalChangeListener != null && (iFestivalService = (IFestivalService) wccVar.a(IFestivalService.class)) != null) {
            iFestivalService.getFestivalChangeRegister().b(this.mFestivalChangeListener);
        }
    }

    private void unRegisterHomepageLifeListener() {
        IHomePageLifecycleService iHomePageLifecycleService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5178e1", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomeContext;
        if (wccVar != null && this.mPageLifeCycleListener != null && (iHomePageLifecycleService = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class)) != null) {
            iHomePageLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycleListener);
        }
    }

    private void unRegisterPullSecondFloorListener() {
        IPullDownService iPullDownService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29890952", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomeContext;
        if (wccVar != null && this.mPullSecondFloorListener != null && (iPullDownService = (IPullDownService) wccVar.a(IPullDownService.class)) != null) {
            iPullDownService.removePullSecondFloorListener(this.mPullSecondFloorListener);
        }
    }

    private void updateStatusBarByHomeFestival(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c018af5b", new Object[]{this, context});
            return;
        }
        if (this.tabDarkStatus == 2) {
            z = false;
        }
        enableImmersiveStatusBar(context, z);
    }

    private void updateStatusBarBySkin(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c084b415", new Object[]{this, context});
            return;
        }
        int darkStatusFromSkin = getDarkStatusFromSkin();
        if (darkStatusFromSkin != 0) {
            if (darkStatusFromSkin != 2) {
                z = false;
            }
            enableImmersiveStatusBar(context, z);
        }
    }

    private void updateStatusBarOnEnterHomepage(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d1df52", new Object[]{this, context});
            return;
        }
        try {
            if (this.tabDarkStatus == 0) {
                updateStatusBarBySkin(context);
            } else {
                updateStatusBarByHomeFestival(context);
            }
        } catch (Throwable th) {
            bqa.d(TAG, "updateStatusBar error:" + th);
        }
    }

    private void updateStatusBarOnExitHomepage(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e96133e", new Object[]{this, context});
        } else {
            updateStatusBarBySkin(context);
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
            return;
        }
        unRegisterHomepageLifeListener();
        unRegisterFestivalChangeListener();
        unRegisterPullSecondFloorListener();
    }

    @Override // com.taobao.tao.topmultitab.service.statusbar.IStatusBarService
    public void updateStatusBar(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7f7029", new Object[]{this, context});
        } else {
            updateStatusBarOnEnterHomepage(context);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        this.mHomeContext = wccVar;
        registerHomepageLifeListener();
        registerFestivalChangeListener();
        registerPullSecondFloorListener();
    }

    @Override // com.taobao.tao.topmultitab.service.statusbar.IStatusBarService
    public void updateStatusBar(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46f07fa", new Object[]{this, context, new Integer(i)});
            return;
        }
        this.tabDarkStatus = i;
        updateStatusBarOnEnterHomepage(context);
    }
}
