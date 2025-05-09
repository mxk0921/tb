package kotlin.collections.builders;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import tb.a07;
import tb.bmv;
import tb.c20;
import tb.ckf;
import tb.hc1;
import tb.mtg;
import tb.pg1;
import tb.q20;
import tb.rzf;
import tb.tep;
import tb.xz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u0000 b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003cdeB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u001b\u0010\u001a\u001a\u00020\u00192\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b \u0010!J-\u0010$\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\u001eJ5\u0010,\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0019H\u0016¢\u0006\u0004\b0\u00101J\u0018\u00103\u001a\u00028\u00002\u0006\u00102\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b3\u0010'J \u00104\u001a\u00028\u00002\u0006\u00102\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u00107J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0096\u0002¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<H\u0016¢\u0006\u0004\b=\u0010>J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010?J\u0017\u0010@\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010@\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b@\u0010!J\u001d\u0010B\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\bB\u0010CJ%\u0010B\u001a\u00020\u00192\u0006\u00102\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\bB\u0010DJ\u000f\u0010E\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010\u0011J\u0017\u0010F\u001a\u00028\u00002\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\bF\u0010'J\u0017\u0010G\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\bG\u0010AJ\u001d\u0010H\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\bH\u0010CJ\u001d\u0010I\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\bI\u0010CJ%\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010MJ)\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00010O\"\u0004\b\u0001\u0010N2\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00010OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0OH\u0016¢\u0006\u0004\bQ\u0010SJ\u001a\u0010T\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\bT\u0010AJ\u000f\u0010U\u001a\u00020\bH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bX\u0010YR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010V¨\u0006f"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Ltb/q20;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "initialCapacity", "<init>", "(I)V", "", "writeReplace", "()Ljava/lang/Object;", "Ltb/xhv;", "registerModification", "()V", "checkIsMutable", "n", "ensureExtraCapacity", "minCapacity", "ensureCapacityInternal", "", "other", "", "contentEquals", "(Ljava/util/List;)Z", bmv.MSGTYPE_INTERVAL, "insertAtInternal", "(II)V", "element", "addAtInternal", "(ILjava/lang/Object;)V", "", tep.KEY_UNIFORM_RESULT, "addAllInternal", "(ILjava/util/Collection;I)V", "removeAtInternal", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "removeRangeInternal", "retain", "retainOrRemoveAllInternal", "(IILjava/util/Collection;Z)I", CartRecommendRefreshScene.build, "()Ljava/util/List;", "isEmpty", "()Z", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", pg1.ATOM_EXT_indexOf, "(Ljava/lang/Object;)I", pg1.ATOM_EXT_lastIndexOf, "", pg1.ATOM_EXT_iterator, "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", pg1.ATOM_EXT_clear, "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "backing", "[Ljava/lang/Object;", pg1.ATOM_length, TLogTracker.LEVEL_INFO, "isReadOnly", "Z", "getSize", "size", "Companion", "a", TplMsg.VALUE_T_NATIVE_RETURN, "BuilderSubList", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ListBuilder<E> extends q20<E> implements List<E>, RandomAccess, Serializable {
    private static final a Companion = new a(null);
    private static final ListBuilder Empty;
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001aBC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u001b\u0010\u001d\u001a\u00020\u001c2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0002¢\u0006\u0004\b!\u0010\"J-\u0010&\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010-J5\u0010/\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010.\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u00102J\u0018\u00104\u001a\u00028\u00012\u0006\u00103\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b4\u0010)J \u00105\u001a\u00028\u00012\u0006\u00103\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b9\u00108J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00010:H\u0096\u0002¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010=H\u0016¢\u0006\u0004\b>\u0010?J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010=2\u0006\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010@J\u0017\u0010A\u001a\u00020\u001c2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010A\u001a\u00020\u00152\u0006\u00103\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\bA\u0010\"J\u001d\u0010C\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\bC\u0010DJ%\u0010C\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\bC\u0010EJ\u000f\u0010F\u001a\u00020\u0015H\u0016¢\u0006\u0004\bF\u0010\u0017J\u0017\u0010G\u001a\u00028\u00012\u0006\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010)J\u0017\u0010H\u001a\u00020\u001c2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\bH\u0010BJ\u001d\u0010I\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\bI\u0010DJ\u001d\u0010J\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\bJ\u0010DJ%\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bM\u0010NJ)\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u0010O2\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\bH\u0016¢\u0006\u0004\bQ\u0010SJ\u001a\u0010T\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\bT\u0010BJ\u000f\u0010U\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bX\u0010YR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010ZR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010[R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010[R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\\R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010]R\u0014\u0010^\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u00102R\u0014\u0010`\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010V¨\u0006b"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Ltb/q20;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "backing", "", "offset", pg1.ATOM_length, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT, "Lkotlin/collections/builders/ListBuilder;", "root", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ltb/xhv;", "registerModification", "()V", "checkForComodification", "checkIsMutable", "", "other", "", "contentEquals", "(Ljava/util/List;)Z", bmv.MSGTYPE_INTERVAL, "element", "addAtInternal", "(ILjava/lang/Object;)V", "", tep.KEY_UNIFORM_RESULT, "n", "addAllInternal", "(ILjava/util/Collection;I)V", "removeAtInternal", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "removeRangeInternal", "(II)V", "retain", "retainOrRemoveAllInternal", "(IILjava/util/Collection;Z)I", "isEmpty", "()Z", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", pg1.ATOM_EXT_indexOf, "(Ljava/lang/Object;)I", pg1.ATOM_EXT_lastIndexOf, "", pg1.ATOM_EXT_iterator, "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", pg1.ATOM_EXT_clear, "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[Ljava/lang/Object;", TLogTracker.LEVEL_INFO, "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "Lkotlin/collections/builders/ListBuilder;", "isReadOnly", "getSize", "size", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class BuilderSubList<E> extends q20<E> implements List<E>, RandomAccess, Serializable {
        private E[] backing;
        private int length;
        private final int offset;
        private final BuilderSubList<E> parent;
        private final ListBuilder<E> root;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static final class a<E> implements ListIterator<E>, rzf {

            /* renamed from: a  reason: collision with root package name */
            public final BuilderSubList<E> f15236a;
            public int b;
            public int c = -1;
            public int d;

            public a(BuilderSubList<E> builderSubList, int i) {
                ckf.g(builderSubList, "list");
                this.f15236a = builderSubList;
                this.b = i;
                this.d = ((AbstractList) builderSubList).modCount;
            }

            public final void a() {
                if (((AbstractList) ((BuilderSubList) this.f15236a).root).modCount != this.d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(E e) {
                a();
                int i = this.b;
                this.b = i + 1;
                BuilderSubList<E> builderSubList = this.f15236a;
                builderSubList.add(i, e);
                this.c = -1;
                this.d = ((AbstractList) builderSubList).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                if (this.b < ((BuilderSubList) this.f15236a).length) {
                    return true;
                }
                return false;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                if (this.b > 0) {
                    return true;
                }
                return false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                a();
                int i = this.b;
                BuilderSubList<E> builderSubList = this.f15236a;
                if (i < ((BuilderSubList) builderSubList).length) {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    this.c = i2;
                    return (E) ((BuilderSubList) builderSubList).backing[((BuilderSubList) builderSubList).offset + this.c];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.b;
            }

            @Override // java.util.ListIterator
            public E previous() {
                a();
                int i = this.b;
                if (i > 0) {
                    int i2 = i - 1;
                    this.b = i2;
                    this.c = i2;
                    BuilderSubList<E> builderSubList = this.f15236a;
                    return (E) ((BuilderSubList) builderSubList).backing[((BuilderSubList) builderSubList).offset + this.c];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i = this.c;
                if (i != -1) {
                    BuilderSubList<E> builderSubList = this.f15236a;
                    builderSubList.remove(i);
                    this.b = this.c;
                    this.c = -1;
                    this.d = ((AbstractList) builderSubList).modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }

            @Override // java.util.ListIterator
            public void set(E e) {
                a();
                int i = this.c;
                if (i != -1) {
                    this.f15236a.set(i, e);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
        }

        public BuilderSubList(E[] eArr, int i, int i2, BuilderSubList<E> builderSubList, ListBuilder<E> listBuilder) {
            ckf.g(eArr, "backing");
            ckf.g(listBuilder, "root");
            this.backing = eArr;
            this.offset = i;
            this.length = i2;
            this.parent = builderSubList;
            this.root = listBuilder;
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }

        private final void addAllInternal(int i, Collection<? extends E> collection, int i2) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAllInternal(i, collection, i2);
            } else {
                this.root.addAllInternal(i, collection, i2);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += i2;
        }

        private final void addAtInternal(int i, E e) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAtInternal(i, e);
            } else {
                this.root.addAtInternal(i, e);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        private final void checkForComodification() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void checkIsMutable() {
            if (isReadOnly()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean contentEquals(List<?> list) {
            boolean h;
            h = mtg.h(this.backing, this.offset, this.length, list);
            return h;
        }

        private final boolean isReadOnly() {
            return ((ListBuilder) this.root).isReadOnly;
        }

        private final void registerModification() {
            ((AbstractList) this).modCount++;
        }

        private final E removeAtInternal(int i) {
            E e;
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                e = builderSubList.removeAtInternal(i);
            } else {
                e = (E) this.root.removeAtInternal(i);
            }
            this.length--;
            return e;
        }

        private final void removeRangeInternal(int i, int i2) {
            if (i2 > 0) {
                registerModification();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.removeRangeInternal(i, i2);
            } else {
                this.root.removeRangeInternal(i, i2);
            }
            this.length -= i2;
        }

        private final int retainOrRemoveAllInternal(int i, int i2, Collection<? extends E> collection, boolean z) {
            int i3;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                i3 = builderSubList.retainOrRemoveAllInternal(i, i2, collection, z);
            } else {
                i3 = this.root.retainOrRemoveAllInternal(i, i2, collection, z);
            }
            if (i3 > 0) {
                registerModification();
            }
            this.length -= i3;
            return i3;
        }

        private final Object writeReplace() {
            if (isReadOnly()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E e) {
            checkIsMutable();
            checkForComodification();
            addAtInternal(this.offset + this.length, e);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> collection) {
            ckf.g(collection, tep.KEY_UNIFORM_RESULT);
            checkIsMutable();
            checkForComodification();
            int size = collection.size();
            addAllInternal(this.offset + this.length, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            checkIsMutable();
            checkForComodification();
            removeRangeInternal(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            checkForComodification();
            if (obj == this || ((obj instanceof List) && contentEquals((List) obj))) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            checkForComodification();
            c20.Companion.b(i, this.length);
            return this.backing[this.offset + i];
        }

        @Override // tb.q20
        public int getSize() {
            checkForComodification();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i;
            checkForComodification();
            i = mtg.i(this.backing, this.offset, this.length);
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            checkForComodification();
            for (int i = 0; i < this.length; i++) {
                if (ckf.b(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            checkForComodification();
            if (this.length == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            checkForComodification();
            for (int i = this.length - 1; i >= 0; i--) {
                if (ckf.b(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            checkIsMutable();
            checkForComodification();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                remove(indexOf);
            }
            if (indexOf >= 0) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<? extends Object> collection) {
            ckf.g(collection, tep.KEY_UNIFORM_RESULT);
            checkIsMutable();
            checkForComodification();
            if (retainOrRemoveAllInternal(this.offset, this.length, collection, false) > 0) {
                return true;
            }
            return false;
        }

        @Override // tb.q20
        public E removeAt(int i) {
            checkIsMutable();
            checkForComodification();
            c20.Companion.b(i, this.length);
            return removeAtInternal(this.offset + i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<? extends Object> collection) {
            ckf.g(collection, tep.KEY_UNIFORM_RESULT);
            checkIsMutable();
            checkForComodification();
            if (retainOrRemoveAllInternal(this.offset, this.length, collection, true) > 0) {
                return true;
            }
            return false;
        }

        @Override // tb.q20, java.util.AbstractList, java.util.List
        public E set(int i, E e) {
            checkIsMutable();
            checkForComodification();
            c20.Companion.b(i, this.length);
            E[] eArr = this.backing;
            int i2 = this.offset;
            E e2 = eArr[i2 + i];
            eArr[i2 + i] = e;
            return e2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int i, int i2) {
            c20.Companion.d(i, i2, this.length);
            return new BuilderSubList(this.backing, this.offset + i, i2 - i, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] tArr) {
            ckf.g(tArr, "array");
            checkForComodification();
            int length = tArr.length;
            int i = this.length;
            if (length < i) {
                E[] eArr = this.backing;
                int i2 = this.offset;
                T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
                ckf.f(tArr2, "copyOfRange(...)");
                return tArr2;
            }
            E[] eArr2 = this.backing;
            int i3 = this.offset;
            hc1.h(eArr2, tArr, 0, i3, i + i3);
            xz3.f(this.length, tArr);
            return tArr;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String j;
            checkForComodification();
            j = mtg.j(this.backing, this.offset, this.length, this);
            return j;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i) {
            checkForComodification();
            c20.Companion.c(i, this.length);
            return new a(this, i);
        }

        @Override // tb.q20, java.util.AbstractList, java.util.List
        public void add(int i, E e) {
            checkIsMutable();
            checkForComodification();
            c20.Companion.c(i, this.length);
            addAtInternal(this.offset + i, e);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection<? extends E> collection) {
            ckf.g(collection, tep.KEY_UNIFORM_RESULT);
            checkIsMutable();
            checkForComodification();
            c20.Companion.c(i, this.length);
            int size = collection.size();
            addAllInternal(this.offset + i, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            checkForComodification();
            E[] eArr = this.backing;
            int i = this.offset;
            return hc1.m(eArr, i, this.length + i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b<E> implements ListIterator<E>, rzf {

        /* renamed from: a  reason: collision with root package name */
        public final ListBuilder<E> f15237a;
        public int b;
        public int c = -1;
        public int d;

        public b(ListBuilder<E> listBuilder, int i) {
            ckf.g(listBuilder, "list");
            this.f15237a = listBuilder;
            this.b = i;
            this.d = ((AbstractList) listBuilder).modCount;
        }

        public final void a() {
            if (((AbstractList) this.f15237a).modCount != this.d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            a();
            int i = this.b;
            this.b = i + 1;
            ListBuilder<E> listBuilder = this.f15237a;
            listBuilder.add(i, e);
            this.c = -1;
            this.d = ((AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.b < ((ListBuilder) this.f15237a).length) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.b > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            a();
            int i = this.b;
            ListBuilder<E> listBuilder = this.f15237a;
            if (i < ((ListBuilder) listBuilder).length) {
                int i2 = this.b;
                this.b = i2 + 1;
                this.c = i2;
                return (E) ((ListBuilder) listBuilder).backing[this.c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i = this.b;
            if (i > 0) {
                int i2 = i - 1;
                this.b = i2;
                this.c = i2;
                return (E) ((ListBuilder) this.f15237a).backing[this.c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i = this.c;
            if (i != -1) {
                ListBuilder<E> listBuilder = this.f15237a;
                listBuilder.remove(i);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) listBuilder).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            a();
            int i = this.c;
            if (i != -1) {
                this.f15237a.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        Empty = listBuilder;
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addAllInternal(int i, Collection<? extends E> collection, int i2) {
        registerModification();
        insertAtInternal(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.backing[i + i3] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAtInternal(int i, E e) {
        registerModification();
        insertAtInternal(i, 1);
        this.backing[i] = e;
    }

    private final void checkIsMutable() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean contentEquals(List<?> list) {
        boolean h;
        h = mtg.h(this.backing, 0, this.length, list);
        return h;
    }

    private final void ensureCapacityInternal(int i) {
        if (i >= 0) {
            E[] eArr = this.backing;
            if (i > eArr.length) {
                this.backing = (E[]) mtg.e(this.backing, c20.Companion.e(eArr.length, i));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void ensureExtraCapacity(int i) {
        ensureCapacityInternal(this.length + i);
    }

    private final void insertAtInternal(int i, int i2) {
        ensureExtraCapacity(i2);
        E[] eArr = this.backing;
        hc1.h(eArr, eArr, i + i2, i, this.length);
        this.length += i2;
    }

    private final void registerModification() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E removeAtInternal(int i) {
        registerModification();
        E[] eArr = this.backing;
        E e = eArr[i];
        hc1.h(eArr, eArr, i, i + 1, this.length);
        mtg.f(this.backing, this.length - 1);
        this.length--;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeRangeInternal(int i, int i2) {
        if (i2 > 0) {
            registerModification();
        }
        E[] eArr = this.backing;
        hc1.h(eArr, eArr, i, i + i2, this.length);
        E[] eArr2 = this.backing;
        int i3 = this.length;
        mtg.g(eArr2, i3 - i2, i3);
        this.length -= i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int retainOrRemoveAllInternal(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.backing[i5]) == z) {
                E[] eArr = this.backing;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.backing;
        hc1.h(eArr2, eArr2, i + i4, i2 + i, this.length);
        E[] eArr3 = this.backing;
        int i7 = this.length;
        mtg.g(eArr3, i7 - i6, i7);
        if (i6 > 0) {
            registerModification();
        }
        this.length -= i6;
        return i6;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        checkIsMutable();
        addAtInternal(this.length, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        checkIsMutable();
        int size = collection.size();
        addAllInternal(this.length, collection, size);
        return size > 0;
    }

    public final List<E> build() {
        checkIsMutable();
        this.isReadOnly = true;
        if (this.length > 0) {
            return this;
        }
        return Empty;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof List) && contentEquals((List) obj))) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        c20.Companion.b(i, this.length);
        return this.backing[i];
    }

    @Override // tb.q20
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i;
        i = mtg.i(this.backing, 0, this.length);
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (ckf.b(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (this.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (ckf.b(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        checkIsMutable();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        checkIsMutable();
        if (retainOrRemoveAllInternal(0, this.length, collection, false) > 0) {
            return true;
        }
        return false;
    }

    @Override // tb.q20
    public E removeAt(int i) {
        checkIsMutable();
        c20.Companion.b(i, this.length);
        return removeAtInternal(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        checkIsMutable();
        if (retainOrRemoveAllInternal(0, this.length, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // tb.q20, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        checkIsMutable();
        c20.Companion.b(i, this.length);
        E[] eArr = this.backing;
        E e2 = eArr[i];
        eArr[i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i, int i2) {
        c20.Companion.d(i, i2, this.length);
        return new BuilderSubList(this.backing, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        ckf.g(tArr, "array");
        int length = tArr.length;
        int i = this.length;
        if (length < i) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(this.backing, 0, i, tArr.getClass());
            ckf.f(tArr2, "copyOfRange(...)");
            return tArr2;
        }
        hc1.h(this.backing, tArr, 0, 0, i);
        xz3.f(this.length, tArr);
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j;
        j = mtg.j(this.backing, 0, this.length, this);
        return j;
    }

    public ListBuilder(int i) {
        this.backing = (E[]) mtg.d(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        c20.Companion.c(i, this.length);
        return new b(this, i);
    }

    @Override // tb.q20, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        checkIsMutable();
        c20.Companion.c(i, this.length);
        addAtInternal(i, e);
    }

    public /* synthetic */ ListBuilder(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        checkIsMutable();
        c20.Companion.c(i, this.length);
        int size = collection.size();
        addAllInternal(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return hc1.m(this.backing, 0, this.length);
    }
}
