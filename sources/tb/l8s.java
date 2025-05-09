package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.ParamRequired;
import com.taobao.themis.kernel.ability.register.AbilityType;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class l8s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TMSAbilityRegister";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, f11> f23183a = new ConcurrentHashMap();
    public static final Map<String, fr> b = new ConcurrentHashMap();

    static {
        t2o.a(839909456);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601ca6c9", new Object[]{context});
        } else if (!abs.b.get()) {
            abs.e(context);
        }
    }

    public static f11 b(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f11) ipChange.ipc$dispatch("3ad6ab8e", new Object[]{str, context});
        }
        a(context);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f23183a;
        f11 f11Var = (f11) concurrentHashMap.get(str);
        if (f11Var != null) {
            return f11Var;
        }
        fr frVar = (fr) ((ConcurrentHashMap) b).remove(str);
        if (frVar == null) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(frVar.b);
            if (!j8s.class.isAssignableFrom(cls)) {
                TMSLogger.b(TAG, frVar.b + " doesn't inherit from ThemisAbility");
                return null;
            }
            d(cls, frVar.c);
            return (f11) concurrentHashMap.get(str);
        } catch (Throwable th) {
            TMSLogger.c(TAG, "lazy Init Ability failed", th);
            return null;
        }
    }

    public static Map<String, f11> c(Class<? extends j8s> cls, AbilityType abilityType) {
        Method[] methods;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("393d5496", new Object[]{cls, abilityType});
        }
        HashMap hashMap = new HashMap();
        fr frVar = new fr();
        frVar.f19475a = cls;
        frVar.c = abilityType;
        for (Method method : cls.getMethods()) {
            try {
                APIMethod aPIMethod = (APIMethod) method.getAnnotation(APIMethod.class);
                if (aPIMethod != null) {
                    String value = aPIMethod.value();
                    if (TextUtils.isEmpty(value)) {
                        value = method.getName();
                    }
                    f11 f11Var = new f11();
                    f11Var.c = method;
                    method.getAnnotation(ParamRequired.class);
                    if (method.getAnnotation(AutoCallback.class) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    f11Var.d = z;
                    f11Var.f18931a = value;
                    f11Var.e = method.getParameterTypes();
                    f11Var.f = method.getParameterAnnotations();
                    f11Var.b = frVar;
                    hashMap.put(f11Var.f18931a, f11Var);
                }
            } catch (Throwable th) {
                TMSLogger.c(TAG, "initApiMeta failed", th);
            }
        }
        return hashMap;
    }

    public static void d(Class<? extends j8s> cls, AbilityType abilityType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47954519", new Object[]{cls, abilityType});
            return;
        }
        Map<String, f11> c = c(cls, abilityType);
        if (c.isEmpty()) {
            TMSLogger.g(TAG, "registerAbility failed cause apiMetaList is empty");
        } else {
            ((ConcurrentHashMap) f23183a).putAll(c);
        }
    }

    public static void e(String str, List<String> list, AbilityType abilityType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf9897f", new Object[]{str, list, abilityType});
        } else if (list.isEmpty()) {
            TMSLogger.g(TAG, "registerAbility failed cause apiMethods list is empty");
        } else {
            fr frVar = new fr();
            frVar.b = str;
            frVar.c = abilityType;
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    ((ConcurrentHashMap) b).put(str2, frVar);
                }
            }
        }
    }
}
