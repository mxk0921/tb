package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltb/qgq;", "Ltb/vu4;", "callerFrame", "Ljava/lang/StackTraceElement;", "stackTraceElement", "<init>", "(Ltb/vu4;Ljava/lang/StackTraceElement;)V", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "a", "Ltb/vu4;", "getCallerFrame", "()Ltb/vu4;", TplMsg.VALUE_T_NATIVE_RETURN, "Ljava/lang/StackTraceElement;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class qgq implements vu4 {

    /* renamed from: a  reason: collision with root package name */
    private final vu4 f26743a;
    public final StackTraceElement b;

    public qgq(vu4 vu4Var, StackTraceElement stackTraceElement) {
        this.f26743a = vu4Var;
        this.b = stackTraceElement;
    }

    @Override // tb.vu4
    public vu4 getCallerFrame() {
        return this.f26743a;
    }

    @Override // tb.vu4
    public StackTraceElement getStackTraceElement() {
        return this.b;
    }
}
