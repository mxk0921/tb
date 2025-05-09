package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class m1u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ARRAY = 7;
    public static final int TYPE_BLOCK = 6;
    public static final int TYPE_DOUBLE = 2;
    public static final int TYPE_IDENTIFIER = 0;
    public static final int TYPE_INT = 1;
    public static final int TYPE_KEYWORD = 4;
    public static final int TYPE_OPERATOR = 5;
    public static final int TYPE_STRING = 3;

    /* renamed from: a  reason: collision with root package name */
    public final String f23725a;
    public final int b;

    static {
        t2o.a(985661619);
    }

    public m1u(String str, int i) {
        this.f23725a = str;
        this.b = i;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a592a696", new Object[]{this});
        }
        return this.f23725a;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{" + this.f23725a + "," + this.b + '}';
    }

    public Object a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("44fe4fda", new Object[]{this, obj});
        }
        int i = this.b;
        if (i == 0) {
            return f7l.d(obj, this.f23725a);
        }
        if (i == 3) {
            return this.f23725a;
        }
        if (i == 1) {
            try {
                return Integer.valueOf(Integer.parseInt(this.f23725a));
            } catch (Exception unused) {
                return 0;
            }
        } else if (i == 2) {
            try {
                return Double.valueOf(Double.parseDouble(this.f23725a));
            } catch (Exception unused2) {
                return 0;
            }
        } else if (i == 4) {
            return f7l.KEYWORDS.get(this.f23725a);
        } else {
            throw new IllegalArgumentException("unhandled token type " + this.b);
        }
    }
}
