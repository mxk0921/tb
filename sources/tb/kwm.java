package tb;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.DecimalFormat;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kwm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRICE_DECIMAL_DEFAULT_LENGTH = 2;
    public static final int PRICE_DECIMAL_DEFAULT_SIZE = 10;
    public static final int PRICE_INTEGER_DEFAULT_SIZE = 12;

    /* renamed from: a  reason: collision with root package name */
    public static a f22970a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f22971a;
        public String c;
        public b i;
        public b j;
        public b k;
        public String b = "#FF4400";
        public int d = 12;
        public int e = 12;
        public int f = 2;
        public int g = 10;
        public boolean h = false;
        public int l = 1;

        static {
            t2o.a(479199586);
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("33dd435", new Object[]{aVar})).booleanValue();
            }
            return aVar.m();
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a791350", new Object[]{aVar});
            }
            return aVar.f22971a;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("db581ea6", new Object[]{aVar})).booleanValue();
            }
            aVar.getClass();
            return false;
        }

        public static /* synthetic */ boolean d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("684535c5", new Object[]{aVar})).booleanValue();
            }
            aVar.getClass();
            return false;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5e273e11", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ b f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a9cfbd7c", new Object[]{aVar});
            }
            return aVar.i;
        }

        public static /* synthetic */ int g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("36f230a0", new Object[]{aVar})).intValue();
            }
            return aVar.l;
        }

        public static /* synthetic */ int h(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c3df47bf", new Object[]{aVar})).intValue();
            }
            return aVar.d;
        }

        public static /* synthetic */ b i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6a5071bf", new Object[]{aVar});
            }
            return aVar.j;
        }

        public static /* synthetic */ int j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ddb975fd", new Object[]{aVar})).intValue();
            }
            return aVar.e;
        }

        public static /* synthetic */ b k(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("eaa63f41", new Object[]{aVar});
            }
            return aVar.k;
        }

        public static /* synthetic */ int l(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f793a43b", new Object[]{aVar})).intValue();
            }
            return aVar.g;
        }

        public static String r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e415736a", new Object[]{str});
            }
            if (str == null || str.indexOf(".") <= 0) {
                return str;
            }
            return str.replaceAll("0+?$", "").replaceAll("[.]$", "");
        }

        public static a s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5886e7cf", new Object[0]);
            }
            return new a();
        }

        public final boolean m() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
            }
            try {
                if (TextUtils.isEmpty(this.f22971a)) {
                    return false;
                }
                int i2 = this.d;
                int i3 = this.e;
                if (i2 > i3) {
                    this.d = i3;
                }
                if (TextUtils.isEmpty(this.c)) {
                    char charAt = this.f22971a.charAt(0);
                    int i4 = 0;
                    while (i4 < this.f22971a.length() && !Character.isDigit(charAt)) {
                        i4++;
                        charAt = this.f22971a.charAt(i4);
                    }
                    if (i4 > 0 && i4 < this.f22971a.length()) {
                        this.c = this.f22971a.substring(0, i4);
                    }
                }
                if (!TextUtils.isEmpty(this.c)) {
                    this.i = new b(0, this.c.length());
                    i = this.c.length();
                    this.f22971a = this.f22971a.substring(i);
                } else {
                    i = 0;
                }
                StringBuilder sb = new StringBuilder("0");
                if (this.f > 0) {
                    sb.append(".");
                    for (int i5 = 0; i5 < this.f; i5++) {
                        sb.append("0");
                    }
                }
                String format = new DecimalFormat(sb.toString()).format(Double.parseDouble(this.f22971a));
                this.f22971a = format;
                if (!TextUtils.isEmpty(format)) {
                    this.f22971a = this.f22971a.replaceAll(",", ".");
                }
                if (!this.h) {
                    this.f22971a = r(this.f22971a);
                }
                if (!TextUtils.isEmpty(this.c)) {
                    this.f22971a = this.c + this.f22971a;
                }
                int indexOf = this.f22971a.indexOf(".");
                if (indexOf > 0) {
                    this.j = new b(i, indexOf);
                    this.k = new b(indexOf, this.f22971a.length());
                } else {
                    this.j = new b(i, this.f22971a.length());
                    this.k = null;
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public a n(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9d670513", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.d = i;
            }
            return this;
        }

        public a o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("84bbae52", new Object[]{this, str});
            }
            if (str != null) {
                this.c = str.trim();
            }
            return this;
        }

        public a p(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8f6e79d3", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.g = i;
            }
            return this;
        }

        public a q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b79132dd", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.f = i;
            }
            return this;
        }

        public a t(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cc1d0246", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.e = i;
            }
            return this;
        }

        public a u(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cd99c9e5", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a v(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c6f437e3", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                this.b = str;
            }
            return this;
        }

        public a w(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("942cc65f", new Object[]{this, str});
            }
            this.f22971a = str;
            return this;
        }

        public a x(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b413457e", new Object[]{this, new Integer(i)});
            }
            this.l = i;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f22972a;
        public final int b;

        static {
            t2o.a(479199588);
        }

        public b(int i, int i2) {
            this.f22972a = i;
            this.b = i2;
        }
    }

    static {
        t2o.a(479199585);
    }

    public static SpannableString b(SpannableString spannableString, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("d3cec3a0", new Object[]{spannableString, bVar});
        }
        spannableString.setSpan(new StyleSpan(1), bVar.f22972a, bVar.b, 0);
        return spannableString;
    }

    public static void c(TextView textView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8bd305", new Object[]{textView, str, str2});
        } else if (textView != null && !TextUtils.isEmpty(str)) {
            if (f22970a == null) {
                f22970a = a("common_price");
                f22970a.n(vpo.b(ptq.b("cart_groupCharge_price_currency_part", "fontSize"), 12));
                f22970a.t(vpo.b(ptq.b("cart_groupCharge_price_integer_part", "fontSize"), 12));
                f22970a.p(vpo.b(ptq.b("cart_groupCharge_price_decimal_part", "fontSize"), 10));
                f22970a.x(1);
            }
            f22970a.w(str);
            f22970a.o(str2);
            SpannableString d = d(f22970a);
            if (d != null) {
                textView.setText(d);
            } else {
                textView.setText(str);
            }
        }
    }

    public static SpannableString d(a aVar) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("a9dd7bea", new Object[]{aVar});
        }
        if (aVar == null || !a.a(aVar)) {
            return null;
        }
        SpannableString spannableString = new SpannableString(a.b(aVar));
        b bVar = new b(0, a.b(aVar).length());
        f(spannableString, bVar, a.e(aVar));
        b f = a.f(aVar);
        if (f != null) {
            if (a.g(aVar) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            g(spannableString, z2, f, a.h(aVar));
        }
        b i = a.i(aVar);
        if (i != null) {
            if (a.g(aVar) == 1) {
                z = true;
            } else {
                z = false;
            }
            g(spannableString, z, i, a.j(aVar));
        }
        b k = a.k(aVar);
        if (k != null) {
            if (a.g(aVar) == 1) {
                z3 = true;
            }
            g(spannableString, z3, k, a.l(aVar));
        }
        if (a.c(aVar)) {
            e(spannableString, bVar);
        }
        if (!a.d(aVar)) {
            return spannableString;
        }
        b(spannableString, bVar);
        return spannableString;
    }

    public static SpannableString e(SpannableString spannableString, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("d279583e", new Object[]{spannableString, bVar});
        }
        spannableString.setSpan(new StrikethroughSpan(), bVar.f22972a, bVar.b, 0);
        return spannableString;
    }

    public static SpannableString f(SpannableString spannableString, b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("69bd09f1", new Object[]{spannableString, bVar, str});
        }
        spannableString.setSpan(new ForegroundColorSpan(vpo.a(str, Color.parseColor(str))), bVar.f22972a, bVar.b, 0);
        return spannableString;
    }

    public static SpannableString g(SpannableString spannableString, boolean z, b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("b530efd0", new Object[]{spannableString, new Boolean(z), bVar, new Integer(i)});
        }
        spannableString.setSpan(new AbsoluteSizeSpan(i, z), bVar.f22972a, bVar.b, 0);
        return spannableString;
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3fee8353", new Object[]{str});
        }
        a s = a.s();
        HashMap<String, Object> a2 = ptq.a(str);
        if (a2 != null) {
            Object obj = a2.get("textColor");
            Object obj2 = a2.get("ems");
            Object obj3 = a2.get("visible");
            Object obj4 = a2.get("fontSize");
            if (obj != null) {
                s.v(String.valueOf(obj));
            }
            if (obj2 != null) {
                s.q(vpo.b(String.valueOf(obj2), 2));
            }
            if (obj3 != null) {
                if ("1".equals(String.valueOf(obj3))) {
                    s.u(true);
                } else {
                    s.u(false);
                }
            }
            if (obj4 != null) {
                s.t(vpo.b(String.valueOf(obj4), 12));
            }
        }
        return s;
    }
}
