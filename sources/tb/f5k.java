package tb;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class f5k extends a implements yse {
    @Override // tb.yse
    public boolean isActive() {
        return true;
    }

    public final String p(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Object h = h();
        ckf.e(h, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        boolean z = true;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) h; !ckf.b(lockFreeLinkedListNode, this); lockFreeLinkedListNode = lockFreeLinkedListNode.i()) {
            if (lockFreeLinkedListNode instanceof ruf) {
                ruf rufVar = (ruf) lockFreeLinkedListNode;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(rufVar);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        if (dv6.b()) {
            return p("Active");
        }
        return super.toString();
    }

    @Override // tb.yse
    public f5k getList() {
        return this;
    }
}
