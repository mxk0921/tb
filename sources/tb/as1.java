package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.CardModel;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class as1 implements amb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f15970a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552683);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552682);
        t2o.a(918552684);
    }

    @Override // tb.amb
    public fwa<CardModel, View> b0(CardModel cardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fwa) ipChange.ipc$dispatch("ccf99bb", new Object[]{this, cardModel});
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BaseCardService", "getCardComponent cardModel:" + cardModel, null, 4, null);
        if (cardModel == null) {
            qpu qpuVar = this.f15970a;
            if (qpuVar != null) {
                return new skt(qpuVar);
            }
            ckf.y("context");
            throw null;
        }
        fwa<CardModel, View> r = r(cardModel);
        if (r == null) {
            if (ckf.b(cardModel.getRenderMode(), "dx")) {
                qpu qpuVar2 = this.f15970a;
                if (qpuVar2 != null) {
                    r = new sg5(qpuVar2);
                } else {
                    ckf.y("context");
                    throw null;
                }
            } else {
                qpu qpuVar3 = this.f15970a;
                if (qpuVar3 != null) {
                    r = new skt(qpuVar3);
                } else {
                    ckf.y("context");
                    throw null;
                }
            }
        }
        return r;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "BaseCardService", "onCreateService", null, 4, null);
        this.f15970a = qpuVar;
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "BaseCardService", "onDestroyService", null, 4, null);
    }

    public fwa<CardModel, View> r(CardModel cardModel) {
        throw null;
    }

    public final qpu x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpu) ipChange.ipc$dispatch("cda2dfaa", new Object[]{this});
        }
        qpu qpuVar = this.f15970a;
        if (qpuVar != null) {
            return qpuVar;
        }
        ckf.y("context");
        throw null;
    }
}
