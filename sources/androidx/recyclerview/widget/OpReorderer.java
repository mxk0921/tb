package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AdapterHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OpReorderer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Callback mCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface Callback {
        AdapterHelper.UpdateOp obtainUpdateOp(int i, int i2, int i3, Object obj);

        void recycleUpdateOp(AdapterHelper.UpdateOp updateOp);
    }

    public OpReorderer(Callback callback) {
        this.mCallback = callback;
    }

    private int getLastMoveOutOfOrder(List<AdapterHelper.UpdateOp> list) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ba189d1", new Object[]{this, list})).intValue();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).cmd != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    private void swapMoveAdd(List<AdapterHelper.UpdateOp> list, int i, AdapterHelper.UpdateOp updateOp, int i2, AdapterHelper.UpdateOp updateOp2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68b4703", new Object[]{this, list, new Integer(i), updateOp, new Integer(i2), updateOp2});
            return;
        }
        int i4 = updateOp.itemCount;
        int i5 = updateOp2.positionStart;
        if (i4 < i5) {
            i3 = -1;
        }
        int i6 = updateOp.positionStart;
        if (i6 < i5) {
            i3++;
        }
        if (i5 <= i6) {
            updateOp.positionStart = i6 + updateOp2.itemCount;
        }
        int i7 = updateOp2.positionStart;
        if (i7 <= i4) {
            updateOp.itemCount = i4 + updateOp2.itemCount;
        }
        updateOp2.positionStart = i7 + i3;
        list.set(i, updateOp2);
        list.set(i2, updateOp);
    }

    private void swapMoveOp(List<AdapterHelper.UpdateOp> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc549d1d", new Object[]{this, list, new Integer(i), new Integer(i2)});
            return;
        }
        AdapterHelper.UpdateOp updateOp = list.get(i);
        AdapterHelper.UpdateOp updateOp2 = list.get(i2);
        int i3 = updateOp2.cmd;
        if (i3 == 1) {
            swapMoveAdd(list, i, updateOp, i2, updateOp2);
        } else if (i3 == 2) {
            swapMoveRemove(list, i, updateOp, i2, updateOp2);
        } else if (i3 == 4) {
            swapMoveUpdate(list, i, updateOp, i2, updateOp2);
        }
    }

    public void reorderOps(List<AdapterHelper.UpdateOp> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6011af", new Object[]{this, list});
            return;
        }
        while (true) {
            int lastMoveOutOfOrder = getLastMoveOutOfOrder(list);
            if (lastMoveOutOfOrder != -1) {
                swapMoveOp(list, lastMoveOutOfOrder, lastMoveOutOfOrder + 1);
            } else {
                return;
            }
        }
    }

    public void swapMoveRemove(List<AdapterHelper.UpdateOp> list, int i, AdapterHelper.UpdateOp updateOp, int i2, AdapterHelper.UpdateOp updateOp2) {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7716ae", new Object[]{this, list, new Integer(i), updateOp, new Integer(i2), updateOp2});
            return;
        }
        int i3 = updateOp.positionStart;
        int i4 = updateOp.itemCount;
        if (i3 < i4) {
            if (updateOp2.positionStart == i3 && updateOp2.itemCount == i4 - i3) {
                z2 = true;
            }
            z = false;
        } else {
            if (updateOp2.positionStart == i4 + 1 && updateOp2.itemCount == i3 - i4) {
                z2 = true;
            }
            z = true;
        }
        int i5 = updateOp2.positionStart;
        if (i4 < i5) {
            updateOp2.positionStart = i5 - 1;
        } else {
            int i6 = updateOp2.itemCount;
            if (i4 < i5 + i6) {
                updateOp2.itemCount = i6 - 1;
                updateOp.cmd = 2;
                updateOp.itemCount = 1;
                if (updateOp2.itemCount == 0) {
                    list.remove(i2);
                    this.mCallback.recycleUpdateOp(updateOp2);
                    return;
                }
                return;
            }
        }
        int i7 = updateOp.positionStart;
        int i8 = updateOp2.positionStart;
        AdapterHelper.UpdateOp updateOp3 = null;
        if (i7 <= i8) {
            updateOp2.positionStart = i8 + 1;
        } else {
            int i9 = updateOp2.itemCount;
            if (i7 < i8 + i9) {
                updateOp3 = this.mCallback.obtainUpdateOp(2, i7 + 1, (i8 + i9) - i7, null);
                updateOp2.itemCount = updateOp.positionStart - updateOp2.positionStart;
            }
        }
        if (z2) {
            list.set(i, updateOp2);
            list.remove(i2);
            this.mCallback.recycleUpdateOp(updateOp);
            return;
        }
        if (z) {
            if (updateOp3 != null) {
                int i10 = updateOp.positionStart;
                if (i10 > updateOp3.positionStart) {
                    updateOp.positionStart = i10 - updateOp3.itemCount;
                }
                int i11 = updateOp.itemCount;
                if (i11 > updateOp3.positionStart) {
                    updateOp.itemCount = i11 - updateOp3.itemCount;
                }
            }
            int i12 = updateOp.positionStart;
            if (i12 > updateOp2.positionStart) {
                updateOp.positionStart = i12 - updateOp2.itemCount;
            }
            int i13 = updateOp.itemCount;
            if (i13 > updateOp2.positionStart) {
                updateOp.itemCount = i13 - updateOp2.itemCount;
            }
        } else {
            if (updateOp3 != null) {
                int i14 = updateOp.positionStart;
                if (i14 >= updateOp3.positionStart) {
                    updateOp.positionStart = i14 - updateOp3.itemCount;
                }
                int i15 = updateOp.itemCount;
                if (i15 >= updateOp3.positionStart) {
                    updateOp.itemCount = i15 - updateOp3.itemCount;
                }
            }
            int i16 = updateOp.positionStart;
            if (i16 >= updateOp2.positionStart) {
                updateOp.positionStart = i16 - updateOp2.itemCount;
            }
            int i17 = updateOp.itemCount;
            if (i17 >= updateOp2.positionStart) {
                updateOp.itemCount = i17 - updateOp2.itemCount;
            }
        }
        list.set(i, updateOp2);
        if (updateOp.positionStart != updateOp.itemCount) {
            list.set(i2, updateOp);
        } else {
            list.remove(i2);
        }
        if (updateOp3 != null) {
            list.add(i, updateOp3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void swapMoveUpdate(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r9, int r10, androidx.recyclerview.widget.AdapterHelper.UpdateOp r11, int r12, androidx.recyclerview.widget.AdapterHelper.UpdateOp r13) {
        /*
            r8 = this;
            r0 = 4
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.recyclerview.widget.OpReorderer.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x002c
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r10)
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r12)
            r12 = 6
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r4 = 0
            r12[r4] = r8
            r12[r1] = r9
            r9 = 2
            r12[r9] = r3
            r9 = 3
            r12[r9] = r11
            r12[r0] = r10
            r9 = 5
            r12[r9] = r13
            java.lang.String r9 = "fa306f3"
            r2.ipc$dispatch(r9, r12)
            return
        L_0x002c:
            int r2 = r11.itemCount
            int r3 = r13.positionStart
            r4 = 0
            if (r2 >= r3) goto L_0x0037
            int r3 = r3 - r1
            r13.positionStart = r3
            goto L_0x004a
        L_0x0037:
            int r5 = r13.itemCount
            int r3 = r3 + r5
            if (r2 >= r3) goto L_0x004a
            int r5 = r5 - r1
            r13.itemCount = r5
            androidx.recyclerview.widget.OpReorderer$Callback r2 = r8.mCallback
            int r3 = r11.positionStart
            java.lang.Object r5 = r13.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r2 = r2.obtainUpdateOp(r0, r3, r1, r5)
            goto L_0x004b
        L_0x004a:
            r2 = r4
        L_0x004b:
            int r3 = r11.positionStart
            int r5 = r13.positionStart
            if (r3 > r5) goto L_0x0055
            int r5 = r5 + r1
            r13.positionStart = r5
            goto L_0x006b
        L_0x0055:
            int r6 = r13.itemCount
            int r7 = r5 + r6
            if (r3 >= r7) goto L_0x006b
            int r5 = r5 + r6
            int r5 = r5 - r3
            androidx.recyclerview.widget.OpReorderer$Callback r4 = r8.mCallback
            int r3 = r3 + r1
            java.lang.Object r1 = r13.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r4 = r4.obtainUpdateOp(r0, r3, r5, r1)
            int r0 = r13.itemCount
            int r0 = r0 - r5
            r13.itemCount = r0
        L_0x006b:
            r9.set(r12, r11)
            int r11 = r13.itemCount
            if (r11 <= 0) goto L_0x0076
            r9.set(r10, r13)
            goto L_0x007e
        L_0x0076:
            r9.remove(r10)
            androidx.recyclerview.widget.OpReorderer$Callback r11 = r8.mCallback
            r11.recycleUpdateOp(r13)
        L_0x007e:
            if (r2 == 0) goto L_0x0083
            r9.add(r10, r2)
        L_0x0083:
            if (r4 == 0) goto L_0x0088
            r9.add(r10, r4)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.OpReorderer.swapMoveUpdate(java.util.List, int, androidx.recyclerview.widget.AdapterHelper$UpdateOp, int, androidx.recyclerview.widget.AdapterHelper$UpdateOp):void");
    }
}
