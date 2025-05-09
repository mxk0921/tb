package tb;

import com.alibaba.jsi.standard.JNIBridge;
import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hqf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int kEngineJSC = 2;
    public static final int kEngineQJS = 3;
    public static final int kEngineV8 = 1;

    /* renamed from: a  reason: collision with root package name */
    public long f20816a;
    public final boolean c;
    private final String d;
    private final Object e;
    private static final Map<String, Long> h = new HashMap();
    private static final Map<Long, JSEngine> i = new HashMap();
    private static final Object j = new Object();
    private static final AtomicBoolean r = new AtomicBoolean(false);
    private static int s = 1;
    private final ArrayList<dqf> f = new ArrayList<>();
    private final Runnable g = new a(4);
    public boolean b = true;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private int n = 20;
    private final Set<wa7> o = new HashSet();
    private final Object[] p = new Object[6];
    private pe8 q = null;

    static {
        t2o.a(921698318);
    }

    public static /* synthetic */ boolean access$002(hqf hqfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62024e4e", new Object[]{hqfVar, new Boolean(z)})).booleanValue();
        }
        hqfVar.k = z;
        return z;
    }

    public static /* synthetic */ Object access$100(hqf hqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1cd349e7", new Object[]{hqfVar});
        }
        return hqfVar.e;
    }

    public static /* synthetic */ void access$200(hqf hqfVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6483be5e", new Object[]{hqfVar, str, str2});
        } else {
            hqfVar.doStartTrace(str, str2);
        }
    }

    public static /* synthetic */ void access$300(hqf hqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccff3e9", new Object[]{hqfVar});
        } else {
            hqfVar.doStopTrace();
        }
    }

    public static /* synthetic */ void access$400(hqf hqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6478188", new Object[]{hqfVar});
        } else {
            hqfVar.doPrintObjects();
        }
    }

    public static void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[0]);
        } else {
            JNIBridge.nativeCommand(15L, 0L, new Object[]{n4y.j});
        }
    }

    private void doPrintObjects() {
        dqf dqfVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f3f159", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            try {
                Iterator<dqf> it = this.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dqfVar = null;
                        break;
                    }
                    dqfVar = it.next();
                    if (!dqfVar.r()) {
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.o) {
            lwx.c(dqfVar, this.o, this.d, this.n);
        }
    }

    private void doStartTrace(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64edd09", new Object[]{this, str, str2});
            return;
        }
        a0y.g("Starting trace");
        if (!JNIBridge.nativeStartTrace(this.f20816a, str, str2)) {
            a0y.o("Start trace failed!");
        }
    }

    private void doStopTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb0629f", new Object[]{this});
            return;
        }
        a0y.g("Stopping trace");
        JNIBridge.nativeStopTrace(this.f20816a);
    }

    public static boolean enableScriptCoverage(boolean z) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9ce30bb", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        if (1 == JNIBridge.nativeCommand(14L, j2, null)) {
            return true;
        }
        return false;
    }

    public static String getEngineType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d7c59a7", new Object[0]);
        }
        Object engineCmd = Bridge.engineCmd(null, 4, 0L);
        if (engineCmd instanceof String) {
            return (String) engineCmd;
        }
        return null;
    }

    public static JSEngine getInstance(long j2) {
        JSEngine jSEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSEngine) ipChange.ipc$dispatch("a7f60656", new Object[]{new Long(j2)});
        }
        Map<Long, JSEngine> map = i;
        synchronized (map) {
            jSEngine = map.get(Long.valueOf(j2));
        }
        return jSEngine;
    }

    private long getNativeInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("152736f3", new Object[]{this})).longValue();
        }
        Object engineCmd = Bridge.engineCmd(null, 9, 0L);
        if (engineCmd instanceof Long) {
            return ((Long) engineCmd).longValue();
        }
        return 0L;
    }

    public static String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[0]);
        }
        return JNIBridge.nativeGetVersion(null);
    }

    public static int getVersionInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6abd31e7", new Object[0])).intValue();
        }
        return (int) JNIBridge.nativeCommand(3L, 0L, null);
    }

    public static boolean isEngineReady(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b235cc9", new Object[]{new Integer(i2)})).booleanValue();
        }
        return n4y.g(i2);
    }

    public static boolean loadSoImpl(String str, String str2, String str3) {
        boolean j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbdefcb", new Object[]{str, str2, str3})).booleanValue();
        }
        synchronized (j) {
            j2 = n4y.j(str, str2, str3);
        }
        return j2;
    }

    public static int setMaxCacheSize(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bc00ce", new Object[]{new Integer(i2)})).intValue();
        }
        return (int) JNIBridge.nativeCommand(16L, i2, new Object[]{n4y.j});
    }

    public static boolean startRemoteInspect(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3fed341", new Object[]{str})).booleanValue();
        }
        if (JNIBridge.nativeCommand(10L, 0L, new Object[]{str}) == 1) {
            return true;
        }
        return false;
    }

    public static void stopRemoteInspect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f604a093", new Object[0]);
        } else {
            JNIBridge.nativeCommand(11L, 0L, null);
        }
    }

    public static boolean supportMultipleEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51ba422c", new Object[0])).booleanValue();
        }
        if (Bridge.engineCmd(null, 7, 0L) != null) {
            return true;
        }
        return false;
    }

    private boolean syncCall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6953a4", new Object[]{this})).booleanValue();
        }
        if (!this.k || !a0y.q(this.e)) {
            return false;
        }
        return true;
    }

    private static void syncGlobalInfos(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796b2b6a", new Object[]{obj});
        } else if (obj != null && !r.getAndSet(true)) {
            String n = a0y.n(obj);
            String c = a0y.c(obj, n);
            JNIBridge.nativeSetInfo(0L, "app-package", n, 0L);
            JNIBridge.nativeSetInfo(0L, "app-version", c, 0L);
        }
    }

    private void warnThreadNoHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d13c00", new Object[]{this});
            return;
        }
        a0y.m("The creation thread of JSEngine \"" + this.d + "\" do not have a looper!");
    }

    public dqf createContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqf) ipChange.ipc$dispatch("76133d", new Object[]{this, str});
        }
        return createContextImpl(str, null, null);
    }

    public dqf createContextImpl(String str, Object obj, Class<? extends Annotation> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqf) ipChange.ipc$dispatch("472f3fc4", new Object[]{this, str, obj, cls});
        }
        dqf dqfVar = new dqf(str, obj, (JSEngine) this, cls);
        dqfVar.x(new a(6, new Object[]{dqfVar}));
        synchronized (this.f) {
            this.f.add(dqfVar);
        }
        requestLoopAsync(0L);
        return dqfVar;
    }

    public synchronized void dispose(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b24946e", new Object[]{this, new Boolean(z)});
            return;
        }
        for (dqf dqfVar : getContexts()) {
            removeContext(dqfVar);
        }
        if (this.l && this.b) {
            a0y.g("Print java objects at dispose ...");
            doPrintObjects();
        }
        long j2 = this.f20816a;
        this.f20816a = 0L;
        if (!z) {
            JNIBridge.nativeDisposeInstance(j2);
        }
        if (this.l) {
            lwx.e(false);
            this.l = false;
        }
        Map<Long, JSEngine> map = i;
        synchronized (map) {
            h.remove(this.d);
            map.remove(Long.valueOf(j2));
        }
    }

    public dqf getContext(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqf) ipChange.ipc$dispatch("3a92e55d", new Object[]{this, new Long(j2)});
        }
        synchronized (this.f) {
            try {
                Iterator<dqf> it = this.f.iterator();
                while (it.hasNext()) {
                    dqf next = it.next();
                    if (next.i() == j2) {
                        return next;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getContextCount() {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4792fc90", new Object[]{this})).intValue();
        }
        synchronized (this.f) {
            size = this.f.size();
        }
        return size;
    }

    public List<dqf> getContexts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31051686", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.f) {
            try {
                Iterator<dqf> it = this.f.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public int getCurrentEngineType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("371fb739", new Object[]{this})).intValue();
        }
        Object engineCmd = Bridge.engineCmd((JSEngine) this, 6, 0L);
        if (engineCmd instanceof Integer) {
            return ((Integer) engineCmd).intValue();
        }
        return 0;
    }

    public Object getData(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fcb63b76", new Object[]{this, new Integer(i2)});
        }
        Object[] objArr = this.p;
        if (i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public int getDataSlotsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbb81794", new Object[]{this})).intValue();
        }
        return this.p.length;
    }

    public String getEmbedderName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15edce0", new Object[]{this});
        }
        return this.d;
    }

    public pe8 getEventListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pe8) ipChange.ipc$dispatch("45f640b3", new Object[]{this});
        }
        return this.q;
    }

    public long getNativeInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f2d623d", new Object[]{this})).longValue();
        }
        return this.f20816a;
    }

    public boolean isDisposed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue();
        }
        if (this.f20816a == 0) {
            return true;
        }
        return false;
    }

    public void notifyDeleteUnusedObjects(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23a5c3c", new Object[]{this, dqfVar});
        } else if (this.e != null) {
            Runnable e = dqfVar.e();
            a0y.l(this.e, e);
            a0y.d(this.e, e);
        }
    }

    public void objectCreated(wa7 wa7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69cc1e1", new Object[]{this, wa7Var});
        } else if (this.l) {
            synchronized (this.o) {
                this.o.add(wa7Var);
                this.m = true;
            }
        }
    }

    public void objectDeleted(wa7 wa7Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bc9c10", new Object[]{this, wa7Var});
        } else if (this.m) {
            synchronized (this.o) {
                this.o.remove(wa7Var);
                if (this.o.size() == 0) {
                    z = false;
                }
                this.m = z;
            }
        }
    }

    public long onExternalMemoryChange(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61c793f6", new Object[]{this, new Long(j2)})).longValue();
        }
        if (syncCall()) {
            return JNIBridge.nativeCommand(9L, this.f20816a, new Object[]{Long.valueOf(j2)});
        }
        Object obj = this.e;
        if (obj != null) {
            a0y.d(obj, new a(7, new Object[]{Long.valueOf(j2)}));
            return -1L;
        }
        warnThreadNoHandler();
        return -1L;
    }

    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else if (syncCall()) {
            JNIBridge.nativeOnLowMemory(this.f20816a);
        } else {
            Object obj = this.e;
            if (obj != null) {
                a0y.d(obj, new a(5));
            } else {
                warnThreadNoHandler();
            }
        }
    }

    public void printObjects() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688c16ae", new Object[]{this});
        } else if (syncCall()) {
            doPrintObjects();
        } else {
            Object obj = this.e;
            if (obj != null) {
                a0y.d(obj, new a(3));
            } else {
                warnThreadNoHandler();
            }
        }
    }

    public void removeContext(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1353b5d", new Object[]{this, dqfVar});
            return;
        }
        if (!dqfVar.r()) {
            dqfVar.b();
        }
        synchronized (this.f) {
            this.f.remove(dqfVar);
        }
        requestLoopAsync(0L);
    }

    public void requestLoopAsync(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d6ec54", new Object[]{this, new Long(j2)});
            return;
        }
        Object obj = this.e;
        if (obj != null) {
            a0y.l(obj, this.g);
            a0y.e(this.e, this.g, j2);
        }
    }

    public boolean setCodeCache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0399a8", new Object[]{this, str})).booleanValue();
        }
        if (1 == JNIBridge.nativeCommand(13L, getNativeInstance(), new String[]{str})) {
            return true;
        }
        return false;
    }

    public boolean setData(int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f015f90", new Object[]{this, new Integer(i2), obj})).booleanValue();
        }
        Object[] objArr = this.p;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = obj;
        return true;
    }

    public void setEnableStats(boolean z) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45573c53", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.l != z && !isDisposed()) {
            lwx.e(z);
            this.l = z;
        }
        if (!z) {
            synchronized (this.o) {
                this.o.clear();
                this.m = false;
            }
        }
        JSEngine jSEngine = (JSEngine) this;
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        Bridge.engineCmd(jSEngine, 5, j2);
    }

    public void setEventListener(pe8 pe8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b720831", new Object[]{this, pe8Var});
        } else {
            this.q = pe8Var;
        }
    }

    public void setMaxPrintCount(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b45c38", new Object[]{this, new Integer(i2)});
        } else {
            this.n = i2;
        }
    }

    public void startTrace(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9956d1e", new Object[]{this, str, str2});
            return;
        }
        if (str == null) {
            str = "/sdcard/jsi_trace_${pid}_${time}_${index}.json";
        }
        if (str2 == null) {
            str2 = "jsi,v8,v8.compile,disabled-by-default-v8.compile";
        }
        if (syncCall()) {
            doStartTrace(str, str2);
            return;
        }
        Object obj = this.e;
        if (obj != null) {
            a0y.d(obj, new a(1, new Object[]{str, str2}));
        } else {
            warnThreadNoHandler();
        }
    }

    public void stopTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b331456a", new Object[]{this});
        } else if (syncCall()) {
            doStopTrace();
        } else {
            Object obj = this.e;
            if (obj != null) {
                a0y.d(obj, new a(2));
            } else {
                warnThreadNoHandler();
            }
        }
    }

    public static JSEngine createInstanceImpl(Object obj, Map<String, String> map, long j2, Object obj2) {
        String str;
        JSEngine jSEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSEngine) ipChange.ipc$dispatch("77b0d573", new Object[]{obj, map, new Long(j2), obj2});
        }
        String str2 = map.get("name");
        Map<Long, JSEngine> map2 = i;
        synchronized (map2) {
            try {
                Map<String, Long> map3 = h;
                Long l = map3.get(str2);
                if (l == null || l.longValue() == 0 || (jSEngine = map2.get(l)) == null) {
                    JSEngine jSEngine2 = new JSEngine(obj, map, j2, obj2);
                    synchronized (map2) {
                        try {
                            JSEngine jSEngine3 = map2.get(Long.valueOf(jSEngine2.f20816a));
                            if (jSEngine3 != null && (jSEngine3.c || !jSEngine2.c)) {
                                a0y.m("JSEngine '" + str2 + "' (" + jSEngine3.f20816a + ") already created!");
                                str = null;
                                jSEngine2 = jSEngine3;
                            }
                            map3.put(str2, Long.valueOf(jSEngine2.f20816a));
                            map2.put(Long.valueOf(jSEngine2.f20816a), jSEngine2);
                            str = map.get("flags");
                        } finally {
                        }
                    }
                    if (str != null && str.length() > 0) {
                        jSEngine2.b = !str.contains("--disable-print-objects-at-dispose");
                        JNIBridge.nativeSetInfo(jSEngine2.f20816a, "flags", str, 0L);
                    }
                    return jSEngine2;
                }
                a0y.m("Instance '" + str2 + "' already created!");
                return jSEngine;
            } finally {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f20817a;
        private final Object[] b;

        static {
            t2o.a(921698319);
        }

        public a(int i) {
            this.f20817a = i;
            this.b = null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hqf hqfVar = hqf.this;
            hqf.access$002(hqfVar, a0y.q(hqf.access$100(hqfVar)));
            switch (this.f20817a) {
                case 1:
                    hqf hqfVar2 = hqf.this;
                    Object[] objArr = this.b;
                    hqf.access$200(hqfVar2, (String) objArr[0], (String) objArr[1]);
                    return;
                case 2:
                    hqf.access$300(hqf.this);
                    return;
                case 3:
                    hqf.access$400(hqf.this);
                    return;
                case 4:
                    JNIBridge.nativeOnLoop(hqf.this.f20816a);
                    return;
                case 5:
                    JNIBridge.nativeOnLowMemory(hqf.this.f20816a);
                    return;
                case 6:
                    ((dqf) this.b[0]).j().t();
                    return;
                case 7:
                    JNIBridge.nativeCommand(9L, hqf.this.f20816a, this.b);
                    return;
                default:
                    a0y.o("Unknown JSI task " + this.f20817a);
                    return;
            }
        }

        public a(int i, Object[] objArr) {
            this.f20817a = i;
            this.b = objArr;
        }
    }

    public static JSEngine getInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSEngine) ipChange.ipc$dispatch("4e7dce40", new Object[]{str});
        }
        Map<Long, JSEngine> map = i;
        synchronized (map) {
            try {
                Long l = h.get(str);
                if (l == null || l.longValue() == 0) {
                    return null;
                }
                return map.get(l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public hqf(Object obj, Map<String, String> map, long j2, Object obj2) {
        Object obj3;
        this.f20816a = 0L;
        boolean z = j2 == 0;
        this.c = z;
        if (obj != null) {
            n4y.d(obj);
        }
        String str = map.get("name");
        this.d = str;
        if (obj2 == null) {
            obj3 = a0y.i();
            if (obj3 == null) {
                if (!z) {
                    warnThreadNoHandler();
                } else {
                    throw new RuntimeException("Create JSEngine in a thread with Looper, or specify a Handler");
                }
            }
        } else {
            obj3 = obj2;
        }
        this.e = obj3;
        if (z) {
            syncGlobalInfos(obj);
            String str2 = map.get("version");
            String str3 = n4y.j;
            if ((getNativeInfos() & s) != 0 || supportMultipleEngine()) {
                Object engineCmd = Bridge.engineCmd(null, 8, Integer.parseInt(map.get("engine")), Integer.parseInt(map.get("timeout")), new Object[]{str3, str, str2});
                if (engineCmd instanceof Long) {
                    this.f20816a = ((Long) engineCmd).longValue();
                } else {
                    a0y.o("Create JSEngine '" + str + "' failed!");
                }
            } else {
                this.f20816a = JNIBridge.nativeInitInstance(str3, str, str2);
            }
            requestLoopAsync(0L);
            return;
        }
        this.f20816a = j2;
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            dispose(false);
        }
    }
}
