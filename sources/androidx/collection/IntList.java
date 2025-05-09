package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import tb.a07;
import tb.aef;
import tb.ckf;
import tb.g1a;
import tb.hfn;
import tb.pg1;
import tb.tep;
import tb.u1a;
import tb.w1a;
import tb.xhv;
import tb.ytc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJA\u0010\t\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\u000fJA\u0010\u0010\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u0016\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0016\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0017JA\u0010\u0019\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0019\u0010\u0018Jd\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u000026\u0010\u001e\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001f\u0010 Jy\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u00002K\u0010\u001e\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b#\u0010$Jd\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u000026\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b%\u0010 Jy\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u00002K\u0010\u001e\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b&\u0010$JA\u0010)\u001a\u00020'2!\u0010(\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020'0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b)\u0010*JV\u0010+\u001a\u00020'26\u0010(\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020'0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b+\u0010,JA\u0010-\u001a\u00020'2!\u0010(\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020'0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b-\u0010*JV\u0010.\u001a\u00020'26\u0010(\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020'0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b.\u0010,J\u001a\u0010/\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b1\u00100J@\u00103\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u00022!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00020\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b5\u00100JA\u00106\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b6\u0010\u0018JA\u00107\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b7\u0010\u0018J\r\u00108\u001a\u00020\u0006¢\u0006\u0004\b8\u0010\bJ\r\u00109\u001a\u00020\u0006¢\u0006\u0004\b9\u0010\bJ\r\u0010:\u001a\u00020\u0002¢\u0006\u0004\b:\u0010\u0017JA\u0010:\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010\u0018J\u0015\u0010;\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b;\u00100JA\u0010C\u001a\u00020B2\b\b\u0002\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020<2\b\b\u0002\u0010?\u001a\u00020<2\b\b\u0002\u0010@\u001a\u00020\u00022\b\b\u0002\u0010A\u001a\u00020<H\u0007¢\u0006\u0004\bC\u0010DJ[\u0010C\u001a\u00020B2\b\b\u0002\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020<2\b\b\u0002\u0010?\u001a\u00020<2\b\b\u0002\u0010@\u001a\u00020\u00022\b\b\u0002\u0010A\u001a\u00020<2\u0014\b\u0004\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020<0\nH\u0087\bø\u0001\u0000¢\u0006\u0004\bC\u0010FJ\u000f\u0010G\u001a\u00020\u0002H\u0016¢\u0006\u0004\bG\u0010\u0017J\u001a\u0010I\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020BH\u0016¢\u0006\u0004\bK\u0010LR\u001c\u0010N\u001a\u00020M8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bN\u0010O\u0012\u0004\bP\u0010QR\u001c\u0010R\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bR\u0010S\u0012\u0004\bT\u0010QR\u0011\u0010V\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bU\u0010\u0017R\u0012\u0010X\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\bW\u0010\u0017R\u0012\u0010\\\u001a\u00020Y8Æ\u0002¢\u0006\u0006\u001a\u0004\bZ\u0010[\u0082\u0001\u0001]\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006^"}, d2 = {"Landroidx/collection/IntList;", "", "", "initialCapacity", "<init>", "(I)V", "", "none", "()Z", pg1.ATOM_EXT_any, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "predicate", "(Ltb/g1a;)Z", "reversedAny", "contains", "(I)Z", tep.KEY_UNIFORM_RESULT, "containsAll", "(Landroidx/collection/IntList;)Z", "count", "()I", "(Ltb/g1a;)I", "first", "R", "initial", "Lkotlin/Function2;", "acc", "operation", ytc.TYPE_FOLD, "(Ljava/lang/Object;Ltb/u1a;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "foldIndexed", "(Ljava/lang/Object;Ltb/w1a;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "Ltb/xhv;", pg1.ATOM_EXT_block, pg1.ATOM_EXT_forEach, "(Ltb/g1a;)V", "forEachIndexed", "(Ltb/u1a;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)I", "elementAt", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "elementAtOrElse", "(ILtb/g1a;)I", pg1.ATOM_EXT_indexOf, "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", pg1.ATOM_EXT_lastIndexOf, "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ltb/g1a;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "content", "[I", "getContent$annotations", "()V", "_size", TLogTracker.LEVEL_INFO, "get_size$annotations", "getSize", "size", "getLastIndex", pg1.ATOM_lastIndex, "Ltb/aef;", "getIndices", "()Ltb/aef;", "indices", "Landroidx/collection/MutableIntList;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class IntList {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int _size;
    public int[] content;

    public /* synthetic */ IntList(int i, a07 a07Var) {
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

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("daeb65d7", new Object[]{intList, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, new Integer(i2), obj});
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
            return intList.joinToString(charSequence, charSequence6, charSequence5, i3, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean any() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdb02877", new Object[]{this})).booleanValue() : isNotEmpty();
    }

    public final boolean contains(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("894e04a1", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] == i) {
                return true;
            }
        }
        return false;
    }

    public final int count() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("507fb609", new Object[]{this})).intValue() : this._size;
    }

    public final int elementAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89aa0060", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i >= 0 && i < this._size) {
            return this.content[i];
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + (this._size - 1));
    }

    public final int elementAtOrElse(int i, g1a<? super Integer, Integer> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6439f10a", new Object[]{this, new Integer(i), g1aVar})).intValue();
        }
        ckf.g(g1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        if (i < 0 || i >= this._size) {
            return g1aVar.invoke(Integer.valueOf(i)).intValue();
        }
        return this.content[i];
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof IntList) {
            IntList intList = (IntList) obj;
            int i = intList._size;
            int i2 = this._size;
            if (i == i2) {
                int[] iArr = this.content;
                int[] iArr2 = intList.content;
                aef n = hfn.n(0, i2);
                int c = n.c();
                int d = n.d();
                if (c <= d) {
                    while (iArr[c] == iArr2[c]) {
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

    public final int first() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7db7f2a", new Object[]{this})).intValue();
        }
        if (!isEmpty()) {
            return this.content[0];
        }
        throw new NoSuchElementException("IntList is empty.");
    }

    public final void forEach(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be26dfb7", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            g1aVar.invoke(Integer.valueOf(iArr[i2]));
        }
    }

    public final void forEachIndexed(u1a<? super Integer, ? super Integer, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335d8253", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            u1aVar.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i2]));
        }
    }

    public final void forEachReversed(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d507a99", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        int[] iArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            g1aVar.invoke(Integer.valueOf(iArr[i]));
        }
    }

    public final int get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc15b9", new Object[]{this, new Integer(i)})).intValue();
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
        int[] iArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final int indexOf(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c314bea6", new Object[]{this, new Integer(i)})).intValue();
        }
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i == iArr[i3]) {
                return i3;
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

    public final int last() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8f0dc10", new Object[]{this})).intValue();
        }
        if (!isEmpty()) {
            return this.content[this._size - 1];
        }
        throw new NoSuchElementException("IntList is empty.");
    }

    public final int lastIndexOf(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c8d745c", new Object[]{this, new Integer(i)})).intValue();
        }
        int[] iArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            if (iArr[i2] == i) {
                return i2;
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

    private IntList(int i) {
        int[] iArr;
        if (i == 0) {
            iArr = IntSetKt.getEmptyIntArray();
        } else {
            iArr = new int[i];
        }
        this.content = iArr;
    }

    public final boolean any(g1a<? super Integer, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937f6a3d", new Object[]{this, g1aVar})).booleanValue();
        }
        ckf.g(g1aVar, "predicate");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (g1aVar.invoke(Integer.valueOf(iArr[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(g1a<? super Integer, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d37abcf", new Object[]{this, g1aVar})).intValue();
        }
        ckf.g(g1aVar, "predicate");
        int[] iArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (g1aVar.invoke(Integer.valueOf(iArr[i3])).booleanValue()) {
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

    public final boolean containsAll(IntList intList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72e4ac9a", new Object[]{this, intList})).booleanValue();
        }
        ckf.g(intList, tep.KEY_UNIFORM_RESULT);
        aef n = hfn.n(0, intList._size);
        int c = n.c();
        int d = n.d();
        if (c <= d) {
            while (contains(intList.get(c))) {
                if (c != d) {
                    c++;
                }
            }
            return false;
        }
        return true;
    }

    public final <R> R fold(R r, u1a<? super R, ? super Integer, ? extends R> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("3992b249", new Object[]{this, r, u1aVar});
        }
        ckf.g(u1aVar, "operation");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = (R) u1aVar.invoke(r, Integer.valueOf(iArr[i2]));
        }
        return r;
    }

    public final <R> R foldIndexed(R r, w1a<? super Integer, ? super R, ? super Integer, ? extends R> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("383f373b", new Object[]{this, r, w1aVar});
        }
        ckf.g(w1aVar, "operation");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = (R) w1aVar.invoke(Integer.valueOf(i2), r, Integer.valueOf(iArr[i2]));
        }
        return r;
    }

    public final <R> R foldRight(R r, u1a<? super Integer, ? super R, ? extends R> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("9bea2e6f", new Object[]{this, r, u1aVar});
        }
        ckf.g(u1aVar, "operation");
        int[] iArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            r = (R) u1aVar.invoke(Integer.valueOf(iArr[i]), r);
        }
        return r;
    }

    public final <R> R foldRightIndexed(R r, w1a<? super Integer, ? super Integer, ? super R, ? extends R> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("5330e455", new Object[]{this, r, w1aVar});
        }
        ckf.g(w1aVar, "operation");
        int[] iArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            r = (R) w1aVar.invoke(Integer.valueOf(i), Integer.valueOf(iArr[i]), r);
        }
        return r;
    }

    public final void forEachReversedIndexed(u1a<? super Integer, ? super Integer, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc4531", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        int[] iArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            u1aVar.invoke(Integer.valueOf(i), Integer.valueOf(iArr[i]));
        }
    }

    public final int indexOfFirst(g1a<? super Integer, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5307f0a7", new Object[]{this, g1aVar})).intValue();
        }
        ckf.g(g1aVar, "predicate");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (g1aVar.invoke(Integer.valueOf(iArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(g1a<? super Integer, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9fb633f", new Object[]{this, g1aVar})).intValue();
        }
        ckf.g(g1aVar, "predicate");
        int[] iArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (g1aVar.invoke(Integer.valueOf(iArr[i])).booleanValue()) {
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

    public final int first(g1a<? super Integer, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33feb0f0", new Object[]{this, g1aVar})).intValue();
        }
        ckf.g(g1aVar, "predicate");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (g1aVar.invoke(Integer.valueOf(i3)).booleanValue()) {
                return i3;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
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

    public final boolean reversedAny(g1a<? super Integer, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cce21b", new Object[]{this, g1aVar})).booleanValue();
        }
        ckf.g(g1aVar, "predicate");
        int[] iArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (g1aVar.invoke(Integer.valueOf(iArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a g1aVar, int i2, Object obj) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2570f09d", new Object[]{intList, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, g1aVar, new Integer(i2), obj});
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
            int[] iArr = intList.content;
            int i4 = intList._size;
            while (true) {
                if (i3 >= i4) {
                    sb.append(charSequence3);
                    break;
                }
                int i5 = iArr[i3];
                if (i3 == i) {
                    sb.append(charSequence4);
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                sb.append((CharSequence) g1aVar.invoke(Integer.valueOf(i5)));
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

    public final int last(g1a<? super Integer, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d876f5d6", new Object[]{this, g1aVar})).intValue();
        }
        ckf.g(g1aVar, "predicate");
        int[] iArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            int i2 = iArr[i];
            if (g1aVar.invoke(Integer.valueOf(i2)).booleanValue()) {
                return i2;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
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
        int[] iArr = this.content;
        int i3 = this._size;
        while (true) {
            if (i2 >= i3) {
                sb.append(charSequence3);
                break;
            }
            int i4 = iArr[i2];
            if (i2 == i) {
                sb.append(charSequence4);
                break;
            }
            if (i2 != 0) {
                sb.append(charSequence);
            }
            sb.append(i4);
            i2++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a<? super Integer, ? extends CharSequence> g1aVar) {
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
        int[] iArr = this.content;
        int i3 = this._size;
        while (true) {
            if (i2 >= i3) {
                sb.append(charSequence3);
                break;
            }
            int i4 = iArr[i2];
            if (i2 == i) {
                sb.append(charSequence4);
                break;
            }
            if (i2 != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) g1aVar.invoke(Integer.valueOf(i4)));
            i2++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, g1a<? super Integer, ? extends CharSequence> g1aVar) {
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
        int[] iArr = this.content;
        int i3 = this._size;
        while (true) {
            if (i2 >= i3) {
                sb.append(charSequence3);
                break;
            }
            int i4 = iArr[i2];
            if (i2 == i) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) g1aVar.invoke(Integer.valueOf(i4)));
            i2++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, g1a<? super Integer, ? extends CharSequence> g1aVar) {
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
        int[] iArr = this.content;
        int i2 = this._size;
        while (true) {
            if (i >= i2) {
                sb.append(charSequence3);
                break;
            }
            int i3 = iArr[i];
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) g1aVar.invoke(Integer.valueOf(i3)));
            i++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, g1a<? super Integer, ? extends CharSequence> g1aVar) {
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
        int[] iArr = this.content;
        int i2 = this._size;
        while (true) {
            if (i >= i2) {
                sb.append((CharSequence) "");
                break;
            }
            int i3 = iArr[i];
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) g1aVar.invoke(Integer.valueOf(i3)));
            i++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, g1a<? super Integer, ? extends CharSequence> g1aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e980ecd9", new Object[]{this, charSequence, g1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(g1aVar, "transform");
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.content;
        int i2 = this._size;
        while (true) {
            if (i >= i2) {
                sb.append((CharSequence) "");
                break;
            }
            int i3 = iArr[i];
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) g1aVar.invoke(Integer.valueOf(i3)));
            i++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(g1a<? super Integer, ? extends CharSequence> g1aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60e1dfd", new Object[]{this, g1aVar});
        }
        ckf.g(g1aVar, "transform");
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.content;
        int i2 = this._size;
        while (true) {
            if (i >= i2) {
                sb.append((CharSequence) "");
                break;
            }
            int i3 = iArr[i];
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) g1aVar.invoke(Integer.valueOf(i3)));
            i++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
