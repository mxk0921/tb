package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class e22 implements s1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public eid f18221a;
    public final ph7 b;

    static {
        t2o.a(481297398);
        t2o.a(481297401);
    }

    public e22(ph7 ph7Var) {
        this.b = ph7Var;
    }

    @Override // tb.s1e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.s1e
    public void b(lvn lvnVar, List<lvn> list, lvn lvnVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce62a8b", new Object[]{this, lvnVar, list, lvnVar2});
        }
    }

    public boolean c(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fbd44d5", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).booleanValue();
        }
        if (f2 > f || f > f3) {
            return false;
        }
        return true;
    }

    @Override // tb.s1e
    public void d(eid eidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b905c7dd", new Object[]{this, eidVar});
            return;
        }
        ckf.g(eidVar, "editView");
        this.f18221a = eidVar;
    }

    public void g(RectF rectF, RectF rectF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69564df2", new Object[]{this, rectF, rectF2});
            return;
        }
        ckf.g(rectF, "dest");
        ckf.g(rectF2, "src");
        eid eidVar = this.f18221a;
        if (eidVar != null) {
            rectF.set(rectF2);
            rectF.left *= eidVar.getImageView().getScaleX();
            rectF.top *= eidVar.getImageView().getScaleY();
            rectF.right = rectF.left + (eidVar.getImageView().getScaleX() * rectF2.width());
            rectF.bottom = rectF.top + (eidVar.getImageView().getScaleY() * rectF2.height());
            rectF.offset(i(), m());
        }
    }

    public float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0bdcba3", new Object[]{this})).floatValue();
        }
        eid eidVar = this.f18221a;
        if (eidVar == null) {
            return 0.0f;
        }
        return eidVar.getImageView().getHeight() * eidVar.getImageView().getScaleY();
    }

    public float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("752a07c3", new Object[]{this})).floatValue();
        }
        eid eidVar = this.f18221a;
        if (eidVar == null) {
            return 0.0f;
        }
        return eidVar.getImageView().getLeft() + eidVar.getImageView().getTranslationX();
    }

    public float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfde7258", new Object[]{this})).floatValue();
        }
        eid eidVar = this.f18221a;
        if (eidVar == null) {
            return 0.0f;
        }
        return eidVar.getImageView().getBottom();
    }

    public float k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9107ffb4", new Object[]{this})).floatValue();
        }
        eid eidVar = this.f18221a;
        if (eidVar == null) {
            return 0.0f;
        }
        return eidVar.getImageView().getLeft();
    }

    public float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9412add6", new Object[]{this})).floatValue();
        }
        eid eidVar = this.f18221a;
        if (eidVar == null) {
            return 0.0f;
        }
        return eidVar.getImageView().getTop();
    }

    public float m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4097e7e7", new Object[]{this})).floatValue();
        }
        eid eidVar = this.f18221a;
        if (eidVar == null) {
            return 0.0f;
        }
        return eidVar.getImageView().getTop() + eidVar.getImageView().getTranslationY();
    }

    public float n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7f3f918", new Object[]{this})).floatValue();
        }
        eid eidVar = this.f18221a;
        if (eidVar == null) {
            return 0.0f;
        }
        return eidVar.getImageView().getWidth() * eidVar.getImageView().getScaleX();
    }

    public final ph7 o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ph7) ipChange.ipc$dispatch("4d4f006f", new Object[]{this});
        }
        return this.b;
    }

    public final eid p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eid) ipChange.ipc$dispatch("2ce7b88e", new Object[]{this});
        }
        return this.f18221a;
    }

    public boolean r(zi9 zi9Var) {
        eid eidVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c120436a", new Object[]{this, zi9Var})).booleanValue();
        }
        if (zi9Var == null || (eidVar = this.f18221a) == null || zi9Var.h() < eidVar.getTouchSlop()) {
            return false;
        }
        return true;
    }

    public boolean q(zi9 zi9Var, float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b85815bc", new Object[]{this, zi9Var, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
        }
        ckf.g(zi9Var, yj4.PARAM_SEARCH_KEYWORD_POS);
        return c(zi9Var.f(), f, f3) && c(zi9Var.g(), f2, f4);
    }
}
