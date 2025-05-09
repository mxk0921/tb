package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import tb.qjd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jon implements qjd.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mhd f22121a;

    static {
        t2o.a(729809971);
        t2o.a(729809984);
    }

    public jon(mhd mhdVar) {
        this.f22121a = mhdVar;
    }

    @Override // tb.qjd.b
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3987b210", new Object[]{this, str, str2, str3});
        } else {
            this.f22121a.o(str, str2, str3);
        }
    }

    @Override // tb.qjd.b
    public void b(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d586a494", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
        } else {
            this.f22121a.g(str, str2, awesomeGetData, z);
        }
    }

    @Override // tb.qjd.a
    public void c(String str, AwesomeGetRequestParams awesomeGetRequestParams, es8 es8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5acd92be", new Object[]{this, str, awesomeGetRequestParams, es8Var});
        } else {
            this.f22121a.h(str, awesomeGetRequestParams, es8Var);
        }
    }

    @Override // tb.qjd.b
    public void d(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78df556", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
        } else {
            this.f22121a.p(str, awesomeGetRequestParams, str2, z);
        }
    }
}
