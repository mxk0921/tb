package com.taobao.android.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AidlService<I extends IInterface, Stub extends Binder & IInterface> extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AidlService";
    private Binder mBinder;

    static {
        t2o.a(578814111);
    }

    private Binder createBinder(Class<Stub> cls) {
        try {
            try {
                try {
                    return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (NoSuchMethodException unused) {
                    throw new IllegalArgumentException(cls + " must be either standalone class or inner class of " + getClass() + ", and have a empty constructor.");
                }
            } catch (NoSuchMethodException unused2) {
                return cls.getDeclaredConstructor(getClass()).newInstance(this);
            }
        } catch (IllegalAccessException unused3) {
            throw new IllegalArgumentException(cls + " and its empty constructor must be both public.");
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            throw new RuntimeException(targetException);
        } catch (Exception e2) {
            throw new IllegalArgumentException("Stub " + cls + " of service " + getClass() + " cannot be instantiated.", e2);
        }
    }

    private static Type[] getActualTypeArguments(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type[]) ipChange.ipc$dispatch("cb7cfdb2", new Object[]{cls});
        }
        while (cls != null) {
            Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
                if (AidlService.class.equals(parameterizedType.getRawType())) {
                    return parameterizedType.getActualTypeArguments();
                }
            }
            cls = cls.getSuperclass();
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ Object ipc$super(AidlService aidlService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/service/AidlService");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        Binder binder = this.mBinder;
        if (binder != null) {
            return binder;
        }
        throw new IllegalStateException("AidlService is not initialized. Did you forget to call super.onCreate() in onCreate() method of AidlService derived class?");
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        Type[] actualTypeArguments = getActualTypeArguments(getClass());
        Type type = actualTypeArguments[0];
        if (type instanceof Class) {
            Type type2 = actualTypeArguments[1];
            if (type2 instanceof Class) {
                Class cls = (Class) type;
                Class<Stub> cls2 = (Class) type2;
                if (cls.isAssignableFrom(cls2)) {
                    this.mBinder = createBinder(cls2);
                    return;
                }
                throw new IllegalArgumentException(cls2 + " is not paired with " + cls);
            }
            throw new IllegalArgumentException(actualTypeArguments[1] + " is not an AIDL Stub class");
        }
        throw new IllegalArgumentException(actualTypeArguments[0] + " is not an AIDL interface");
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mBinder = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        stopSelf(i2);
        return 2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (this.mBinder == null) {
            return "AidlService[null]";
        }
        return "AidlService[" + this.mBinder.getInterfaceDescriptor() + "]";
    }
}
