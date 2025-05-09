package tb;

import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class w7l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316625);
    }

    public static xy0 a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xy0) ipChange.ipc$dispatch("54375b7f", new Object[]{str});
        }
        xy0 xy0Var = new xy0();
        if (TextUtils.isEmpty(str)) {
            str = "linear";
        }
        for (String str2 : str.split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case -1965120668:
                    if (str2.equals("ease-in")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1269900391:
                    if (str2.equals("flip-from-right")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1164332978:
                    if (str2.equals("flip-from-bottom")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1102672091:
                    if (str2.equals("linear")) {
                        c = 3;
                        break;
                    }
                    break;
                case -934531685:
                    if (str2.equals(pg1.ATOM_EXT_repeat)) {
                        c = 4;
                        break;
                    }
                    break;
                case -789192465:
                    if (str2.equals("ease-out")) {
                        c = 5;
                        break;
                    }
                    break;
                case -595336470:
                    if (str2.equals("flip-from-left")) {
                        c = 6;
                        break;
                    }
                    break;
                case -361990811:
                    if (str2.equals("ease-in-out")) {
                        c = 7;
                        break;
                    }
                    break;
                case -19196398:
                    if (str2.equals("flip-from-top")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3105774:
                    if (str2.equals(Constants.TimeFunction.EASE)) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1099846370:
                    if (str2.equals(pg1.ATOM_EXT_reverse)) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 3:
                case 5:
                case 7:
                case '\t':
                    xy0Var.f31675a = str2;
                    break;
                case 1:
                case 2:
                case 6:
                case '\b':
                    xy0Var.b = str2;
                    break;
                case 4:
                    xy0Var.c = true;
                    break;
                case '\n':
                    xy0Var.d = true;
                    break;
            }
        }
        return xy0Var;
    }

    public static int c(o oVar, int i, Object obj) {
        n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11840af9", new Object[]{oVar, new Integer(i), obj})).intValue();
        }
        if (obj == null) {
            return 0;
        }
        int t = nwv.t(obj, 0);
        if (t > 0) {
            return t;
        }
        if (oVar == null || !(obj instanceof String)) {
            return 0;
        }
        if (i == 0) {
            nVar = oVar.d0();
        } else {
            nVar = oVar.a0(i);
        }
        ArrayList arrayList = new ArrayList();
        nVar.A((String) obj, arrayList);
        if (!arrayList.isEmpty()) {
            return ((n) arrayList.get(0)).U();
        }
        return -1;
    }

    public static qy0 d(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qy0) ipChange.ipc$dispatch("aedef709", new Object[]{context, jSONObject});
        }
        return e(null, context, 0, jSONObject);
    }

    public static qy0 e(o oVar, Context context, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qy0) ipChange.ipc$dispatch("22004aac", new Object[]{oVar, context, new Integer(i), jSONObject});
        }
        if (context == null && oVar != null) {
            context = oVar.M();
        }
        n a0 = oVar != null ? oVar.a0(i) : null;
        qy0 qy0Var = new qy0();
        if (jSONObject != null) {
            qy0Var.f26995a = jSONObject.getLongValue("duration");
            qy0Var.b = jSONObject.getLongValue("delay");
            jSONObject.getBooleanValue("needLayout");
            qy0Var.c = c(oVar, i, jSONObject.get("id"));
            qy0Var.d = jSONObject.getIntValue(pg1.ATOM_EXT_repeat);
            qy0Var.e = a(jSONObject.getString("type"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("styles");
            if (jSONObject2 != null) {
                qy0Var.g = g(a0, context, jSONObject2);
            }
            qy0Var.f = b(a0, context, jSONObject.getJSONArray("keyframes"), qy0Var.f26995a, qy0Var.e);
            qy0Var.h = jSONObject.getLongValue("completeduration");
            JSONObject jSONObject3 = jSONObject.getJSONObject("complete");
            if (jSONObject3 != null) {
                qy0Var.i = g(a0, context, jSONObject3);
            }
        }
        return qy0Var;
    }

    public static zdu f(n nVar, Context context, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zdu) ipChange.ipc$dispatch("5338149b", new Object[]{nVar, context, obj});
        }
        if (obj == null) {
            return null;
        }
        zdu zduVar = new zdu();
        if (obj instanceof String) {
            if (obj.equals("none")) {
                zduVar.c = 0.0f;
                zduVar.d = new PointF(1.0f, 1.0f);
                zduVar.e = new PointF(0.0f, 0.0f);
            } else {
                for (String str2 : nwv.H((String) obj, ',')) {
                    String trim = str2.trim();
                    int indexOf = trim.indexOf(f7l.BRACKET_START_STR);
                    String substring = trim.substring(0, indexOf);
                    try {
                        str = trim.substring(indexOf + 1, trim.length() - 1);
                    } catch (Exception e) {
                        tfs.d("fail to parse " + trim + " error " + e.getMessage());
                        str = null;
                    }
                    if (str != null) {
                        substring.hashCode();
                        char c = 65535;
                        switch (substring.hashCode()) {
                            case -925180581:
                                if (substring.equals("rotate")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 109250890:
                                if (substring.equals("scale")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 1052832078:
                                if (substring.equals("translate")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                zduVar.c = nwv.t(str, 0);
                                continue;
                            case 1:
                                zduVar.d = h(nVar, context, str, false, ' ');
                                continue;
                            case 2:
                                zduVar.e = h(nVar, context, str, true, ' ');
                                continue;
                        }
                    }
                }
            }
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.containsKey("rotate")) {
                zduVar.c = jSONObject.getFloatValue("rotate");
            }
            if (jSONObject.containsKey("rotateX")) {
                zduVar.f32699a = jSONObject.getFloatValue("rotateX");
            }
            if (jSONObject.containsKey("rotateY")) {
                zduVar.b = jSONObject.getFloatValue("rotateY");
            }
            String string = jSONObject.getString("scale");
            if (!TextUtils.isEmpty(string)) {
                zduVar.d = h(nVar, context, string, false, ',');
            }
            String string2 = jSONObject.getString("translate");
            if (!TextUtils.isEmpty(string2)) {
                zduVar.e = h(nVar, context, string2, true, ',');
            }
            String string3 = jSONObject.getString("translation");
            if (!TextUtils.isEmpty(string3)) {
                zduVar.e = h(nVar, context, string3, true, ',');
            }
            String string4 = jSONObject.getString("translation.x");
            if (!TextUtils.isEmpty(string4)) {
                if (zduVar.e == null) {
                    zduVar.e = new PointF();
                }
                zduVar.e.x = s6o.V(nVar, context, string4);
            }
            String string5 = jSONObject.getString("translation.y");
            if (!TextUtils.isEmpty(string5)) {
                if (zduVar.e == null) {
                    zduVar.e = new PointF();
                }
                zduVar.e.y = s6o.V(nVar, context, string5);
            }
        }
        return zduVar;
    }

    public static List<t3g> b(n nVar, Context context, JSONArray jSONArray, long j, xy0 xy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("99260995", new Object[]{nVar, context, jSONArray, new Long(j), xy0Var});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            t3g t3gVar = new t3g();
            Object obj = jSONObject.get("start");
            if (obj != null) {
                t3gVar.f28465a = (int) (nwv.r(obj, 0) * ((float) j));
            } else {
                t3gVar.f28465a = (int) (((i * 1.0f) / jSONArray.size()) * ((float) j));
            }
            Object obj2 = jSONObject.get("duration");
            if (obj2 != null) {
                t3gVar.b = nwv.t(obj2, 0);
            } else {
                t3gVar.b = (((float) j) * 1.0f) / jSONArray.size();
            }
            t3gVar.d = g(nVar, context, jSONObject.getJSONObject("styles"));
            String string = jSONObject.getString("type");
            if (string != null) {
                t3gVar.c = a(string);
            } else {
                t3gVar.c = xy0Var;
            }
            arrayList.add(t3gVar);
        }
        return arrayList;
    }

    public static wy0 g(n nVar, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wy0) ipChange.ipc$dispatch("f48ac875", new Object[]{nVar, context, jSONObject});
        }
        wy0 wy0Var = new wy0();
        wy0Var.e = nwv.r(jSONObject.get("opacity"), -1);
        wy0Var.d = h(nVar, context, jSONObject.getString("center"), true, ',');
        wy0Var.c = h(nVar, context, jSONObject.getString("centerOffset"), true, ',');
        Object obj = jSONObject.get("backgroundColor");
        if (obj != null) {
            wy0Var.f = ir2.e(context, 2, obj);
        }
        String string = jSONObject.getString("borderRadius");
        if (!TextUtils.isEmpty(string)) {
            wy0Var.g = s6o.V(nVar, context, string);
        }
        String string2 = jSONObject.getString("width");
        if (!TextUtils.isEmpty(string2)) {
            wy0Var.f31007a = s6o.V(nVar, context, string2);
        }
        String string3 = jSONObject.getString("height");
        if (!TextUtils.isEmpty(string3)) {
            wy0Var.b = s6o.V(nVar, context, string3);
        }
        Object obj2 = jSONObject.get("transform");
        if (obj2 != null) {
            wy0Var.i = f(nVar, context, obj2);
        }
        return wy0Var;
    }

    public static PointF h(n nVar, Context context, String str, boolean z, char c) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("7941aeb6", new Object[]{nVar, context, str, new Boolean(z), new Character(c)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PointF pointF = new PointF();
            if (c == ' ') {
                strArr = nwv.G(str.trim(), ' ');
            } else {
                strArr = str.replaceAll(" ", "").split(",");
            }
            if (strArr.length == 1) {
                if (z) {
                    float V = s6o.V(nVar, context, strArr[0]);
                    pointF.y = V;
                    pointF.x = V;
                } else {
                    float parseFloat = Float.parseFloat(strArr[0]);
                    pointF.y = parseFloat;
                    pointF.x = parseFloat;
                }
            } else if (strArr.length >= 2) {
                if (z) {
                    pointF.x = s6o.V(nVar, context, strArr[0]);
                    pointF.y = s6o.V(nVar, context, strArr[1]);
                } else {
                    pointF.x = Float.parseFloat(strArr[0]);
                    pointF.y = Float.parseFloat(strArr[1]);
                }
            }
            return pointF;
        } catch (Exception unused) {
            tfs.d("string2Point:" + str + " is Invalid");
            return null;
        }
    }
}
