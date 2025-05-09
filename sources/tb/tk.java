package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class tk extends bp<AURANextRPCIO, AURAParseIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEXT_RPC_SERVICE_CODE = "aura.service.nextrpc";
    public sk c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends pt<AURAParseIO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pt f28758a;

        public a(tk tkVar, pt ptVar) {
            this.f28758a = ptVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1584757281) {
                super.c((yk) objArr[0]);
                return null;
            } else if (hashCode == -1339997787) {
                super.b((mi) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/service/nextrpc/AURANextRPCService$1");
            }
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            super.b(miVar);
            this.f28758a.b(miVar);
        }

        @Override // tb.pt
        public void c(yk<AURAParseIO> ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            super.c(ykVar);
            rbb g = ck.g();
            g.e("NextRPC服务请求结束 " + System.currentTimeMillis(), ck.b.b().i("AURA/performance").a());
            AURATraceUtil.b(3);
            this.f28758a.c(ykVar);
        }
    }

    static {
        t2o.a(80740458);
    }

    public static /* synthetic */ Object ipc$super(tk tkVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -576780562) {
            super.B((AURAInputData) objArr[0], (pt) objArr[1]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/service/nextrpc/AURANextRPCService");
        }
    }

    @Override // tb.bp
    public void B(AURAInputData<AURANextRPCIO> aURAInputData, pt<AURAParseIO> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9f06ee", new Object[]{this, aURAInputData, ptVar});
            return;
        }
        super.B(aURAInputData, ptVar);
        AURATraceUtil.a(3, "AURANextRPCService");
        if (this.c == null) {
            this.c = new sk();
        }
        this.c.c(r(), x(), aURAInputData, new a(this, ptVar));
    }

    @Override // tb.gn, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            super.onCreate(loVar, yiVar);
        }
    }

    @Override // tb.gn, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        sk skVar = this.c;
        if (skVar != null) {
            skVar.b();
        }
    }
}
