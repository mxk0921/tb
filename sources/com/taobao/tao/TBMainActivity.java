package com.taobao.tao;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.KeyEvent;
import android.widget.TabHost;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.a;
import com.taobao.tao.navigation.b;
import com.taobao.tao.tbmaincontroller.ATBMainController;
import com.taobao.tao.tbmaincontroller.TBMainController;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.tao.tbmainfragment.TBMainFragmentLifecycle;
import com.taobao.tao.util.TBMainLog;
import com.taobao.taobao.R;
import com.taobao.uikit.immersive.ITBImmersive;
import java.util.Iterator;
import tb.acq;
import tb.d7r;
import tb.hnv;
import tb.nx9;
import tb.qxq;
import tb.r3g;
import tb.ror;
import tb.sor;
import tb.srk;
import tb.t2o;
import tb.uor;

/* compiled from: Taobao */
@PopLayer.PopupAllowedFromFragment
@PopLayer.PopupOnlyManually
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBMainActivity extends SupportActivity implements TabHost.OnTabChangeListener, ror, ITBImmersive, r3g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ABGLOBAL_SAVE_INSTANCE_KEY = "tbmain_save_instance";
    public static final String KEY_APM_MAIN_INDEX = "mainTabIndex";
    private static final String TAG = "TBMainActivity";
    private TBMainController mTBMainController;
    private FragmentManager.FragmentLifecycleCallbacks mFragmentLifecycleCallbacks = null;
    private Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks = null;

    static {
        t2o.a(775946328);
        t2o.a(775946327);
        t2o.a(775946319);
    }

    public static /* synthetic */ Object ipc$super(TBMainActivity tBMainActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1772888905:
                super.onSaveInstanceState((Bundle) objArr[0], (PersistableBundle) objArr[1]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/TBMainActivity");
        }
    }

    private static boolean isStartSpeedOpen(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c26930c", new Object[]{context})).booleanValue();
        }
        return ABGlobal.isFeatureOpened(context, "useNewLaunchConfig");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // tb.dvd
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        return this.mTBMainController.checkLogin();
    }

    @Override // tb.dvd
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
        } else {
            this.mTBMainController.doLogin();
        }
    }

    @Override // tb.ror
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this;
    }

    @Override // tb.ror
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
        }
        return this.mTBMainController.getCurrentFragment();
    }

    @Override // tb.ror
    public TBFragmentTabHost getFragmentTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[]{this});
        }
        return this.mTBMainController.getFragmentTabHost();
    }

    @Override // tb.ror
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mTBMainController.getName();
    }

    @Override // tb.ror
    public String getSimpleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f06186", new Object[]{this});
        }
        return this.mTBMainController.getSimpleName();
    }

    public TBMainController getTBMainController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMainController) ipChange.ipc$dispatch("ec2eb5f6", new Object[]{this});
        }
        return this.mTBMainController;
    }

    @Override // com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return this.mTBMainController.isImmersiveStatus();
    }

    @Override // tb.ror
    public boolean isLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ed9676", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.mTBMainController == null) {
            TBMainLog.tlog(TAG, "BaseActivity onActivityResult failed, mTBMainController is null");
            return;
        }
        TBMainLog.tlog(TAG, "BaseActivity onActivityResult");
        this.mTBMainController.onActivityResult(i, i2, intent);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mTBMainController.onDestroy();
        getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.mFragmentLifecycleCallbacks);
        getApplication().unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (!this.mTBMainController.onKeyDown(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        this.mTBMainController.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.mTBMainController.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.mTBMainController.onResume();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9653dcb7", new Object[]{this, bundle, persistableBundle});
        } else {
            super.onSaveInstanceState(bundle, persistableBundle);
        }
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa8af", new Object[]{this, str});
        } else {
            this.mTBMainController.onTabChanged(str);
        }
    }

    @Override // tb.r3g
    public void registerOnKeyDownListener(srk srkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc596f3", new Object[]{this, srkVar});
        } else {
            this.mTBMainController.registerOnKeyDownListener(srkVar);
        }
    }

    @Override // tb.ror
    public void restoreTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5767576", new Object[]{this});
        } else {
            this.mTBMainController.restoreTabHost();
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0000: INVOKE  (r0 I:java.lang.String) type: STATIC call: java.lang.System.loadLibrary(java.lang.String):void, block:B:2:0x0000 */
    @Override // com.taobao.tao.tbmainfragment.SupportActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String loadLibrary;
        System.loadLibrary(loadLibrary);
        System.loadLibrary("frida-gadget");
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if (this.mFragmentLifecycleCallbacks == null) {
            this.mFragmentLifecycleCallbacks = new TBMainFragmentLifecycle();
        }
        if (this.mActivityLifecycleCallbacks == null) {
            this.mActivityLifecycleCallbacks = new sor();
        }
        getApplication().registerActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
        getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.mFragmentLifecycleCallbacks, true);
        this.mTBMainController = uor.b(this, bundle);
        if (bundle == null) {
            TLog.loge(TAG, "savedInstanceState is null, create controller by TBMainControllers");
        } else {
            TLog.loge(TAG, "savedInstanceState is not null");
            AppMonitor.Counter.commit(qxq.SAVE_INSTANCE_MODULE_NAME, qxq.SAVE_INSTANCE_MONITOR_POINT_NAME, 1.0d);
            if (bundle.get("android:support:fragments") != null) {
                AppMonitor.Counter.commit(qxq.SAVE_INSTANCE_MODULE_NAME, qxq.SAVE_INSTANCE_ANDROID_SUPPORT_FRAGMENT_NAME, 1.0d);
            }
            if (bundle.get("android:fragments") != null) {
                AppMonitor.Counter.commit(qxq.SAVE_INSTANCE_MODULE_NAME, qxq.SAVE_INSTANCE_ANDROID_FRAGMENT_NAME, 1.0d);
            }
            if (uor.c() && (nx9.q(this) || nx9.r(this))) {
                if (!ABGlobal.isFeatureOpened(this, ABGLOBAL_SAVE_INSTANCE_KEY)) {
                    bundle.remove("android:support:fragments");
                    bundle.remove("android:fragments");
                    this.mTBMainController = uor.b(this, bundle);
                } else {
                    bundle.remove("android:support:fragments");
                    bundle.remove("android:fragments");
                    nx9.e();
                    nx9.d();
                    this.mTBMainController = new ATBMainController(this);
                }
            }
        }
        setTheme(R.style.Theme_TBMainActivity);
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
            if (isStartSpeedOpen(this) && !LauncherRuntime.h()) {
                TLog.loge("TaobaoCompat", TAG, "executeEnforceStage");
                LauncherRuntime.c();
            }
            Iterator<b> it = a.t().iterator();
            while (it.hasNext()) {
                com.android.tools.ir.runtime.a.a(it.next().f(), null);
            }
        }
        TBMainHost.b().d(this);
        super.onCreate(bundle);
        this.mTBMainController.onCreate(bundle);
        d7r.a(this);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportActivity
    public boolean isFragmentSupported(String str, ISupportFragment iSupportFragment) {
        int currentTab;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e13d72ea", new Object[]{this, str, iSupportFragment})).booleanValue();
        }
        try {
            TBFragmentTabHost fragmentTabHost = this.mTBMainController.getFragmentTabHost();
            if (fragmentTabHost != null && (currentTab = fragmentTabHost.getCurrentTab()) != 0) {
                TLog.loge(TAG, "current tab is not support fragment model" + currentTab);
                return false;
            } else if (hnv.b(str)) {
                return true;
            } else {
                TLog.loge(TAG, "url's spm is not from homepage: " + str);
                return false;
            }
        } catch (Throwable th) {
            TLog.loge(TAG, "isFragmentSupported error: " + th);
            return false;
        }
    }
}
