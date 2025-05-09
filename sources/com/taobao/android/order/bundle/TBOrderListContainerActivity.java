package com.taobao.android.order.bundle;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import tb.t2o;
import tb.u14;
import tb.u69;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBOrderListContainerActivity extends AppCompatActivity implements ITBPublicMenu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBOrderListFragment f9089a;

    static {
        t2o.a(713031712);
        t2o.a(927989771);
    }

    public static /* synthetic */ Object ipc$super(TBOrderListContainerActivity tBOrderListContainerActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -884160602) {
            return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
        }
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/order/bundle/TBOrderListContainerActivity");
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
        }
        return this.f9089a.getPublicMenu();
    }

    public final void l3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36bd8f9f", new Object[]{this, new Integer(i)});
            return;
        }
        SystemBarDecorator systemBarDecorator = new SystemBarDecorator(this);
        if (u14.c(u69.a(this, i))) {
            systemBarDecorator.enableImmersiveStatusBar(true);
        } else {
            systemBarDecorator.enableImmersiveStatusBar();
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
        setContentView(R.layout.order_list_container);
        l3(4473924);
        this.f9089a = new TBOrderListFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("originActivityIntent", getIntent());
        this.f9089a.setArguments(bundle2);
        getSupportFragmentManager().beginTransaction().add(R.id.ol_fragment_container, this.f9089a).commit();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        TBOrderListFragment tBOrderListFragment = this.f9089a;
        if (tBOrderListFragment == null || !tBOrderListFragment.onKeyDown(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        return null;
    }
}
