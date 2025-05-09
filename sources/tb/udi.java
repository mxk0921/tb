package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.e2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class udi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ue7 f29307a;
    public g9e b;
    public final dh7 c;
    public final cxj d;
    public final ViewGroup e;
    public faw f;
    public boolean g = false;
    public a h;
    public final j83 i;
    public final abw j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a();

        void b(String str, JSONObject jSONObject);

        void c(SuccPhenixEvent succPhenixEvent, boolean z);

        void d(boolean z);

        HashMap<String, String> e();
    }

    static {
        t2o.a(352321637);
        t2o.a(352321647);
    }

    public udi(cxj cxjVar, ViewGroup viewGroup, dh7 dh7Var, j83 j83Var) {
        this.d = cxjVar;
        this.e = viewGroup;
        this.c = dh7Var;
        this.i = j83Var;
        this.j = new abw(dh7Var, cxjVar);
    }

    public final boolean a(ue7 ue7Var, g9e g9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c219ad84", new Object[]{this, ue7Var, g9eVar})).booleanValue();
        }
        if (ue7Var == null || g9eVar == null || !g9eVar.isDataValid()) {
            return false;
        }
        return true;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eef9d15", new Object[]{this});
            return;
        }
        faw fawVar = this.f;
        if (fawVar != null) {
            fawVar.I(false);
            this.f = null;
        }
    }

    public void c() {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63517c2", new Object[]{this});
            return;
        }
        faw fawVar = this.f;
        if (fawVar != null) {
            str = fawVar.o();
            i = this.f.n();
        } else {
            str = null;
            i = e2.f2684a;
        }
        txj.e(txj.TAG_RENDER, "NdVideoRec:dw-destroy media clearPlayerAndStatus。 videoId:" + str + " hCode:" + i);
        b();
        this.g = false;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        faw fawVar = this.f;
        if (fawVar != null) {
            fawVar.h();
        }
    }

    public final void e(g9e g9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("168b6e0c", new Object[]{this, g9eVar});
            return;
        }
        faw a2 = b7m.a(this.d, this.c, this.e, this.f, g9eVar.getType(), this.i, g9eVar.l(), g9eVar.f());
        this.f = a2;
        this.j.w(a2);
    }

    public j7c f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j7c) ipChange.ipc$dispatch("d96bf11", new Object[]{this});
        }
        faw fawVar = this.f;
        if (fawVar != null) {
            return fawVar.k();
        }
        return null;
    }

    public qrc g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qrc) ipChange.ipc$dispatch("a70367d1", new Object[]{this});
        }
        faw fawVar = this.f;
        if (!(fawVar instanceof faw)) {
            return null;
        }
        return fawVar.m();
    }

    public void i(String str) {
        faw fawVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976827e5", new Object[]{this, str});
            return;
        }
        if (!(!"scroll".equals(str) || this.f29307a == null || (fawVar = this.f) == null)) {
            fawVar.Z(System.currentTimeMillis());
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("videoActionType", sj4.VIDEO_ACTION_TYPE_UPDOWNSWITCH);
            this.f.X(hashMap);
        }
        y(str);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        faw fawVar = this.f;
        if (fawVar != null) {
            fawVar.L("destroy");
            this.f.I(false);
            this.g = false;
            wmm.d(this.c, this.f29307a);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198b316e", new Object[]{this});
            return;
        }
        faw fawVar = this.f;
        if (fawVar != null && !this.g) {
            this.g = true;
            fawVar.J();
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c35aa2", new Object[]{this});
            return;
        }
        faw fawVar = this.f;
        if (fawVar != null && !this.g) {
            fawVar.F();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa32fdb4", new Object[]{this});
            return;
        }
        faw fawVar = this.f;
        if (!(fawVar == null || this.f29307a == null)) {
            fawVar.Z(System.currentTimeMillis());
        }
        y("supplementAppear");
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9216aa0a", new Object[]{this});
            return;
        }
        faw fawVar = this.f;
        if (fawVar != null) {
            fawVar.O();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
        } else {
            y("willAppear");
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7817f9", new Object[]{this});
            return;
        }
        faw fawVar = this.f;
        if (fawVar != null) {
            fawVar.H("scroll");
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed33c62f", new Object[]{this});
            return;
        }
        faw fawVar = this.f;
        if (fawVar != null) {
            fawVar.I(true);
            this.g = false;
        }
    }

    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
            return;
        }
        faw fawVar = this.f;
        if (fawVar != null) {
            fawVar.U(z);
        }
    }

    public void w(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cda1701", new Object[]{this, aVar});
        } else {
            this.h = aVar;
        }
    }

    public void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            return;
        }
        faw fawVar = this.f;
        if (fawVar != null) {
            fawVar.W(z);
        }
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f4e00d", new Object[]{this, str});
            return;
        }
        txj.e(txj.TAG_RENDER, "tryRequestAndStartVideo: " + str);
        if (this.f != null) {
            n();
            this.f.K(str);
        }
    }

    public void z(ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ff326d", new Object[]{this, ue7Var});
        } else if (this.f != null && ue7Var != null) {
            try {
                HashMap<String, String> hashMap = new HashMap<>();
                this.c.a0().b(ue7Var.b, hashMap, ue7Var);
                v22.e(this.d.h(), this.d.j(), hashMap, ue7Var);
                this.f.M(hashMap);
            } catch (Exception e) {
                txj.f("new_detail异常", "更新播放器参数失败", e);
            }
        }
    }

    public final boolean h(g9e g9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2250a36a", new Object[]{this, g9eVar})).booleanValue();
        }
        if (this.b == null || g9eVar == null || !g9eVar.isDataValid() || !this.b.isDataValid() || TextUtils.equals(this.b.getVideoId(), g9eVar.getVideoId())) {
            return false;
        }
        q0j.p(q0j.SCENE_MEDIA_PLAYER, q0j.ERROR_CODE_PLAYER_MEDIA_INCONSISTENT, "videoid不一致，old ：" + this.b.getVideoId() + ", new: " + g9eVar.getVideoId(), null);
        return true;
    }

    public boolean j(ue7 ue7Var, g9e g9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a983f5f", new Object[]{this, ue7Var, g9eVar})).booleanValue();
        }
        if (!a(ue7Var, g9eVar)) {
            c();
            return false;
        }
        e(g9eVar);
        boolean k = k(ue7Var, g9eVar);
        o();
        n();
        this.j.v(ue7Var);
        if (k) {
            this.f.K("videoIdInconsistent");
        }
        return true;
    }

    public final boolean k(ue7 ue7Var, g9e g9eVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("becc5d2b", new Object[]{this, ue7Var, g9eVar})).booleanValue();
        }
        faw fawVar = this.f;
        if (fawVar != null) {
            ue7 ue7Var2 = this.f29307a;
            if (ue7Var2 != null && ue7Var != ue7Var2) {
                fawVar.I(false);
                this.g = false;
            } else if (h(g9eVar)) {
                txj.e(txj.TAG_RENDER, "videoid不一致，此时是否正在播放(包括已请求播放但还未准备好的情况)：" + this.f.r());
                boolean r = this.f.r();
                this.f.I(true);
                this.g = false;
                z = r;
            }
            this.f29307a = ue7Var;
            this.b = g9eVar;
            this.f.E(ue7Var, g9eVar);
            this.f.V(this.h);
        }
        return z;
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506c035", new Object[]{this, str});
            return;
        }
        faw fawVar = this.f;
        if (fawVar != null) {
            fawVar.L(str);
            if ("scroll".equals(str)) {
                this.f.I(true);
                this.g = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
        if (r3.equals("seek") == false) goto L_0x0042;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(com.alibaba.fastjson.JSONObject r8) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.udi.t(com.alibaba.fastjson.JSONObject):void");
    }
}
