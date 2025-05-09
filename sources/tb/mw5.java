package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ARRAY = 6;
    public static final int TYPE_BOOL = 4;
    public static final int TYPE_BUILTIN_OBJECT = 8;
    public static final int TYPE_FLOAT = 3;
    public static final int TYPE_FUNCTION = 9;
    public static final int TYPE_INT = 2;
    public static final int TYPE_INVALID = -1;
    public static final int TYPE_JAVA_OBJECT = 10;
    public static final int TYPE_NULL = 1;
    public static final int TYPE_OBJECT = 7;
    public static final int TYPE_STRING = 5;
    public static final int TYPE_UNDEFINED = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f24343a;
    public final long b;
    public final double c;
    public final Object d;

    static {
        t2o.a(444596835);
    }

    public mw5(int i, long j, double d, Object obj) {
        this.f24343a = i;
        this.b = j;
        this.c = d;
        this.d = obj;
    }

    public static mw5 F(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("6ec19743", new Object[]{jSONArray});
        }
        return new mw5(6, 0L, vu3.b.GEO_NOT_SUPPORT, jSONArray);
    }

    public static mw5 G(boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("4278d4a8", new Object[]{new Boolean(z)});
        }
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        return new mw5(4, j, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public static mw5 H(nw5 nw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("92bc0283", new Object[]{nw5Var});
        }
        return new mw5(8, 0L, vu3.b.GEO_NOT_SUPPORT, nw5Var);
    }

    public static mw5 I(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("876f7ce2", new Object[]{new Double(d)});
        }
        return new mw5(3, 0L, d, null);
    }

    public static mw5 J(wvb wvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("932ab0d7", new Object[]{wvbVar});
        }
        return new mw5(9, 0L, vu3.b.GEO_NOT_SUPPORT, wvbVar);
    }

    public static mw5 K(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("4ab77daf", new Object[]{new Long(j)});
        }
        return new mw5(2, j, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public static mw5 L(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("6bb4ce19", new Object[]{obj});
        }
        if (obj != null) {
            return new mw5(10, 0L, vu3.b.GEO_NOT_SUPPORT, obj);
        }
        throw new IllegalStateException("对象不可以是 null");
    }

    public static mw5 M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("20ff97af", new Object[0]);
        }
        return new mw5(1, 0L, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public static mw5 N(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("4b64bfe1", new Object[]{jSONObject});
        }
        return new mw5(7, 0L, vu3.b.GEO_NOT_SUPPORT, jSONObject);
    }

    public static mw5 O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("f954265b", new Object[]{str});
        }
        if (str != null) {
            return new mw5(5, 0L, vu3.b.GEO_NOT_SUPPORT, str);
        }
        throw new IllegalStateException("string can't be null");
    }

    public static mw5 P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("af6b6054", new Object[0]);
        }
        return new mw5(0, 0L, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public static Object Q(mw5 mw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("96260e70", new Object[]{mw5Var});
        }
        int q = mw5Var.q();
        if (q != -1) {
            switch (q) {
                case 2:
                    return Long.valueOf(mw5Var.m());
                case 3:
                    return Double.valueOf(mw5Var.k());
                case 4:
                    return Boolean.valueOf(mw5Var.i());
                case 5:
                    return mw5Var.p();
                case 6:
                    return mw5Var.h();
                case 7:
                    return mw5Var.o();
                case 8:
                    return mw5Var.j();
                case 9:
                    return mw5Var.l();
                case 10:
                    return mw5Var.n();
                default:
                    return null;
            }
        } else {
            throw new IllegalArgumentException("Invalid type");
        }
    }

    public static mw5 d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("902d3017", new Object[]{obj});
        }
        if (obj == null) {
            return P();
        }
        if (obj instanceof JSONObject) {
            return N((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return F((JSONArray) obj);
        }
        if (obj instanceof String) {
            return O((String) obj);
        }
        if (obj instanceof Boolean) {
            return G(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Integer) {
            return K(((Integer) obj).intValue());
        }
        if (obj instanceof Float) {
            return I(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return K(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return I(((Double) obj).doubleValue());
        }
        if (obj instanceof BigDecimal) {
            return I(((BigDecimal) obj).doubleValue());
        }
        return L(obj);
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f55e2a7", new Object[]{this})).booleanValue();
        }
        int i = this.f24343a;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69f8901e", new Object[]{this})).booleanValue();
        }
        int i = this.f24343a;
        if (i == 2 || i == 3 || i == 1 || i == 0) {
            return true;
        }
        return false;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0ef6d14", new Object[]{this})).booleanValue();
        }
        if (this.f24343a == 7) {
            return true;
        }
        return false;
    }

    public boolean D(mw5 mw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92135a58", new Object[]{this, mw5Var})).booleanValue();
        }
        if (this.d == mw5Var.d) {
            return true;
        }
        return false;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("239570e6", new Object[]{this})).booleanValue();
        }
        if (this.f24343a == 5) {
            return true;
        }
        return false;
    }

    public String R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9647ed08", new Object[]{this});
        }
        switch (this.f24343a) {
            case -1:
                throw new IllegalArgumentException("Invalid type");
            case 0:
                return "undefined";
            case 1:
            case 6:
            case 7:
            case 8:
                return "object";
            case 2:
            case 3:
                return "number";
            case 4:
                return "boolean";
            case 5:
                return "string";
            case 9:
                return pg1.ATOM_function;
            default:
                throw new IllegalArgumentException("Invalid type" + this.f24343a);
        }
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

    public double b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c6b6510", new Object[]{this})).doubleValue();
        }
        int i = this.f24343a;
        if (i == 0) {
            return Double.NaN;
        }
        if (i == 1) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        throw new IllegalArgumentException("cannot cast to number, type: " + this.f24343a);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5576c0b0", new Object[]{this})).booleanValue();
        }
        switch (this.f24343a) {
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

    public double e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5a450e3", new Object[]{this})).doubleValue();
        }
        int i = this.f24343a;
        if (i == 0) {
            return Double.NaN;
        }
        if (i == 1) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        if (i == 5) {
            return Double.parseDouble((String) this.d);
        }
        throw new IllegalStateException("can't conver to float:" + this);
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c05da17c", new Object[]{this})).longValue();
        }
        int i = this.f24343a;
        if (i == 0 || i == 1) {
            return 0L;
        }
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return (long) this.c;
        }
        if (i == 5) {
            return Long.parseLong((String) this.d);
        }
        throw new IllegalStateException("can't conver to int:" + this);
    }

    public JSONArray h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d4a9154", new Object[]{this});
        }
        if (t()) {
            return (JSONArray) this.d;
        }
        throw new IllegalStateException("getArray from a type:" + this.f24343a);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f35277eb", new Object[]{this})).booleanValue();
        }
        if (this.f24343a != 4) {
            throw new IllegalStateException("can't getBool :" + this);
        } else if (this.b != 0) {
            return true;
        } else {
            return false;
        }
    }

    public nw5 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nw5) ipChange.ipc$dispatch("5b9904c2", new Object[]{this});
        }
        if (v()) {
            return (nw5) this.d;
        }
        throw new IllegalStateException("getBuiltInObject from a type:" + this.f24343a);
    }

    public double k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81828a1b", new Object[]{this})).doubleValue();
        }
        if (this.f24343a == 3) {
            return this.c;
        }
        throw new IllegalStateException("getInt from: " + this);
    }

    public wvb l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wvb) ipChange.ipc$dispatch("f08f36e8", new Object[]{this});
        }
        if (x()) {
            return (wvb) this.d;
        }
        throw new IllegalStateException("getFunction from a type:" + this.f24343a);
    }

    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b268c8b4", new Object[]{this})).longValue();
        }
        if (this.f24343a == 2) {
            return this.b;
        }
        throw new IllegalStateException("getInt from: " + this);
    }

    public Object n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("82a271f4", new Object[]{this});
        }
        if (this.f24343a == 10) {
            return this.d;
        }
        throw new IllegalStateException("getText illegal type: " + this.f24343a);
    }

    public JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5f3e35c", new Object[]{this});
        }
        if (C()) {
            return (JSONObject) this.d;
        }
        throw new IllegalStateException("getObject from a type:" + this.f24343a);
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f06a652", new Object[]{this});
        }
        if (this.f24343a == 5) {
            return (String) this.d;
        }
        throw new IllegalStateException("getText illegal type: " + this.f24343a);
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.f24343a;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        switch (this.f24343a) {
            case -1:
                return v7b.DEFAULT_HTTPS_ERROR_INVALID;
            case 0:
                return "UNDEFINED";
            case 1:
                return "NULL";
            case 2:
                return k68.TYPE_INT;
            case 3:
                return "FLOAT";
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
                throw new IllegalArgumentException("Invalid type" + this.f24343a);
        }
    }

    public Object s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        int q = q();
        if (q != -1) {
            switch (q) {
                case 2:
                    return Long.valueOf(m());
                case 3:
                    return Double.valueOf(k());
                case 4:
                    return Boolean.valueOf(i());
                case 5:
                    return p();
                case 6:
                    return h();
                case 7:
                    return o();
                case 8:
                    return j();
                case 9:
                    return l();
                case 10:
                    return n();
                default:
                    return null;
            }
        } else {
            throw new IllegalArgumentException("Invalid type");
        }
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f13c645a", new Object[]{this})).booleanValue();
        }
        if (this.f24343a == 6) {
            return true;
        }
        return false;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("482fe1bf", new Object[]{this})).booleanValue();
        }
        if (this.f24343a == 4) {
            return true;
        }
        return false;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c46d4c3", new Object[]{this})).booleanValue();
        }
        if (this.f24343a == 8) {
            return true;
        }
        return false;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8525add", new Object[]{this})).booleanValue();
        }
        if (this.f24343a == 3) {
            return true;
        }
        return false;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5f63ead", new Object[]{this})).booleanValue();
        }
        if (this.f24343a == 9) {
            return true;
        }
        return false;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("520cd470", new Object[]{this})).booleanValue();
        }
        if (this.f24343a == 2) {
            return true;
        }
        return false;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3906bbd6", new Object[]{this})).booleanValue();
        }
        if (this.f24343a == 10) {
            return true;
        }
        return false;
    }

    public String g() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("819f4b1a", new Object[]{this});
        }
        switch (this.f24343a) {
            case -1:
                throw new IllegalArgumentException("Invalid type");
            case 0:
                return "undefined";
            case 1:
                return "null";
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
                return (String) this.d;
            case 6:
                return "[object Array]";
            case 7:
            case 8:
                return "[object Object]";
            case 9:
                return "[function]";
            case 10:
                return "[java object]";
            default:
                throw new IllegalArgumentException("Invalid type convert to string" + this.f24343a);
        }
    }

    public String toString() {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        switch (this.f24343a) {
            case -1:
            case 0:
            case 1:
                return "";
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
                return String.valueOf(this.d);
            case 6:
                return a(this.d);
            case 7:
            case 8:
                return "[object Object]";
            case 9:
                return "function " + ((wvb) this.d).getDxFunctionName() + "() { [native code] }";
            case 10:
                Object obj = this.d;
                if (obj != null) {
                    str = obj.getClass().getSimpleName();
                } else {
                    str = "null";
                }
                return "[java Object]".concat(str);
            default:
                throw new IllegalArgumentException("Invalid type" + this.f24343a);
        }
    }
}
