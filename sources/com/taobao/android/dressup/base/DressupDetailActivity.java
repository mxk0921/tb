package com.taobao.android.dressup.base;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.acq;
import tb.ckf;
import tb.g1c;
import tb.jz7;
import tb.t2o;
import tb.xfb;
import tb.xod;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/taobao/android/dressup/base/DressupDetailActivity;", "Lcom/taobao/android/dressup/base/BaseDressupActivity;", "Ltb/xfb;", "<init>", "()V", "Landroid/view/View;", "rootView", "Ltb/xhv;", "bizSetRootContentView", "(Landroid/view/View;)V", "view", "frameAnimSetContentView", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressupDetailActivity extends BaseDressupActivity implements xfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final IDressUpAnimHelper b = jz7.Companion.d();

    static {
        t2o.a(918552589);
        t2o.a(352322008);
    }

    public static /* synthetic */ Object ipc$super(DressupDetailActivity dressupDetailActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1395267618:
                super.m3((Bundle) objArr[0]);
                return null;
            case 1962423460:
                return new Boolean(super.b(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/base/DressupDetailActivity");
        }
    }

    @Override // tb.xfb
    public void M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ea209e", new Object[]{this});
        } else {
            p();
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

    @Override // com.taobao.android.dressup.base.BaseDressupActivity
    public boolean b(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74f834a4", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4 || !m()) {
            return super.b(i, keyEvent);
        }
        return true;
    }

    @Override // com.taobao.android.dressup.base.BaseDressupActivity
    public void bizSetRootContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("468d41e", new Object[]{this, view});
            return;
        }
        ckf.g(view, "rootView");
        IDressUpAnimHelper iDressUpAnimHelper = this.b;
        if (iDressUpAnimHelper != null) {
            iDressUpAnimHelper.animBizSetRootContentView(this, view, this);
        } else {
            setContentView(view);
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        IDressUpAnimHelper iDressUpAnimHelper = this.b;
        if (iDressUpAnimHelper == null || !iDressUpAnimHelper.onFinishContainer()) {
            p();
        }
    }

    @Override // tb.xfb
    public void frameAnimSetContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1910d5f1", new Object[]{this, view});
        } else if (view != null) {
            setContentView(view);
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b437136d", new Object[]{this})).booleanValue();
        }
        IDressUpAnimHelper iDressUpAnimHelper = this.b;
        if (iDressUpAnimHelper == null || !iDressUpAnimHelper.onBackPressed()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.dressup.base.BaseDressupActivity
    public void m3(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532a1822", new Object[]{this, bundle});
            return;
        }
        IDressUpAnimHelper iDressUpAnimHelper = this.b;
        if (iDressUpAnimHelper != null) {
            iDressUpAnimHelper.tryInitSwitchAndSetTheme(this, getIntent());
        }
        super.m3(bundle);
    }

    @Override // com.taobao.android.dressup.base.BaseDressupActivity
    public xod n3(g1c g1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xod) ipChange.ipc$dispatch("fdc2f3d3", new Object[]{this, g1cVar});
        }
        return jz7.Companion.c(g1cVar);
    }

    @Override // com.taobao.android.dressup.base.BaseDressupActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        IDressUpAnimHelper iDressUpAnimHelper = this.b;
        if (iDressUpAnimHelper != null) {
            iDressUpAnimHelper.onDestroy();
        }
        super.onDestroy();
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd817337", new Object[]{this});
        } else {
            super.finish();
        }
    }
}
