package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class zqx extends vke {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float f = -1.0f;
    public float[] g;
    public float h;
    public float i;
    public float j;

    static {
        t2o.a(481297410);
    }

    public zqx(ph7 ph7Var) {
        super(ph7Var);
    }

    public static /* synthetic */ Object ipc$super(zqx zqxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/regionedit/touch/ZoomTouchV2");
    }

    public final float[] B(zi9 zi9Var, zi9 zi9Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("a33c9966", new Object[]{this, zi9Var, zi9Var2});
        }
        float i = i();
        float m = m();
        eid p = p();
        ckf.d(p);
        float b = (((zi9Var.b() + zi9Var2.b()) / 2.0f) - i) / p.getImageView().getScaleX();
        eid p2 = p();
        ckf.d(p2);
        return new float[]{b, (((zi9Var.c() + zi9Var2.c()) / 2.0f) - m) / p2.getImageView().getScaleY()};
    }

    @Override // tb.vke, tb.s1e
    public boolean c(SparseArray<zi9> sparseArray, lvn lvnVar, List<lvn> list, lvn lvnVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeecbc2", new Object[]{this, sparseArray, lvnVar, list, lvnVar2})).booleanValue();
        }
        ckf.g(sparseArray, "fingerArray");
        if (sparseArray.size() > 1) {
            return true;
        }
        return false;
    }

    @Override // tb.vke, tb.s1e
    public boolean e(SparseArray<zi9> sparseArray, lvn lvnVar, List<lvn> list, lvn lvnVar2) {
        zi9 zi9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6b786c5", new Object[]{this, sparseArray, lvnVar, list, lvnVar2})).booleanValue();
        }
        ckf.g(sparseArray, "fingerArray");
        eid p = p();
        if (p == null) {
            return false;
        }
        if (sparseArray.size() < 2) {
            this.f = -1.0f;
            return true;
        }
        zi9 zi9Var2 = sparseArray.get(0);
        if (zi9Var2 == null || (zi9Var = sparseArray.get(1)) == null) {
            return true;
        }
        if (this.f < 0.0f) {
            eid p2 = p();
            ckf.d(p2);
            float scaleX = p2.getImageView().getScaleX();
            this.f = scaleX;
            this.h = 1.0f;
            this.i = 3.0f / scaleX;
            this.j = 1.0f / scaleX;
            zi9Var2.k();
            zi9Var.k();
            this.g = B(zi9Var2, zi9Var);
        }
        float sqrt = this.h + ((((float) Math.sqrt(f22.b(zi9Var2.b() - zi9Var.b()) + f22.b(zi9Var2.c() - zi9Var.c()))) - ((float) Math.sqrt(f22.b(zi9Var2.d() - zi9Var.d()) + f22.b(zi9Var2.e() - zi9Var.e())))) / ((float) Math.sqrt(f22.b(zi9Var2.f() - zi9Var.f()) + f22.b(zi9Var2.g() - zi9Var.g()))));
        this.h = sqrt;
        float e = hfn.e(this.i, hfn.b(this.j, sqrt));
        this.h = e;
        float f = this.f;
        float f2 = e * f;
        if (Math.abs(f2 - f) <= 0.1f) {
            return true;
        }
        float[] B = B(zi9Var2, zi9Var);
        p.setImageScale(f2);
        float f3 = B[0];
        float[] fArr = this.g;
        ckf.d(fArr);
        float f4 = B[1];
        float[] fArr2 = this.g;
        ckf.d(fArr2);
        z((f3 - fArr[0]) * f2, (f4 - fArr2[1]) * f2, false);
        return true;
    }

    @Override // tb.vke, tb.s1e
    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return 3;
    }

    @Override // tb.vke, tb.e22, tb.s1e
    public void b(lvn lvnVar, List<lvn> list, lvn lvnVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce62a8b", new Object[]{this, lvnVar, list, lvnVar2});
            return;
        }
        A();
        jzu.e("picZoom", new String[0]);
        this.f = -1.0f;
    }
}
