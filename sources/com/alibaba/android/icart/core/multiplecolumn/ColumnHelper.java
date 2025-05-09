package com.alibaba.android.icart.core.multiplecolumn;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.WindowType;
import com.taobao.tao.Globals;
import java.util.HashMap;
import tb.c9x;
import tb.hav;
import tb.kmb;
import tb.pb6;
import tb.t2o;
import tb.ykl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ColumnHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199490);
    }

    public static int a(int i, int i2) {
        int c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e513f2fd", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (!ykl.a()) {
            return i;
        }
        if (i <= 0 || i2 <= 0) {
            hav.d(c9x.CART_BIZ_NAME, "originColumn=" + i + ",width=" + i2);
            return i;
        }
        int[] iArr = new HashMap<Integer, int[]>() { // from class: com.alibaba.android.icart.core.multiplecolumn.ColumnHelper.1
            {
                put(2, new int[]{2, 2, 4, 4, 5});
                put(3, new int[]{3, 3, 6, 6, 6});
                put(4, new int[]{4, 4, 8, 8, 8});
                put(5, new int[]{5, 5, 10, 10, 10});
            }
        }.get(Integer.valueOf(i));
        return (iArr != null && (c = c(TBAutoSizeConfig.x().L((int) pb6.C(Globals.getApplication(), i2)))) >= 0 && c < iArr.length) ? iArr[c] : i;
    }

    public static JSONObject b(kmb kmbVar, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("748abd15", new Object[]{kmbVar, new Integer(i), new Float(f)});
        }
        if (!ykl.a() || f == 0.0f) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int t0 = kmbVar.e().t0(f / i);
        jSONObject2.put("width", (Object) Integer.valueOf(t0));
        jSONObject2.put("height", (Object) Integer.valueOf(t0));
        jSONObject2.put("count", (Object) Integer.valueOf(i));
        jSONObject.put("_columnInfo", (Object) jSONObject2);
        return jSONObject;
    }

    public static int c(WindowType windowType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57e81ac", new Object[]{windowType})).intValue();
        }
        if (windowType == WindowType.MIN) {
            return 0;
        }
        if (windowType == WindowType.SMALL) {
            return 1;
        }
        if (windowType == WindowType.MEDIUM) {
            return 2;
        }
        if (windowType == WindowType.LARGE) {
            return 3;
        }
        if (windowType == WindowType.MAX) {
            return 4;
        }
        return -1;
    }
}
