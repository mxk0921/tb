package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexExternalEventCheckException;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.instance.WeexDOMInstance;
import com.taobao.android.weex.instance.WeexMUSInstance;
import com.taobao.android.weex.instance.WeexScriptOnlyInstance;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import com.taobao.android.weex_framework.ui.INode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tvh extends MUSDKInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeexInstanceImpl f28985a;
    public final rvh b;
    public Object c;
    public volatile kpc d;
    public j6x h;
    public npc i;
    public dpc j;
    public volatile boolean n;
    public boolean o;
    public fpc q;
    public final MUSInstanceConfig s;
    public final jkj e = new jkj(this);
    public final Handler f = new Handler(Looper.getMainLooper());
    public final Map<String, MUSModule> g = new HashMap();
    public volatile int k = 0;
    public volatile int l = 0;
    public volatile boolean m = false;
    public volatile boolean p = false;
    public volatile float r = 1.0f;
    public final Object t = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements j6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.j6x
        public void E1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            tvh.a(tvh.this, true);
            if (tvh.b(tvh.this) != null) {
                tvh.b(tvh.this).onPrepareSuccess(tvh.this);
            }
        }

        @Override // tb.j6x
        public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            } else if (!z) {
                tvh.c(tvh.this, true);
                if (tvh.b(tvh.this) != null) {
                    tvh.b(tvh.this).onRenderFailed(tvh.this, 1, str, false);
                }
            } else if (tvh.b(tvh.this) != null) {
                tvh.b(tvh.this).onRefreshFailed(tvh.this, 3, str, false);
            }
        }

        @Override // tb.j6x
        public void I1(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
            } else if (tvh.b(tvh.this) != null) {
                tvh.b(tvh.this).onDestroyed(tvh.this);
            }
        }

        @Override // tb.j6x
        public void K0(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            } else if (tvh.e(tvh.this) != null) {
                tvh.e(tvh.this).b(tvh.this);
            }
        }

        @Override // tb.j6x
        public void K1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            tvh.d(tvh.this, true);
            if (z) {
                if (tvh.b(tvh.this) != null) {
                    tvh.b(tvh.this).onRefreshSuccess(tvh.this);
                }
            } else if (tvh.b(tvh.this) != null) {
                tvh.b(tvh.this).onRenderSuccess(tvh.this);
            }
        }

        @Override // tb.j6x
        public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
            } else if (tvh.b(tvh.this) != null) {
                tvh.b(tvh.this).onJSException(tvh.this, 11, str);
            }
        }

        @Override // tb.j6x
        public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            } else if (tvh.e(tvh.this) != null) {
                tvh.e(tvh.this).a(tvh.this, 11, str, false);
            }
        }

        @Override // tb.j6x
        public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            tvh.c(tvh.this, true);
            if (tvh.b(tvh.this) != null) {
                tvh.b(tvh.this).onRenderFailed(tvh.this, 0, str, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Object d;

        public b(Object obj) {
            this.d = obj;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/musadapter/MUSDKAdapterInstance$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                tvh.this.setExecuteContextInternal(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements fpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Handler f28987a;

        public c(tvh tvhVar, Handler handler) {
            this.f28987a = handler;
        }

        @Override // tb.fpc
        public void post(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd609e25", new Object[]{this, runnable});
            } else {
                this.f28987a.post(runnable);
            }
        }
    }

    static {
        t2o.a(982515936);
    }

    public tvh(Context context, MUSInstanceConfig mUSInstanceConfig) {
        this.b = new rvh(context);
        if (mUSInstanceConfig != null) {
            this.s = mUSInstanceConfig;
            this.d = mUSInstanceConfig.e();
            if (mUSInstanceConfig.g() != null) {
                m(mUSInstanceConfig.g().floatValue());
                return;
            }
            return;
        }
        this.s = new MUSInstanceConfig();
    }

    public static /* synthetic */ boolean a(tvh tvhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("852096f2", new Object[]{tvhVar, new Boolean(z)})).booleanValue();
        }
        tvhVar.m = z;
        return z;
    }

    public static /* synthetic */ npc b(tvh tvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (npc) ipChange.ipc$dispatch("b728dd96", new Object[]{tvhVar});
        }
        return tvhVar.i;
    }

    public static /* synthetic */ boolean c(tvh tvhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("209f86f4", new Object[]{tvhVar, new Boolean(z)})).booleanValue();
        }
        tvhVar.p = z;
        return z;
    }

    public static /* synthetic */ boolean d(tvh tvhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e5efef5", new Object[]{tvhVar, new Boolean(z)})).booleanValue();
        }
        tvhVar.n = z;
        return z;
    }

    public static /* synthetic */ dpc e(tvh tvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dpc) ipChange.ipc$dispatch("ea846e0a", new Object[]{tvhVar});
        }
        return tvhVar.j;
    }

    public static /* synthetic */ Object ipc$super(tvh tvhVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -598262597:
                super.setJSBridgeEnv((String) objArr[0], (Map) objArr[1]);
                return null;
            case -495030542:
                return super.getJustCreateTagName();
            case 931981515:
                return super.getJSBridgeEnv((String) objArr[0]);
            case 1791915820:
                super.setJustCreateTagName((String) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/musadapter/MUSDKAdapterInstance");
        }
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void addEventListener(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed5e8207", new Object[]{this, str, pvhVar});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void addGoBackEventCallback(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ebe174", new Object[]{this, runnable});
        } else {
            this.f28985a.addGoBackEventCallback(runnable);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void addInstanceEnv(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb9e7d2", new Object[]{this, str, str2});
            return;
        }
        if ("bundleUrl".equals(str)) {
            this.f28985a.updateBundleUrl(str2);
        }
        this.f28985a.updateInstanceEnv(str, WeexValueImpl.ofString(str2));
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void addModule(String str, MUSModule mUSModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff56d59d", new Object[]{this, str, mUSModule});
        } else {
            ((HashMap) this.g).put(str, mUSModule);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void addWeexStats(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a5836", new Object[]{this, str, new Long(j)});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void beginUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748659", new Object[]{this});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void bindRenderComponent(xid xidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99df1dd3", new Object[]{this, xidVar});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public MUSValue callModuleMethod(MUSValue mUSValue, MUSValue mUSValue2, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("a02c584d", new Object[]{this, mUSValue, mUSValue2, mUSValueArr});
        }
        if (mUSValue2 == null || TextUtils.isEmpty(mUSValue2.getStringValue())) {
            dwh.u(this, "[MUSDKInstance] callModuleMethod methodName is empty");
            return null;
        }
        Object a2 = gwh.a(this, mUSValue.getStringValue(), mUSValue2.getStringValue(), mUSValueArr, this.e);
        if (a2 == null) {
            return null;
        }
        return ((WeexValueImpl) a2).convertMUSValue();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void callNativeUINode(int i, String str, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6acc2e7", new Object[]{this, new Integer(i), str, mUSValueArr});
        } else {
            this.f28985a.legacyCallNativeUINode(i, str, s3x.a(mUSValueArr));
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public boolean canGoBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue();
        }
        return this.f28985a.canGoBack();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void clearGoBackEventCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a83197", new Object[]{this});
        } else {
            this.f28985a.clearGoBackEventCallbacks();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void createAppContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9b8df1", new Object[]{this});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void debugHideInstIdTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ec1dab", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void debugShowInstIdTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccac87d0", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f28985a.destroy();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void dispatchDOMEvent(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c605389c", new Object[]{this, new Integer(i), str, jSONObject});
        } else {
            fireEventOnNode(i, str, jSONObject);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void dispatchEvent(MUSEventTarget mUSEventTarget, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45af32d4", new Object[]{this, mUSEventTarget, str, jSONObject});
        } else {
            fireEvent(mUSEventTarget.ordinal(), str, jSONObject);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void dispatchExternalEvent(l5x l5xVar) throws WeexExternalEventCheckException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28bf9f2", new Object[]{this, l5xVar});
        } else {
            this.f28985a.dispatchExternalEvent(l5xVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void dumpEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73cac2dd", new Object[]{this});
        } else {
            this.f28985a.dumpEngine();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean enabledPreRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("684ea063", new Object[]{this})).booleanValue();
        }
        f9x.a(false);
        return false;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void endUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f678800b", new Object[]{this});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void enqueueTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b19e232", new Object[]{this, runnable});
            return;
        }
        f9x.a(this.f28985a instanceof WeexMUSInstance);
        ((WeexMUSInstance) this.f28985a).enqueueTask(runnable);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void enqueueTaskToJS(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747970d6", new Object[]{this, runnable});
            return;
        }
        f9x.a(this.f28985a instanceof WeexMUSInstance);
        ((WeexMUSInstance) this.f28985a).enqueueTaskToJS(runnable);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void execute(MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1294c5c6", new Object[]{this, mUSValueArr});
            return;
        }
        f9x.a(this.f28985a instanceof WeexScriptOnlyInstance);
        ((WeexScriptOnlyInstance) this.f28985a).execute(s3x.a(mUSValueArr));
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void executeFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a20093", new Object[]{this, new Integer(i), str});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void executeScript(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390d3e78", new Object[]{this, bArr, str});
        } else {
            this.f28985a.execute(bArr, str);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void executeSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a25f055", new Object[]{this});
        } else {
            f9x.a(false);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84544f4", new Object[]{this});
        } else if (this.d != null) {
            this.d.a(this.f28985a.getRootView());
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public INode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INode) ipChange.ipc$dispatch("45dd4e8a", new Object[]{this, new Integer(i)});
        }
        f9x.a(this.f28985a instanceof WeexMUSInstance);
        ppc renderManager = ((WeexMUSInstance) this.f28985a).getRenderManager();
        if (renderManager == null) {
            return null;
        }
        return renderManager.b(i);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void fireEvent(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b5af8e", new Object[]{this, new Integer(i), str, jSONObject});
        } else {
            this.f28985a.dispatchEvent(WeexEventTarget.convertWeexEvent(i), str, WeexValueImpl.ofJSON(jSONObject));
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void fireEventOnNode(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93cda2f", new Object[]{this, new Integer(i), str, jSONObject});
        } else {
            this.f28985a.dispatchNodeEvent(i, str, WeexValueImpl.ofJSON(jSONObject));
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void fireGlobalEvent(String str, Object... objArr) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f2457f", new Object[]{this, str, objArr});
            return;
        }
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        WeexValue[] weexValueArr = new WeexValue[i];
        for (int i2 = 0; i2 < i; i2++) {
            weexValueArr[i2] = WeexValueImpl.convert(objArr[i2]);
        }
        this.f28985a.legacyFireGlobalEvent(str, weexValueArr);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void fireNativeEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc7cdc8", new Object[]{this, str, str2});
        } else {
            ((p6x) this.f28985a.getExtend(p6x.class)).fireNativeEvent(str, str2);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void forceBeginFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6556496", new Object[]{this});
        }
    }

    public void g(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1207338", new Object[]{this, weexInstance});
            return;
        }
        this.f28985a = (WeexInstanceImpl) weexInstance;
        l();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public apc getActivityNav() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (apc) ipChange.ipc$dispatch("b9c3f7e0", new Object[]{this});
        }
        return r3x.j();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public egb getApmGenerator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (egb) ipChange.ipc$dispatch("2c35f100", new Object[]{this});
        }
        f9x.a(false);
        return null;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public rvh getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rvh) ipChange.ipc$dispatch("b4fd1c45", new Object[]{this});
        }
        return this.b;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public int getCurrentPhase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2433a72", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public Object getExecuteContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ee72d21b", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public String getExtConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31aafb82", new Object[]{this, str});
        }
        f9x.a(false);
        return "";
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public Set<String> getExtConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("cda1e6bc", new Object[]{this});
        }
        f9x.a(false);
        return null;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public Map<String, Object> getExtEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4554bfe", new Object[]{this});
        }
        f9x.a(false);
        return null;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public hpc getImageAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hpc) ipChange.ipc$dispatch("c73ca0e2", new Object[]{this});
        }
        return r3x.i();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public MUSInstanceConfig getInstanceConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSInstanceConfig) ipChange.ipc$dispatch("fb09c49f", new Object[]{this});
        }
        return this.s;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public String getInstanceEnv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("921bf50d", new Object[]{this, str});
        }
        if ("bundleUrl".equals(str)) {
            return this.f28985a.getBundleUrl();
        }
        WeexValue instanceEnv = this.f28985a.getInstanceEnv(str);
        if (instanceEnv == null) {
            return "";
        }
        if (instanceEnv.isString()) {
            return instanceEnv.getString();
        }
        return instanceEnv.toStringValue();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public Set<String> getInstanceEnvs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("af38d3c7", new Object[]{this});
        }
        f9x.a(false);
        return null;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public int getInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd985600", new Object[]{this})).intValue();
        }
        return this.f28985a.getInstanceId();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public Map<String, Object> getInstanceTags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5acbf240", new Object[]{this});
        }
        return this.f28985a.getInstanceTags();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public Map<String, Object> getJSBridgeEnv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("378ce8cb", new Object[]{this, str});
        }
        return super.getJSBridgeEnv(str);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public String getJustCreateTagName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e27e6ef2", new Object[]{this});
        }
        return super.getJustCreateTagName();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public MUSModule getModule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSModule) ipChange.ipc$dispatch("1620ed62", new Object[]{this, str});
        }
        return (MUSModule) ((HashMap) this.g).get(str);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public MUSMonitor getMonitor() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSMonitor) ipChange.ipc$dispatch("80fd497a", new Object[]{this});
        }
        if (this.f28985a.getExtend(p6x.class) != null) {
            z = true;
        }
        f9x.a(z);
        return ((p6x) this.f28985a.getExtend(p6x.class)).d();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public com.taobao.android.weex_framework.c getMonitorInfo() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.c) ipChange.ipc$dispatch("aab03e93", new Object[]{this});
        }
        if (this.f28985a.getExtend(p6x.class) != null) {
            z = true;
        }
        f9x.a(z);
        return ((p6x) this.f28985a.getExtend(p6x.class)).getMonitorInfo();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public long getNativePtr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("755f1c9c", new Object[]{this})).longValue();
        }
        f9x.a(false);
        return 0L;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public String getNativeState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d706e02b", new Object[]{this, str});
        }
        return ((p6x) this.f28985a.getExtend(p6x.class)).getNativeState(str);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public String getOriginURLString() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5feb1d5", new Object[]{this});
        }
        if (this.f28985a != null) {
            z = true;
        }
        f9x.a(z);
        return this.f28985a.getOriginURLString();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public double getPerformance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4037490", new Object[]{this, new Integer(i)})).doubleValue();
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public HashMap<String, String> getPerformanceInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2afa2f2", new Object[]{this});
        }
        return ((q6x) this.f28985a.getExtend(q6x.class)).g();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public xid getRenderComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xid) ipChange.ipc$dispatch("7a2293cc", new Object[]{this});
        }
        return ((x8x) ((q6x) this.f28985a.getExtend(q6x.class))).f();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public npc getRenderListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (npc) ipChange.ipc$dispatch("426240f6", new Object[]{this});
        }
        return this.i;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public ppc getRenderManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppc) ipChange.ipc$dispatch("5863c127", new Object[]{this});
        }
        f9x.a(this.f28985a instanceof WeexMUSInstance);
        return ((WeexMUSInstance) this.f28985a).getRenderManager();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public View getRenderRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("220b9e17", new Object[]{this});
        }
        return this.f28985a.getRootView();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public View getRenderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("16d4539a", new Object[]{this});
        }
        return ((q6x) this.f28985a.getExtend(q6x.class)).getRenderView();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public int getRootHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b682199", new Object[]{this})).intValue();
        }
        return this.k;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public int getRootWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe7d98c8", new Object[]{this})).intValue();
        }
        return this.l;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public float getRpxPerRem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d90bde18", new Object[]{this})).floatValue();
        }
        return this.r;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public Object getTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d763d7dd", new Object[]{this, str});
        }
        return this.f28985a.getTag(str);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public Object getToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b2cfc928", new Object[]{this});
        }
        return this.t;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public Context getUIContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6bf62ae4", new Object[]{this});
        }
        return this.b.a();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public WMInstanceApm getWeexInstanceApm() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WMInstanceApm) ipChange.ipc$dispatch("dbd823d2", new Object[]{this});
        }
        v3x v3xVar = (v3x) this.f28985a.getExtend(v3x.class);
        if (v3xVar != null) {
            z = true;
        }
        f9x.a(z);
        return v3xVar.c();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public fpc getWorkHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fpc) ipChange.ipc$dispatch("395d301", new Object[]{this});
        }
        if (this.q == null) {
            this.q = new c(this, this.f28985a.getJSThreadHandler());
        }
        return this.q;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void goBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bc6f6", new Object[]{this});
        } else {
            this.f28985a.goBack();
        }
    }

    public WeexValue h(String str, String str2, WeexValue[] weexValueArr) {
        MUSValue[] mUSValueArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("8cfdb403", new Object[]{this, str, str2, weexValueArr});
        }
        if (TextUtils.isEmpty(str2)) {
            dwh.u(this, "[MUSDKInstance] callModuleMethod methodName is empty");
            return null;
        }
        if (weexValueArr != null) {
            mUSValueArr = new MUSValue[weexValueArr.length];
            for (int i = 0; i < weexValueArr.length; i++) {
                if (weexValueArr[i].getType() == WeexValue.Type.FUNCTION) {
                    mUSValueArr[i] = MUSValue.ofFunction(weexValueArr[i].getFunctionID());
                } else if (weexValueArr[i].getValue() == null) {
                    mUSValueArr[i] = null;
                } else {
                    mUSValueArr[i] = ((WeexValueImpl) weexValueArr[i]).convertMUSValue();
                }
            }
        } else {
            mUSValueArr = null;
        }
        Object a2 = gwh.a(this, str, str2, mUSValueArr, this.e);
        if (a2 == null) {
            return null;
        }
        return WeexValueImpl.convert(a2);
    }

    public Map<String, MUSModule> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9eb22f8d", new Object[]{this});
        }
        return this.g;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void init(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cfb90e", new Object[]{this, map});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void initWithData(byte[] bArr, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4665cb9", new Object[]{this, bArr, uri});
        } else {
            this.f28985a.initWithData(bArr, uri.toString());
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void initWithURL(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34a3da7", new Object[]{this, uri});
            return;
        }
        this.f28985a.updateBundleUrl(uri.toString());
        this.f28985a.initWithURL(uri.toString());
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void inspect(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1215a5", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void invokeCallback(int i, MUSValue[] mUSValueArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f797b1", new Object[]{this, new Integer(i), mUSValueArr, new Boolean(z)});
        } else {
            this.f28985a.invokeCallback(i, s3x.a(mUSValueArr), z);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void invokeCallbackSync(int i, MUSValue[] mUSValueArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31a5396", new Object[]{this, new Integer(i), mUSValueArr, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        return this.f28985a.isDestroyed();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isDisplayed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("331b7fe2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isIncremental() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47f8f0db", new Object[]{this})).booleanValue();
        }
        f9x.a(this.f28985a instanceof WeexMUSInstance);
        return ((WeexMUSInstance) this.f28985a).isIncremental();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public boolean isInvalid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73123f78", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isNativeDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2d629c3", new Object[]{this})).booleanValue();
        }
        f9x.a(false);
        return false;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isPreciseExpose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7a92b00", new Object[]{this})).booleanValue();
        }
        f9x.a(this.f28985a instanceof WeexMUSInstance);
        return ((WeexMUSInstance) this.f28985a).isPreciseExpose();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isPrepared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59e1a492", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public boolean isRenderCalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("130e3d08", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public boolean isUIReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97cd8510", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isUnicornRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("215e71cf", new Object[]{this})).booleanValue();
        }
        f9x.a(false);
        return false;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isUseExternalHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2a8bacd", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isWeexInstanceAdaptor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c77fcc70", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public WeexInstance j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("e85302a1", new Object[]{this});
        }
        return this.f28985a;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("176e5826", new Object[]{this});
        } else if (this.h == null) {
            a aVar = new a();
            this.h = aVar;
            this.f28985a.addInstanceListener(aVar);
        }
    }

    public final void m(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1066b6a4", new Object[]{this, new Float(f)});
        } else {
            this.r = f;
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void offScreenRendering() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc4db218", new Object[]{this});
        } else {
            ((q6x) this.f28985a.getExtend(q6x.class)).offScreenRendering();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        } else {
            this.f28985a.onActivityPause();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.f28985a.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        } else {
            this.f28985a.onActivityResume();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
        } else {
            this.f28985a.onActivityStart();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        } else {
            this.f28985a.onActivityStop();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void onPreRendering(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdc67cf", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            ((q6x) this.f28985a.getExtend(q6x.class)).b(i, i2);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void onScreenRendering() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c11ba8", new Object[]{this});
        } else {
            ((q6x) this.f28985a.getExtend(q6x.class)).onScreenRendering();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void onViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
        } else {
            this.f28985a.onViewAppear();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void onViewDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
        } else {
            this.f28985a.onViewDisappear();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void postTaskToJs(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32dbb8e", new Object[]{this, runnable});
        } else {
            getWorkHandler().post(runnable);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void postTaskToMain(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b473fe", new Object[]{this, runnable});
        } else {
            this.f.post(runnable);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void postTaskToMainDelay(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735acd95", new Object[]{this, runnable, new Long(j)});
        } else {
            this.f.postDelayed(runnable, j);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void prepare(byte[] bArr, Map<String, Object> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3355c790", new Object[]{this, bArr, map});
            return;
        }
        p6x p6xVar = (p6x) this.f28985a.getExtend(p6x.class);
        if (p6xVar != null) {
            str = p6xVar.getMonitorInfo().n();
        } else {
            str = "<default>";
        }
        this.f28985a.initWithData(bArr, str);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void prepareSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263a0b83", new Object[]{this});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void refresh(JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa198877", new Object[]{this, jSONObject, map});
        } else {
            this.f28985a.render(WeexValueImpl.ofJSON(jSONObject));
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void refreshFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a568756d", new Object[]{this, new Integer(i), str});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void refreshPixelCheckTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951fff51", new Object[]{this});
        } else {
            ((q6x) this.f28985a.getExtend(q6x.class)).e();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void refreshSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b915592f", new Object[]{this});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void register(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea7341c", new Object[]{this, jSONArray, str});
            return;
        }
        f9x.a(this.f28985a instanceof WeexScriptOnlyInstance);
        ((WeexScriptOnlyInstance) this.f28985a).register(jSONArray, str);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void registerCSSRule(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d00f83", new Object[]{this, str, jSONObject});
            return;
        }
        WeexInstanceImpl weexInstanceImpl = this.f28985a;
        if (weexInstanceImpl instanceof WeexDOMInstance) {
            ((WeexDOMInstance) weexInstanceImpl).registerCSSRuleInJSThread(str, WeexValueImpl.ofJSON(jSONObject));
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void registerExecuteListener(dpc dpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9de27e9", new Object[]{this, dpcVar});
            return;
        }
        this.j = dpcVar;
        l();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void registerJSBindingPlugin(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabbbdb", new Object[]{this, new Long(j), str});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void registerJSPlugin(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bcfc9a", new Object[]{this, str, str2});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void registerNativeEventCallback(String str, a.AbstractC0518a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a2a1e3", new Object[]{this, str, aVar});
        } else {
            ((p6x) this.f28985a.getExtend(p6x.class)).registerNativeEventCallback(str, aVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void registerNativeStateListener(String str, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a201246", new Object[]{this, str, bVar});
        } else {
            ((p6x) this.f28985a.getExtend(p6x.class)).b(str, bVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void registerRenderComponentListener(MUSDKInstance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73bf1a3", new Object[]{this, aVar});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void registerRenderListener(npc npcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6c18db", new Object[]{this, npcVar});
            return;
        }
        this.i = npcVar;
        l();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void registerReportInfoListener(ade adeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6768198d", new Object[]{this, adeVar});
            return;
        }
        WeexInstanceImpl weexInstanceImpl = this.f28985a;
        if (weexInstanceImpl != null && weexInstanceImpl.getExtend(q6x.class) != null) {
            ((q6x) this.f28985a.getExtend(q6x.class)).registerReportInfoListener(adeVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void reloadSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab567b1", new Object[]{this});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void removeEventListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc5d65b", new Object[]{this, str});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void removeNativeEventCallback(String str, a.AbstractC0518a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebf5644", new Object[]{this, str, aVar});
        } else {
            ((p6x) this.f28985a.getExtend(p6x.class)).a(str, aVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void removeRenderListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f756cf95", new Object[]{this});
        } else {
            this.i = null;
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void removeTaskFromMain(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df83d951", new Object[]{this, runnable});
        } else {
            this.f.removeCallbacks(runnable);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void render(JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2436dfb2", new Object[]{this, jSONObject, map});
            return;
        }
        this.o = true;
        this.n = false;
        this.f28985a.render(WeexValueImpl.ofJSON(jSONObject));
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void renderByUrl(String str, String str2, JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44053652", new Object[]{this, str, str2, jSONObject, map});
            return;
        }
        this.f28985a.updateBundleUrl(str2);
        this.f28985a.initWithURL(str);
        this.f28985a.render(WeexValueImpl.ofJSON(jSONObject));
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void renderFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a8369d2", new Object[]{this, new Integer(i), str});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void renderSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa7b794", new Object[]{this});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void reportErrorToExceptionManager(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de337ecd", new Object[]{this, new Integer(i), str, str2, str3});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void reportFatalError(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc6b6e", new Object[]{this, new Integer(i), str});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void reportJsException(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c982b4", new Object[]{this, new Integer(i), str});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
        } else {
            this.f28985a.resetContext(context);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean resetCorePropsOnPreInit(kpc kpcVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f5427f6", new Object[]{this, kpcVar, context})).booleanValue();
        }
        f9x.a(false);
        return false;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void scrollToDecelerate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c3c958", new Object[]{this, new Integer(i)});
        } else {
            ((q6x) this.f28985a.getExtend(q6x.class)).scrollToDecelerate(i);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void sendInstanceMessage(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb28ea35", new Object[]{this, str, jSONObject});
            return;
        }
        WeexInstanceImpl weexInstanceImpl = this.f28985a;
        if (weexInstanceImpl instanceof WeexMUSInstance) {
            ((WeexMUSInstance) weexInstanceImpl).sendInstanceMessage(pg1.ATOM_EXT_window, str, jSONObject);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void setConstrainedSize(kq2 kq2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c63e61", new Object[]{this, kq2Var});
        } else {
            this.f28985a.updateContainerSize(kq2Var.b(), kq2Var.a());
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void setExecuteContext(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb291f", new Object[]{this, obj});
        } else {
            this.f28985a.getJSThreadHandler().post(new b(obj));
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setExecuteContextInternal(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a098e43c", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setForceQuickJS(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11e4b40", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void setGestureConsumptionView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1261d72", new Object[]{this, view});
        } else {
            ((q6x) this.f28985a.getExtend(q6x.class)).setGestureConsumptionView(view);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void setGestureEventListener(pce pceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c815e890", new Object[]{this, pceVar});
        } else {
            ((q6x) this.f28985a.getExtend(q6x.class)).setGestureEventListener(pceVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void setGestureStateListener(w6a w6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41769c1", new Object[]{this, w6aVar});
        } else {
            ((q6x) this.f28985a.getExtend(q6x.class)).setGestureStateListener(w6aVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setIgnoreWhiteScreenReport(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89084b38", new Object[]{this, new Boolean(z)});
            return;
        }
        q6x q6xVar = (q6x) this.f28985a.getExtend(q6x.class);
        if (q6xVar != null) {
            q6xVar.j(z);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setJSBridgeEnv(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc573cbb", new Object[]{this, str, map});
        } else {
            super.setJSBridgeEnv(str, map);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setJustCreateTagName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ace772c", new Object[]{this, str});
        } else {
            super.setJustCreateTagName(str);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void setMonitorDetailDims(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6eebaf", new Object[]{this, str, str2});
        } else {
            ((p6x) this.f28985a.getExtend(p6x.class)).setMonitorDetailDims(str, str2);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void setMonitorDetailTime(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1117f61d", new Object[]{this, str, new Long(j)});
        } else {
            ((p6x) this.f28985a.getExtend(p6x.class)).setMonitorDetailTime(str, j);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setRenderManager(ppc ppcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a305f555", new Object[]{this, ppcVar});
            return;
        }
        f9x.a(this.f28985a instanceof WeexMUSInstance);
        ((WeexMUSInstance) this.f28985a).setRenderManager(ppcVar);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setRootHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18731f91", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setRootNode(INode iNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf382d0", new Object[]{this, iNode});
            return;
        }
        f9x.a(this.f28985a instanceof WeexMUSInstance);
        ((WeexMUSInstance) this.f28985a).setRootNode(iNode);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setRootWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992c5cda", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void setScrollEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        } else {
            ((q6x) this.f28985a.getExtend(q6x.class)).setScrollEnabled(z);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void setTag(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8389e805", new Object[]{this, str, obj});
        } else {
            this.f28985a.setTag(str, obj);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void setWeexScrollListener(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c526017", new Object[]{this, ddeVar});
        } else {
            ((q6x) this.f28985a.getExtend(q6x.class)).setWeexScrollListener(ddeVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void stopPixelCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5969124b", new Object[]{this});
        } else {
            ((q6x) this.f28985a.getExtend(q6x.class)).d();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void switchToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58790d64", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean switchToForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1270efd", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void unregisterNativeStateListener(String str, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838ec55f", new Object[]{this, str, bVar});
        } else {
            ((p6x) this.f28985a.getExtend(p6x.class)).c(str, bVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void updateBaseFontSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc2000f", new Object[]{this, new Float(f)});
            return;
        }
        m(f);
        this.f28985a.updateBaseFontSize(f);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void updateContainerSize(float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c562c0f4", new Object[]{this, new Float(f), new Float(f2), new Boolean(z)});
        } else {
            this.f28985a.updateContainerSize(f, f2);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void updateNativeState(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("820dbf4c", new Object[]{this, str, str2});
        } else {
            ((p6x) this.f28985a.getExtend(p6x.class)).updateNativeState(str, str2);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void updateViewport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe86196", new Object[]{this});
        } else {
            ((q6x) this.f28985a.getExtend(q6x.class)).updateViewport();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean useDomAPI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("980b06ea", new Object[]{this})).booleanValue();
        }
        return this.s.F();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean useXRAPI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fffa4", new Object[]{this})).booleanValue();
        }
        return this.s.G();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void dispatchEvent(String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867d29fe", new Object[]{this, str, mUSValue});
            return;
        }
        f9x.a(this.f28985a instanceof WeexScriptOnlyInstance);
        ((WeexScriptOnlyInstance) this.f28985a).legacyDispatchEvent(str, mUSValue == null ? null : mUSValue.convertWeex());
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void executeScript(byte[] bArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e1cba42", new Object[]{this, bArr, str, str2});
        } else {
            f9x.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void fireEventOnNode(int i, String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5f1e85", new Object[]{this, new Integer(i), str, jSONObject, new Boolean(z)});
        } else {
            this.f28985a.dispatchNodeEvent(i, str, WeexValueImpl.ofJSON(jSONObject));
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void updateContainerSize(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd13ade0", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.f28985a.updateContainerSize(f, f2);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.a
    public void sendInstanceMessage(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43bc3a6b", new Object[]{this, str, str2, jSONObject});
            return;
        }
        WeexInstanceImpl weexInstanceImpl = this.f28985a;
        if (weexInstanceImpl instanceof WeexMUSInstance) {
            ((WeexMUSInstance) weexInstanceImpl).sendInstanceMessage(str, str2, jSONObject);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public Map<String, String> getInstanceEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bfb868de", new Object[]{this});
        }
        f9x.a(false);
        return null;
    }
}
