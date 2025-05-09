package com.taobao.android.weex;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import anet.channel.util.HttpConstant;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex.bridge.WeexPlatformCommonBridge;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import com.taobao.android.weex.config.WeexApmCustomData;
import com.taobao.android.weex.config.WeexDarkMode;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.mega.MegaModule;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex.util.WeexInstanceChecker;
import com.taobao.android.weex_ability.modules.WeexMegaBridgeModule;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import com.taobao.weex.common.WXConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.b8x;
import tb.b9x;
import tb.c7x;
import tb.d7x;
import tb.dwh;
import tb.e7x;
import tb.f5x;
import tb.f7x;
import tb.f9x;
import tb.fxh;
import tb.g6x;
import tb.gwh;
import tb.h5x;
import tb.h6x;
import tb.hss;
import tb.hxh;
import tb.i5x;
import tb.j6x;
import tb.j8x;
import tb.l5x;
import tb.nxh;
import tb.q5x;
import tb.q6x;
import tb.s5x;
import tb.t2o;
import tb.tvh;
import tb.u6x;
import tb.u8x;
import tb.uvh;
import tb.v3x;
import tb.vvh;
import tb.w4x;
import tb.w6x;
import tb.x6x;
import tb.xpc;
import tb.y7x;
import tb.yio;
import tb.z7x;
import tb.z9x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class WeexInstanceImpl implements WeexInstance, h6x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<Integer, WeakReference<WeexInstanceImpl>> id2InstanceRef = new ConcurrentHashMap();
    private static final AtomicInteger sEngineInfoCallbackId = new AtomicInteger();
    private static Map<Integer, k> sEngineInfoCallbacks = new ConcurrentHashMap();
    public tvh mAdapterMUSInstance;
    public final v3x mApmExtend;
    private BroadcastReceiver mBroadcastDarkModeReceiver;
    private String mBundleUrl;
    private String mBusinessId;
    private Context mContext;
    private final long mCreateStartUpTime;
    private Throwable mException;
    private Handler mHandler;
    private final WeexInstanceConfig mInstanceConfig;
    private final int mInstanceID;
    private final boolean mIsAsyncCreate;
    private int mLastInnerHeight;
    private int mLastInnerWidth;
    private int mLastScreenHeight;
    private int mLastScreenWidth;
    private final WeexInstanceInternalMode mMode;
    public final long mNativePtr;
    private View.OnLayoutChangeListener mOnLayoutChangeListener;
    private String mOriginUrl;
    public y7x mRecordManager;
    private final WeexRenderType mRenderType;
    private View mRootView;
    private String mSimplifyUrl;
    private final List<j6x> mWeexInstanceListeners = new ArrayList();
    private final Map<String, WeexValue> mInstanceEnv = new ConcurrentHashMap();
    private volatile boolean mDestroyed = false;
    public boolean mInitDoneSuccess = false;
    public boolean mRenderDoneSuccess = false;
    private final Map<String, Object> mExtraObject = new ConcurrentHashMap();
    private final Map<String, Pair<WeexModule, c7x>> mWeexModules = new HashMap();
    private final ArrayList<Runnable> mGoBackEventCallbacks = new ArrayList<>();
    private MegaModule mMegaModule = null;
    private boolean mRootViewAdded = false;
    private final ConcurrentMap<String, c7x> mModuleFactoryMap = new ConcurrentHashMap();
    private final d7x mWeexModuleInterface = new e7x(this);
    private WeexInstanceStatus mMainThreadStatus = WeexInstanceStatus.NOT_INITED;
    private final ConcurrentHashMap<String, WeexValue> mInstanceInfo = new ConcurrentHashMap<>();
    private long mSDKInitTime = 0;
    private boolean mBackground = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long d;

        public a(long j) {
            this.d = j;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceImpl$10");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WeexPlatformInstanceBridge.finalizeCInstance(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ Intent f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ MUSModule d;

            public a(MUSModule mUSModule) {
                this.d = mUSModule;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceImpl$2$1");
            }

            @Override // tb.yio
            public void e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                } else if (!WeexInstanceImpl.this.isDestroyed()) {
                    MUSModule mUSModule = this.d;
                    b bVar = b.this;
                    mUSModule.onActivityResult(bVar.d, bVar.e, bVar.f);
                }
            }
        }

        public b(int i, int i2, Intent intent) {
            this.d = i;
            this.e = i2;
            this.f = intent;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceImpl$2");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (!WeexInstanceImpl.this.isDestroyed()) {
                for (MUSModule mUSModule : WeexInstanceImpl.this.getAdapterMUSInstance().i().values()) {
                    hxh.d(new a(mUSModule));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ u6x d;
        public final /* synthetic */ WeexModule e;
        public final /* synthetic */ WeexValue[] f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        public c(u6x u6xVar, WeexModule weexModule, WeexValue[] weexValueArr, String str, String str2) {
            this.d = u6xVar;
            this.e = weexModule;
            this.f = weexValueArr;
            this.g = str;
            this.h = str2;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceImpl$3");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.d.b(WeexInstanceImpl.this, this.e, this.f);
                f9x.i(currentTimeMillis, this.g, this.h, WeexInstanceImpl.this);
            } catch (Throwable th) {
                dwh.k("[Module]", "callModuleMethod " + this.g + "#" + this.h + "() error", th, "Module: " + this.g + "<" + this.e.getClass().getSimpleName() + "> 调用报错, 查看adb log修复");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceImpl$4");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WeexInstanceImpl.this.initFailed(false, WeexErrorType.FATAL.errCode, "LoadSoFailed");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceImpl$5");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WeexInstanceImpl.this.initFailed(false, WeexErrorType.FATAL.errCode, "Instance create failed, may not have render engine!");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceImpl$6");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WeexInstanceImpl.this.initFailed(false, WeexErrorType.FATAL.errCode, "LoadSoFailed");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            WeexInstanceImpl.this.updateContainerSizeOnLayoutChange(i3 - i, i4 - i2);
            WeexInstanceImpl weexInstanceImpl = WeexInstanceImpl.this;
            weexInstanceImpl.updateInstanceScreenSize(weexInstanceImpl.getContext(), true);
            if (!WeexInstanceImpl.access$000(WeexInstanceImpl.this)) {
                WeexInstanceImpl.access$002(WeexInstanceImpl.this, true);
                if (!WeexInstanceImpl.this.isDestroyed()) {
                    WeexPlatformInstanceBridge.onRootViewFirstAdded(WeexInstanceImpl.this.mNativePtr);
                }
            }
            WeexInstanceImpl.access$100(WeexInstanceImpl.this, view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ HashMap d;

            public a(HashMap hashMap) {
                this.d = hashMap;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceImpl$8$1");
            }

            @Override // tb.yio
            public void e() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    return;
                }
                for (Pair pair : this.d.values()) {
                    try {
                        ((WeexModule) pair.first).onMainThreadDestroy();
                    } catch (Throwable th) {
                        dwh.g("[Module]", "onMainThreadDestroy exception:", th);
                    }
                }
            }
        }

        public h() {
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceImpl$8");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap(WeexInstanceImpl.access$200(WeexInstanceImpl.this));
            for (Pair pair : hashMap.values()) {
                try {
                    ((WeexModule) pair.first).onJSThreadDestroy();
                } catch (Throwable th) {
                    dwh.g("[Module]", "onJSThreadDestroy exception:", th);
                }
            }
            hxh.f(new a(hashMap));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ HashMap d;

            public a(HashMap hashMap) {
                this.d = hashMap;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceImpl$9$1");
            }

            @Override // tb.yio
            public void e() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    return;
                }
                for (MUSModule mUSModule : this.d.values()) {
                    mUSModule.destroy();
                }
            }
        }

        public i() {
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceImpl$9");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                hxh.f(new a(new HashMap(WeexInstanceImpl.this.getAdapterMUSInstance().i())));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class j extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int d;

        static {
            t2o.a(982515787);
        }

        public j(int i) {
            this.d = i;
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceImpl$CleanUpAsyncInfoRunnableEx");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            k kVar = (k) WeexInstanceImpl.access$300().remove(Integer.valueOf(this.d));
            if (kVar != null) {
                kVar.a(WeexValueImpl.ofUndefined());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface k {
        void a(WeexValue weexValue);
    }

    static {
        t2o.a(982515773);
        t2o.a(982515751);
        t2o.a(982515876);
    }

    public WeexInstanceImpl(g6x g6xVar) {
        long j2;
        int i2 = g6xVar.f19763a;
        this.mInstanceID = i2;
        WeexInstanceConfig weexInstanceConfig = g6xVar.i;
        if (weexInstanceConfig == null) {
            WeexInstanceConfig weexInstanceConfig2 = new WeexInstanceConfig();
            this.mInstanceConfig = weexInstanceConfig2;
            g6xVar.i = weexInstanceConfig2;
        } else {
            this.mInstanceConfig = weexInstanceConfig;
        }
        InitBeforeInstanceCreate(g6xVar, g6xVar.c);
        boolean z = g6xVar.m;
        this.mIsAsyncCreate = z;
        g6xVar.h = createInitOptions(g6xVar.c, g6xVar.h, g6xVar.i, z);
        WeexInstanceImpl weexInstanceImpl = g6xVar.j;
        if (weexInstanceImpl == null || !weexInstanceImpl.isDestroyed()) {
            WeexInstanceImpl weexInstanceImpl2 = g6xVar.k;
            if (weexInstanceImpl2 == null || !weexInstanceImpl2.isDestroyed()) {
                WeexInstanceInternalMode weexInstanceInternalMode = g6xVar.f;
                this.mMode = weexInstanceInternalMode;
                this.mRenderType = g6xVar.g;
                String str = g6xVar.d;
                this.mBundleUrl = str;
                this.mContext = g6xVar.c;
                this.mCreateStartUpTime = g6xVar.b;
                checkUrl(str, "createInstanceBundleUrl");
                u8x.a("CreateCInstance");
                if (g6xVar.j != null) {
                    f9x.a(!z);
                    String str2 = g6xVar.d;
                    String str3 = g6xVar.e;
                    int ordinal = weexInstanceInternalMode.ordinal();
                    long j3 = g6xVar.j.mNativePtr;
                    WeexValueImpl ofJSON = WeexValueImpl.ofJSON(g6xVar.h);
                    WeexInstanceImpl weexInstanceImpl3 = g6xVar.k;
                    if (weexInstanceImpl3 == null) {
                        j2 = 0;
                    } else {
                        j2 = weexInstanceImpl3.mNativePtr;
                    }
                    this.mNativePtr = WeexPlatformInstanceBridge.createInstanceChild(this, str2, str3, ordinal, j3, ofJSON, j2, g6xVar.l);
                } else {
                    WeexInstanceImpl weexInstanceImpl4 = g6xVar.k;
                    if (weexInstanceImpl4 != null) {
                        this.mNativePtr = WeexPlatformInstanceBridge.createInstanceEmbed(this, g6xVar.d, g6xVar.e, weexInstanceImpl4.mNativePtr, g6xVar.l, WeexValueImpl.ofJSON(g6xVar.h));
                    } else {
                        this.mNativePtr = WeexPlatformInstanceBridge.createInstance(this, g6xVar.d, g6xVar.e, g6xVar.f.ordinal(), g6xVar.g.getCppIndex(), WeexValueImpl.ofJSON(g6xVar.h));
                    }
                }
                u8x.b("CreateCInstance");
                WeexInstanceChecker.h().q(this, z);
                id2InstanceRef.put(Integer.valueOf(i2), new WeakReference<>(this));
                this.mApmExtend = new v3x(this);
                if (w4x.i() && w6x.l()) {
                    this.mException = new Exception().fillInStackTrace();
                }
                registerDarkModeReceiver();
                return;
            }
            throw new IllegalStateException("Create Instance when embedParent isDestroyed()");
        }
        throw new IllegalStateException("Create Instance when parent isDestroyed()");
    }

    private void InitBeforeInstanceCreate(g6x g6xVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7311813", new Object[]{this, g6xVar, context});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean n = h5x.n(g6xVar.f.instanceMode, (Application) context.getApplicationContext());
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (n) {
            this.mSDKInitTime = uptimeMillis2;
            x6x.c(this.mInstanceID, "Page", "WaitForSDKInitFinish").a(WMInstanceApm.KEY_PAGE_METRIC_SDK_INIT_TIME, Long.valueOf(this.mSDKInitTime)).f();
        }
        if (f5x.f19038a == null || !w6x.r(g6xVar.f.instanceMode)) {
            throw new IllegalStateException("Init not done when create WeexInstance");
        }
        i5x.g();
    }

    public static /* synthetic */ boolean access$000(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89431099", new Object[]{weexInstanceImpl})).booleanValue();
        }
        return weexInstanceImpl.mRootViewAdded;
    }

    public static /* synthetic */ boolean access$002(WeexInstanceImpl weexInstanceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12b4f8a1", new Object[]{weexInstanceImpl, new Boolean(z)})).booleanValue();
        }
        weexInstanceImpl.mRootViewAdded = z;
        return z;
    }

    public static /* synthetic */ void access$100(WeexInstanceImpl weexInstanceImpl, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a16a7c", new Object[]{weexInstanceImpl, view});
        } else {
            weexInstanceImpl.updateContainerNavTime(view);
        }
    }

    public static /* synthetic */ Map access$200(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f82d028c", new Object[]{weexInstanceImpl});
        }
        return weexInstanceImpl.mWeexModules;
    }

    public static /* synthetic */ Map access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eeb91def", new Object[0]);
        }
        return sEngineInfoCallbacks;
    }

    private void checkUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2071a62", new Object[]{this, str, str2});
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            if (w4x.i() && parse != null && parse.isHierarchical()) {
                this.mSimplifyUrl = parse.buildUpon().clearQuery().build().toString();
            }
        } catch (Exception e2) {
            dwh.g("InvalidUrl", "type: " + str2, e2);
        }
    }

    private void destroyModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6651608d", new Object[]{this});
            return;
        }
        this.mHandler.post(new h());
        this.mHandler.post(new i());
    }

    private boolean executeInstruction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("340d33ae", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    public static void getEngineInfoAsyncCallback(int i2, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37fad2b", new Object[]{new Integer(i2), weexValue});
            return;
        }
        k remove = sEngineInfoCallbacks.remove(Integer.valueOf(i2));
        if (remove != null) {
            remove.a(weexValue);
        }
    }

    public static void postInstanceCreate(WeexInstanceImpl weexInstanceImpl, tvh tvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8916f29", new Object[]{weexInstanceImpl, tvhVar});
            return;
        }
        tvhVar.g(weexInstanceImpl);
        weexInstanceImpl.bindMUSAdapterInstance(tvhVar);
        weexInstanceImpl.initAfterCreate();
        tvhVar.f();
        weexInstanceImpl.updateApmTime(WMInstanceApm.Stages.CREATE_PLATFORM_INSTANCE_START, weexInstanceImpl.mCreateStartUpTime);
    }

    public static WeexInstanceImpl queryInstance(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceImpl) ipChange.ipc$dispatch("d8148395", new Object[]{new Integer(i2)});
        }
        WeakReference<WeexInstanceImpl> weakReference = id2InstanceRef.get(Integer.valueOf(i2));
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void recordViewFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd2cd7e", new Object[]{this});
        }
    }

    private void registerDarkModeReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef4b12", new Object[]{this});
        } else if (f5x.d()) {
            this.mBroadcastDarkModeReceiver = new BroadcastReceiver() { // from class: com.taobao.android.weex.WeexInstanceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceImpl$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    int intExtra;
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent != null && (intExtra = intent.getIntExtra(h5x.KEY_DARK_MODE_EXTRA, -1)) != -1) {
                        JSONObject jSONObject = new JSONObject();
                        if (intExtra == 1) {
                            str = ThemeUtils.COLOR_SCHEME_DARK;
                        } else {
                            str = "light";
                        }
                        jSONObject.put("scheme", (Object) str);
                        WeexPlatformInstanceBridge.updateEnvironments(WeexInstanceImpl.this.mNativePtr, WeexEventTarget.DOCUMENT_TARGET.ordinal(), com.taobao.android.weex.b.e().b(jSONObject), 2);
                    }
                }
            };
            getContext().getApplicationContext().registerReceiver(this.mBroadcastDarkModeReceiver, new IntentFilter(h5x.KEY_DARK_MODE_ACTION));
        }
    }

    private void updateContainerNavTime(View view) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b425f833", new Object[]{this, view});
            return;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                Context context = ((ViewGroup) parent).getContext();
                if ((context instanceof Activity) && (extras = ((Activity) context).getIntent().getExtras()) != null) {
                    long j2 = extras.getLong(Nav.NAV_TO_URL_START_UPTIME, 0L);
                    if (j2 != 0) {
                        this.mApmExtend.c().c("wxNavToUrlStart", j2);
                    }
                    long j3 = extras.getLong(Nav.NAV_START_ACTIVITY_UPTIME, 0L);
                    if (j3 != 0) {
                        this.mApmExtend.c().c("wxNavToContainerStart", j3);
                    }
                }
            }
        } catch (Exception e2) {
            dwh.i(e2);
        }
    }

    public void addGoBackEventCallback(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ebe174", new Object[]{this, runnable});
        } else {
            this.mGoBackEventCallbacks.add(runnable);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void addInstanceListener(j6x j6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a721ecbb", new Object[]{this, j6xVar});
        } else {
            this.mWeexInstanceListeners.add(j6xVar);
        }
    }

    public void addModule(String str, WeexModule weexModule, c7x c7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("359d349f", new Object[]{this, str, weexModule, c7xVar});
        } else {
            this.mWeexModules.put(str, new Pair<>(weexModule, c7xVar));
        }
    }

    public void addOnLayoutChangeListener(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c801945d", new Object[]{this, view});
        } else if (this.mOnLayoutChangeListener == null) {
            g gVar = new g();
            this.mOnLayoutChangeListener = gVar;
            view.addOnLayoutChangeListener(gVar);
        }
    }

    public void bindJSThread(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16d5a27", new Object[]{this, handler});
        } else {
            this.mHandler = handler;
        }
    }

    public void bindMUSAdapterInstance(tvh tvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28420942", new Object[]{this, tvhVar});
        } else {
            this.mAdapterMUSInstance = tvhVar;
        }
    }

    public WeexModule buildModuleWithCache(String str, c7x c7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexModule) ipChange.ipc$dispatch("31a4e490", new Object[]{this, str, c7xVar});
        }
        try {
            WeexModule a2 = c7xVar.a(str, this);
            a2.onInit(str, getWeexModuleInterface());
            addModule(str, a2, c7xVar);
            return a2;
        } catch (Exception e2) {
            dwh.k("module", str + " module build instance failed.", e2, "Module: " + str + " 构造报错, 查看adb log修复");
            return null;
        }
    }

    public WeexValue callModule(String str, String str2, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("31c99b58", new Object[]{this, str, str2, weexValueArr});
        }
        MUSMonitor.i(str, str2, getBundleUrl());
        Pair<WeexModule, c7x> ensureModuleAndFactory = ensureModuleAndFactory(str);
        if (ensureModuleAndFactory == null) {
            return getAdapterMUSInstance().h(str, str2, weexValueArr);
        }
        WeexModule weexModule = (WeexModule) ensureModuleAndFactory.first;
        if (weexModule instanceof WeexInnerModule) {
            try {
                return ((WeexInnerModule) weexModule).callModuleMethod(this, str, str2, weexValueArr);
            } catch (Throwable th) {
                dwh.k("[Module]", "callModuleMethod " + str + "#" + str2 + "() error", th, "Module: " + str + "<" + weexModule.getClass().getSimpleName() + "> 调用报错, 查看adb log修复");
                return null;
            }
        } else {
            u6x<T> methodInvoker = ((c7x) ensureModuleAndFactory.second).getMethodInvoker(str2);
            if (methodInvoker == 0) {
                dwh.v("[Module] callModuleMethod " + str + "#" + str2 + "() is not defined");
                return null;
            } else if (methodInvoker.a() == MUSThreadStrategy.JS) {
                try {
                    return WeexValueImpl.convert(methodInvoker.b(this, weexModule, weexValueArr));
                } catch (Throwable th2) {
                    dwh.k("[Module]", "callModuleMethod " + str + "#" + str2 + "() error", th2, "Module: " + str + "<" + weexModule.getClass().getSimpleName() + "> 调用报错, 查看adb log修复");
                    return null;
                }
            } else {
                hxh.d(new c(methodInvoker, weexModule, weexValueArr, str, str2));
                return null;
            }
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public boolean canGoBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue();
        }
        if (this.mGoBackEventCallbacks.size() > 0) {
            return true;
        }
        return false;
    }

    public void clearGoBackEventCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a83197", new Object[]{this});
        } else {
            this.mGoBackEventCallbacks.clear();
        }
    }

    public void debugShowInstanceTag(String str) {
        Drawable foreground;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633d186", new Object[]{this, str});
        } else if (Build.VERSION.SDK_INT >= 23 && getRootView() != null) {
            foreground = getRootView().getForeground();
            if (foreground == null) {
                getRootView().setForeground(new hss(str, -13261794, 25));
            } else if (foreground instanceof hss) {
                ((hss) foreground).b(str);
            }
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public synchronized void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!isDestroyed()) {
            this.mDestroyed = true;
            if (!(this.mBroadcastDarkModeReceiver == null || getContext() == null || getContext().getApplicationContext() == null)) {
                getContext().getApplicationContext().unregisterReceiver(this.mBroadcastDarkModeReceiver);
            }
            x6x.c(getInstanceId(), "Page", "destroyStartInJava").f();
            WeexPlatformInstanceBridge.destroy(this.mNativePtr);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void dispatchEvent(WeexEventTarget weexEventTarget, String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef416b17", new Object[]{this, weexEventTarget, str, weexValue});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.dispatchEvent(this.mNativePtr, weexEventTarget.getEventTarget(), str, weexValue);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void dispatchExternalEvent(l5x l5xVar) throws WeexExternalEventCheckException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28bf9f2", new Object[]{this, l5xVar});
            return;
        }
        q6x q6xVar = (q6x) getExtend(q6x.class);
        if (q6xVar != null) {
            q6xVar.dispatchExternalEvent(l5xVar);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void dispatchNodeEvent(int i2, String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acde1384", new Object[]{this, new Integer(i2), str, weexValue});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.fireEvent(this.mNativePtr, i2, str, weexValue);
        }
    }

    public void dumpEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73cac2dd", new Object[]{this});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.dumpRenderTree(this.mNativePtr);
        }
    }

    public void engineException(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b81c759", new Object[]{this, new Integer(i2), str});
            return;
        }
        for (j6x j6xVar : this.mWeexInstanceListeners) {
            try {
                j6xVar.d2(this, WeexErrorType.transformErrorType(i2), str);
            } catch (Exception e2) {
                dwh.i(e2);
            }
        }
    }

    public final Pair<WeexModule, c7x> ensureModuleAndFactory(String str) {
        WeexModule buildModuleWithCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("715dd8b8", new Object[]{this, str});
        }
        Pair<WeexModule, c7x> pair = this.mWeexModules.get(str);
        if (pair != null) {
            return pair;
        }
        c7x<?> c7xVar = this.mModuleFactoryMap.get(str);
        if (c7xVar == null) {
            c7xVar = f7x.d(str);
        }
        if (c7xVar == null || (buildModuleWithCache = buildModuleWithCache(str, c7xVar)) == null) {
            return null;
        }
        Pair<WeexModule, c7x> create = Pair.create(buildModuleWithCache, c7xVar);
        this.mWeexModules.put(str, create);
        if (WeexMegaBridgeModule.NAME.equals(str) && (buildModuleWithCache instanceof MegaModule)) {
            this.mMegaModule = (MegaModule) buildModuleWithCache;
        }
        return create;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void execute(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a4be4d", new Object[]{this, bArr, str});
        } else if (!isDestroyed()) {
            z9x.d(getInstanceId(), xpc.RECORD_EXECUTE, bArr, str);
            WeexPlatformInstanceBridge.execute(this.mNativePtr, bArr, str);
        }
    }

    public void executeFailed(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e72849d4", new Object[]{this, new Integer(i2), str});
            return;
        }
        this.mMainThreadStatus = WeexInstanceStatus.INVALID;
        for (j6x j6xVar : this.mWeexInstanceListeners) {
            try {
                j6xVar.l2(this, WeexErrorType.transformErrorType(i2), str);
            } catch (Exception e2) {
                dwh.i(e2);
            }
        }
    }

    public void executeSucceed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716eb714", new Object[]{this});
            return;
        }
        for (j6x j6xVar : this.mWeexInstanceListeners) {
            try {
                j6xVar.K0(this);
            } catch (Exception e2) {
                dwh.i(e2);
            }
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            hxh.b(new a(this.mNativePtr));
        } catch (Throwable th) {
            Log.e(dwh.TAG, "err finalize", th);
        }
    }

    public void fireEvent(int i2, String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de828baa", new Object[]{this, new Integer(i2), str, weexValue});
        } else {
            dispatchNodeEvent(i2, str, weexValue);
        }
    }

    @Override // tb.h6x
    public void fireGlobalEvent(String str, Object... objArr) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f2457f", new Object[]{this, str, objArr});
            return;
        }
        if (objArr != null) {
            i2 = objArr.length;
        } else {
            i2 = 0;
        }
        WeexValue[] weexValueArr = new WeexValue[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            weexValueArr[i3] = WeexValueImpl.convert(objArr[i3]);
        }
        legacyFireGlobalEvent(str, weexValueArr);
    }

    public tvh getAdapterMUSInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tvh) ipChange.ipc$dispatch("51f8619d", new Object[]{this});
        }
        return this.mAdapterMUSInstance;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee20482", new Object[]{this});
        }
        return this.mBundleUrl;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public String getBusinessId() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58f54ea8", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mBusinessId)) {
            return this.mBusinessId;
        }
        String a2 = getInstanceConfig().a();
        this.mBusinessId = a2;
        if (TextUtils.isEmpty(a2)) {
            String bundleUrl = getBundleUrl();
            if (!TextUtils.isEmpty(b9x.a(bundleUrl))) {
                str = b9x.a(bundleUrl);
            } else {
                str = "default";
            }
            this.mBusinessId = str;
        }
        return this.mBusinessId;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    public void getEngineInfoAsync(int i2, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f541853", new Object[]{this, new Integer(i2), kVar});
            return;
        }
        int incrementAndGet = sEngineInfoCallbackId.incrementAndGet();
        sEngineInfoCallbacks.put(Integer.valueOf(incrementAndGet), kVar);
        WeexPlatformInstanceBridge.getEngineInfoAsync(this.mNativePtr, i2, incrementAndGet);
        hxh.c(new j(incrementAndGet), 10000);
    }

    @Override // com.taobao.android.weex.WeexInstance
    public <T> T getExtend(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2c4efa6c", new Object[]{this, cls});
        }
        if (cls == h6x.class) {
            return this;
        }
        if (cls == v3x.class) {
            return (T) this.mApmExtend;
        }
        if (cls == s5x.class) {
            return (T) this.mApmExtend;
        }
        return null;
    }

    public WeexInstanceConfig getInstanceConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceConfig) ipChange.ipc$dispatch("88015c7b", new Object[]{this});
        }
        return this.mInstanceConfig;
    }

    public WeexValue getInstanceEnv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("2b4079af", new Object[]{this, str});
        }
        return this.mInstanceEnv.get(str);
    }

    @Override // com.taobao.android.weex.WeexInstance
    public int getInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd985600", new Object[]{this})).intValue();
        }
        return this.mInstanceID;
    }

    public ConcurrentHashMap<String, WeexValue> getInstanceInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("c736c686", new Object[]{this});
        }
        return this.mInstanceInfo;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public WeexInstanceStatus getInstanceStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceStatus) ipChange.ipc$dispatch("bd9ef07e", new Object[]{this});
        }
        return this.mMainThreadStatus;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public Map<String, Object> getInstanceTags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5acbf240", new Object[]{this});
        }
        return this.mExtraObject;
    }

    @Deprecated
    public Handler getJSThreadHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("2981e4be", new Object[]{this});
        }
        return this.mHandler;
    }

    public WeexInstanceInternalMode getMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceInternalMode) ipChange.ipc$dispatch("a9c4db4", new Object[]{this});
        }
        return this.mMode;
    }

    public Pair<WeexModule, c7x> getModuleWithFactory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f2589b3d", new Object[]{this, str});
        }
        return this.mWeexModules.get(str);
    }

    public String getOriginURLString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5feb1d5", new Object[]{this});
        }
        String str = this.mOriginUrl;
        if (str != null) {
            return str;
        }
        String bundleUrl = getBundleUrl();
        if (TextUtils.isEmpty(bundleUrl)) {
            this.mOriginUrl = "";
            return "";
        }
        Uri parse = Uri.parse(bundleUrl);
        StringBuilder sb = new StringBuilder();
        if (parse.isHierarchical()) {
            sb.append(parse.getScheme());
            sb.append(HttpConstant.SCHEME_SPLIT);
            sb.append(parse.getAuthority());
        }
        String sb2 = sb.toString();
        this.mOriginUrl = sb2;
        return sb2;
    }

    public y7x getRecordManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y7x) ipChange.ipc$dispatch("ec154682", new Object[]{this});
        }
        return this.mRecordManager;
    }

    public ArrayList<String> getRenderEngineOptions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("bfe373b1", new Object[]{this});
        }
        if (isDestroyed()) {
            return new ArrayList<>();
        }
        return WeexPlatformInstanceBridge.getRenderEngineOptions(this.mNativePtr);
    }

    @Override // com.taobao.android.weex.WeexInstance
    public synchronized View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        if (this.mRootView == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.mRootView = frameLayout;
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            addOnLayoutChangeListener(this.mRootView);
        }
        return this.mRootView;
    }

    public View getRootViewWithoutCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8e1d7c90", new Object[]{this});
        }
        return this.mRootView;
    }

    public long getSDKInitTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3643b91c", new Object[]{this})).longValue();
        }
        return this.mSDKInitTime;
    }

    public void getSnapshot(String str, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b382ffbc", new Object[]{this, str, new Integer(i2), new Boolean(z)});
        } else {
            WeexPlatformInstanceBridge.getSnapshot(this.mNativePtr, str, i2, z);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public Object getTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d763d7dd", new Object[]{this, str});
        }
        return this.mExtraObject.get(str);
    }

    public d7x getWeexModuleInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d7x) ipChange.ipc$dispatch("ca59b17d", new Object[]{this});
        }
        return this.mWeexModuleInterface;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void goBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bc6f6", new Object[]{this});
            return;
        }
        Iterator<Runnable> it = this.mGoBackEventCallbacks.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public void initAfterCreate() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f13174f", new Object[]{this});
            return;
        }
        if (getAdapterMUSInstance() != null) {
            z = true;
        }
        f9x.a(z);
        WeexPlatformInstanceBridge.initAfterCreate(this.mNativePtr, this);
    }

    public void initFailed(boolean z, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179d342d", new Object[]{this, new Boolean(z), new Integer(i2), str});
            return;
        }
        this.mMainThreadStatus = WeexInstanceStatus.INVALID;
        for (j6x j6xVar : this.mWeexInstanceListeners) {
            try {
                j6xVar.z1(this, z, WeexErrorType.transformErrorType(i2), str);
            } catch (Exception e2) {
                dwh.i(e2);
            }
        }
    }

    public void initSucceed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba5abb5b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mInitDoneSuccess = true;
        for (j6x j6xVar : this.mWeexInstanceListeners) {
            try {
                j6xVar.E1(this, z);
            } catch (Exception e2) {
                dwh.i(e2);
            }
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void initWithData(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295d5098", new Object[]{this, bArr, str});
        } else if (!isDestroyed()) {
            z9x.d(getInstanceId(), xpc.RECORD_INIT_WITH_DATA, bArr, str, this);
            WeexPlatformInstanceBridge.initWithData(this.mNativePtr, bArr, str);
            onInitCalled();
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void initWithEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446f0dfe", new Object[]{this});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.initWithEmpty(this.mNativePtr);
            onInitCalled();
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void initWithURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f58d6a", new Object[]{this, str});
        } else if (!isDestroyed()) {
            checkUrl(this.mBundleUrl, "initWithURL");
            z9x.d(getInstanceId(), "environment", str, this.mInstanceEnv, vvh.h(), this);
            if (w6x.s(this.mMode.instanceMode)) {
                hxh.d(new d());
            } else {
                long j2 = this.mNativePtr;
                if (j2 == 0) {
                    hxh.d(new e());
                } else {
                    WeexPlatformInstanceBridge.initWithURL(j2, str);
                }
            }
            onInitCalled();
        }
    }

    public void invokeCallback(int i2, WeexValue[] weexValueArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f9249e", new Object[]{this, new Integer(i2), weexValueArr, new Boolean(z)});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.invokeCallback(this.mNativePtr, i2, weexValueArr, z);
        }
    }

    public boolean isAsyncCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("189aac99", new Object[]{this})).booleanValue();
        }
        return this.mIsAsyncCreate;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public boolean isBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbaf1a83", new Object[]{this})).booleanValue();
        }
        return this.mBackground;
    }

    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        return this.mDestroyed;
    }

    public boolean isSettingEnable(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1786195e", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (isDestroyed()) {
            return z;
        }
        return WeexPlatformInstanceBridge.isSettingEnable(this.mNativePtr, str, z);
    }

    public void legacyCallNativeUINode(int i2, String str, WeexValue[] weexValueArr) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa4c989", new Object[]{this, new Integer(i2), str, weexValueArr});
        } else if (!isDestroyed()) {
            if (Looper.myLooper() != getJSThreadHandler().getLooper()) {
                z = false;
            }
            f9x.a(z);
            WeexPlatformInstanceBridge.legacyCallNativeUINode(this.mNativePtr, i2, str, weexValueArr);
        }
    }

    public void legacyDispatchWindVaneEvent(String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9bc56ae", new Object[]{this, str, weexValue});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.legacyDispatchWindVaneEvent(this.mNativePtr, str, weexValue);
        }
    }

    public void legacyFireGlobalEvent(String str, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d743180", new Object[]{this, str, weexValueArr});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.legacyFireGlobalEvent(this.mNativePtr, str, weexValueArr);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        WeexInstanceChecker.h().m(this);
        ((e7x) this.mWeexModuleInterface).b();
        if (!isDestroyed()) {
            WeexPlatformInstanceBridge.viewDisappear(this.mNativePtr);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onActivityResult(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        ((e7x) this.mWeexModuleInterface).c(i2, i3, intent);
        this.mHandler.post(new b(i2, i3, intent));
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        WeexInstanceChecker.h().n(this);
        if (uvh.f().j() != null) {
            uvh.f().j().c(getInstanceId());
        }
        ((e7x) this.mWeexModuleInterface).d();
        if (!isDestroyed()) {
            WeexPlatformInstanceBridge.viewAppear(this.mNativePtr);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        WeexInstanceChecker.h().o(this);
        ((e7x) this.mWeexModuleInterface).e();
        this.mBackground = false;
        if (!isDestroyed()) {
            WeexPlatformInstanceBridge.pageShow(this.mNativePtr);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        WeexInstanceChecker.h().p(this);
        ((e7x) this.mWeexModuleInterface).f();
        this.mBackground = true;
        if (!isDestroyed()) {
            WeexPlatformInstanceBridge.pageHide(this.mNativePtr);
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mMainThreadStatus = WeexInstanceStatus.DESTROYED;
        for (j6x j6xVar : this.mWeexInstanceListeners) {
            j6xVar.I1(this);
        }
        if (uvh.f().j() != null) {
            uvh.f().j().a(getInstanceId());
        }
        this.mApmExtend.c().f();
    }

    public void onDestroyStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ffd50e", new Object[]{this});
            return;
        }
        this.mDestroyed = true;
        id2InstanceRef.remove(Integer.valueOf(this.mInstanceID));
        WeexInstanceChecker.h().r(this);
    }

    public void onInitCalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c6ba73", new Object[]{this});
        } else {
            this.mMainThreadStatus = WeexInstanceStatus.INITED;
        }
    }

    public void onJSDestroyPostDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3257245b", new Object[]{this});
        } else {
            destroyModule();
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.viewAppear(this.mNativePtr);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onViewDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.viewDisappear(this.mNativePtr);
        }
    }

    public void registerInnerModule(String str, Class<? extends WeexInnerModule> cls, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e53d79d2", new Object[]{this, str, cls, strArr});
        } else if (TextUtils.isEmpty(str) || cls == null) {
            dwh.e("register module illegal");
        } else {
            if (this.mModuleFactoryMap.containsKey(str)) {
                dwh.v("register module twice,Module name is  " + str);
            }
            f9x.b(WeexInnerModule.class.isAssignableFrom(cls), "registerInnerModule only support WeexInnerModule");
            this.mModuleFactoryMap.put(str, new q5x(cls, strArr));
        }
    }

    public void removeCallback(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5474f013", new Object[]{this, new Integer(i2)});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.removeCallback(this.mNativePtr, i2);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void removeInstanceListener(j6x j6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922067de", new Object[]{this, j6xVar});
        } else {
            this.mWeexInstanceListeners.remove(j6xVar);
        }
    }

    public void renderFailed(boolean z, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be6e233", new Object[]{this, new Boolean(z), new Integer(i2), str});
            return;
        }
        this.mMainThreadStatus = WeexInstanceStatus.INVALID;
        for (j6x j6xVar : this.mWeexInstanceListeners) {
            try {
                j6xVar.H0(this, z, WeexErrorType.transformErrorType(i2), str);
            } catch (Exception e2) {
                dwh.i(e2);
            }
        }
    }

    public void renderSucceed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971ffee1", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            this.mMainThreadStatus = WeexInstanceStatus.RENDERED;
        }
        this.mRenderDoneSuccess = true;
        if (uvh.f().j() != null) {
            uvh.f().j().b(this);
        }
        for (j6x j6xVar : this.mWeexInstanceListeners) {
            try {
                j6xVar.K1(this, z);
            } catch (Exception e2) {
                dwh.i(e2);
            }
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void reportException(WeexErrorType weexErrorType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2645c4d", new Object[]{this, weexErrorType, str, str2});
        } else {
            WeexPlatformCommonBridge.reportException(false, getInstanceId(), weexErrorType.errCode, str, str2);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void reportInnerException(WeexErrorType weexErrorType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af369b", new Object[]{this, weexErrorType, str, str2});
        } else {
            WeexPlatformCommonBridge.reportExceptionInnerInfo(getInstanceId(), weexErrorType.errCode, str, str2);
        }
    }

    public void reportTaskLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c163fc", new Object[]{this, str});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.reportTaskLog(this.mNativePtr, 0, str);
        }
    }

    public void reportUnicornScreenInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5377e6eb", new Object[]{this, jSONObject});
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public WeexValue requireModule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("8a1075fe", new Object[]{this, str});
        }
        Pair<WeexModule, c7x> ensureModuleAndFactory = ensureModuleAndFactory(str);
        if (ensureModuleAndFactory != null) {
            return WeexValueImpl.ofJSONArray(((c7x) ensureModuleAndFactory.second).getMethods());
        }
        return gwh.c(str);
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
        } else if (this.mContext != context) {
            WeexInstanceChecker.h().s(this.mContext, context, this);
            this.mContext = context;
            if (getAdapterMUSInstance().getContext().a() != context) {
                getAdapterMUSInstance().getContext().c(context);
            }
            v3x v3xVar = (v3x) getExtend(v3x.class);
            if (v3xVar != null) {
                v3xVar.g();
            }
        }
    }

    public void scriptException(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6b39e2", new Object[]{this, new Integer(i2), str});
            return;
        }
        for (j6x j6xVar : this.mWeexInstanceListeners) {
            try {
                j6xVar.e2(this, WeexErrorType.transformErrorType(i2), str);
            } catch (Exception e2) {
                dwh.i(e2);
            }
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void setExceptionArg(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fca6e24", new Object[]{this, str, str2});
        } else {
            WeexPlatformCommonBridge.setExceptionArg(getInstanceId(), str, str2);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void setInstanceData(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55512e24", new Object[]{this, weexValue});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.setInstanceData(this.mNativePtr, weexValue);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void setTag(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8389e805", new Object[]{this, str, obj});
        } else {
            this.mExtraObject.put(str, obj);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void setWeexApmCustomData(WeexApmCustomData weexApmCustomData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4043a86", new Object[]{this, weexApmCustomData});
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "WeexInstance<" + this.mMode.toString() + ">(" + getInstanceId() + "){ " + b9x.d(getBundleUrl()) + " }";
    }

    public void updateApmTime(WMInstanceApm.Stages stages, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c39b047", new Object[]{this, stages, new Double(d2)});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.updateApmStage(this.mNativePtr, stages.ordinal(), d2);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void updateBaseFontSize(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc2000f", new Object[]{this, new Float(f2)});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.updateBaseFontSize(this.mNativePtr, f2);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void updateBundleUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c37fe55", new Object[]{this, str});
        } else if (!isDestroyed()) {
            this.mBundleUrl = str;
            this.mOriginUrl = null;
            checkUrl(str, "updateBundleUrl");
            WeexPlatformInstanceBridge.updateBundleUrl(this.mNativePtr, str);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void updateContainerSize(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd13ade0", new Object[]{this, new Float(f2), new Float(f3)});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.updateContainerSize(this.mNativePtr, fxh.n(this.mContext, f2), fxh.n(this.mContext, f3));
        }
    }

    public void updateContainerSizeOnLayoutChange(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0b8ad9", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (i2 != this.mLastInnerWidth || i3 != this.mLastInnerHeight) {
            this.mLastInnerWidth = i2;
            this.mLastInnerHeight = i3;
            recordViewFrame();
            updateContainerSize(this.mLastInnerWidth, this.mLastInnerHeight);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void updateInstanceData(String str, String str2, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe48c49", new Object[]{this, str, str2, weexValue});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.updateInstanceData(this.mNativePtr, str, str2, weexValue);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void updateInstanceEnv(String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d105ac", new Object[]{this, str, weexValue});
        } else if (!isDestroyed()) {
            this.mInstanceEnv.put(str, weexValue);
            WeexPlatformInstanceBridge.updateInstanceEnv(this.mNativePtr, str);
        }
    }

    public void updateInstanceInfo(String str, WeexValueImpl weexValueImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92bb5bcf", new Object[]{this, str, weexValueImpl});
        } else {
            this.mInstanceInfo.put(str, weexValueImpl);
        }
    }

    public void updateInstanceScreenSize(Context context, boolean z) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b42a3e", new Object[]{this, context, new Boolean(z)});
        } else if (context != null) {
            if (!(context instanceof Activity) || uvh.f().h() == null) {
                i3 = nxh.f(context);
                i2 = nxh.d(context);
            } else {
                Rect a2 = uvh.f().h().a((Activity) context);
                i3 = a2.right - a2.left;
                i2 = a2.bottom - a2.top;
            }
            if (this.mInstanceConfig.b() != null) {
                Rect computeCurrentScreenMetrics = this.mInstanceConfig.b().computeCurrentScreenMetrics();
                i3 = computeCurrentScreenMetrics.right - computeCurrentScreenMetrics.left;
                i2 = computeCurrentScreenMetrics.bottom - computeCurrentScreenMetrics.top;
            }
            if (this.mLastScreenWidth != i3 || this.mLastScreenHeight != i2) {
                if (z) {
                    updateScreenSize(i3, i2, nxh.b(context));
                }
                this.mLastScreenWidth = i3;
                this.mLastScreenHeight = i2;
            }
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void updateRTL(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55fb3eec", new Object[]{this, new Boolean(z)});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.updateRTL(this.mNativePtr, z);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void updateRenderEnvironments(z7x z7xVar) {
        double d2;
        double d3;
        double d4;
        double d5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf884e3a", new Object[]{this, z7xVar});
        } else if (!isDestroyed() && z7xVar != null) {
            b8x d6 = z7xVar.d();
            if (z7xVar.d() != null) {
                d5 = d6.d();
                d4 = d6.a();
                d3 = d6.b();
                d2 = d6.c();
            } else {
                d5 = -1.0d;
                d4 = -1.0d;
                d3 = -1.0d;
                d2 = -1.0d;
            }
            WeexPlatformInstanceBridge.updateRenderEnvironments(this.mNativePtr, z7xVar.b(), z7xVar.a(), z7xVar.c(), d5, d4, d3, d2);
        }
    }

    public void updateScreenSize(float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e54e3", new Object[]{this, new Float(f2), new Float(f3), new Float(f4)});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.updateScreenSize(this.mNativePtr, fxh.n(this.mContext, f2), fxh.n(this.mContext, f3), f4);
        }
    }

    public JSONObject createInitOptions(Context context, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig, boolean z) {
        String str;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eb1ffe", new Object[]{this, context, jSONObject, weexInstanceConfig, new Boolean(z)});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        if (weexInstanceConfig.f() != null) {
            jSONObject2.put("transparent", (Object) Boolean.valueOf(weexInstanceConfig.f().f()));
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("devicePixelRatio", (Object) Float.valueOf(vvh.i()));
        updateInstanceScreenSize(context, false);
        float n = fxh.n(context, this.mLastScreenWidth);
        float n2 = fxh.n(context, this.mLastScreenHeight);
        jSONObject3.put(WXConfig.deviceWidth, (Object) Float.valueOf(n));
        jSONObject3.put(WXConfig.deviceHeight, (Object) Float.valueOf(n2));
        if (f5x.d()) {
            if (com.taobao.android.weex.b.d().e() == WeexDarkMode.DARK) {
                str = ThemeUtils.COLOR_SCHEME_DARK;
            } else {
                str = "light";
            }
            jSONObject3.put("scheme", (Object) str);
        }
        int g2 = nxh.g(context);
        if (g2 >= 0) {
            i2 = g2;
        }
        jSONObject3.put("statusBarHeight", (Object) Float.valueOf(fxh.n(context, i2)));
        jSONObject3.put("navBarHeight", (Object) Float.valueOf(fxh.n(context, nxh.a(context))));
        if (jSONObject2.getJSONObject("render_param") != null) {
            jSONObject3.putAll(jSONObject2.getJSONObject("render_param"));
        }
        jSONObject2.put("render_param", (Object) jSONObject3);
        jSONObject2.put("async_create", (Object) Boolean.valueOf(z));
        jSONObject2.put("new_life_cycle", (Object) Boolean.TRUE);
        jSONObject2.put("long_live", (Object) Boolean.valueOf(weexInstanceConfig.j()));
        jSONObject2.put("apm_on_page_hide", (Object) Boolean.valueOf(weexInstanceConfig.i()));
        return jSONObject2;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void registerModule(String str, Class<? extends WeexModule> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e316fd", new Object[]{this, str, cls});
        } else if (TextUtils.isEmpty(str) || cls == null) {
            dwh.e("register module illegal");
        } else {
            if (this.mModuleFactoryMap.containsKey(str)) {
                dwh.v("register module twice,Module name is  " + str);
            }
            if (WeexInnerModule.class.isAssignableFrom(cls)) {
                f9x.b(false, "Subclass of WeexInnerModule should use registerInnerModule to register");
            } else {
                this.mModuleFactoryMap.put(str, new j8x(cls));
            }
        }
    }

    public WeexValue callMega(boolean z, String str, String str2, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("d182dfa4", new Object[]{this, new Boolean(z), str, str2, weexValueArr});
        }
        try {
            if (this.mMegaModule == null) {
                ensureModuleAndFactory(WeexMegaBridgeModule.NAME);
            }
            if (this.mMegaModule == null) {
                dwh.e("call Mega error");
                return null;
            }
            JSONObject jSONObjectOrNull = weexValueArr.length > 0 ? weexValueArr[0].toJSONObjectOrNull() : null;
            if (z) {
                return this.mMegaModule.syncCall(str, str2, jSONObjectOrNull);
            }
            this.mMegaModule.asyncCall(str, str2, jSONObjectOrNull, weexValueArr.length > 1 ? weexValueArr[1].toFunctionOrNull(this) : null);
            return null;
        } catch (Throwable th) {
            dwh.y("callMega error", th);
            return null;
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void render(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c13e4f", new Object[]{this, weexValue});
        } else if (!isDestroyed()) {
            z9x.d(getInstanceId(), "render", weexValue);
            if (w6x.s(this.mMode.instanceMode)) {
                hxh.d(new f());
            } else {
                WeexPlatformInstanceBridge.render(this.mNativePtr, weexValue);
            }
        }
    }
}
