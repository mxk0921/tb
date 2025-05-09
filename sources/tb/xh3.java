package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.model.BaseChangeInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xh3 extends ynb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements t0e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final qk7 f31394a;

        static {
            t2o.a(615514131);
        }

        public a(qk7 qk7Var) {
            this.f31394a = qk7Var;
        }

        @Override // tb.t0e
        public void a(BaseChangeInfo baseChangeInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2402651e", new Object[]{this, baseChangeInfo});
                return;
            }
            String obj = baseChangeInfo.getChangeType().toString();
            idh.a("ChangeCollector", "Tinct changed. Type: " + obj);
            this.f31394a.q(bi3.g().f());
        }
    }

    static {
        t2o.a(615514130);
    }

    public xh3(Application application, qk7 qk7Var) {
        super(application, qk7Var);
    }

    public static /* synthetic */ Object ipc$super(xh3 xh3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/collector/ChangeCollector");
    }

    @Override // tb.ynb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = new a(this.b);
            bi3.g().d(this.d);
        }
        this.b.q(bi3.g().f());
    }
}
