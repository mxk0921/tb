package tb;

import android.graphics.Path;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mhp extends pw1<ghp, Path> {
    public final ghp i = new ghp();
    public final Path j = new Path();
    public List<ohp> k;

    public mhp(List<w4g<ghp>> list) {
        super(list);
    }

    /* renamed from: p */
    public Path i(w4g<ghp> w4gVar, float f) {
        ghp ghpVar = this.i;
        ghpVar.c(w4gVar.b, w4gVar.c, f);
        List<ohp> list = this.k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ghpVar = this.k.get(size).h(ghpVar);
            }
        }
        Path path = this.j;
        uvi.i(ghpVar, path);
        return path;
    }

    public void q(List<ohp> list) {
        this.k = list;
    }
}
