package com.taobao.android.dxv4common.logic.dex.bridge;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.f;
import dalvik.system.DexClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import tb.h36;
import tb.ic5;
import tb.la6;
import tb.mw5;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNativeLogicEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_DXRUNTINECONTEXT = "dx_runtimeContext";
    private static final String TAG_STATE_ID = "state_id";
    private AtomicLong atomicLong = new AtomicLong();
    private String bridgeClassName;
    private Class classDXEvent;
    private Class classDXRuntimeContext;
    private List<DXNativeLogicLoader> loaderList;
    private Class mainClass;
    private DXNativeLogicLoader mainClassLoader;

    static {
        t2o.a(444597955);
    }

    private void init() throws Exception {
        Field declaredField = this.mainClassLoader.loadClass(this.bridgeClassName).getDeclaredField("Companion");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        this.mainClassLoader.loadClass(this.bridgeClassName + "$Companion").getMethod("setupMegaBridge", new Class[0]).invoke(obj, new Object[0]);
        h36.c(" 已经完成 setupMegaBridgeMethod ");
    }

    public void callNativeLogicFunc(DexClassLoader dexClassLoader, DXRuntimeContext dXRuntimeContext, String str, String str2, List<Object> list) {
        try {
            Class<?> loadClass = dexClassLoader.loadClass(str);
            Method method = loadClass.getMethod(str2, String.class);
            new HashMap().put(TAG_DXRUNTINECONTEXT, dXRuntimeContext);
            method.invoke(loadClass.newInstance(), list.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Class getClassDXEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("ff6a9598", new Object[]{this});
        }
        return this.classDXEvent;
    }

    public Class getClassDXRuntimeContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("1bd516e1", new Object[]{this});
        }
        return this.classDXRuntimeContext;
    }

    public void setField(Object obj, String str, Object obj2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public DXNativeLogicEngine(String str, String str2, String str3, String str4, String str5, List<DXNativeLogicLoader> list) throws Exception {
        this.loaderList = list;
        if (list == null || list.size() == 0) {
            this.mainClassLoader = new DXNativeLogicLoader(str, false);
        } else {
            DXNativeLogicLoader dXNativeLogicLoader = list.get(list.size() - 1);
            this.mainClassLoader = new DXNativeLogicLoader(str, false, null, null, dXNativeLogicLoader, dXNativeLogicLoader.getName(), dXNativeLogicLoader.getVersion(), "null", "null", "default", "default");
        }
        this.mainClassLoader.setNeedFind(true);
        this.mainClass = this.mainClassLoader.loadClass(str2);
        this.classDXEvent = this.mainClassLoader.loadClass(str3);
        this.classDXRuntimeContext = this.mainClassLoader.loadClass(str4);
        this.bridgeClassName = str5;
        init();
    }

    public void callNativeLogicFunc(DXRuntimeContext dXRuntimeContext, DXEvent dXEvent, String str, Map<String, Object> map) {
        JSONObject jSONObject;
        try {
            Class classDXEvent = getClassDXEvent();
            Class classDXRuntimeContext = getClassDXRuntimeContext();
            Method method = this.mainClass.getMethod(str, classDXEvent, Map.class, classDXRuntimeContext);
            Object newInstance = classDXRuntimeContext.newInstance();
            Object obj = "" + this.atomicLong.incrementAndGet();
            setField(newInstance, "identifier", obj);
            setField(newInstance, "data", dXRuntimeContext.i());
            setField(newInstance, "subData", dXRuntimeContext.O());
            Object newInstance2 = classDXEvent.newInstance();
            setField(newInstance2, "identifier", obj);
            try {
                if (dXEvent.getArgs() == null || dXEvent.getArgs().isEmpty()) {
                    jSONObject = null;
                } else {
                    jSONObject = new JSONObject();
                    for (Map.Entry<String, mw5> entry : dXEvent.getArgs().entrySet()) {
                        if (!(entry.getKey() == null || entry.getValue() == null)) {
                            jSONObject.put(entry.getKey(), entry.getValue().s());
                        }
                    }
                }
                setField(newInstance2, "data", jSONObject);
            } catch (Throwable unused) {
            }
            map.put(TAG_STATE_ID, obj);
            method.invoke(this.mainClass.newInstance(), newInstance2, map, newInstance);
        } catch (Throwable th) {
            f fVar = new f(dXRuntimeContext.c());
            fVar.b = dXRuntimeContext.p();
            f.a aVar = new f.a("DX_V4_LOGIC", "DX_V4_LOGIC_ERROR", f.DX_V4_LOGIC_4100002);
            aVar.e = xv5.a(th);
            fVar.c.add(aVar);
            ic5.p(fVar);
            xv5.d(th);
            la6.b(xv5.a(th));
        }
    }
}
