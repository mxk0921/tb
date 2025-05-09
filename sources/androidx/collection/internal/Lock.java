package androidx.collection.internal;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;
import tb.pg1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"Landroidx/collection/internal/Lock;", "", "<init>", "()V", "T", "Lkotlin/Function0;", pg1.ATOM_EXT_block, "synchronizedImpl", "(Ltb/d1a;)Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class Lock {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final <T> T synchronizedImpl(d1a<? extends T> d1aVar) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("31f4ea30", new Object[]{this, d1aVar});
        }
        ckf.g(d1aVar, pg1.ATOM_EXT_block);
        synchronized (this) {
            t = (T) d1aVar.invoke();
        }
        return t;
    }
}
