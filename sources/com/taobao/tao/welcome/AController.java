package com.taobao.tao.welcome;

import android.app.ActivityManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.boarding.SelectLocaleFragment;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.nav.Nav;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.tao.util.TaoHelper;
import com.taobao.tao.welcome.HostController;
import com.taobao.tao.welcome.a;
import com.taobao.tao.welcome.fragments.ProvisionManager;
import com.taobao.taobao.R;
import java.util.Locale;
import tb.kx9;
import tb.o78;
import tb.q1r;
import tb.qqg;
import tb.t2o;
import tb.tqg;
import tb.veg;
import tb.vqg;
import tb.x4d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AController extends HostController {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private NavigationWatchDog watchDog = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.tao.welcome.a.d
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbbb0a8", new Object[]{this, new Integer(i)});
                return;
            }
            AController.this.finish();
            if (i == R.id.provision_negative_button_view_mode) {
                HostController.enterViewMode(AController.this.getHost());
            } else if (i == R.id.provision_negative_button_exit_app) {
                AController.access$000(AController.this);
            }
        }

        @Override // com.taobao.tao.welcome.a.d
        public void onPositive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82ab057f", new Object[]{this});
            } else {
                AController.this.navigateOnConfirm();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements x4d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.x4d
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53320208", new Object[]{this, new Boolean(z)});
                return;
            }
            TLog.loge("Welcome", "Navigation", "IOvsABCallback received with result: " + z);
            if (z) {
                AController.this.showMultiLocales();
                return;
            }
            TLog.loge("Welcome", "Navigation", "navigate immediately");
            AController.this.navigate();
        }
    }

    static {
        t2o.a(734003201);
        veg.b(ViewModeWVApi.class.getSimpleName(), ViewModeWVApi.class, false);
    }

    public AController(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        HostController.putStringExtra(appCompatActivity, "instanceType", PopStrategy.IDENTIFIER_SPLASH);
    }

    public static /* synthetic */ void access$000(AController aController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f62b16", new Object[]{aController});
        } else {
            aController.exitApp();
        }
    }

    private boolean checkComplianceTraceEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43250df0", new Object[]{this})).booleanValue();
        }
        return q1r.c(HostController.COMPLIANCE_TRACE_ENABLE);
    }

    private static boolean decideFinishOrNot(Intent intent) {
        boolean z;
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6385be5d", new Object[]{intent})).booleanValue();
        }
        if (qqg.b(intent.getData())) {
            return false;
        }
        int flags = intent.getFlags();
        if ((268435456 & flags) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((4194304 & flags) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((flags & 32768) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z2 || z3) {
            return false;
        }
        return true;
    }

    private void exitApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5695072a", new Object[]{this});
            return;
        }
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) getSystemService("activity")).getRunningAppProcesses()) {
                String str = runningAppProcessInfo.processName;
                if (str.contains(TaoHelper.getPackageName() + ":")) {
                    Process.killProcess(runningAppProcessInfo.pid);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(AController aController, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 888638097:
                return new Boolean(super.onPreCreate((Bundle) objArr[0]));
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/welcome/AController");
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void alertProvision() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf766e0", new Object[]{this});
        } else if (checkComplianceTraceEnable()) {
            navigateOnConfirm();
        } else {
            f.a("launch", getHost(), new a()).a();
        }
    }

    @Override // com.taobao.tao.welcome.HostController, tb.dvd
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.welcome.HostController, tb.dvd
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean isImmersive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onConfirmed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9365271c", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.Theme_Welcome_Adaptor_New);
        if (ProvisionManager.a(getApplicationContext())) {
            this.activityMonitor.b(getHost());
            if (handleIntent(getIntent(), null)) {
                return;
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        NavigationWatchDog navigationWatchDog = this.watchDog;
        if (navigationWatchDog != null) {
            navigationWatchDog.c();
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onLocaleSetDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809c7eb2", new Object[]{this});
        } else {
            navigate();
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        Intent intent2 = getIntent();
        Uri data = getIntent().getData();
        Uri data2 = intent.getData();
        super.onNewIntent(intent);
        if (qqg.b(data) && !qqg.b(data2) && !TextUtils.equals(intent2.getDataString(), intent.getDataString())) {
            TLog.loge("welcome", "AController", "oldIntent: " + intent2 + ", newIntent:" + intent);
            HostController.putStringExtra(getHost(), "finishReason", "newIntent");
            finish();
            Nav.from(getContext()).toUri(data2);
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onRejected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebe6dff", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        } else {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        NavigationWatchDog navigationWatchDog = this.watchDog;
        if (navigationWatchDog != null) {
            navigationWatchDog.e();
        }
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa8af", new Object[]{this, str});
        }
    }

    public void showMultiLocales() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a80f784", new Object[]{this});
            return;
        }
        setTheme(R.style.Theme_Welcome_Main);
        new SystemBarDecorator(getHost()).enableImmersiveStatusBar();
        getSupportFragmentManager().beginTransaction().replace(16908290, new SelectLocaleFragment(), SelectLocaleFragment.class.getSimpleName()).commitAllowingStateLoss();
    }

    private void finishByMain(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f02d46a", new Object[]{this, bundle});
            return;
        }
        Nav disableTransition = Nav.from(getContext()).withExtras(bundle).disableTransition();
        boolean z = bundle.getBoolean(NavigationWatchDog.KEY_RESUME, false);
        NavigationWatchDog.g("__from_resume__=" + z);
        if (!z) {
            disableTransition.withFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            NavigationWatchDog.g("__from_resume__=false, added flags=0x" + Integer.toHexString(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
        }
        if (TBMainHost.b().getContext() != null) {
            HostController.putStringExtra(getHost(), "finishReason", "instanceAlreadyExist");
            finish();
        }
        if (disableTransition.toUri("http://m.taobao.com/index.htm")) {
            if (this.watchDog == null) {
                this.watchDog = new NavigationWatchDog();
            }
            this.watchDog.f(this, 5000L);
            return;
        }
        finish();
    }

    public void navigateOnConfirm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb975df7", new Object[]{this});
            return;
        }
        String language = Locale.getDefault().getLanguage();
        TLog.loge("Welcome", "Navigation", "current language is: " + language);
        getIntent().putExtra("fullyNewInstall", true);
        if (Locale.CHINESE.getLanguage().equals(language)) {
            updateProvisionFlag();
            navigate();
            return;
        }
        BootstrapMode.i(2048);
        updateProvisionFlag();
        TLog.loge("Welcome", "Navigation", "starting IOvsABCallback...");
        o78.n(new b());
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean onPreCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34f78a91", new Object[]{this, bundle})).booleanValue();
        }
        Intent intent = getIntent();
        kx9.a(bundle);
        if (!decideFinishOrNot(intent)) {
            return super.onPreCreate(bundle);
        }
        HostController.putStringExtra(getHost(), "finishReason", "newTaskAndBroughtToFront");
        finish();
        return true;
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        } else {
            bundle.putBoolean(HostController.KEY_CONTROLLER_IMPL_B, false);
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        NavigationWatchDog navigationWatchDog = this.watchDog;
        if (navigationWatchDog == null || !navigationWatchDog.b()) {
            NavigationWatchDog.g("watchdog is not settled, ignore it");
            return;
        }
        Intent intent = getIntent();
        if (intent != null) {
            intent.putExtra(NavigationWatchDog.KEY_RESUME, true);
            NavigationWatchDog.g("put __from_resume__=true");
        }
        navigate();
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean handleIntent(Intent intent, HostController.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3396c47", new Object[]{this, intent, nVar})).booleanValue();
        }
        if (intent.getBooleanExtra("fullyNewInstall", false)) {
            tqg.b(new vqg(getHost(), intent));
            return false;
        } else if (!qqg.b(intent.getData())) {
            return false;
        } else {
            TLog.loge("welcome", "linkx", "Welcome === onCreate === start linkIn");
            qqg.c(getHost(), intent);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    @Override // com.taobao.tao.welcome.HostController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void navigate() {
        /*
            r13 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "fullyNewInstall"
            java.lang.String r3 = "__from_resume__"
            java.lang.String r4 = "shop_id"
            java.lang.String r5 = "uid"
            com.android.alibaba.ip.runtime.IpChange r6 = com.taobao.tao.welcome.AController.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x001d
            java.lang.String r2 = "c554e978"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r13
            r6.ipc$dispatch(r2, r1)
            return
        L_0x001d:
            android.content.Intent r6 = r13.getIntent()
            r7 = 0
            boolean r6 = r13.handleIntent(r6, r7)
            if (r6 == 0) goto L_0x0029
            return
        L_0x0029:
            android.content.Intent r6 = r13.getIntent()     // Catch: Exception -> 0x0052
            java.lang.String r6 = r6.getStringExtra(r5)     // Catch: Exception -> 0x0052
            android.content.Intent r8 = r13.getIntent()     // Catch: Exception -> 0x004f
            java.lang.String r7 = r8.getStringExtra(r4)     // Catch: Exception -> 0x004f
            android.content.Intent r8 = r13.getIntent()     // Catch: Exception -> 0x004f
            boolean r8 = r8.getBooleanExtra(r3, r0)     // Catch: Exception -> 0x004f
            android.content.Intent r9 = r13.getIntent()     // Catch: Exception -> 0x004a
            boolean r9 = r9.getBooleanExtra(r2, r0)     // Catch: Exception -> 0x004a
            goto L_0x0059
        L_0x004a:
        L_0x004b:
            r12 = r7
            r7 = r6
            r6 = r12
            goto L_0x0055
        L_0x004f:
            r8 = 0
            goto L_0x004b
        L_0x0052:
            r6 = r7
            r8 = 0
        L_0x0055:
            r9 = 0
            r12 = r7
            r7 = r6
            r6 = r12
        L_0x0059:
            android.os.Bundle r10 = new android.os.Bundle
            r11 = 5
            r10.<init>(r11)
            boolean r11 = android.text.TextUtils.isEmpty(r6)
            if (r11 != 0) goto L_0x0068
            r10.putString(r5, r6)
        L_0x0068:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L_0x0071
            r10.putString(r4, r7)
        L_0x0071:
            if (r8 == 0) goto L_0x0076
            r10.putBoolean(r3, r1)
        L_0x0076:
            java.lang.String r3 = "show_welcome"
            r10.putBoolean(r3, r0)
            r10.putBoolean(r2, r9)
            java.lang.String r2 = "needFinishBroadcast"
            r10.putBoolean(r2, r1)
            android.content.Intent r2 = r13.getIntent()
            boolean r2 = com.taobao.android.launcher.common.LauncherRuntime.i(r2)
            tb.chb r3 = tb.c21.g()
            java.lang.String r4 = "isFirstLaunch"
            boolean r3 = r3.getBoolean(r4, r0)
            if (r2 == 0) goto L_0x00a2
            if (r3 == 0) goto L_0x00a2
            java.lang.String r2 = "startByLauncher"
            r10.putBoolean(r2, r1)
        L_0x00a2:
            r13.finishByMain(r10)
            r13.overridePendingTransition(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.welcome.AController.navigate():void");
    }
}
