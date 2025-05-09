package com.alibaba.android.split.core.internal;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import dalvik.system.DexClassLoader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FlexaClassLoader extends DexClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Reflector findClass_Method;
    private static Reflector findLibrary_Method;
    private static Reflector findResource_Method;
    private static Reflector nativeLoad_Method;
    private ClassLoader delegate;

    public FlexaClassLoader(ClassLoader classLoader, String str, String str2, String str3, ClassLoader classLoader2) {
        super(str, str2, str3, classLoader2);
        this.delegate = classLoader;
    }

    private Class<?> invokeFindClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f155e5a5", new Object[]{this, str});
        }
        try {
            return (Class) findClass_Method.c(this.delegate, str);
        } catch (Exception unused) {
            return null;
        }
    }

    private String invokeFindLibrary(String str) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c52af5c5", new Object[]{this, str});
        }
        try {
            return (String) findLibrary_Method.c(this.delegate, str);
        } catch (Reflector.ReflectedException e) {
            e.printStackTrace();
            return null;
        }
    }

    private URL invokeFindResource(String str) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("558b645", new Object[]{this, str});
        }
        try {
            return (URL) findResource_Method.c(this.delegate, str);
        } catch (Reflector.ReflectedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(FlexaClassLoader flexaClassLoader, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1907072547:
                return super.findResource((String) objArr[0]);
            case -1538227411:
                return super.findLibrary((String) objArr[0]);
            case 2052165949:
                return super.findClass((String) objArr[0]);
            case 2114946432:
                return super.getPackage((String) objArr[0]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/internal/FlexaClassLoader");
        }
    }

    private void tryLoad(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e20912", new Object[]{this, str});
            return;
        }
        try {
            Log.e("FlexaClassLoader", (String) nativeLoad_Method.c(null, str, this));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> invokeFindClass;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7a51913d", new Object[]{this, str});
        }
        try {
            return findSelf(str);
        } finally {
            if (invokeFindClass != null) {
            }
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a450832d", new Object[]{this, str});
        }
        String findLibrary = super.findLibrary(str);
        if (str.equals(WXEnvironment.CORE_JSC_SO_NAME)) {
            return findLibrary;
        }
        if (((acq.p().o().getApplicationInfo().targetSdkVersion > 28 && str.equals(WXEnvironment.CORE_JSB_SO_NAME)) || TextUtils.isEmpty(findLibrary)) && this.delegate != null) {
            try {
                return invokeFindLibrary(str);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return findLibrary;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public URL findResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("8e5461dd", new Object[]{this, str});
        }
        URL findResource = super.findResource(str);
        if (findResource == null && this.delegate != null) {
            try {
                return invokeFindResource(str);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return findResource;
    }

    public Class<?> findSelf(String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("87879a23", new Object[]{this, str});
        }
        return super.findClass(str);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Package getPackage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Package) ipChange.ipc$dispatch("7e0f8580", new Object[]{this, str});
        }
        Package r0 = super.getPackage(str);
        if (r0 == null) {
            return definePackage(str, "Unknown", "0.0", "Unknown", "Unknown", "0.0", "Unknown", null);
        }
        return r0;
    }

    static {
        t2o.a(677380139);
        findClass_Method = null;
        findResource_Method = null;
        nativeLoad_Method = null;
        findLibrary_Method = null;
        try {
            findClass_Method = Reflector.n(ClassLoader.class).l("findClass", String.class);
            findResource_Method = Reflector.n(ClassLoader.class).l("findResource", String.class);
            nativeLoad_Method = Reflector.n(Runtime.class).l("nativeLoad", String.class, ClassLoader.class);
            findLibrary_Method = Reflector.n(ClassLoader.class).l("findLibrary", String.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
