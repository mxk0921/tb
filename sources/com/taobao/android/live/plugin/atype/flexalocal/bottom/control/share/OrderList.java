package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.LinkedList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class OrderList<E> extends LinkedList<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Comparator<? super E> mNameComparator;
    private final Comparator<? super E> mOrderComparator;

    static {
        t2o.a(295698526);
    }

    public OrderList(Comparator<? super E> comparator, Comparator<? super E> comparator2) {
        this.mNameComparator = comparator;
        this.mOrderComparator = comparator2;
    }

    public static /* synthetic */ Object ipc$super(OrderList orderList, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/control/share/OrderList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        r1.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        return true;
     */
    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean offer(E r6) {
        /*
            r5 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.OrderList.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = "4209ae03"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r0] = r6
            java.lang.Object r6 = r1.ipc$dispatch(r2, r3)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            java.util.Iterator r1 = r5.iterator()
            java.util.ListIterator r1 = (java.util.ListIterator) r1
        L_0x0022:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r1.next()
            java.util.Comparator<? super E> r3 = r5.mNameComparator
            if (r3 == 0) goto L_0x003a
            int r3 = r3.compare(r2, r6)
            if (r3 != 0) goto L_0x003a
            r1.set(r6)
            return r0
        L_0x003a:
            java.util.Comparator<? super E> r3 = r5.mOrderComparator
            if (r3 == 0) goto L_0x0022
            int r2 = r3.compare(r2, r6)
            if (r2 >= 0) goto L_0x0022
            r1.previous()
        L_0x0047:
            r1.add(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.OrderList.offer(java.lang.Object):boolean");
    }
}
