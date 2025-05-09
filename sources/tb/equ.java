package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class equ {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile equ d = null;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Class<?>> f18767a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, Method>> b = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Constructor<?>> c = new ConcurrentHashMap<>();

    static {
        t2o.a(393216108);
    }

    public static equ e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (equ) ipChange.ipc$dispatch("897b8c4a", new Object[0]);
        }
        if (d == null) {
            synchronized (equ.class) {
                try {
                    if (d == null) {
                        d = new equ();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public Class<?> b(n32 n32Var) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("89b831c9", new Object[]{this, n32Var});
        }
        String name = n32Var.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        return a(name);
    }

    public Class<?>[] c(ParameterWrapper[] parameterWrapperArr) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class[]) ipChange.ipc$dispatch("21a08fc2", new Object[]{this, parameterWrapperArr});
        }
        if (parameterWrapperArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[parameterWrapperArr.length];
        for (int i = 0; i < parameterWrapperArr.length; i++) {
            clsArr[i] = b(parameterWrapperArr[i]);
        }
        return clsArr;
    }

    public Constructor d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Constructor) ipChange.ipc$dispatch("7be31292", new Object[]{this, str});
        }
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public void g(String str, Constructor constructor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8968b6a5", new Object[]{this, str, constructor});
        } else {
            this.c.putIfAbsent(str, constructor);
        }
    }

    public Method f(Class<?> cls, MethodWrapper methodWrapper, ParameterWrapper[] parameterWrapperArr) throws IPCException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("ba7ab574", new Object[]{this, cls, methodWrapper, parameterWrapperArr});
        }
        String methodId = TypeUtils.getMethodId(methodWrapper.getName(), parameterWrapperArr);
        ConcurrentHashMap<String, Method> concurrentHashMap = this.b.get(cls.getName());
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        Method method = concurrentHashMap.get(methodId);
        if (method != null) {
            return method;
        }
        String substring = methodId.substring(0, methodId.indexOf(40));
        Class<?>[] c = c(parameterWrapperArr);
        if (methodWrapper.isVoid()) {
            str = pg1.ATOM_void;
        } else {
            str = methodWrapper.getReturnType();
        }
        Method i = TypeUtils.i(cls, substring, c, a(str));
        if (i != null) {
            concurrentHashMap.putIfAbsent(methodId, i);
            this.b.putIfAbsent(cls.getName(), concurrentHashMap);
            return i;
        }
        throw new IPCException(12, "Method not found: " + methodId + " in class " + cls.getName());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
        if (r6.equals("int") == false) goto L_0x002e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Class<?> a(java.lang.String r6) throws com.taobao.aranger.exception.IPCException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.equ.a(java.lang.String):java.lang.Class");
    }
}
