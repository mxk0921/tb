package tb;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o5i {

    /* renamed from: a  reason: collision with root package name */
    public final List<pw1<ghp, Path>> f25150a;
    public final List<pw1<Integer, Integer>> b;
    public final List<Mask> c;

    public o5i(List<Mask> list) {
        this.c = list;
        this.f25150a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.f25150a).add(list.get(i).b().a());
            lx0 c = list.get(i).c();
            ((ArrayList) this.b).add(c.a());
        }
    }

    public List<pw1<ghp, Path>> a() {
        return this.f25150a;
    }

    public List<Mask> b() {
        return this.c;
    }

    public List<pw1<Integer, Integer>> c() {
        return this.b;
    }
}
