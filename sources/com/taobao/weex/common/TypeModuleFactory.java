package com.taobao.weex.common;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.Invoker;
import com.taobao.weex.bridge.MethodInvoker;
import com.taobao.weex.bridge.ModuleFactory;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TypeModuleFactory<T extends WXModule> implements ModuleFactory<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TypeModuleFactory";
    public Class<T> mClazz;
    public Map<String, Invoker> mMethodMap;
    private Map<String, Boolean> methodCheckMap = new ConcurrentHashMap();
    private boolean mHasRebuild = false;

    static {
        t2o.a(985661565);
        t2o.a(985661547);
    }

    public TypeModuleFactory(Class<T> cls) {
        this.mClazz = cls;
    }

    private void generateMethodMap() {
        Method[] methods;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("879cb44d", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            for (Method method : this.mClazz.getMethods()) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                int length = declaredAnnotations.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Annotation annotation = declaredAnnotations[i];
                    if (annotation != null) {
                        if (annotation instanceof JSMethod) {
                            JSMethod jSMethod = (JSMethod) annotation;
                            if ("_".equals(jSMethod.alias())) {
                                str = method.getName();
                            } else {
                                str = jSMethod.alias();
                            }
                            hashMap.put(str, new MethodInvoker(method, jSMethod.uiThread()));
                        } else if (annotation instanceof WXModuleAnno) {
                            hashMap.put(method.getName(), new MethodInvoker(method, ((WXModuleAnno) annotation).runOnUIThread()));
                            break;
                        }
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            WXLogUtils.e("[WXModuleManager] extractMethodNames:", th);
        }
        this.mMethodMap = hashMap;
    }

    @Override // com.taobao.weex.bridge.ModuleFactory
    public T buildInstance() throws IllegalAccessException, InstantiationException {
        return this.mClazz.newInstance();
    }

    public String className() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a83416b6", new Object[]{this});
        }
        Class<T> cls = this.mClazz;
        if (cls == null) {
            return "";
        }
        return cls.getName();
    }

    @Override // com.taobao.weex.bridge.JavascriptInvokable
    public Invoker getMethodInvoker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Invoker) ipChange.ipc$dispatch("2dffba62", new Object[]{this, str});
        }
        if (this.mMethodMap == null) {
            generateMethodMap();
        }
        return this.mMethodMap.get(str);
    }

    @Override // com.taobao.weex.bridge.JavascriptInvokable
    public String[] getMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("427e6712", new Object[]{this});
        }
        if (this.mMethodMap == null) {
            generateMethodMap();
        }
        Set<String> keySet = this.mMethodMap.keySet();
        return (String[]) keySet.toArray(new String[keySet.size()]);
    }

    public boolean hasMethodInClass(String str) {
        boolean z;
        Method[] methods;
        Annotation[] declaredAnnotations;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ea75b4d", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Boolean bool = this.methodCheckMap.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            z = false;
            for (Method method : this.mClazz.getMethods()) {
                try {
                    if (method != null && TextUtils.equals(str, method.getName())) {
                        for (Annotation annotation : method.getDeclaredAnnotations()) {
                            if ((annotation instanceof JSMethod) || (annotation instanceof WXModuleAnno)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                    }
                } catch (Throwable unused) {
                    z2 = z;
                    z = z2;
                    this.methodCheckMap.put(str, Boolean.valueOf(z));
                    return z;
                }
            }
        } catch (Throwable unused2) {
        }
        this.methodCheckMap.put(str, Boolean.valueOf(z));
        return z;
    }

    public boolean hasRebuild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5533f02c", new Object[]{this})).booleanValue();
        }
        return this.mHasRebuild;
    }

    public void reBuildMethodMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2de387", new Object[]{this});
        } else if (!this.mHasRebuild) {
            this.mHasRebuild = true;
            generateMethodMap();
        }
    }
}
