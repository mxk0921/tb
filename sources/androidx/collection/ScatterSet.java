package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.g1a;
import tb.lz3;
import tb.pg1;
import tb.rzf;
import tb.tep;
import tb.wbp;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001FB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\u000b\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u000b\u001a\u00028\u00002!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\u0012JC\u0010\u0013\u001a\u0004\u0018\u00018\u00002!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0013\u0010\u0012JA\u0010\u0018\u001a\u00020\u00162!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\rH\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001a\u001a\u00020\u00162!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00160\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001a\u0010\u0019JA\u0010\u001b\u001a\u00020\u00052!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001b\u0010\u001cJA\u0010\u0006\u001a\u00020\u00052!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0006\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010\u001d\u001a\u00020\u00142!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001d\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b \u0010!JY\u0010*\u001a\u00020)2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\"2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"\u0018\u00010\rH\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0014H\u0016¢\u0006\u0004\b,\u0010\u001eJ\u001a\u0010.\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b.\u0010!J\u000f\u0010/\u001a\u00020)H\u0016¢\u0006\u0004\b/\u00100J\u0018\u00103\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b1\u00102J\u0013\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004¢\u0006\u0004\b5\u00106R\u001c\u00108\u001a\u0002078\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010\u0004R$\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020;8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u0010\u0004R\u0016\u0010?\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0011\u0010C\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\bB\u0010\u001eR\u0011\u0010E\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\bD\u0010\u001e\u0082\u0001\u0001G\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006H"}, d2 = {"Landroidx/collection/ScatterSet;", "E", "", "<init>", "()V", "", pg1.ATOM_EXT_any, "()Z", "none", "isEmpty", "isNotEmpty", "first", "()Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "predicate", "(Ltb/g1a;)Ljava/lang/Object;", "firstOrNull", "", "index", "Ltb/xhv;", pg1.ATOM_EXT_block, "forEachIndex", "(Ltb/g1a;)V", pg1.ATOM_EXT_forEach, "all", "(Ltb/g1a;)Z", "count", "()I", "(Ltb/g1a;)I", "contains", "(Ljava/lang/Object;)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ltb/g1a;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "findElementIndex$collection", "(Ljava/lang/Object;)I", "findElementIndex", "", "asSet", "()Ljava/util/Set;", "", "metadata", "[J", "getMetadata$annotations", "", tep.KEY_UNIFORM_RESULT, "[Ljava/lang/Object;", "getElements$annotations", "_capacity", TLogTracker.LEVEL_INFO, "_size", "getCapacity", "capacity", "getSize", "size", "SetWrapper", "Landroidx/collection/MutableScatterSet;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ScatterSet<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int _capacity;
    public int _size;
    public Object[] elements;
    public long[] metadata;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0090\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/collection/ScatterSet$SetWrapper;", "", "(Landroidx/collection/ScatterSet;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", tep.KEY_UNIFORM_RESULT, "", "isEmpty", pg1.ATOM_EXT_iterator, "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class SetWrapper implements Set<E>, rzf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public SetWrapper() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, e})).booleanValue();
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6721cc3c", new Object[]{this, collection})).booleanValue();
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, obj})).booleanValue();
            }
            return ScatterSet.this.contains(obj);
        }

        public int getSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
            }
            return ScatterSet.this._size;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            return ScatterSet.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
            }
            return wbp.a(new ScatterSet$SetWrapper$iterator$1(ScatterSet.this, null));
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d1b8db39", new Object[]{this, collection})).booleanValue();
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c63b5e58", new Object[]{this, collection})).booleanValue();
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("a69fe546", new Object[]{this}) : lz3.a(this);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T[]) ((Object[]) ipChange.ipc$dispatch("800a0c4d", new Object[]{this, tArr}));
            }
            ckf.g(tArr, "array");
            return (T[]) lz3.b(this, tArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("176f677e", new Object[]{this, collection})).booleanValue();
            }
            ckf.g(collection, tep.KEY_UNIFORM_RESULT);
            ScatterSet<E> scatterSet = ScatterSet.this;
            for (Object obj : collection) {
                if (!scatterSet.contains(obj)) {
                    return false;
                }
            }
            return true;
        }
    }

    public /* synthetic */ ScatterSet(a07 a07Var) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91fe8574", new Object[0]);
        }
    }

    public static /* synthetic */ void getMetadata$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01fcfac", new Object[0]);
        }
    }

    public static /* synthetic */ String joinToString$default(ScatterSet scatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a g1aVar, int i2, Object obj) {
        CharSequence charSequence5;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("151c04c8", new Object[]{scatterSet, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, g1aVar, new Integer(i2), obj});
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
                g1aVar = null;
            }
            return scatterSet.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4, g1aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean any() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdb02877", new Object[]{this})).booleanValue() : this._size != 0;
    }

    public final Set<E> asSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("e70bc706", new Object[]{this});
        }
        return new SetWrapper();
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
    public final boolean contains(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.collection.ScatterSet.$ipChange
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
            java.lang.Object[] r15 = r0.elements
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.contains(java.lang.Object):boolean");
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
        if (!(obj instanceof ScatterSet)) {
            return false;
        }
        ScatterSet scatterSet = (ScatterSet) obj;
        if (scatterSet.getSize() != getSize()) {
            return false;
        }
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !scatterSet.contains(objArr[(i << 3) + i3])) {
                            return false;
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

    public final E first() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("3a810cdb", new Object[]{this});
        }
        Object[] objArr = this.elements;
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
                            return (E) objArr[(i << 3) + i3];
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
        throw new NoSuchElementException("The ScatterSet is empty");
    }

    public final void forEach(g1a<? super E, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be26dfb7", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        Object[] objArr = this.elements;
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

    public final void forEachIndex(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c0a6d5", new Object[]{this, g1aVar});
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

    public final int getCapacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e903eaa", new Object[]{this})).intValue();
        }
        return this._capacity;
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
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i3 << 3) + i6];
                            if (obj != null) {
                                i = obj.hashCode();
                            } else {
                                i = 0;
                            }
                            i4 += i;
                        }
                        j >>= 8;
                    }
                    if (i5 != 8) {
                        return i4;
                    }
                }
                if (i3 == length) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
        }
        return i2;
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

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return joinToString$default(this, null, "[", "]", 0, null, new ScatterSet$toString$1(this), 25, null);
    }

    private ScatterSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    public final boolean any(g1a<? super E, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937f6a3d", new Object[]{this, g1aVar})).booleanValue();
        }
        ckf.g(g1aVar, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && g1aVar.invoke(objArr[(i << 3) + i3]).booleanValue()) {
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

    public final int count(g1a<? super E, Boolean> g1aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d37abcf", new Object[]{this, g1aVar})).intValue();
        }
        ckf.g(g1aVar, "predicate");
        Object[] objArr = this.elements;
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
                        if ((255 & j) < 128 && g1aVar.invoke(objArr[(i2 << 3) + i5]).booleanValue()) {
                            i3++;
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

    public final int findElementIndex$collection(E e) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7488f29", new Object[]{this, e})).intValue();
        }
        int hashCode = (e != null ? e.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.metadata;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (~j2) & (j2 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (ckf.b(this.elements[numberOfTrailingZeros], e)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
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

    /* JADX WARN: Type inference failed for: r13v4, types: [E, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E first(tb.g1a<? super E, java.lang.Boolean> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 0
            r3 = 2
            r4 = 1
            com.android.alibaba.ip.runtime.IpChange r5 = androidx.collection.ScatterSet.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001a
            java.lang.String r6 = "6ddadfd5"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r3[r4] = r1
            java.lang.Object r1 = r5.ipc$dispatch(r6, r3)
            return r1
        L_0x001a:
            java.lang.String r5 = "predicate"
            tb.ckf.g(r1, r5)
            java.lang.Object[] r5 = r0.elements
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 - r3
            if (r7 < 0) goto L_0x0069
            r3 = 0
        L_0x0029:
            r8 = r6[r3]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0065
            int r10 = r3 - r7
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L_0x0043:
            if (r12 >= r10) goto L_0x0063
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L_0x0060
            int r13 = r3 << 3
            int r13 = r13 + r12
            r13 = r5[r13]
            java.lang.Object r14 = r1.invoke(r13)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0060
            return r13
        L_0x0060:
            long r8 = r8 >> r11
            int r12 = r12 + r4
            goto L_0x0043
        L_0x0063:
            if (r10 != r11) goto L_0x0069
        L_0x0065:
            if (r3 == r7) goto L_0x0069
            int r3 = r3 + r4
            goto L_0x0029
        L_0x0069:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Could not find a match"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.first(tb.g1a):java.lang.Object");
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a<? super E, ? extends CharSequence> g1aVar) {
        StringBuilder sb;
        int i2;
        int i3 = 0;
        char c = 7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5669cbc", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, g1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(charSequence4, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            StringBuilder sb3 = sb2;
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr[i4];
                if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    while (i3 < i6) {
                        if ((j & 255) < 128) {
                            Object obj = objArr[(i4 << 3) + i3];
                            if (i5 == i) {
                                sb = sb3;
                                sb.append(charSequence4);
                                break loop0;
                            }
                            sb3 = sb3;
                            if (i5 != 0) {
                                sb3.append(charSequence);
                            }
                            if (g1aVar == null) {
                                sb3.append(obj);
                            } else {
                                sb3.append((CharSequence) g1aVar.invoke(obj));
                            }
                            i2 = 1;
                            i5++;
                        } else {
                            sb3 = sb3;
                            i2 = 1;
                        }
                        j >>= 8;
                        i3 += i2;
                    }
                    sb = sb3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    sb = sb3;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                sb3 = sb;
                i3 = 0;
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

    public final boolean all(g1a<? super E, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1547372", new Object[]{this, g1aVar})).booleanValue();
        }
        ckf.g(g1aVar, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !g1aVar.invoke(objArr[(i << 3) + i3]).booleanValue()) {
                            return false;
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

    /* JADX WARN: Type inference failed for: r13v4, types: [E, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E firstOrNull(tb.g1a<? super E, java.lang.Boolean> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 0
            r3 = 2
            r4 = 1
            com.android.alibaba.ip.runtime.IpChange r5 = androidx.collection.ScatterSet.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001b
            java.lang.String r6 = "ccf9feb"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r3[r4] = r1
            java.lang.Object r1 = r5.ipc$dispatch(r6, r3)
            return r1
        L_0x001b:
            java.lang.String r5 = "predicate"
            tb.ckf.g(r1, r5)
            java.lang.Object[] r5 = r0.elements
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 - r3
            if (r7 < 0) goto L_0x006a
            r3 = 0
        L_0x002a:
            r8 = r6[r3]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0066
            int r10 = r3 - r7
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L_0x0044:
            if (r12 >= r10) goto L_0x0064
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L_0x0061
            int r13 = r3 << 3
            int r13 = r13 + r12
            r13 = r5[r13]
            java.lang.Object r14 = r1.invoke(r13)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0061
            return r13
        L_0x0061:
            long r8 = r8 >> r11
            int r12 = r12 + r4
            goto L_0x0044
        L_0x0064:
            if (r10 != r11) goto L_0x006a
        L_0x0066:
            if (r3 == r7) goto L_0x006a
            int r3 = r3 + r4
            goto L_0x002a
        L_0x006a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.firstOrNull(tb.g1a):java.lang.Object");
    }
}
