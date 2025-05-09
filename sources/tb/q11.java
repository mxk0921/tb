package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.apk.ApkUpdateContext;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class q11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Class<? extends czm>, Class<? extends czm>> f26436a = new HashMap();
    public static final Map<Class<? extends czm>, czm> b = new HashMap();

    static {
        t2o.a(953155606);
    }

    public static czm<ApkUpdateContext> getProcessor(Class<? extends czm> cls) {
        try {
            Map<Class<? extends czm>, czm> map = b;
            czm<ApkUpdateContext> czmVar = (czm) ((HashMap) map).get(cls);
            if (czmVar != null) {
                return czmVar;
            }
            Class<? extends czm> cls2 = (Class) ((HashMap) f26436a).get(cls);
            if (cls2 != null) {
                cls = cls2;
            }
            czm<ApkUpdateContext> czmVar2 = (czm) cls.newInstance();
            ((HashMap) map).put(cls, czmVar2);
            return czmVar2;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static void registerSpecialProcessor(Class<? extends czm> cls, Class<? extends czm> cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1559c803", new Object[]{cls, cls2});
        } else {
            ((HashMap) f26436a).put(cls, cls2);
        }
    }
}
