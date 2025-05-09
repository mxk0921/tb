package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.UploaderGlobal;
import com.uploader.implement.UploaderManager;
import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class omv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<Integer, x6e> f25497a = new ConcurrentHashMap<>();

    public static x6e a() throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x6e) ipChange.ipc$dispatch("3bfc3e0a", new Object[0]);
        }
        return b(0);
    }

    public static x6e b(int i) {
        w6e a2;
        w6e a3;
        w6e a4;
        ConcurrentHashMap<Integer, x6e> concurrentHashMap = f25497a;
        x6e x6eVar = concurrentHashMap.get(Integer.valueOf(i));
        if (x6eVar != null) {
            if (!x6eVar.isInitialized() && (a4 = UploaderGlobal.a(Integer.valueOf(i))) != null) {
                x6eVar.initialize(UploaderGlobal.f(), a4);
            }
            return x6eVar;
        }
        synchronized (omv.class) {
            try {
                x6e x6eVar2 = concurrentHashMap.get(Integer.valueOf(i));
                if (x6eVar2 != null) {
                    if (!x6eVar2.isInitialized() && (a3 = UploaderGlobal.a(Integer.valueOf(i))) != null) {
                        x6eVar2.initialize(UploaderGlobal.f(), a3);
                    }
                    return x6eVar2;
                }
                IpChange ipChange = UploaderManager.$ipChange;
                Constructor declaredConstructor = UploaderManager.class.getDeclaredConstructor(Integer.TYPE);
                declaredConstructor.setAccessible(true);
                x6e x6eVar3 = (x6e) declaredConstructor.newInstance(Integer.valueOf(i));
                concurrentHashMap.put(Integer.valueOf(i), x6eVar3);
                if (!x6eVar3.isInitialized() && (a2 = UploaderGlobal.a(Integer.valueOf(i))) != null) {
                    x6eVar3.initialize(UploaderGlobal.f(), a2);
                }
                return x6eVar3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
