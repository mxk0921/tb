package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ko5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MTB2022EQUITY_NUMBER_CHANGE_DATA = -8285438766287101424L;
    public static final String KEY_DECIMAL = "decimalAssets";
    public static final String KEY_INTEGER = "integerAssets";
    public static final String KEY_OPERATE_CHECK_LAST_WORD = "cheekLastChr";
    public static final String KEY_OPERATE_READ_DATA = "read";
    public static final String KEY_OPERATE_SPILT_STR = "split";
    public static final String KEY_OPERATE_WRITE_DATA = "write";
    public final JSONObject b = new JSONObject();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f22795a = new HashMap();

    static {
        t2o.a(745538088);
    }

    public static /* synthetic */ Object ipc$super(ko5 ko5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/dinamicX/dataParser/DXDataParserMtb2022EquityNumberChangeData");
    }

    public final JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("37543566", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", (Object) str);
        return jSONObject;
    }

    public final JSONArray b(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("f5b9a1c6", new Object[]{this, str, str2});
        }
        JSONArray jSONArray = new JSONArray();
        if (".".equals(str) || TextUtils.isEmpty(str2)) {
            jSONArray.add(a(str));
        } else {
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                if (parseInt >= parseInt2) {
                    parseInt2 += 10;
                }
                while (parseInt <= parseInt2) {
                    if (parseInt >= 10) {
                        str3 = String.valueOf(parseInt - 10);
                    } else {
                        str3 = String.valueOf(parseInt);
                    }
                    jSONArray.add(a(str3));
                    parseInt++;
                }
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    public final String c(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("628caf96", new Object[]{this, new Float(f), new Boolean(z)});
        }
        String[] split = String.valueOf(f).split("\\.");
        if (!z) {
            return split[0];
        }
        if (split.length == 1) {
            return split[0].concat("\\.00");
        }
        String str = split[1];
        int length = str.length();
        String str2 = ".";
        for (int i = 0; i < 2; i++) {
            if (i < length) {
                str2 = str2.concat(String.valueOf(str.charAt(i)));
            } else {
                str2 = str2.concat("0");
            }
        }
        return split[0].concat(str2);
    }

    public final float f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c8e2593", new Object[]{this, str, str2})).floatValue();
        }
        float f = 0.0f;
        try {
            f = 0.0f + Integer.parseInt(str);
            if (e(str2) || str2.length() < 3) {
                return f;
            }
            return f + ((Integer.parseInt(str2.substring(1, 3)) * 1.0f) / 100.0f);
        } catch (Exception unused) {
            return f;
        }
    }

    public final int g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15838790", new Object[]{this, str, str2})).intValue();
        }
        int length = str.length() - str2.length();
        if (length > 0) {
            return length;
        }
        int i = 0;
        for (int i2 = 0; i2 < str2.length() && str2.charAt(i2) == str.charAt(i2); i2++) {
            i++;
        }
        return i;
    }

    public final Object h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("872db73f", new Object[]{this, str, str2});
        }
        if (!this.b.containsKey(str)) {
            return null;
        }
        JSONObject jSONObject = this.b.getJSONObject(str);
        Object obj = jSONObject.get(str2);
        jSONObject.remove(str2);
        return obj;
    }

    public final void j(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d44fe6", new Object[]{this, str, new Float(f)});
        } else {
            ((HashMap) this.f22795a).put(str, Float.valueOf(f));
        }
    }

    public Object k(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8c49fae4", new Object[]{this, str, str2, str3});
        }
        if (!e(str) && !e(str2)) {
            float f = f(str2, str3);
            Object obj = ((HashMap) this.f22795a).get(str);
            if (!(obj instanceof Float)) {
                j(str, f);
                return null;
            }
            float floatValue = ((Float) obj).floatValue();
            if (f > floatValue) {
                JSONObject jSONObject = new JSONObject();
                String c = c(f, !e(str3));
                String c2 = c(floatValue, !e(str3));
                int length = c.length() - c2.length();
                int g = g(c, c2);
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < str2.length(); i++) {
                    String valueOf = String.valueOf(str2.charAt(i));
                    if (i >= length && i < g) {
                        jSONArray.add(b(valueOf, null));
                    } else if (i < g) {
                        jSONArray.add(b("0", valueOf));
                    } else {
                        jSONArray.add(b(String.valueOf(c2.charAt(i - length)), valueOf));
                    }
                }
                jSONObject.put(KEY_INTEGER, (Object) jSONArray);
                if (!e(str3)) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i2 = 0; i2 < str3.length(); i2++) {
                        String valueOf2 = String.valueOf(str3.charAt(i2));
                        int length2 = str2.length() + i2;
                        if (length2 < g) {
                            jSONArray2.add(b(valueOf2, null));
                        } else {
                            jSONArray2.add(b(String.valueOf(c2.charAt(length2 - length)), valueOf2));
                        }
                    }
                    jSONObject.put(KEY_DECIMAL, (Object) jSONArray2);
                }
                this.b.put(str, (Object) jSONObject);
                j(str, f);
                return jSONObject;
            }
            j(str, f);
        }
        return null;
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dd25094", new Object[]{str})).booleanValue();
        }
        return TextUtils.isEmpty(str) || "null".equals(str);
    }

    public final Object d(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7375dcae", new Object[]{this, obj, str});
        }
        if (e(str) || !(obj instanceof JSONArray)) {
            return Boolean.FALSE;
        }
        JSONArray jSONArray = (JSONArray) obj;
        String string = jSONArray.getJSONObject(jSONArray.size() - 1).getString("text");
        if (TextUtils.isEmpty(string)) {
            return Boolean.FALSE;
        }
        for (String str2 : str.split(",")) {
            if (string.equals(str2)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public final JSONArray i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9b127e85", new Object[]{this, str});
        }
        int length = str.length();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", (Object) String.valueOf(str.charAt(i)));
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0)) {
            String valueOf = String.valueOf(objArr[0]);
            if ("write".equals(valueOf) && objArr.length >= 4) {
                return k(String.valueOf(objArr[1]), String.valueOf(objArr[2]), String.valueOf(objArr[3]));
            }
            if ("read".equals(valueOf) && objArr.length >= 3) {
                return h(String.valueOf(objArr[1]), String.valueOf(objArr[2]));
            }
            if ("split".equals(valueOf) && objArr.length >= 2) {
                return i(String.valueOf(objArr[1]));
            }
            if (KEY_OPERATE_CHECK_LAST_WORD.equals(valueOf) && objArr.length >= 3) {
                return d(objArr[1], String.valueOf(objArr[2]));
            }
        }
        return null;
    }
}
