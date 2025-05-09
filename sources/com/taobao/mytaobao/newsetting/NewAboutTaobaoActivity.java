package com.taobao.mytaobao.newsetting;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.base.Versions;
import com.taobao.android.nav.Nav;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.statistic.TBS;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.Globals;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.update.datasource.local.UpdateInfo;
import java.util.HashMap;
import tb.acq;
import tb.akv;
import tb.ih4;
import tb.pkv;
import tb.qh4;
import tb.suv;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewAboutTaobaoActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f11232a;
    public ViewGroup b;
    public ViewGroup c;
    public TextView d;
    public TextView e;
    public TextView f;

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements TBPublicMenu.TBOnOverflowButtonClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnOverflowButtonClickListener
        public void onOverflowButtonClicked() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ddc419b", new Object[]{this});
            } else {
                TBS.Ext.commitEvent("Page_MYTBSettingVC_aboutTB", Integer.parseInt("2101"), "Page_MYTBSettingVC_aboutTB_功能直达", null, null, "spm=a2141.20998086.4.9");
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            NewAboutTaobaoActivity.l3(NewAboutTaobaoActivity.this, "Page_MYTBSettingVC_aboutTB_去评价", new String[]{"spm=a2141.20998086.4.2"});
            NewAboutTaobaoActivity newAboutTaobaoActivity = NewAboutTaobaoActivity.this;
            NewAboutTaobaoActivity.m3(newAboutTaobaoActivity, newAboutTaobaoActivity, "com.taobao.taobao", null);
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            NewAboutTaobaoActivity.l3(NewAboutTaobaoActivity.this, "Page_MYTBSettingVC_aboutTB_版权信息", new String[]{"spm=a2141.20998086.4.4"});
            Nav.from(Globals.getApplication()).toUri("http://h5.m.taobao.com/other/android_legal.html");
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            NewAboutTaobaoActivity.l3(NewAboutTaobaoActivity.this, "Page_MYTBSettingVC_aboutTB_软件许可使用协议", new String[]{"spm=a2141.20998086.4.6"});
            Nav.from(Globals.getApplication()).toUri("http://terms.alicdn.com/legal-agreement/terms/suit_bu1_taobao/suit_bu1_taobao201901082305_94250.html");
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(NewAboutTaobaoActivity newAboutTaobaoActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Nav.from(Globals.getApplication()).toUri(ih4.f("fillCodeUrl", "https://beian.miit.gov.cn"));
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f11238a = 0;
        public long b = System.currentTimeMillis();

        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (this.f11238a > -1) {
                if (System.currentTimeMillis() - this.b > 500) {
                    this.f11238a = 0;
                }
                this.f11238a++;
                this.b = System.currentTimeMillis();
                if (this.f11238a >= 5) {
                    NewAboutTaobaoActivity.n3(NewAboutTaobaoActivity.this);
                    this.f11238a = -1;
                }
            }
        }
    }

    static {
        t2o.a(745537778);
    }

    public NewAboutTaobaoActivity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(NewAboutTaobaoActivity newAboutTaobaoActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode == 1893326613) {
            return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/newsetting/NewAboutTaobaoActivity");
        }
    }

    public static /* synthetic */ void l3(NewAboutTaobaoActivity newAboutTaobaoActivity, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2916a12", new Object[]{newAboutTaobaoActivity, str, strArr});
        } else {
            newAboutTaobaoActivity.r3(str, strArr);
        }
    }

    public static /* synthetic */ void m3(NewAboutTaobaoActivity newAboutTaobaoActivity, Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31fda19a", new Object[]{newAboutTaobaoActivity, context, str, str2});
        } else {
            newAboutTaobaoActivity.t3(context, str, str2);
        }
    }

    public static /* synthetic */ void n3(NewAboutTaobaoActivity newAboutTaobaoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0f3a21", new Object[]{newAboutTaobaoActivity});
        } else {
            newAboutTaobaoActivity.u3();
        }
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

    public final void o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f005133", new Object[]{this});
            return;
        }
        this.b.setOnClickListener(new b());
        this.c.setOnClickListener(new c());
        this.d.setOnClickListener(new d());
        this.e.setOnClickListener(new e());
        this.f.setOnClickListener(new f(this));
        p3();
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.new_mytaobao_setting_about_us);
        getSupportActionBar().setTitle(R.string.mytaobao_about_phonetaobao);
        getPublicMenu().setOnOverflowButtonClickListener(new a());
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.20998086.4.1");
        suv.m(this, "Page_MYTBSettingVC_aboutTB");
        suv.n(this, hashMap);
        s3();
        o3();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a451d2d8", new Object[]{this});
        } else if (Versions.isDebug()) {
            u3();
        } else {
            this.f11232a.setOnClickListener(new g());
        }
    }

    public final void r3(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afdfe6ab", new Object[]{this, str, strArr});
        } else {
            TBS.Ext.commitEvent("Page_MYTBSettingVC_aboutTB", Integer.parseInt("2101"), str, null, null, strArr);
        }
    }

    public final void t3(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6484a236", new Object[]{this, context, str, str2});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
                if (!TextUtils.isEmpty(str2)) {
                    intent.setPackage(str2);
                }
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2290c6f", new Object[]{this});
            return;
        }
        TextView textView = (TextView) findViewById(R.id.tv_setting_about_app_build_info);
        textView.setText("Build id: " + getResources().getString(R.string.packageTag));
        textView.setVisibility(0);
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            NewAboutTaobaoActivity.l3(NewAboutTaobaoActivity.this, "Page_MYTBSettingVC_aboutTB_版本更新", new String[]{"spm=a2141.20998086.4.3"});
            if (MtbGlobalEnv.t()) {
                return;
            }
            if (!ih4.a("trialVersionUpdate", true) || Localization.o()) {
                pkv.getInstance(NewAboutTaobaoActivity.this).update(false);
            } else {
                Nav.from(view.getContext()).toUri(qh4.e("trialVersionUpdateUrl", "https://web.m.taobao.com/app/TBVirtualInteractionClient/AppUpdate/update"));
            }
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        TBS.Ext.commitEvent("Page_MYTBSettingVC_aboutTB", Integer.parseInt("2101"), "Page_MYTBSettingVC_aboutTB_返回", null, null, "spm=a2141.20998086.4.8");
        finish();
        return true;
    }

    public final boolean q3() {
        UpdateInfo data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c97104b5", new Object[]{this})).booleanValue();
        }
        if (!MtbGlobalEnv.t() && (data = akv.getInstance(this).getData()) != null) {
            return data.updateList.containsKey("main");
        }
        return false;
    }

    public final void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        int i = R.id.rl_setting_about_us_evaluate;
        this.b = (ViewGroup) findViewById(i);
        this.f11232a = (TextView) findViewById(R.id.tv_about_us_version);
        this.f11232a.setText(getString(R.string.mytaobao_version) + " " + Globals.getVersionName());
        this.b = (ViewGroup) findViewById(i);
        this.c = (ViewGroup) findViewById(R.id.rl_setting_about_us_version_check);
        if (MtbGlobalEnv.t()) {
            this.c.setVisibility(8);
        }
        TextView textView = (TextView) findViewById(R.id.tv_setting_about_version_check_desc);
        q3();
        if (!MtbGlobalEnv.t()) {
            pkv.getInstance(this).update(true);
        }
        this.d = (TextView) findViewById(R.id.tv_about_us_copy_right);
        this.e = (TextView) findViewById(R.id.tv_about_us_app_policy);
        this.f = (TextView) findViewById(R.id.tv_filing_code);
        this.f.setText(ih4.f("fillCodeTxt", "备案号：浙B2-20080224-50A >"));
    }
}
