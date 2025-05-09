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
import tb.si5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y18 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_PARSER_ID = k06.a("richTextLine");

    public static /* synthetic */ Object ipc$super(y18 y18Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/handler/DxDataParserRichTextLine");
    }

    public final int a(int i, SpannableString spannableString) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f55aa2eb", new Object[]{this, new Integer(i), spannableString})).intValue();
        }
        if (i <= 0 || spannableString == null) {
            return 0;
        }
        return new DynamicLayout(spannableString, spannableString, new TextPaint(), i, Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, true).getLineCount();
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
        } catch (Exception e) {
            tgh.c("DxDataParserRichTextLine", "getComponentWidth fail", e);
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
            return 0;
        }
        int b = b(objArr);
        if (b <= 0) {
            return 0;
        }
        Object obj = objArr[1];
        if (obj instanceof JSONArray) {
            jSONArray = (JSONArray) obj;
        } else {
            jSONArray = null;
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            return 0;
        }
        return Integer.valueOf(a(pb6.d(dXRuntimeContext.r(), y9a.b(), b), c(jSONArray, dXRuntimeContext.r())));
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
                        si5.a a2 = noe.a(jSONObject.getJSONObject("style"), str, string, dinamicXEngine);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                } else {
                    String string2 = jSONObject.getString("text");
                    if (!TextUtils.isEmpty(string2)) {
                        str = str + string2;
                        si5.a a3 = lmt.a(jSONObject.getJSONObject("style"), str, string2, dinamicXEngine);
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
            si5.a aVar = (si5.a) it.next();
            Iterator it2 = ((ArrayList) aVar.d).iterator();
            while (it2.hasNext()) {
                spannableString.setSpan(it2.next(), aVar.f28067a, aVar.b, aVar.c);
            }
        }
        return spannableString;
    }

    static {
        t2o.a(912262664);
    }
}
