package kotlin.collections.builders;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import tb.a07;
import tb.bmv;
import tb.c20;
import tb.ckf;
import tb.gl4;
import tb.hfn;
import tb.mtg;
import tb.pg1;
import tb.rzf;
import tb.vzf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\f\b\u0000\u0018\u0000 \u0093\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\f\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001BG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\u0013J\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00028\u0000H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010\u0013J\u0017\u0010,\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010\u001eJ\u0017\u0010-\u001a\u00020\f2\u0006\u0010#\u001a\u00028\u0000H\u0002¢\u0006\u0004\b-\u0010%J\u0017\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00028\u0001H\u0002¢\u0006\u0004\b/\u0010%J\u0017\u00101\u001a\u00020\u00172\u0006\u00100\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u0010\u0013J\u0017\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\u0013J\u001f\u00106\u001a\u00020\u001c2\u000e\u00105\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000304H\u0002¢\u0006\u0004\b6\u00107J#\u0010:\u001a\u00020\u001c2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0002¢\u0006\u0004\b:\u0010;J)\u0010>\u001a\u00020\u001c2\u0018\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001080<H\u0002¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u001cH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u001c2\u0006\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u001c2\u0006\u0010.\u001a\u00028\u0001H\u0016¢\u0006\u0004\bF\u0010EJ\u001a\u0010G\u001a\u0004\u0018\u00018\u00012\u0006\u0010#\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bG\u0010HJ!\u0010I\u001a\u0004\u0018\u00018\u00012\u0006\u0010#\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u0001H\u0016¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u00020\u00172\u0014\u0010=\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104H\u0016¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u0004\u0018\u00018\u00012\u0006\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0004\bM\u0010HJ\u000f\u0010N\u001a\u00020\u0017H\u0016¢\u0006\u0004\bN\u0010\u0011J\u001a\u0010O\u001a\u00020\u001c2\b\u00105\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\bO\u0010EJ\u000f\u0010P\u001a\u00020\fH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010V\u001a\u00020\u0017H\u0000¢\u0006\u0004\bU\u0010\u0011J\u0017\u0010X\u001a\u00020\f2\u0006\u0010#\u001a\u00028\u0000H\u0000¢\u0006\u0004\bW\u0010%J\u0017\u0010Z\u001a\u00020\u001c2\u0006\u0010#\u001a\u00028\u0000H\u0000¢\u0006\u0004\bY\u0010EJ#\u0010\\\u001a\u00020\u001c2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0000¢\u0006\u0004\b[\u0010;J\u001b\u0010_\u001a\u00020\u001c2\n\u0010]\u001a\u0006\u0012\u0002\b\u00030<H\u0000¢\u0006\u0004\b^\u0010?J#\u0010a\u001a\u00020\u001c2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0000¢\u0006\u0004\b`\u0010;J\u0017\u0010d\u001a\u00020\u001c2\u0006\u0010b\u001a\u00028\u0001H\u0000¢\u0006\u0004\bc\u0010EJ\u001b\u0010h\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010eH\u0000¢\u0006\u0004\bf\u0010gJ\u001b\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010iH\u0000¢\u0006\u0004\bj\u0010kJ\u001b\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0000¢\u0006\u0004\bn\u0010oR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010qR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010qR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010rR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010rR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010sR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010sR\u0016\u0010t\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010sR\u0016\u0010u\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010sR$\u0010v\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bv\u0010s\u001a\u0004\bw\u0010QR\u001e\u0010y\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u001e\u0010|\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R%\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R(\u0010\u0081\u0001\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010CR\u0016\u0010\u0085\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010QR\u001e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0086\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001e\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u008a\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R+\u0010\u0090\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u008e\u00010\u0086\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0088\u0001R\u0016\u0010\u0092\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010Q¨\u0006\u009a\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "", "maxProbeDistance", pg1.ATOM_length, "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "", "writeReplace", "()Ljava/lang/Object;", "Ltb/xhv;", "registerModification", "n", "ensureExtraCapacity", "extraCapacity", "", "shouldCompact", "(I)Z", "minCapacity", "ensureCapacity", "allocateValuesArray", "()[Ljava/lang/Object;", "key", "hash", "(Ljava/lang/Object;)I", "updateHashArray", "compact", "(Z)V", "newHashSize", "rehash", bmv.MSGTYPE_INTERVAL, "putRehash", "findKey", "value", "findValue", "index", "removeEntryAt", "removedHash", "removeHashAt", "", "other", "contentEquals", "(Ljava/util/Map;)Z", "", gl4.CONFIG_ENTRY, "putEntry", "(Ljava/util/Map$Entry;)Z", "", "from", "putAllEntries", "(Ljava/util/Collection;)Z", CartRecommendRefreshScene.build, "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", "remove", pg1.ATOM_EXT_clear, "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "checkIsMutable$kotlin_stdlib", "checkIsMutable", "addKey$kotlin_stdlib", "addKey", "removeKey$kotlin_stdlib", "removeKey", "containsEntry$kotlin_stdlib", "containsEntry", "m", "containsAllEntries$kotlin_stdlib", "containsAllEntries", "removeEntry$kotlin_stdlib", "removeEntry", "element", "removeValue$kotlin_stdlib", "removeValue", "Lkotlin/collections/builders/MapBuilder$e;", "keysIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$e;", "keysIterator", "Lkotlin/collections/builders/MapBuilder$f;", "valuesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$f;", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$b;", "entriesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$b;", "entriesIterator", "[Ljava/lang/Object;", "[I", TLogTracker.LEVEL_INFO, "hashShift", "modCount", "size", "getSize", "Lkotlin/collections/builders/b;", "keysView", "Lkotlin/collections/builders/b;", "Lkotlin/collections/builders/c;", "valuesView", "Lkotlin/collections/builders/c;", "Lkotlin/collections/builders/a;", "entriesView", "Lkotlin/collections/builders/a;", "isReadOnly", "Z", "isReadOnly$kotlin_stdlib", "getHashSize", "hashSize", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getValues", "()Ljava/util/Collection;", pg1.ATOM_values, "", "getEntries", pg1.ATOM_EXT_entries, "getCapacity$kotlin_stdlib", "capacity", "Companion", "a", "d", "e", "f", TplMsg.VALUE_T_NATIVE_RETURN, "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, vzf {
    public static final a Companion = new a(null);
    private static final MapBuilder Empty;
    private static final int INITIAL_CAPACITY = 8;
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
    private static final int MAGIC = -1640531527;
    private static final int TOMBSTONE = -1;
    private kotlin.collections.builders.a<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private kotlin.collections.builders.b<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private kotlin.collections.builders.c<V> valuesView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int c(int i) {
            return Integer.highestOneBit(hfn.c(i, 1) * 3);
        }

        public final int d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        public final MapBuilder e() {
            return MapBuilder.Empty;
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, rzf {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            ckf.g(mapBuilder, "map");
        }

        /* renamed from: i */
        public c<K, V> next() {
            a();
            if (c() < ((MapBuilder) e()).length) {
                int c = c();
                g(c + 1);
                h(c);
                c<K, V> cVar = new c<>(e(), d());
                f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void j(StringBuilder sb) {
            ckf.g(sb, "sb");
            if (c() < ((MapBuilder) e()).length) {
                int c = c();
                g(c + 1);
                h(c);
                Object obj = ((MapBuilder) e()).keysArray[d()];
                if (obj == e()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = ((MapBuilder) e()).valuesArray;
                ckf.d(objArr);
                Object obj2 = objArr[d()];
                if (obj2 == e()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                f();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int k() {
            int i;
            if (c() < ((MapBuilder) e()).length) {
                int c = c();
                g(c + 1);
                h(c);
                Object obj = ((MapBuilder) e()).keysArray[d()];
                int i2 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = ((MapBuilder) e()).valuesArray;
                ckf.d(objArr);
                Object obj2 = objArr[d()];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                }
                int i3 = i ^ i2;
                f();
                return i3;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, vzf.a {

        /* renamed from: a  reason: collision with root package name */
        public final MapBuilder<K, V> f15238a;
        public final int b;
        public final int c;

        public c(MapBuilder<K, V> mapBuilder, int i) {
            ckf.g(mapBuilder, "map");
            this.f15238a = mapBuilder;
            this.b = i;
            this.c = ((MapBuilder) mapBuilder).modCount;
        }

        public final void a() {
            if (((MapBuilder) this.f15238a).modCount != this.c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (ckf.b(entry.getKey(), getKey()) && ckf.b(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            a();
            return (K) ((MapBuilder) this.f15238a).keysArray[this.b];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            a();
            Object[] objArr = ((MapBuilder) this.f15238a).valuesArray;
            ckf.d(objArr);
            return (V) objArr[this.b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i;
            K key = getKey();
            int i2 = 0;
            if (key != null) {
                i = key.hashCode();
            } else {
                i = 0;
            }
            V value = getValue();
            if (value != null) {
                i2 = value.hashCode();
            }
            return i ^ i2;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            a();
            MapBuilder<K, V> mapBuilder = this.f15238a;
            mapBuilder.checkIsMutable$kotlin_stdlib();
            Object[] allocateValuesArray = mapBuilder.allocateValuesArray();
            int i = this.b;
            V v2 = (V) allocateValuesArray[i];
            allocateValuesArray[i] = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class d<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final MapBuilder<K, V> f15239a;
        public int b;
        public int c = -1;
        public int d;

        public d(MapBuilder<K, V> mapBuilder) {
            ckf.g(mapBuilder, "map");
            this.f15239a = mapBuilder;
            this.d = ((MapBuilder) mapBuilder).modCount;
            f();
        }

        public final void a() {
            if (((MapBuilder) this.f15239a).modCount != this.d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int c() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        public final MapBuilder<K, V> e() {
            return this.f15239a;
        }

        public final void f() {
            while (true) {
                int i = this.b;
                MapBuilder<K, V> mapBuilder = this.f15239a;
                if (i < ((MapBuilder) mapBuilder).length) {
                    int[] iArr = ((MapBuilder) mapBuilder).presenceArray;
                    int i2 = this.b;
                    if (iArr[i2] < 0) {
                        this.b = i2 + 1;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        public final void g(int i) {
            this.b = i;
        }

        public final void h(int i) {
            this.c = i;
        }

        public final boolean hasNext() {
            if (this.b < ((MapBuilder) this.f15239a).length) {
                return true;
            }
            return false;
        }

        public final void remove() {
            a();
            if (this.c != -1) {
                MapBuilder<K, V> mapBuilder = this.f15239a;
                mapBuilder.checkIsMutable$kotlin_stdlib();
                mapBuilder.removeEntryAt(this.c);
                this.c = -1;
                this.d = ((MapBuilder) mapBuilder).modCount;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, rzf {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            ckf.g(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            a();
            if (c() < ((MapBuilder) e()).length) {
                int c = c();
                g(c + 1);
                h(c);
                K k = (K) ((MapBuilder) e()).keysArray[d()];
                f();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, rzf {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            ckf.g(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            a();
            if (c() < ((MapBuilder) e()).length) {
                int c = c();
                g(c + 1);
                h(c);
                Object[] objArr = ((MapBuilder) e()).valuesArray;
                ckf.d(objArr);
                V v = (V) objArr[d()];
                f();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        Empty = mapBuilder;
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i;
        this.length = i2;
        this.hashShift = Companion.d(getHashSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] allocateValuesArray() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) mtg.d(getCapacity$kotlin_stdlib());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void compact(boolean z) {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.hashArray[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        mtg.g(this.keysArray, i3, i);
        if (vArr != null) {
            mtg.g(vArr, i3, this.length);
        }
        this.length = i3;
    }

    private final boolean contentEquals(Map<?, ?> map) {
        if (size() != map.size() || !containsAllEntries$kotlin_stdlib(map.entrySet())) {
            return false;
        }
        return true;
    }

    private final void ensureCapacity(int i) {
        V[] vArr;
        if (i < 0) {
            throw new OutOfMemoryError();
        } else if (i > getCapacity$kotlin_stdlib()) {
            int e2 = c20.Companion.e(getCapacity$kotlin_stdlib(), i);
            this.keysArray = (K[]) mtg.e(this.keysArray, e2);
            V[] vArr2 = this.valuesArray;
            if (vArr2 != null) {
                vArr = (V[]) mtg.e(vArr2, e2);
            } else {
                vArr = null;
            }
            this.valuesArray = vArr;
            int[] copyOf = Arrays.copyOf(this.presenceArray, e2);
            ckf.f(copyOf, "copyOf(...)");
            this.presenceArray = copyOf;
            int c2 = Companion.c(e2);
            if (c2 > getHashSize()) {
                rehash(c2);
            }
        }
    }

    private final void ensureExtraCapacity(int i) {
        if (shouldCompact(i)) {
            compact(true);
        } else {
            ensureCapacity(this.length + i);
        }
    }

    private final int findKey(K k) {
        int hash = hash(k);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[hash];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (ckf.b(this.keysArray[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = hash - 1;
            if (hash == 0) {
                hash = getHashSize() - 1;
            } else {
                hash = i4;
            }
        }
    }

    private final int findValue(V v) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                ckf.d(vArr);
                if (ckf.b(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    private final int getHashSize() {
        return this.hashArray.length;
    }

    private final int hash(K k) {
        int i;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return (i * MAGIC) >>> this.hashShift;
    }

    private final boolean putAllEntries(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        ensureExtraCapacity(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (putEntry(entry)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean putEntry(Map.Entry<? extends K, ? extends V> entry) {
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        Object[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i = (-addKey$kotlin_stdlib) - 1;
        if (ckf.b(entry.getValue(), allocateValuesArray[i])) {
            return false;
        }
        allocateValuesArray[i] = entry.getValue();
        return true;
    }

    private final boolean putRehash(int i) {
        int hash = hash(this.keysArray[i]);
        int i2 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[hash] == 0) {
                iArr[hash] = i + 1;
                this.presenceArray[i] = hash;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            int i3 = hash - 1;
            if (hash == 0) {
                hash = getHashSize() - 1;
            } else {
                hash = i3;
            }
        }
    }

    private final void registerModification() {
        this.modCount++;
    }

    private final void rehash(int i) {
        registerModification();
        int i2 = 0;
        if (this.length > size()) {
            compact(false);
        }
        this.hashArray = new int[i];
        this.hashShift = Companion.d(i);
        while (i2 < this.length) {
            int i3 = i2 + 1;
            if (putRehash(i2)) {
                i2 = i3;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeEntryAt(int i) {
        mtg.f(this.keysArray, i);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            mtg.f(vArr, i);
        }
        removeHashAt(this.presenceArray[i]);
        this.presenceArray[i] = -1;
        this.size = size() - 1;
        registerModification();
    }

    private final void removeHashAt(int i) {
        int f2 = hfn.f(this.maxProbeDistance * 2, getHashSize() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            int i4 = i - 1;
            if (i == 0) {
                i = getHashSize() - 1;
            } else {
                i = i4;
            }
            i2++;
            if (i2 > this.maxProbeDistance) {
                this.hashArray[i3] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i5 = iArr[i];
            if (i5 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i5 < 0) {
                iArr[i3] = -1;
            } else {
                int i6 = i5 - 1;
                if (((hash(this.keysArray[i6]) - i) & (getHashSize() - 1)) >= i2) {
                    this.hashArray[i3] = i5;
                    this.presenceArray[i6] = i3;
                }
                f2--;
            }
            i3 = i;
            i2 = 0;
            f2--;
        } while (f2 >= 0);
        this.hashArray[i3] = -1;
    }

    private final boolean shouldCompact(int i) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i2 = this.length;
        int i3 = capacity$kotlin_stdlib - i2;
        int size = i2 - size();
        if (i3 >= i || i3 + size < i || size < getCapacity$kotlin_stdlib() / 4) {
            return false;
        }
        return true;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int hash = hash(k);
            int f2 = hfn.f(this.maxProbeDistance * 2, getHashSize() / 2);
            int i = 0;
            while (true) {
                int i2 = this.hashArray[hash];
                if (i2 <= 0) {
                    if (this.length >= getCapacity$kotlin_stdlib()) {
                        ensureExtraCapacity(1);
                    } else {
                        int i3 = this.length;
                        int i4 = i3 + 1;
                        this.length = i4;
                        this.keysArray[i3] = k;
                        this.presenceArray[i3] = hash;
                        this.hashArray[hash] = i4;
                        this.size = size() + 1;
                        registerModification();
                        if (i > this.maxProbeDistance) {
                            this.maxProbeDistance = i;
                        }
                        return i3;
                    }
                } else if (ckf.b(this.keysArray[i2 - 1], k)) {
                    return -i2;
                } else {
                    i++;
                    if (i > f2) {
                        rehash(getHashSize() * 2);
                        break;
                    }
                    int i5 = hash - 1;
                    if (hash == 0) {
                        hash = getHashSize() - 1;
                    } else {
                        hash = i5;
                    }
                }
            }
        }
    }

    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = Empty;
        ckf.e(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i = this.length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.hashArray[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        mtg.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            mtg.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        registerModification();
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> collection) {
        ckf.g(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        ckf.g(entry, gl4.CONFIG_ENTRY);
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        ckf.d(vArr);
        return ckf.b(vArr[findKey], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (findKey(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (findValue(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final b<K, V> entriesIterator$kotlin_stdlib() {
        return new b<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof Map) && contentEquals((Map) obj))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int findKey = findKey(obj);
        if (findKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        ckf.d(vArr);
        return vArr[findKey];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    public Set<Map.Entry<K, V>> getEntries() {
        kotlin.collections.builders.a<K, V> aVar = this.entriesView;
        if (aVar != null) {
            return aVar;
        }
        kotlin.collections.builders.a<K, V> aVar2 = new kotlin.collections.builders.a<>(this);
        this.entriesView = aVar2;
        return aVar2;
    }

    public Set<K> getKeys() {
        kotlin.collections.builders.b<K> bVar = this.keysView;
        if (bVar != null) {
            return bVar;
        }
        kotlin.collections.builders.b<K> bVar2 = new kotlin.collections.builders.b<>(this);
        this.keysView = bVar2;
        return bVar2;
    }

    public int getSize() {
        return this.size;
    }

    public Collection<V> getValues() {
        kotlin.collections.builders.c<V> cVar = this.valuesView;
        if (cVar != null) {
            return cVar;
        }
        kotlin.collections.builders.c<V> cVar2 = new kotlin.collections.builders.c<>(this);
        this.valuesView = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            i += entriesIterator$kotlin_stdlib.k();
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    public final e<K, V> keysIterator$kotlin_stdlib() {
        return new e<>(this);
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(k);
        V[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib < 0) {
            int i = (-addKey$kotlin_stdlib) - 1;
            V v2 = allocateValuesArray[i];
            allocateValuesArray[i] = v;
            return v2;
        }
        allocateValuesArray[addKey$kotlin_stdlib] = v;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        ckf.g(map, "from");
        checkIsMutable$kotlin_stdlib();
        putAllEntries(map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(obj);
        if (findKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        ckf.d(vArr);
        V v = vArr[findKey];
        removeEntryAt(findKey);
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean removeEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        ckf.g(entry, gl4.CONFIG_ENTRY);
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        ckf.d(vArr);
        if (!ckf.b(vArr[findKey], entry.getValue())) {
            return false;
        }
        removeEntryAt(findKey);
        return true;
    }

    public final boolean removeKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(k);
        if (findKey < 0) {
            return false;
        }
        removeEntryAt(findKey);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V v) {
        checkIsMutable$kotlin_stdlib();
        int findValue = findValue(v);
        if (findValue < 0) {
            return false;
        }
        removeEntryAt(findValue);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            entriesIterator$kotlin_stdlib.j(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        ckf.f(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public final f<K, V> valuesIterator$kotlin_stdlib() {
        return new f<>(this);
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i) {
        this(mtg.d(i), null, new int[i], new int[Companion.c(i)], 2, 0);
    }
}
