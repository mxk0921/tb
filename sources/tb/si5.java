package tb;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class si5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID;
    public static final long DX_PARSER_CANSHOWINSINGLELINE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f28067a;
        public int b;
        public final int c = 33;
        public final List<Object> d = new ArrayList();

        static {
            t2o.a(912262659);
        }
    }

    static {
        t2o.a(912262658);
        long a2 = k06.a("canShowInSingleLine");
        DX_EVENT_ID = a2;
        DX_PARSER_CANSHOWINSINGLELINE = a2;
    }

    public static /* synthetic */ Object ipc$super(si5 si5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/handler/DXDataParserCanShowInSingleLine");
    }

    public final boolean a(int i, SpannableString spannableString) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40b85bf4", new Object[]{this, new Integer(i), spannableString})).booleanValue();
        }
        if (i <= 0 || spannableString == null || new DynamicLayout(spannableString, spannableString, new TextPaint(), i, Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, true).getLineCount() > 1) {
            return false;
        }
        return true;
    }

    public final int b(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7230c89e", new Object[]{this, objArr})).intValue();
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (Throwable th) {
            tgh.c("DXDataParserCanShowInSingleLine", "getComponentWidth fail", th);
            return 0;
        }
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2) {
            return Boolean.FALSE;
        }
        int b = b(objArr);
        if (b <= 0) {
            return Boolean.FALSE;
        }
        Object obj = objArr[1];
        if (obj instanceof JSONArray) {
            jSONArray = (JSONArray) obj;
        } else {
            jSONArray = null;
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(a(pb6.d(dXRuntimeContext.r(), y9a.b(), b), c(jSONArray, dXRuntimeContext.r())));
    }

    public final SpannableString c(JSONArray jSONArray, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("6d51a69f", new Object[]{this, jSONArray, dinamicXEngine});
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = jSONArray.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                if ("image".equals(jSONObject.getString("type"))) {
                    String string = jSONObject.getString("imageUrl");
                    if (!TextUtils.isEmpty(string)) {
                        str = str + string;
                        a a2 = noe.a(jSONObject.getJSONObject("style"), str, string, dinamicXEngine);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                } else {
                    String string2 = jSONObject.getString("text");
                    if (!TextUtils.isEmpty(string2)) {
                        str = str + string2;
                        a a3 = lmt.a(jSONObject.getJSONObject("style"), str, string2, dinamicXEngine);
                        if (a3 != null) {
                            arrayList.add(a3);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            Iterator it2 = ((ArrayList) aVar.d).iterator();
            while (it2.hasNext()) {
                spannableString.setSpan(it2.next(), aVar.f28067a, aVar.b, aVar.c);
            }
        }
        return spannableString;
    }
}
