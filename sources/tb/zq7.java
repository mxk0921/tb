package tb;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class zq7 {
    public static final zq7 INSTANCE = new zq7();

    /* renamed from: a  reason: collision with root package name */
    public static final CoroutineDispatcher f32944a = e57.INSTANCE;
    public static final CoroutineDispatcher b = s17.INSTANCE;

    static {
        q qVar = q.INSTANCE;
    }

    public static final CoroutineDispatcher a() {
        return f32944a;
    }

    public static final CoroutineDispatcher b() {
        return b;
    }

    public static final fzh c() {
        return nzh.dispatcher;
    }
}
