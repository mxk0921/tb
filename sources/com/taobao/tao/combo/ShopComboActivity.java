package com.taobao.tao.combo;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.Properties;
import tb.acq;
import tb.t2o;
import tb.wnp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShopComboActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ShopComboController f11929a;

    static {
        t2o.a(764412049);
    }

    public static /* synthetic */ Object ipc$super(ShopComboActivity shopComboActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/combo/ShopComboActivity");
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

    public void l3(Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d613ece", new Object[]{this, properties});
            return;
        }
        TBS.Page.updatePageProperties(getUTClassName(), properties);
        TBS.EasyTrace.updateEasyTraceActivityProperties(getActivity(), properties);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        wnp.b();
        super.onCreate(bundle);
        setContentView(R.layout.shop_combo_main_activity_layout);
        this.f11929a = new ShopComboController(this);
        updateUTPageName("Page_ShopcollocationDetail");
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ShopComboController shopComboController = this.f11929a;
        if (shopComboController != null) {
            shopComboController.onDestory();
        }
        this.f11929a = null;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ShopComboController shopComboController = this.f11929a;
        if (shopComboController != null) {
            shopComboController.onPause();
        }
        super.onPause();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        ShopComboController shopComboController = this.f11929a;
        if (shopComboController != null) {
            shopComboController.onResume();
        }
    }

    public void updateUTPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd59013", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, str);
            setUTPageName(str);
        }
    }
}
