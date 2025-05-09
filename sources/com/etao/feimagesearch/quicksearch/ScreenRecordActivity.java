package com.etao.feimagesearch.quicksearch;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.TaoInit;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.taobao.R;
import java.util.Map;
import tb.acq;
import tb.b8m;
import tb.c21;
import tb.ckf;
import tb.cql;
import tb.dwo;
import tb.h1p;
import tb.jzu;
import tb.lg4;
import tb.nmj;
import tb.npc;
import tb.qvo;
import tb.t2o;
import tb.xhv;
import tb.zwh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ScreenRecordActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MediaProjectionManager b;
    public MediaProjection c;
    public qvo e;
    public com.taobao.android.weex_framework.a f;
    public Intent g;

    /* renamed from: a  reason: collision with root package name */
    public final int f4854a = 1;
    public boolean d = true;
    public final Handler h = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ Intent c;

        public a(int i, Intent intent) {
            this.b = i;
            this.c = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ScreenRecordActivity screenRecordActivity = ScreenRecordActivity.this;
            if (!ScreenRecordActivity.o3(screenRecordActivity, this.b, this.c, true, ScreenRecordActivity.l3(screenRecordActivity))) {
                ScreenRecordActivity.n3(ScreenRecordActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ScreenRecordActivity.p3(ScreenRecordActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            } else {
                ckf.g(mUSDKInstance, "instance");
            }
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
                return;
            }
            ckf.g(aVar, "instance");
            ckf.g(str, "errorMsg");
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            } else {
                ckf.g(aVar, "instance");
            }
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            ckf.g(aVar, "instance");
            ckf.g(str, "errorMsg");
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            } else {
                ckf.g(aVar, "instance");
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            ckf.g(aVar, "instance");
            ckf.g(str, "errorMsg");
            ScreenRecordActivity.m3(ScreenRecordActivity.this);
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            ckf.g(aVar, "instance");
            ScreenRecordActivity.m3(ScreenRecordActivity.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ScreenRecordActivity screenRecordActivity = ScreenRecordActivity.this;
            dwo.a aVar = dwo.Instance;
            if (!ScreenRecordActivity.o3(screenRecordActivity, aVar.a(), aVar.b(), false, ScreenRecordActivity.l3(ScreenRecordActivity.this))) {
                ScreenRecordActivity.n3(ScreenRecordActivity.this);
            }
        }
    }

    static {
        t2o.a(730857687);
    }

    public static /* synthetic */ Object ipc$super(ScreenRecordActivity screenRecordActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/quicksearch/ScreenRecordActivity");
        }
    }

    public static final /* synthetic */ boolean l3(ScreenRecordActivity screenRecordActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19b5e857", new Object[]{screenRecordActivity})).booleanValue();
        }
        return screenRecordActivity.d;
    }

    public static final /* synthetic */ void m3(ScreenRecordActivity screenRecordActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d52db70", new Object[]{screenRecordActivity});
        } else {
            screenRecordActivity.r3();
        }
    }

    public static final /* synthetic */ void n3(ScreenRecordActivity screenRecordActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("814b27a1", new Object[]{screenRecordActivity});
        } else {
            screenRecordActivity.s3();
        }
    }

    public static final /* synthetic */ boolean o3(ScreenRecordActivity screenRecordActivity, int i, Intent intent, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11ce612", new Object[]{screenRecordActivity, new Integer(i), intent, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        return screenRecordActivity.t3(i, intent, z, z2);
    }

    public static final /* synthetic */ void p3(ScreenRecordActivity screenRecordActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1162996", new Object[]{screenRecordActivity});
        } else {
            screenRecordActivity.u3();
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

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        try {
            MediaProjection mediaProjection = this.c;
            if (mediaProjection != null) {
                mediaProjection.stop();
            }
        } catch (Exception unused) {
        }
        Intent intent = this.g;
        if (intent != null) {
            stopService(intent);
        }
        qvo qvoVar = this.e;
        if (qvoVar != null) {
            qvoVar.g();
        }
        r3();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        finish();
    }

    public final void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484f62", new Object[]{this});
            return;
        }
        String v2 = lg4.v2();
        com.taobao.android.weex_framework.b f = com.taobao.android.weex_framework.b.f();
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.p("https://h5.m.taobao.com/tusou/image_editor/index.html?type=screen_record");
        xhv xhvVar = xhv.INSTANCE;
        com.taobao.android.weex_framework.a c2 = f.c(this, mUSInstanceConfig);
        this.f = c2;
        ckf.d(c2);
        c2.registerRenderListener(new c());
        zwh.Companion.a(this.f, v2, v2, null, null);
    }

    public final void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddeff19c", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.f;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        jzu.r(this, "Page_PltScreenRecord");
        if (i == this.f4854a) {
            if (i2 == 0) {
                jzu.e("plt_qs_denied", new String[0]);
                Toast.makeText(this, Localization.q(R.string.tao_screen_shot_cancel), 0).show();
                finish();
                return;
            }
            dwo.a aVar = dwo.Instance;
            aVar.c(i2);
            aVar.d(intent);
            jzu.e("plt_qs_authorized", new String[0]);
            new Handler(Looper.getMainLooper()).postDelayed(new a(i2, intent), 300L);
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
        b8m.INSTANCE.b();
        if (lg4.E0()) {
            TaoInit.loadXSearchSync();
        }
        if (lg4.k()) {
            nmj.a(this, h1p.PAILITAO_URL);
            finish();
            return;
        }
        jzu.r(this, "Page_PltScreenRecord");
        setTitle("");
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        Object systemService = getSystemService("media_projection");
        if (systemService != null) {
            this.b = (MediaProjectionManager) systemService;
            this.d = c21.g().getBoolean("isInBackground", false);
            jzu.e("plt_qs_clk", new String[0]);
            if (this.d) {
                jzu.e("plt_qs_otherapp_clk", new String[0]);
            }
            if (getApplicationInfo().targetSdkVersion >= 30) {
                Intent intent = new Intent(getApplicationContext(), ScreenRecordForegroundService.class);
                this.g = intent;
                if (Build.VERSION.SDK_INT >= 26) {
                    startForegroundService(intent);
                } else {
                    startService(intent);
                }
            }
            new Handler(Looper.getMainLooper()).postDelayed(new b(), 500L);
            q3();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
    }

    public final void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40eb144b", new Object[]{this});
            return;
        }
        jzu.e("plt_qs_fail", new String[0]);
        Toast.makeText(this, Localization.q(R.string.taobao_app_1007_1_19052), 0).show();
        stopService(this.g);
        finish();
    }

    public final void u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca5bcb6", new Object[]{this});
            return;
        }
        jzu.e("plt_qs_start_record", new String[0]);
        MediaProjectionManager mediaProjectionManager = this.b;
        if (mediaProjectionManager == null) {
            Toast.makeText(this, Localization.q(R.string.taobao_app_1007_1_19057), 0).show();
            finish();
        } else if (Build.VERSION.SDK_INT >= 34 || dwo.Instance.b() == null) {
            startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), this.f4854a);
        } else {
            this.h.postDelayed(new d(), 1L);
        }
    }

    public final boolean t3(int i, Intent intent, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e9135aa", new Object[]{this, new Integer(i), intent, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        try {
            MediaProjectionManager mediaProjectionManager = this.b;
            this.c = mediaProjectionManager == null ? null : mediaProjectionManager.getMediaProjection(i, intent);
            Map<String, String> b2 = cql.b(getIntent());
            Point point = new Point();
            getWindow().getWindowManager().getDefaultDisplay().getRealSize(point);
            qvo qvoVar = new qvo();
            this.e = qvoVar;
            MediaProjection mediaProjection = this.c;
            int i2 = point.x;
            int i3 = point.y;
            int i4 = getResources().getDisplayMetrics().densityDpi;
            ckf.f(b2, "params");
            qvoVar.h(this, mediaProjection, i2, i3, i4, z, z2, b2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
