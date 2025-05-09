package tb;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;
import tb.pw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pgu implements fo4, pw1.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f26086a;
    private final boolean b;
    private final List<pw1.b> c = new ArrayList();
    private final ShapeTrimPath.Type d;
    private final pw1<?, Float> e;
    private final pw1<?, Float> f;
    private final pw1<?, Float> g;

    public pgu(a aVar, ShapeTrimPath shapeTrimPath) {
        this.f26086a = shapeTrimPath.c();
        this.b = shapeTrimPath.g();
        this.d = shapeTrimPath.f();
        pw1<Float, Float> a2 = shapeTrimPath.e().a();
        this.e = a2;
        pw1<Float, Float> a3 = shapeTrimPath.b().a();
        this.f = a3;
        pw1<Float, Float> a4 = shapeTrimPath.d().a();
        this.g = a4;
        aVar.i(a2);
        aVar.i(a3);
        aVar.i(a4);
        a2.a(this);
        a3.a(this);
        a4.a(this);
    }

    public void a(pw1.b bVar) {
        this.c.add(bVar);
    }

    public pw1<?, Float> d() {
        return this.f;
    }

    public pw1<?, Float> f() {
        return this.g;
    }

    @Override // tb.pw1.b
    public void g() {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).g();
        }
    }

    @Override // tb.fo4
    public String getName() {
        return this.f26086a;
    }

    public pw1<?, Float> i() {
        return this.e;
    }

    public ShapeTrimPath.Type j() {
        return this.d;
    }

    public boolean k() {
        return this.b;
    }

    @Override // tb.fo4
    public void c(List<fo4> list, List<fo4> list2) {
    }
}
