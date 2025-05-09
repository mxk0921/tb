package tb;

import com.alipay.android.msp.framework.offline.CashierOperationReceiver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class z3j extends e8m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537976);
    }

    public static /* synthetic */ Object ipc$super(z3j z3jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/plugin/MtbTracePlugin");
    }

    @Override // tb.e8m, tb.z9d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d496726e", new Object[]{this});
        } else {
            uv6.d("onCreate");
        }
    }

    @Override // tb.e8m, tb.z9d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59172fa7", new Object[]{this});
        } else {
            uv6.g("onCreate");
        }
    }

    @Override // tb.e8m, tb.z9d
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e7c19f", new Object[]{this, str});
            return;
        }
        ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        uv6.d("onBindItemView|".concat(str));
    }

    @Override // tb.e8m, tb.z9d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b01cec2", new Object[]{this});
        } else {
            uv6.g("onCreateView");
        }
    }

    @Override // tb.e8m, tb.z9d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d74291", new Object[]{this});
        } else {
            uv6.g("onPreloadMtb");
        }
    }

    @Override // tb.e8m, tb.z9d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f8d25d", new Object[]{this});
        } else {
            uv6.d("onResume");
        }
    }

    @Override // tb.e8m, tb.z9d
    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc819339", new Object[]{this, str});
            return;
        }
        ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        uv6.g("onCreateItemView|".concat(str));
    }

    @Override // tb.e8m, tb.z9d
    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846f1040", new Object[]{this, str});
            return;
        }
        ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        uv6.d("onCreateItemView|".concat(str));
    }

    @Override // tb.e8m, tb.z9d
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1ebf56", new Object[]{this});
        } else {
            uv6.g("onResume");
        }
    }

    @Override // tb.e8m, tb.z9d
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655b6c9", new Object[]{this});
        } else {
            uv6.d("onCreateView");
        }
    }

    @Override // tb.e8m, tb.z9d
    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e51058", new Object[]{this, str});
            return;
        }
        ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        uv6.g("onBindItemView|".concat(str));
    }

    @Override // tb.e8m, tb.z9d
    public void p(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34970bf", new Object[]{this, str, new Long(j)});
            return;
        }
        String str2 = "onPageInteractive|" + str;
        uv6.d(str2);
        uv6.g(str2);
    }

    @Override // tb.e8m, tb.z9d
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39d72d8", new Object[]{this});
        } else {
            uv6.d("onPreloadMtb");
        }
    }
}
