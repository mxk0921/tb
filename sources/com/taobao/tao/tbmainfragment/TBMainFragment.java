package com.taobao.tao.tbmainfragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tao.TBBaseFragment;
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
import tb.coj;
import tb.har;
import tb.hx9;
import tb.kpj;
import tb.ror;
import tb.t2o;
import tb.tor;
import tb.uor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBMainFragment extends TBMainBaseFragment implements ror {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBFragmentTabHost f12794a;
    public View c;

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
            return uor.d(((TBMainBaseFragment) TBMainFragment.this).mActivity, true);
        }

        @Override // tb.bqj
        public boolean onShow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("90d5bc07", new Object[]{this})).booleanValue();
            }
            return uor.d(((TBMainBaseFragment) TBMainFragment.this).mActivity, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBDialog f12796a;
        public final /* synthetic */ Method b;
        public final /* synthetic */ Object c;

        public b(TBDialog tBDialog, Method method, Object obj) {
            this.f12796a = tBDialog;
            this.b = method;
            this.c = obj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f12796a.dismiss();
            SharedPreferences.Editor edit = ((TBMainBaseFragment) TBMainFragment.this).mActivity.getApplicationContext().getSharedPreferences(TransportConstants.KEY_UUID, 0).edit();
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
        public final /* synthetic */ TBDialog f12797a;
        public final /* synthetic */ Method b;
        public final /* synthetic */ Object c;

        public c(TBMainFragment tBMainFragment, TBDialog tBDialog, Method method, Object obj) {
            this.f12797a = tBDialog;
            this.b = method;
            this.c = obj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f12797a.dismiss();
            try {
                this.b.invoke(this.c, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    static {
        t2o.a(775946387);
        t2o.a(775946327);
    }

    public static /* synthetic */ Object ipc$super(TBMainFragment tBMainFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2137173437:
                return super.onSupportCreateAnimation(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue());
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1542694236:
                super.onSupportInvisible();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 434397186:
                super.onHiddenChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 717157107:
                super.onAttachFragment((Fragment) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1270686685:
                super.onLowMemory();
                return null;
            case 1371699585:
                super.onFragmentResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Bundle) objArr[2]);
                return null;
            case 1950489833:
                super.onSupportVisible();
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/tbmainfragment/TBMainFragment");
        }
    }

    public static TBMainFragment s2(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMainFragment) ipChange.ipc$dispatch("21d30b8b", new Object[]{uri});
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(hx9.KEY_FRAGMENT_URL, uri);
        TBMainFragment tBMainFragment = new TBMainFragment();
        tBMainFragment.setArguments(bundle);
        return tBMainFragment;
    }

    @Override // tb.dvd
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }

    @Override // tb.dvd
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
        } else if (!Login.checkSessionValid()) {
            Login.login(true);
            TBFragmentTabHost tBFragmentTabHost = this.f12794a;
            if (tBFragmentTabHost != null) {
                tBFragmentTabHost.doLogin();
            }
        }
    }

    @Override // tb.ror
    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}));
        }
        View view = this.c;
        if (view != null) {
            return (T) view.findViewById(i);
        }
        return null;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        }
    }

    @Override // tb.ror
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
        }
        return this.f12794a.getCurrentFragment();
    }

    @Override // tb.ror
    public TBFragmentTabHost getFragmentTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[]{this});
        }
        return this.f12794a;
    }

    @Override // tb.ror
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return ((TBMainBaseFragment) this).mActivity.getClass().getName();
    }

    @Override // tb.ror
    public String getSimpleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f06186", new Object[]{this});
        }
        return ((TBMainBaseFragment) this).mActivity.getClass().getSimpleName();
    }

    @Override // tb.ror
    public boolean isLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ed9676", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return getClass().getName();
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public boolean needPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24050629", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
        } else {
            super.onAttach(context);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttachFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abef2f3", new Object[]{this, fragment});
        } else {
            super.onAttachFragment(fragment);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Activity activity = ((TBMainBaseFragment) this).mActivity;
        if (activity != null) {
            try {
                new SystemBarDecorator(activity).enableImmersiveStatusBar();
            } catch (Throwable th) {
                Log.e("TBMainFragment", "enableImmersiveStatusBar failed:", th);
            }
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.c == null) {
            View inflate = layoutInflater.inflate(R.layout.tb_main_fragment, viewGroup, false);
            this.c = inflate;
            r2(inflate);
            u2();
            this.f12794a.setNavigationVisibleCallback(new a());
            UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        }
        return this.c;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = this.f12794a;
        if (tBFragmentTabHost != null) {
            tBFragmentTabHost.setNavigationVisibleCallback(null);
        }
        super.onDestroy();
        com.taobao.tao.navigation.a.d0();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else {
            super.onDestroyView();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else {
            super.onDetach();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
        } else {
            super.onHiddenChanged(z);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (((TBMainBaseFragment) this).mActivity.isFinishing() || z2(i, keyEvent)) {
            return false;
        }
        if (keyEvent.getRepeatCount() <= 0) {
            Fragment currentFragment = getCurrentFragment();
            if ((currentFragment instanceof TBBaseFragment) && ((TBBaseFragment) currentFragment).onPanelKeyDown(i, keyEvent)) {
                return true;
            }
            if (i != 4 || this.f12794a.getCurrentTab() == 0) {
                return false;
            }
            Activity activity = ((TBMainBaseFragment) this).mActivity;
            activity.setIntent(Nav.from(activity).intentForUri(com.taobao.tao.navigation.a.t().get(0).q()));
            this.f12794a.setCurrentTab(0);
            return true;
        } else if (i == 4) {
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            super.onLowMemory();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void onNewIntent(Intent intent) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        Activity activity = ((TBMainBaseFragment) this).mActivity;
        if (activity != null) {
            activity.setIntent(intent);
            if (intent.getExtras() != null) {
                Activity activity2 = ((TBMainBaseFragment) this).mActivity;
                int targetTabIndex = TargetTabHelper.getTargetTabIndex(activity2, activity2.getIntent());
                if (targetTabIndex != 302 || coj.a(intent)) {
                    i = targetTabIndex;
                } else if (v2(intent)) {
                    return;
                }
                this.f12794a.setCurrentTab(i);
                Fragment currentFragment = this.f12794a.getCurrentFragment();
                if ((currentFragment instanceof TBBaseFragment) && (((TBMainBaseFragment) this).mActivity instanceof FragmentActivity) && getChildFragmentManager().findFragmentByTag(currentFragment.getTag()) != null) {
                    ((TBBaseFragment) currentFragment).onNewIntent(intent);
                }
            }
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TBFragmentTabHost tBFragmentTabHost = this.f12794a;
        if (tBFragmentTabHost != null) {
            tBFragmentTabHost.onPause();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TBFragmentTabHost tBFragmentTabHost = this.f12794a;
        if (tBFragmentTabHost != null) {
            tBFragmentTabHost.onResume();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public Animation onSupportCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("809d5243", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        TBMainLog.tlog("TBMainFragment", "interrput animation is not null");
        return super.onSupportCreateAnimation(i, z, i2);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
            return;
        }
        TBMainLog.tlog("TBMainFragment", "into onSupportInvisible: ");
        super.onSupportInvisible();
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
            return;
        }
        TBMainLog.tlog("TBMainFragment", "into onSupportVisible: ");
        super.onSupportVisible();
        TBFragmentTabHost tBFragmentTabHost = this.f12794a;
        if (tBFragmentTabHost == null) {
            har.a("fragment_lifecycle_error", "tab_host_is_null");
        } else if (tBFragmentTabHost.getCurrentFragment() == null) {
            har.a("fragment_lifecycle_error", "tab_fragment_is_null");
        }
    }

    public void p2(LoginAction loginAction) {
        TBFragmentTabHost tBFragmentTabHost;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e790823", new Object[]{this, loginAction});
        } else if (loginAction != null && (tBFragmentTabHost = this.f12794a) != null) {
            tBFragmentTabHost.handleLoginBroadcast(loginAction);
            ArrayList<Fragment> fragments = this.f12794a.getFragments();
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

    public void r2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e16e6", new Object[]{this, view});
        } else if (view != null) {
            TBFragmentTabHost tBFragmentTabHost = (TBFragmentTabHost) view.findViewById(16908306);
            this.f12794a = tBFragmentTabHost;
            tBFragmentTabHost.setup(((TBMainBaseFragment) this).mActivity, getChildFragmentManager(), R.id.tbTabFragment);
            this.f12794a.getTabWidget().setDividerDrawable(17170445);
            com.taobao.tao.navigation.a.S(this.f12794a);
            kpj.a(((TBMainBaseFragment) this).mActivity);
            this.f12794a.updateTabHost();
            this.f12794a.preloadIndicatorView();
        }
    }

    @Override // tb.ror
    public void restoreTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5767576", new Object[]{this});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = this.f12794a;
        if (tBFragmentTabHost != null) {
            int currentTab = tBFragmentTabHost.getCurrentTab();
            this.f12794a.clearAllTabs();
            r2(this.c);
            this.f12794a.setCurrentTab(currentTab);
        }
    }

    public final void u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289b8033", new Object[]{this});
            return;
        }
        Activity activity = ((TBMainBaseFragment) this).mActivity;
        if (activity == null) {
            this.f12794a.setCurrentTab(0);
            return;
        }
        Intent intent = activity.getIntent();
        int targetTabIndex = TargetTabHelper.getTargetTabIndex(((TBMainBaseFragment) this).mActivity, intent);
        if (targetTabIndex != 302 || coj.a(intent)) {
            tor.a(targetTabIndex);
            this.f12794a.setCurrentTab(targetTabIndex);
            return;
        }
        v2(intent);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public void onFragmentResult(int i, int i2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c27981", new Object[]{this, new Integer(i), new Integer(i2), bundle});
            return;
        }
        super.onFragmentResult(i, i2, bundle);
        if (i == 100 && i2 == -1 && bundle != null) {
            Toast.makeText(getActivity(), bundle.getString("title"), 0).show();
        }
    }

    public final boolean v2(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e69a7d24", new Object[]{this, intent})).booleanValue();
        }
        if (intent.getExtras() == null || intent.getExtras().getInt("INTENT_FILTER_LABEL", -1) == -1) {
            return false;
        }
        return coj.b(((TBMainBaseFragment) this).mActivity, intent);
    }

    public boolean z2(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() > 0 && ((i == 4 || i == 25) && ((TBMainBaseFragment) this).mActivity.getString(R.string.env_switch).equals("1"))) {
            try {
                Class<?> cls = Class.forName("android.taobao.mulitenv.EnvironmentViewControler");
                Method method = cls.getMethod("getRootView", new Class[0]);
                Method method2 = cls.getMethod("exit", new Class[0]);
                Object newInstance = cls.getConstructor(Activity.class).newInstance(((TBMainBaseFragment) this).mActivity);
                if (newInstance != null) {
                    TBDialog tBDialog = new TBDialog(((TBMainBaseFragment) this).mActivity, -1, "环境设置", null, (View) method.invoke(newInstance, new Object[0]), true);
                    tBDialog.setPositiveButton(new b(tBDialog, method2, newInstance));
                    tBDialog.setNegativeButton(new c(this, tBDialog, method2, newInstance));
                    tBDialog.show();
                    TBMainLog.tlog("TBMainFragment", "show debug dialog");
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
