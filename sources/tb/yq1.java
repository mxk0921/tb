package tb;

import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class yq1<V, O> implements xx0<V, O> {

    /* renamed from: a  reason: collision with root package name */
    public final List<w4g<V>> f32276a;

    public yq1(List<w4g<V>> list) {
        this.f32276a = list;
    }

    @Override // tb.xx0
    public List<w4g<V>> b() {
        return this.f32276a;
    }

    @Override // tb.xx0
    public boolean c() {
        List<w4g<V>> list = this.f32276a;
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() != 1 || !list.get(0).h()) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<w4g<V>> list = this.f32276a;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(list.toArray()));
        }
        return sb.toString();
    }
}
