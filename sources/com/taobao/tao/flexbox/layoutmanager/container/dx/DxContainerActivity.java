package com.taobao.tao.flexbox.layoutmanager.container.dx;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentStateManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.turbo.subpage.component.dx.DxContainer;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.infoflow.multitab.nativetab.NativeContainerProvider;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.IUtActivityNotTrack;
import com.ut.mini.UTAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import tb.a07;
import tb.a1v;
import tb.acq;
import tb.ckf;
import tb.dwu;
import tb.ni8;
import tb.nwv;
import tb.pg1;
import tb.s6o;
import tb.t2o;
import tb.tfs;
import tb.wqg;

/* compiled from: Taobao */
@PopLayer.PopupAllowedFromFragment
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u000523456B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0005R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00067"}, d2 = {"Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity;", "Lcom/taobao/tao/BaseActivity;", "Ltb/wqg;", "Lcom/taobao/taobaocompat/lifecycle/IUtActivityNotTrack;", "<init>", "()V", "Ltb/xhv;", "setupThemeAndTransition", "", "parsePageUrl", "()Z", "", "pageName", "updatePageName", "(Ljava/lang/String;)V", "", "pageProperties", a1v.UPDATE_PAGE_PROPERTIES, "(Ljava/util/Map;)V", "Landroid/os/Bundle;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "onCreate", "(Landroid/os/Bundle;)V", "onSetActivityTheme", "hideActionBar", "onResume", "onPause", "onStart", "onStop", "onDestroy", "finish", "", "onCreateTime", "J", "Lcom/taobao/android/turbo/subpage/component/dx/DxContainer;", NativeContainerProvider.DX_CONTAINER, "Lcom/taobao/android/turbo/subpage/component/dx/DxContainer;", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$b;", "businessParams", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$b;", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$c;", "dxRenderParams", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$c;", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$e;", "viewParams", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$e;", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$d;", "pageParams", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity$d;", "Companion", "a", TplMsg.VALUE_T_NATIVE_RETURN, "c", "d", "e", "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DxContainerActivity extends BaseActivity implements wqg, IUtActivityNotTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final int MSG_DELAY_ONPAUSE = 2;
    private static final int MSG_TIMEOUT_REFRESH = 1;
    public static final String PARAMS_BIZ_TYPE = "bizType";
    public static final String PARAMS_NAME = "name";
    public static final String PARAMS_NAMESPACE = "nameSpace";
    public static final String PARAMS_PAGE_NAME = "pageName";
    public static final String PARAMS_PAGE_SPM = "spm";
    public static final String PARAMS_SHOW_ACTION_BAR = "showActionBar";
    public static final String PARAMS_SHOW_STATUS_BAR = "showStatusBar";
    public static final String PARAMS_URL = "url";
    public static final String PARAMS_URL_BUSINESS_PARAMS = "urlParams";
    public static final String PARAMS_VERSION = "version";
    public static final String PARAM_BUSINESS_ID = "businessId";
    private static final String TAG = "DxContainerActivity";
    private static int sPAUSE_TIMEOUT;
    private static int sTIME_OUT;
    private DxContainer dxContainer;
    private long onCreateTime;
    private final b businessParams = new b();
    private final c dxRenderParams = new c();
    private final e viewParams = new e();
    private final d pageParams = new d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(502268257);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f12173a = "";
        public String b = "";
        public String c = "";
        public JSONObject d = new JSONObject();

        static {
            t2o.a(502268258);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
            }
            return this.f12173a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("883dfac8", new Object[]{this});
            }
            return this.b;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3e990d94", new Object[]{this});
            }
            return this.c;
        }

        public final JSONObject d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("4fc37d46", new Object[]{this});
            }
            return this.d;
        }

        public final void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            this.f12173a = str;
        }

        public final void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f66ae5ae", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            this.b = str;
        }

        public final void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16c660ca", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            this.c = str;
        }

        public final void h(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("236e596", new Object[]{this, jSONObject});
                return;
            }
            ckf.g(jSONObject, "<set-?>");
            this.d = jSONObject;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long b;

        /* renamed from: a  reason: collision with root package name */
        public String f12174a = "";
        public String c = "";

        static {
            t2o.a(502268259);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4be7588a", new Object[]{this});
            }
            return this.f12174a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("61228e2e", new Object[]{this});
            }
            return this.c;
        }

        public final long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c35c9d8f", new Object[]{this})).longValue();
            }
            return this.b;
        }

        public final void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41cfda2c", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            this.f12174a = str;
        }

        public final void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7cf1970", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            this.c = str;
        }

        public final void f(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da7b2895", new Object[]{this, new Long(j)});
            } else {
                this.b = j;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f12175a = "";
        public String b = "";
        public final Map<String, String> c = new LinkedHashMap();

        static {
            t2o.a(502268260);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
            }
            return this.f12175a;
        }

        public final Map<String, String> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a7f3a94", new Object[]{this});
            }
            return this.c;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6cf44f6e", new Object[]{this});
            }
            return this.b;
        }

        public final void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            this.f12175a = str;
        }

        public final void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38992730", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            this.b = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f12176a;
        public boolean b;

        static {
            t2o.a(502268261);
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9563ef55", new Object[]{this})).booleanValue();
            }
            return this.b;
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d0957219", new Object[]{this})).booleanValue();
            }
            return this.f12176a;
        }

        public final void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae462faf", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public final void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d945056b", new Object[]{this, new Boolean(z)});
            } else {
                this.f12176a = z;
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DxContainer access$getDxContainer$p = DxContainerActivity.access$getDxContainer$p(DxContainerActivity.this);
            if (access$getDxContainer$p != null) {
                access$getDxContainer$p.w(1);
            }
            DxContainerActivity.access$finish$s796903516(DxContainerActivity.this);
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().pageDisAppear(DxContainerActivity.this);
        }
    }

    static {
        t2o.a(502268256);
        t2o.a(775946454);
    }

    public static final /* synthetic */ void access$finish$s796903516(DxContainerActivity dxContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3aac12", new Object[]{dxContainerActivity});
        } else {
            super.finish();
        }
    }

    public static final /* synthetic */ DxContainer access$getDxContainer$p(DxContainerActivity dxContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DxContainer) ipChange.ipc$dispatch("53711828", new Object[]{dxContainerActivity});
        }
        return dxContainerActivity.dxContainer;
    }

    public static final /* synthetic */ void access$setDxContainer$p(DxContainerActivity dxContainerActivity, DxContainer dxContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e90a320e", new Object[]{dxContainerActivity, dxContainer});
        } else {
            dxContainerActivity.dxContainer = dxContainer;
        }
    }

    public static /* synthetic */ Object ipc$super(DxContainerActivity dxContainerActivity, String str, Object... objArr) {
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
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/container/dx/DxContainerActivity");
        }
    }

    private final void updatePageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f43f4", new Object[]{this, str});
            return;
        }
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().updatePageName(this, str);
    }

    private final void updatePageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
            return;
        }
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().updatePageProperties(this, map);
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

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            nwv.z0(new f(), true);
        }
    }

    public void hideActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6efde2", new Object[]{this});
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        android.app.ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        boolean X = nwv.X();
        tfs.e(TAG, "onCreate: " + X);
        if (X) {
            if (!parsePageUrl()) {
                Intent intent = getIntent();
                ckf.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                Uri data = intent.getData();
                if (data == null || (str = data.toString()) == null) {
                    str = "";
                }
                ni8.b(this, str, "", "url 参数无法解析", null, null);
            }
            updatePageName(this.pageParams.a());
            updatePageProperties(this.pageParams.b());
            setupThemeAndTransition();
            super.onCreate(bundle);
            this.onCreateTime = System.nanoTime();
            dwu.c(this);
            DxContainer a2 = DxContainer.Companion.a(this, this.businessParams.a(), this.businessParams.b(), this.businessParams.c());
            this.dxContainer = a2;
            ckf.d(a2);
            a2.l();
            DxContainer dxContainer = this.dxContainer;
            ckf.d(dxContainer);
            dxContainer.v();
            if (!this.viewParams.b()) {
                Window window = getWindow();
                ckf.f(window, pg1.ATOM_EXT_window);
                s6o.D(window.getDecorView());
            }
            if (!this.viewParams.a()) {
                hideActionBar();
            }
            DxContainer dxContainer2 = this.dxContainer;
            ckf.d(dxContainer2);
            setContentView(dxContainer2.n(s6o.t(this), s6o.v(this), this.dxRenderParams.a(), this.dxRenderParams.c(), this.dxRenderParams.b(), null, null, null));
            DxContainer dxContainer3 = this.dxContainer;
            ckf.d(dxContainer3);
            dxContainer3.v();
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().pageAppear(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        tfs.e(TAG, "onDestroy");
        super.onDestroy();
        DxContainer dxContainer = this.dxContainer;
        if (dxContainer != null) {
            dxContainer.w(1);
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        tfs.e(TAG, "onPause");
        super.onPause();
        DxContainer dxContainer = this.dxContainer;
        if (dxContainer != null) {
            dxContainer.z();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        tfs.e(TAG, "onResume");
        super.onResume();
        DxContainer dxContainer = this.dxContainer;
        if (dxContainer != null) {
            dxContainer.A();
        }
    }

    @Override // tb.wqg
    public void onSetActivityTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e714bbe", new Object[]{this});
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        tfs.e(TAG, "onStart");
        super.onStart();
        DxContainer dxContainer = this.dxContainer;
        if (dxContainer != null) {
            dxContainer.B();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        tfs.e(TAG, "onStop");
        super.onStop();
        DxContainer dxContainer = this.dxContainer;
        if (dxContainer != null) {
            dxContainer.C();
        }
    }

    private final void setupThemeAndTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b83127", new Object[]{this});
            return;
        }
        setTheme(R.style.Theme_OverLayingActionBar);
        getWindow().requestFeature(12);
        Window window = getWindow();
        ckf.f(window, "this.window");
        window.setEnterTransition(null);
        Window window2 = getWindow();
        ckf.f(window2, "this.window");
        window2.setExitTransition(null);
        overridePendingTransition(0, 0);
    }

    private final boolean parsePageUrl() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9256f038", new Object[]{this})).booleanValue();
        }
        Intent intent = getIntent();
        ckf.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        b bVar = this.businessParams;
        String queryParameter = data.getQueryParameter("bizType");
        if (queryParameter == null) {
            queryParameter = this.businessParams.a();
        }
        bVar.e(queryParameter);
        b bVar2 = this.businessParams;
        String queryParameter2 = data.getQueryParameter("businessId");
        if (queryParameter2 == null) {
            queryParameter2 = this.businessParams.b();
        }
        bVar2.f(queryParameter2);
        b bVar3 = this.businessParams;
        String queryParameter3 = data.getQueryParameter(PARAMS_NAMESPACE);
        if (queryParameter3 == null) {
            queryParameter3 = this.businessParams.c();
        }
        bVar3.g(queryParameter3);
        b bVar4 = this.businessParams;
        if (data.getQueryParameter(PARAMS_URL_BUSINESS_PARAMS) != null) {
            jSONObject = JSON.parseObject(data.getQueryParameter(PARAMS_URL_BUSINESS_PARAMS));
            ckf.f(jSONObject, "JSONObject.parseObject(u…AMS_URL_BUSINESS_PARAMS))");
        } else {
            jSONObject = this.businessParams.d();
        }
        bVar4.h(jSONObject);
        c cVar = this.dxRenderParams;
        String queryParameter4 = data.getQueryParameter("name");
        if (queryParameter4 == null) {
            queryParameter4 = this.dxRenderParams.a();
        }
        cVar.d(queryParameter4);
        c cVar2 = this.dxRenderParams;
        String queryParameter5 = data.getQueryParameter("version");
        if (queryParameter5 == null) {
            queryParameter5 = String.valueOf(this.dxRenderParams.c());
        }
        cVar2.f(Long.parseLong(queryParameter5));
        c cVar3 = this.dxRenderParams;
        String queryParameter6 = data.getQueryParameter("url");
        if (queryParameter6 == null) {
            queryParameter6 = this.dxRenderParams.b();
        }
        cVar3.e(queryParameter6);
        e eVar = this.viewParams;
        String queryParameter7 = data.getQueryParameter(PARAMS_SHOW_STATUS_BAR);
        String str = "false";
        if (queryParameter7 == null) {
            queryParameter7 = str;
        }
        eVar.d(Boolean.parseBoolean(queryParameter7));
        e eVar2 = this.viewParams;
        String queryParameter8 = data.getQueryParameter(PARAMS_SHOW_ACTION_BAR);
        if (queryParameter8 != null) {
            str = queryParameter8;
        }
        eVar2.c(Boolean.parseBoolean(str));
        d dVar = this.pageParams;
        String queryParameter9 = data.getQueryParameter("pageName");
        if (queryParameter9 == null) {
            queryParameter9 = this.pageParams.a();
        }
        dVar.d(queryParameter9);
        d dVar2 = this.pageParams;
        String queryParameter10 = data.getQueryParameter("spm");
        if (queryParameter10 == null) {
            queryParameter10 = this.pageParams.c();
        }
        dVar2.e(queryParameter10);
        Set<String> queryParameterNames = data.getQueryParameterNames();
        ckf.f(queryParameterNames, "uri.queryParameterNames");
        for (String str2 : queryParameterNames) {
            Map<String, String> b2 = this.pageParams.b();
            ckf.f(str2, AdvanceSetting.NETWORK_TYPE);
            String queryParameter11 = data.getQueryParameter(str2);
            if (queryParameter11 == null) {
                queryParameter11 = "";
            }
            b2.put(str2, queryParameter11);
        }
        return true;
    }
}
