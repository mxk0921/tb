package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Iterator;
import java.util.List;
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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001c\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJA\u0010\n\u001a\u00020\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\n\u0010\u0010JA\u0010\u0011\u001a\u00020\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0016\u0010\u0019J\u001b\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u0016\u0010\u001bJ\u001b\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0016\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010\u001d\u001a\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001d\u0010\u001fJ\r\u0010 \u001a\u00028\u0000¢\u0006\u0004\b \u0010!JA\u0010 \u001a\u00028\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b \u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b#\u0010!JC\u0010#\u001a\u0004\u0018\u00018\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b#\u0010\"Jd\u0010)\u001a\u00028\u0001\"\u0004\b\u0001\u0010$2\u0006\u0010%\u001a\u00028\u000126\u0010(\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00010&H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b)\u0010*Jy\u0010-\u001a\u00028\u0001\"\u0004\b\u0001\u0010$2\u0006\u0010%\u001a\u00028\u00012K\u0010(\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00010+H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b-\u0010.Jd\u0010/\u001a\u00028\u0001\"\u0004\b\u0001\u0010$2\u0006\u0010%\u001a\u00028\u000126\u0010(\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b('\u0012\u0004\u0012\u00028\u00010&H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b/\u0010*Jy\u00100\u001a\u00028\u0001\"\u0004\b\u0001\u0010$2\u0006\u0010%\u001a\u00028\u00012K\u0010(\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b('\u0012\u0004\u0012\u00028\u00010+H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b0\u0010.JA\u00103\u001a\u0002012!\u00102\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002010\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b3\u00104JV\u00105\u001a\u00020126\u00102\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002010&H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b5\u00106JA\u00107\u001a\u0002012!\u00102\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002010\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b7\u00104JV\u00108\u001a\u00020126\u00102\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002010&H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b8\u00106J\u001a\u00109\u001a\u00028\u00002\b\b\u0001\u0010,\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00028\u00002\b\b\u0001\u0010,\u001a\u00020\u0003¢\u0006\u0004\b;\u0010:J@\u0010=\u001a\u00028\u00002\b\b\u0001\u0010,\u001a\u00020\u00032!\u0010<\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b?\u0010@JA\u0010A\u001a\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bA\u0010\u001fJA\u0010B\u001a\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bB\u0010\u001fJ\r\u0010C\u001a\u00020\u0007¢\u0006\u0004\bC\u0010\tJ\r\u0010D\u001a\u00020\u0007¢\u0006\u0004\bD\u0010\tJ\r\u0010E\u001a\u00028\u0000¢\u0006\u0004\bE\u0010!JA\u0010E\u001a\u00028\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bE\u0010\"J\u0012\u0010F\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\bF\u0010!JC\u0010F\u001a\u0004\u0018\u00018\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bF\u0010\"J\u0015\u0010G\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\bG\u0010@JY\u0010P\u001a\u00020O2\b\b\u0002\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020H2\b\b\u0002\u0010K\u001a\u00020H2\b\b\u0002\u0010L\u001a\u00020\u00032\b\b\u0002\u0010M\u001a\u00020H2\u0016\b\u0002\u0010N\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020H\u0018\u00010\u000bH\u0007¢\u0006\u0004\bP\u0010QJ\u0015\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H&¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0003H\u0016¢\u0006\u0004\bT\u0010\u001eJ\u001a\u0010V\u001a\u00020\u00072\b\u0010U\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\bV\u0010\u0013J\u000f\u0010W\u001a\u00020OH\u0016¢\u0006\u0004\bW\u0010XR$\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bY\u0010Z\u0012\u0004\b[\u0010\\R\u001c\u0010]\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b]\u0010^\u0012\u0004\b_\u0010\\R\u0011\u0010a\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b`\u0010\u001eR\u0012\u0010c\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\bb\u0010\u001eR\u0012\u0010g\u001a\u00020d8Æ\u0002¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0001\u0001h\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006i"}, d2 = {"Landroidx/collection/ObjectList;", "E", "", "", "initialCapacity", "<init>", "(I)V", "", "none", "()Z", pg1.ATOM_EXT_any, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "predicate", "(Ltb/g1a;)Z", "reversedAny", "contains", "(Ljava/lang/Object;)Z", "", tep.KEY_UNIFORM_RESULT, "containsAll", "([Ljava/lang/Object;)Z", "", "(Ljava/util/List;)Z", "", "(Ljava/lang/Iterable;)Z", "(Landroidx/collection/ObjectList;)Z", "count", "()I", "(Ltb/g1a;)I", "first", "()Ljava/lang/Object;", "(Ltb/g1a;)Ljava/lang/Object;", "firstOrNull", "R", "initial", "Lkotlin/Function2;", "acc", "operation", ytc.TYPE_FOLD, "(Ljava/lang/Object;Ltb/u1a;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "foldIndexed", "(Ljava/lang/Object;Ltb/w1a;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "Ltb/xhv;", pg1.ATOM_EXT_block, pg1.ATOM_EXT_forEach, "(Ltb/g1a;)V", "forEachIndexed", "(Ltb/u1a;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "elementAt", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "elementAtOrElse", "(ILtb/g1a;)Ljava/lang/Object;", pg1.ATOM_EXT_indexOf, "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastOrNull", pg1.ATOM_EXT_lastIndexOf, "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ltb/g1a;)Ljava/lang/String;", "asList", "()Ljava/util/List;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "content", "[Ljava/lang/Object;", "getContent$annotations", "()V", "_size", TLogTracker.LEVEL_INFO, "get_size$annotations", "getSize", "size", "getLastIndex", pg1.ATOM_lastIndex, "Ltb/aef;", "getIndices", "()Ltb/aef;", "indices", "Landroidx/collection/MutableObjectList;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ObjectList<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int _size;
    public Object[] content;

    public /* synthetic */ ObjectList(int i, a07 a07Var) {
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

    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a g1aVar, int i2, Object obj) {
        CharSequence charSequence5;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e0a7b81", new Object[]{objectList, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, g1aVar, new Integer(i2), obj});
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
            return objectList.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4, g1aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean any() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdb02877", new Object[]{this})).booleanValue() : isNotEmpty();
    }

    public abstract List<E> asList();

    public final boolean contains(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, e})).booleanValue();
        }
        if (indexOf(e) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(E[] eArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6547ee0c", new Object[]{this, eArr})).booleanValue();
        }
        ckf.g(eArr, tep.KEY_UNIFORM_RESULT);
        for (E e : eArr) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("507fb609", new Object[]{this})).intValue() : this._size;
    }

    public final E elementAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("c82a5e65", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this._size) {
            return (E) this.content[i];
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + (this._size - 1));
    }

    public final E elementAtOrElse(int i, g1a<? super Integer, ? extends E> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("ca5896fb", new Object[]{this, new Integer(i), g1aVar});
        }
        ckf.g(g1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        if (i < 0 || i >= this._size) {
            return (E) g1aVar.invoke(Integer.valueOf(i));
        }
        return (E) this.content[i];
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i = objectList._size;
            int i2 = this._size;
            if (i == i2) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                aef n = hfn.n(0, i2);
                int c = n.c();
                int d = n.d();
                if (c <= d) {
                    while (ckf.b(objArr[c], objArr2[c])) {
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

    public final E first() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("3a810cdb", new Object[]{this});
        }
        if (!isEmpty()) {
            return (E) this.content[0];
        }
        throw new NoSuchElementException("ObjectList is empty.");
    }

    public final E firstOrNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("994ba4f1", new Object[]{this});
        }
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final void forEach(g1a<? super E, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be26dfb7", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            g1aVar.invoke(objArr[i2]);
        }
    }

    public final void forEachIndexed(u1a<? super Integer, ? super E, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335d8253", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            u1aVar.invoke(Integer.valueOf(i2), objArr[i2]);
        }
    }

    public final void forEachReversed(g1a<? super E, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d507a99", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        Object[] objArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            g1aVar.invoke(objArr[i]);
        }
    }

    public final E get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this._size) {
            return (E) this.content[i];
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
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Object[] objArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 += i * 31;
        }
        return i3;
    }

    public final int indexOf(E e) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e3a7a1f", new Object[]{this, e})).intValue();
        }
        if (e == null) {
            Object[] objArr = this.content;
            int i2 = this._size;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i3 = this._size;
        while (i < i3) {
            if (e.equals(objArr2[i])) {
                return i;
            }
            i++;
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d15b303", new Object[]{this}) : joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("4e6058b5", new Object[]{this});
        }
        if (!isEmpty()) {
            return (E) this.content[this._size - 1];
        }
        throw new NoSuchElementException("ObjectList is empty.");
    }

    public final int lastIndexOf(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98592729", new Object[]{this, e})).intValue();
        }
        if (e == null) {
            Object[] objArr = this.content;
            for (int i = this._size - 1; -1 < i; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i2 = this._size - 1; -1 < i2; i2--) {
                if (e.equals(objArr2[i2])) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final E lastOrNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("8955254b", new Object[]{this});
        }
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
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
        return joinToString$default(this, null, "[", "]", 0, null, new ObjectList$toString$1(this), 25, null);
    }

    private ObjectList(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = ObjectListKt.access$getEmptyArray$p();
        } else {
            objArr = new Object[i];
        }
        this.content = objArr;
    }

    public final boolean any(g1a<? super E, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937f6a3d", new Object[]{this, g1aVar})).booleanValue();
        }
        ckf.g(g1aVar, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (g1aVar.invoke(objArr[i2]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(g1a<? super E, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d37abcf", new Object[]{this, g1aVar})).intValue();
        }
        ckf.g(g1aVar, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (g1aVar.invoke(objArr[i3]).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [E, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E firstOrNull(tb.g1a<? super E, java.lang.Boolean> r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.collection.ObjectList.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0017
            java.lang.String r3 = "ccf9feb"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            java.lang.Object r7 = r2.ipc$dispatch(r3, r4)
            return r7
        L_0x0017:
            java.lang.String r2 = "predicate"
            tb.ckf.g(r7, r2)
            java.lang.Object[] r2 = r6.content
            int r3 = r6._size
        L_0x0021:
            if (r1 >= r3) goto L_0x0034
            r4 = r2[r1]
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0032
            return r4
        L_0x0032:
            int r1 = r1 + r0
            goto L_0x0021
        L_0x0034:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectList.firstOrNull(tb.g1a):java.lang.Object");
    }

    public final String joinToString(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f9af1df", new Object[]{this, charSequence});
        }
        ckf.g(charSequence, "separator");
        return joinToString$default(this, charSequence, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(List<? extends E> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3d8717e", new Object[]{this, list})).booleanValue();
        }
        ckf.g(list, tep.KEY_UNIFORM_RESULT);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!contains(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final <R> R fold(R r, u1a<? super R, ? super E, ? extends R> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("3992b249", new Object[]{this, r, u1aVar});
        }
        ckf.g(u1aVar, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = (R) u1aVar.invoke(r, objArr[i2]);
        }
        return r;
    }

    public final <R> R foldIndexed(R r, w1a<? super Integer, ? super R, ? super E, ? extends R> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("383f373b", new Object[]{this, r, w1aVar});
        }
        ckf.g(w1aVar, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = (R) w1aVar.invoke(Integer.valueOf(i2), r, objArr[i2]);
        }
        return r;
    }

    public final <R> R foldRight(R r, u1a<? super E, ? super R, ? extends R> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("9bea2e6f", new Object[]{this, r, u1aVar});
        }
        ckf.g(u1aVar, "operation");
        Object[] objArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            r = (R) u1aVar.invoke(objArr[i], r);
        }
        return r;
    }

    public final <R> R foldRightIndexed(R r, w1a<? super Integer, ? super E, ? super R, ? extends R> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("5330e455", new Object[]{this, r, w1aVar});
        }
        ckf.g(w1aVar, "operation");
        Object[] objArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            r = (R) w1aVar.invoke(Integer.valueOf(i), objArr[i], r);
        }
        return r;
    }

    public final void forEachReversedIndexed(u1a<? super Integer, ? super E, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc4531", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        Object[] objArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            u1aVar.invoke(Integer.valueOf(i), objArr[i]);
        }
    }

    public final int indexOfFirst(g1a<? super E, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5307f0a7", new Object[]{this, g1aVar})).intValue();
        }
        ckf.g(g1aVar, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (g1aVar.invoke(objArr[i2]).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(g1a<? super E, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9fb633f", new Object[]{this, g1aVar})).intValue();
        }
        ckf.g(g1aVar, "predicate");
        Object[] objArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (g1aVar.invoke(objArr[i]).booleanValue()) {
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
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, null, 60, null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E lastOrNull(tb.g1a<? super E, java.lang.Boolean> r6) {
        /*
            r5 = this;
            r0 = -1
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.collection.ObjectList.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0017
            java.lang.String r0 = "b4b13845"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r1] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r0, r3)
            return r6
        L_0x0017:
            java.lang.String r2 = "predicate"
            tb.ckf.g(r6, r2)
            java.lang.Object[] r2 = r5.content
            int r3 = r5._size
            int r3 = r3 - r1
        L_0x0022:
            if (r0 >= r3) goto L_0x0035
            r1 = r2[r3]
            java.lang.Object r4 = r6.invoke(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0033
            return r1
        L_0x0033:
            int r3 = r3 + r0
            goto L_0x0022
        L_0x0035:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectList.lastOrNull(tb.g1a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [E, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E first(tb.g1a<? super E, java.lang.Boolean> r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.collection.ObjectList.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0016
            java.lang.String r3 = "6ddadfd5"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            java.lang.Object r7 = r2.ipc$dispatch(r3, r4)
            return r7
        L_0x0016:
            java.lang.String r2 = "predicate"
            tb.ckf.g(r7, r2)
            java.lang.Object[] r2 = r6.content
            int r3 = r6._size
        L_0x0020:
            if (r1 >= r3) goto L_0x0033
            r4 = r2[r1]
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0031
            return r4
        L_0x0031:
            int r1 = r1 + r0
            goto L_0x0020
        L_0x0033:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r0 = "ObjectList contains no element matching the predicate."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectList.first(tb.g1a):java.lang.Object");
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

    public final boolean reversedAny(g1a<? super E, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cce21b", new Object[]{this, g1aVar})).booleanValue();
        }
        ckf.g(g1aVar, "predicate");
        Object[] objArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (g1aVar.invoke(objArr[i]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(Iterable<? extends E> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("701a7516", new Object[]{this, iterable})).booleanValue();
        }
        ckf.g(iterable, tep.KEY_UNIFORM_RESULT);
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
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

    /* JADX WARN: Type inference failed for: r1v1, types: [E, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E last(tb.g1a<? super E, java.lang.Boolean> r6) {
        /*
            r5 = this;
            r0 = -1
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.collection.ObjectList.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0017
            java.lang.String r0 = "a38443af"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r1] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r0, r3)
            return r6
        L_0x0017:
            java.lang.String r2 = "predicate"
            tb.ckf.g(r6, r2)
            java.lang.Object[] r2 = r5.content
            int r3 = r5._size
            int r3 = r3 - r1
        L_0x0022:
            if (r0 >= r3) goto L_0x0035
            r1 = r2[r3]
            java.lang.Object r4 = r6.invoke(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0033
            return r1
        L_0x0033:
            int r3 = r3 + r0
            goto L_0x0022
        L_0x0035:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r0 = "ObjectList contains no element matching the predicate."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectList.last(tb.g1a):java.lang.Object");
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

    public final boolean containsAll(ObjectList<E> objectList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82f90934", new Object[]{this, objectList})).booleanValue();
        }
        ckf.g(objectList, tep.KEY_UNIFORM_RESULT);
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (!contains(objArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a<? super E, ? extends CharSequence> g1aVar) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5669cbc", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, g1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.content;
        int i3 = this._size;
        while (true) {
            if (i2 >= i3) {
                sb.append(charSequence3);
                break;
            }
            Object obj = objArr[i2];
            if (i2 == i) {
                sb.append(charSequence4);
                break;
            }
            if (i2 != 0) {
                sb.append(charSequence);
            }
            if (g1aVar == null) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) g1aVar.invoke(obj));
            }
            i2++;
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
