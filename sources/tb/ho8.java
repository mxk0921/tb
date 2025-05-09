package tb;

import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final /* synthetic */ class ho8 implements qpm {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ io8 f20779a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Set e;

    public /* synthetic */ ho8(io8 io8Var, boolean z, Set set, int i, Set set2) {
        this.f20779a = io8Var;
        this.b = z;
        this.c = set;
        this.d = i;
        this.e = set2;
    }

    public final boolean a(Object obj) {
        boolean p;
        Set set = this.c;
        int i = this.d;
        p = this.f20779a.p(this.b, set, i, this.e, (ExperimentV5) obj);
        return p;
    }
}
