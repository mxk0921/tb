package tb;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;
import tb.pw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fhp implements bul, pw1.b {
    public final boolean b;
    public final LottieDrawable c;
    public final mhp d;
    public boolean e;

    /* renamed from: a  reason: collision with root package name */
    public final Path f19302a = new Path();
    public final ce4 f = new ce4();

    public fhp(LottieDrawable lottieDrawable, a aVar, qhp qhpVar) {
        qhpVar.b();
        this.b = qhpVar.d();
        this.c = lottieDrawable;
        mhp d = qhpVar.c().a();
        this.d = d;
        aVar.i(d);
        d.a(this);
    }

    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override // tb.fo4
    public void c(List<fo4> list, List<fo4> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            fo4 fo4Var = list.get(i);
            if (fo4Var instanceof pgu) {
                pgu pguVar = (pgu) fo4Var;
                if (pguVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f.a(pguVar);
                    pguVar.a(this);
                }
            }
            if (fo4Var instanceof ohp) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((ohp) fo4Var);
            }
        }
        this.d.q(arrayList);
    }

    @Override // tb.pw1.b
    public void g() {
        a();
    }

    @Override // tb.bul
    public Path getPath() {
        boolean z = this.e;
        Path path = this.f19302a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.b) {
            this.e = true;
            return path;
        }
        Path h = this.d.h();
        if (h == null) {
            return path;
        }
        path.set(h);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.b(path);
        this.e = true;
        return path;
    }
}
