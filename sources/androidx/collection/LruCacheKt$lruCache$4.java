package androidx.collection;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.ArtcParams;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.u1a;
import tb.xhv;
import tb.y1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/collection/LruCacheKt$lruCache$4", "Landroidx/collection/LruCache;", "key", "value", "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", "oldValue", "newValue", "Ltb/xhv;", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "collection"}, k = 1, mv = {1, 8, 0}, xi = ArtcParams.SD180pVideoParams.HEIGHT)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LruCacheKt$lruCache$4 extends LruCache<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g1a<K, V> $create;
    public final /* synthetic */ y1a<Boolean, K, V, V, xhv> $onEntryRemoved;
    public final /* synthetic */ u1a<K, V, Integer> $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LruCacheKt$lruCache$4(int i, u1a<? super K, ? super V, Integer> u1aVar, g1a<? super K, ? extends V> g1aVar, y1a<? super Boolean, ? super K, ? super V, ? super V, xhv> y1aVar) {
        super(i);
        this.$sizeOf = u1aVar;
        this.$create = g1aVar;
        this.$onEntryRemoved = y1aVar;
    }

    public static /* synthetic */ Object ipc$super(LruCacheKt$lruCache$4 lruCacheKt$lruCache$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/LruCacheKt$lruCache$4");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [V, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [V, java.lang.Object] */
    @Override // androidx.collection.LruCache
    public V create(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("863f8c73", new Object[]{this, k});
        }
        ckf.g(k, "key");
        return this.$create.invoke(k);
    }

    @Override // androidx.collection.LruCache
    public void entryRemoved(boolean z, K k, V v, V v2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), k, v, v2});
            return;
        }
        ckf.g(k, "key");
        ckf.g(v, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), k, v, v2);
    }

    @Override // androidx.collection.LruCache
    public int sizeOf(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33c6036a", new Object[]{this, k, v})).intValue();
        }
        ckf.g(k, "key");
        ckf.g(v, "value");
        return this.$sizeOf.invoke(k, v).intValue();
    }
}
