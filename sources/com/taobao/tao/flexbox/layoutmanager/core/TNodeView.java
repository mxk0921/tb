package com.taobao.tao.flexbox.layoutmanager.core;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import tb.a5k;
import tb.akt;
import tb.e0o;
import tb.gl4;
import tb.krg;
import tb.lgs;
import tb.n54;
import tb.ni8;
import tb.nwv;
import tb.od0;
import tb.t2o;
import tb.tfs;
import tb.vfs;
import tb.yx9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TNodeView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TNodeView";
    public static final int UPPER_VIEW_LEVEL_HIGH = 60;
    public static final int UPPER_VIEW_LEVEL_HIGHEST = 100;
    public static final int UPPER_VIEW_LEVEL_LOW = 10;
    public static final int UPPER_VIEW_LEVEL_MIDDLE = 50;
    private int currentHeight;
    private int currentWidth;
    private Object data;
    private n54 delegate;
    private com.taobao.tao.flexbox.layoutmanager.core.o engine;
    private String errorPage;
    private Object host;
    private boolean ignoreTouchEvent;
    private com.taobao.tao.flexbox.layoutmanager.core.j messageHandler;
    private NetworkConnectChangedReceiver networkConnectChangedReceiver;
    private vfs.b oConfigListener;
    private boolean onStartLayoutSent;
    private boolean orangeRead;
    private e0o pageRenderIntercept;
    private HashMap params;
    private l renderCallback;
    private com.taobao.tao.flexbox.layoutmanager.core.n rootNode;
    private OnScreenChangedListener screenChangedListener;
    private String shortLinkName;
    private m suspendStateChangeCallback;
    private FrameLayout tnodeViewContainer;
    private n upperViewChangeCallback;
    private FrameLayout upperViewContainer;
    private String url;
    private lgs.b urlConfigs;
    private boolean useDefaultShortLinkUrl;
    private o viewLayoutCallback;
    private boolean renderUrlMode = false;
    private int currentScreenType = -1;
    private int lastLayoutStatus = 0;
    private boolean firstTime = true;
    private boolean isResumed = true;
    private boolean isStarted = true;
    private boolean isDestroy = false;
    private boolean suspendLayout = false;
    private boolean forceSize = false;
    private boolean onMeasureCalled = false;
    private boolean prepared = false;
    private n54.g callback = new a();
    private Handler handler = new Handler();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class NetworkConnectChangedReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(503317195);
        }

        public NetworkConnectChangedReceiver() {
        }

        public static /* synthetic */ Object ipc$super(NetworkConnectChangedReceiver networkConnectChangedReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/TNodeView$NetworkConnectChangedReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                TNodeView.access$000(TNodeView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements n54.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.n54.f
        public void a(o.y yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6649469f", new Object[]{this, yVar});
                return;
            }
            tfs.f("TNodeView onLayoutError");
            TNodeView.access$400(TNodeView.this).k(null);
            lgs.h(TNodeView.access$300(TNodeView.this));
            TNodeView.access$102(TNodeView.this, yVar.r());
            TNodeView.access$502(TNodeView.this, -1);
            if (TNodeView.access$600(TNodeView.this)) {
                if (TNodeView.access$100(TNodeView.this) != null) {
                    if (TNodeView.access$100(TNodeView.this).g) {
                        TNodeView.access$700(TNodeView.this);
                    } else {
                        TNodeView tNodeView = TNodeView.this;
                        TNodeView.access$800(tNodeView, TNodeView.access$100(tNodeView));
                    }
                }
                TNodeView.access$900(TNodeView.this);
            }
            d();
            if (TNodeView.access$1000(TNodeView.this) != null) {
                TNodeView.access$1000(TNodeView.this).onLayoutError();
            }
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("266565d5", new Object[]{this});
            }
            String access$300 = TNodeView.access$300(TNodeView.this);
            if (TextUtils.isEmpty(access$300) && TNodeView.access$100(TNodeView.this) != null) {
                access$300 = TNodeView.access$100(TNodeView.this).c;
            }
            if (!TextUtils.isEmpty(access$300) || !(TNodeView.this.getContext() instanceof Activity) || ((Activity) TNodeView.this.getContext()).getIntent() == null) {
                return access$300;
            }
            return ((Activity) TNodeView.this.getContext()).getIntent().getDataString();
        }

        public final String c() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f05b6691", new Object[]{this});
            }
            if (TNodeView.access$100(TNodeView.this) != null) {
                str = TNodeView.access$100(TNodeView.this).a();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) || TNodeView.access$200(TNodeView.this) == null) {
                return str;
            }
            return TNodeView.access$200(TNodeView.this).n();
        }

        public final void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eee4121", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", "renderfailed");
            com.taobao.tao.flexbox.layoutmanager.core.l.d(false, 100, "engineLoadError", null, hashMap.toString(), c(), b(), null, null, null);
        }

        @Override // tb.n54.g
        public void onLayoutCompleted(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e800489", new Object[]{this, nVar});
                return;
            }
            TNodeView.access$1100(TNodeView.this);
            TNodeView.access$1200(TNodeView.this);
            if (!akt.i0() || nVar.P() == null || (!nVar.P().r0() && !nVar.P().r0())) {
                TNodeView.access$1300(TNodeView.this).removeAllViews();
                View w0 = nVar.w0();
                if (w0 == null) {
                    tfs.d("onLayoutCompleted, rootView is Null");
                    return;
                }
                tfs.f("TNodeView onLayoutCompleted");
                ViewGroup.LayoutParams layoutParams = w0.getLayoutParams();
                if (!(layoutParams == null || (layoutParams.width == TNodeView.access$1400(TNodeView.this) && layoutParams.height == TNodeView.access$1500(TNodeView.this)))) {
                    tfs.g(TNodeView.TAG, hashCode() + " onLayoutCompleted sizeChanged, layoutWidth:" + layoutParams.width + " layoutHeight:" + layoutParams.height + " currentWidth:" + TNodeView.access$1400(TNodeView.this) + " currentHeight:" + TNodeView.access$1500(TNodeView.this));
                    TNodeView.access$1600(TNodeView.this, false);
                }
                TNodeView.access$502(TNodeView.this, 1);
                TNodeView.access$1702(TNodeView.this, nVar.P());
                TNodeView.access$1802(TNodeView.this, nVar);
                TNodeView.access$1900(TNodeView.this);
                if (w0.getParent() instanceof ViewGroup) {
                    ((ViewGroup) w0.getParent()).removeView(w0);
                }
                TNodeView.access$1300(TNodeView.this).addView(w0, new FrameLayout.LayoutParams(-1, -1));
                TNodeView.access$400(TNodeView.this).p(false);
                TNodeView.access$400(TNodeView.this).k(nVar);
                if (TNodeView.access$1000(TNodeView.this) != null) {
                    TNodeView.access$1000(TNodeView.this).onLayoutCompleted(nVar);
                    return;
                }
                return;
            }
            tfs.d("onLayoutCompleted, engine is destroy");
        }

        @Override // tb.n54.g
        public void onLayoutError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("834776a6", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TNodeView.access$2000(TNodeView.this)) {
                TNodeView.access$2100(TNodeView.this, TNodeView.this.getMeasuredWidth(), TNodeView.this.getMeasuredHeight());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
                TNodeView.this.resetForceLayout();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n f12197a;

        public d(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
            this.f12197a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TNodeView.access$2200(TNodeView.this, this.f12197a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TNodeView.access$2300(TNodeView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements ni8.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.ni8.c
        public void onRetry() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2145010", new Object[]{this});
                return;
            }
            TNodeView.access$1300(TNodeView.this).removeAllViews();
            TNodeView.access$000(TNodeView.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements vfs.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.vfs.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ea082d8", new Object[]{this, str, str2, str3});
            } else if (!TextUtils.isEmpty(str3) && !TNodeView.access$2400(TNodeView.this)) {
                TNodeView.access$2402(TNodeView.this, true);
                TNodeView.access$000(TNodeView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TNodeView.access$2502(TNodeView.this, true);
            if (!TNodeView.access$2400(TNodeView.this)) {
                TNodeView.access$2402(TNodeView.this, true);
                TNodeView.access$000(TNodeView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(TNodeView tNodeView) {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onActivityChanged(Activity activity, int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
            }
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            tfs.f("onScreenChanged, changeType: " + i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface j {
        void a(TNodeView tNodeView, View view);

        void b(TNodeView tNodeView, View view);

        void c(TNodeView tNodeView, View view);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface k extends l {
        void F2(lgs.b bVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface l {
        void onLayoutCompleted(com.taobao.tao.flexbox.layoutmanager.core.n nVar);

        void onLayoutError();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface m {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface n {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface o {
    }

    static {
        t2o.a(503317184);
    }

    public TNodeView(Context context) {
        super(context);
        setMotionEventSplittingEnabled(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.tnodeViewContainer = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.upperViewContainer = frameLayout2;
        addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        this.pageRenderIntercept = od0.D().w().a(context, null);
    }

    public static /* synthetic */ void access$000(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeb70e56", new Object[]{tNodeView});
        } else {
            tNodeView.startRender();
        }
    }

    public static /* synthetic */ lgs.b access$100(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgs.b) ipChange.ipc$dispatch("26fdfb63", new Object[]{tNodeView});
        }
        return tNodeView.urlConfigs;
    }

    public static /* synthetic */ l access$1000(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("7adca493", new Object[]{tNodeView});
        }
        return tNodeView.renderCallback;
    }

    public static /* synthetic */ lgs.b access$102(TNodeView tNodeView, lgs.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgs.b) ipChange.ipc$dispatch("dbe9e859", new Object[]{tNodeView, bVar});
        }
        tNodeView.urlConfigs = bVar;
        return bVar;
    }

    public static /* synthetic */ void access$1100(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6c4be6", new Object[]{tNodeView});
        } else {
            tNodeView.unwatchOrangeUpdate();
        }
    }

    public static /* synthetic */ void access$1200(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35701745", new Object[]{tNodeView});
        } else {
            tNodeView.unwatchNetworkUpdate();
        }
    }

    public static /* synthetic */ FrameLayout access$1300(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("4e8f9fb5", new Object[]{tNodeView});
        }
        return tNodeView.tnodeViewContainer;
    }

    public static /* synthetic */ int access$1400(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4177adf6", new Object[]{tNodeView})).intValue();
        }
        return tNodeView.currentWidth;
    }

    public static /* synthetic */ int access$1500(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("477b7955", new Object[]{tNodeView})).intValue();
        }
        return tNodeView.currentHeight;
    }

    public static /* synthetic */ void access$1600(TNodeView tNodeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626a0633", new Object[]{tNodeView, new Boolean(z)});
        } else {
            tNodeView.layout(z);
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.o access$1702(TNodeView tNodeView, com.taobao.tao.flexbox.layoutmanager.core.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.o) ipChange.ipc$dispatch("ba511f32", new Object[]{tNodeView, oVar});
        }
        tNodeView.engine = oVar;
        return oVar;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n access$1802(TNodeView tNodeView, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("562bc337", new Object[]{tNodeView, nVar});
        }
        tNodeView.rootNode = nVar;
        return nVar;
    }

    public static /* synthetic */ void access$1900(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8aa6de", new Object[]{tNodeView});
        } else {
            tNodeView.setContainerMessageHandlerInternal();
        }
    }

    public static /* synthetic */ n54 access$200(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n54) ipChange.ipc$dispatch("51223966", new Object[]{tNodeView});
        }
        return tNodeView.delegate;
    }

    public static /* synthetic */ boolean access$2000(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3de210c", new Object[]{tNodeView})).booleanValue();
        }
        return tNodeView.isDestroy;
    }

    public static /* synthetic */ boolean access$2100(TNodeView tNodeView, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f926cf0b", new Object[]{tNodeView, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        return tNodeView.syncLayout(i2, i3);
    }

    public static /* synthetic */ void access$2200(TNodeView tNodeView, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed3b44c", new Object[]{tNodeView, nVar});
        } else {
            tNodeView.relayout(nVar);
        }
    }

    public static /* synthetic */ void access$2300(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e98325", new Object[]{tNodeView});
        } else {
            tNodeView.layoutInternal();
        }
    }

    public static /* synthetic */ boolean access$2400(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbed4e88", new Object[]{tNodeView})).booleanValue();
        }
        return tNodeView.orangeRead;
    }

    public static /* synthetic */ boolean access$2402(TNodeView tNodeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a328ce56", new Object[]{tNodeView, new Boolean(z)})).booleanValue();
        }
        tNodeView.orangeRead = z;
        return z;
    }

    public static /* synthetic */ boolean access$2502(TNodeView tNodeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d9e6ed7", new Object[]{tNodeView, new Boolean(z)})).booleanValue();
        }
        tNodeView.useDefaultShortLinkUrl = z;
        return z;
    }

    public static /* synthetic */ String access$300(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c52e188d", new Object[]{tNodeView});
        }
        return tNodeView.url;
    }

    public static /* synthetic */ e0o access$400(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e0o) ipChange.ipc$dispatch("9e2b051e", new Object[]{tNodeView});
        }
        return tNodeView.pageRenderIntercept;
    }

    public static /* synthetic */ int access$502(TNodeView tNodeView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ade2eb67", new Object[]{tNodeView, new Integer(i2)})).intValue();
        }
        tNodeView.lastLayoutStatus = i2;
        return i2;
    }

    public static /* synthetic */ boolean access$600(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12cdd294", new Object[]{tNodeView})).booleanValue();
        }
        return tNodeView.renderUrlMode;
    }

    public static /* synthetic */ void access$700(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d19def", new Object[]{tNodeView});
        } else {
            tNodeView.watchNetworkUpdate();
        }
    }

    public static /* synthetic */ void access$800(TNodeView tNodeView, lgs.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0e7270", new Object[]{tNodeView, bVar});
        } else {
            tNodeView.watchOrangeUpdate(bVar);
        }
    }

    public static /* synthetic */ void access$900(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d934ad", new Object[]{tNodeView});
        } else {
            tNodeView.addErrorView();
        }
    }

    private void addErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4217b3", new Object[]{this});
            return;
        }
        this.tnodeViewContainer.removeAllViews();
        this.tnodeViewContainer.addView(ni8.b(getContext(), this.url, null, "tnode view render fail", this.errorPage, new f()), new FrameLayout.LayoutParams(-1, -1));
    }

    @Deprecated
    public static TNodeView create(o.y.a aVar, com.taobao.tao.flexbox.layoutmanager.core.o oVar, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("f93dbccc", new Object[]{aVar, oVar, lVar});
        }
        TNodeView tNodeView = new TNodeView(aVar.e());
        tNodeView.renderCallback = lVar;
        n54 n54Var = new n54(aVar, oVar, tNodeView.callback);
        n54Var.u(tNodeView);
        tNodeView.delegate = n54Var;
        return tNodeView;
    }

    private void doPrepare(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d27e823", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.o r = this.delegate.r();
        if (r != null && r.d0() != null && !this.prepared && akt.H1()) {
            this.prepared = true;
            yx9 V = r.V((Activity) getContext());
            if (V != null) {
                V.j();
                r.d0().X0(getContext());
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TNodeView tNodeView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1811093890:
                super.removeView((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/TNodeView");
        }
    }

    private void layoutInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ae850e", new Object[]{this});
            return;
        }
        this.delegate.w(this.host);
        this.delegate.B(this.currentWidth, this.currentHeight);
        this.engine = this.delegate.l();
    }

    private void onWindowSizeChanged(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a5970b", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else if (this.delegate.m() != null) {
            int i6 = this.currentScreenType;
            IDeviceInfo i7 = od0.D().i();
            if (i7 != null && (getContext() instanceof Activity)) {
                int o2 = i7.o((Activity) getContext());
                this.currentScreenType = o2;
                if (o2 != i6 && i6 != -1) {
                    this.engine.L0(this.delegate.m(), i6, this.currentScreenType, i4, i5);
                }
            }
        }
    }

    private void relayout(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbb06ae", new Object[]{this, nVar});
        } else if (nVar != null) {
            if (od0.D().i().i() && nVar.S() != null) {
                int i2 = nVar.S().f27261a;
                int i3 = this.currentWidth;
                if (i2 != i3) {
                    nVar.Y0(i3, this.currentHeight);
                    return;
                }
            }
            nVar.Z0(this.currentWidth, this.currentHeight);
        }
    }

    private void setContainerMessageHandlerInternal() {
        com.taobao.tao.flexbox.layoutmanager.core.j jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf50f46", new Object[]{this});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.n nVar = this.rootNode;
        if (nVar != null && (jVar = this.messageHandler) != null) {
            nVar.w1(202, jVar);
        }
    }

    private void startRender() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85e191f", new Object[]{this});
            return;
        }
        if (this.delegate == null) {
            Context context = getContext();
            com.taobao.tao.flexbox.layoutmanager.core.o oVar = this.engine;
            String str = this.url;
            Object obj = this.data;
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            n54 n54Var = new n54(context, oVar, str, jSONObject, this.params, this.callback);
            this.delegate = n54Var;
            n54Var.u(this);
            Object obj2 = this.data;
            if (obj2 instanceof Future) {
                this.delegate.v((Future) obj2);
                this.data = null;
            }
        }
        lgs.b f2 = lgs.f(this.url);
        if (f2 != null) {
            e0o a2 = od0.D().w().a(getContext(), f2);
            this.pageRenderIntercept = a2;
            a2.l(getContext(), this, this.host, f2);
        }
        if (f2 != null) {
            l lVar = this.renderCallback;
            if ((lVar instanceof k) && !this.onStartLayoutSent) {
                this.onStartLayoutSent = true;
                ((k) lVar).F2(f2);
            }
        }
        this.delegate.z(f2);
        this.delegate.A(this.useDefaultShortLinkUrl);
        if (this.currentWidth > 0 && this.currentHeight > 0) {
            layout(false);
        }
    }

    private boolean syncLayout(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e0cb110", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        int i4 = this.currentWidth;
        if (i4 == i2 && this.currentHeight == i3) {
            return false;
        }
        onWindowSizeChanged(i4, this.currentHeight, i2, i3);
        this.currentWidth = i2;
        this.currentHeight = i3;
        layout(true);
        return true;
    }

    private boolean syncRelayout(int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba236803", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        com.taobao.tao.flexbox.layoutmanager.core.n m2 = this.delegate.m();
        if (m2 == null || ((i4 = this.currentWidth) == i2 && this.currentHeight == i3)) {
            return false;
        }
        onWindowSizeChanged(i4, this.currentHeight, i2, i3);
        this.currentWidth = i2;
        this.currentHeight = i3;
        relayout(m2);
        return true;
    }

    private void unwatchNetworkUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7612fe68", new Object[]{this});
        } else if (this.networkConnectChangedReceiver != null) {
            getContext().unregisterReceiver(this.networkConnectChangedReceiver);
            this.networkConnectChangedReceiver = null;
        }
    }

    private void unwatchOrangeUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0d9794", new Object[]{this});
        } else if (this.oConfigListener != null) {
            vfs.g().l("weitao_switch", this.shortLinkName, this.oConfigListener);
            this.oConfigListener = null;
        }
    }

    private void watchNetworkUpdate() {
        Object systemService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("680cd88f", new Object[]{this});
        } else if (this.networkConnectChangedReceiver == null && Build.VERSION.SDK_INT >= 23) {
            systemService = getContext().getSystemService(ConnectivityManager.class);
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                this.networkConnectChangedReceiver = new NetworkConnectChangedReceiver();
                getContext().registerReceiver(this.networkConnectChangedReceiver, intentFilter);
            }
        }
    }

    private void watchOrangeUpdate(lgs.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd13151", new Object[]{this, bVar});
        } else if (bVar != null && !bVar.g && !TextUtils.isEmpty(bVar.h) && this.oConfigListener == null) {
            this.shortLinkName = bVar.h;
            this.oConfigListener = new g();
            vfs.g().p("weitao_switch", this.shortLinkName, this.oConfigListener);
            if (akt.T1()) {
                nwv.A0(new h(), 500L);
            }
        }
    }

    public void addUpperView(View view, ViewGroup.LayoutParams layoutParams, int i2, j jVar) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d6ccbc", new Object[]{this, view, layoutParams, new Integer(i2), jVar});
        } else if (view != null) {
            view.setTag(R.id.layout_manager_tnode_upper_level, Integer.valueOf(i2));
            if (jVar != null) {
                view.setTag(R.id.layout_manager_tnode_upper_lifcycle, jVar);
            }
            int childCount = this.upperViewContainer.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                } else if (nwv.t(this.upperViewContainer.getChildAt(childCount).getTag(R.id.layout_manager_tnode_upper_level), krg.LOG_LEVEL_DEBUG) < i2) {
                    i3 = childCount + 1;
                    break;
                } else {
                    childCount--;
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.upperViewContainer.addView(view, i3, layoutParams);
            tfs.g(TAG, "addUpperView:" + view);
        }
    }

    public boolean containView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("469dbb36", new Object[]{this, view})).booleanValue();
        }
        if (this.upperViewContainer != null) {
            for (int i2 = 0; i2 < this.upperViewContainer.getChildCount(); i2++) {
                if (this.upperViewContainer.getChildAt(i2) == view) {
                    return true;
                }
            }
        }
        return false;
    }

    public View findUpperViewAtLevel(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1de4e6bb", new Object[]{this, new Integer(i2)});
        }
        if (this.upperViewContainer == null) {
            return null;
        }
        for (int i3 = 0; i3 < this.upperViewContainer.getChildCount(); i3++) {
            View childAt = this.upperViewContainer.getChildAt(i3);
            if (childAt != null && nwv.t(childAt.getTag(R.id.layout_manager_tnode_upper_level), -1) == i2) {
                return childAt;
            }
        }
        return null;
    }

    public void forceLayout(int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f537527", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (syncRelayout(i2, i3)) {
            this.forceSize = true;
            nwv.A0(new c(), i4);
        }
    }

    public com.taobao.tao.flexbox.layoutmanager.core.o getEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.o) ipChange.ipc$dispatch("49f66b1f", new Object[]{this});
        }
        return this.engine;
    }

    public e0o getRenderIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e0o) ipChange.ipc$dispatch("e4ef8073", new Object[]{this});
        }
        return this.pageRenderIntercept;
    }

    public com.taobao.tao.flexbox.layoutmanager.core.n getRootNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("59438703", new Object[]{this});
        }
        return this.rootNode;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.url;
    }

    public boolean isContainerResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebaa37eb", new Object[]{this})).booleanValue();
        }
        return this.isResumed | this.isStarted;
    }

    public void layout(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0d52d1", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        int i4 = this.currentWidth;
        if (i4 != i2 || this.currentHeight != i3) {
            onWindowSizeChanged(i4, this.currentHeight, i2, i3);
            this.currentWidth = i2;
            this.currentHeight = i3;
            layout(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.screenChangedListener == null) {
            this.screenChangedListener = new i(this);
        }
        TBAutoSizeConfig.x().d0(this.screenChangedListener);
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.isDestroy = true;
        for (int i2 = 0; i2 <= this.upperViewContainer.getChildCount() - 1; i2++) {
            View childAt = this.upperViewContainer.getChildAt(i2);
            Object tag = childAt.getTag(R.id.layout_manager_tnode_upper_lifcycle);
            if (tag instanceof j) {
                ((j) tag).c(this, childAt);
            }
        }
        com.taobao.tao.flexbox.layoutmanager.core.o oVar = this.engine;
        if (oVar != null) {
            oVar.D0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        TBAutoSizeConfig.x().h0(this.screenChangedListener);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.ignoreTouchEvent) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        super.onLayout(z, i2, i3, i4, i5);
        o oVar = this.viewLayoutCallback;
        if (oVar != null) {
            ((a5k) oVar).q();
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        tfs.f("TNodeView onPause");
        this.isResumed = false;
        boolean p2 = akt.p2("fixPauseIntercept", true);
        if (!p2) {
            this.pageRenderIntercept.n(getContext(), this.host);
        }
        for (int i2 = 0; i2 <= this.upperViewContainer.getChildCount() - 1; i2++) {
            View childAt = this.upperViewContainer.getChildAt(i2);
            Object tag = childAt.getTag(R.id.layout_manager_tnode_upper_lifcycle);
            if (tag instanceof j) {
                ((j) tag).b(this, childAt);
            }
        }
        com.taobao.tao.flexbox.layoutmanager.core.o oVar = this.engine;
        if (oVar != null) {
            oVar.E0();
        }
        if (p2) {
            this.pageRenderIntercept.n(getContext(), this.host);
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        tfs.f("TNodeView onResume");
        this.isResumed = true;
        for (int i2 = 0; i2 <= this.upperViewContainer.getChildCount() - 1; i2++) {
            View childAt = this.upperViewContainer.getChildAt(i2);
            Object tag = childAt.getTag(R.id.layout_manager_tnode_upper_lifcycle);
            if (tag instanceof j) {
                ((j) tag).a(this, childAt);
            }
        }
        this.pageRenderIntercept.o(getContext(), this.host);
        com.taobao.tao.flexbox.layoutmanager.core.o oVar = this.engine;
        if (oVar != null) {
            oVar.G0();
        }
    }

    public void onSaveInstanceState(Map<String, Object> map) {
        com.taobao.tao.flexbox.layoutmanager.core.n rootNode;
        com.taobao.tao.flexbox.layoutmanager.core.n x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbed9be", new Object[]{this, map});
        } else if (akt.p2("enableSaveInstanceState", true) && (rootNode = getRootNode()) != null && (x = rootNode.x(TabBarControllerComponent.class)) != null) {
            x.K().onSaveInstanceState(map);
        }
    }

    public void onStart() {
        com.taobao.tao.flexbox.layoutmanager.core.n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        this.isStarted = true;
        com.taobao.tao.flexbox.layoutmanager.core.o oVar = this.engine;
        if (oVar != null && (nVar = this.rootNode) != null) {
            oVar.I0(nVar);
        }
    }

    public void onStop() {
        com.taobao.tao.flexbox.layoutmanager.core.n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        this.isStarted = false;
        com.taobao.tao.flexbox.layoutmanager.core.o oVar = this.engine;
        if (oVar != null && (nVar = this.rootNode) != null) {
            oVar.K0(nVar);
        }
    }

    public void prelayout(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8128f4", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (!this.suspendLayout) {
            syncLayout(i2, i3);
        }
    }

    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else if (this.lastLayoutStatus == -1 && this.delegate != null) {
            layout(false);
            this.delegate.y();
        }
    }

    public void removeUpperView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3b8348", new Object[]{this, view});
        } else if (this.upperViewContainer != null && view != null && containView(view)) {
            this.upperViewContainer.removeView(view);
            tfs.g(TAG, "removeUpperView:" + view);
        }
    }

    public void resetForceLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7c4aad", new Object[]{this});
        } else if (this.forceSize) {
            this.forceSize = false;
            if (this.onMeasureCalled && !this.isDestroy) {
                syncLayout(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setHost(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcae8a4d", new Object[]{this, obj});
        } else {
            this.host = obj;
        }
    }

    public void setIgnoreTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f9075fe", new Object[]{this, new Boolean(z)});
        } else {
            this.ignoreTouchEvent = z;
        }
    }

    public void setMessageHandler(com.taobao.tao.flexbox.layoutmanager.core.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c4711", new Object[]{this, jVar});
            return;
        }
        this.messageHandler = jVar;
        setContainerMessageHandlerInternal();
    }

    public void setPendingArgs(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833b7d8c", new Object[]{this, map});
            return;
        }
        n54 n54Var = this.delegate;
        if (n54Var != null) {
            n54Var.x(map);
        }
    }

    public void setSuspendStateChangeCallback(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ae6988", new Object[]{this, mVar});
        }
    }

    public void setUpperViewChangeCallback(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545c054", new Object[]{this, nVar});
        }
    }

    public void setViewLayoutCallback(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76dba648", new Object[]{this, oVar});
        } else {
            this.viewLayoutCallback = oVar;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
        } else if (view == this.upperViewContainer || view == this.tnodeViewContainer) {
            tfs.f("upperViewContainer or tnodeViewContainer is not allowed to remove");
            if (nwv.R(getContext())) {
                Toast.makeText(getContext(), "不允许删除upperView或者tnodeView容器", 0).show();
            }
        } else {
            super.removeView(view);
        }
    }

    public void setErrorPage(String str) {
        String encodedPath;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42755b46", new Object[]{this, str});
            return;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() != null || (encodedPath = parse.getEncodedPath()) == null || !encodedPath.startsWith(gl4.CONFIG_PAGE_PREFIX)) {
            this.errorPage = str;
        } else {
            this.errorPage = lgs.a(str, true);
        }
    }

    public void setSuspendLayoutState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64afd1a0", new Object[]{this, new Boolean(z)});
        } else if (this.suspendLayout != z) {
            tfs.g(TAG, "setSuspendLayoutState suspendLayout:" + this.suspendLayout + " suspend:" + z + " measurecalled:" + this.onMeasureCalled);
            this.suspendLayout = z;
            if (!z && this.onMeasureCalled && !this.isDestroy) {
                nwv.z0(new b(), akt.p2("syncSuspendLayout", false));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        tfs.g(TAG, hashCode() + "onMeasure, width:" + measuredWidth + " height:" + measuredHeight + " forceSize:" + this.forceSize);
        this.onMeasureCalled = true;
        if (!this.forceSize) {
            boolean z2 = this.tnodeViewContainer.getChildCount() > 0 && this.rootNode != null;
            if (!this.suspendLayout) {
                syncLayout(measuredWidth, measuredHeight);
            } else {
                doPrepare(measuredWidth, measuredHeight);
            }
            if (this.tnodeViewContainer.getChildCount() <= 0 || this.rootNode == null) {
                z = false;
            }
            if (akt.p2("fixAddMeasure", false) && !z2 && z) {
                tfs.f("tnode view同步添加，手动measure");
                this.tnodeViewContainer.measure(i2, i3);
            }
        }
    }

    @Deprecated
    public static TNodeView create(Context context, String str, String str2, JSONObject jSONObject, HashMap hashMap, l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("36d84bd", new Object[]{context, str, str2, jSONObject, hashMap, lVar}) : create(context, null, str, str2, 1, jSONObject, hashMap, lVar);
    }

    private void layout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75112e43", new Object[]{this, new Boolean(z)});
        } else if (this.delegate != null) {
            com.taobao.tao.flexbox.layoutmanager.core.o oVar = this.engine;
            if (oVar == null || !oVar.s0()) {
                com.taobao.tao.flexbox.layoutmanager.core.n m2 = this.delegate.m();
                if (m2 != null) {
                    this.handler.removeCallbacksAndMessages(null);
                    this.handler.post(new d(m2));
                } else if (this.firstTime || this.lastLayoutStatus != 0) {
                    this.firstTime = false;
                    this.handler.removeCallbacksAndMessages(null);
                    if (z) {
                        layoutInternal();
                    } else {
                        this.handler.post(new e());
                    }
                }
            }
        }
    }

    @Deprecated
    public static TNodeView create(Context context, com.taobao.tao.flexbox.layoutmanager.core.o oVar, String str, String str2, int i2, JSONObject jSONObject, HashMap hashMap, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("bd47b068", new Object[]{context, oVar, str, str2, new Integer(i2), jSONObject, hashMap, lVar});
        }
        TNodeView tNodeView = new TNodeView(context);
        tNodeView.renderCallback = lVar;
        n54 n54Var = new n54(context, null, oVar, str, str2, jSONObject, hashMap, i2, tNodeView.callback);
        n54Var.u(tNodeView);
        tNodeView.delegate = n54Var;
        return tNodeView;
    }

    public static TNodeView create(Context context, com.taobao.tao.flexbox.layoutmanager.core.o oVar, String str, HashMap hashMap, l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("4d084fdf", new Object[]{context, oVar, str, hashMap, lVar}) : create(context, null, oVar, str, null, hashMap, lVar);
    }

    public static TNodeView create(Context context, com.taobao.tao.flexbox.layoutmanager.core.o oVar, String str, l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("544a9b36", new Object[]{context, oVar, str, lVar}) : create(context, null, oVar, str, null, null, lVar);
    }

    public static TNodeView create(Context context, com.taobao.tao.flexbox.layoutmanager.core.o oVar, String str, Object obj, HashMap hashMap, l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("783199c3", new Object[]{context, oVar, str, obj, hashMap, lVar}) : create(context, null, oVar, str, obj, hashMap, lVar);
    }

    public static TNodeView create(Context context, Object obj, com.taobao.tao.flexbox.layoutmanager.core.o oVar, String str, Object obj2, HashMap hashMap, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("7ee7555f", new Object[]{context, obj, oVar, str, obj2, hashMap, lVar});
        }
        TNodeView tNodeView = new TNodeView(context);
        tNodeView.url = str;
        tNodeView.data = obj2;
        tNodeView.params = hashMap;
        tNodeView.renderCallback = lVar;
        tNodeView.engine = oVar;
        tNodeView.renderUrlMode = true;
        tNodeView.host = obj;
        tNodeView.startRender();
        return tNodeView;
    }
}
