package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.mnn.utils.a;
import com.etao.feimagesearch.nn.MNNManager;
import com.etao.feimagesearch.nn.NetConfig;
import tb.bs6;
import tb.kvn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class vck extends yx<q7l, r7l> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public kvn b;
    public final tk1 c = new tk1();

    static {
        t2o.a(482344989);
    }

    public vck(NetConfig netConfig) {
        super(netConfig);
    }

    public static /* synthetic */ Object ipc$super(vck vckVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/festival/ObjectDetectRunUnit");
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc43678", new Object[]{this});
        } else if (this.c.a() < 1000) {
            a.b(this.c);
        }
    }

    @Override // tb.vio
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            mzu.n(p73.f25916a, BaseMnnRunUnit.Companion.AlgoAction.DESTROY_ACTION.getUtEventName(), 19999, BaseMnnRunUnit.KEY_TASK_NAME, this.b.i(), BaseMnnRunUnit.KEY_TASK_CID, "1.0", "result", "success", "extraInfo", "");
            this.b.j();
        } catch (Exception unused) {
        }
    }

    @Override // tb.vio
    public boolean build() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac6c63f9", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        kvn kvnVar = new kvn(lg4.N1(false));
        this.b = kvnVar;
        boolean q = kvnVar.q();
        a.c(this.f32400a, System.currentTimeMillis() - currentTimeMillis);
        String str2 = p73.f25916a;
        String utEventName = BaseMnnRunUnit.Companion.AlgoAction.INIT_ACTION.getUtEventName();
        String i = this.b.i();
        if (q) {
            str = "success";
        } else {
            str = "fail";
        }
        mzu.n(str2, utEventName, 19999, BaseMnnRunUnit.KEY_TASK_NAME, i, BaseMnnRunUnit.KEY_TASK_CID, "1.0", "result", str, "extraInfo", "", "curTab", MNNManager.Companion.a().g() + "");
        return q;
    }

    public final boolean c(kvn.c cVar, int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("388416c7", new Object[]{this, cVar, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (lg4.e()) {
            return true;
        }
        if (!(cVar == null || cVar.a() == null || cVar.a().isEmpty())) {
            float J1 = lg4.J1();
            RectF rectF = new RectF();
            float f = i;
            float f2 = f / 2.0f;
            float f3 = J1 / 2.0f;
            float f4 = f3 * f;
            rectF.left = f2 - f4;
            rectF.right = f2 + f4;
            float f5 = i2;
            float f6 = f5 / 2.0f;
            float f7 = f3 * f5;
            rectF.top = f6 - f7;
            rectF.bottom = f6 + f7;
            z = false;
            for (RectF rectF2 : cVar.a()) {
                z = rectF.contains((int) (((rectF2.left * f) + (rectF2.right * f)) / 2.0f), (int) (((rectF2.top * f5) + (rectF2.bottom * f5)) / 2.0f));
                if (z) {
                    break;
                }
            }
            c4p.C("自动识别", "主体是否符合在屏幕中心区域:" + z, new Object[0]);
        }
        return z;
    }

    /* renamed from: e */
    public r7l a(q7l q7lVar, Object obj) {
        r7l r7lVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r7l) ipChange.ipc$dispatch("9359adc3", new Object[]{this, q7lVar, obj});
        }
        if (this.b == null) {
            return null;
        }
        Bitmap a2 = ((bs6.b) bs6.a(q7lVar.f26562a, q7lVar.c, q7lVar.d, q7lVar.g, q7lVar.b)).b(q7lVar.e, q7lVar.f).a();
        c4p.C(" 自动识别", "图像尺寸: width=" + a2.getWidth() + " - height=" + a2.getHeight(), new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        this.c.d();
        kvn.c u = this.b.u(a2);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        this.c.g(currentTimeMillis2);
        if (u == null || (q7lVar.h && !c(u, a2.getWidth(), a2.getHeight()))) {
            this.c.i(false);
            r7lVar = r7l.a(null, null, null, currentTimeMillis2, null);
        } else {
            this.c.i(true);
            r7lVar = r7l.a(u.a(), u.b, a2, currentTimeMillis2, null);
            mzu.n(p73.f25916a, "objectDetected", 19999, BaseMnnRunUnit.KEY_TASK_NAME, this.b.i());
            agh.r("AutoDetect", "objectDetected", "taskName: " + this.b.i());
        }
        this.c.h("{}");
        d();
        return r7lVar;
    }
}
