package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bf5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237922);
    }

    public static void a(Context context, z3i z3iVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f71de9b0", new Object[]{context, z3iVar, jSONObject});
        } else if (jSONObject != null && z3iVar != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("margin");
            if (jSONArray != null) {
                String[] strArr = new String[4];
                for (int i = 0; i < 4 && i < jSONArray.size(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                int[] iArr = new int[4];
                for (int i2 = 0; i2 < 4; i2++) {
                    iArr[i2] = pb6.o(context, strArr[i2], 0);
                }
                z3iVar.K(iArr[3], iArr[0], iArr[1], iArr[2]);
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("padding");
            if (jSONArray2 != null) {
                String[] strArr2 = new String[4];
                for (int i3 = 0; i3 < 4 && i3 < jSONArray2.size(); i3++) {
                    strArr2[i3] = jSONArray2.getString(i3);
                }
                int[] iArr2 = new int[4];
                for (int i4 = 0; i4 < 4; i4++) {
                    iArr2[i4] = pb6.o(context, strArr2[i4], 0);
                }
                z3iVar.P(iArr2[3], iArr2[0], iArr2[1], iArr2[2]);
            }
        }
    }
}
