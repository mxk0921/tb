package com.taobao.weex.ui.view.border;

import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.dom.CSSShorthand;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BorderUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(985661744);
    }

    public static int fetchFromSparseArray(SparseIntArray sparseIntArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4517bd21", new Object[]{sparseIntArray, new Integer(i), new Integer(i2)})).intValue();
        }
        if (sparseIntArray == null) {
            return i2;
        }
        return sparseIntArray.get(i, sparseIntArray.get(CSSShorthand.EDGE.ALL.ordinal()));
    }

    public static void updateSparseArray(SparseIntArray sparseIntArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6825fb3", new Object[]{sparseIntArray, new Integer(i), new Integer(i2)});
            return;
        }
        CSSShorthand.EDGE edge = CSSShorthand.EDGE.ALL;
        if (i == edge.ordinal()) {
            sparseIntArray.put(edge.ordinal(), i2);
            sparseIntArray.put(CSSShorthand.EDGE.TOP.ordinal(), i2);
            sparseIntArray.put(CSSShorthand.EDGE.LEFT.ordinal(), i2);
            sparseIntArray.put(CSSShorthand.EDGE.RIGHT.ordinal(), i2);
            sparseIntArray.put(CSSShorthand.EDGE.BOTTOM.ordinal(), i2);
            return;
        }
        sparseIntArray.put(i, i2);
    }
}
