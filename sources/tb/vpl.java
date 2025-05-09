package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.BindingRequest;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vpl extends g11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final List<Class<? extends Annotation>> c = Arrays.asList(BindingParam.class, BindingCallback.class, BindingRequest.class, BindingApiContext.class);
    public final JSONObject d;

    static {
        t2o.a(839909443);
    }

    public vpl(f11 f11Var, JSONObject jSONObject) {
        super(f11Var);
        this.d = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(vpl vplVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/ability/invoker/ParamBindMiddleware");
    }

    @Override // tb.e11
    public Object a(ApiContext apiContext, Object[] objArr, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dc3d69ec", new Object[]{this, apiContext, objArr, uqVar});
        }
        TMSLogger.a("ParamBindMiddleware", "bind params for method [" + this.f18200a.c.getName() + "]");
        int length = this.f18200a.e.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            try {
                objArr2[i] = c(e(i, this.f18200a), this.d, this.f18200a.e[i], uqVar, apiContext);
            } catch (Throwable th) {
                TMSLogger.c("ParamBindMiddleware", "bind error with originParams :" + this.d.toJSONString(), th);
                uqVar.a(jr.e("6", Arrays.toString(th.getStackTrace())), false);
                return null;
            }
        }
        TMSLogger.a("ParamBindMiddleware", "bind params finish. method: [" + this.f18200a.c.getName() + "], args:" + Arrays.toString(objArr2) + "");
        return this.b.a(apiContext, objArr2, uqVar);
    }

    public final Object c(Annotation annotation, JSONObject jSONObject, Class<?> cls, uq uqVar, ApiContext apiContext) {
        ya2 ya2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a6cf8203", new Object[]{this, annotation, jSONObject, cls, uqVar, apiContext});
        }
        if (annotation == null) {
            return d(cls);
        }
        Object obj = null;
        if (annotation instanceof BindingParam) {
            ya2Var = new wpl(jSONObject);
        } else if (annotation instanceof BindingRequest) {
            ya2Var = new k3o(jSONObject);
        } else if (annotation instanceof BindingCallback) {
            ya2Var = new aw2(uqVar);
        } else if (annotation instanceof BindingApiContext) {
            ya2Var = new l01(apiContext);
        } else {
            ya2Var = null;
        }
        if (ya2Var != null) {
            obj = ya2Var.bind(cls, annotation);
        }
        if (obj != null) {
            return obj;
        }
        return d(cls);
    }

    public final Object d(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1f4dc60f", new Object[]{this, cls});
        }
        if (cls.isPrimitive()) {
            return 0;
        }
        return null;
    }

    public final Annotation e(int i, f11 f11Var) {
        Annotation[] annotationArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Annotation) ipChange.ipc$dispatch("4e9708fd", new Object[]{this, new Integer(i), f11Var});
        }
        Annotation[][] annotationArr2 = f11Var.f;
        if (annotationArr2.length <= i) {
            return null;
        }
        for (Annotation annotation : annotationArr2[i]) {
            if (!(annotation == null || annotation.annotationType() == null || !this.c.contains(annotation.annotationType()))) {
                return annotation;
            }
        }
        return null;
    }
}
