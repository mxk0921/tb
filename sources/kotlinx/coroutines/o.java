package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.coroutines.a;
import tb.ar4;
import tb.g1a;
import tb.hr3;
import tb.jr3;
import tb.o5k;
import tb.rr7;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class o extends a implements m {
    public static final o INSTANCE = new o();

    public o() {
        super(m.Key);
    }

    @Override // kotlinx.coroutines.m
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public hr3 B0(jr3 jr3Var) {
        return o5k.INSTANCE;
    }

    @Override // kotlinx.coroutines.m
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public rr7 D0(g1a<? super Throwable, xhv> g1aVar) {
        return o5k.INSTANCE;
    }

    @Override // kotlinx.coroutines.m
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public rr7 F(boolean z, boolean z2, g1a<? super Throwable, xhv> g1aVar) {
        return o5k.INSTANCE;
    }

    @Override // kotlinx.coroutines.m
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public Object f0(ar4<? super xhv> ar4Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.m
    public m getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.m
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.m
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.m
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.m
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public CancellationException u0() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.m
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public void a(CancellationException cancellationException) {
    }
}
