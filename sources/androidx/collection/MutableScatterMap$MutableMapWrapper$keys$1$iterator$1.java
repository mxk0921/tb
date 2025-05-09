package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Iterator;
import kotlin.Metadata;
import tb.pg1;
import tb.rzf;
import tb.wbp;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Ltb/xhv;", "remove", "()V", "", "", pg1.ATOM_EXT_iterator, "Ljava/util/Iterator;", "current", TLogTracker.LEVEL_INFO, "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1 implements Iterator<K>, rzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int current = -1;
    private final Iterator<Integer> iterator;
    public final /* synthetic */ MutableScatterMap<K, V> this$0;

    public MutableScatterMap$MutableMapWrapper$keys$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
        this.iterator = wbp.a(new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(mutableScatterMap, null));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
        }
        return this.iterator.hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, K] */
    @Override // java.util.Iterator
    public K next() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b9bf2c78", new Object[]{this});
        }
        int intValue = this.iterator.next().intValue();
        this.current = intValue;
        return this.this$0.keys[intValue];
    }

    @Override // java.util.Iterator
    public void remove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41689b0b", new Object[]{this});
            return;
        }
        int i = this.current;
        if (i >= 0) {
            this.this$0.removeValueAt(i);
            this.current = -1;
        }
    }
}
