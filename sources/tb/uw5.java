package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte TYPE_ARRAY = 6;
    public static final byte TYPE_BOOL = 4;
    public static final byte TYPE_BUILTIN_OBJECT = 8;
    public static final byte TYPE_DOUBLE = 3;
    public static final byte TYPE_FUNCTION = 9;
    public static final byte TYPE_INT = 2;
    public static final byte TYPE_INVALID = -1;
    public static final byte TYPE_JAVA_OBJECT = 10;
    public static final byte TYPE_MAP = 7;
    public static final byte TYPE_NULL = 1;
    public static final byte TYPE_STRING = 5;
    public static final byte TYPE_UNDEFINED = 0;
    public static final byte TYPE_VOID = 11;

    /* renamed from: a  reason: collision with root package name */
    public byte f29645a;
    public long b;
    public double c;
    public Object d;
    public static final uw5 NULL_VAR = new uw5((byte) 1, 0, vu3.b.GEO_NOT_SUPPORT, null);
    public static final uw5 UNDEFINED_VAR = new uw5((byte) 0, 0, vu3.b.GEO_NOT_SUPPORT, null);
    public static final uw5 TRUE_VAR = new uw5((byte) 4, 1, vu3.b.GEO_NOT_SUPPORT, null);
    public static final uw5 FALSE_VAR = new uw5((byte) 4, 0, vu3.b.GEO_NOT_SUPPORT, null);
    public static final uw5 VOID_VAR = new uw5((byte) 11, 0, vu3.b.GEO_NOT_SUPPORT, null);

    static {
        t2o.a(444597986);
        t2o.a(444597900);
    }

    public uw5() {
        Z();
    }

    public static uw5 N(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("107b0a7e", new Object[]{list});
        }
        if (list == null) {
            return V();
        }
        return new uw5((byte) 6, 0L, vu3.b.GEO_NOT_SUPPORT, list);
    }

    public static uw5 O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("e3d3ae8c", new Object[]{new Boolean(z)});
        }
        if (z) {
            return TRUE_VAR;
        }
        return FALSE_VAR;
    }

    public static uw5 P(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("232ef2c9", new Object[]{new Double(d)});
        }
        return new uw5((byte) 3, 0L, d, null);
    }

    public static uw5 Q(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("fd29b184", new Object[]{new Float(f)});
        }
        return new uw5((byte) 3, 0L, f, null);
    }

    public static uw5 R(xwb xwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("7f018b6c", new Object[]{xwbVar});
        }
        return new uw5((byte) 9, 0L, vu3.b.GEO_NOT_SUPPORT, xwbVar);
    }

    public static uw5 S(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("eaf87c13", new Object[]{new Long(j)});
        }
        return new uw5((byte) 2, j, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public static uw5 T(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("b2a3877d", new Object[]{obj});
        }
        return c(obj);
    }

    public static uw5 U(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("18bb781f", new Object[]{map});
        }
        return new uw5((byte) 7, 0L, vu3.b.GEO_NOT_SUPPORT, map);
    }

    public static uw5 V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("cba39613", new Object[0]);
        }
        return NULL_VAR;
    }

    public static uw5 W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("3478eebf", new Object[]{str});
        }
        if (str == null) {
            return V();
        }
        return new uw5((byte) 5, 0L, vu3.b.GEO_NOT_SUPPORT, str);
    }

    public static uw5 X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("38008438", new Object[0]);
        }
        return UNDEFINED_VAR;
    }

    public static uw5 Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("c6db73a6", new Object[0]);
        }
        return VOID_VAR;
    }

    public static Object a0(uw5 uw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("94e008c", new Object[]{uw5Var});
        }
        int x = uw5Var.x();
        if (x != -1) {
            switch (x) {
                case 2:
                    return Integer.valueOf(uw5Var.s());
                case 3:
                    return Double.valueOf(uw5Var.q());
                case 4:
                    return Boolean.valueOf(uw5Var.o());
                case 5:
                    return uw5Var.w();
                case 6:
                    return uw5Var.n();
                case 7:
                    return uw5Var.v();
                case 8:
                    return uw5Var.p();
                case 9:
                    return uw5Var.r();
                case 10:
                    return uw5Var.t();
                default:
                    return null;
            }
        } else {
            throw new IllegalArgumentException("Invalid type");
        }
    }

    public static uw5 c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("3ffeba7b", new Object[]{obj});
        }
        if (obj == null) {
            return V();
        }
        if (obj instanceof JSONObject) {
            return U((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return N((JSONArray) obj);
        }
        if (obj instanceof String) {
            return W((String) obj);
        }
        if (obj instanceof Boolean) {
            return O(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Integer) {
            return S(((Integer) obj).intValue());
        }
        if (obj instanceof Float) {
            return P(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return S(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return P(((Double) obj).doubleValue());
        }
        if (obj instanceof BigDecimal) {
            return P(((BigDecimal) obj).doubleValue());
        }
        return new uw5((byte) 10, 0L, vu3.b.GEO_NOT_SUPPORT, obj);
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f13c645a", new Object[]{this})).booleanValue();
        }
        if (this.f29645a != 6 || !(this.d instanceof JSONArray)) {
            return false;
        }
        return true;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("482fe1bf", new Object[]{this})).booleanValue();
        }
        if (this.f29645a == 4) {
            return true;
        }
        return false;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c46d4c3", new Object[]{this})).booleanValue();
        }
        if (this.f29645a == 8) {
            return true;
        }
        return false;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afc3aca6", new Object[]{this})).booleanValue();
        }
        if (this.f29645a == 3) {
            return true;
        }
        return false;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5f63ead", new Object[]{this})).booleanValue();
        }
        if (this.f29645a == 9) {
            return true;
        }
        return false;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("520cd470", new Object[]{this})).booleanValue();
        }
        if (this.f29645a == 2) {
            return true;
        }
        return false;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3906bbd6", new Object[]{this})).booleanValue();
        }
        if (this.f29645a == 10) {
            return true;
        }
        return false;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3e635d", new Object[]{this})).booleanValue();
        }
        if (this.f29645a != 7 || !(this.d instanceof JSONObject)) {
            return false;
        }
        return true;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f04d5dc", new Object[]{this})).booleanValue();
        }
        if (this.f29645a == 1) {
            return true;
        }
        return false;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f55e2a7", new Object[]{this})).booleanValue();
        }
        byte b = this.f29645a;
        if (b == 0 || b == 1) {
            return true;
        }
        return false;
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69f8901e", new Object[]{this})).booleanValue();
        }
        byte b = this.f29645a;
        if (b == 2 || b == 3 || b == 1 || b == 0) {
            return true;
        }
        return false;
    }

    public boolean L(uw5 uw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53c503bc", new Object[]{this, uw5Var})).booleanValue();
        }
        if (this.d == uw5Var.d) {
            return true;
        }
        return false;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("239570e6", new Object[]{this})).booleanValue();
        }
        if (this.f29645a == 5) {
            return true;
        }
        return false;
    }

    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f29645a = (byte) -1;
        this.b = 0L;
        this.c = vu3.b.GEO_NOT_SUPPORT;
        this.d = null;
    }

    public final String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c22cc6d8", new Object[]{this, obj});
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int size = jSONArray.size();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb.append(a(jSONArray.get(i)));
                if (i < size - 1) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (obj instanceof JSONObject) {
            return "[object Object]";
        } else {
            if (obj != null) {
                return obj.toString();
            }
            return "";
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5576c0b0", new Object[]{this})).booleanValue();
        }
        switch (this.f29645a) {
            case 0:
            case 1:
                return false;
            case 2:
            case 4:
                if (this.b != 0) {
                    return true;
                }
                return false;
            case 3:
                if (this.c != vu3.b.GEO_NOT_SUPPORT) {
                    return true;
                }
                return false;
            case 5:
                if (((String) this.d).length() == 0 || ((String) this.d).equalsIgnoreCase("false")) {
                    return false;
                }
                return true;
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                throw new IllegalStateException("invalid type");
        }
    }

    public Object b0() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1af82031", new Object[]{this});
        }
        if (M() || A() || H() || G() || E()) {
            return this.d;
        }
        if (F()) {
            return Long.valueOf(this.b);
        }
        if (B()) {
            if (this.b == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (D()) {
            return Double.valueOf(this.c);
        } else {
            if (J() || !DinamicXEngine.j0()) {
                return null;
            }
            throw new IllegalArgumentException("Invalid type");
        }
    }

    public boolean c0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ebd272f", new Object[]{this, str})).booleanValue();
        }
        str.hashCode();
        if (!str.equals(pg1.ATOM_Map) && !str.equals("MutableMap")) {
            return str.equals(d0());
        }
        if (7 == x()) {
            return true;
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3f8b823", new Object[]{this})).booleanValue();
        }
        byte b = this.f29645a;
        if (b == 0 || b == 1) {
            return false;
        }
        if (b != 2) {
            if (b != 3) {
                if (b != 4) {
                    if (b == 5) {
                        return Boolean.parseBoolean((String) this.d);
                    }
                    throw new IllegalStateException("can't conver to boolean:" + this);
                }
            } else if (this.c != vu3.b.GEO_NOT_SUPPORT) {
                return true;
            } else {
                return false;
            }
        }
        if (this.b != 0) {
            return true;
        }
        return false;
    }

    public String d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9647ed08", new Object[]{this});
        }
        switch (this.f29645a) {
            case -1:
                throw new IllegalArgumentException("Invalid type");
            case 0:
                return pg1.ATOM_EXT_Undefined;
            case 1:
                return pg1.ATOM_EXT_Null;
            case 2:
                return "Int";
            case 3:
                return "Double";
            case 4:
                return pg1.ATOM_Boolean;
            case 5:
                return pg1.ATOM_String;
            case 6:
                return "List";
            case 7:
                return pg1.ATOM_Map;
            case 8:
            default:
                throw new IllegalArgumentException("Invalid type" + ((int) this.f29645a));
            case 9:
                return pg1.ATOM_function;
            case 10:
                return "java_object";
        }
    }

    public double e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cb079f4", new Object[]{this})).doubleValue();
        }
        byte b = this.f29645a;
        if (b == 0 || b == 1) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        if (b == 2) {
            return this.b;
        }
        if (b == 3) {
            return this.c;
        }
        if (b == 5) {
            return Double.parseDouble((String) this.d);
        }
        if (!DinamicXEngine.j0()) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        throw new IllegalStateException("can't conver to double:" + this);
    }

    public float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5a450e5", new Object[]{this})).floatValue();
        }
        byte b = this.f29645a;
        if (b == 0) {
            return Float.NaN;
        }
        if (b == 5) {
            return Float.parseFloat((String) this.d);
        }
        if (b == 2) {
            return (float) this.b;
        }
        if (b == 3) {
            return (float) this.c;
        }
        throw new IllegalStateException("can't conver to float:" + this);
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c05da17c", new Object[]{this})).longValue();
        }
        byte b = this.f29645a;
        if (b == 0 || b == 1) {
            return 0L;
        }
        if (b != 2) {
            if (b == 3) {
                return (long) this.c;
            }
            if (b != 4) {
                if (b == 5) {
                    return Long.parseLong((String) this.d);
                }
                if (!DinamicXEngine.j0()) {
                    return 0L;
                }
                throw new IllegalStateException("can't conver to int:" + this);
            }
        }
        return this.b;
    }

    public List h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("83f01e14", new Object[]{this});
        }
        Object obj = this.d;
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    public Map i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c234d1ea", new Object[]{this});
        }
        Object obj = this.d;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("819f4b1a", new Object[]{this});
        }
        return toString();
    }

    public void k(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da21a8b", new Object[]{this, new Double(d)});
            return;
        }
        this.f29645a = (byte) 3;
        this.c = d;
    }

    public void l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d73f389", new Object[]{this, new Long(j)});
            return;
        }
        this.f29645a = (byte) 2;
        this.b = j;
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c870e75d", new Object[]{this, str});
            return;
        }
        this.f29645a = (byte) 5;
        this.d = str;
    }

    public JSONArray n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d4a9154", new Object[]{this});
        }
        if (A()) {
            return (JSONArray) this.d;
        }
        throw new IllegalStateException("getArray from a type:" + ((int) this.f29645a));
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f35277eb", new Object[]{this})).booleanValue();
        }
        if (this.f29645a != 4) {
            throw new IllegalStateException("can't getBool :" + this);
        } else if (this.b != 0) {
            return true;
        } else {
            return false;
        }
    }

    public vw5 p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vw5) ipChange.ipc$dispatch("3f75c563", new Object[]{this});
        }
        if (C()) {
            return (vw5) this.d;
        }
        throw new IllegalStateException("getBuiltInObject from a type:" + ((int) this.f29645a));
    }

    public double q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c9967bc", new Object[]{this})).doubleValue();
        }
        if (this.f29645a == 3) {
            return this.c;
        }
        throw new IllegalStateException("getDouble from: " + this);
    }

    public xwb r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xwb) ipChange.ipc$dispatch("6b74b0d7", new Object[]{this});
        }
        if (E()) {
            return (xwb) this.d;
        }
        throw new IllegalStateException("getFunction from a type:" + ((int) this.f29645a));
    }

    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b268c8b3", new Object[]{this})).intValue();
        }
        if (this.f29645a == 2) {
            return (int) this.b;
        }
        throw new IllegalStateException("getInt from: " + this);
    }

    public Object t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("82a271f4", new Object[]{this});
        }
        if (this.f29645a == 10) {
            return this.d;
        }
        throw new IllegalStateException("getText illegal type: " + ((int) this.f29645a));
    }

    public long u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ea6d", new Object[]{this})).longValue();
        }
        if (this.f29645a == 2) {
            return this.b;
        }
        throw new IllegalStateException("getInt from: " + this);
    }

    public JSONObject v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("db870ecd", new Object[]{this});
        }
        if (H()) {
            return (JSONObject) this.d;
        }
        throw new IllegalStateException("getObject from a type:" + ((int) this.f29645a));
    }

    public String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f06a652", new Object[]{this});
        }
        if (this.f29645a == 5) {
            return (String) this.d;
        }
        throw new IllegalStateException("getText illegal type: " + ((int) this.f29645a));
    }

    public int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.f29645a;
    }

    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        switch (this.f29645a) {
            case -1:
                return v7b.DEFAULT_HTTPS_ERROR_INVALID;
            case 0:
                return "UNDEFINED";
            case 1:
                return "NULL";
            case 2:
                return k68.TYPE_INT;
            case 3:
                return k68.TYPE_DOUBLE;
            case 4:
                return k68.TYPE_BOOLEAN;
            case 5:
                return k68.TYPE_STRING;
            case 6:
                return "ARRAY";
            case 7:
                return "OBJECT";
            case 8:
                return "BUILTIN_OBJECT";
            case 9:
                return "FUNCTION";
            default:
                throw new IllegalArgumentException("Invalid type" + ((int) this.f29645a));
        }
    }

    public Object z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        int x = x();
        if (x != -1) {
            switch (x) {
                case 2:
                    return Integer.valueOf(s());
                case 3:
                    return Double.valueOf(q());
                case 4:
                    return Boolean.valueOf(o());
                case 5:
                    return w();
                case 6:
                    return n();
                case 7:
                    return v();
                case 8:
                    return p();
                case 9:
                    return r();
                case 10:
                    return t();
                default:
                    return null;
            }
        } else {
            throw new IllegalArgumentException("Invalid type");
        }
    }

    public uw5(byte b, long j, double d, Object obj) {
        this.f29645a = b;
        this.b = j;
        this.c = d;
        this.d = obj;
    }

    public String toString() {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        switch (this.f29645a) {
            case -1:
            case 0:
            case 1:
                if (!DinamicXEngine.j0()) {
                    return "";
                }
                throw new IllegalArgumentException("cann't convert type " + ((int) this.f29645a) + " toString");
            case 2:
                return String.valueOf(this.b);
            case 3:
                return String.valueOf(this.c);
            case 4:
                if (this.b != 0) {
                    z = true;
                }
                return String.valueOf(z);
            case 5:
                Object obj = this.d;
                if (obj instanceof String) {
                    return obj.toString();
                }
                return "";
            case 6:
                return a(this.d);
            case 7:
            case 8:
                return this.d.toString();
            case 9:
                return "function " + ((xwb) this.d).getDxFunctionName() + "() { [native code] }";
            case 10:
                Object obj2 = this.d;
                if (obj2 != null) {
                    str = obj2.getClass().getSimpleName();
                } else {
                    str = "null";
                }
                return "[java Object]".concat(str);
            case 11:
                return "VOID";
            default:
                throw new IllegalArgumentException("Invalid type" + ((int) this.f29645a));
        }
    }
}
