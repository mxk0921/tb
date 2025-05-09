package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class bq5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d4e5ff97", new Object[]{this})).longValue();
            }
            return bq5.f();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static final /* synthetic */ long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a35a07b0", new Object[0])).longValue();
        }
        return -7726639891415699670L;
    }

    public static /* synthetic */ Object ipc$super(bq5 bq5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRlHighlightText");
    }

    public final JSONObject b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cfd34a69", new Object[]{this, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "text", str);
        jSONObject.put((JSONObject) "isHighlight", (String) Boolean.TRUE);
        jSONObject.put((JSONObject) "highlightColor", str2);
        return jSONObject;
    }

    public final JSONObject c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52b0069d", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "text", str);
        jSONObject.put((JSONObject) "isHighlight", (String) Boolean.FALSE);
        return jSONObject;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Object obj = objArr[0];
        if (obj != null) {
            String str = (String) obj;
            Object obj2 = objArr[1];
            if (obj2 != null) {
                String str2 = (String) obj2;
                Object obj3 = objArr[2];
                if (obj3 != null) {
                    String str3 = (String) obj3;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (ckf.b(str2, "true")) {
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.add(b(str, str3));
                        return jSONArray;
                    }
                    JSONArray jSONArray2 = new JSONArray();
                    if (objArr.length == 3) {
                        JSONArray jSONArray3 = new JSONArray();
                        jSONArray3.add(c(str));
                        return jSONArray3;
                    }
                    if (objArr.length > 3) {
                        Object obj4 = objArr[3];
                        if (obj4 == null) {
                            JSONArray jSONArray4 = new JSONArray();
                            jSONArray4.add(c(str));
                            return jSONArray4;
                        } else if (obj4 != null) {
                            try {
                                Iterator<Object> it = ((JSONArray) obj4).iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (next != null) {
                                        JSONObject jSONObject = (JSONObject) next;
                                        String string = jSONObject.getString("start");
                                        ckf.f(string, "obj.getString(\"start\")");
                                        int parseInt = Integer.parseInt(string);
                                        String string2 = jSONObject.getString("end");
                                        ckf.f(string2, "obj.getString(\"end\")");
                                        int parseInt2 = Integer.parseInt(string2);
                                        if (parseInt >= 0 && parseInt2 >= 0 && parseInt <= parseInt2 && parseInt <= Integer.valueOf(str.length()).intValue() && parseInt2 <= Integer.valueOf(str.length()).intValue()) {
                                            while (parseInt < parseInt2) {
                                                linkedHashSet.add(Integer.valueOf(parseInt));
                                                parseInt++;
                                            }
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                StringBuilder sb2 = new StringBuilder();
                                int length = str.length();
                                for (int i = 0; i < length; i++) {
                                    if (linkedHashSet.contains(Integer.valueOf(i))) {
                                        sb2.append(str.charAt(i));
                                        if (sb.length() > 0) {
                                            String sb3 = sb.toString();
                                            ckf.f(sb3, "templateString.toString()");
                                            jSONArray2.add(c(sb3));
                                            psq.j(sb);
                                        }
                                    } else {
                                        sb.append(str.charAt(i));
                                        if (sb2.length() > 0) {
                                            String sb4 = sb2.toString();
                                            ckf.f(sb4, "templateHighString.toString()");
                                            jSONArray2.add(b(sb4, str3));
                                            psq.j(sb2);
                                        }
                                    }
                                    if (i == str.length() - 1) {
                                        if (sb.length() > 0) {
                                            String sb5 = sb.toString();
                                            ckf.f(sb5, "templateString.toString()");
                                            jSONArray2.add(c(sb5));
                                        }
                                        if (sb2.length() > 0) {
                                            String sb6 = sb2.toString();
                                            ckf.f(sb6, "templateHighString.toString()");
                                            jSONArray2.add(b(sb6, str3));
                                        }
                                    }
                                }
                            } catch (Throwable unused) {
                                JSONArray jSONArray5 = new JSONArray();
                                jSONArray5.add(c(str));
                                return jSONArray5;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
                        }
                    }
                    return jSONArray2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
