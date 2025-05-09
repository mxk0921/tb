package com.taobao.tao.tbmaincontroller;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.tao.util.TBDialog;
import com.taobao.tao.util.TBMainLog;
import com.taobao.tao.util.TargetTabHelper;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import tb.bqj;
import tb.kpj;
import tb.srk;
import tb.t2o;
import tb.tor;
import tb.uor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ATBMainController implements TBMainController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_FRAGMENT_TAB_INDEX = "EXTRA_FRAGMENT_TAB_INDEX";
    private static final String TAG = "ATBMainController";
    private Activity mActivity;
    private LoginBroadcastReceiver mLoginReceiver;
    private srk mOnKeyDownListener;
    private TBFragmentTabHost mTabHost;
    public SystemBarDecorator systemBarDecorator;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class LoginBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(775946351);
        }

        public LoginBroadcastReceiver() {
        }

        public static /* synthetic */ Object ipc$super(LoginBroadcastReceiver loginBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/tbmaincontroller/ATBMainController$LoginBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                ATBMainController.this.handleLoginBroadcast(LoginAction.valueOf(intent.getAction()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements bqj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.bqj
        public boolean onHide() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4c13cc", new Object[]{this})).booleanValue();
            }
            return uor.d(ATBMainController.access$000(ATBMainController.this), true);
        }

        @Override // tb.bqj
        public boolean onShow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("90d5bc07", new Object[]{this})).booleanValue();
            }
            return uor.d(ATBMainController.access$000(ATBMainController.this), false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBDialog f12787a;
        public final /* synthetic */ Method b;
        public final /* synthetic */ Object c;

        public b(TBDialog tBDialog, Method method, Object obj) {
            this.f12787a = tBDialog;
            this.b = method;
            this.c = obj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f12787a.dismiss();
            SharedPreferences.Editor edit = ATBMainController.access$000(ATBMainController.this).getApplicationContext().getSharedPreferences(TransportConstants.KEY_UUID, 0).edit();
            edit.clear();
            edit.commit();
            try {
                this.b.invoke(this.c, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBDialog f12788a;
        public final /* synthetic */ Method b;
        public final /* synthetic */ Object c;

        public c(ATBMainController aTBMainController, TBDialog tBDialog, Method method, Object obj) {
            this.f12788a = tBDialog;
            this.b = method;
            this.c = obj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f12788a.dismiss();
            try {
                this.b.invoke(this.c, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    static {
        t2o.a(775946347);
        t2o.a(775946355);
    }

    public ATBMainController(Activity activity) {
        this.mActivity = activity;
    }

    public static /* synthetic */ Activity access$000(ATBMainController aTBMainController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("47e89336", new Object[]{aTBMainController});
        }
        return aTBMainController.mActivity;
    }

    private void observerLoginStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6809060c", new Object[]{this});
            return;
        }
        if (this.mLoginReceiver == null) {
            this.mLoginReceiver = new LoginBroadcastReceiver();
        }
        LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.mLoginReceiver);
    }

    private void positionTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289b8033", new Object[]{this});
            return;
        }
        Activity activity = this.mActivity;
        if (activity == null) {
            this.mTabHost.setCurrentTab(0);
            return;
        }
        int targetTabIndex = TargetTabHelper.getTargetTabIndex(activity, activity.getIntent());
        tor.a(targetTabIndex);
        this.mTabHost.setCurrentTab(targetTabIndex);
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.dvd
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.dvd
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
        } else if (!Login.checkSessionValid()) {
            Login.login(true);
            TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
            if (tBFragmentTabHost != null) {
                tBFragmentTabHost.doLogin();
            }
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}));
        }
        return (T) this.mActivity.findViewById(i);
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mActivity;
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
        }
        TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
        if (tBFragmentTabHost != null) {
            return tBFragmentTabHost.getCurrentFragment();
        }
        return null;
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public TBFragmentTabHost getFragmentTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[]{this});
        }
        return this.mTabHost;
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mActivity.getClass().getName();
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public String getSimpleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f06186", new Object[]{this});
        }
        return this.mActivity.getClass().getSimpleName();
    }

    public void handleLoginBroadcast(LoginAction loginAction) {
        TBFragmentTabHost tBFragmentTabHost;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e790823", new Object[]{this, loginAction});
        } else if (loginAction != null && (tBFragmentTabHost = this.mTabHost) != null) {
            tBFragmentTabHost.handleLoginBroadcast(loginAction);
            ArrayList<Fragment> fragments = this.mTabHost.getFragments();
            if (fragments != null && !fragments.isEmpty()) {
                Iterator<Fragment> it = fragments.iterator();
                while (it.hasNext()) {
                    Fragment next = it.next();
                    if (next instanceof TBBaseFragment) {
                        ((TBBaseFragment) next).handleLoginAction(loginAction);
                    }
                }
            }
        }
    }

    public void initTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f201d26c", new Object[]{this});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = (TBFragmentTabHost) this.mActivity.findViewById(16908306);
        this.mTabHost = tBFragmentTabHost;
        Activity activity = this.mActivity;
        if (activity instanceof FragmentActivity) {
            tBFragmentTabHost.setup(activity, ((FragmentActivity) activity).getSupportFragmentManager(), R.id.tbTabFragment);
            this.mTabHost.getTabWidget().setDividerDrawable(17170445);
            com.taobao.tao.navigation.a.S(this.mTabHost);
            this.mTabHost.setNavigationVisibleCallback(new a());
            kpj.a(this.mActivity);
            this.mTabHost.updateTabHost();
            return;
        }
        throw new RuntimeException("activity is not instanceof FragmentActivity");
    }

    @Override // com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public boolean isLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ed9676", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        try {
            SystemBarDecorator systemBarDecorator = new SystemBarDecorator(this.mActivity);
            this.systemBarDecorator = systemBarDecorator;
            systemBarDecorator.enableImmersiveStatusBar();
        } catch (Throwable th) {
            Log.e(TAG, "enableImmersiveStatusBar failed:", th);
        }
        this.mActivity.setContentView(R.layout.tb_activity_main);
        observerLoginStatus();
        TBMainHost.b().d(this);
        initTab();
        positionTab();
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this.mActivity);
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        unObserverLoginStatus();
        TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
        if (tBFragmentTabHost != null) {
            tBFragmentTabHost.setNavigationVisibleCallback(null);
        }
        TBMainHost.b().e();
        com.taobao.tao.navigation.a.d0();
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.mActivity.isFinishing() || showDebugSettings(i, keyEvent)) {
            return false;
        }
        if (keyEvent.getRepeatCount() <= 0) {
            srk srkVar = this.mOnKeyDownListener;
            if (srkVar != null && srkVar.onKeyDown(i, keyEvent)) {
                return true;
            }
            Fragment currentFragment = getCurrentFragment();
            if ((currentFragment instanceof TBBaseFragment) && ((TBBaseFragment) currentFragment).onPanelKeyDown(i, keyEvent)) {
                return true;
            }
            if (i != 4 || this.mTabHost.getCurrentTab() == 0) {
                return false;
            }
            Activity activity = this.mActivity;
            activity.setIntent(Nav.from(activity).intentForUri(com.taobao.tao.navigation.a.t().get(0).q()));
            this.mTabHost.setCurrentTab(0);
            return true;
        } else if (i == 4) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.setIntent(intent);
            if (intent.getExtras() != null) {
                Activity activity2 = this.mActivity;
                this.mTabHost.setCurrentTab(TargetTabHelper.getTargetTabIndex(activity2, activity2.getIntent()));
                Fragment currentFragment = this.mTabHost.getCurrentFragment();
                if (currentFragment instanceof TBBaseFragment) {
                    Activity activity3 = this.mActivity;
                    if ((activity3 instanceof FragmentActivity) && ((FragmentActivity) activity3).getSupportFragmentManager().findFragmentByTag(currentFragment.getTag()) != null) {
                        ((TBBaseFragment) currentFragment).onNewIntent(intent);
                    }
                }
            }
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
        if (tBFragmentTabHost != null) {
            tBFragmentTabHost.onPause();
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
        if (tBFragmentTabHost != null) {
            tBFragmentTabHost.onResume();
        }
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa8af", new Object[]{this, str});
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void registerOnKeyDownListener(srk srkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc596f3", new Object[]{this, srkVar});
        } else {
            this.mOnKeyDownListener = srkVar;
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public void restoreTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5767576", new Object[]{this});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
        if (tBFragmentTabHost != null) {
            int currentTab = tBFragmentTabHost.getCurrentTab();
            this.mTabHost.clearAllTabs();
            initTab();
            this.mTabHost.setCurrentTab(currentTab);
        }
    }

    public void unObserverLoginStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4947333", new Object[]{this});
        } else if (this.mLoginReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.mLoginReceiver);
        }
    }

    public boolean showDebugSettings(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() > 0 && ((i == 4 || i == 25) && this.mActivity.getString(R.string.env_switch).equals("1"))) {
            try {
                Class<?> cls = Class.forName("android.taobao.mulitenv.EnvironmentViewControler");
                Method method = cls.getMethod("getRootView", new Class[0]);
                Method method2 = cls.getMethod("exit", new Class[0]);
                Object newInstance = cls.getConstructor(Activity.class).newInstance(this.mActivity);
                if (newInstance != null) {
                    TBDialog tBDialog = new TBDialog(this.mActivity, -1, "环境设置", null, (View) method.invoke(newInstance, new Object[0]), true);
                    tBDialog.setPositiveButton(new b(tBDialog, method2, newInstance));
                    tBDialog.setNegativeButton(new c(this, tBDialog, method2, newInstance));
                    tBDialog.show();
                    TBMainLog.tlog(TAG, "show debug dialog");
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
