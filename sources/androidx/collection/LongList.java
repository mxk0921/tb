package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import tb.a07;
import tb.aef;
import tb.ckf;
import tb.en9;
import tb.g1a;
import tb.hfn;
import tb.pg1;
import tb.tep;
import tb.u1a;
import tb.w1a;
import tb.xhv;
import tb.ytc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0016\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJA\u0010\t\u001a\u00020\u00062!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\u0010JA\u0010\u0011\u001a\u00020\u00062!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u0017\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0017\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001a\u001a\u00020\u000b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001a\u0010\u001cJd\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u000026\u0010!\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\"\u0010#Jy\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002K\u0010!\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b&\u0010'Jd\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u000026\u0010!\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b(\u0010#Jy\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002K\u0010!\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b)\u0010'JA\u0010,\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b,\u0010-JV\u0010.\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b.\u0010/JA\u00100\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b0\u0010-JV\u00101\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b1\u0010/J\u001a\u00102\u001a\u00020\u000b2\b\b\u0001\u0010%\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000b2\b\b\u0001\u0010%\u001a\u00020\u0002¢\u0006\u0004\b4\u00103J@\u00106\u001a\u00020\u000b2\b\b\u0001\u0010%\u001a\u00020\u00022!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000b0\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b8\u00109JA\u0010:\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010\u0019JA\u0010;\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b;\u0010\u0019J\r\u0010<\u001a\u00020\u0006¢\u0006\u0004\b<\u0010\bJ\r\u0010=\u001a\u00020\u0006¢\u0006\u0004\b=\u0010\bJ\r\u0010>\u001a\u00020\u000b¢\u0006\u0004\b>\u0010\u001bJA\u0010>\u001a\u00020\u000b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b>\u0010\u001cJ\u0015\u0010?\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b?\u00109JA\u0010G\u001a\u00020F2\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020@2\b\b\u0002\u0010D\u001a\u00020\u00022\b\b\u0002\u0010E\u001a\u00020@H\u0007¢\u0006\u0004\bG\u0010HJ[\u0010G\u001a\u00020F2\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020@2\b\b\u0002\u0010D\u001a\u00020\u00022\b\b\u0002\u0010E\u001a\u00020@2\u0014\b\u0004\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020@0\nH\u0087\bø\u0001\u0000¢\u0006\u0004\bG\u0010JJ\u000f\u0010K\u001a\u00020\u0002H\u0016¢\u0006\u0004\bK\u0010\u0018J\u001a\u0010M\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020FH\u0016¢\u0006\u0004\bO\u0010PR\u001c\u0010R\u001a\u00020Q8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bR\u0010S\u0012\u0004\bT\u0010UR\u001c\u0010V\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010UR\u0011\u0010Z\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bY\u0010\u0018R\u0012\u0010\\\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b[\u0010\u0018R\u0012\u0010`\u001a\u00020]8Æ\u0002¢\u0006\u0006\u001a\u0004\b^\u0010_\u0082\u0001\u0001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006b"}, d2 = {"Landroidx/collection/LongList;", "", "", "initialCapacity", "<init>", "(I)V", "", "none", "()Z", pg1.ATOM_EXT_any, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "element", "predicate", "(Ltb/g1a;)Z", "reversedAny", "contains", "(J)Z", tep.KEY_UNIFORM_RESULT, "containsAll", "(Landroidx/collection/LongList;)Z", "count", "()I", "(Ltb/g1a;)I", "first", "()J", "(Ltb/g1a;)J", "R", "initial", "Lkotlin/Function2;", "acc", "operation", ytc.TYPE_FOLD, "(Ljava/lang/Object;Ltb/u1a;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "foldIndexed", "(Ljava/lang/Object;Ltb/w1a;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "Ltb/xhv;", pg1.ATOM_EXT_block, pg1.ATOM_EXT_forEach, "(Ltb/g1a;)V", "forEachIndexed", "(Ltb/u1a;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)J", "elementAt", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "elementAtOrElse", "(ILtb/g1a;)J", pg1.ATOM_EXT_indexOf, "(J)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", pg1.ATOM_EXT_lastIndexOf, "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ltb/g1a;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "content", "[J", "getContent$annotations", "()V", "_size", TLogTracker.LEVEL_INFO, "get_size$annotations", "getSize", "size", "getLastIndex", pg1.ATOM_lastIndex, "Ltb/aef;", "getIndices", "()Ltb/aef;", "indices", "Landroidx/collection/MutableLongList;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class LongList {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int _size;
    public long[] content;

    public /* synthetic */ LongList(int i, a07 a07Var) {
        this(i);
    }

    public static /* synthetic */ void getContent$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84258b4a", new Object[0]);
        }
    }

    public static /* synthetic */ void get_size$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb95c51", new Object[0]);
        }
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9e5d2f8", new Object[]{longList, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, new Integer(i2), obj});
        }
        if (obj == null) {
            if ((i2 & 1) != 0) {
                charSequence = ", ";
            }
            CharSequence charSequence5 = "";
            CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
            if ((i2 & 4) == 0) {
                charSequence5 = charSequence3;
            }
            int i3 = (i2 & 8) != 0 ? -1 : i;
            if ((i2 & 16) != 0) {
                charSequence4 = "...";
            }
            return longList.joinToString(charSequence, charSequence6, charSequence5, i3, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean any() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdb02877", new Object[]{this})).booleanValue() : isNotEmpty();
    }

    public final boolean contains(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("894e0862", new Object[]{this, new Long(j)})).booleanValue();
        }
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (jArr[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final int count() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("507fb609", new Object[]{this})).intValue() : this._size;
    }

    public final long elementAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89aa0061", new Object[]{this, new Integer(i)})).longValue();
        }
        if (i >= 0 && i < this._size) {
            return this.content[i];
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + (this._size - 1));
    }

    public final long elementAtOrElse(int i, g1a<? super Integer, Long> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6439f10b", new Object[]{this, new Integer(i), g1aVar})).longValue();
        }
        ckf.g(g1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        if (i < 0 || i >= this._size) {
            return g1aVar.invoke(Integer.valueOf(i)).longValue();
        }
        return this.content[i];
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof LongList) {
            LongList longList = (LongList) obj;
            int i = longList._size;
            int i2 = this._size;
            if (i == i2) {
                long[] jArr = this.content;
                long[] jArr2 = longList.content;
                aef n = hfn.n(0, i2);
                int c = n.c();
                int d = n.d();
                if (c <= d) {
                    while (jArr[c] == jArr2[c]) {
                        if (c != d) {
                            c++;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final long first() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7db7f2b", new Object[]{this})).longValue();
        }
        if (!isEmpty()) {
            return this.content[0];
        }
        throw new NoSuchElementException("LongList is empty.");
    }

    public final void forEach(g1a<? super Long, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be26dfb7", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            g1aVar.invoke(Long.valueOf(jArr[i2]));
        }
    }

    public final void forEachIndexed(u1a<? super Integer, ? super Long, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335d8253", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            u1aVar.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i2]));
        }
    }

    public final void forEachReversed(g1a<? super Long, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d507a99", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        long[] jArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            g1aVar.invoke(Long.valueOf(jArr[i]));
        }
    }

    public final long get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc15ba", new Object[]{this, new Integer(i)})).longValue();
        }
        if (i >= 0 && i < this._size) {
            return this.content[i];
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + (this._size - 1));
    }

    public final aef getIndices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aef) ipChange.ipc$dispatch("18358774", new Object[]{this});
        }
        return hfn.n(0, this._size);
    }

    public final int getLastIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2237c6a0", new Object[]{this})).intValue();
        }
        return this._size - 1;
    }

    public final int getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this._size;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        long[] jArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += en9.a(jArr[i3]) * 31;
        }
        return i2;
    }

    public final int indexOf(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c314c267", new Object[]{this, new Long(j)})).intValue();
        }
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (j == jArr[i2]) {
                return i2;
            }
        }
        return -1;
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d15b303", new Object[]{this}) : joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final long last() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8f0dc11", new Object[]{this})).longValue();
        }
        if (!isEmpty()) {
            return this.content[this._size - 1];
        }
        throw new NoSuchElementException("LongList is empty.");
    }

    public final int lastIndexOf(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c8d781d", new Object[]{this, new Long(j)})).intValue();
        }
        long[] jArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (jArr[i] == j) {
                return i;
            }
        }
        return -1;
    }

    public final boolean none() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53eed7c3", new Object[]{this})).booleanValue();
        }
        return isEmpty();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private LongList(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = LongSetKt.getEmptyLongArray();
        } else {
            jArr = new long[i];
        }
        this.content = jArr;
    }

    public final boolean any(g1a<? super Long, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937f6a3d", new Object[]{this, g1aVar})).booleanValue();
        }
        ckf.g(g1aVar, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (g1aVar.invoke(Long.valueOf(jArr[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(g1a<? super Long, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d37abcf", new Object[]{this, g1aVar})).intValue();
        }
        ckf.g(g1aVar, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (g1aVar.invoke(Long.valueOf(jArr[i3])).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public final String joinToString(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f9af1df", new Object[]{this, charSequence});
        }
        ckf.g(charSequence, "separator");
        return joinToString$default(this, charSequence, null, null, 0, null, 30, null);
    }

    public final boolean containsAll(LongList longList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b47497", new Object[]{this, longList})).booleanValue();
        }
        ckf.g(longList, tep.KEY_UNIFORM_RESULT);
        aef n = hfn.n(0, longList._size);
        int c = n.c();
        int d = n.d();
        if (c <= d) {
            while (contains(longList.get(c))) {
                if (c != d) {
                    c++;
                }
            }
            return false;
        }
        return true;
    }

    public final <R> R fold(R r, u1a<? super R, ? super Long, ? extends R> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("3992b249", new Object[]{this, r, u1aVar});
        }
        ckf.g(u1aVar, "operation");
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = (R) u1aVar.invoke(r, Long.valueOf(jArr[i2]));
        }
        return r;
    }

    public final <R> R foldIndexed(R r, w1a<? super Integer, ? super R, ? super Long, ? extends R> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("383f373b", new Object[]{this, r, w1aVar});
        }
        ckf.g(w1aVar, "operation");
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = (R) w1aVar.invoke(Integer.valueOf(i2), r, Long.valueOf(jArr[i2]));
        }
        return r;
    }

    public final <R> R foldRight(R r, u1a<? super Long, ? super R, ? extends R> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("9bea2e6f", new Object[]{this, r, u1aVar});
        }
        ckf.g(u1aVar, "operation");
        long[] jArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            r = (R) u1aVar.invoke(Long.valueOf(jArr[i]), r);
        }
        return r;
    }

    public final <R> R foldRightIndexed(R r, w1a<? super Integer, ? super Long, ? super R, ? extends R> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("5330e455", new Object[]{this, r, w1aVar});
        }
        ckf.g(w1aVar, "operation");
        long[] jArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            r = (R) w1aVar.invoke(Integer.valueOf(i), Long.valueOf(jArr[i]), r);
        }
        return r;
    }

    public final void forEachReversedIndexed(u1a<? super Integer, ? super Long, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc4531", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        long[] jArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            u1aVar.invoke(Integer.valueOf(i), Long.valueOf(jArr[i]));
        }
    }

    public final int indexOfFirst(g1a<? super Long, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5307f0a7", new Object[]{this, g1aVar})).intValue();
        }
        ckf.g(g1aVar, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (g1aVar.invoke(Long.valueOf(jArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(g1a<? super Long, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9fb633f", new Object[]{this, g1aVar})).intValue();
        }
        ckf.g(g1aVar, "predicate");
        long[] jArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (g1aVar.invoke(Long.valueOf(jArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
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
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    public final long first(g1a<? super Long, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33feb0f1", new Object[]{this, g1aVar})).longValue();
        }
        ckf.g(g1aVar, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (g1aVar.invoke(Long.valueOf(j)).booleanValue()) {
                return j;
            }
        }
        throw new NoSuchElementException("LongList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1159f397", new Object[]{this, charSequence, charSequence2, charSequence3});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    public final boolean reversedAny(g1a<? super Long, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cce21b", new Object[]{this, g1aVar})).booleanValue();
        }
        ckf.g(g1aVar, "predicate");
        long[] jArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (g1aVar.invoke(Long.valueOf(jArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a g1aVar, int i2, Object obj) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e04699be", new Object[]{longList, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, g1aVar, new Integer(i2), obj});
        }
        if (obj == null) {
            if ((i2 & 1) != 0) {
                charSequence = ", ";
            }
            if ((i2 & 2) != 0) {
                charSequence2 = "";
            }
            if ((i2 & 4) != 0) {
                charSequence3 = "";
            }
            if ((i2 & 8) != 0) {
                i = -1;
            }
            if ((i2 & 16) != 0) {
                charSequence4 = "...";
            }
            ckf.g(charSequence, "separator");
            ckf.g(charSequence2, "prefix");
            ckf.g(charSequence3, "postfix");
            ckf.g(charSequence4, "truncated");
            ckf.g(g1aVar, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence2);
            long[] jArr = longList.content;
            int i4 = longList._size;
            while (true) {
                if (i3 >= i4) {
                    sb.append(charSequence3);
                    break;
                }
                long j = jArr[i3];
                if (i3 == i) {
                    sb.append(charSequence4);
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                sb.append((CharSequence) g1aVar.invoke(Long.valueOf(j)));
                i3++;
            }
            String sb2 = sb.toString();
            ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b6367e6", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i)});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, 16, null);
    }

    public final long last(g1a<? super Long, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d876f5d7", new Object[]{this, g1aVar})).longValue();
        }
        ckf.g(g1aVar, "predicate");
        long[] jArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            long j = jArr[i];
            if (g1aVar.invoke(Long.valueOf(j)).booleanValue()) {
                return j;
            }
        }
        throw new NoSuchElementException("LongList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83e0edc2", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.content;
        int i3 = this._size;
        while (true) {
            if (i2 >= i3) {
                sb.append(charSequence3);
                break;
            }
            long j = jArr[i2];
            if (i2 == i) {
                sb.append(charSequence4);
                break;
            }
            if (i2 != 0) {
                sb.append(charSequence);
            }
            sb.append(j);
            i2++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a<? super Long, ? extends CharSequence> g1aVar) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5669cbc", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, g1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(charSequence4, "truncated");
        ckf.g(g1aVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.content;
        int i3 = this._size;
        while (true) {
            if (i2 >= i3) {
                sb.append(charSequence3);
                break;
            }
            long j = jArr[i2];
            if (i2 == i) {
                sb.append(charSequence4);
                break;
            }
            if (i2 != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) g1aVar.invoke(Long.valueOf(j)));
            i2++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, g1a<? super Long, ? extends CharSequence> g1aVar) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6d786e0", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i), g1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(g1aVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.content;
        int i3 = this._size;
        while (true) {
            if (i2 >= i3) {
                sb.append(charSequence3);
                break;
            }
            long j = jArr[i2];
            if (i2 == i) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) g1aVar.invoke(Long.valueOf(j)));
            i2++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, g1a<? super Long, ? extends CharSequence> g1aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a0b0e91", new Object[]{this, charSequence, charSequence2, charSequence3, g1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(g1aVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.content;
        int i2 = this._size;
        while (true) {
            if (i >= i2) {
                sb.append(charSequence3);
                break;
            }
            long j = jArr[i];
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) g1aVar.invoke(Long.valueOf(j)));
            i++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, g1a<? super Long, ? extends CharSequence> g1aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e6be7b5", new Object[]{this, charSequence, charSequence2, g1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(g1aVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.content;
        int i2 = this._size;
        while (true) {
            if (i >= i2) {
                sb.append((CharSequence) "");
                break;
            }
            long j = jArr[i];
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) g1aVar.invoke(Long.valueOf(j)));
            i++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, g1a<? super Long, ? extends CharSequence> g1aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e980ecd9", new Object[]{this, charSequence, g1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(g1aVar, "transform");
        StringBuilder sb = new StringBuilder("");
        long[] jArr = this.content;
        int i2 = this._size;
        while (true) {
            if (i >= i2) {
                sb.append((CharSequence) "");
                break;
            }
            long j = jArr[i];
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) g1aVar.invoke(Long.valueOf(j)));
            i++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(g1a<? super Long, ? extends CharSequence> g1aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60e1dfd", new Object[]{this, g1aVar});
        }
        ckf.g(g1aVar, "transform");
        StringBuilder sb = new StringBuilder("");
        long[] jArr = this.content;
        int i2 = this._size;
        while (true) {
            if (i >= i2) {
                sb.append((CharSequence) "");
                break;
            }
            long j = jArr[i];
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) g1aVar.invoke(Long.valueOf(j)));
            i++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
