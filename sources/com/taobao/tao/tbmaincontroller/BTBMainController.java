package com.taobao.tao.tbmaincontroller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.tao.tbmainfragment.TBMainFragment;
import com.taobao.tao.util.TargetTabHelper;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import tb.qxq;
import tb.srk;
import tb.t2o;
import tb.xw9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BTBMainController implements TBMainController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BTBMainController";
    private FragmentActivity mFragmentActivity;
    private FragmentManager mFragmentManager;
    private LoginBroadcastReceiver mLoginReceiver;
    private srk mOnKeyDownListener;
    private SupportActivity mSupportActivity;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class LoginBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(775946353);
        }

        public LoginBroadcastReceiver() {
        }

        public static /* synthetic */ Object ipc$super(LoginBroadcastReceiver loginBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/tbmaincontroller/BTBMainController$LoginBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                Fragment fragment = (Fragment) qxq.h(BTBMainController.access$000(BTBMainController.this));
                if (fragment instanceof TBMainFragment) {
                    ((TBMainFragment) fragment).p2(valueOf);
                }
            }
        }
    }

    static {
        t2o.a(775946352);
        t2o.a(775946355);
    }

    public BTBMainController(FragmentActivity fragmentActivity) {
        this.mFragmentActivity = fragmentActivity;
        this.mSupportActivity = (SupportActivity) fragmentActivity;
        this.mFragmentManager = fragmentActivity.getSupportFragmentManager();
    }

    public static /* synthetic */ FragmentManager access$000(BTBMainController bTBMainController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("5953d16c", new Object[]{bTBMainController});
        }
        return bTBMainController.mFragmentManager;
    }

    private void loadRootFragment(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89156148", new Object[]{this, uri});
        } else {
            this.mSupportActivity.loadRootFragment(R.id.tbFragment, TBMainFragment.s2(uri), false, false);
        }
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

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.dvd
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        Fragment fragment = (Fragment) qxq.h(this.mFragmentManager);
        if (fragment instanceof TBMainFragment) {
            return ((TBMainFragment) fragment).checkLogin();
        }
        return Login.checkSessionValid();
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.dvd
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
            return;
        }
        Fragment fragment = (Fragment) qxq.h(this.mFragmentManager);
        if (fragment instanceof TBMainFragment) {
            ((TBMainFragment) fragment).doLogin();
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}));
        }
        return (T) this.mFragmentActivity.findViewById(i);
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mFragmentActivity;
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
        }
        Fragment fragment = (Fragment) qxq.h(this.mFragmentManager);
        if (fragment instanceof TBMainFragment) {
            return ((TBMainFragment) fragment).getCurrentFragment();
        }
        return fragment;
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public TBFragmentTabHost getFragmentTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[]{this});
        }
        Fragment fragment = (Fragment) qxq.h(this.mFragmentManager);
        if (fragment instanceof TBMainFragment) {
            return ((TBMainFragment) fragment).getFragmentTabHost();
        }
        return null;
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mFragmentActivity.getClass().getName();
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, tb.ror
    public String getSimpleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f06186", new Object[]{this});
        }
        return this.mFragmentActivity.getClass().getSimpleName();
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
            return;
        }
        ISupportFragment h = qxq.h(this.mFragmentManager);
        if (h != null) {
            h.asFragment().onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onCreate(Bundle bundle) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this.mFragmentActivity);
        this.mFragmentActivity.setContentView(R.layout.tb_activity_main_new);
        observerLoginStatus();
        TBMainHost.b().d(this);
        Intent intent = this.mFragmentActivity.getIntent();
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = Uri.parse("http://m.taobao.com/index.htm");
        }
        if (bundle == null) {
            loadRootFragment(uri);
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        unObserverLoginStatus();
        TBMainHost.b().e();
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        srk srkVar = this.mOnKeyDownListener;
        if (srkVar == null || !srkVar.onKeyDown(i, keyEvent)) {
            return this.mSupportActivity.onSupportKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        FragmentActivity fragmentActivity = this.mFragmentActivity;
        if (fragmentActivity != null) {
            fragmentActivity.setIntent(intent);
            if (intent.getExtras() != null && TargetTabHelper.getTargetTabIndex(this.mFragmentActivity, intent) != -1 && (this.mFragmentActivity instanceof SupportActivity)) {
                ISupportFragment h = qxq.h(this.mFragmentManager);
                if (h instanceof TBMainFragment) {
                    ((TBMainFragment) h).onNewIntent(intent);
                    return;
                }
                qxq.n(false);
                ((SupportActivity) this.mFragmentActivity).popTo(TBMainFragment.class, false);
                TBMainFragment tBMainFragment = (TBMainFragment) qxq.c(this.mFragmentManager, TBMainFragment.class);
                if (tBMainFragment != null) {
                    tBMainFragment.onNewIntent(intent);
                    xw9.c(tBMainFragment, this.mFragmentActivity);
                }
            }
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
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
        Fragment fragment = (Fragment) qxq.h(this.mFragmentManager);
        if (fragment instanceof TBMainFragment) {
            ((TBMainFragment) fragment).restoreTabHost();
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
}
