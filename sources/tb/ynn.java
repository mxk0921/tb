package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ynn implements mhd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final inl f32220a;
    public final m4o b;
    public final b6v c;

    static {
        t2o.a(729809974);
        t2o.a(729809989);
    }

    public ynn(inl inlVar, m4o m4oVar, b6v b6vVar) {
        this.f32220a = inlVar;
        this.b = m4oVar;
        this.c = b6vVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbfa2e3", new Object[]{this});
        } else {
            this.f32220a.f();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e60cb97", new Object[]{this});
        } else {
            this.f32220a.g();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce048aa4", new Object[]{this});
        } else {
            this.f32220a.h();
        }
    }

    @Override // tb.m6d
    public void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7339c67", new Object[]{this, view});
        } else {
            this.f32220a.d(view);
        }
    }

    @Override // tb.f5e
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8049d3", new Object[]{this});
        } else {
            this.c.f();
        }
    }

    @Override // tb.rjd
    public void g(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd46fa4d", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
        } else {
            this.b.g(str, str2, awesomeGetData, z);
        }
    }

    @Override // tb.rjd
    public void h(String str, AwesomeGetRequestParams awesomeGetRequestParams, es8 es8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b9eb1c", new Object[]{this, str, awesomeGetRequestParams, es8Var});
        } else {
            this.b.h(str, awesomeGetRequestParams, es8Var);
        }
    }

    @Override // tb.f5e
    public void j(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480e1108", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            this.c.j(z, z2, z3);
        }
    }

    @Override // tb.rjd
    public void o(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7939bdc9", new Object[]{this, str, str2, str3});
        } else {
            this.b.o(str, str2, str3);
        }
    }

    @Override // tb.rjd
    public void p(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5b5c4f", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
        } else {
            this.b.p(str, awesomeGetRequestParams, str2, z);
        }
    }

    @Override // tb.m6d
    public void q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe09044", new Object[]{this, view});
        } else {
            this.f32220a.q(view);
        }
    }

    @Override // tb.m6d
    public void s(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed21d9f", new Object[]{this, new Long(j)});
        } else {
            this.f32220a.s(j);
        }
    }
}
