package androidx.collection.internal;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;
import tb.pg1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {"T", "Landroidx/collection/internal/Lock;", "Lkotlin/Function0;", pg1.ATOM_EXT_block, "synchronized", "(Landroidx/collection/internal/Lock;Ltb/d1a;)Ljava/lang/Object;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LockExtKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: synchronized  reason: not valid java name */
    public static final <T> T m24synchronized(Lock lock, d1a<? extends T> d1aVar) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8da4c377", new Object[]{lock, d1aVar});
        }
        ckf.g(lock, "<this>");
        ckf.g(d1aVar, pg1.ATOM_EXT_block);
        synchronized (lock) {
            t = (T) d1aVar.invoke();
        }
        return t;
    }
}
