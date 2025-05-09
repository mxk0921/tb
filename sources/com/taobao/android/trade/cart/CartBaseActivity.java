package com.taobao.android.trade.cart;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.UltronSecondICartFragment;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.tao.TBBaseFragment;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import tb.d7r;
import tb.t2o;
import tb.zbl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CartBaseActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBBaseFragment f9684a;
    public long b;

    static {
        t2o.a(697303044);
    }

    public static /* synthetic */ Object ipc$super(CartBaseActivity cartBaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/cart/CartBaseActivity");
        }
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity
    public boolean isLoginRequired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("594922a9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        TBBaseFragment tBBaseFragment = this.f9684a;
        if (tBBaseFragment != null) {
            tBBaseFragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.b = System.currentTimeMillis();
        super.onCreate(bundle);
        d7r.a(getActivity());
        setContentView(R.layout.cart_activity_layout);
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        if (bundle != null && zbl.a()) {
            this.f9684a = (TBBaseFragment) getSupportFragmentManager().findFragmentById(R.id.cart_activity_root);
        }
        if (this.f9684a == null) {
            l3(getIntent());
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        TBBaseFragment tBBaseFragment = this.f9684a;
        if (tBBaseFragment == null || !tBBaseFragment.onPanelKeyDown(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        if (intent != null) {
            l3(intent);
        }
    }

    public final void l3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b517b895", new Object[]{this, intent});
            return;
        }
        this.f9684a = new UltronSecondICartFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromCartActivity", true);
        bundle.putLong("tabCartStartTime", this.b);
        bundle.putParcelable("activityIntent", intent);
        this.f9684a.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.cart_activity_root, this.f9684a, "cartFragment").commit();
    }
}
