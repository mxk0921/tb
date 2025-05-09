package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.ArrayList;
import tb.si5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class noe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends Drawable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/handler/lines/ImageSpanGenerator$1");
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            }
        }
    }

    static {
        t2o.a(912262665);
    }

    public static si5.a a(JSONObject jSONObject, String str, String str2, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (si5.a) ipChange.ipc$dispatch("7bb89d79", new Object[]{jSONObject, str, str2, dinamicXEngine});
        }
        if (jSONObject == null) {
            return null;
        }
        si5.a aVar = new si5.a();
        int length = str.length() - str2.length();
        aVar.f28067a = length;
        aVar.b = length + str2.length();
        a aVar2 = new a();
        float b = b(jSONObject, dinamicXEngine);
        aVar2.setBounds(0, 0, (int) (c(jSONObject, str2) * b), (int) b);
        ((ArrayList) aVar.d).add(new ch3(aVar2, b));
        return aVar;
    }

    public static float b(JSONObject jSONObject, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df0ce73e", new Object[]{jSONObject, dinamicXEngine})).floatValue();
        }
        try {
            return pb6.d(dinamicXEngine, y9a.b(), Float.parseFloat(jSONObject.getString("size")));
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float c(com.alibaba.fastjson.JSONObject r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.noe.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = "d8ecbace"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            return r4
        L_0x001c:
            r0 = 0
            if (r4 != 0) goto L_0x0020
            return r0
        L_0x0020:
            java.lang.String r1 = "ratio"
            java.lang.String r4 = r4.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ratioStr =  "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ImageSpanGenerator"
            tb.tgh.b(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0047
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: all -> 0x0046
            goto L_0x0048
        L_0x0046:
        L_0x0047:
            r4 = 0
        L_0x0048:
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0050
            float r4 = d(r5)
        L_0x0050:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "getRatio: "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            tb.tgh.b(r2, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.noe.c(com.alibaba.fastjson.JSONObject, java.lang.String):float");
    }

    public static float d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3ee43d1", new Object[]{str})).floatValue();
        }
        if (str == null) {
            return 0.0f;
        }
        if (str.contains(".png")) {
            str = str.substring(0, str.indexOf(".png"));
        } else if (str.contains(".jpg")) {
            str = str.substring(0, str.indexOf(".jpg"));
        }
        String[] split = str.split("-");
        if (split.length > 2) {
            String str2 = split[split.length - 2];
            String str3 = split[split.length - 1];
            if (!(str2 == null || str3 == null)) {
                try {
                    return Float.parseFloat(str2) / Float.parseFloat(str3);
                } catch (Throwable unused) {
                }
            }
        }
        return 0.0f;
    }
}
