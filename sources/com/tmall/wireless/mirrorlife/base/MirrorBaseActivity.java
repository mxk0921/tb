package com.tmall.wireless.mirrorlife.base;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.rtqpixelstreamingandroid.RTQPixelStreaming;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.IUtActivityNotTrack;
import com.tmall.wireless.mirrorlife.base.listener.SoftHideKeyBoardUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.acq;
import tb.bdq;
import tb.edq;
import tb.gvk;
import tb.rqk;
import tb.t2o;
import tb.ucq;
import tb.uuc;
import tb.vcq;
import tb.xcq;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MirrorBaseActivity extends CustomBaseActivity implements SoftHideKeyBoardUtil.SoftKeyboardListener, IUtActivityNotTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public uuc b;
    public ucq e;

    /* renamed from: a  reason: collision with root package name */
    public final List<SoftHideKeyBoardUtil.SoftKeyboardListener> f14218a = new ArrayList();
    public final String c = "com.tmall.wireless.mirrorlife.main.MirrorMainFragment";
    public final String d = "tmallandroid_MirrorLifeAndroid";
    public int f = -1;
    public final edq g = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
                return;
            }
            StringBuilder sb = new StringBuilder("onStateUpdate sessionid=");
            sb.append(bdqVar.h());
            sb.append(",status=");
            sb.append(bdqVar.i());
            if (bdqVar.h() == MirrorBaseActivity.this.f) {
                int i = bdqVar.i();
                if (i == 5) {
                    MirrorBaseActivity.l3(MirrorBaseActivity.this);
                } else if (i == 6) {
                    Toast.makeText(MirrorBaseActivity.this, "加载失败，请重试", 0).show();
                    MirrorBaseActivity.this.finish();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
            } else {
                MirrorBaseActivity.l3(MirrorBaseActivity.this);
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                MirrorBaseActivity.this.n3();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MirrorBaseActivity.this.showLoadingMaskLayout();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MirrorBaseActivity.this.hideloadingMaskLayout();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(MirrorBaseActivity mirrorBaseActivity) {
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
            } else {
                new StringBuilder("download fail ").append(exc.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements gvk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        /* renamed from: b */
        public void onSuccess(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
                return;
            }
            MirrorBaseActivity.this.f = num.intValue();
            new StringBuilder("download sucess sessionid=").append(num);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MirrorBaseActivity.this.hideloadingMaskLayout();
            }
        }
    }

    static {
        t2o.a(1037041666);
        t2o.a(1037041686);
        t2o.a(1037041682);
        t2o.a(1037041681);
        t2o.a(775946454);
    }

    public static /* synthetic */ Object ipc$super(MirrorBaseActivity mirrorBaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/wireless/mirrorlife/base/MirrorBaseActivity");
        }
    }

    public static /* synthetic */ void l3(MirrorBaseActivity mirrorBaseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abdf37e5", new Object[]{mirrorBaseActivity});
        } else {
            mirrorBaseActivity.m3();
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

    public final void m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470c6c9b", new Object[]{this});
            return;
        }
        runOnUiThread(new g());
        try {
            Fragment instantiate = Fragment.instantiate(this, this.c, null);
            if (instantiate instanceof uuc) {
                this.b = (uuc) instantiate;
            }
            if (instantiate != null) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                beginTransaction.replace(R.id.fragment_container, instantiate);
                beginTransaction.commitAllowingStateLoss();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void n3() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7625c3", new Object[]{this});
            return;
        }
        runOnUiThread(new c());
        ucq h = com.taobao.appbundle.a.Companion.a().h();
        this.e = h;
        if (h == null) {
            runOnUiThread(new d());
            return;
        }
        boolean contains = h.f().contains(this.d);
        if (BundleInfoManager.instance().getDynamicFeatureInfo(this.d) != null) {
            z = true;
        }
        boolean isDynamicFragment = BundleInfoManager.instance().isDynamicFragment(this.c);
        if (!contains || !z || !isDynamicFragment) {
            this.e.g(this.g);
            vcq.a(Globals.getApplication()).c(xcq.c().l(this.d).n()).c(new f()).b(new e(this));
            return;
        }
        m3();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        uuc uucVar = this.b;
        if (uucVar == null) {
            super.onBackPressed();
        } else if (!uucVar.onBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            IpChange ipChange = RTQPixelStreaming.$ipChange;
            RTQPixelStreaming.class.getMethod("register", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        Window window = getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(1792);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        setContentView(R.layout.mirrorlife_activity_base);
        SoftHideKeyBoardUtil.assistActivity(this, this);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(R.id.fragment_container, new MirrorLoadingFragment());
        beginTransaction.commitAllowingStateLoss();
        try {
            zk9.b(this.c, new b());
        } catch (Throwable unused2) {
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ucq ucqVar = this.e;
        if (ucqVar != null) {
            ucqVar.e(this.g);
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    @Override // com.tmall.wireless.mirrorlife.base.listener.SoftHideKeyBoardUtil.SoftKeyboardListener
    public void onSoftKeyboardChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff6f25ad", new Object[]{this, new Boolean(z)});
            return;
        }
        Iterator it = ((ArrayList) this.f14218a).iterator();
        while (it.hasNext()) {
            ((SoftHideKeyBoardUtil.SoftKeyboardListener) it.next()).onSoftKeyboardChange(z);
        }
    }
}
