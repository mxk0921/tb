package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a7x<T> implements u6x<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Method f15587a;
    public final MUSThreadStrategy b;
    public final Type[] c;

    static {
        t2o.a(982515930);
        t2o.a(982515928);
    }

    public a7x(Method method, MUSThreadStrategy mUSThreadStrategy) {
        this.f15587a = method;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        this.c = genericParameterTypes;
        this.b = mUSThreadStrategy;
        c(genericParameterTypes);
    }

    @Override // tb.u6x
    public MUSThreadStrategy a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSThreadStrategy) ipChange.ipc$dispatch("94a6a77", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.u6x
    public Object b(WeexInstance weexInstance, T t, WeexValue[] weexValueArr) throws Exception {
        int i;
        if (weexValueArr == null) {
            i = 0;
        } else {
            i = weexValueArr.length;
        }
        Type[] typeArr = this.c;
        int length = typeArr.length;
        Method method = this.f15587a;
        if (i == 0 && length == 0) {
            return method.invoke(t, new Object[0]);
        }
        Object[] objArr = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            Type type = typeArr[i2];
            if (i2 < i) {
                WeexValue weexValue = weexValueArr[i2];
                if (weexValue == null || weexValue.getType() != WeexValue.Type.FUNCTION) {
                    objArr[i2] = f9x.f(type, weexValue);
                } else if (type == f4x.class || type == Object.class) {
                    objArr[i2] = new g4x(weexInstance, ((Long) weexValue.getValue()).longValue());
                } else if (type == WeexValue.class) {
                    objArr[i2] = weexValue;
                } else {
                    throw new IllegalArgumentException("[prepareArguments] WeexCallback can't assign to " + type);
                }
            } else if (!type.getClass().isPrimitive()) {
                objArr[i2] = null;
            } else {
                throw new IllegalArgumentException("[prepareArguments] method argument list not match.");
            }
        }
        while (length < i) {
            WeexValue weexValue2 = weexValueArr[length];
            if (weexValue2 != null && weexValue2.getType() == WeexValue.Type.FUNCTION) {
                ((WeexInstanceImpl) weexInstance).removeCallback(weexValue2.getFunctionID());
            }
            length++;
        }
        return method.invoke(t, objArr);
    }

    public final void c(Type[] typeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b29093", new Object[]{this, typeArr});
        } else if (typeArr != null) {
            for (Type type : typeArr) {
                if (!f9x.d(type)) {
                    throw new IllegalArgumentException("[WeexMethodInvokable] method " + this.f15587a.getName() + "() arg type: '" + type + "' is not supported");
                }
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f15587a.getName();
    }
}
