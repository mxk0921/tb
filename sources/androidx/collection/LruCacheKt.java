package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.u1a;
import tb.xhv;
import tb.y1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0082\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000328\b\u0006\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u00052%\b\u0006\u0010\f\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2d\b\u0006\u0010\u0013\u001a^\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"", "K", "V", "", "maxSize", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "key", "value", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "Ltb/xhv;", "onEntryRemoved", "Landroidx/collection/LruCache;", "lruCache", "(ILtb/u1a;Ltb/g1a;Ltb/y1a;)Landroidx/collection/LruCache;", "", "MAX_SIZE", "J", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LruCacheKt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long MAX_SIZE = 2147483647L;

    public static final <K, V> LruCache<K, V> lruCache(int i, u1a<? super K, ? super V, Integer> u1aVar, g1a<? super K, ? extends V> g1aVar, y1a<? super Boolean, ? super K, ? super V, ? super V, xhv> y1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("6e3c9fd0", new Object[]{new Integer(i), u1aVar, g1aVar, y1aVar});
        }
        ckf.g(u1aVar, "sizeOf");
        ckf.g(g1aVar, "create");
        ckf.g(y1aVar, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i, u1aVar, g1aVar, y1aVar);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, u1a u1aVar, g1a g1aVar, y1a y1aVar, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("bfb6a222", new Object[]{new Integer(i), u1aVar, g1aVar, y1aVar, new Integer(i2), obj});
        }
        if ((i2 & 2) != 0) {
            u1aVar = LruCacheKt$lruCache$1.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            g1aVar = LruCacheKt$lruCache$2.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            y1aVar = LruCacheKt$lruCache$3.INSTANCE;
        }
        ckf.g(u1aVar, "sizeOf");
        ckf.g(g1aVar, "create");
        ckf.g(y1aVar, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i, u1aVar, g1aVar, y1aVar);
    }
}
