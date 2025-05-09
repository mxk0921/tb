package tb;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class oia extends x4g<nia> {
    public final nia i;

    public oia(List<w4g<nia>> list) {
        super(list);
        int i = 0;
        nia niaVar = list.get(0).b;
        i = niaVar != null ? niaVar.c() : i;
        this.i = new nia(new float[i], new int[i]);
    }

    /* renamed from: p */
    public nia i(w4g<nia> w4gVar, float f) {
        nia niaVar = this.i;
        niaVar.d(w4gVar.b, w4gVar.c, f);
        return niaVar;
    }
}
