package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.m;
import com.taobao.android.dinamicx.p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ad5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f15675a;
    public av5 b;

    static {
        t2o.a(444596473);
    }

    public ad5(av5 av5Var) {
        if (av5Var == null) {
            DXEngineConfig dXEngineConfig = new DXEngineConfig(DXEngineConfig.DX_DEFAULT_BIZTYPE);
            this.f15675a = dXEngineConfig.f7286a;
            this.b = new av5(dXEngineConfig);
            return;
        }
        this.b = av5Var;
        this.f15675a = av5Var.c().f7286a;
    }

    public m b(av5 av5Var, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("f453cc87", new Object[]{this, av5Var, pVar});
        }
        if (eb5.w()) {
            return new y66(av5Var, pVar);
        }
        return new m(av5Var, pVar);
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.f15675a;
    }

    public DXEngineConfig d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("2f487a5b", new Object[]{this});
        }
        return this.b.c();
    }

    public av5 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (av5) ipChange.ipc$dispatch("351370a9", new Object[]{this});
        }
        return this.b;
    }

    public ad5(DXEngineConfig dXEngineConfig) {
        this.f15675a = (dXEngineConfig == null ? new DXEngineConfig(DXEngineConfig.DX_DEFAULT_BIZTYPE) : dXEngineConfig).f7286a;
    }
}
