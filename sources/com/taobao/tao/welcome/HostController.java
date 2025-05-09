package com.taobao.tao.welcome;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TabHost;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.utils.FileUtil;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.nav.Nav;
import com.taobao.tao.Globals;
import com.taobao.tao.favorite.FavoriteConstants;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.util.BuiltConfig;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Dialog.DialogAction;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.component.unify.Dialog.Theme;
import com.taobao.uikit.extend.component.unify.TBButtonType;
import com.taobao.uikit.extend.utils.TintHelper;
import com.ut.mini.UTAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.dvd;
import tb.me2;
import tb.qqg;
import tb.t2o;
import tb.wb0;
import tb.yb0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class HostController implements TabHost.OnTabChangeListener, dvd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPLIANCE_TRACE_ENABLE = ".compliance_big_dialog";
    public static final String KEY_APP_VIEW_MODE = "appViewMode";
    private static final String KEY_ASKED_BEFORE = "askedBefore";
    public static final String KEY_CONTROLLER_IMPL_B = "hostControllerImplB";
    public static final String KEY_EXTRA_BROADCAST_MODE = "needFinishBroadcast";
    public static final String KEY_EXTRA_FULLY_NEW_INSTALL = "fullyNewInstall";
    private static final String KEY_PROVISION = "shouldcreateprovision";
    public static final String KEY_REQUEST_PERMISSION_ALWAYS = "requestPermissionAlways";
    private static final String KEY_TIP = "shouldCreateWelcomeTip";
    private static final String KEY_TRAFFIC = "shouldCreateTrafficPrompt";
    public static final String PAGE_NAME = "Page_Welcome";
    private static final int REQUEST_APP_PERMISSION = 200;
    private static final int REQUEST_APP_SETTINGS = 201;
    public static final String URI_HOMEPAGE = "http://m.taobao.com/index.htm";
    public static final String URI_MULTI_LANGUAGE = "http://m.taobao.com/i18nboarding.html";
    private static final AtomicBoolean sLaunched = new AtomicBoolean(false);
    public final wb0 activityMonitor;
    private final AppCompatActivity host;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements DialogInterface.OnKeyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(HostController hostController) {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements TBMaterialDialog.SingleButtonCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
        public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                return;
            }
            HostController.this.finish();
            HostController.this.overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CheckBox f12873a;

        public c(CheckBox checkBox) {
            this.f12873a = checkBox;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (this.f12873a.isChecked()) {
                TintHelper.setTint(this.f12873a, ContextCompat.getColor(HostController.this.getContext(), R.color.uik_btnNormal));
            } else {
                TintHelper.setTint(this.f12873a, ContextCompat.getColor(HostController.this.getContext(), R.color.uik_mdContentColor));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements TBMaterialDialog.SingleButtonCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CheckBox f12874a;

        public d(CheckBox checkBox) {
            this.f12874a = checkBox;
        }

        @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
        public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                return;
            }
            if (this.f12874a.isChecked()) {
                SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).edit();
                edit.putBoolean(HostController.KEY_TIP, false);
                edit.apply();
            }
            HostController.access$100(HostController.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f12875a;

        public e(Activity activity) {
            this.f12875a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f12875a.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements TBMaterialDialog.SingleButtonCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
        public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                return;
            }
            tBMaterialDialog.dismiss();
            HostController.this.navigate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements TBMaterialDialog.SingleButtonCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
        public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                return;
            }
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + TaoHelper.getPackageName()));
            intent.addCategory("android.intent.category.DEFAULT");
            HostController.this.startActivityForResult(intent, 201);
            tBMaterialDialog.dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements TBMaterialDialog.SingleButtonCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
        public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
            } else {
                HostController.this.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements DialogInterface.OnKeyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(HostController hostController) {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements TBMaterialDialog.SingleButtonCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
        public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
            } else {
                HostController.this.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CheckBox f12880a;

        public k(CheckBox checkBox) {
            this.f12880a = checkBox;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (this.f12880a.isChecked()) {
                TintHelper.setTint(this.f12880a, ContextCompat.getColor(HostController.this.getContext(), R.color.uik_btnNormal));
            } else {
                TintHelper.setTint(this.f12880a, ContextCompat.getColor(HostController.this.getContext(), R.color.uik_mdContentColor));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l implements TBMaterialDialog.SingleButtonCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
        public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                return;
            }
            HostController.this.finish();
            HostController.this.overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class m implements TBMaterialDialog.SingleButtonCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CheckBox f12882a;

        public m(CheckBox checkBox) {
            this.f12882a = checkBox;
        }

        @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
        public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                return;
            }
            if (this.f12882a.isChecked()) {
                SharedPreferences.Editor edit = HostController.this.getApplicationContext().getSharedPreferences(HostController.this.getHost().getLocalClassName(), 0).edit();
                edit.putBoolean(HostController.KEY_TRAFFIC, false);
                edit.apply();
            }
            HostController.access$000(HostController.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface n {
    }

    static {
        t2o.a(734003207);
        t2o.a(734003250);
    }

    public HostController(AppCompatActivity appCompatActivity) {
        this.host = appCompatActivity;
        this.activityMonitor = yb0.a(appCompatActivity);
    }

    public static /* synthetic */ void access$000(HostController hostController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ec0b9", new Object[]{hostController});
        } else {
            hostController.afterTrafficPrompt();
        }
    }

    public static /* synthetic */ void access$100(HostController hostController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce64e58", new Object[]{hostController});
        } else {
            hostController.afterWelcomeTip();
        }
    }

    private void afterTrafficPrompt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d851f4c", new Object[]{this});
        } else {
            alertWelcomeTip();
        }
    }

    private void afterWelcomeTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c27aadc", new Object[]{this});
        } else {
            navigate();
        }
    }

    private void alertAvailableSizeDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef1d6dd", new Object[]{this});
        } else if (FileUtil.LOCAL_REPORT_FILE_MAX_SIZE >= TaoHelper.getSystemAvailableMemorySize()) {
            TBMaterialDialog build = new TBMaterialDialog.Builder(getContext()).content(R.string.wl_available_size_msg).cancelable(false).theme(Theme.LIGHT).positiveText(R.string.wl_AvailableSizeDialogBottonOK).onPositive(new h()).build();
            build.setOnKeyListener(new i(this));
            build.show();
        } else {
            alertTrafficPrompt();
        }
    }

    private void alertTrafficPrompt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16a0bcc", new Object[]{this});
        } else if (!shouldCreateTrafficPrompt(getContext())) {
            afterTrafficPrompt();
        } else {
            TBMaterialDialog build = new TBMaterialDialog.Builder(getContext()).cancelable(false).theme(Theme.LIGHT).positiveText(R.string.wl_Yes).positiveType(TBButtonType.NORMAL).negativeText(R.string.wl_No).negativeType(TBButtonType.SECONDARY).onNegative(new j()).customView(R.layout.welcom_dialog, false).build();
            TextView textView = (TextView) build.findViewById(R.id.welcom_dialog_content);
            if (BuiltConfig.getBoolean(R.string.huawei_traffic_prompt)) {
                textView.setText(R.string.huawei_traffic_prompt_msg);
            } else {
                textView.setText(R.string.traffic_prompt_msg);
            }
            CheckBox checkBox = (CheckBox) build.findViewById(R.id.welcom_dialog_checkbox);
            checkBox.setOnClickListener(new k(checkBox));
            TBMaterialDialog.Builder builder = build.getBuilder();
            if (builder != null) {
                builder.onPositive(new m(checkBox)).onNegative(new l());
            }
            build.setOnKeyListener(new a(this));
            build.show();
        }
    }

    private void alertWelcomeTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5be0e5c", new Object[]{this});
        } else if (!shouldCreateWelcomeTip(getApplicationContext())) {
            navigateInternal();
        } else {
            TBMaterialDialog build = new TBMaterialDialog.Builder(getContext()).cancelable(false).theme(Theme.LIGHT).positiveText(R.string.wl_Agree).positiveType(TBButtonType.NORMAL).negativeText(R.string.wl_Disagree).negativeType(TBButtonType.SECONDARY).onNegative(new b()).customView(R.layout.welcom_dialog, false).build();
            CheckBox checkBox = (CheckBox) build.findViewById(R.id.welcom_dialog_checkbox);
            checkBox.setOnClickListener(new c(checkBox));
            ((TextView) build.findViewById(R.id.welcom_dialog_content)).setText(R.string.welcome_tip);
            TBMaterialDialog.Builder builder = build.getBuilder();
            if (builder != null) {
                builder.onPositive(new d(checkBox));
            }
            build.show();
        }
    }

    private static HostController createController(AppCompatActivity appCompatActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HostController) ipChange.ipc$dispatch("69fbfcf8", new Object[]{appCompatActivity, new Boolean(z)});
        }
        if (z && LauncherRuntime.m) {
            putStringExtra(appCompatActivity, FavoriteConstants.QUERY_PARAMS_CREATE_TYPE, "processRecovery");
        }
        if (LauncherRuntime.m) {
            return new AController(appCompatActivity);
        }
        return new BController(appCompatActivity);
    }

    private void navigateInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afcdcd5", new Object[]{this});
        } else if (shouldEnterViewMode()) {
            enterViewMode(getHost());
            finish();
        } else if (shouldCreateProvision()) {
            alertProvision();
        } else {
            navigate();
        }
    }

    public static void putStringExtra(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c40911d", new Object[]{activity, str, str2});
            return;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            intent.putExtra(str, str2);
        }
    }

    public void alertProvision() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf766e0", new Object[]{this});
        }
    }

    public abstract /* synthetic */ boolean checkLogin();

    public void checkPrerequisite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c84b565", new Object[]{this});
        } else if (BuiltConfig.getBoolean(R.string.isAlertAvailableSizeDialog)) {
            alertAvailableSizeDialog();
        } else {
            alertTrafficPrompt();
        }
    }

    public abstract /* synthetic */ void doLogin();

    public <T extends View> T findViewById(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i2)}));
        }
        return (T) this.host.findViewById(i2);
    }

    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            this.host.finish();
        }
    }

    public Context getApplicationContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[]{this});
        }
        return this.host.getApplicationContext();
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.host;
    }

    public Activity getHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("66876023", new Object[]{this});
        }
        return this.host;
    }

    public Intent getIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
        }
        return this.host.getIntent();
    }

    public CharSequence getString(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1b376365", new Object[]{this, new Integer(i2)});
        }
        return this.host.getString(i2);
    }

    public FragmentManager getSupportFragmentManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("55fc71c6", new Object[]{this});
        }
        return this.host.getSupportFragmentManager();
    }

    public Object getSystemService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5c99a0f1", new Object[]{this, str});
        }
        return this.host.getSystemService(str);
    }

    public abstract boolean isImmersive();

    public abstract void navigate();

    public void onActivityResult(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
        } else if (i2 != 201) {
        } else {
            if (ContextCompat.checkSelfPermission(getContext(), "android.permission.READ_PHONE_STATE") == 0) {
                navigate();
            } else {
                requestPermissionViaSettingScreen();
            }
        }
    }

    public abstract /* synthetic */ void onConfirmed(int i2);

    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        printIntent(getIntent(), "onCreate");
        checkPrerequisite();
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (this.activityMonitor != null) {
            Activity host = getHost();
            putStringExtra(host, "finishReason", "onDestroy");
            this.activityMonitor.a(host);
        }
    }

    public void onFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39174778", new Object[]{this});
        } else {
            this.activityMonitor.a(this.host);
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i2), keyEvent})).booleanValue();
        }
        return false;
    }

    public void onLocaleSetDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809c7eb2", new Object[]{this});
        }
    }

    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else {
            printIntent(intent, "onNewIntent");
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public boolean onPreCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34f78a91", new Object[]{this, bundle})).booleanValue();
        }
        qqg.d(getIntent(), getHost().getClass().getName());
        return false;
    }

    public abstract /* synthetic */ void onRejected(int i2);

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        }
    }

    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public void overridePendingTransition(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6362f07", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else {
            this.host.overridePendingTransition(i2, i3);
        }
    }

    public void printIntent(Intent intent, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("455c67f7", new Object[]{this, intent, str});
        } else if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                sb.append(intent.toString());
                if (extras == null) {
                    str2 = "null";
                } else {
                    str2 = extras.toString();
                }
                sb.append(str2);
                TLog.loge("Welcome", sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    public void requestPermissionViaSettingScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd521d3", new Object[]{this});
        } else {
            new TBMaterialDialog.Builder(getContext()).positiveText(R.string.action_text_goto_setting).negativeText(R.string.action_text_refuse).theme(Theme.LIGHT).cancelable(false).customView(R.layout.permission_dialog2, false).onPositive(new g()).onNegative(new f()).show().show();
        }
    }

    public void setContentView(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i2)});
        } else {
            this.host.setContentView(i2);
        }
    }

    public void setIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f524bbe2", new Object[]{this, intent});
        } else {
            this.host.setIntent(intent);
        }
    }

    public void setTheme(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4c4535", new Object[]{this, new Integer(i2)});
        } else {
            this.host.setTheme(i2);
        }
    }

    public void startActivityForResult(Intent intent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c9ecaa", new Object[]{this, intent, new Integer(i2)});
        } else {
            this.host.startActivityForResult(intent, i2);
        }
    }

    public boolean handleIntent(Intent intent, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3396c47", new Object[]{this, intent, nVar})).booleanValue();
        }
        return false;
    }

    public boolean isFragmentSupported(String str, ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e13d72ea", new Object[]{this, str, iSupportFragment})).booleanValue();
        }
        return false;
    }

    public void updateProvisionFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bfbd81f", new Object[]{this});
            return;
        }
        Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).edit().putBoolean(KEY_PROVISION, false).commit();
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(getHost(), "Page_Welcome");
        this.activityMonitor.b(getHost());
    }

    public static HostController create(AppCompatActivity appCompatActivity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HostController) ipChange.ipc$dispatch("2b93e34", new Object[]{appCompatActivity, bundle});
        }
        if (bundle != null) {
            putStringExtra(appCompatActivity, FavoriteConstants.QUERY_PARAMS_CREATE_TYPE, "recovery");
        } else {
            putStringExtra(appCompatActivity, FavoriteConstants.QUERY_PARAMS_CREATE_TYPE, "newTask");
        }
        if (bundle != null && bundle.getBoolean(KEY_CONTROLLER_IMPL_B, false)) {
            return createController(appCompatActivity, true);
        }
        if (sLaunched.compareAndSet(false, true)) {
            return createController(appCompatActivity, false);
        }
        return new AController(appCompatActivity);
    }

    public static void enterViewMode(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d29579", new Object[]{activity});
            return;
        }
        Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).edit().putInt(KEY_APP_VIEW_MODE, 1).putBoolean(KEY_PROVISION, true).commit();
        Bundle bundle = new Bundle();
        bundle.putBoolean("viewMode", true);
        Intent flags = new Intent("android.intent.action.VIEW", Uri.parse("http://viewmode.m.taobao.com/index.htm")).setPackage(TaoHelper.getPackageName()).putExtra("url", "https://market.m.taobao.com/app/dinamic/h5-tb-home/index.html?isViewMode=true").putExtra("params", bundle).setFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(flags, 65536);
        if (resolveActivity != null) {
            ActivityInfo activityInfo = resolveActivity.activityInfo;
            flags.setClassName(activityInfo.packageName, activityInfo.name);
        }
        activity.startActivity(flags);
    }

    public static void exitViewMode(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98d7363f", new Object[]{activity});
            return;
        }
        Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).edit().putInt(KEY_APP_VIEW_MODE, 0).putBoolean(KEY_PROVISION, false).commit();
        Bundle bundle = new Bundle();
        bundle.putBoolean("fullyNewInstall", true);
        bundle.putBoolean(KEY_EXTRA_BROADCAST_MODE, true);
        Nav.from(activity).disableTransition().withExtras(bundle).withFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).toUri("http://m.taobao.com/index.htm");
        new Handler(Looper.getMainLooper()).postDelayed(new e(activity), 1000L);
    }

    private boolean shouldCreateProvision() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfbe2a91", new Object[]{this})).booleanValue();
        }
        return Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getBoolean(KEY_PROVISION, true);
    }

    public static boolean shouldCreateTrafficPrompt(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42a934f3", new Object[]{context})).booleanValue();
        }
        if (BuiltConfig.getBoolean(R.string.traffic_prompt)) {
            return context.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getBoolean(KEY_TRAFFIC, true);
        }
        return false;
    }

    public static boolean shouldCreateWelcomeTip(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e27725d", new Object[]{context})).booleanValue();
        }
        if (BuiltConfig.getBoolean(R.string.isMotoDevice)) {
            return context.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getBoolean(KEY_TIP, true);
        }
        return false;
    }

    private boolean shouldEnterViewMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("629a1bf8", new Object[]{this})).booleanValue();
        }
        return Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getInt(KEY_APP_VIEW_MODE, -1) == 1;
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i2), strArr, iArr});
            return;
        }
        SharedPreferences sharedPreferences = Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0);
        if (!sharedPreferences.getBoolean(KEY_ASKED_BEFORE, false)) {
            sharedPreferences.edit().putBoolean(KEY_ASKED_BEFORE, true).commit();
        }
        if (i2 != 200) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            me2.b(getApplicationContext(), getHost().getClass().getName(), "拨打电话", "不同意");
            navigate();
            return;
        }
        me2.b(getApplicationContext(), getHost().getClass().getName(), "拨打电话", "同意");
        navigate();
    }
}
