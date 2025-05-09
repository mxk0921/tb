package com.taobao.android.weex.instance;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.c;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.android.weex_framework.ui.INode;
import java.util.ArrayList;
import java.util.List;
import tb.g6x;
import tb.hxh;
import tb.n6x;
import tb.p6x;
import tb.ppc;
import tb.t2o;
import tb.tvh;
import tb.u8x;
import tb.v8x;
import tb.vpc;
import tb.w8x;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexMUSInstance extends WeexInstanceImpl implements n6x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean soLoaded = false;
    private ArrayList<Runnable> mBatchTasks;
    private long mRenderStartTime;
    private boolean mRendered = false;
    private final v8x mUIKitConfig;
    private final w8x mUIKitExtend;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List d;

        public a(List list) {
            this.d = list;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/instance/WeexMUSInstance$1");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (!WeexMUSInstance.this.isDestroyed()) {
                for (Runnable runnable : this.d) {
                    runnable.run();
                }
                if (Looper.myLooper() == Looper.getMainLooper() && WeexMUSInstance.this.getRootView() != null) {
                    WeexMUSInstance.this.getRootView().requestLayout();
                }
            }
        }
    }

    static {
        t2o.a(982515920);
        t2o.a(982515878);
    }

    private WeexMUSInstance(g6x g6xVar) {
        super(g6xVar);
        v8x v8xVar;
        u8x.a("updateLayoutParams");
        MUSEngine.updateLayoutParams(g6xVar.c);
        MUSEngine.updateDelayedNativeRegister();
        u8x.b("updateLayoutParams");
        WeexInstanceConfig weexInstanceConfig = g6xVar.i;
        if (weexInstanceConfig == null || weexInstanceConfig.e() == null) {
            v8xVar = new v8x();
        } else {
            v8xVar = g6xVar.i.e();
        }
        this.mUIKitConfig = v8xVar;
        this.mUIKitExtend = new w8x(this);
    }

    public static WeexMUSInstance create(g6x g6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexMUSInstance) ipChange.ipc$dispatch("186a24f4", new Object[]{g6xVar});
        }
        WeexMUSInstance weexMUSInstance = new WeexMUSInstance(g6xVar);
        WeexInstanceImpl.postInstanceCreate(weexMUSInstance, g6xVar.n);
        return weexMUSInstance;
    }

    public static /* synthetic */ Object ipc$super(WeexMUSInstance weexMUSInstance, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1759510815:
                super.renderSucceed(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 396178477:
                super.initFailed(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (String) objArr[2]);
                return null;
            case 461490009:
                super.engineException(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 566312527:
                super.render((WeexValue) objArr[0]);
                return null;
            case 675416386:
                super.bindMUSAdapterInstance((tvh) objArr[0]);
                return null;
            case 743373420:
                return super.getExtend((Class) objArr[0]);
            case 939513102:
                super.onDestroyStart();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            case 1810293299:
                super.renderFailed(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (String) objArr[2]);
                return null;
            case 1852520930:
                super.scriptException(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/instance/WeexMUSInstance");
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void bindMUSAdapterInstance(tvh tvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28420942", new Object[]{this, tvhVar});
            return;
        }
        super.bindMUSAdapterInstance(tvhVar);
        this.mUIKitExtend.e();
    }

    public void dirtyNodeAndReLayout(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b210bb98", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.musDirtyNodeAndReLayout(this.mNativePtr, i, z);
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void engineException(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b81c759", new Object[]{this, new Integer(i), str});
            return;
        }
        super.engineException(i, str);
        MUSAppMonitor.k(this.mUIKitExtend.getMonitorInfo(), String.valueOf(i), str);
    }

    public void enqueueTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b19e232", new Object[]{this, runnable});
            return;
        }
        ArrayList<Runnable> arrayList = this.mBatchTasks;
        if (arrayList != null) {
            arrayList.add(runnable);
        } else if (this.mRendered) {
            hxh.f(runnable);
        } else {
            Handler jSThreadHandler = getJSThreadHandler();
            if (jSThreadHandler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                jSThreadHandler.post(runnable);
            }
        }
    }

    public void enqueueTaskToJS(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747970d6", new Object[]{this, runnable});
            return;
        }
        ArrayList<Runnable> arrayList = this.mBatchTasks;
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        Handler jSThreadHandler = getJSThreadHandler();
        if (jSThreadHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            jSThreadHandler.post(runnable);
        }
    }

    public void enterMacroScope() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fbb7b67", new Object[]{this});
        } else if (this.mBatchTasks == null) {
            this.mBatchTasks = new ArrayList<>();
        }
    }

    public void exitMacroScope() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f07bb2d", new Object[]{this});
            return;
        }
        ArrayList<Runnable> arrayList = this.mBatchTasks;
        if (arrayList != null) {
            this.mBatchTasks = null;
            a aVar = new a(arrayList);
            if (this.mRendered) {
                hxh.f(aVar);
            } else {
                aVar.run();
            }
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public <T> T getExtend(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2c4efa6c", new Object[]{this, cls});
        }
        if (cls == p6x.class) {
            return (T) this.mUIKitExtend;
        }
        if (cls == n6x.class) {
            return this;
        }
        return (T) super.getExtend(cls);
    }

    public ppc getRenderManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppc) ipChange.ipc$dispatch("5863c127", new Object[]{this});
        }
        return this.mUIKitExtend.f();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        View g = this.mUIKitExtend.g();
        addOnLayoutChangeListener(g);
        return g;
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void initFailed(boolean z, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179d342d", new Object[]{this, new Boolean(z), new Integer(i), str});
            return;
        }
        super.initFailed(z, i, str);
        MUSAppMonitor.c(this.mUIKitExtend.getMonitorInfo(), "1001", str);
    }

    public boolean isIncremental() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47f8f0db", new Object[]{this})).booleanValue();
        }
        return this.mUIKitConfig.a();
    }

    public boolean isPreciseExpose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7a92b00", new Object[]{this})).booleanValue();
        }
        return this.mUIKitConfig.b();
    }

    public void monitorCommitTime(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc52e4fc", new Object[]{this, new Integer(i), str, new Long(j)});
        } else {
            this.mUIKitExtend.h(i, str, j);
        }
    }

    public void monitorUpdateDim(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3af53e0", new Object[]{this, str, str2});
        } else {
            this.mUIKitExtend.i(str, str2);
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        if (this.mRendered && this.mUIKitExtend.f() != null) {
            this.mUIKitExtend.f().g();
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        if (this.mRendered && this.mUIKitExtend.f() != null) {
            this.mUIKitExtend.f().c();
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mUIKitExtend.k(this.mInitDoneSuccess, this.mRenderDoneSuccess);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void onDestroyStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ffd50e", new Object[]{this});
            return;
        }
        super.onDestroyStart();
        View g = this.mUIKitExtend.g();
        if (g instanceof vpc) {
            ((vpc) g).release(true);
        }
    }

    public void onRenderSuccessJSThread(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2264fb2c", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            this.mRendered = true;
            ppc f = this.mUIKitExtend.f();
            if (f != null) {
                f.a(getContext());
            }
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void render(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c13e4f", new Object[]{this, weexValue});
            return;
        }
        if (this.mRenderStartTime == 0) {
            this.mRenderStartTime = System.currentTimeMillis();
        }
        updateInstanceScreenSize(getContext(), true);
        super.render(weexValue);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void renderFailed(boolean z, int i, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be6e233", new Object[]{this, new Boolean(z), new Integer(i), str});
            return;
        }
        super.renderFailed(z, i, str);
        c monitorInfo = this.mUIKitExtend.getMonitorInfo();
        if (z) {
            str2 = "1003";
        } else {
            str2 = "1002";
        }
        MUSAppMonitor.c(monitorInfo, str2, str);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void scriptException(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6b39e2", new Object[]{this, new Integer(i), str});
            return;
        }
        super.scriptException(i, str);
        MUSAppMonitor.l(this.mUIKitExtend.getMonitorInfo(), String.valueOf(i), str);
    }

    public void sendInstanceMessage(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43bc3a6b", new Object[]{this, str, str2, jSONObject});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.sendInstanceMessage(this.mNativePtr, str, str2, WeexValueImpl.ofJSON(jSONObject));
        }
    }

    public void setRenderManager(ppc ppcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a305f555", new Object[]{this, ppcVar});
        } else {
            this.mUIKitExtend.l(ppcVar);
        }
    }

    public void setRootNode(INode iNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf382d0", new Object[]{this, iNode});
            return;
        }
        ppc f = this.mUIKitExtend.f();
        if (f != null) {
            f.e(iNode);
            f.j(this.mUIKitConfig.a());
            f.d(this.mUIKitConfig.b());
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void updateContainerSizeOnLayoutChange(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0b8ad9", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void renderSucceed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971ffee1", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            this.mUIKitExtend.d().b(1, MUSMonitor.KEY_MAIN_TIME_ALL, System.currentTimeMillis() - this.mRenderStartTime);
        }
        super.renderSucceed(z);
        MUSAppMonitor.e(this.mUIKitExtend.getMonitorInfo());
        ppc f = this.mUIKitExtend.f();
        if (f != null) {
            f.f(getAdapterMUSInstance());
        }
    }
}
