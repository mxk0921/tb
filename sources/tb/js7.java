package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class js7 extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEXT_TAG_FAIL = "fail";
    public static final String NEXT_TAG_SUCESS = "success";
    public boolean n;
    public final List<String> j = new ArrayList();
    public final Map<String, Object> k = new HashMap();
    public int l = 0;
    public int m = 0;
    public final HashSet<String> o = new HashSet<>();
    public double p = vu3.b.GEO_NOT_SUPPORT;

    static {
        t2o.a(614465753);
    }

    public static /* synthetic */ Object ipc$super(js7 js7Var, String str, Object... objArr) {
        if (str.hashCode() == -282167152) {
            super.s((List) objArr[0], objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/DoBatchPayCheckV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-1143857877083333920";
    }

    @Override // tb.l6v
    public void s(List<IDMComponent> list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2e7890", new Object[]{this, list, obj});
            return;
        }
        super.s(list, obj);
        if (!lur.EVENT_LOAD_SUCCESS.equals(obj)) {
            ((ArrayList) this.j).clear();
            this.o.clear();
            ((HashMap) this.k).clear();
            this.l = 0;
            this.n = false;
            this.m = 0;
            this.p = vu3.b.GEO_NOT_SUPPORT;
        }
    }

    public final JSONObject J(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e8f8454d", new Object[]{this, str, str2, str3});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.Name.CHECKED, (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        if (str2.length() > 0) {
            jSONObject2.put("doPayIds", (Object) str2);
            jSONObject2.put("unionPayIds", (Object) str3);
        } else {
            jSONObject2.put("doPayIds", (Object) null);
            jSONObject2.put("unionPayIds", (Object) null);
        }
        jSONObject2.put("orderCount", (Object) String.valueOf(this.l));
        jSONObject2.put("itemCount", (Object) String.valueOf(this.m));
        jSONObject2.put("isRelatedPayFinal", (Object) (this.n + ""));
        jSONObject2.put("isInstallmentsFinal", (Object) ((true ^ this.o.isEmpty()) + ""));
        jSONObject2.put("totalFee", (Object) String.valueOf(this.p));
        if (!((HashMap) this.k).isEmpty()) {
            jSONObject2.put("payParams", (Object) new JSONObject(this.k).toString());
        }
        jSONObject.put("batchPayData", (Object) jSONObject2);
        return jSONObject;
    }

    public String K(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adf3f0", new Object[]{this, str, str2});
        }
        if ("true".equals(str2)) {
            if (!((ArrayList) this.j).contains(str)) {
                ((ArrayList) this.j).add(str);
            }
        } else if (((ArrayList) this.j).contains(str)) {
            ((ArrayList) this.j).remove(str);
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = ((ArrayList) this.j).iterator();
        while (it.hasNext()) {
            stringBuffer.append((String) it.next());
            stringBuffer.append(",");
        }
        if (stringBuffer.toString().endsWith(",")) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0235  */
    @Override // tb.n6v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void I(tb.b8v r20) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.js7.I(tb.b8v):void");
    }
}
