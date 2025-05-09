package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ms6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tr6 implements ayb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.ultron.vfw.dataloader.a f28898a;
    public xxb b;
    public kr6 c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements kr6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.kr6
        public lr6 c(lr6 lr6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lr6) ipChange.ipc$dispatch("26f1b283", new Object[]{this, lr6Var});
            }
            return tr6.this.c.c(lr6Var);
        }
    }

    static {
        t2o.a(157286612);
        t2o.a(157286618);
    }

    public static tr6 b(com.alibaba.android.ultron.vfw.dataloader.a aVar, xxb xxbVar, kr6 kr6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tr6) ipChange.ipc$dispatch("11c710ae", new Object[]{aVar, xxbVar, kr6Var});
        }
        tr6 tr6Var = new tr6();
        tr6Var.f28898a = aVar;
        tr6Var.b = xxbVar;
        tr6Var.c = kr6Var;
        if (aVar != null && xxbVar != null) {
            return tr6Var;
        }
        throw new IllegalArgumentException("DataParserRequest params error");
    }

    @Override // tb.ayb
    public void a(ms6.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80462577", new Object[]{this, aVar});
        } else {
            this.b.a(this.f28898a, new a());
        }
    }
}
