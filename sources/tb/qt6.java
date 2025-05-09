package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qt6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f26916a = new ConcurrentHashMap();
    public final Map<String, Object> b = new ConcurrentHashMap();

    static {
        t2o.a(839909381);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ((ConcurrentHashMap) this.f26916a).clear();
        ((ConcurrentHashMap) this.b).clear();
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8d789f4", new Object[]{this, str})).booleanValue();
        }
        Object obj = ((ConcurrentHashMap) this.b).get(str);
        if (obj != null) {
            try {
                return ((Boolean) obj).booleanValue();
            } catch (Throwable th) {
                TMSLogger.c("DataStore", "getStringValue error!", th);
            }
        }
        return false;
    }

    public <T> T g(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c492647c", new Object[]{this, cls});
        }
        return (T) ((ConcurrentHashMap) this.f26916a).get(cls);
    }

    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f60d845", new Object[]{this, str});
        }
        Object obj = ((ConcurrentHashMap) this.b).get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (Throwable th) {
            TMSLogger.c("DataStore", "getStringValue error!", th);
            return null;
        }
    }

    public void i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c87f208b", new Object[]{this, str, new Boolean(z)});
        } else {
            ((ConcurrentHashMap) this.b).put(str, Boolean.valueOf(z));
        }
    }

    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01d466c", new Object[]{this, str, str2});
        } else if (str2 == null) {
            ((ConcurrentHashMap) this.b).remove(str);
        } else {
            ((ConcurrentHashMap) this.b).put(str, str2);
        }
    }

    public <T> void k(Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2cef46", new Object[]{this, cls, t});
        } else if (t != null) {
            ((ConcurrentHashMap) this.f26916a).put(cls, t);
        }
    }
}
