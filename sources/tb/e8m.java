package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.security.realidentity.o;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.android.msp.framework.offline.CashierOperationReceiver;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0003J!\u0010\u0012\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J!\u0010\u0015\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u001d\u0010\u001f\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001cH\u0016¢\u0006\u0004\b%\u0010 ¨\u0006&"}, d2 = {"Ltb/e8m;", "Ltb/z9d;", "<init>", "()V", "Ltb/xhv;", "r", "f", "a", TplMsg.VALUE_T_NATIVE_RETURN, "n", "d", bmv.MSGTYPE_INTERVAL, "m", "s", "", "pageName", "", "timeMillis", "h", "(Ljava/lang/String;J)V", "e", "p", CashierOperationReceiver.PARAMS_IDENTIFY, "l", "(Ljava/lang/String;)V", at.k, "c", o.b, "", "Ltb/h3j;", "list", at.j, "(Ljava/util/List;)V", "Lcom/alibaba/fastjson/JSONArray;", "nameList", at.f, "(Lcom/alibaba/fastjson/JSONArray;)V", "q", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e8m implements z9d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537977);
        t2o.a(745537971);
    }

    @Override // tb.z9d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d496726e", new Object[]{this});
        }
    }

    @Override // tb.z9d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59172fa7", new Object[]{this});
        }
    }

    @Override // tb.z9d
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e7c19f", new Object[]{this, str});
        } else {
            ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        }
    }

    @Override // tb.z9d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b01cec2", new Object[]{this});
        }
    }

    @Override // tb.z9d
    public void e(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40f842f", new Object[]{this, str, new Long(j)});
        }
    }

    @Override // tb.z9d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d74291", new Object[]{this});
        }
    }

    @Override // tb.z9d
    public void g(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b6f765", new Object[]{this, jSONArray});
        } else {
            ckf.h(jSONArray, "nameList");
        }
    }

    @Override // tb.z9d
    public void h(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ab8dbf", new Object[]{this, str, new Long(j)});
        }
    }

    @Override // tb.z9d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f8d25d", new Object[]{this});
        }
    }

    @Override // tb.z9d
    public void j(List<h3j> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df37a422", new Object[]{this, list});
        } else {
            ckf.h(list, "list");
        }
    }

    @Override // tb.z9d
    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc819339", new Object[]{this, str});
        } else {
            ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        }
    }

    @Override // tb.z9d
    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846f1040", new Object[]{this, str});
        } else {
            ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        }
    }

    @Override // tb.z9d
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1ebf56", new Object[]{this});
        }
    }

    @Override // tb.z9d
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655b6c9", new Object[]{this});
        }
    }

    @Override // tb.z9d
    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e51058", new Object[]{this, str});
        } else {
            ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        }
    }

    @Override // tb.z9d
    public void p(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34970bf", new Object[]{this, str, new Long(j)});
        }
    }

    @Override // tb.z9d
    public void q(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f266ab", new Object[]{this, list});
        } else {
            ckf.h(list, "nameList");
        }
    }

    @Override // tb.z9d
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39d72d8", new Object[]{this});
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
        }
    }
}
