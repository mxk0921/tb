package tb;

import kotlin.coroutines.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class oq4 implements uu4 {

    /* renamed from: a  reason: collision with root package name */
    public final d f25566a;

    public oq4(d dVar) {
        this.f25566a = dVar;
    }

    @Override // tb.uu4
    public d getCoroutineContext() {
        return this.f25566a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
