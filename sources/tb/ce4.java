package tb;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ce4 {

    /* renamed from: a  reason: collision with root package name */
    public final List<pgu> f17011a = new ArrayList();

    public void a(pgu pguVar) {
        ((ArrayList) this.f17011a).add(pguVar);
    }

    public void b(Path path) {
        ArrayList arrayList = (ArrayList) this.f17011a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            fxv.b(path, (pgu) arrayList.get(size));
        }
    }
}
