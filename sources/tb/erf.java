package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.alipay.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class erf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Object NULL = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Map f18776a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public final Object clone() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
            }
            return this;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (obj == null || obj == this) {
                return true;
            }
            return false;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "null";
        }
    }

    public erf() {
        this.f18776a = new HashMap();
    }

    public static String d(Number number) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("daa0eef2", new Object[]{number});
        }
        if (number != null) {
            i(number);
            String obj = number.toString();
            if (obj.indexOf(46) <= 0 || obj.indexOf(101) >= 0 || obj.indexOf(69) >= 0) {
                return obj;
            }
            while (obj.endsWith("0")) {
                obj = obj.substring(0, obj.length() - 1);
            }
            if (obj.endsWith(".")) {
                return obj.substring(0, obj.length() - 1);
            }
            return obj;
        }
        throw new JSONException("Null pointer");
    }

    public static String g(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2522bc33", new Object[]{str});
        }
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append('\"');
        char c = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                stringBuffer.append("\\f");
            } else if (charAt != '\r') {
                if (charAt != '\"') {
                    if (charAt == '/') {
                        if (c == '<') {
                            stringBuffer.append('\\');
                        }
                        stringBuffer.append(charAt);
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                stringBuffer.append("\\b");
                                continue;
                            case '\t':
                                stringBuffer.append("\\t");
                                continue;
                            case '\n':
                                stringBuffer.append("\\n");
                                continue;
                            default:
                                if (charAt < ' ' || ((charAt >= 128 && charAt < 160) || (charAt >= 8192 && charAt < 8448))) {
                                    String str2 = "000" + Integer.toHexString(charAt);
                                    stringBuffer.append("\\u" + str2.substring(str2.length() - 4));
                                    break;
                                } else {
                                    stringBuffer.append(charAt);
                                    continue;
                                }
                        }
                    }
                }
                stringBuffer.append('\\');
                stringBuffer.append(charAt);
            } else {
                stringBuffer.append("\\r");
            }
            i++;
            c = charAt;
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    public static void i(Object obj) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b793eb87", new Object[]{obj});
        } else if (obj == null) {
        } else {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                if (d.isInfinite() || d.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            } else if (obj instanceof Float) {
                Float f = (Float) obj;
                if (f.isInfinite() || f.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            }
        }
    }

    public static String j(Object obj) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1a5f4c0", new Object[]{obj});
        }
        if (obj == null || obj.equals(null)) {
            return "null";
        }
        if (obj instanceof Number) {
            return d((Number) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof erf) || (obj instanceof xqf)) {
            return obj.toString();
        }
        if (obj instanceof Map) {
            return new erf((Map) obj).toString();
        }
        if (obj instanceof Collection) {
            return new xqf((Collection) obj).toString();
        }
        if (obj.getClass().isArray()) {
            return new xqf(obj).toString();
        }
        return g(obj.toString());
    }

    public Object a(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("352acab", new Object[]{this, str});
        }
        Object e = e(str);
        if (e != null) {
            return e;
        }
        throw new JSONException("JSONObject[" + g(str) + "] not found.");
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b597daf", new Object[]{this, str})).booleanValue();
        }
        return this.f18776a.containsKey(str);
    }

    public Iterator c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("6b35571c", new Object[]{this});
        }
        return this.f18776a.keySet().iterator();
    }

    public Object e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("495e2eae", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return this.f18776a.get(str);
    }

    public erf f(String str, Object obj) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (erf) ipChange.ipc$dispatch("4bffc579", new Object[]{this, str, obj});
        }
        if (str != null) {
            if (obj != null) {
                i(obj);
                this.f18776a.put(str, obj);
            } else {
                h(str);
            }
            return this;
        }
        throw new JSONException("Null key.");
    }

    public Object h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("da166bbd", new Object[]{this, str});
        }
        return this.f18776a.remove(str);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        try {
            Iterator c = c();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (c.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(',');
                }
                Object next = c.next();
                stringBuffer.append(g(next.toString()));
                stringBuffer.append(f7l.CONDITION_IF_MIDDLE);
                stringBuffer.append(j(this.f18776a.get(next)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public erf(orf orfVar) throws JSONException {
        this();
        if (orfVar.d() == '{') {
            while (true) {
                char d = orfVar.d();
                if (d == 0) {
                    throw orfVar.g("A JSONObject text must end with '}'");
                } else if (d != '}') {
                    orfVar.a();
                    String obj = orfVar.f().toString();
                    char d2 = orfVar.d();
                    if (d2 == '=') {
                        if (orfVar.b() != '>') {
                            orfVar.a();
                        }
                    } else if (d2 != ':') {
                        throw orfVar.g("Expected a ':' after a key");
                    }
                    f(obj, orfVar.f());
                    char d3 = orfVar.d();
                    if (d3 == ',' || d3 == ';') {
                        if (orfVar.d() != '}') {
                            orfVar.a();
                        } else {
                            return;
                        }
                    } else if (d3 != '}') {
                        throw orfVar.g("Expected a ',' or '}'");
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw orfVar.g("A JSONObject text must begin with '{'");
        }
    }

    public erf(Map map) {
        this.f18776a = map == null ? new HashMap() : map;
    }

    public erf(String str) throws JSONException {
        this(new orf(str));
    }
}
