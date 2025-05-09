package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.y;
import com.taobao.android.dinamicx.widget.z;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uxt extends y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262733);
    }

    public static /* synthetic */ Object ipc$super(uxt uxtVar, String str, Object... objArr) {
        if (str.hashCode() == 2142809073) {
            return uxtVar.a((z) objArr[0], (JSONObject) objArr[1], (String) objArr[2], (String) objArr[3], ((Boolean) objArr[4]).booleanValue());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/rich/TitleUnderlineSpanGenerator");
    }

    public List<z.e> i(z zVar, JSONObject jSONObject, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("21fffce9", new Object[]{this, zVar, jSONObject, str, str2, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < str2.length(); i++) {
            String valueOf = String.valueOf(str2.charAt(i));
            str = str + valueOf;
            z.e a2 = a(zVar, jSONObject, str, valueOf, z);
            if (a2 == null) {
                a2 = new z.e();
            }
            ((ArrayList) a2.d).add(j(zVar, jSONObject));
            arrayList.add(a2);
        }
        return arrayList;
    }

    public final Object j(z zVar, JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a6d222fd", new Object[]{this, zVar, jSONObject});
        }
        int i2 = -16777216;
        if (zVar != null) {
            i = zVar.getTextColor();
        } else {
            i = -16777216;
        }
        if (jSONObject != null) {
            String string = jSONObject.getString("color");
            String string2 = jSONObject.getString("lineColor");
            try {
                i = h(string, i);
                i2 = h(string2, i);
            } catch (Throwable unused) {
            }
        }
        return new txt(i2, i, pb6.f(zVar.getDXRuntimeContext().h(), 1.5f), pb6.f(zVar.getDXRuntimeContext().h(), 2.5f));
    }

    public boolean k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd19db81", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            return Boolean.parseBoolean(jSONObject.getString("underLine"));
        }
        return false;
    }
}
