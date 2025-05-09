package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b!\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0010¢\u0006\u0004\b\u0007\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0015\u0010\u0010\u001a\u00020\u000e8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Ltb/sct;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "submissionTime", "Ltb/gdt;", "taskContext", "<init>", "(JLtb/gdt;)V", "()V", "a", "J", TplMsg.VALUE_T_NATIVE_RETURN, "Ltb/gdt;", "", "()I", "mode", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class sct implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public long f27955a;
    public gdt b;

    public sct(long j, gdt gdtVar) {
        this.f27955a = j;
        this.b = gdtVar;
    }

    public final int a() {
        return this.b.b();
    }

    public sct() {
        this(0L, vft.NonBlockingContext);
    }
}
