package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class ws1 extends vw1<ws1> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Object EMPTY_REPOSITORY = new Object();
    public static final String TAG = "BaseContainer";
    public Map<Class, Object> b;
    public Map<Class, Map<String, Object>> c;

    static {
        t2o.a(1032847374);
    }

    public static /* synthetic */ Object ipc$super(ws1 ws1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/kit/BaseContainer");
    }

    /* renamed from: c */
    public ws1 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ws1) ipChange.ipc$dispatch("e46fb58e", new Object[]{this});
        }
        this.c = new ConcurrentHashMap(100);
        this.b = new ConcurrentHashMap(16);
        return this;
    }

    public <T> T d(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ea288332", new Object[]{this, cls});
        }
        T t = (T) ((ConcurrentHashMap) this.b).get(cls);
        if (t != null) {
            return t;
        }
        return null;
    }

    public <T> T e(Class<T> cls, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2415989e", new Object[]{this, cls, str, str2});
        }
        Map map = (Map) ((ConcurrentHashMap) this.c).get(cls);
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

    public <T> void f(Class<? super T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c41f7ef", new Object[]{this, cls, t});
        } else if (((ConcurrentHashMap) this.b).get(cls) == null) {
            ((ConcurrentHashMap) this.b).put(cls, t);
        }
    }
}
