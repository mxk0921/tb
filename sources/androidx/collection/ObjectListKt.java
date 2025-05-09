package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n¢\u0006\u0004\b\u000e\u0010\r\u001a!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0010\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0012\u001a1\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0014\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015\"\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0017\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\nH\u0086\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001b\u001a)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001c\u001a1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001d\u001a0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\n2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015\"\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001e\"\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"", "", "index", "Ltb/xhv;", "checkIndex", "(Ljava/util/List;I)V", "fromIndex", "toIndex", "checkSubIndex", "(Ljava/util/List;II)V", "E", "Landroidx/collection/ObjectList;", "emptyObjectList", "()Landroidx/collection/ObjectList;", "objectListOf", "element1", "(Ljava/lang/Object;)Landroidx/collection/ObjectList;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "", tep.KEY_UNIFORM_RESULT, "([Ljava/lang/Object;)Landroidx/collection/ObjectList;", "Landroidx/collection/MutableObjectList;", "mutableObjectListOf", "()Landroidx/collection/MutableObjectList;", "(Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "([Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "", "EmptyArray", "[Ljava/lang/Object;", "EmptyObjectList", "Landroidx/collection/ObjectList;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ObjectListKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object[] EmptyArray = new Object[0];
    private static final ObjectList<Object> EmptyObjectList = new MutableObjectList(0);

    public static final /* synthetic */ void access$checkIndex(List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e1594e1", new Object[]{list, new Integer(i)});
        } else {
            checkIndex(list, i);
        }
    }

    public static final /* synthetic */ void access$checkSubIndex(List list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd15ab2", new Object[]{list, new Integer(i), new Integer(i2)});
        } else {
            checkSubIndex(list, i, i2);
        }
    }

    public static final /* synthetic */ Object[] access$getEmptyArray$p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("d37652b6", new Object[0]);
        }
        return EmptyArray;
    }

    private static final void checkIndex(List<?> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f37421", new Object[]{list, new Integer(i)});
            return;
        }
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    private static final void checkSubIndex(List<?> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2d99f2", new Object[]{list, new Integer(i), new Integer(i2)});
            return;
        }
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
        } else if (i2 > size) {
            throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final <E> ObjectList<E> emptyObjectList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectList) ipChange.ipc$dispatch("5c2bf02c", new Object[0]);
        }
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        ckf.e(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableObjectList) ipChange.ipc$dispatch("30d3ff9a", new Object[0]) : new MutableObjectList<>(0, 1, null);
    }

    public static final <E> ObjectList<E> objectListOf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectList) ipChange.ipc$dispatch("8b3ba62", new Object[0]);
        }
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        ckf.e(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return objectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableObjectList) ipChange.ipc$dispatch("849bfc36", new Object[]{e});
        }
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(1);
        mutableObjectList.add(e);
        return mutableObjectList;
    }

    public static final <E> ObjectList<E> objectListOf(E e) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ObjectList) ipChange.ipc$dispatch("157abfc6", new Object[]{e}) : mutableObjectListOf(e);
    }

    public static final <E> ObjectList<E> objectListOf(E e, E e2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ObjectList) ipChange.ipc$dispatch("c8f8b42a", new Object[]{e, e2}) : mutableObjectListOf(e, e2);
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e, E e2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableObjectList) ipChange.ipc$dispatch("20b089d2", new Object[]{e, e2});
        }
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(2);
        mutableObjectList.add(e);
        mutableObjectList.add(e2);
        return mutableObjectList;
    }

    public static final <E> ObjectList<E> objectListOf(E e, E e2, E e3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ObjectList) ipChange.ipc$dispatch("32efd78e", new Object[]{e, e2, e3}) : mutableObjectListOf(e, e2, e3);
    }

    public static final <E> ObjectList<E> objectListOf(E... eArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectList) ipChange.ipc$dispatch("d93eef27", new Object[]{eArr});
        }
        ckf.g(eArr, tep.KEY_UNIFORM_RESULT);
        MutableObjectList mutableObjectList = new MutableObjectList(eArr.length);
        mutableObjectList.plusAssign((Object[]) eArr);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e, E e2, E e3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableObjectList) ipChange.ipc$dispatch("8b6f686e", new Object[]{e, e2, e3});
        }
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(3);
        mutableObjectList.add(e);
        mutableObjectList.add(e2);
        mutableObjectList.add(e3);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E... eArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableObjectList) ipChange.ipc$dispatch("6f714be9", new Object[]{eArr});
        }
        ckf.g(eArr, tep.KEY_UNIFORM_RESULT);
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(eArr.length);
        mutableObjectList.plusAssign((Object[]) eArr);
        return mutableObjectList;
    }
}
