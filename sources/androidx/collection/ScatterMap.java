package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.pg1;
import tb.rzf;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001VB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\u001a\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u001c\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u0015H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010 \u001a\u00020\u001a26\u0010\u001b\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010!J6\u0010\"\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u001a0\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001dJ6\u0010#\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010\u001dJ-\u0010%\u001a\u00020\u00062\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b%\u0010&J-\u0010\u0007\u001a\u00020\u00062\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010&J\r\u0010'\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J-\u0010'\u001a\u00020\u00162\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010)J\u0018\u0010*\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b,\u0010+J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00028\u0001¢\u0006\u0004\b-\u0010+J}\u00106\u001a\u0002052\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\b\b\u0002\u00101\u001a\u00020.2\b\b\u0002\u00102\u001a\u00020\u00162\b\b\u0002\u00103\u001a\u00020.2:\b\u0002\u00104\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020.\u0018\u00010\u001eH\u0007¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0016H\u0016¢\u0006\u0004\b8\u0010(J\u001a\u0010:\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b:\u0010+J\u000f\u0010;\u001a\u000205H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u000205H\u0000¢\u0006\u0004\b=\u0010<J\u0018\u0010A\u001a\u00020\u00162\u0006\u0010\f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b?\u0010@J\u0019\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010B¢\u0006\u0004\bC\u0010DR\u001c\u0010F\u001a\u00020E8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bF\u0010G\u0012\u0004\bH\u0010\u0005R$\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030I8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010\u0005R$\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030I8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bM\u0010K\u0012\u0004\bN\u0010\u0005R\u0016\u0010O\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR\u0011\u0010S\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bR\u0010(R\u0011\u0010U\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bT\u0010(\u0082\u0001\u0001W\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006X"}, d2 = {"Landroidx/collection/ScatterMap;", "K", "V", "", "<init>", "()V", "", pg1.ATOM_EXT_any, "()Z", "none", "isEmpty", "isNotEmpty", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Ljava/lang/Object;Ltb/d1a;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "Ltb/xhv;", pg1.ATOM_EXT_block, "forEachIndexed", "(Ltb/g1a;)V", "Lkotlin/Function2;", "value", pg1.ATOM_EXT_forEach, "(Ltb/u1a;)V", "forEachKey", "forEachValue", "predicate", "all", "(Ltb/u1a;)Z", "count", "()I", "(Ltb/u1a;)I", "contains", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ltb/u1a;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "asDebugString$collection", "asDebugString", "findKeyIndex$collection", "(Ljava/lang/Object;)I", "findKeyIndex", "", "asMap", "()Ljava/util/Map;", "", "metadata", "[J", "getMetadata$annotations", "", "keys", "[Ljava/lang/Object;", "getKeys$annotations", pg1.ATOM_values, "getValues$annotations", "_capacity", TLogTracker.LEVEL_INFO, "_size", "getCapacity", "capacity", "getSize", "size", "MapWrapper", "Landroidx/collection/MutableScatterMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ScatterMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public Object[] values;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0090\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0013H\u0016R&\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Landroidx/collection/ScatterMap$MapWrapper;", "", "(Landroidx/collection/ScatterMap;)V", pg1.ATOM_EXT_entries, "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", pg1.ATOM_values, "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class MapWrapper implements Map<K, V>, rzf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public MapWrapper() {
        }

        @Override // java.util.Map
        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("4a6cc3a1", new Object[]{this, k, biFunction});
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("a44a0690", new Object[]{this, k, function});
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("bf62b5d1", new Object[]{this, k, biFunction});
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, obj})).booleanValue();
            }
            return ScatterMap.this.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, obj})).booleanValue();
            }
            return ScatterMap.this.containsValue(obj);
        }

        @Override // java.util.Map
        public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
            return getEntries();
        }

        @Override // java.util.Map
        public V get(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, obj});
            }
            return ScatterMap.this.get(obj);
        }

        public Set<Map.Entry<K, V>> getEntries() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("6aee8610", new Object[]{this});
            }
            return new ScatterMap$MapWrapper$entries$1(ScatterMap.this);
        }

        public Set<K> getKeys() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("2d9cf820", new Object[]{this});
            }
            return new ScatterMap$MapWrapper$keys$1(ScatterMap.this);
        }

        public int getSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
            }
            return ScatterMap.this._size;
        }

        public Collection<V> getValues() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Collection) ipChange.ipc$dispatch("7d4fad88", new Object[]{this});
            }
            return new ScatterMap$MapWrapper$values$1(ScatterMap.this);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            return ScatterMap.this.isEmpty();
        }

        @Override // java.util.Map
        public final /* bridge */ Set<K> keySet() {
            return getKeys();
        }

        @Override // java.util.Map
        public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("2bdd79fe", new Object[]{this, k, v, biFunction});
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V put(K k, V v) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("dbe24724", new Object[]{this, k, v});
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6703aacc", new Object[]{this, map});
                return;
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V putIfAbsent(K k, V v) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("244c40e", new Object[]{this, k, v});
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, obj});
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V replace(K k, V v) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("f6c00f1f", new Object[]{this, k, v});
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c6e31b7", new Object[]{this, biFunction});
                return;
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Map
        public final /* bridge */ Collection<V> values() {
            return getValues();
        }

        @Override // java.util.Map
        public boolean remove(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b2235247", new Object[]{this, obj, obj2})).booleanValue();
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean replace(K k, V v, V v2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e19f593", new Object[]{this, k, v, v2})).booleanValue();
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ ScatterMap(a07 a07Var) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eff78371", new Object[0]);
        }
    }

    public static /* synthetic */ void getMetadata$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01fcfac", new Object[0]);
        }
    }

    public static /* synthetic */ void getValues$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da75911f", new Object[0]);
        }
    }

    public static /* synthetic */ String joinToString$default(ScatterMap scatterMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, u1a u1aVar, int i2, Object obj) {
        CharSequence charSequence5;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0b23ca1", new Object[]{scatterMap, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, u1aVar, new Integer(i2), obj});
        }
        if (obj == null) {
            if ((i2 & 1) != 0) {
                charSequence = ", ";
            }
            CharSequence charSequence6 = "";
            if ((i2 & 2) != 0) {
                charSequence5 = charSequence6;
            } else {
                charSequence5 = charSequence2;
            }
            if ((i2 & 4) == 0) {
                charSequence6 = charSequence3;
            }
            if ((i2 & 8) != 0) {
                i3 = -1;
            } else {
                i3 = i;
            }
            if ((i2 & 16) != 0) {
                charSequence4 = "...";
            }
            if ((i2 & 32) != 0) {
                u1aVar = null;
            }
            return scatterMap.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4, u1aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean any() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdb02877", new Object[]{this})).booleanValue() : this._size != 0;
    }

    public final Map<K, V> asMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c6425bc6", new Object[]{this});
        }
        return new MapWrapper();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L_0x0094;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(K r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.collection.ScatterMap.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0020
            java.lang.String r5 = "b06c8586"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r0
            r6[r2] = r1
            java.lang.Object r1 = r4.ipc$dispatch(r5, r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x0020:
            if (r1 == 0) goto L_0x0027
            int r4 = r18.hashCode()
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r4 = r4 ^ r5
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r0._capacity
            int r4 = r4 >>> 7
            r4 = r4 & r6
            r7 = 0
        L_0x0038:
            long[] r8 = r0.metadata
            int r9 = r4 >> 3
            r10 = r4 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            int r9 = r9 + r2
            r13 = r8[r9]
            int r8 = 64 - r10
            long r8 = r13 << r8
            long r13 = (long) r10
            long r13 = -r13
            r10 = 63
            long r13 = r13 >> r10
            long r8 = r8 & r13
            long r8 = r8 | r11
            long r10 = (long) r5
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r8
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L_0x0064:
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x0083
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r4
            r14 = r14 & r6
            java.lang.Object[] r15 = r0.keys
            r15 = r15[r14]
            boolean r15 = tb.ckf.b(r15, r1)
            if (r15 == 0) goto L_0x007d
            goto L_0x008f
        L_0x007d:
            r14 = 1
            long r14 = r10 - r14
            long r10 = r10 & r14
            goto L_0x0064
        L_0x0083:
            long r10 = ~r8
            r16 = 6
            long r10 = r10 << r16
            long r8 = r8 & r10
            long r8 = r8 & r12
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0094
            r14 = -1
        L_0x008f:
            if (r14 < 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r2 = 0
        L_0x0093:
            return r2
        L_0x0094:
            int r7 = r7 + 8
            int r4 = r4 + r7
            r4 = r4 & r6
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.contains(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L_0x0094;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(K r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.collection.ScatterMap.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0020
            java.lang.String r5 = "a5a3b867"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r0
            r6[r2] = r1
            java.lang.Object r1 = r4.ipc$dispatch(r5, r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x0020:
            if (r1 == 0) goto L_0x0027
            int r4 = r18.hashCode()
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r4 = r4 ^ r5
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r0._capacity
            int r4 = r4 >>> 7
            r4 = r4 & r6
            r7 = 0
        L_0x0038:
            long[] r8 = r0.metadata
            int r9 = r4 >> 3
            r10 = r4 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            int r9 = r9 + r2
            r13 = r8[r9]
            int r8 = 64 - r10
            long r8 = r13 << r8
            long r13 = (long) r10
            long r13 = -r13
            r10 = 63
            long r13 = r13 >> r10
            long r8 = r8 & r13
            long r8 = r8 | r11
            long r10 = (long) r5
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r8
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L_0x0064:
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x0083
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r4
            r14 = r14 & r6
            java.lang.Object[] r15 = r0.keys
            r15 = r15[r14]
            boolean r15 = tb.ckf.b(r15, r1)
            if (r15 == 0) goto L_0x007d
            goto L_0x008f
        L_0x007d:
            r14 = 1
            long r14 = r10 - r14
            long r10 = r10 & r14
            goto L_0x0064
        L_0x0083:
            long r10 = ~r8
            r16 = 6
            long r10 = r10 << r16
            long r8 = r8 & r10
            long r8 = r8 & r12
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0094
            r14 = -1
        L_0x008f:
            if (r14 < 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r2 = 0
        L_0x0093:
            return r2
        L_0x0094:
            int r7 = r7 + 8
            int r4 = r4 + r7
            r4 = r4 & r6
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.containsKey(java.lang.Object):boolean");
    }

    public final int count() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("507fb609", new Object[]{this})).intValue() : getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScatterMap)) {
            return false;
        }
        ScatterMap scatterMap = (ScatterMap) obj;
        if (scatterMap.getSize() != getSize()) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            Object obj3 = objArr2[i4];
                            if (obj3 == null) {
                                if (scatterMap.get(obj2) != null || !scatterMap.containsKey(obj2)) {
                                    break loop0;
                                }
                            } else if (!ckf.b(obj3, scatterMap.get(obj2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final int findKeyIndex$collection(K k) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c8de7cc", new Object[]{this, k})).intValue();
        }
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * ScatterMapKt.MurmurHashC1;
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this._capacity;
        int i7 = i4 >>> 7;
        while (true) {
            int i8 = i7 & i6;
            long[] jArr = this.metadata;
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (i5 * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (~j2) & (j2 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i8) & i6;
                if (ckf.b(this.keys[numberOfTrailingZeros], k)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i7 = i8 + i2;
        }
    }

    public final void forEach(u1a<? super K, ? super V, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be275416", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            u1aVar.invoke(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void forEachIndexed(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335d0df4", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            g1aVar.invoke(Integer.valueOf((i << 3) + i3));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void forEachValue(g1a<? super V, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571a6bf4", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            g1aVar.invoke(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L_0x008b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(K r15) {
        /*
            r14 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.collection.ScatterMap.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0016
            java.lang.String r3 = "83ba8cd9"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r14
            r4[r0] = r15
            java.lang.Object r15 = r2.ipc$dispatch(r3, r4)
            return r15
        L_0x0016:
            if (r15 == 0) goto L_0x001d
            int r2 = r15.hashCode()
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r2 = r2 * r3
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r14._capacity
            int r2 = r2 >>> 7
        L_0x002c:
            r2 = r2 & r4
            long[] r5 = r14.metadata
            int r6 = r2 >> 3
            r7 = r2 & 7
            int r7 = r7 << 3
            r8 = r5[r6]
            long r8 = r8 >>> r7
            int r6 = r6 + r0
            r10 = r5[r6]
            int r5 = 64 - r7
            long r5 = r10 << r5
            long r10 = (long) r7
            long r10 = -r10
            r7 = 63
            long r10 = r10 >> r7
            long r5 = r5 & r10
            long r5 = r5 | r8
            long r7 = (long) r3
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r9
            long r7 = r7 ^ r5
            long r9 = r7 - r9
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L_0x0059:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0078
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            java.lang.Object[] r12 = r14.keys
            r12 = r12[r11]
            boolean r12 = tb.ckf.b(r12, r15)
            if (r12 == 0) goto L_0x0072
            goto L_0x0082
        L_0x0072:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L_0x0059
        L_0x0078:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x008b
            r11 = -1
        L_0x0082:
            if (r11 < 0) goto L_0x0089
            java.lang.Object[] r15 = r14.values
            r15 = r15[r11]
            goto L_0x008a
        L_0x0089:
            r15 = 0
        L_0x008a:
            return r15
        L_0x008b:
            int r1 = r1 + 8
            int r2 = r2 + r1
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.get(java.lang.Object):java.lang.Object");
    }

    public final int getCapacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e903eaa", new Object[]{this})).intValue();
        }
        return this._capacity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L_0x0091;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V getOrDefault(K r18, V r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            r3 = 0
            r4 = 3
            com.android.alibaba.ip.runtime.IpChange r5 = androidx.collection.ScatterMap.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001d
            java.lang.String r6 = "8b37602b"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            r4[r2] = r1
            r1 = 2
            r4[r1] = r19
            java.lang.Object r1 = r5.ipc$dispatch(r6, r4)
            return r1
        L_0x001d:
            if (r1 == 0) goto L_0x0024
            int r5 = r18.hashCode()
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r5 = r5 ^ r6
            r6 = r5 & 127(0x7f, float:1.78E-43)
            int r7 = r0._capacity
            int r5 = r5 >>> 7
        L_0x0033:
            r5 = r5 & r7
            long[] r8 = r0.metadata
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << r4
            r11 = r8[r9]
            long r11 = r11 >>> r10
            int r9 = r9 + r2
            r13 = r8[r9]
            int r8 = 64 - r10
            long r8 = r13 << r8
            long r13 = (long) r10
            long r13 = -r13
            r10 = 63
            long r13 = r13 >> r10
            long r8 = r8 & r13
            long r8 = r8 | r11
            long r10 = (long) r6
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r8
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L_0x005f:
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x007d
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> r4
            int r14 = r14 + r5
            r14 = r14 & r7
            java.lang.Object[] r15 = r0.keys
            r15 = r15[r14]
            boolean r15 = tb.ckf.b(r15, r1)
            if (r15 == 0) goto L_0x0077
            goto L_0x0089
        L_0x0077:
            r14 = 1
            long r14 = r10 - r14
            long r10 = r10 & r14
            goto L_0x005f
        L_0x007d:
            long r10 = ~r8
            r16 = 6
            long r10 = r10 << r16
            long r8 = r8 & r10
            long r8 = r8 & r12
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0091
            r14 = -1
        L_0x0089:
            if (r14 < 0) goto L_0x0090
            java.lang.Object[] r1 = r0.values
            r1 = r1[r14]
            return r1
        L_0x0090:
            return r19
        L_0x0091:
            int r3 = r3 + 8
            int r5 = r5 + r3
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.getOrDefault(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final V getOrElse(K k, d1a<? extends V> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("3debd976", new Object[]{this, k, d1aVar});
        }
        ckf.g(d1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        V v = get(k);
        return v == null ? (V) d1aVar.invoke() : v;
    }

    public final int getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this._size;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j) < 128) {
                            int i8 = (i4 << 3) + i7;
                            Object obj = objArr[i8];
                            Object obj2 = objArr2[i8];
                            if (obj != null) {
                                i = obj.hashCode();
                            } else {
                                i = 0;
                            }
                            if (obj2 != null) {
                                i2 = obj2.hashCode();
                            } else {
                                i2 = 0;
                            }
                            i5 += i2 ^ i;
                        }
                        j >>= 8;
                    }
                    if (i6 != 8) {
                        return i5;
                    }
                }
                if (i4 == length) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
        }
        return i3;
    }

    public final boolean isNotEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8421800f", new Object[]{this})).booleanValue();
        }
        if (this._size != 0) {
            return true;
        }
        return false;
    }

    public final String joinToString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d15b303", new Object[]{this}) : joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final boolean none() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53eed7c3", new Object[]{this})).booleanValue();
        }
        if (this._size == 0) {
            return true;
        }
        return false;
    }

    private ScatterMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        Object[] objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        this.keys = objArr;
        this.values = objArr;
    }

    public final boolean any(u1a<? super K, ? super V, Boolean> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937fde9c", new Object[]{this, u1aVar})).booleanValue();
        }
        ckf.g(u1aVar, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (u1aVar.invoke(objArr[i4], objArr2[i4]).booleanValue()) {
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final int count(u1a<? super K, ? super V, Boolean> u1aVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d38202e", new Object[]{this, u1aVar})).intValue();
        }
        ckf.g(u1aVar, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            if (u1aVar.invoke(objArr[i6], objArr2[i6]).booleanValue()) {
                                i3++;
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        return i;
    }

    public final String joinToString(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f9af1df", new Object[]{this, charSequence});
        }
        ckf.g(charSequence, "separator");
        return joinToString$default(this, charSequence, null, null, 0, null, null, 62, null);
    }

    public final String asDebugString$collection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f852329", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("{metadata=[");
        int capacity = getCapacity();
        for (int i = 0; i < capacity; i++) {
            long j = (this.metadata[i >> 3] >> ((i & 7) << 3)) & 255;
            if (j == 128) {
                sb.append("Empty");
            } else if (j == 254) {
                sb.append(Constant.VALUE_NAME_VPR_DELETED);
            } else {
                sb.append(j);
            }
            sb.append(", ");
        }
        sb.append("], keys=[");
        int length = this.keys.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(this.keys[i2]);
            sb.append(", ");
        }
        sb.append("], values=[");
        int length2 = this.values.length;
        for (int i3 = 0; i3 < length2; i3++) {
            sb.append(this.values[i3]);
            sb.append(", ");
        }
        sb.append("]}");
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this._size == 0;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f485cbb", new Object[]{this, charSequence, charSequence2});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, null, 60, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1159f397", new Object[]{this, charSequence, charSequence2, charSequence3});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, null, 56, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b6367e6", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i)});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, null, 48, null);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i2++;
                            if (i2 < this._size) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        ckf.f(sb2, "s.append('}').toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83e0edc2", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(charSequence4, "truncated");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, charSequence4, null, 32, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, u1a<? super K, ? super V, ? extends CharSequence> u1aVar) {
        StringBuilder sb;
        int i2;
        char c = 7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11ff923d", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, u1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(charSequence4, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            StringBuilder sb3 = sb2;
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = i4;
                    int i8 = 0;
                    while (i8 < i6) {
                        if ((j & 255) < 128) {
                            int i9 = (i3 << 3) + i8;
                            Object obj = objArr[i9];
                            Object obj2 = objArr2[i9];
                            if (i7 == i) {
                                sb = sb3;
                                sb.append(charSequence4);
                                break loop0;
                            }
                            objArr = objArr;
                            sb3 = sb3;
                            if (i7 != 0) {
                                sb3.append(charSequence);
                            }
                            if (u1aVar == null) {
                                sb3.append(obj);
                                sb3.append('=');
                                sb3.append(obj2);
                            } else {
                                sb3.append((CharSequence) u1aVar.invoke(obj, obj2));
                            }
                            i2 = 1;
                            i7++;
                            i5 = 8;
                        } else {
                            objArr = objArr;
                            sb3 = sb3;
                            i2 = 1;
                        }
                        j >>= i5;
                        i8 += i2;
                    }
                    objArr = objArr;
                    sb = sb3;
                    if (i6 != i5) {
                        break;
                    }
                    i4 = i7;
                } else {
                    objArr = objArr;
                    sb = sb3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                sb3 = sb;
                c = 7;
            }
        } else {
            sb = sb2;
        }
        sb.append(charSequence3);
        String sb4 = sb.toString();
        ckf.f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    public final boolean all(u1a<? super K, ? super V, Boolean> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d154e7d1", new Object[]{this, u1aVar})).booleanValue();
        }
        ckf.g(u1aVar, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (!u1aVar.invoke(objArr[i4], objArr2[i4]).booleanValue()) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final boolean containsValue(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, v})).booleanValue();
        }
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && ckf.b(v, objArr[(i << 3) + i3])) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final void forEachKey(g1a<? super K, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe36cf62", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        Object[] objArr = this.keys;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            g1aVar.invoke(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
