package tb;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class w2m<S> extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<puk<S>> f30411a = new LinkedHashSet<>();

    public boolean p2(puk<S> pukVar) {
        return this.f30411a.add(pukVar);
    }

    public void r2() {
        this.f30411a.clear();
    }
}
