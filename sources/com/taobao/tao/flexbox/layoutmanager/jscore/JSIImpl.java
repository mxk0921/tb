package com.taobao.tao.flexbox.layoutmanager.jscore;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.taobao.windvane.extra.jsi.JsiMode;
import android.taobao.windvane.extra.jsi.WVJsi;
import com.alibaba.jsi.standard.JSEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.dqf;
import tb.esf;
import tb.ig8;
import tb.jb1;
import tb.kqf;
import tb.ksf;
import tb.oqf;
import tb.pg1;
import tb.spf;
import tb.tfs;
import tb.upf;
import tb.uqf;
import tb.vl8;
import tb.ye8;
import tb.ypf;
import tb.yrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class JSIImpl implements com.taobao.tao.flexbox.layoutmanager.jscore.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ThreadLocal<b> threadLocalEngine = new ThreadLocal<>();
    private yrf $ac;
    private oqf _cFunction;
    private yrf console;
    private oqf dispatch;
    private ye8 engineScope;
    private boolean isQuickJS;
    private dqf jsContext;
    private TNodeJSCore jsCore;
    private JSEngine jsEngine;
    private oqf logFunction;
    private oqf loggerFunction;
    private oqf nanoFunction;
    private oqf register;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends vl8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 32085932) {
                return new Boolean(super.onUncaughtJSException((dqf) objArr[0], (kqf) objArr[1], ((Number) objArr[2]).intValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/jscore/JSIImpl$1");
        }

        @Override // tb.vl8
        public boolean onUncaughtJSException(dqf dqfVar, kqf kqfVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1e997ac", new Object[]{this, dqfVar, kqfVar, new Integer(i)})).booleanValue();
            }
            JSIImpl.access$300(JSIImpl.this, dqfVar, kqfVar, i);
            return super.onUncaughtJSException(dqfVar, kqfVar, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSEngine f12294a;
        public final ye8 b;
        public final boolean c;

        public b(JSEngine jSEngine, ye8 ye8Var, boolean z) {
            this.f12294a = jSEngine;
            this.b = ye8Var;
            this.c = z;
        }

        public static /* synthetic */ JSEngine a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSEngine) ipChange.ipc$dispatch("ff511bf8", new Object[]{bVar});
            }
            return bVar.f12294a;
        }

        public static /* synthetic */ ye8 b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ye8) ipChange.ipc$dispatch("bd83ebf8", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4cd3c49a", new Object[]{bVar})).booleanValue();
            }
            return bVar.c;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c extends ypf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TNodeJSCore> f12295a;

        public c(TNodeJSCore tNodeJSCore) {
            this.f12295a = new WeakReference<>(tNodeJSCore);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/jscore/JSIImpl$LogJSCallback");
        }

        @Override // tb.ypf
        public ksf onCallFunction(jb1 jb1Var) {
            TNodeJSCore tNodeJSCore;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ksf) ipChange.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
            }
            if (jb1Var.b() <= 0 || (tNodeJSCore = this.f12295a.get()) == null) {
                return null;
            }
            ksf c = jb1Var.c(0);
            tNodeJSCore.l(4, JSIImpl.access$500(c, jb1Var.d()));
            c.delete();
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d extends ypf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TNodeJSCore> f12296a;

        public d(TNodeJSCore tNodeJSCore) {
            this.f12296a = new WeakReference<>(tNodeJSCore);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/jscore/JSIImpl$LoggerJSCallback");
        }

        @Override // tb.ypf
        public ksf onCallFunction(jb1 jb1Var) {
            TNodeJSCore tNodeJSCore;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ksf) ipChange.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
            }
            if (jb1Var.b() <= 1 || (tNodeJSCore = this.f12296a.get()) == null) {
                return null;
            }
            ksf c = jb1Var.c(0);
            ksf c2 = jb1Var.c(1);
            tNodeJSCore.l(TNodeJSCore.p(JSIImpl.access$400(c)), JSIImpl.access$500(c2, jb1Var.d()));
            c.delete();
            c2.delete();
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e extends ypf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TNodeJSCore.AC> f12297a;

        public e(TNodeJSCore.AC ac) {
            this.f12297a = new WeakReference<>(ac);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/jscore/JSIImpl$NanoJSCallback");
        }

        @Override // tb.ypf
        public ksf onCallFunction(jb1 jb1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ksf) ipChange.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
            }
            TNodeJSCore.AC ac = this.f12297a.get();
            if (ac != null) {
                return new uqf(ac._nanotime());
            }
            return new uqf(0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f extends ypf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TNodeJSCore.AC> f12298a;

        public f(TNodeJSCore.AC ac) {
            this.f12298a = new WeakReference<>(ac);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/jscore/JSIImpl$_cJSCallback");
        }

        @Override // tb.ypf
        public ksf onCallFunction(jb1 jb1Var) {
            TNodeJSCore.AC ac;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ksf) ipChange.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
            }
            if (jb1Var.b() <= 0 || (ac = this.f12298a.get()) == null) {
                return null;
            }
            ksf c = jb1Var.c(0);
            ac._c(JSIImpl.access$500(c, jb1Var.d()));
            c.delete();
            return null;
        }
    }

    public JSIImpl(TNodeJSCore tNodeJSCore) {
        this.jsCore = tNodeJSCore;
    }

    public static /* synthetic */ void access$300(JSIImpl jSIImpl, dqf dqfVar, kqf kqfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6c1db4", new Object[]{jSIImpl, dqfVar, kqfVar, new Integer(i)});
        } else {
            jSIImpl.reportJSErrorFromJSI(dqfVar, kqfVar, i);
        }
    }

    public static /* synthetic */ int access$400(ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("357b1635", new Object[]{ksfVar})).intValue();
        }
        return convertInt(ksfVar);
    }

    public static /* synthetic */ String access$500(ksf ksfVar, dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ad76a34", new Object[]{ksfVar, dqfVar});
        }
        return convertToString(ksfVar, dqfVar);
    }

    private static int convertInt(ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("881a2fed", new Object[]{ksfVar})).intValue();
        }
        if (ksfVar instanceof uqf) {
            return ((uqf) ksfVar).u();
        }
        return 0;
    }

    private static String convertToString(ksf ksfVar, dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b62cb03e", new Object[]{ksfVar, dqfVar});
        }
        if (ksfVar.o()) {
            return ksfVar.t(dqfVar);
        }
        if (ksfVar.i()) {
            return String.valueOf(((upf) ksfVar).v());
        }
        if (ksfVar.m()) {
            return String.valueOf(((uqf) ksfVar).w());
        }
        return "unknown value";
    }

    private static ksf createEnvJSObject(dqf dqfVar, ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("630fa67f", new Object[]{dqfVar, ksfVar});
        }
        yrf yrfVar = new yrf(dqfVar);
        yrfVar.J(dqfVar, "env", ksfVar);
        return yrfVar;
    }

    private WVJsi.InstanceResult createJSEngine(String str, String str2, JsiMode jsiMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVJsi.InstanceResult) ipChange.ipc$dispatch("684d90b0", new Object[]{this, str, str2, jsiMode});
        }
        return WVJsi.instanceBuilder(o.J()).name(str).version(str2).mode(jsiMode).bizName("tnode").build();
    }

    private static ksf createJSObject(dqf dqfVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("9ba790df", new Object[]{dqfVar, obj});
        }
        if (obj instanceof Number) {
            if ((obj instanceof Float) || (obj instanceof Double) || (obj instanceof Long)) {
                return new uqf(((Number) obj).doubleValue());
            }
            return new uqf(((Number) obj).intValue());
        } else if (obj instanceof Boolean) {
            return new upf(((Boolean) obj).booleanValue());
        } else {
            if (obj instanceof String) {
                return new esf((String) obj);
            }
            if (obj instanceof Map) {
                yrf yrfVar = new yrf(dqfVar);
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    ksf createJSObject = createJSObject(dqfVar, entry.getValue());
                    if (createJSObject != null) {
                        yrfVar.J(dqfVar, (String) entry.getKey(), createJSObject);
                        createJSObject.delete();
                    }
                }
                return yrfVar;
            } else if (!(obj instanceof List)) {
                return null;
            } else {
                List list = (List) obj;
                spf spfVar = new spf(dqfVar, list.size());
                for (int i = 0; i < list.size(); i++) {
                    ksf createJSObject2 = createJSObject(dqfVar, list.get(i));
                    if (createJSObject2 != null) {
                        spfVar.I(dqfVar, i, createJSObject2);
                        createJSObject2.delete();
                    }
                }
                return spfVar;
            }
        }
    }

    private void initJsVariant() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06af253", new Object[]{this});
        } else if (this.$ac == null) {
            yrf p = this.jsContext.p();
            this.$ac = (yrf) p.y(this.jsContext, "$ac");
            this.console = (yrf) p.y(this.jsContext, "console");
            this.dispatch = (oqf) this.$ac.y(this.jsContext, "dispatch");
            this.register = (oqf) this.$ac.y(this.jsContext, "register");
            p.delete();
        }
    }

    private String parseFromError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab90518f", new Object[]{this, new Integer(i)});
        }
        switch (i) {
            case 1:
                return "execute js error";
            case 2:
                return "function call error";
            case 3:
                return "new instance error";
            case 4:
                return "execute js timer error";
            case 5:
                return "execute js promise error";
            case 6:
                return "jsobject get error";
            case 7:
                return "jsobject set error";
            case 8:
                return "wasm module make error";
            case 9:
                return "wasm function call error";
            case 10:
                return "wasm instance make error";
            case 11:
                return "other api call error";
            case 12:
                return "JSI internal error";
            default:
                return "js error";
        }
    }

    private void reportJSErrorFromJSI(dqf dqfVar, kqf kqfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a4d3d61", new Object[]{this, dqfVar, kqfVar, new Integer(i)});
            return;
        }
        String parseFromError = parseFromError(i);
        String b2 = kqfVar.b(dqfVar);
        String d2 = kqfVar.d(dqfVar);
        HashMap hashMap = new HashMap();
        hashMap.put("msg", b2);
        hashMap.put(pg1.ATOM_stack, d2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("name", "js_error");
        hashMap2.put("params", hashMap);
        hashMap2.put("action", parseFromError);
        l.e(this.jsCore.f12299a.s(), hashMap2, this.jsCore.f12299a.s().d0());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.a
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        oqf oqfVar = this._cFunction;
        if (oqfVar != null) {
            oqfVar.N(this.jsContext);
            this._cFunction.w(this.jsContext);
            this._cFunction.delete();
            this._cFunction = null;
        }
        oqf oqfVar2 = this.logFunction;
        if (oqfVar2 != null) {
            oqfVar2.N(this.jsContext);
            this.logFunction.w(this.jsContext);
            this.logFunction.delete();
            this.logFunction = null;
        }
        oqf oqfVar3 = this.loggerFunction;
        if (oqfVar3 != null) {
            oqfVar3.N(this.jsContext);
            this.loggerFunction.w(this.jsContext);
            this.loggerFunction.delete();
            this.loggerFunction = null;
        }
        oqf oqfVar4 = this.nanoFunction;
        if (oqfVar4 != null) {
            oqfVar4.N(this.jsContext);
            this.nanoFunction.w(this.jsContext);
            this.nanoFunction.delete();
            this.nanoFunction = null;
        }
        yrf yrfVar = this.$ac;
        if (yrfVar != null) {
            yrfVar.w(this.jsContext);
            this.$ac.delete();
            this.$ac = null;
        }
        yrf yrfVar2 = this.console;
        if (yrfVar2 != null) {
            yrfVar2.w(this.jsContext);
            this.console.delete();
            this.console = null;
        }
        oqf oqfVar5 = this.dispatch;
        if (oqfVar5 != null) {
            oqfVar5.N(this.jsContext);
            this.dispatch.w(this.jsContext);
            this.dispatch.delete();
            this.dispatch = null;
        }
        oqf oqfVar6 = this.register;
        if (oqfVar6 != null) {
            oqfVar6.N(this.jsContext);
            this.register.w(this.jsContext);
            this.register.delete();
            this.register = null;
        }
        dqf dqfVar = this.jsContext;
        if (dqfVar != null) {
            this.jsEngine.removeContext(dqfVar);
            this.jsContext.b();
            this.jsContext = null;
        }
        if (this.jsEngine.getContextCount() == 0) {
            this.engineScope.c();
            this.engineScope = null;
            this.jsEngine.dispose();
            this.jsEngine = null;
            threadLocalEngine.remove();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.a
    public void dispatchJS(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d52d94", new Object[]{this, str});
            return;
        }
        initJsVariant();
        ksf[] ksfVarArr = {new esf(str)};
        this.dispatch.M(this.jsContext, this.$ac, ksfVarArr);
        ksfVarArr[0].delete();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.a
    public void executeJS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d26399", new Object[]{this, str, str2});
            return;
        }
        ksf c2 = this.jsContext.c(str, str2);
        if (c2 != null) {
            c2.delete();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.a
    public boolean initJSCore(com.taobao.tao.flexbox.layoutmanager.ac.d dVar, Handler handler) {
        WVJsi.InstanceResult instanceResult;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe6e3535", new Object[]{this, dVar, handler})).booleanValue();
        }
        b bVar = threadLocalEngine.get();
        if (bVar == null) {
            String str = "tnode:" + Thread.currentThread();
            if (Build.VERSION.SDK_INT != 35 || !akt.p2("forceQuickJS", false)) {
                instanceResult = createJSEngine(str, "1.0", JsiMode.V8);
                if (instanceResult == null || !instanceResult.isSuccess()) {
                    instanceResult = createJSEngine(str, "1.0", JsiMode.QJS);
                    z = true;
                }
                z = false;
            } else {
                instanceResult = createJSEngine(str, "1.0", JsiMode.QJS);
                if (instanceResult == null || !instanceResult.isSuccess()) {
                    instanceResult = createJSEngine(str, "1.0", JsiMode.V8);
                    z = false;
                }
                z = true;
            }
            if (instanceResult != null && instanceResult.isSuccess()) {
                JSEngine jsEngine = instanceResult.getJsEngine();
                b bVar2 = new b(jsEngine, new ye8(jsEngine), z);
                threadLocalEngine.set(bVar2);
                tfs.e("TNodeJS", "use quickJS " + z);
                bVar = bVar2;
            }
        }
        if (bVar != null) {
            this.jsEngine = b.a(bVar);
            this.engineScope = b.b(bVar);
            this.isQuickJS = b.c(bVar);
        }
        if (this.jsEngine != null && this.engineScope != null) {
            return true;
        }
        tfs.e("TNodeJS", "初始化JSI引擎失败");
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.a
    public void initJSContext(Context context, TNodeJSCore tNodeJSCore, String str, TNodeJSCore.AC ac, String str2) {
        yrf yrfVar;
        yrf yrfVar2;
        ksf ksfVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20d2e53", new Object[]{this, context, tNodeJSCore, str, ac, str2});
            return;
        }
        dqf createContext = this.jsEngine.createContext(str2);
        this.jsContext = createContext;
        createContext.y(new a());
        try {
            ksf c2 = this.jsContext.c(str, "tnode.js");
            ksf createJSObject = createJSObject(this.jsContext, ig8.d(context));
            ksf createEnvJSObject = createEnvJSObject(this.jsContext, createJSObject);
            ksf[] ksfVarArr = {createEnvJSObject, createEnvJSObject};
            yrf yrfVar3 = (yrf) ((oqf) c2).M(this.jsContext, c2, ksfVarArr);
            createJSObject.delete();
            ksfVarArr[0].delete();
            ksfVarArr[1].delete();
            if (this.isQuickJS) {
                yrfVar2 = this.jsContext.p();
                yrfVar = (yrf) yrfVar2.y(this.jsContext, pg1.ATOM_Function);
                ksfVar = yrfVar.y(this.jsContext, pg1.ATOM_prototype);
            } else {
                yrfVar2 = null;
                yrfVar = null;
                ksfVar = null;
            }
            oqf oqfVar = new oqf(this.jsContext, new f(ac), "_c");
            this._cFunction = oqfVar;
            if (ksfVar != null) {
                oqfVar.L(this.jsContext, ksfVar);
            }
            yrfVar3.J(this.jsContext, "_c", this._cFunction);
            oqf oqfVar2 = new oqf(this.jsContext, new c(tNodeJSCore), "_log");
            this.logFunction = oqfVar2;
            if (ksfVar != null) {
                oqfVar2.L(this.jsContext, ksfVar);
            }
            yrfVar3.J(this.jsContext, "_log", this.logFunction);
            oqf oqfVar3 = new oqf(this.jsContext, new d(tNodeJSCore), "_logger");
            this.loggerFunction = oqfVar3;
            if (ksfVar != null) {
                oqfVar3.L(this.jsContext, ksfVar);
            }
            yrfVar3.J(this.jsContext, "_logger", this.loggerFunction);
            oqf oqfVar4 = new oqf(this.jsContext, new e(ac), "_nanotime");
            this.nanoFunction = oqfVar4;
            if (ksfVar != null) {
                oqfVar4.L(this.jsContext, ksfVar);
            }
            yrfVar3.J(this.jsContext, "_nanotime", this.nanoFunction);
            if (yrfVar2 != null) {
                yrfVar2.delete();
            }
            if (yrfVar != null) {
                yrfVar.delete();
            }
            if (ksfVar != null) {
                ksfVar.delete();
            }
            yrfVar3.delete();
            c2.delete();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.a
    public boolean applyModule(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0b00b99", new Object[]{this, str, str2})).booleanValue();
        }
        initJsVariant();
        ksf c2 = this.jsContext.c(str2, null);
        if (c2 == null) {
            return false;
        }
        esf esfVar = new esf(str);
        yrf yrfVar = new yrf(this.jsContext);
        upf upfVar = new upf(true);
        yrfVar.J(this.jsContext, "preload", upfVar);
        ksf[] ksfVarArr = {esfVar, c2, yrfVar};
        this.register.M(this.jsContext, this.$ac, ksfVarArr);
        ksfVarArr[0].delete();
        ksfVarArr[1].delete();
        upfVar.delete();
        ksfVarArr[2].delete();
        return true;
    }
}
