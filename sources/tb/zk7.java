package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.collector.AbnormalCollector;
import com.taobao.android.diagnose.model.PageInfo;
import com.taobao.android.diagnose.scene.a;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zk7 extends nzb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f32821a = null;
    public qk7 b = null;

    static {
        t2o.a(615514120);
    }

    public static /* synthetic */ Object ipc$super(zk7 zk7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/DiagnoseProxy");
    }

    @Override // tb.nzb
    public PageInfo a() {
        PageInfo k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("b039cd1d", new Object[]{this});
        }
        qk7 qk7Var = this.b;
        if (qk7Var == null || (k = qk7Var.k()) == null) {
            return null;
        }
        return k.clone();
    }

    @Override // tb.nzb
    public void c(final String str, final tx8 tx8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8da1f06", new Object[]{this, str, tx8Var});
        } else if (this.f32821a != null) {
            al7.b().a(new Runnable() { // from class: tb.yk7
                @Override // java.lang.Runnable
                public final void run() {
                    zk7.this.g(str, tx8Var);
                }
            });
        }
    }

    @Override // tb.nzb
    public void d(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921adbfd", new Object[]{this, str, map});
        } else {
            AbnormalCollector.j().v(str, map);
        }
    }

    public void f(a aVar, qk7 qk7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8366e623", new Object[]{this, aVar, qk7Var});
            return;
        }
        this.f32821a = aVar;
        this.b = qk7Var;
        if (aVar != null) {
            aVar.o(null);
        }
    }

    public final /* synthetic */ void g(String str, tx8 tx8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbdec719", new Object[]{this, str, tx8Var});
        } else {
            this.f32821a.m(str, tx8Var);
        }
    }
}
