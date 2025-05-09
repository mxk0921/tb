package com.taobao.android.order.bundle.base;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.ultron.vfw.instance.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.helper.WvOrderPlugin;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import tb.czb;
import tb.fsw;
import tb.hav;
import tb.idl;
import tb.krr;
import tb.pcl;
import tb.s6h;
import tb.t2o;
import tb.u14;
import tb.u69;
import tb.vvo;
import tb.wqb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class TBOrderBaseActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LocalBroadcastManager g;
    public BroadcastReceiver h;
    public ContentObserver i;
    public TBPublicMenu j;
    public s6h k;

    static {
        t2o.a(713031736);
    }

    public static /* synthetic */ Object ipc$super(TBOrderBaseActivity tBOrderBaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1667413429:
                super.t3();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/base/TBOrderBaseActivity");
        }
    }

    public BroadcastReceiver A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("e449fead", new Object[]{this});
        }
        return null;
    }

    public a B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("53dc8f1e", new Object[]{this});
        }
        wqb c = q3().c();
        if (c instanceof czb) {
            a instance = ((czb) c).getInstance();
            if (instance != null) {
                return instance;
            }
            idl.d(OrderBizCode.logisticsDetail, "renderMapBubbleError", "UltronInstance is null");
            return null;
        }
        throw new IllegalStateException("ContainerProxy必须实现IDetailProxy");
    }

    public void C3(int i) {
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

    public void D3(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be4702d", new Object[]{this, activity});
            return;
        }
        if (this.g == null) {
            this.g = LocalBroadcastManager.getInstance(activity);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
        BroadcastReceiver A3 = A3();
        this.h = A3;
        if (A3 != null) {
            this.g.registerReceiver(A3, intentFilter);
        }
    }

    public final void E3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fc5b66", new Object[]{this});
        } else if (this.i == null) {
            vvo.k().q(t1());
            ContentObserver l = vvo.k().l(getApplicationContext());
            this.i = l;
            if (l != null) {
                try {
                    vvo.k().t(q3());
                    getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.i);
                    getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.i);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void F3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        View findViewById = findViewById(R.id.mask_layout);
        if (findViewById != null) {
            findViewById.setClickable(true);
            findViewById.setFocusable(true);
            findViewById.setVisibility(0);
            findViewById.bringToFront();
        }
        s6h s6hVar = this.k;
        if (s6hVar != null) {
            s6hVar.e();
        }
    }

    public final void G3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7a245f", new Object[]{this});
        } else if (this.i != null) {
            try {
                getContentResolver().unregisterContentObserver(this.i);
                vvo.k().t(null);
                vvo.k().r(null);
                vvo.k().q(null);
                this.i = null;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.h != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.h);
        }
        krr.e(this);
        WvOrderPlugin.release();
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TBPublicMenu tBPublicMenu = this.j;
        if (tBPublicMenu != null) {
            tBPublicMenu.onPause();
        }
        G3();
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TBPublicMenu tBPublicMenu = this.j;
        if (tBPublicMenu != null) {
            tBPublicMenu.onResume();
        }
        E3();
        WvOrderPlugin.setOrderEngine(q3());
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity
    public void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6362b5b5", new Object[]{this});
        } else {
            super.t3();
        }
    }

    public void z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
            return;
        }
        View findViewById = findViewById(R.id.mask_layout);
        if (findViewById != null) {
            findViewById.setVisibility(8);
            s6h s6hVar = this.k;
            if (s6hVar != null) {
                s6hVar.f();
            }
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity
    public void s3(Bundle bundle) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2ced03", new Object[]{this, bundle});
            return;
        }
        pcl.d(getApplicationContext());
        this.j = new TBPublicMenu(this);
        D3(this);
        fsw.i(CoreConstants.ORDER_WV_TB_ODER, WvOrderPlugin.class, true);
        krr.b(this);
        StringBuilder sb = new StringBuilder("onActivityCreate, Death Recovery? ");
        if (bundle == null) {
            z = false;
        }
        sb.append(z);
        hav.d("TBOrderBaseActivity", sb.toString());
    }
}
