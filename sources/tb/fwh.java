package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fwh<T> implements cwh<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Method f19578a;
    public final MUSThreadStrategy b;
    public final Type[] c;
    public final Object d;

    static {
        t2o.a(982516059);
        t2o.a(982516058);
    }

    public fwh(Method method, MUSThreadStrategy mUSThreadStrategy) {
        this.f19578a = method;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        this.c = genericParameterTypes;
        this.b = mUSThreadStrategy;
        this.d = null;
        f(genericParameterTypes);
    }

    @Override // tb.cwh
    public MUSThreadStrategy a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSThreadStrategy) ipChange.ipc$dispatch("94a6a77", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.cwh
    public Object b(a aVar, Object obj, T t, MUSValue[] mUSValueArr) throws Exception {
        int i;
        if (mUSValueArr == null) {
            i = 0;
        } else {
            i = mUSValueArr.length;
        }
        Type[] typeArr = this.c;
        int length = typeArr.length;
        Method method = this.f19578a;
        if (i == 0 && length == 0) {
            return method.invoke(t, new Object[0]);
        }
        Object[] objArr = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            Type type = typeArr[i2];
            if (i2 < i) {
                MUSValue mUSValue = mUSValueArr[i2];
                if (mUSValue == null || !mUSValue.isFunction()) {
                    objArr[i2] = jxh.f(type, mUSValue);
                } else if (type == pvh.class || type == Object.class) {
                    objArr[i2] = new sd0((tvh) aVar, mUSValue.getFunctionId(), obj);
                } else if (type == MUSValue.class) {
                    objArr[i2] = mUSValue;
                } else {
                    throw new IllegalArgumentException("[prepareArguments] MUSCallback can't assign to " + type);
                }
            } else if (!type.getClass().isPrimitive()) {
                objArr[i2] = null;
            } else {
                throw new IllegalArgumentException("[prepareArguments] method argument list not match.");
            }
        }
        while (length < i) {
            MUSValue mUSValue2 = mUSValueArr[length];
            if (mUSValue2 != null && mUSValue2.isFunction()) {
                new sd0((tvh) aVar, mUSValue2.getFunctionId(), obj).release();
            }
            length++;
        }
        return method.invoke(t, objArr);
    }

    @Override // tb.cwh
    public Object c(MUSDKInstance mUSDKInstance, T t, Object obj) throws Exception {
        if (this.c.length == 1) {
            Method method = this.f19578a;
            if (obj != null || g() == null) {
                return method.invoke(t, obj);
            }
            return method.invoke(t, g());
        }
        throw new IllegalArgumentException("[prepareArguments] method argument list not match.");
    }

    @Override // tb.cwh
    public Object d(MUSDKInstance mUSDKInstance, T t, MUSValue mUSValue) throws Exception {
        Object obj;
        Type[] typeArr = this.c;
        if (typeArr.length == 1) {
            Type type = typeArr[0];
            boolean isNill = MUSValue.isNill(mUSValue);
            Method method = this.f19578a;
            if (isNill && g() != null) {
                return method.invoke(t, g());
            }
            if (mUSValue == null || !mUSValue.isFunction()) {
                obj = jxh.f(type, mUSValue);
            } else if (type == pvh.class || type == Object.class) {
                obj = new sd0((tvh) mUSDKInstance, mUSValue.getFunctionId(), null);
            } else {
                obj = mUSValue;
                if (type != MUSValue.class) {
                    throw new IllegalArgumentException("[prepareArguments] MUSCallback can't assign to " + type);
                }
            }
            return method.invoke(t, obj);
        }
        throw new IllegalArgumentException("[prepareArguments] method argument list not match.");
    }

    @Override // tb.cwh
    public Object e(MUSDKInstance mUSDKInstance, Object obj, T t, MUSValue[] mUSValueArr) throws Exception {
        int i;
        if (mUSValueArr == null) {
            i = 0;
        } else {
            i = mUSValueArr.length;
        }
        Type[] typeArr = this.c;
        int length = typeArr.length;
        Method method = this.f19578a;
        if (i == 0 && length == 0) {
            return method.invoke(t, new Object[0]);
        }
        Object[] objArr = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            Type type = typeArr[i2];
            if (i2 < i) {
                MUSValue mUSValue = mUSValueArr[i2];
                if (mUSValue == null || !mUSValue.isFunction()) {
                    objArr[i2] = jxh.f(type, mUSValue);
                } else if (type == pvh.class || type == Object.class) {
                    objArr[i2] = new sd0((tvh) mUSDKInstance, mUSValue.getFunctionId(), obj);
                } else if (type == MUSValue.class) {
                    objArr[i2] = mUSValue;
                } else {
                    throw new IllegalArgumentException("[prepareArguments] MUSCallback can't assign to " + type);
                }
            } else if (!type.getClass().isPrimitive()) {
                objArr[i2] = null;
            } else {
                throw new IllegalArgumentException("[prepareArguments] method argument list not match.");
            }
        }
        return method.invoke(t, objArr);
    }

    public final void f(Type[] typeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b29093", new Object[]{this, typeArr});
        } else if (typeArr != null) {
            for (Type type : typeArr) {
                if (!jxh.c(type)) {
                    throw new IllegalArgumentException("[MUSMethodInvokable] method " + this.f19578a.getName() + "() arg type: '" + type + "' is not supported");
                }
            }
        }
    }

    public Object g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("258460", new Object[]{this});
        }
        return this.d;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f19578a.getName();
    }

    public fwh(Method method, MUSThreadStrategy mUSThreadStrategy, MUSNodeProp mUSNodeProp) {
        this.f19578a = method;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        this.c = genericParameterTypes;
        this.b = mUSThreadStrategy;
        if (genericParameterTypes.length == 1) {
            Type type = genericParameterTypes[0];
            if (type == Integer.TYPE) {
                this.d = Integer.valueOf(mUSNodeProp.defaultInt());
            } else if (type == Float.TYPE) {
                this.d = Float.valueOf(mUSNodeProp.defaultFloat());
            } else if (type == Boolean.TYPE) {
                this.d = Boolean.valueOf(mUSNodeProp.defaultBoolean());
            } else {
                this.d = null;
            }
        } else {
            this.d = null;
        }
        f(genericParameterTypes);
    }
}
