package com.alibaba.jsi.standard.js;

import com.alibaba.jsi.standard.JSEngine;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a0y;
import tb.bsf;
import tb.dqf;
import tb.dsf;
import tb.esf;
import tb.fsf;
import tb.hsf;
import tb.iit;
import tb.isf;
import tb.jb1;
import tb.kqf;
import tb.ksf;
import tb.lwx;
import tb.msf;
import tb.oqf;
import tb.spf;
import tb.sqf;
import tb.t2o;
import tb.tpf;
import tb.upf;
import tb.uqf;
import tb.vpf;
import tb.vqf;
import tb.vu3;
import tb.ypf;
import tb.yrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Bridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int kContextGenCodeCache = 14;
    public static final int kContextGetException = 12;
    public static final int kContextGetGlobalObject = 10;
    public static final int kContextHasException = 11;
    public static final int kContextThrowException = 13;
    public static final int kJSEngineCreate = 8;
    public static final int kJSEngineGetCurrentType = 6;
    public static final int kJSEngineGetType = 4;
    public static final int kJSEngineMultiJSEngine = 7;
    public static final int kJSEngineNativeInfos = 9;
    public static final int kJSEngineSetStatObjects = 5;

    static {
        t2o.a(921698331);
    }

    public static Object cmd(dqf dqfVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ad38289b", new Object[]{dqfVar, new Integer(i)}) : nativeCmd(contextNativePtr(dqfVar), i, 0L, 0L, null);
    }

    private static long contextNativePtr(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a93aa02e", new Object[]{dqfVar})).longValue();
        }
        if (dqfVar == null) {
            return 0L;
        }
        return dqfVar.n();
    }

    public static Object createJava(int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("58e30114", new Object[]{new Integer(i), new Long(j), new Long(j2)});
        }
        if (19 == i) {
            return new jb1(j2);
        }
        dqf context = toContext(j);
        switch (i) {
            case 5:
                return new hsf(context, j2);
            case 6:
            case 14:
            case 19:
            case 20:
            default:
                a0y.m("Create JSI java object with unknown type: " + i);
                return null;
            case 7:
                return new yrf(context, j2);
            case 8:
                return new spf(context, j2);
            case 9:
                return new sqf(context, j2);
            case 10:
                return new dsf(context, j2);
            case 11:
                return new tpf(context, j2);
            case 12:
                return new oqf(context, j2);
            case 13:
                return new bsf(context, j2);
            case 15:
                return new vpf(context, j2);
            case 16:
                return new vqf(context, j2);
            case 17:
                return new fsf(context, j2);
            case 18:
                return new isf(context, j2);
            case 21:
                return new kqf(context, j2);
        }
    }

    public static Object createJavaPrimitive(int i, boolean z, double d, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("16b2eaab", new Object[]{new Integer(i), new Boolean(z), new Double(d), str});
        }
        if (i == 1) {
            return upf.u(z);
        }
        if (i == 2) {
            return new uqf((int) d);
        }
        if (i == 3) {
            return new uqf(d);
        }
        if (i == 4) {
            return new esf(str);
        }
        if (i != 6) {
            a0y.m("Create JSI primitive java object with unknown type: " + i);
            return null;
        } else if (z) {
            return msf.w();
        } else {
            return msf.v();
        }
    }

    public static long createNative(dqf dqfVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22092892", new Object[]{dqfVar, new Integer(i)})).longValue() : nativeCreate(contextNativePtr(dqfVar), i, 0L, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public static boolean detachNative(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5125f6b1", new Object[]{obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof ksf) {
            ksf ksfVar = (ksf) obj;
            if (ksfVar.b != 0) {
                lwx.i(ksfVar.f22887a, ksfVar);
                ksfVar.b = 0L;
            }
            return true;
        } else if (obj instanceof jb1) {
            jb1 jb1Var = (jb1) obj;
            jb1Var.b = true;
            jb1Var.f21879a = 0L;
            return true;
        } else if (obj instanceof kqf) {
            kqf kqfVar = (kqf) obj;
            if (kqfVar.b != 0) {
                lwx.i(kqfVar.f22853a, kqfVar);
                kqfVar.b = 0L;
            }
            return true;
        } else if (!(obj instanceof iit)) {
            return false;
        } else {
            iit iitVar = (iit) obj;
            if (iitVar.b != 0) {
                lwx.f(iitVar.f21334a, iitVar);
                iitVar.b = 0L;
            }
            return true;
        }
    }

    public static Object engineCmd(JSEngine jSEngine, int i, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e04bea9c", new Object[]{jSEngine, new Integer(i), new Long(j)}) : nativeCmd(engineNativePtr(jSEngine), i, j, 0L, null);
    }

    private static long engineNativePtr(JSEngine jSEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba98222c", new Object[]{jSEngine})).longValue();
        }
        if (jSEngine == null) {
            return 0L;
        }
        return jSEngine.getNativeInstance();
    }

    public static Object get(int i, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d0937858", new Object[]{new Integer(i), new Long(j), obj});
        }
        if (i != 1) {
            return null;
        }
        return ksf.class;
    }

    public static boolean getBooleanValue(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab565006", new Object[]{obj})).booleanValue();
        }
        return ((upf) obj).v();
    }

    public static long getNativePtr(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b643278", new Object[]{obj})).longValue();
        }
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof ksf) {
            return ((ksf) obj).b;
        }
        if (obj instanceof jb1) {
            return ((jb1) obj).f21879a;
        }
        if (obj instanceof kqf) {
            return ((kqf) obj).b;
        }
        if (obj instanceof iit) {
            return ((iit) obj).b;
        }
        return 0L;
    }

    public static double getNumberValue(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8887183", new Object[]{obj})).doubleValue();
        }
        return ((uqf) obj).w();
    }

    public static int getPrimitiveType(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2290d761", new Object[]{obj})).intValue();
        }
        if (obj instanceof ksf) {
            ksf ksfVar = (ksf) obj;
            if (ksfVar.i()) {
                return 1;
            }
            if (ksfVar.m()) {
                if (((uqf) ksfVar).v()) {
                    return 2;
                }
                return 3;
            } else if (ksfVar.o()) {
                return 4;
            } else {
                if (ksfVar.q()) {
                    return 6;
                }
            }
        }
        return 0;
    }

    public static String getStringValue(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fc8b873", new Object[]{obj});
        }
        return ((esf) obj).u();
    }

    private static native Object nativeCmd(long j, int i, long j2, long j3, Object[] objArr);

    private static native long nativeCreate(long j, int i, long j2, double d, Object[] objArr);

    public static native void nativeDelete(long j, int i);

    public static Object onCallConstructor(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cb1d2716", new Object[]{obj, obj2});
        }
        return unwrap(obj).onCallConstructor((jb1) obj2);
    }

    public static Object onCallFunction(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5dd3bd1e", new Object[]{obj, obj2});
        }
        return unwrap(obj).onCallFunction((jb1) obj2);
    }

    public static boolean onDeleteIndexedProperty(Object obj, long j, Object obj2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff3e9ba6", new Object[]{obj, new Long(j), obj2, new Integer(i)})).booleanValue();
        }
        return unwrap(obj).onDeleteIndexedProperty(toContext(j), (ksf) obj2, i);
    }

    public static boolean onDeleteNamedProperty(Object obj, long j, Object obj2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265b9a47", new Object[]{obj, new Long(j), obj2, str})).booleanValue();
        }
        return unwrap(obj).onDeleteNamedProperty(toContext(j), (ksf) obj2, str);
    }

    public static Object[] onEnumerateIndexedProperty(Object obj, long j, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("d14828bd", new Object[]{obj, new Long(j), obj2});
        }
        return unwrap(obj).onEnumerateIndexedProperty(toContext(j), (ksf) obj2);
    }

    public static Object[] onEnumerateNamedProperty(Object obj, long j, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("4a39dab5", new Object[]{obj, new Long(j), obj2});
        }
        return unwrap(obj).onEnumerateNamedProperty(toContext(j), (ksf) obj2);
    }

    public static Object onGetIndexedProperty(Object obj, long j, Object obj2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("94bd6c1d", new Object[]{obj, new Long(j), obj2, new Integer(i)});
        }
        return unwrap(obj).onGetIndexedProperty(toContext(j), (ksf) obj2, i);
    }

    public static Object onGetNamedProperty(Object obj, long j, Object obj2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("57c72f62", new Object[]{obj, new Long(j), obj2, str});
        }
        return unwrap(obj).onGetNamedProperty(toContext(j), (ksf) obj2, str);
    }

    public static Object onGetProperty(Object obj, long j, Object obj2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("678ce357", new Object[]{obj, new Long(j), obj2, str});
        }
        return unwrap(obj).onGetProperty(toContext(j), (ksf) obj2, str);
    }

    public static void onJSCallbackDetached(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eade9c2", new Object[]{obj});
        } else {
            unwrap(obj).onDetached();
        }
    }

    public static int onQueryIndexedProperty(Object obj, long j, Object obj2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97826ab6", new Object[]{obj, new Long(j), obj2, new Integer(i)})).intValue();
        }
        return unwrap(obj).onQueryIndexedProperty(toContext(j), (ksf) obj2, i);
    }

    public static int onQueryNamedProperty(Object obj, long j, Object obj2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5ed84f5", new Object[]{obj, new Long(j), obj2, str})).intValue();
        }
        return unwrap(obj).onQueryNamedProperty(toContext(j), (ksf) obj2, str);
    }

    public static Object onSetIndexedProperty(Object obj, long j, Object obj2, int i, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1e996e0d", new Object[]{obj, new Long(j), obj2, new Integer(i), obj3});
        }
        return unwrap(obj).onSetIndexedProperty(toContext(j), (ksf) obj2, i, (ksf) obj3);
    }

    public static Object onSetNamedProperty(Object obj, long j, Object obj2, String str, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("eb3eca7a", new Object[]{obj, new Long(j), obj2, str, obj3});
        }
        return unwrap(obj).onSetNamedProperty(toContext(j), (ksf) obj2, str, (ksf) obj3);
    }

    public static void onSetProperty(Object obj, long j, Object obj2, String str, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32cbacb", new Object[]{obj, new Long(j), obj2, str, obj3});
        } else {
            unwrap(obj).onSetProperty(toContext(j), (ksf) obj2, str, (ksf) obj3);
        }
    }

    private static dqf toContext(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqf) ipChange.ipc$dispatch("d76beb98", new Object[]{new Long(j)});
        }
        return dqf.d(j);
    }

    private static ypf unwrap(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ypf) ipChange.ipc$dispatch("6f978a4d", new Object[]{obj});
        }
        return (ypf) obj;
    }

    public static boolean voidIsUndefined(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df6fc39", new Object[]{obj})).booleanValue();
        }
        return ((msf) obj).u();
    }

    public static Object cmd(dqf dqfVar, int i, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("95c39ca5", new Object[]{dqfVar, new Integer(i), new Long(j)}) : nativeCmd(contextNativePtr(dqfVar), i, j, 0L, null);
    }

    public static long createNative(dqf dqfVar, int i, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("71a631c7", new Object[]{dqfVar, new Integer(i), objArr})).longValue() : nativeCreate(contextNativePtr(dqfVar), i, 0L, vu3.b.GEO_NOT_SUPPORT, objArr);
    }

    public static Object engineCmd(JSEngine jSEngine, int i, long j, long j2, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b36b134f", new Object[]{jSEngine, new Integer(i), new Long(j), new Long(j2), objArr}) : nativeCmd(engineNativePtr(jSEngine), i, j, j2, objArr);
    }

    public static Object cmd(dqf dqfVar, int i, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("f228f018", new Object[]{dqfVar, new Integer(i), objArr}) : nativeCmd(contextNativePtr(dqfVar), i, 0L, 0L, objArr);
    }

    public static long createNative(dqf dqfVar, int i, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1f1c61da", new Object[]{dqfVar, new Integer(i), new Long(j)})).longValue() : nativeCreate(contextNativePtr(dqfVar), i, j, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public static Object cmd(dqf dqfVar, int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bea6a9db", new Object[]{dqfVar, new Integer(i), new Long(j), new Long(j2)}) : nativeCmd(contextNativePtr(dqfVar), i, j, j2, null);
    }

    public static long createNative(dqf dqfVar, int i, long j, double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c4703b0c", new Object[]{dqfVar, new Integer(i), new Long(j), new Double(d)})).longValue() : nativeCreate(contextNativePtr(dqfVar), i, j, d, null);
    }

    public static Object cmd(dqf dqfVar, int i, long j, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d1335bce", new Object[]{dqfVar, new Integer(i), new Long(j), objArr}) : nativeCmd(contextNativePtr(dqfVar), i, j, 0L, objArr);
    }

    public static long createNative(dqf dqfVar, int i, long j, double d, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9412090d", new Object[]{dqfVar, new Integer(i), new Long(j), new Double(d), objArr})).longValue() : nativeCreate(contextNativePtr(dqfVar), i, j, d, objArr);
    }

    public static Object cmd(dqf dqfVar, int i, long j, long j2, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d37666d8", new Object[]{dqfVar, new Integer(i), new Long(j), new Long(j2), objArr}) : nativeCmd(contextNativePtr(dqfVar), i, j, j2, objArr);
    }

    public static long createNative(JSEngine jSEngine, int i, long j, double d, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("780947c2", new Object[]{jSEngine, new Integer(i), new Long(j), new Double(d), objArr})).longValue() : nativeCreate(engineNativePtr(jSEngine), i, j, d, objArr);
    }
}
