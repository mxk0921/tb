package tb;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class vzn {

    /* renamed from: a  reason: collision with root package name */
    public final LockFreeLinkedListNode f30370a;

    public vzn(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f30370a = lockFreeLinkedListNode;
    }

    public String toString() {
        return "Removed[" + this.f30370a + ']';
    }
}
