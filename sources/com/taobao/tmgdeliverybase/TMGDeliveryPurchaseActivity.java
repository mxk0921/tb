package com.taobao.tmgdeliverybase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.appbundle.a;
import com.taobao.taobao.R;
import com.taobao.tmgdeliverybase.fragment.EmptyFragment;
import tb.acq;
import tb.p7s;
import tb.ucq;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMGDeliveryPurchaseActivity extends AppCompatActivity implements EmptyFragment.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Fragment f13836a;

    public static /* synthetic */ Object ipc$super(TMGDeliveryPurchaseActivity tMGDeliveryPurchaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tmgdeliverybase/TMGDeliveryPurchaseActivity");
        }
    }

    public static /* synthetic */ Fragment l3(TMGDeliveryPurchaseActivity tMGDeliveryPurchaseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("eddf636b", new Object[]{tMGDeliveryPurchaseActivity});
        }
        return tMGDeliveryPurchaseActivity.f13836a;
    }

    public static /* synthetic */ Fragment m3(TMGDeliveryPurchaseActivity tMGDeliveryPurchaseActivity, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c9d28a31", new Object[]{tMGDeliveryPurchaseActivity, fragment});
        }
        tMGDeliveryPurchaseActivity.f13836a = fragment;
        return fragment;
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
            ipChange.ipc$dispatch("3f0de0d1", new Object[]{this});
        } else {
            zk9.b("com.taobao.android.tmgdelivery.TMGDeliveryPurchaseFragment", new p7s(this));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f13836a;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_tmgdelivery_purchase);
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(16908290)).getChildAt(0);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (!n3()) {
            EmptyFragment emptyFragment = new EmptyFragment();
            emptyFragment.s2(this);
            o3();
            beginTransaction.replace(16908290, emptyFragment);
            beginTransaction.commit();
            return;
        }
        Fragment instantiate = Fragment.instantiate(this, "com.taobao.android.tmgdelivery.TMGDeliveryPurchaseFragment", null);
        this.f13836a = instantiate;
        beginTransaction.replace(16908290, instantiate);
        beginTransaction.commit();
    }

    @Override // com.taobao.tmgdeliverybase.fragment.EmptyFragment.c
    public void onRetry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2145010", new Object[]{this});
        } else {
            o3();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }

    public final boolean n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4acbb8f4", new Object[]{this})).booleanValue();
        }
        ucq h = a.Companion.a().h();
        return h == null || BundleInfoManager.instance().getDynamicFeatures() == null || (BundleInfoManager.instance().getDynamicFeatureInfo("tmgdelivery") != null && h.f().contains("tmgdelivery"));
    }
}
