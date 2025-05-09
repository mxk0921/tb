package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;
import tb.hc1;
import tb.pg1;
import tb.u1a;
import tb.wjh;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a*\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a0\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0007\u001a<\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\b*\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\t\u0010\u0007\u001a(\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a0\u0010\u000b\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u000b\u0010\u000f\u001a(\u0010\u0012\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a2\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0007\u001a8\u0010\u0014\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0017\u001a \u0010\u0018\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a0\u0010\u001a\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a0\u0010\u001d\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a2\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001f\u0010\u0007\u001a \u0010 \u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b \u0010!\u001a \u0010\"\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a(\u0010$\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0080\b¢\u0006\u0004\b$\u0010%\u001a(\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0080\b¢\u0006\u0004\b&\u0010'\u001a0\u0010(\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b(\u0010)\u001a(\u0010*\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b*\u0010+\u001a(\u0010,\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b,\u0010-\u001a(\u0010.\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b.\u0010/\u001a(\u00100\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b0\u00101\u001a \u00102\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b2\u0010\u0019\u001a0\u00103\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b3\u0010\u001b\u001a \u00105\u001a\u000204\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b5\u00106\u001a(\u00107\u001a\u00020\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b7\u0010/\u001a0\u00108\u001a\u00020\n\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b8\u0010\u001b\u001a4\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b9\u0010:\u001a0\u0010;\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b;\u0010\u0007\u001a9\u0010=\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000<H\u0086\bø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a \u0010?\u001a\u00020\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b?\u0010#\u001a/\u0010@\u001a\u00020\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0007¢\u0006\u0004\b@\u0010\u000f\u001a[\u0010E\u001a\u00020\n\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010D\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\n0AH\u0086\bø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u001d\u0010H\u001a\u00020G\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bH\u0010I\u001a#\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000J\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bK\u0010L\"\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\"(\u0010R\u001a\u00020\u0010\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\f\u0012\u0004\bQ\u0010\u0019\u001a\u0004\bP\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006S"}, d2 = {"E", "Landroidx/collection/LongSparseArray;", "", "key", "commonGet", "(Landroidx/collection/LongSparseArray;J)Ljava/lang/Object;", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "T", "commonGetInternal", "Ltb/xhv;", "commonRemove", "(Landroidx/collection/LongSparseArray;J)V", "value", "", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Z", "", "index", "commonRemoveAt", "(Landroidx/collection/LongSparseArray;I)V", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;Ljava/lang/Object;)Z", "commonGc", "(Landroidx/collection/LongSparseArray;)V", "commonPut", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)V", "other", "commonPutAll", "(Landroidx/collection/LongSparseArray;Landroidx/collection/LongSparseArray;)V", "commonPutIfAbsent", "commonSize", "(Landroidx/collection/LongSparseArray;)I", "commonIsEmpty", "(Landroidx/collection/LongSparseArray;)Z", "commonKeyAt", "(Landroidx/collection/LongSparseArray;I)J", "commonValueAt", "(Landroidx/collection/LongSparseArray;I)Ljava/lang/Object;", "commonSetValueAt", "(Landroidx/collection/LongSparseArray;ILjava/lang/Object;)V", "commonIndexOfKey", "(Landroidx/collection/LongSparseArray;J)I", "commonIndexOfValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)I", "commonContainsKey", "(Landroidx/collection/LongSparseArray;J)Z", "commonContainsValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)Z", "commonClear", "commonAppend", "", "commonToString", "(Landroidx/collection/LongSparseArray;)Ljava/lang/String;", "contains", "set", "plus", "(Landroidx/collection/LongSparseArray;Landroidx/collection/LongSparseArray;)Landroidx/collection/LongSparseArray;", "getOrDefault", "Lkotlin/Function0;", "getOrElse", "(Landroidx/collection/LongSparseArray;JLtb/d1a;)Ljava/lang/Object;", "isNotEmpty", "remove", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "action", pg1.ATOM_EXT_forEach, "(Landroidx/collection/LongSparseArray;Ltb/u1a;)V", "Ltb/wjh;", "keyIterator", "(Landroidx/collection/LongSparseArray;)Ltb/wjh;", "", "valueIterator", "(Landroidx/collection/LongSparseArray;)Ljava/util/Iterator;", "", "DELETED", "Ljava/lang/Object;", "getSize", "getSize$annotations", "size", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LongSparseArrayKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object DELETED = new Object();

    public static final /* synthetic */ Object access$getDELETED$p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("787ce5bc", new Object[0]);
        }
        return DELETED;
    }

    public static final <E> void commonClear(LongSparseArray<E> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136b24a6", new Object[]{longSparseArray});
            return;
        }
        ckf.g(longSparseArray, "<this>");
        int i = longSparseArray.size;
        Object[] objArr = longSparseArray.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        longSparseArray.size = 0;
        longSparseArray.garbage = false;
    }

    public static final <E> boolean commonContainsKey(LongSparseArray<E> longSparseArray, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19edb4d5", new Object[]{longSparseArray, new Long(j)})).booleanValue();
        }
        ckf.g(longSparseArray, "<this>");
        if (longSparseArray.indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> boolean commonContainsValue(LongSparseArray<E> longSparseArray, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("312d9ca1", new Object[]{longSparseArray, e})).booleanValue();
        }
        ckf.g(longSparseArray, "<this>");
        if (longSparseArray.indexOfValue(e) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> void commonGc(LongSparseArray<E> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197b8141", new Object[]{longSparseArray});
            return;
        }
        ckf.g(longSparseArray, "<this>");
        int i = longSparseArray.size;
        long[] jArr = longSparseArray.keys;
        Object[] objArr = longSparseArray.values;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != access$getDELETED$p()) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        longSparseArray.garbage = false;
        longSparseArray.size = i2;
    }

    public static final <E> E commonGet(LongSparseArray<E> longSparseArray, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("a396bc2b", new Object[]{longSparseArray, new Long(j)});
        }
        ckf.g(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        if (binarySearch < 0 || longSparseArray.values[binarySearch] == access$getDELETED$p()) {
            return null;
        }
        return (E) longSparseArray.values[binarySearch];
    }

    public static final <T extends E, E> T commonGetInternal(LongSparseArray<E> longSparseArray, long j, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("229d5ad2", new Object[]{longSparseArray, new Long(j), t});
        }
        ckf.g(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        if (binarySearch < 0 || longSparseArray.values[binarySearch] == access$getDELETED$p()) {
            return t;
        }
        return (T) longSparseArray.values[binarySearch];
    }

    public static final <E> int commonIndexOfKey(LongSparseArray<E> longSparseArray, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a760ec90", new Object[]{longSparseArray, new Long(j)})).intValue();
        }
        ckf.g(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != access$getDELETED$p()) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i2;
        }
        return ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
    }

    public static final <E> int commonIndexOfValue(LongSparseArray<E> longSparseArray, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2adfd944", new Object[]{longSparseArray, e})).intValue();
        }
        ckf.g(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != access$getDELETED$p()) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i2;
        }
        int i4 = longSparseArray.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (longSparseArray.values[i5] == e) {
                return i5;
            }
        }
        return -1;
    }

    public static final <E> long commonKeyAt(LongSparseArray<E> longSparseArray, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("750b1976", new Object[]{longSparseArray, new Integer(i)})).longValue();
        }
        ckf.g(longSparseArray, "<this>");
        if (i < 0 || i >= longSparseArray.size) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (longSparseArray.garbage) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != access$getDELETED$p()) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
        }
        return longSparseArray.keys[i];
    }

    public static final <E> E commonPutIfAbsent(LongSparseArray<E> longSparseArray, long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("8e8f7560", new Object[]{longSparseArray, new Long(j), e});
        }
        ckf.g(longSparseArray, "<this>");
        E e2 = longSparseArray.get(j);
        if (e2 == null) {
            longSparseArray.put(j, e);
        }
        return e2;
    }

    public static final <E> void commonRemove(LongSparseArray<E> longSparseArray, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5539cb", new Object[]{longSparseArray, new Long(j)});
            return;
        }
        ckf.g(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        if (binarySearch >= 0 && longSparseArray.values[binarySearch] != access$getDELETED$p()) {
            longSparseArray.values[binarySearch] = access$getDELETED$p();
            longSparseArray.garbage = true;
        }
    }

    public static final <E> E commonReplace(LongSparseArray<E> longSparseArray, long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("eb79cb71", new Object[]{longSparseArray, new Long(j), e});
        }
        ckf.g(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = longSparseArray.values;
        E e2 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e;
        return e2;
    }

    public static final <E> void commonSetValueAt(LongSparseArray<E> longSparseArray, int i, E e) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab04b24", new Object[]{longSparseArray, new Integer(i), e});
            return;
        }
        ckf.g(longSparseArray, "<this>");
        if (i < 0 || i >= longSparseArray.size) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (longSparseArray.garbage) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != access$getDELETED$p()) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
        }
        longSparseArray.values[i] = e;
    }

    public static final <E> int commonSize(LongSparseArray<E> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2fadca6f", new Object[]{longSparseArray})).intValue();
        }
        ckf.g(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != access$getDELETED$p()) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i2;
        }
        return longSparseArray.size;
    }

    public static final <E> E commonValueAt(LongSparseArray<E> longSparseArray, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("34c6615e", new Object[]{longSparseArray, new Integer(i)});
        }
        ckf.g(longSparseArray, "<this>");
        if (i < 0 || i >= longSparseArray.size) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (longSparseArray.garbage) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != access$getDELETED$p()) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
        }
        return (E) longSparseArray.values[i];
    }

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6284399f", new Object[]{longSparseArray, new Long(j)})).booleanValue();
        }
        ckf.g(longSparseArray, "<this>");
        return longSparseArray.containsKey(j);
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c5e4bbf2", new Object[]{longSparseArray, new Long(j), t});
        }
        ckf.g(longSparseArray, "<this>");
        return longSparseArray.get(j, t);
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j, d1a<? extends T> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("5e2f55fd", new Object[]{longSparseArray, new Long(j), d1aVar});
        }
        ckf.g(longSparseArray, "<this>");
        ckf.g(d1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        T t = longSparseArray.get(j);
        return t == null ? (T) d1aVar.invoke() : t;
    }

    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e203b6e4", new Object[]{longSparseArray})).intValue();
        }
        ckf.g(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    public static /* synthetic */ void getSize$annotations(LongSparseArray longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe134f1", new Object[]{longSparseArray});
        }
    }

    public static final <T> wjh keyIterator(final LongSparseArray<T> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wjh) ipChange.ipc$dispatch("c14923fa", new Object[]{longSparseArray});
        }
        ckf.g(longSparseArray, "<this>");
        return new wjh() { // from class: androidx.collection.LongSparseArrayKt$keyIterator$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int index;

            public static /* synthetic */ Object ipc$super(LongSparseArrayKt$keyIterator$1 longSparseArrayKt$keyIterator$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/LongSparseArrayKt$keyIterator$1");
            }

            public final int getIndex() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("cf396596", new Object[]{this})).intValue();
                }
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
                }
                if (this.index < longSparseArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // tb.wjh
            public long nextLong() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("4621f90a", new Object[]{this})).longValue();
                }
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i = this.index;
                this.index = 1 + i;
                return longSparseArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
                } else {
                    this.index = i;
                }
            }
        };
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("981903e0", new Object[]{longSparseArray, longSparseArray2});
        }
        ckf.g(longSparseArray, "<this>");
        ckf.g(longSparseArray2, "other");
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        longSparseArray3.putAll(longSparseArray);
        longSparseArray3.putAll(longSparseArray2);
        return longSparseArray3;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(LongSparseArray longSparseArray, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("593beda0", new Object[]{longSparseArray, new Long(j), obj})).booleanValue();
        }
        ckf.g(longSparseArray, "<this>");
        return longSparseArray.remove(j, obj);
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7735607a", new Object[]{longSparseArray, new Long(j), t});
            return;
        }
        ckf.g(longSparseArray, "<this>");
        longSparseArray.put(j, t);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("26aa416e", new Object[]{longSparseArray});
        }
        ckf.g(longSparseArray, "<this>");
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }

    public static final <E> void commonRemoveAt(LongSparseArray<E> longSparseArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda87edd", new Object[]{longSparseArray, new Integer(i)});
            return;
        }
        ckf.g(longSparseArray, "<this>");
        if (longSparseArray.values[i] != access$getDELETED$p()) {
            longSparseArray.values[i] = access$getDELETED$p();
            longSparseArray.garbage = true;
        }
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1e9f488", new Object[]{longSparseArray})).booleanValue();
        }
        ckf.g(longSparseArray, "<this>");
        return !longSparseArray.isEmpty();
    }

    public static final <E> void commonAppend(LongSparseArray<E> longSparseArray, long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13694e7d", new Object[]{longSparseArray, new Long(j), e});
            return;
        }
        ckf.g(longSparseArray, "<this>");
        int i = longSparseArray.size;
        if (i == 0 || j > longSparseArray.keys[i - 1]) {
            if (longSparseArray.garbage) {
                long[] jArr = longSparseArray.keys;
                if (i >= jArr.length) {
                    Object[] objArr = longSparseArray.values;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != access$getDELETED$p()) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    longSparseArray.garbage = false;
                    longSparseArray.size = i2;
                }
            }
            int i4 = longSparseArray.size;
            if (i4 >= longSparseArray.keys.length) {
                int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i4 + 1);
                long[] copyOf = Arrays.copyOf(longSparseArray.keys, idealLongArraySize);
                ckf.f(copyOf, "copyOf(this, newSize)");
                longSparseArray.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf(longSparseArray.values, idealLongArraySize);
                ckf.f(copyOf2, "copyOf(this, newSize)");
                longSparseArray.values = copyOf2;
            }
            longSparseArray.keys[i4] = j;
            longSparseArray.values[i4] = e;
            longSparseArray.size = i4 + 1;
            return;
        }
        longSparseArray.put(j, e);
    }

    public static final <E> boolean commonIsEmpty(LongSparseArray<E> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb638eb4", new Object[]{longSparseArray})).booleanValue();
        }
        ckf.g(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    public static final <E> void commonPut(LongSparseArray<E> longSparseArray, long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600b8a3c", new Object[]{longSparseArray, new Long(j), e});
            return;
        }
        ckf.g(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        if (binarySearch >= 0) {
            longSparseArray.values[binarySearch] = e;
            return;
        }
        int i = ~binarySearch;
        if (i >= longSparseArray.size || longSparseArray.values[i] != access$getDELETED$p()) {
            if (longSparseArray.garbage) {
                int i2 = longSparseArray.size;
                long[] jArr = longSparseArray.keys;
                if (i2 >= jArr.length) {
                    Object[] objArr = longSparseArray.values;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        Object obj = objArr[i4];
                        if (obj != access$getDELETED$p()) {
                            if (i4 != i3) {
                                jArr[i3] = jArr[i4];
                                objArr[i3] = obj;
                                objArr[i4] = null;
                            }
                            i3++;
                        }
                    }
                    longSparseArray.garbage = false;
                    longSparseArray.size = i3;
                    i = ~ContainerHelpersKt.binarySearch(longSparseArray.keys, i3, j);
                }
            }
            int i5 = longSparseArray.size;
            if (i5 >= longSparseArray.keys.length) {
                int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i5 + 1);
                long[] copyOf = Arrays.copyOf(longSparseArray.keys, idealLongArraySize);
                ckf.f(copyOf, "copyOf(this, newSize)");
                longSparseArray.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf(longSparseArray.values, idealLongArraySize);
                ckf.f(copyOf2, "copyOf(this, newSize)");
                longSparseArray.values = copyOf2;
            }
            int i6 = longSparseArray.size;
            if (i6 - i != 0) {
                long[] jArr2 = longSparseArray.keys;
                int i7 = i + 1;
                hc1.g(jArr2, jArr2, i7, i, i6);
                Object[] objArr2 = longSparseArray.values;
                hc1.h(objArr2, objArr2, i7, i, longSparseArray.size);
            }
            longSparseArray.keys[i] = j;
            longSparseArray.values[i] = e;
            longSparseArray.size++;
            return;
        }
        longSparseArray.keys[i] = j;
        longSparseArray.values[i] = e;
    }

    public static final <E> void commonPutAll(LongSparseArray<E> longSparseArray, LongSparseArray<? extends E> longSparseArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bfc4c44", new Object[]{longSparseArray, longSparseArray2});
            return;
        }
        ckf.g(longSparseArray, "<this>");
        ckf.g(longSparseArray2, "other");
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
        }
    }

    public static final <E> String commonToString(LongSparseArray<E> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c2c1acf", new Object[]{longSparseArray});
        }
        ckf.g(longSparseArray, "<this>");
        if (longSparseArray.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(longSparseArray.size * 28);
        sb.append('{');
        int i = longSparseArray.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(longSparseArray.keyAt(i2));
            sb.append('=');
            E valueAt = longSparseArray.valueAt(i2);
            if (valueAt != sb) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, u1a<? super Long, ? super T, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc958083", new Object[]{longSparseArray, u1aVar});
            return;
        }
        ckf.g(longSparseArray, "<this>");
        ckf.g(u1aVar, "action");
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            u1aVar.invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    public static final <E> E commonGet(LongSparseArray<E> longSparseArray, long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("23c5138f", new Object[]{longSparseArray, new Long(j), e});
        }
        ckf.g(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        return (binarySearch < 0 || longSparseArray.values[binarySearch] == access$getDELETED$p()) ? e : (E) longSparseArray.values[binarySearch];
    }

    public static final <E> boolean commonReplace(LongSparseArray<E> longSparseArray, long j, E e, E e2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4097c381", new Object[]{longSparseArray, new Long(j), e, e2})).booleanValue();
        }
        ckf.g(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0 || !ckf.b(longSparseArray.values[indexOfKey], e)) {
            return false;
        }
        longSparseArray.values[indexOfKey] = e2;
        return true;
    }

    public static final <E> boolean commonRemove(LongSparseArray<E> longSparseArray, long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e386ceb", new Object[]{longSparseArray, new Long(j), e})).booleanValue();
        }
        ckf.g(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0 || !ckf.b(e, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }
}
