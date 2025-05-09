package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Iterator;
import kotlin.Metadata;
import tb.pg1;
import tb.rzf;
import tb.wbp;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"androidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Ltb/xhv;", "remove", "()V", "", "current", TLogTracker.LEVEL_INFO, "getCurrent", "()I", "setCurrent", "(I)V", "", pg1.ATOM_EXT_iterator, "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableScatterSet$MutableSetWrapper$iterator$1 implements Iterator<E>, rzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int current = -1;
    private final Iterator<E> iterator;
    public final /* synthetic */ MutableScatterSet<E> this$0;

    public MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet<E> mutableScatterSet) {
        this.this$0 = mutableScatterSet;
        this.iterator = wbp.a(new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(mutableScatterSet, this, null));
    }

    public final int getCurrent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd9a243d", new Object[]{this})).intValue();
        }
        return this.current;
    }

    public final Iterator<E> getIterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("e5dd512c", new Object[]{this});
        }
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
        }
        return this.iterator.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [E, java.lang.Object] */
    @Override // java.util.Iterator
    public E next() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b9bf2c78", new Object[]{this});
        }
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41689b0b", new Object[]{this});
            return;
        }
        int i = this.current;
        if (i != -1) {
            this.this$0.removeElementAt(i);
            this.current = -1;
        }
    }

    public final void setCurrent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf3d305", new Object[]{this, new Integer(i)});
        } else {
            this.current = i;
        }
    }
}
