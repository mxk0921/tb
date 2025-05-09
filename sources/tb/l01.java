package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.invoker.binder.BindException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class l01 implements ya2<BindingApiContext, ApiContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ApiContext f23034a;

    static {
        t2o.a(839909447);
        t2o.a(839909449);
    }

    public l01(ApiContext apiContext) {
        this.f23034a = apiContext;
    }

    /* renamed from: a */
    public ApiContext bind(Class<ApiContext> cls, BindingApiContext bindingApiContext) throws BindException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiContext) ipChange.ipc$dispatch("b48154a2", new Object[]{this, cls, bindingApiContext});
        }
        if (!bindingApiContext.required() || this.f23034a != null) {
            return this.f23034a;
        }
        throw new BindException("Required ApiContext but not inject!!!");
    }
}
