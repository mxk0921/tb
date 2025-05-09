package tb;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class sch {
    public static final int FAILURE = 2;
    public static final int SUCCESS = 1;
    public static final int UNDECIDED = 0;

    /* renamed from: a  reason: collision with root package name */
    public static final Object f27948a = new u1r("CONDITION_FALSE");

    public static final LockFreeLinkedListNode a(Object obj) {
        vzn vznVar;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        if (obj instanceof vzn) {
            vznVar = (vzn) obj;
        } else {
            vznVar = null;
        }
        if (vznVar != null && (lockFreeLinkedListNode = vznVar.f30370a) != null) {
            return lockFreeLinkedListNode;
        }
        ckf.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (LockFreeLinkedListNode) obj;
    }
}
