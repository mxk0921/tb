package com.taobao.themis.kernel.network;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.kernel.network.RequestParams;
import java.io.Serializable;
import tb.p8s;
import tb.r64;
import tb.t2o;
import tb.z54;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class a<E extends RequestParams, T extends Serializable, D> extends b<E, T, D> implements IMtopInnerAdapter.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final z54<T, D> f13593a;
    public final E b;

    static {
        t2o.a(839909846);
        t2o.a(839909851);
    }

    public a(E e, z54<T, D> z54Var) {
        this.b = e;
        if (z54Var != null) {
            this.f13593a = z54Var;
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/network/AsyncRequestClient");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d64ec2", new Object[]{this});
        } else {
            ((IMtopInnerAdapter) p8s.g(IMtopInnerAdapter.class)).requestAsync(this.b, this);
        }
    }

    public void b(IMtopInnerAdapter.Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd699037", new Object[]{this, response});
        } else if (this.f13593a != null) {
            r64<T, D> buildResponse = buildResponse(response);
            this.f13593a.onFailure(buildResponse.b, buildResponse.c, buildResponse.e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(IMtopInnerAdapter.Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf998de", new Object[]{this, response});
        } else if (this.f13593a != null) {
            r64<T, D> buildResponse = buildResponse(response);
            if (buildResponse.f27135a) {
                this.f13593a.onSuccess(buildResponse.d);
            } else {
                this.f13593a.onFailure(buildResponse.b, buildResponse.c, buildResponse.e);
            }
        }
    }
}
