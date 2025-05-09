package tb;

import kotlin.Metadata;
import kotlinx.coroutines.channels.i;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Ltb/gbp;", "T", "Ltb/sp9;", "Lkotlinx/coroutines/channels/i;", "channel", "<init>", "(Lkotlinx/coroutines/channels/i;)V", "value", "Ltb/xhv;", "emit", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "a", "Lkotlinx/coroutines/channels/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class gbp<T> implements sp9<T> {

    /* renamed from: a  reason: collision with root package name */
    private final i<T> f19873a;

    /* JADX WARN: Multi-variable type inference failed */
    public gbp(i<? super T> iVar) {
        this.f19873a = iVar;
    }

    @Override // tb.sp9
    public Object emit(T t, ar4<? super xhv> ar4Var) {
        Object d = this.f19873a.d(t, ar4Var);
        if (d == dkf.d()) {
            return d;
        }
        return xhv.INSTANCE;
    }
}
