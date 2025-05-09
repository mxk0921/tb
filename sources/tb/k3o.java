package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.annotation.BindingRequest;
import com.taobao.themis.kernel.ability.invoker.binder.BindException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class k3o<T> implements ya2<BindingRequest, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f22384a;

    static {
        t2o.a(839909452);
        t2o.a(839909449);
    }

    public k3o(JSONObject jSONObject) {
        this.f22384a = jSONObject;
    }

    /* renamed from: a */
    public T bind(Class<T> cls, BindingRequest bindingRequest) throws BindException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("66c07817", new Object[]{this, cls, bindingRequest});
        }
        JSONObject jSONObject = this.f22384a;
        if (jSONObject != null) {
            try {
                return (T) JSON.toJavaObject(jSONObject, cls);
            } catch (Throwable th) {
                throw new BindException(th.getMessage());
            }
        } else {
            throw new BindException("input JSON is null");
        }
    }
}
