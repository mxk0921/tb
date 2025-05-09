package com.taobao.baseactivity;

import android.app.ActivityManager;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.mtop.wvplugin.MtopWVPlugin;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.Globals;
import com.taobao.tao.util.AppUtils;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.StringUtil;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.intf.Mtop;
import org.android.agoo.common.AgooConstants;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CustomBaseActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROADCAST_ACTIVITY = "Broadcast_Activity";
    private static final String TAG = "CustomBaseActivity";
    private CustomLoginBroadcastReceiver loginReceiver;
    private BroadcastReceiver mBroadcastReceiver;
    private String mEnterAdv;
    private String mPageName;
    public ProgressDialog mProgressDialog;
    public String mUserNick;
    public boolean mIsDataLoaded = false;
    public boolean mNeedRefresh = false;
    public boolean mIsLoginCancel = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class CustomLoginBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<CustomBaseActivity> f10220a;

        static {
            t2o.a(775946300);
        }

        public CustomLoginBroadcastReceiver(CustomBaseActivity customBaseActivity) {
            this.f10220a = new WeakReference<>(customBaseActivity);
        }

        public static /* synthetic */ Object ipc$super(CustomLoginBroadcastReceiver customLoginBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/baseactivity/CustomBaseActivity$CustomLoginBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            CustomBaseActivity customBaseActivity = this.f10220a.get();
            if (intent != null && customBaseActivity != null) {
                customBaseActivity.handleLoginBroadcastCustom(LoginAction.valueOf(intent.getAction()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(775946297);
    }

    public static /* synthetic */ Object ipc$super(CustomBaseActivity customBaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
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
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/baseactivity/CustomBaseActivity");
        }
    }

    private boolean isTopActivity() {
        ComponentName componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("997d8785", new Object[]{this})).booleanValue();
        }
        try {
            componentName = ((ActivityManager) Globals.getApplication().getSystemService("activity")).getRunningTasks(1).get(0).topActivity;
            return getClass().getName().equals(componentName.getClassName());
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void load() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        this.mIsDataLoaded = true;
        onLoaded();
    }

    public static void sendActivityNeedRefreshBroadcast(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0603218", new Object[]{context, str});
        } else if (context != null && !StringUtil.isEmpty(str)) {
            Intent intent = new Intent();
            intent.setAction("Broadcast_Activity");
            intent.putExtra(str, true);
            intent.setPackage(Globals.getApplication().getPackageName());
            context.sendBroadcast(intent);
        }
    }

    @Override // com.taobao.tao.BaseActivity
    public String getUTClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b84448b", new Object[]{this});
        }
        return getClass().getName();
    }

    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mPageName)) {
            return this.mPageName;
        }
        String simpleName = getClass().getSimpleName();
        int indexOf = simpleName.indexOf(Dispatchers.TYPE_ACTIVITY);
        if (indexOf != -1) {
            return simpleName.substring(0, indexOf);
        }
        return simpleName;
    }

    public void handleBroadcastReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2adef4", new Object[]{this, context, intent});
        }
    }

    public void handleLoginBroadcastCustom(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1745134", new Object[]{this, loginAction});
        } else if (loginAction != null) {
            int i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[loginAction.ordinal()];
            if (i == 1) {
                this.mIsLoginCancel = false;
                if (Login.checkSessionValid()) {
                    Mtop.instance(getApplicationContext()).registerSessionInfo(Login.getSid(), Login.getEcode(), Login.getUserId());
                }
                if (!this.mIsDataLoaded) {
                    load();
                } else {
                    onLoginSuccess();
                }
            } else if (i == 2) {
                this.mIsLoginCancel = true;
                if (isLoginRequired() && !Login.checkSessionValid()) {
                    finish();
                }
            } else if (i == 3 || i == 4) {
                this.mIsLoginCancel = true;
                if (isLoginRequired() && !Login.checkSessionValid()) {
                    finish();
                }
            }
        }
    }

    public void hideWaitDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672fcb06", new Object[]{this});
            return;
        }
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.hide();
        }
    }

    public void hideloadingMaskLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49213b17", new Object[]{this});
            return;
        }
        View findViewById = findViewById(R.id.mask_layout);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public boolean isLoginOut(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbf177c4", new Object[]{this, str})).booleanValue();
        }
        if (str.equals(MtopWVPlugin.ERR_SID_INVALID) || str.equals(AgooConstants.MTOP_ERRCODE_AUTH_REJECT)) {
            return true;
        }
        return false;
    }

    public boolean isLoginRequired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("594922a9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void observerLoginStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6809060c", new Object[]{this});
        } else {
            observerLoginStatus(true);
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        observerLoginStatus(false);
        if (!getClass().getName().equals(getUTClassName())) {
            AppUtils.fromPointTBS(getIntent(), getUTClassName());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        unObserverLoginStatus();
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.mProgressDialog.setOnDismissListener(null);
        }
        super.onDestroy();
    }

    public void onLoaded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f6894b", new Object[]{this});
        }
    }

    public boolean onLoginSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbcebe4", new Object[]{this})).booleanValue();
        }
        if (isLoginRequired()) {
            String nick = Login.getNick();
            if (this.mUserNick == null) {
                this.mUserNick = nick;
            }
            String str = this.mUserNick;
            if (str == null || !TextUtils.equals(nick, str)) {
                if (isTopActivity()) {
                    Nav.from(this).withFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).toUri("http://m.taobao.com/index.htm");
                } else {
                    this.mNeedRefresh = true;
                }
            }
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        BroadcastReceiver broadcastReceiver = this.mBroadcastReceiver;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.mBroadcastReceiver = null;
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.mBroadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.baseactivity.CustomBaseActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/baseactivity/CustomBaseActivity$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else {
                    CustomBaseActivity.this.handleBroadcastReceive(context, intent);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("Broadcast_Activity");
        registerReceiver(this.mBroadcastReceiver, intentFilter);
        if (!isLoginRequired() || !this.mIsLoginCancel || Login.checkSessionValid()) {
            this.mIsLoginCancel = false;
            if (!TextUtils.isEmpty(Login.getSid())) {
                this.mUserNick = Login.getNick();
            }
            if (this.mNeedRefresh) {
                this.mNeedRefresh = false;
                load();
                return;
            }
            return;
        }
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (z && !this.mIsDataLoaded) {
            if (!isLoginRequired()) {
                load();
            } else if (Login.checkSessionValid()) {
                load();
            } else if (!this.mIsLoginCancel) {
                reLogin();
            } else {
                finish();
            }
        }
    }

    public void reLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb6f27d", new Object[]{this});
            return;
        }
        if (!this.mIsLoginCancel && !isFinishing()) {
            Login.login(true);
        }
        this.mIsLoginCancel = false;
    }

    public void setEnterAdv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("445d080e", new Object[]{this, str});
        } else {
            this.mEnterAdv = str;
        }
    }

    public void setUTPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fa6fac", new Object[]{this, str});
        } else {
            this.mPageName = str;
        }
    }

    public void showLoadingMaskLayout(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01641b1", new Object[]{this, bool});
            return;
        }
        int i = R.id.mask_layout;
        View findViewById = findViewById(i);
        if (findViewById == null) {
            findViewById = LayoutInflater.from(Globals.getApplication()).inflate(R.layout.loading_mask_layout, (ViewGroup) findViewById(i));
        }
        findViewById.setClickable(bool.booleanValue());
        findViewById.setFocusable(bool.booleanValue());
        findViewById.setVisibility(0);
        findViewById.bringToFront();
    }

    public void showToast(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42438872", new Object[]{this, new Integer(i)});
        } else {
            Constants.showToast(i);
        }
    }

    public void showWaitDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7ca581", new Object[]{this});
            return;
        }
        createDialogifNeed();
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.show();
        }
    }

    public void unObserverLoginStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4947333", new Object[]{this});
        } else if (this.loginReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.loginReceiver);
        }
    }

    private void observerLoginStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99186e48", new Object[]{this, new Boolean(z)});
        } else if (isLoginRequired() || z) {
            if (this.loginReceiver == null) {
                this.loginReceiver = new CustomLoginBroadcastReceiver(this);
            }
            LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.loginReceiver);
        }
    }

    public void createDialogifNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3946be", new Object[]{this});
            return;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.mProgressDialog = progressDialog;
        progressDialog.setTitle("温馨提示");
        this.mProgressDialog.setMessage("正在处理,请稍候...");
        this.mProgressDialog.setCancelable(false);
        this.mProgressDialog.show();
    }

    public void showToast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
        } else {
            Constants.showToast(str);
        }
    }

    public void showLoadingMaskLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d001c", new Object[]{this});
        } else {
            showLoadingMaskLayout(Boolean.TRUE);
        }
    }
}
