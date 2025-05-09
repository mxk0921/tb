package com.taobao.message.kit.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class BaseContainer extends BaseLazySingleInstance<BaseContainer> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Object EMPTY_REPOSITORY = new Object();
    public static final String TAG = "BaseContainer";
    private byte[] lock = new byte[0];
    public Map<Class, Map<String, Object>> mMap;
    public Map<Class, Object> mObjMap;

    static {
        t2o.a(529530937);
    }

    public static /* synthetic */ Object ipc$super(BaseContainer baseContainer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/kit/core/BaseContainer");
    }

    public <T> T get(Class<T> cls, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2415989e", new Object[]{this, cls, str, str2});
        }
        Map<String, Object> map = this.mMap.get(cls);
        if (map != null) {
            try {
                T t = (T) map.get(str + str2);
                if (t == EMPTY_REPOSITORY) {
                    return null;
                }
                return t;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public byte[] getLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c5293c35", new Object[]{this});
        }
        return this.lock;
    }

    public synchronized <T> void register(Class<? super T> cls, String str, String str2, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e824283", new Object[]{this, cls, str, str2, t});
            return;
        }
        Map<String, Object> map = this.mMap.get(cls);
        if (map == null) {
            map = new ConcurrentHashMap<>(4);
            this.mMap.put(cls, map);
        }
        if (t == null) {
            map.put(str + str2, EMPTY_REPOSITORY);
        } else {
            map.put(str + str2, t);
        }
    }

    public <T> void registerAllowingReplace(Class<? super T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46f4999a", new Object[]{this, cls, t});
        } else {
            this.mObjMap.put(cls, t);
        }
    }

    public void unregister(Class cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b82224", new Object[]{this, cls, str});
            return;
        }
        Map<String, Object> map = this.mMap.get(cls);
        if (map != null) {
            map.remove(str);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.message.kit.core.BaseLazySingleInstance
    public BaseContainer costlyIdempotentOperation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseContainer) ipChange.ipc$dispatch("961179b8", new Object[]{this});
        }
        this.mMap = new ConcurrentHashMap(100);
        this.mObjMap = new ConcurrentHashMap(16);
        return this;
    }

    public void unregister(Class cls, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6e8aee", new Object[]{this, cls, str, str2});
            return;
        }
        Map<String, Object> map = this.mMap.get(cls);
        if (map != null) {
            map.remove(str + str2);
        }
    }

    public <T> T get(Class<T> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d953e6a8", new Object[]{this, cls, str});
        }
        Map<String, Object> map = this.mMap.get(cls);
        if (map != null) {
            try {
                T t = (T) map.get(str);
                if (t == EMPTY_REPOSITORY) {
                    return null;
                }
                return t;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void unregister(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa363ada", new Object[]{this, cls});
        } else if (this.mObjMap.get(cls) != null) {
            this.mObjMap.remove(cls);
        }
    }

    public synchronized <T> void register(Class<? super T> cls, String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d134479", new Object[]{this, cls, str, t});
            return;
        }
        Map<String, Object> map = this.mMap.get(cls);
        if (map == null) {
            map = new ConcurrentHashMap<>(4);
            this.mMap.put(cls, map);
        }
        if (t == null) {
            map.put(str, EMPTY_REPOSITORY);
        } else {
            map.put(str, t);
        }
    }

    public <T> T get(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ea288332", new Object[]{this, cls});
        }
        T t = (T) this.mObjMap.get(cls);
        if (t != null) {
            return t;
        }
        return null;
    }

    public <T> void register(Class<? super T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c41f7ef", new Object[]{this, cls, t});
        } else if (this.mObjMap.get(cls) == null) {
            this.mObjMap.put(cls, t);
        }
    }
}
