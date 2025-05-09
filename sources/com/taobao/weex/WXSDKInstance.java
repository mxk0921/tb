package com.taobao.weex;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.collection.ArrayMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IHttpCacheAdapter;
import com.taobao.weex.adapter.IWXComputeScreenAdapter;
import com.taobao.weex.adapter.IWXFoldDeviceAdapter;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.adapter.IWXInitTaskAdapter;
import com.taobao.weex.adapter.IWXJSEngineManager;
import com.taobao.weex.adapter.URIAdapter;
import com.taobao.weex.bridge.EventResult;
import com.taobao.weex.bridge.INativeInvoker;
import com.taobao.weex.common.OnWXScrollListener;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXPerformance;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.remote.IWXBridgeManager;
import com.taobao.weex.render.WXAbstractRenderContainer;
import com.taobao.weex.ui.component.NestedContainer;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.flat.FlatGUIContext;
import com.taobao.weex.ui.view.WXScrollView;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXFileUtils;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bww;
import tb.gbe;
import tb.ibe;
import tb.nxo;
import tb.qcf;
import tb.quw;
import tb.rc4;
import tb.t2o;
import tb.yae;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXSDKInstance implements yae, View.OnLayoutChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUNDLE_URL = "bundleUrl";
    public static final String l0 = "INSTANCE_RELOAD";
    public final Map<String, List<String>> A;
    public WXRenderStrategy B;
    public boolean C;
    public float D;
    public volatile boolean E;
    public long F;
    public WXPerformance G;
    public ScrollView H;
    public WXScrollView.WXScrollViewListener I;
    public List<OnWXScrollListener> J;
    public List<String> K;
    public List<r> L;
    public List<x> M;
    public List<w> N;
    public WXSDKInstance O;
    public final String P;
    public boolean Q;
    public TimeCalculator R;
    public boolean S;
    public quw T;
    public boolean U;
    public WXLifecycleObserver V;
    public boolean W;
    public rc4 X;
    public final Map<String, Object> Y;
    public final Map<Long, Object> Z;

    /* renamed from: a  reason: collision with root package name */
    public FlatGUIContext f14110a;
    public List<qcf> a0;
    public boolean b;
    public IHttpCacheAdapter b0;
    public final List<Pair<Runnable, Boolean>> c;
    public PriorityQueue<Object> c0;
    public gbe d;
    public int d0;
    public Context e;
    public IWXComputeScreenAdapter e0;
    public WXAbstractRenderContainer f;
    public final List<y> f0;
    public ibe g;
    public boolean g0;
    public v h;
    public boolean h0;
    public boolean i;
    public boolean i0;
    public boolean j;
    public final HashMap<String, List<String>> j0;
    public boolean k;
    public final ConcurrentHashMap<String, s> k0;
    public boolean l;
    public boolean m;
    public final String n;
    public volatile boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public Map<String, String> t;
    public WXSDKManager.a u;
    public boolean v;
    public IWXBridgeManager.BundType w;
    public final String[] x;
    public final long[] y;
    public WeakReference<String> z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class WXLifecycleObserver implements LifecycleObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                WXLogUtils.e("weex1", "on lifecycleObserver destroy");
                WXSDKInstance.this.onActivityDestroy();
            }
        }

        static {
            t2o.a(985661486);
        }

        public WXLifecycleObserver() {
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            WXSDKInstance.h(WXSDKInstance.this);
            WXSDKManager.getInstance().postOnUiThread(new a(), 5000L);
        }

        public /* synthetic */ WXLifecycleObserver(WXSDKInstance wXSDKInstance, j jVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f14113a;

        public a(Context context) {
            this.f14113a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.g(WXSDKInstance.this) != null) {
                WXSDKInstance.g(WXSDKInstance.this).setContext(this.f14113a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gbe f14114a;

        public b(gbe gbeVar) {
            this.f14114a = gbeVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.g(WXSDKInstance.this) != null) {
                WXSDKInstance.g(WXSDKInstance.this).registerRenderListener(this.f14114a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f14115a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Intent c;

        public c(int i, int i2, Intent intent) {
            this.f14115a = i;
            this.b = i2;
            this.c = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.g(WXSDKInstance.this) != null) {
                WXSDKInstance.g(WXSDKInstance.this).onActivityResult(this.f14115a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14116a;
        public final /* synthetic */ String b;

        public d(String str, String str2) {
            this.f14116a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.i(WXSDKInstance.this) != null) {
                WXSDKInstance wXSDKInstance = WXSDKInstance.this;
                if (wXSDKInstance.e != null) {
                    WXSDKInstance.i(wXSDKInstance).onException(WXSDKInstance.this, this.f14116a, this.b);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14117a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public e(String str, String str2, String str3) {
            this.f14117a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.i(WXSDKInstance.this) != null && WXSDKInstance.this.e != null) {
                WXSDKInstance.i(WXSDKInstance.this).onException(WXSDKInstance.this, this.c, this.f14117a + this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WXSDKManager.getInstance().getAllInstanceMap().remove(WXSDKInstance.this.N());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f14119a;
        public final /* synthetic */ int b;

        public g(int i, int i2) {
            this.f14119a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.g(WXSDKInstance.this) != null) {
                WXSDKInstance.g(WXSDKInstance.this).setSize(this.f14119a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14120a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ Map d;
        public final /* synthetic */ List e;
        public final /* synthetic */ EventResult f;

        public h(String str, String str2, Map map, Map map2, List list, EventResult eventResult) {
            this.f14120a = str;
            this.b = str2;
            this.c = map;
            this.d = map2;
            this.e = list;
            this.f = eventResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.g(WXSDKInstance.this) != null) {
                WXSDKInstance.g(WXSDKInstance.this).fireEvent(this.f14120a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14121a;
        public final /* synthetic */ WXModule b;
        public final /* synthetic */ Map c;

        public i(String str, WXModule wXModule, Map map) {
            this.f14121a = str;
            this.b = wXModule;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.g(WXSDKInstance.this) != null) {
                WXSDKInstance.g(WXSDKInstance.this).fireModuleEvent(this.f14121a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class j implements IWXInitTaskAdapter.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // com.taobao.weex.adapter.IWXInitTaskAdapter.Callback
        public void onRemoteInstalled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50311ffc", new Object[]{this});
                return;
            }
            WXLogUtils.e("weex1", "instance id:" + WXSDKInstance.a(WXSDKInstance.this) + " onRemoteInstalled");
            WXSDKInstance.this.E().r(quw.KEY_PAGE_STAGES_REMOTE_INSTALL_END);
            WXSDKInstance.b(WXSDKInstance.this);
            WXSDKInstance.c(WXSDKInstance.this);
        }

        @Override // com.taobao.weex.adapter.IWXInitTaskAdapter.Callback
        public void onRemoteFailed(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f382afbd", new Object[]{this, str, str2});
                return;
            }
            WXSDKInstance.d(WXSDKInstance.this, true);
            WXLogUtils.e("weex1", "instance id:" + WXSDKInstance.a(WXSDKInstance.this) + " init fail : error" + str2);
            if (WXSDKInstance.e(WXSDKInstance.this) != null) {
                try {
                    WXSDKInstance.e(WXSDKInstance.this).a(str, str2);
                } catch (Throwable th) {
                    WXLogUtils.e("weex1", th);
                }
            }
            WXSDKInstance.this.E().r(quw.KEY_PAGE_STAGES_REMOTE_INSTALL_END);
            if (WXSDKInstance.e(WXSDKInstance.this) != null || WXSDKInstance.f(WXSDKInstance.this)) {
                WXExceptionUtils.commitCriticalExceptionRT(WXSDKInstance.a(WXSDKInstance.this), WXErrorCode.WX_DEGRAD_REMOTE_INSTALL_FAIL, null, null, null);
            }
            WXSDKInstance wXSDKInstance = WXSDKInstance.this;
            WXErrorCode wXErrorCode = WXErrorCode.WX_DEGRAD_REMOTE_INSTALL_FAIL;
            wXSDKInstance.B0(wXErrorCode.getErrorCode(), wXErrorCode.getErrorMsg());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f14123a;

        public k(boolean z) {
            this.f14123a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.g(WXSDKInstance.this) != null) {
                WXSDKInstance.g(WXSDKInstance.this).setUseSandBox(this.f14123a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RenderContainer f14124a;

        public l(RenderContainer renderContainer) {
            this.f14124a = renderContainer;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.g(WXSDKInstance.this) != null) {
                WXSDKInstance.g(WXSDKInstance.this).setRenderContainer(this.f14124a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f14125a;

        public m(Context context) {
            this.f14125a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.g(WXSDKInstance.this) != null) {
                WXSDKInstance.g(WXSDKInstance.this).init(this.f14125a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14126a;
        public final /* synthetic */ nxo b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ String d;
        public final /* synthetic */ WXRenderStrategy e;

        public n(String str, nxo nxoVar, Map map, String str2, WXRenderStrategy wXRenderStrategy) {
            this.f14126a = str;
            this.b = nxoVar;
            this.c = map;
            this.d = str2;
            this.e = wXRenderStrategy;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.g(WXSDKInstance.this) != null) {
                WXLogUtils.e("weex1", "instance id:" + WXSDKInstance.a(WXSDKInstance.this) + " pageName:" + this.f14126a + " render remote");
                WXSDKInstance.g(WXSDKInstance.this).renderInternal(this.f14126a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.g(WXSDKInstance.this) != null) {
                WXSDKInstance.g(WXSDKInstance.this).onInstanceReady();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14128a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ String d;
        public final /* synthetic */ WXRenderStrategy e;

        public p(String str, String str2, Map map, String str3, WXRenderStrategy wXRenderStrategy) {
            this.f14128a = str;
            this.b = str2;
            this.c = map;
            this.d = str3;
            this.e = wXRenderStrategy;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.g(WXSDKInstance.this) != null) {
                WXLogUtils.e("weex1", "instance id:" + WXSDKInstance.a(WXSDKInstance.this) + " url:" + this.f14128a + " renderByUrlInternal remote");
                WXSDKInstance.g(WXSDKInstance.this).renderByUrlInternal(this.b, this.f14128a, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class q implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14129a;

        public q(String str) {
            this.f14129a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXSDKInstance.g(WXSDKInstance.this) != null) {
                WXLogUtils.d("weex1", "instance id:" + WXSDKInstance.a(WXSDKInstance.this) + " refreshInstance remote");
                WXSDKInstance.g(WXSDKInstance.this).refreshInstance(this.f14129a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface r {
        boolean a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class s {

        /* renamed from: a  reason: collision with root package name */
        public final t f14130a;

        static {
            t2o.a(985661479);
        }

        public s(String str, t tVar) {
            this.f14130a = tVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface t {
        u a(String str, String str2, JSONArray jSONArray, JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class u {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f14131a;
        public final Object b;

        static {
            t2o.a(985661481);
        }

        public u(boolean z, Object obj) {
            this.f14131a = z;
            this.b = obj;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface v {
        void onCreateNestInstance(WXSDKInstance wXSDKInstance, NestedContainer nestedContainer);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f14132a;

        static {
            t2o.a(985661483);
        }

        public w(String str) {
            this.f14132a = str;
        }

        public boolean a(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4af73473", new Object[]{this, new Integer(i), new Integer(i2), intent})).booleanValue();
            }
            return b(i, i2, intent, this.f14132a);
        }

        public abstract boolean b(int i, int i2, Intent intent, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface x {
        boolean onBackPressed();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface y {
        void onAppear();

        void onDisappear();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface z {
        void a();

        void b();
    }

    static {
        t2o.a(985661458);
        t2o.a(985661442);
    }

    public WXSDKInstance(Context context) {
        this.f14110a = new FlatGUIContext();
        this.b = false;
        this.c = new CopyOnWriteArrayList();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = 750;
        this.v = false;
        this.x = new String[5];
        this.y = new long[5];
        this.A = new HashMap();
        this.B = WXRenderStrategy.APPEND_ASYNC;
        this.C = false;
        this.D = -1.0f;
        this.E = false;
        this.P = "platform";
        this.Q = true;
        this.S = false;
        this.U = false;
        this.W = false;
        this.Y = new ArrayMap();
        this.Z = new ArrayMap();
        this.d0 = -1;
        this.f0 = new ArrayList();
        this.g0 = false;
        this.h0 = false;
        this.i0 = true;
        this.j0 = new HashMap<>();
        this.k0 = new ConcurrentHashMap<>();
        this.e = context;
        this.n = WXSDKManager.getInstance().generateInstanceId();
        init(context);
    }

    public static /* synthetic */ String a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6818b72a", new Object[]{wXSDKInstance});
        }
        return wXSDKInstance.n;
    }

    public static /* synthetic */ void b(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1b78cd5", new Object[]{wXSDKInstance});
        } else {
            wXSDKInstance.z1();
        }
    }

    public static /* synthetic */ void c(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330a2974", new Object[]{wXSDKInstance});
        } else {
            wXSDKInstance.D();
        }
    }

    public static /* synthetic */ boolean d(WXSDKInstance wXSDKInstance, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e8c5627", new Object[]{wXSDKInstance, new Boolean(z2)})).booleanValue();
        }
        wXSDKInstance.U = z2;
        return z2;
    }

    public static /* synthetic */ WXSDKManager.a e(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKManager.a) ipChange.ipc$dispatch("113a495b", new Object[]{wXSDKInstance});
        }
        return wXSDKInstance.u;
    }

    public static /* synthetic */ boolean f(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5701ff55", new Object[]{wXSDKInstance})).booleanValue();
        }
        return wXSDKInstance.W;
    }

    public static /* synthetic */ ibe g(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ibe) ipChange.ipc$dispatch("16dcc88e", new Object[]{wXSDKInstance});
        }
        return wXSDKInstance.g;
    }

    public static /* synthetic */ void h(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a7388f", new Object[]{wXSDKInstance});
        } else {
            wXSDKInstance.B1();
        }
    }

    public static /* synthetic */ gbe i(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gbe) ipChange.ipc$dispatch("e3991c26", new Object[]{wXSDKInstance});
        }
        return wXSDKInstance.d;
    }

    public void A(String str, String str2, Map<String, Object> map, Map<String, Object> map2, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf14030", new Object[]{this, str, str2, map, map2, list});
        } else {
            fireEvent(str, str2, map, map2, list, null);
        }
    }

    public void A0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92acc64e", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        gbe gbeVar = this.d;
        if (gbeVar != null && this.e != null) {
            gbeVar.onRefreshSuccess(this, i2, i3);
        }
    }

    public synchronized void A1(w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd09da89", new Object[]{this, wVar});
            return;
        }
        List<w> list = this.N;
        if (!(list == null || wVar == null)) {
            ((ArrayList) list).remove(wVar);
        }
    }

    public void B(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31ac48e", new Object[]{this, str, map});
            return;
        }
        List<String> list = this.j0.get(str);
        if (list != null) {
            for (String str2 : list) {
                WXSDKManager.getInstance().callback(this.n, str2, map, true);
            }
        }
    }

    public final void B1() {
        Lifecycle lifecycle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f558e20b", new Object[]{this});
        } else if (this.V != null) {
            try {
                Context context = this.e;
                if (context != null && (context instanceof LifecycleOwner) && (lifecycle = ((LifecycleOwner) context).getLifecycle()) != null) {
                    lifecycle.removeObserver(this.V);
                    this.V = null;
                    WXLogUtils.e("weex1", "remove lifecycleObserver");
                }
            } catch (Throwable th) {
                WXLogUtils.e("weex1", th.getMessage());
            }
        }
    }

    public void C(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12133ae3", new Object[]{this, new Long(j2)});
        } else if (this.i0) {
            this.G.firstScreenJSFExecuteTime = j2 - this.F;
            this.i0 = false;
        }
    }

    public final void C1(Runnable runnable, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd93325e", new Object[]{this, runnable, new Boolean(z2)});
        } else if (!this.o) {
            if (this.g != null) {
                runnable.run();
                return;
            }
            WXLogUtils.d("weex1", "instance id:" + this.n + "add waiting task");
            this.c.add(new Pair<>(runnable, Boolean.valueOf(z2)));
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab6155", new Object[]{this});
        } else if (this.o) {
            WXLogUtils.e("weex1", "instance id:" + this.n + "has destroyed. clear waiting task");
            this.c.clear();
        } else {
            for (Pair<Runnable, Boolean> pair : this.c) {
                WXLogUtils.e("weex1", "instance id:" + this.n + "run waiting task");
                if (((Boolean) pair.second).booleanValue()) {
                    WXSDKManager.getInstance().postOnUiThread((Runnable) pair.first, 0L);
                } else {
                    WXSDKManager.getInstance().getWXBridgeManager().post((Runnable) pair.first);
                }
            }
        }
    }

    public boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        List<r> list = this.L;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                if (((r) it.next()).a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public quw E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (quw) ipChange.ipc$dispatch("bf9ac5c0", new Object[]{this});
        }
        return this.T;
    }

    public void E0(String str, Map<String, Object> map, String str2, WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("259fd2bb", new Object[]{this, str, map, str2, wXRenderStrategy});
            return;
        }
        this.h0 = true;
        u1(wXRenderStrategy);
        this.T.y = false;
        X0(str, str, map, str2, wXRenderStrategy);
    }

    public rc4 F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rc4) ipChange.ipc$dispatch("eefe3ebd", new Object[]{this});
        }
        return this.X;
    }

    public Map<String, String> G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("43a4a355", new Object[]{this});
        }
        return this.t;
    }

    public synchronized void G0(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809365a8", new Object[]{this, rVar});
        } else if (rVar != null) {
            if (this.L == null) {
                this.L = new ArrayList();
            }
            this.L.add(rVar);
        }
    }

    public Object H(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("179e9ec9", new Object[]{this, new Long(j2)});
        }
        return this.Z.get(Long.valueOf(j2));
    }

    public synchronized void H0(x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64da7ca9", new Object[]{this, xVar});
        } else if (xVar != null) {
            if (this.M == null) {
                this.M = new ArrayList();
            }
            this.M.add(xVar);
        }
    }

    public Rect I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("b2caca8b", new Object[]{this});
        }
        IWXComputeScreenAdapter iWXComputeScreenAdapter = this.e0;
        if (iWXComputeScreenAdapter != null) {
            return iWXComputeScreenAdapter.computeCurrentScreenMetrics();
        }
        return null;
    }

    public final void I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc39e04", new Object[]{this});
        } else if (this.V == null) {
            try {
                Context context = this.e;
                if (context != null && (context instanceof LifecycleOwner)) {
                    this.V = new WXLifecycleObserver(this, null);
                    Lifecycle lifecycle = ((LifecycleOwner) this.e).getLifecycle();
                    if (lifecycle != null) {
                        lifecycle.addObserver(this.V);
                        WXLogUtils.e("weex1", "add lifecycleObserver");
                    }
                }
            } catch (Throwable th) {
                WXLogUtils.e("weex1", th.getMessage());
            }
        }
    }

    public FlatGUIContext J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlatGUIContext) ipChange.ipc$dispatch("ea2ce70f", new Object[]{this});
        }
        return this.f14110a;
    }

    public void J0(String str, t tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fae5d3", new Object[]{this, str, tVar});
        } else if (!TextUtils.isEmpty(str) && tVar != null) {
            this.k0.put(str, new s(str, tVar));
        }
    }

    public IHttpCacheAdapter K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHttpCacheAdapter) ipChange.ipc$dispatch("b36d3b00", new Object[]{this});
        }
        return this.b0;
    }

    public synchronized void K0(w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83ef510", new Object[]{this, wVar});
        } else if (wVar != null) {
            if (this.N == null) {
                this.N = new ArrayList();
            }
            this.N.add(wVar);
        }
    }

    public IWXImgLoaderAdapter L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXImgLoaderAdapter) ipChange.ipc$dispatch("918b7c3f", new Object[]{this});
        }
        return WXSDKManager.getInstance().getIWXImgLoaderAdapter();
    }

    public synchronized void L0(OnWXScrollListener onWXScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582582c", new Object[]{this, onWXScrollListener});
            return;
        }
        if (this.J == null) {
            this.J = new ArrayList();
        }
        this.J.add(onWXScrollListener);
    }

    public Object M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e0d5af2f", new Object[]{this, str});
        }
        return this.Y.get(str);
    }

    @Deprecated
    public void M0(WXScrollView.WXScrollViewListener wXScrollViewListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2836fea3", new Object[]{this, wXScrollViewListener});
        } else {
            this.I = wXScrollViewListener;
        }
    }

    public String N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return this.n;
    }

    public void N0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc5d65b", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.j0.remove(str);
        }
    }

    public List<qcf> O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("de171717", new Object[]{this});
        }
        if (this.a0 == null) {
            this.a0 = new ArrayList();
        }
        return this.a0;
    }

    public void O0(String str, String str2) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1923f65", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (list = this.j0.get(str)) != null) {
            list.remove(str2);
        }
    }

    public void OnVSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29304cf9", new Object[]{this});
            return;
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.OnVSync();
        }
    }

    public int P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60c5764f", new Object[]{this})).intValue();
        }
        return this.s;
    }

    public void P0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c169fe", new Object[]{this, str});
        } else {
            this.Y.remove(str);
        }
    }

    public IWXJSEngineManager.EngineType Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXJSEngineManager.EngineType) ipChange.ipc$dispatch("f15f0106", new Object[]{this});
        }
        return IWXJSEngineManager.EngineType.QuickJS;
    }

    public void Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712c250f", new Object[]{this});
        } else if (this.u != null) {
            WXSDKManager.getInstance().removeInitListener(this.u);
            this.u = null;
        }
    }

    public List<String> R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("845b11be", new Object[]{this});
        }
        return this.K;
    }

    public void R0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0044e94", new Object[]{this, str});
            return;
        }
        List<String> list = this.K;
        if (list != null) {
            ((ArrayList) list).remove(str);
        }
    }

    public int S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13c3f04e", new Object[]{this})).intValue();
        }
        return this.d0;
    }

    public void S0(y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280618b", new Object[]{this, yVar});
        } else {
            this.f0.remove(yVar);
        }
    }

    public float T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9b1772d", new Object[]{this})).floatValue();
        }
        float f2 = this.D;
        if (f2 > 0.0f) {
            return f2;
        }
        IWXFoldDeviceAdapter wXFoldDeviceAdapter = WXSDKManager.getInstance().getWXFoldDeviceAdapter();
        if (wXFoldDeviceAdapter != null) {
            Context context = this.e;
            if (context instanceof Activity) {
                return wXFoldDeviceAdapter.getScaleRadio((Activity) context);
            }
        }
        return 1.0f;
    }

    public void T0(String str, String str2, Map<String, Object> map, String str3, WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5af2970", new Object[]{this, str, str2, map, str3, wXRenderStrategy});
        } else {
            U0(str, new nxo(str2), map, str3, wXRenderStrategy);
        }
    }

    public WXSDKInstance U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("3748fa3a", new Object[]{this});
        }
        return this.O;
    }

    public WXRenderStrategy V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXRenderStrategy) ipChange.ipc$dispatch("15255004", new Object[]{this});
        }
        return this.B;
    }

    public void V0(String str, byte[] bArr, Map<String, Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ed6d21", new Object[]{this, str, bArr, map, str2});
        } else {
            U0(str, new nxo(bArr), map, str2, WXRenderStrategy.DATA_RENDER_BINARY);
        }
    }

    public String W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e88638d3", new Object[]{this});
        }
        return this.P;
    }

    @Deprecated
    public void W0(String str, String str2, Map<String, Object> map, String str3, int i2, int i3, WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337a469c", new Object[]{this, str, str2, map, str3, new Integer(i2), new Integer(i3), wXRenderStrategy});
        } else {
            X0(str, str2, map, str3, wXRenderStrategy);
        }
    }

    public ScrollView X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollView) ipChange.ipc$dispatch("d04a56e3", new Object[]{this});
        }
        return this.H;
    }

    public String Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca44bb09", new Object[]{this});
        }
        WeakReference<String> weakReference = this.z;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public Uri Y0(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("f8449e61", new Object[]{this, uri, str});
        }
        return b0().rewrite(this, str, uri);
    }

    public String Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39b086fb", new Object[]{this});
        }
        String Y = Y();
        if (Y == null) {
            return " template md5 null ,httpHeader:" + JSON.toJSONString(this.A);
        } else if (TextUtils.isEmpty(Y)) {
            return " template md5  length 0 ,httpHeader" + JSON.toJSONString(this.A);
        } else {
            try {
                byte[] bytes = Y.getBytes("UTF-8");
                String md5 = WXFileUtils.md5(bytes);
                String base64Md5 = WXFileUtils.base64Md5(bytes);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(md5);
                arrayList2.add(base64Md5);
                this.A.put("templateSourceMD5", arrayList);
                this.A.put("templateSourceBase64MD5", arrayList2);
                return " template md5 " + md5 + " length " + bytes.length + " base64 md5 " + base64Md5 + " response header " + JSON.toJSONString(this.A);
            } catch (Exception unused) {
                return "template md5 getBytes error";
            }
        }
    }

    public void Z0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{this, runnable});
        } else {
            WXSDKManager.getInstance().postOnUiThread(runnable, 0L);
        }
    }

    public Context a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6bf62ae4", new Object[]{this});
        }
        return getContext();
    }

    @Deprecated
    public void a1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9c479c", new Object[]{this, str});
        }
    }

    public URIAdapter b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URIAdapter) ipChange.ipc$dispatch("348c27a7", new Object[]{this});
        }
        return WXSDKManager.getInstance().getURIAdapter();
    }

    public void b1(rc4 rc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21555291", new Object[]{this, rc4Var});
        } else {
            this.X = rc4Var;
        }
    }

    public WXPerformance c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXPerformance) ipChange.ipc$dispatch("eae923df", new Object[]{this});
        }
        return this.G;
    }

    public void c1(IWXComputeScreenAdapter iWXComputeScreenAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8dbef1", new Object[]{this, iWXComputeScreenAdapter});
        } else if (bww.f() || bww.g()) {
            this.e0 = iWXComputeScreenAdapter;
        }
    }

    public final WXSDKInstance createNestedInstance(NestedContainer nestedContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("2ff23f04", new Object[]{this, nestedContainer});
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            return ibeVar.createNestedInstance(nestedContainer);
        }
        return null;
    }

    public synchronized List<OnWXScrollListener> d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("552d1ec5", new Object[]{this});
        }
        return this.J;
    }

    public void d1(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96210a8", new Object[]{this, str, str2});
        } else {
            ((HashMap) this.t).put(str, str2);
        }
    }

    public synchronized void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (this.g == null && !this.o && (this.u != null || this.W)) {
            WXExceptionUtils.commitCriticalExceptionRT(this.n, WXErrorCode.WX_USER_CANCEL_REMOTE_INSTALL, null, null, null);
            E().p();
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.destroy();
        }
        this.o = true;
        B1();
        ((CopyOnWriteArrayList) this.c).clear();
        if (this.f14110a != null) {
            J().destroy();
            this.f14110a = null;
        }
        WXSDKManager.getInstance().postOnUiThread(new f(), 1000L);
    }

    public com.taobao.weex.appfram.websocket.a e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.weex.appfram.websocket.a) ipChange.ipc$dispatch("e50d203f", new Object[]{this});
        }
        return WXSDKManager.getInstance().getIWXWebSocketAdapter();
    }

    public void e1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3997006", new Object[]{this, new Boolean(z2)});
        } else {
            this.r = z2;
        }
    }

    public z f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z) ipChange.ipc$dispatch("7a4541b3", new Object[]{this});
        }
        return null;
    }

    public void f1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ee07f7", new Object[]{this, new Boolean(z2)});
        } else {
            this.C = z2;
        }
    }

    public void fireModuleEvent(String str, WXModule wXModule, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("112d5b23", new Object[]{this, str, wXModule, map});
        } else {
            C1(new i(str, wXModule, map), true);
        }
    }

    public boolean g0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a387751", new Object[]{this, str})).booleanValue();
        }
        return this.k0.containsKey(str);
    }

    public void g1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88662536", new Object[]{this, new Boolean(z2)});
        } else {
            this.k = z2;
        }
    }

    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee20482", new Object[]{this});
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            return ibeVar.getBundleUrl();
        }
        return "";
    }

    public View getContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3268c19", new Object[]{this});
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            return ibeVar.getContainerView();
        }
        return this.f;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            return ibeVar.getContext();
        }
        return this.e;
    }

    public INativeInvoker getNativeInvokeHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INativeInvoker) ipChange.ipc$dispatch("18154086", new Object[]{this});
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            return ibeVar.getNativeInvokeHelper();
        }
        return null;
    }

    public int getRenderContainerPaddingLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fb4261d", new Object[]{this})).intValue();
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            return ibeVar.getRenderContainerPaddingLeft();
        }
        return 0;
    }

    public int getRenderContainerPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99b522b3", new Object[]{this})).intValue();
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            return ibeVar.getRenderContainerPaddingTop();
        }
        return 0;
    }

    public WXComponent getRootComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("13bcde6f", new Object[]{this});
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            return ibeVar.getRootComponent();
        }
        return null;
    }

    public View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            return ibeVar.getRootView();
        }
        return null;
    }

    public int getWeexHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa4125f8", new Object[]{this})).intValue();
        }
        ibe ibeVar = this.g;
        if (ibeVar == null) {
            return 0;
        }
        return ibeVar.getWeexHeight();
    }

    public int getWeexWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a530c89", new Object[]{this})).intValue();
        }
        ibe ibeVar = this.g;
        if (ibeVar == null) {
            return 0;
        }
        return ibeVar.getWeexWidth();
    }

    public void h1(IHttpCacheAdapter iHttpCacheAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c56f20", new Object[]{this, iHttpCacheAdapter});
        } else {
            this.b0 = iHttpCacheAdapter;
        }
    }

    public boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public void i1(WXSDKManager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68751864", new Object[]{this, aVar});
        } else if (WXUtils.forceInitCallback()) {
            aVar.onInitSuccess();
        } else {
            if (this.u != null) {
                WXSDKManager.getInstance().removeInitListener(this.u);
            }
            this.u = aVar;
            WXSDKManager.getInstance().setInitListener(this.u);
        }
    }

    public void j(long j2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74acbff0", new Object[]{this, new Long(j2), obj});
        } else {
            this.Z.put(Long.valueOf(j2), obj);
        }
    }

    public boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d10124b9", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public void j1(int i2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d67fb01", new Object[]{this, new Integer(i2), new Boolean(z2)});
        } else {
            this.s = i2;
        }
    }

    public void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84091768", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            List<String> list = this.j0.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.j0.put(str, list);
            }
            list.add(str2);
        }
    }

    public boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40884980", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public boolean k1(IWXJSEngineManager.EngineType engineType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b15e480a", new Object[]{this, engineType})).booleanValue();
        }
        return true;
    }

    public void l(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a0868ca", new Object[]{this, str, obj});
        } else {
            this.Y.put(str, obj);
        }
    }

    public boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a573df63", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public void l1(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51fbcf9", new Object[]{this, new Integer(i2)});
        }
    }

    public void m(qcf qcfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efddebf0", new Object[]{this, qcfVar});
        } else if (qcfVar != null && !O().contains(qcfVar)) {
            O().add(qcfVar);
        }
    }

    public boolean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe57a2a", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public void m1(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b8990", new Object[]{this, new Integer(i2)});
        }
    }

    public void moveFixedView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1011083", new Object[]{this, view});
            return;
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.moveFixedView(view);
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c05be57", new Object[]{this, str});
            return;
        }
        if (this.K == null) {
            this.K = new ArrayList();
        }
        this.K.add(str);
    }

    public boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64b9366b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void n1(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aea737c", new Object[]{this, new Integer(i2)});
        } else {
            this.d0 = i2;
        }
    }

    public void o(y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba3d5e8", new Object[]{this, yVar});
        } else {
            this.f0.add(yVar);
        }
    }

    public boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30659ec4", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public void o1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f41ccf", new Object[]{this, new Boolean(z2)});
        } else {
            this.q = z2;
        }
    }

    @Override // tb.yae
    public void onActivityCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f208031", new Object[]{this});
            return;
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.onActivityCreate();
        }
    }

    @Override // tb.yae
    public synchronized void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.onActivityDestroy();
        } else {
            destroy();
        }
    }

    @Override // tb.yae
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.onActivityPause();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        C1(new c(i2, i3, intent), false);
        List<w> list = this.N;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.N).iterator();
            while (it.hasNext() && !((w) it.next()).a(i2, i3, intent)) {
            }
        }
    }

    @Override // tb.yae
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.onActivityResume();
        }
    }

    @Override // tb.yae
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.onActivityStart();
        }
    }

    @Override // tb.yae
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.onActivityStop();
        }
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        List<x> list = this.M;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                if (((x) it.next()).onBackPressed()) {
                    return true;
                }
            }
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            return ibeVar.onBackPressed();
        }
        return false;
    }

    public void onCreateFinish() {
        ibe ibeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6362b5b5", new Object[]{this});
        } else if (!this.j && (ibeVar = this.g) != null) {
            ibeVar.onCreateFinish();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.onCreateOptionsMenu(menu);
        }
        return true;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9)});
        } else if (i2 != i6 || i3 != i7 || i4 != i8 || i5 != i9) {
            y0(view);
        }
    }

    public void onRootCreated(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439408b3", new Object[]{this, wXComponent});
            return;
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.onRootCreated(wXComponent);
        }
    }

    public void onViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
            return;
        }
        this.b = true;
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.onViewAppear();
        }
    }

    public void onViewDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
            return;
        }
        this.b = false;
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.onViewDisappear();
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a75e4d00", new Object[]{this, str});
        } else {
            E().g(quw.KEY_PAGE_STATS_API_USE_QJS_BYTE_CODE, Double.parseDouble(str));
        }
    }

    public boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669f7484", new Object[]{this})).booleanValue();
        }
        return this.Q;
    }

    public void p1(v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c2c15b", new Object[]{this, vVar});
        } else {
            this.h = vVar;
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6faef7", new Object[]{this, str});
        } else {
            E().g(quw.KEY_PAGE_STATS_SCRIPT_USE_QJS_BYTE_CODE, Double.parseDouble(str));
        }
    }

    public boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ce7c8ec", new Object[]{this})).booleanValue();
        }
        return this.h0;
    }

    public void q1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d327b8c", new Object[]{this, new Boolean(z2)});
        } else {
            this.Q = z2;
        }
    }

    public void r(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3cccc1", new Object[]{this, new Long(j2)});
            return;
        }
        WXPerformance wXPerformance = this.G;
        wXPerformance.mActionAddElementSumTime = (int) (wXPerformance.mActionAddElementSumTime + j2);
    }

    public boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("991f8997", new Object[]{this})).booleanValue();
        }
        return this.g0;
    }

    public void r1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
            return;
        }
        E().m = str;
        E().l();
        E().z(str);
    }

    public void refreshInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bddef21", new Object[]{this, str});
        } else {
            C1(new q(str), false);
        }
    }

    public void registerRenderListener(gbe gbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bce1714", new Object[]{this, gbeVar});
            return;
        }
        this.d = gbeVar;
        if (this.U) {
            WXErrorCode wXErrorCode = WXErrorCode.WX_DEGRAD_REMOTE_INSTALL_FAIL;
            B0(wXErrorCode.getErrorCode(), wXErrorCode.getErrorMsg());
        }
        C1(new b(gbeVar), false);
    }

    public void reloadPage(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9626f865", new Object[]{this, new Boolean(z2)});
            return;
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.reloadPage(z2);
        }
    }

    public void removeFixedView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9014136", new Object[]{this, view});
            return;
        }
        ibe ibeVar = this.g;
        if (ibeVar != null) {
            ibeVar.removeFixedView(view);
        }
    }

    public void s(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710183e9", new Object[]{this, new Long(j2)});
        } else if (!this.i) {
            WXPerformance wXPerformance = this.G;
            wXPerformance.fsCallJsTotalTime += j2;
            wXPerformance.fsCallJsTotalNum++;
        }
    }

    public boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9796891b", new Object[]{this})).booleanValue();
        }
        return this.S;
    }

    public void s1(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac29797", new Object[]{this, new Float(f2)});
        } else {
            this.D = f2;
        }
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
            return;
        }
        this.e = context;
        C1(new a(context), false);
    }

    public void setRenderContainer(RenderContainer renderContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db60e1", new Object[]{this, renderContainer});
            return;
        }
        if (renderContainer != null) {
            renderContainer.setSDKInstance(this);
            renderContainer.addOnLayoutChangeListener(this);
        }
        this.f = renderContainer;
        C1(new l(renderContainer), false);
    }

    public void setSize(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6e006a", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else {
            C1(new g(i2, i3), true);
        }
    }

    public void setUseSandBox(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ffb4b", new Object[]{this, new Boolean(z2)});
        } else {
            C1(new k(z2), false);
        }
    }

    public boolean t(String str, WXModule wXModule) {
        List<String> eventCallbacks;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ce9916", new Object[]{this, str, wXModule})).booleanValue();
        }
        if (wXModule == null || (eventCallbacks = wXModule.getEventCallbacks(str)) == null || eventCallbacks.size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff311c1f", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void t1(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b202486", new Object[]{this, wXSDKInstance});
        } else {
            this.O = wXSDKInstance;
        }
    }

    public u u0(String str, String str2, JSONArray jSONArray, JSONObject jSONObject) {
        t tVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("7f607466", new Object[]{this, str, str2, jSONArray, jSONObject});
        }
        s sVar = this.k0.get(str);
        if (sVar == null || (tVar = sVar.f14130a) == null) {
            return null;
        }
        return tVar.a(str, str2, jSONArray, jSONObject);
    }

    public void u1(WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbac973c", new Object[]{this, wXRenderStrategy});
        } else {
            this.B = wXRenderStrategy;
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53316138", new Object[]{this});
        } else {
            E().r("wxCreateInstanceStart");
        }
    }

    public WXSDKInstance v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("b834091", new Object[]{this});
        }
        return new WXSDKInstance(this.e);
    }

    public void v1(ScrollView scrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb2a2e7", new Object[]{this, scrollView});
        } else {
            this.H = scrollView;
        }
    }

    public void w0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("495b36e3", new Object[]{this, new Long(j2)});
            return;
        }
        WXPerformance wXPerformance = this.G;
        wXPerformance.mActionAddElementCount++;
        wXPerformance.mActionAddElementSumTime = (int) (wXPerformance.mActionAddElementSumTime + j2);
        if (!this.i) {
            wXPerformance.fsComponentCreateTime = (int) (wXPerformance.fsComponentCreateTime + j2);
            wXPerformance.fsComponentCount++;
        }
        wXPerformance.componentCount++;
        wXPerformance.componentCreateTime += j2;
    }

    public void w1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edadd065", new Object[]{this, new Boolean(z2)});
        } else {
            this.S = z2;
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33ddf54", new Object[]{this});
        } else if (this.f == null && getContext() != null) {
            setRenderContainer(new RenderContainer(getContext()));
            this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f.setBackgroundColor(0);
            this.f.setSDKInstance(this);
            this.f.addOnLayoutChangeListener(this);
        }
    }

    public void x1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("930008d", new Object[]{this, str});
        } else {
            this.z = new WeakReference<>(str);
        }
    }

    public void y(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d14d86", new Object[]{this, str, str2, map});
        } else {
            z(str, str2, map, null);
        }
    }

    public void y0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b39f9d2", new Object[]{this, view});
        }
    }

    public void y1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce39f2b9", new Object[]{this, new Boolean(z2)});
        }
    }

    public void z(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac77113f", new Object[]{this, str, str2, map, map2});
        } else {
            A(str, str2, map, map2, null);
        }
    }

    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3514e5ad", new Object[]{this});
        } else if (!this.i) {
            this.i = true;
            this.T.h();
            this.G.fsRenderTime = System.currentTimeMillis();
            this.G.screenRenderTime = System.currentTimeMillis() - this.F;
        }
    }

    public void B0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313409ce", new Object[]{this, str, str2});
            return;
        }
        this.l = true;
        if (this.d != null && this.e != null) {
            WXLogUtils.e("onRenderError " + str + "," + str2);
            Z0(new d(str, str2));
        }
    }

    public void init(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        if (this.G == null) {
            this.G = new WXPerformance(this.n);
        }
        if (this.T == null) {
            this.T = new quw(this.n);
        }
        this.t = new HashMap(4);
        WXPerformance wXPerformance = this.G;
        wXPerformance.WXSDKVersion = WXEnvironment.WXSDK_VERSION;
        wXPerformance.JSLibInitTime = WXEnvironment.sJSLibInitTime;
        WXSDKManager.getInstance().getAllInstanceMap().put(this.n, this);
        Map<String, String> map = this.t;
        if (context instanceof Activity) {
            str = context.getClass().getSimpleName();
        } else {
            str = "unKnowContainer";
        }
        ((HashMap) map).put("wxContainerName", str);
        ((HashMap) this.t).put("wxInstanceType", "page");
        if (this.R == null) {
            this.R = new TimeCalculator(this);
        }
        I0();
        w();
        C1(new m(context), false);
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b8818e", new Object[]{this});
            return;
        }
        WXLogUtils.d("createInstanceFuncHeartBeat: " + this.n);
        this.m = true;
        E().r("wxEndExecuteBundle");
        E().r("wxCreateInstanceEnd");
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb62168", new Object[]{this});
            return;
        }
        IWXInitTaskAdapter wXInitTaskAdapter = WXSDKManager.getInstance().getWXInitTaskAdapter();
        if (wXInitTaskAdapter != null) {
            this.U = false;
            E().r(quw.KEY_PAGE_STAGES_REMOTE_INSTALL_START);
            wXInitTaskAdapter.doInit(new j());
        }
    }

    public void x0(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95274e2c", new Object[]{this, str, str2, str3});
            return;
        }
        this.k = true;
        if (this.d != null && this.e != null) {
            WXLogUtils.e("onJSException " + str + "," + str3);
            Z0(new e(str2, str3, str));
        }
    }

    public void F0(String str, String str2, Map<String, Object> map, String str3, WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc82f8ed", new Object[]{this, str, str2, map, str3, wXRenderStrategy});
            return;
        }
        this.g0 = true;
        u1(wXRenderStrategy);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("pre_init_mode", "true");
        this.T.y = false;
        WXSDKManager.getInstance().createInstance(this, new nxo(str2), map, str3);
    }

    public void U0(String str, nxo nxoVar, Map<String, Object> map, String str2, WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d492c8ef", new Object[]{this, str, nxoVar, map, str2, wXRenderStrategy});
            return;
        }
        this.W = true;
        this.G.beforeInstanceRender(this.n);
        WXLogUtils.e("weex1", "instance id:" + this.n + " pageName:" + str + " render base");
        if (!WXEnvironment.isApkDebugable() || !"default".equals(str)) {
            x();
            C1(new n(str, nxoVar, map, str2, wXRenderStrategy), false);
        } else if (a0() != null) {
            new AlertDialog.Builder(a0()).setTitle("Error: Missing pageName").setMessage("We highly recommend you to set pageName. Call\nWXSDKInstance#render(String pageName, String template, Map<String, Object> options, String jsonInitData, WXRenderStrategy flag)\nto fix it.").show();
        }
    }

    public void X0(String str, String str2, Map<String, Object> map, String str3, WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b7967c", new Object[]{this, str, str2, map, str3, wXRenderStrategy});
            return;
        }
        this.W = true;
        x();
        E().m = str;
        E().l();
        E().z(str);
        WXLogUtils.e("weex1", "instance id:" + this.n + " url:" + str2 + " renderByUr base");
        C1(new p(str2, str, map, str3, wXRenderStrategy), false);
    }

    public void fireEvent(String str, String str2, Map<String, Object> map, Map<String, Object> map2, List<Object> list, EventResult eventResult) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f3b4f3", new Object[]{this, str, str2, map, map2, list, eventResult});
            return;
        }
        WXPerformance wXPerformance = this.G;
        if (wXPerformance != null && (i2 = wXPerformance.fsCallEventTotalNum) < Integer.MAX_VALUE) {
            wXPerformance.fsCallEventTotalNum = i2 + 1;
        }
        this.T.C(quw.KEY_PAGE_STATS_FS_CALL_EVENT_NUM, 1.0d);
        C1(new h(str, str2, map, map2, list, eventResult), true);
    }

    public boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("638d1d81", new Object[]{this})).booleanValue();
        }
        Map<String, List<String>> map = this.A;
        if (map == null) {
            return true;
        }
        List<String> list = map.get("Content-Md5");
        if (list == null) {
            list = this.A.get(HttpConstant.Content_MD52);
        }
        if (list != null && list.size() > 0) {
            String str = list.get(0);
            List<String> list2 = this.A.get("templateSourceBase64MD5");
            if (list2 == null) {
                Z();
                list2 = this.A.get("templateSourceBase64MD5");
            }
            if (!(list2 == null || list2.size() == 0)) {
                return str.equals(list2.get(0));
            }
        }
        return true;
    }

    public void onInstanceReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20848376", new Object[]{this});
            return;
        }
        WXLogUtils.d("test->", "onInstanceReady");
        this.T.r(quw.KEY_PAGE_STAGES_CONTAINER_READY);
        if (this.g0 || this.h0) {
            this.E = true;
            this.T.q(this.h0);
            C1(new o(), false);
        }
    }

    public final void z1() {
        if (this.g == null) {
            try {
                this.g = (ibe) Class.forName("com.taobao.weex.WXSDKInstanceImpl").getConstructor(WXSDKInstance.class).newInstance(this);
                WXLogUtils.e("weex1", "instance id:" + this.n + " init remote instance impl success");
            } catch (Throwable th) {
                WXLogUtils.e("weex1", th);
            }
        }
    }

    public void C0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d36da95", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        this.p = true;
        if (!this.v) {
            E().j();
        }
        if (!((ConcurrentHashMap) E().d).containsKey("wxInteraction")) {
            E().i(getRootComponent());
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.F;
            long[] renderFinishTime = WXSDKManager.getInstance().getWXBridgeManager().getRenderFinishTime(N());
            WXPerformance wXPerformance = this.G;
            wXPerformance.callBridgeTime = renderFinishTime[0];
            wXPerformance.cssLayoutTime = renderFinishTime[1];
            wXPerformance.parseJsonTime = renderFinishTime[2];
            wXPerformance.totalTime = currentTimeMillis;
            if (wXPerformance.screenRenderTime < 0.001d) {
                wXPerformance.screenRenderTime = currentTimeMillis;
            }
        } catch (Throwable th) {
            WXLogUtils.e("weex1", th);
        }
        gbe gbeVar = this.d;
        if (!(gbeVar == null || this.e == null)) {
            gbeVar.onRenderSuccess(this, i2, i3);
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.d(WXLogUtils.WEEX_PERF_TAG, this.G.toString());
            }
        }
        if (WXEnvironment.isPerf()) {
            WXLogUtils.e(WXLogUtils.WEEX_PERF_TAG, this.G.getPerfData());
        }
    }

    public WXSDKInstance() {
        this.f14110a = new FlatGUIContext();
        this.b = false;
        this.c = new CopyOnWriteArrayList();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = 750;
        this.v = false;
        this.x = new String[5];
        this.y = new long[5];
        this.A = new HashMap();
        this.B = WXRenderStrategy.APPEND_ASYNC;
        this.C = false;
        this.D = -1.0f;
        this.E = false;
        this.P = "platform";
        this.Q = true;
        this.S = false;
        this.U = false;
        this.W = false;
        this.Y = new ArrayMap();
        this.Z = new ArrayMap();
        this.d0 = -1;
        this.f0 = new ArrayList();
        this.g0 = false;
        this.h0 = false;
        this.i0 = true;
        this.j0 = new HashMap<>();
        this.k0 = new ConcurrentHashMap<>();
        String generateInstanceId = WXSDKManager.getInstance().generateInstanceId();
        this.n = generateInstanceId;
        this.G = new WXPerformance(generateInstanceId);
        this.T = new quw(generateInstanceId);
        WXSDKManager.getInstance().getAllInstanceMap().put(generateInstanceId, this);
        this.R = new TimeCalculator(this);
    }
}
