package androidx.core.os;

import android.os.OutcomeReceiver;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ar4;
import tb.xfl;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"R", "", "E", "Ltb/ar4;", "Landroid/os/OutcomeReceiver;", "asOutcomeReceiver", "(Ltb/ar4;)Landroid/os/OutcomeReceiver;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class OutcomeReceiverKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <R, E extends Throwable> OutcomeReceiver<R, E> asOutcomeReceiver(ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return xfl.a(ipChange.ipc$dispatch("d742c867", new Object[]{ar4Var}));
        }
        return xfl.a(new ContinuationOutcomeReceiver(ar4Var));
    }
}
