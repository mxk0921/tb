package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class re8 implements n2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f27316a;
    public final ISceneService b;
    public e6d c;
    public xxd d;
    public ejb e;
    public kgb f;

    static {
        t2o.a(486539275);
        t2o.a(488636420);
    }

    public re8(cfc cfcVar) {
        this.f27316a = cfcVar;
        this.b = (ISceneService) cfcVar.a(ISceneService.class);
    }

    @Override // tb.n2c
    public kgb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kgb) ipChange.ipc$dispatch("52d3986e", new Object[]{this});
        }
        if (this.f == null) {
            this.f = new w51(this.f27316a, this.b);
        }
        return this.f;
    }

    @Override // tb.n2c
    public ejb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ejb) ipChange.ipc$dispatch("444107d2", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new xd2(this.f27316a, this.b);
        }
        return this.e;
    }

    @Override // tb.n2c
    public View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a6d5acba", new Object[]{this, context});
        }
        return this.b.createView(context);
    }

    @Override // tb.n2c
    public xxd d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xxd) ipChange.ipc$dispatch("adc84256", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new vqs(this.f27316a, this.b);
        }
        return this.d;
    }

    @Override // tb.n2c
    public e6d e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e6d) ipChange.ipc$dispatch("71045caa", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new bnl(this.f27316a, this.b);
        }
        return this.c;
    }
}
