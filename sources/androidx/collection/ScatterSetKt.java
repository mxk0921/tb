package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u0005¢\u0006\u0002\u0010\b\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\n\u001a/\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u0005¢\u0006\u0002\u0010\f\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u000e\"\u0002H\u0005¢\u0006\u0002\u0010\u000f\u001a\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0011\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0012\u001a/\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0013\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u000e\"\u0002H\u0005¢\u0006\u0002\u0010\u0014\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"EmptyScatterSet", "Landroidx/collection/MutableScatterSet;", "", "emptyScatterSet", "Landroidx/collection/ScatterSet;", "E", "mutableScatterSetOf", "element1", "(Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", tep.KEY_UNIFORM_RESULT, "", "([Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "scatterSetOf", "(Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "([Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ScatterSetKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final MutableScatterSet<Object> EmptyScatterSet = new MutableScatterSet<>(0);

    public static final <E> ScatterSet<E> emptyScatterSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScatterSet) ipChange.ipc$dispatch("1e60831e", new Object[0]);
        }
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        ckf.e(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableScatterSet) ipChange.ipc$dispatch("7ca979fa", new Object[0]) : new MutableScatterSet<>(0, 1, null);
    }

    public static final <E> ScatterSet<E> scatterSetOf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScatterSet) ipChange.ipc$dispatch("573c1b14", new Object[0]);
        }
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        ckf.e(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableScatterSet) ipChange.ipc$dispatch("d67e32d6", new Object[]{e});
        }
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(1);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e);
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScatterSet) ipChange.ipc$dispatch("d5f5ac38", new Object[]{e}) : mutableScatterSetOf(e);
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e, E e2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableScatterSet) ipChange.ipc$dispatch("1800ecb2", new Object[]{e, e2});
        }
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(2);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e2);
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e, E e2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScatterSet) ipChange.ipc$dispatch("e5c2bc5c", new Object[]{e, e2}) : mutableScatterSetOf(e, e2);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e, E e2, E e3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScatterSet) ipChange.ipc$dispatch("e618b80", new Object[]{e, e2, e3}) : mutableScatterSetOf(e, e2, e3);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E... eArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScatterSet) ipChange.ipc$dispatch("e25af707", new Object[]{eArr});
        }
        ckf.g(eArr, tep.KEY_UNIFORM_RESULT);
        MutableScatterSet mutableScatterSet = new MutableScatterSet(eArr.length);
        mutableScatterSet.plusAssign((Object[]) eArr);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e, E e2, E e3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableScatterSet) ipChange.ipc$dispatch("9c13678e", new Object[]{e, e2, e3});
        }
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(3);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e2);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e3);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E... eArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableScatterSet) ipChange.ipc$dispatch("140f4f5b", new Object[]{eArr});
        }
        ckf.g(eArr, tep.KEY_UNIFORM_RESULT);
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(eArr.length);
        mutableScatterSet.plusAssign((Object[]) eArr);
        return mutableScatterSet;
    }
}
