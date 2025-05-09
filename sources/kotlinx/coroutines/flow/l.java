package kotlinx.coroutines.flow;

import kotlin.Metadata;
import tb.ajq;
import tb.qp9;
import tb.yp9;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/flow/l;", "Lkotlinx/coroutines/flow/k;", "<init>", "()V", "Ltb/ajq;", "", "subscriptionCount", "Ltb/qp9;", "Lkotlinx/coroutines/flow/SharingCommand;", "a", "(Ltb/ajq;)Ltb/qp9;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class l implements k {
    @Override // kotlinx.coroutines.flow.k
    public qp9<SharingCommand> a(ajq<Integer> ajqVar) {
        return yp9.w(SharingCommand.START);
    }

    public String toString() {
        return "SharingStarted.Eagerly";
    }
}
