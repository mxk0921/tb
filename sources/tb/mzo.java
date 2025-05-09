package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f24414a;
    public static List<ii9> b;

    static {
        t2o.a(463470649);
    }

    public static List<ii9> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9ae8a5b", new Object[0]);
        }
        String b2 = uzo.b();
        if (b2 == null || b2.isEmpty()) {
            f24414a = "";
            return null;
        } else if (b2.equals(f24414a)) {
            return b;
        } else {
            f24414a = b2;
            TLog.logd("FAVSDK_SdkFilterManager", "filter json is : ".concat(b2));
            b = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(b2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("apiName");
                    JSONArray jSONArray2 = jSONObject.getJSONArray("bizCodes");
                    if (!TextUtils.isEmpty(string) && jSONArray2 != null && jSONArray2.length() > 0) {
                        ii9 ii9Var = new ii9();
                        ii9Var.f21324a = string;
                        ii9Var.b = new String[jSONArray2.length()];
                        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                            ii9Var.b[i2] = jSONArray2.getString(i2);
                        }
                        b.add(ii9Var);
                    }
                }
                TLog.logd("FAVSDK_SdkFilterManager", "filterModels is : " + b.toString());
                return b;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0050, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(tb.qzo r8, java.lang.String r9) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.mzo.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "aa3fe203"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r8
            r4[r1] = r9
            java.lang.Object r8 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x001c:
            java.util.List r2 = a()
            tb.mzo.b = r2
            java.lang.String r3 = "FAVSDK_SdkFilterManager"
            if (r2 == 0) goto L_0x008b
            int r2 = r2.size()
            if (r2 > 0) goto L_0x002d
            goto L_0x008b
        L_0x002d:
            java.lang.String r8 = r8.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "bizcode is : "
            r2.<init>(r4)
            r2.append(r9)
            java.lang.String r4 = " apiName is : "
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.taobao.tao.log.TLog.logd(r3, r2)
            java.util.List<tb.ii9> r2 = tb.mzo.b
            java.util.Iterator r2 = r2.iterator()
        L_0x0050:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r2.next()
            tb.ii9 r4 = (tb.ii9) r4
            if (r8 == 0) goto L_0x0050
            java.lang.String r5 = r4.f21324a
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0050
            java.lang.String[] r5 = r4.b
            if (r5 == 0) goto L_0x0050
            int r5 = r5.length
            if (r5 <= 0) goto L_0x0050
            r5 = 0
        L_0x006e:
            java.lang.String[] r6 = r4.b
            int r7 = r6.length
            if (r5 >= r7) goto L_0x0050
            r6 = r6[r5]
            if (r6 == 0) goto L_0x0083
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0083
            java.lang.String r8 = "filterModels filter the request"
            com.taobao.tao.log.TLog.logd(r3, r8)
            return r0
        L_0x0083:
            int r5 = r5 + r1
            goto L_0x006e
        L_0x0085:
            java.lang.String r8 = "filterModels not filter the request"
            com.taobao.tao.log.TLog.logd(r3, r8)
            return r1
        L_0x008b:
            java.lang.String r8 = "filterModels is Empty"
            com.taobao.tao.log.TLog.logd(r3, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mzo.b(tb.qzo, java.lang.String):boolean");
    }
}
