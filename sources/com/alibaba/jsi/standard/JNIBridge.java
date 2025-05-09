package com.alibaba.jsi.standard;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import tb.a0y;
import tb.dqf;
import tb.hqf;
import tb.kqf;
import tb.n4y;
import tb.pe8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class JNIBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(921698315);
    }

    public static native long nativeCommand(long j, long j2, Object[] objArr);

    public static native long nativeCreateContext(long j, String str, HashSet<Object> hashSet);

    public static native void nativeDisposeContext(long j, long j2);

    public static native void nativeDisposeInstance(long j);

    public static native Object nativeExecuteJS(long j, long j2, String str, String str2);

    public static native String nativeGetVersion(String str);

    public static native long nativeInitInstance(String str, String str2, String str3);

    public static native void nativeOnLoop(long j);

    public static native void nativeOnLowMemory(long j);

    public static native void nativeResetContext(long j, long j2);

    public static native boolean nativeSetInfo(long j, String str, String str2, long j2);

    public static native boolean nativeStartTrace(long j, String str, String str2);

    public static native void nativeStopTrace(long j);

    public static long onNativeEvent(long j, int i, long j2, Object[] objArr) {
        JSEngine instance;
        dqf context;
        JSEngine instance2;
        dqf context2;
        JSEngine instance3;
        dqf context3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbc4c6cb", new Object[]{new Long(j), new Integer(i), new Long(j2), objArr})).longValue();
        }
        switch (i) {
            case 1:
                if (j2 >= 0 && (instance = hqf.getInstance(j)) != null) {
                    instance.requestLoopAsync(j2);
                    break;
                }
                break;
            case 2:
                if (objArr != null && objArr.length >= 2) {
                    Object obj = objArr[0];
                    if (obj instanceof String) {
                        Object obj2 = objArr[1];
                        if (obj2 instanceof String) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("name", (String) obj);
                            hashMap.put("version", (String) obj2);
                            hashMap.put("flags", "");
                            hashMap.put("engine", "0");
                            hashMap.put("timeout", "0");
                            hqf.createInstanceImpl(null, hashMap, j, null);
                            break;
                        }
                    }
                }
                break;
            case 3:
                hqf.getInstance(j).dispose(true);
                break;
            case 4:
                if (objArr != null && objArr.length > 0) {
                    Object obj3 = objArr[0];
                    if (obj3 instanceof String) {
                        return hqf.getInstance(j).createContext((String) obj3).i();
                    }
                }
                return 0L;
            case 5:
                if (objArr != null && objArr.length > 0) {
                    Object obj4 = objArr[0];
                    if (obj4 instanceof Boolean) {
                        boolean booleanValue = ((Boolean) obj4).booleanValue();
                        JSEngine instance4 = hqf.getInstance(j);
                        dqf context4 = instance4.getContext(j2);
                        if (context4 != null) {
                            context4.b();
                            if (booleanValue) {
                                instance4.removeContext(context4);
                                break;
                            }
                        }
                    }
                }
                break;
            case 6:
                dqf context5 = hqf.getInstance(j).getContext(j2);
                if (context5 != null) {
                    context5.v();
                    break;
                }
                break;
            case 7:
                JSEngine instance5 = hqf.getInstance(j);
                if (!(instance5 == null || (context = instance5.getContext(j2)) == null)) {
                    context.t();
                    break;
                }
                break;
            case 8:
                if (objArr == null || objArr.length < 2 || !(objArr[0] instanceof Integer) || !(objArr[1] instanceof kqf) || (instance2 = hqf.getInstance(j)) == null || (context2 = instance2.getContext(j2)) == null) {
                    return 0L;
                }
                return context2.u((kqf) objArr[1], ((Integer) objArr[0]).intValue()) ? 1L : 2L;
            case 9:
                if (objArr == null || objArr.length < 2 || !(objArr[0] instanceof String) || (instance3 = hqf.getInstance(j)) == null || (context3 = instance3.getContext(j2)) == null) {
                    return 0L;
                }
                objArr[1] = context3.s((String) objArr[0]);
                return 1L;
            case 10:
                JSEngine instance6 = hqf.getInstance(j);
                pe8 eventListener = instance6.getEventListener();
                if (eventListener == null || objArr == null || objArr.length < 5 || !(objArr[0] instanceof Long) || !(objArr[1] instanceof Long) || !(objArr[2] instanceof String) || !(objArr[3] instanceof String) || !(objArr[4] instanceof Long)) {
                    return 0L;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("startTime", objArr[0]);
                hashMap2.put("timeoutAt", objArr[1]);
                hashMap2.put("actionInfo", objArr[2]);
                hashMap2.put("jsTrace", objArr[3]);
                hashMap2.put("contextId", objArr[4]);
                if (objArr.length >= 6) {
                    Object obj5 = objArr[5];
                    if (obj5 instanceof String) {
                        hashMap2.put("lastAction", obj5);
                    }
                }
                return eventListener.b(instance6, hashMap2);
            case 11:
                if (objArr != null && objArr.length > 0) {
                    Object obj6 = objArr[0];
                    if (obj6 instanceof Throwable) {
                        n4y.f((Throwable) obj6);
                        return 1L;
                    }
                }
                return 0L;
            case 12:
                JSEngine instance7 = hqf.getInstance(j);
                pe8 eventListener2 = instance7.getEventListener();
                if (eventListener2 == null || objArr == null || objArr.length < 3 || !(objArr[0] instanceof String) || !(objArr[1] instanceof Long) || !(objArr[2] instanceof Boolean)) {
                    return 0L;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("cachePath", objArr[0]);
                hashMap3.put("cacheSize", objArr[1]);
                hashMap3.put("isAot", objArr[2]);
                eventListener2.a(instance7, hashMap3);
                return 1L;
            case 13:
                JSEngine instance8 = hqf.getInstance(j);
                pe8 eventListener3 = instance8.getEventListener();
                if (eventListener3 == null || objArr == null || objArr.length < 3 || !(objArr[0] instanceof String) || !(objArr[1] instanceof String) || !(objArr[2] instanceof String)) {
                    return 0L;
                }
                HashMap hashMap4 = new HashMap();
                hashMap4.put("sourceHash", objArr[0]);
                hashMap4.put("file", objArr[1]);
                hashMap4.put("coverage", objArr[2]);
                eventListener3.c(instance8, hashMap4);
                return 1L;
            default:
                a0y.o("Unknown JSI native event: " + i);
                break;
        }
        return 0L;
    }
}
