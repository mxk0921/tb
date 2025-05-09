package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ltb/jbo;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Ltb/q23;", "Ltb/xhv;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Ltb/q23;)V", "run", "()V", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", TplMsg.VALUE_T_NATIVE_RETURN, "Ltb/q23;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class jbo implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineDispatcher f21904a;
    private final q23<xhv> b;

    /* JADX WARN: Multi-variable type inference failed */
    public jbo(CoroutineDispatcher coroutineDispatcher, q23<? super xhv> q23Var) {
        this.f21904a = coroutineDispatcher;
        this.b = q23Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.r(this.f21904a, xhv.INSTANCE);
    }
}
