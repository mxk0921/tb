package com.taobao.message.annotation.aspectjx;

import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import tb.t2o;

/* compiled from: Taobao */
@Aspect
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MethodSpyAspect {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MethodSpyAspect";
    private static final Set<Class<?>> WRAPPER_TYPES = getWrapperTypes();

    static {
        t2o.a(528482307);
    }

    public static MethodSpyAspect aspectOf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MethodSpyAspect) ipChange.ipc$dispatch("29e805c0", new Object[0]);
        }
        return new MethodSpyAspect();
    }

    private static Set<Class<?>> getWrapperTypes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("e164f352", new Object[0]);
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Boolean.class);
        hashSet.add(Character.class);
        hashSet.add(Byte.class);
        hashSet.add(Short.class);
        hashSet.add(Integer.class);
        hashSet.add(Long.class);
        hashSet.add(Float.class);
        hashSet.add(Double.class);
        hashSet.add(Void.class);
        hashSet.add(Serializable.class);
        hashSet.add(Parcelable.class);
        return hashSet;
    }

    public static boolean isWrapperType(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ef0aa97", new Object[]{cls})).booleanValue();
        }
        return WRAPPER_TYPES.contains(cls);
    }

    @Before("@annotation(spy) && execution(* *(..)) && !within(*..versions..*)")
    public void aroundMethodConsume(JoinPoint joinPoint, MethodSpy methodSpy) throws Throwable {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c225d3ef", new Object[]{this, joinPoint, methodSpy});
            return;
        }
        String name = methodSpy.name();
        Object[] args = joinPoint.getArgs();
        String[] parameterNames = joinPoint.getSignature().getParameterNames();
        JSONObject jSONObject = new JSONObject();
        if (!(args == null || parameterNames == null)) {
            for (int i = 0; i < args.length; i++) {
                Object obj = args[i];
                if (obj != null && isWrapperType(obj.getClass())) {
                    jSONObject.put(parameterNames[i], args[i]);
                }
            }
        }
        SpyPoster spyPoster = SpyPoster.INSTANCE;
        if (jSONObject.size() > 0) {
            str = jSONObject.toJSONString();
        } else {
            str = null;
        }
        spyPoster.post(name, str);
    }
}
