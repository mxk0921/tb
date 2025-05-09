package tb;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LineHeightSpan;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class j02 implements c0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Integer f21675a;
    public String b;
    public Float c;
    public Integer d;
    public Integer e;
    public Integer f;
    public int g = 0;
    public CharSequence h;
    public String i;
    public c0e j;
    public List<j02> k;
    public final RichText l;
    public CharSequence m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements LineHeightSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f21676a;

        public a(j02 j02Var, int i) {
            this.f21676a = i;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("646418b3", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), fontMetricsInt});
                return;
            }
            int i5 = this.f21676a;
            int i6 = fontMetricsInt.descent;
            int i7 = fontMetricsInt.ascent;
            int i8 = (i5 - (i6 - i7)) / 2;
            fontMetricsInt.top -= i8;
            fontMetricsInt.bottom += i8;
            fontMetricsInt.ascent = i7 - i8;
            fontMetricsInt.descent = i6 + i8;
        }
    }

    static {
        t2o.a(986710202);
        t2o.a(986710204);
    }

    public j02(RichText richText) {
        this.l = richText;
    }

    public void A(c0e c0eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3ec9d5", new Object[]{this, c0eVar});
        } else {
            this.j = c0eVar;
        }
    }

    public void B(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88fe49da", new Object[]{this, charSequence});
        } else {
            this.h = charSequence;
        }
    }

    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55d7424", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void D(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e156590", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (entry.getValue() != null && !TextUtils.isEmpty(entry.getKey())) {
                    r(entry.getKey(), entry.getValue().toString());
                }
            }
        }
    }

    public void F(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42abfb1e", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (entry.getValue() != null && !TextUtils.isEmpty(entry.getKey())) {
                    String key = entry.getKey();
                    key.hashCode();
                    char c = 65535;
                    switch (key.hashCode()) {
                        case -1550943582:
                            if (key.equals("fontStyle")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1224696685:
                            if (key.equals("fontFamily")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -734428249:
                            if (key.equals("fontWeight")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -515807685:
                            if (key.equals("lineHeight")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 94842723:
                            if (key.equals("color")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 365601008:
                            if (key.equals("fontSize")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 863270933:
                            if (key.equals(pg1.ATOM_EXT_wordBreak)) {
                                c = 6;
                                break;
                            }
                            break;
                        case 1287124693:
                            if (key.equals("backgroundColor")) {
                                c = 7;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            y(rmt.b(entry.getValue().toString()));
                            continue;
                        case 1:
                            w(entry.getValue().toString());
                            continue;
                        case 2:
                            z(rmt.e(entry.getValue().toString()));
                            continue;
                        case 3:
                            Object value = entry.getValue();
                            if ((value instanceof Float) || (value instanceof Integer)) {
                                this.f = Integer.valueOf(Math.round(-jSONObject.getFloatValue("lineHeight")));
                                break;
                            } else if (value instanceof String) {
                                String str = (String) value;
                                if (str.length() <= 0 || (str.charAt(str.length() - 1) != 'x' && str.charAt(str.length() - 1) != 'm')) {
                                    this.f = Integer.valueOf(Math.round(-Float.parseFloat(str)));
                                    break;
                                } else {
                                    this.f = Integer.valueOf(Math.round(fxh.f(str, this.l.getInstance().getRpxPerRem())));
                                    break;
                                }
                            } else {
                                continue;
                            }
                            break;
                        case 4:
                            u(cxh.c(entry.getValue().toString()));
                            continue;
                        case 5:
                            x(fxh.f(entry.getValue().toString(), this.l.getInstance().getRpxPerRem()));
                            continue;
                        case 6:
                            C(String.valueOf(entry.getValue()));
                            continue;
                        case 7:
                            t(cxh.c(entry.getValue().toString()));
                            continue;
                        default:
                            s(entry.getKey(), entry.getValue().toString());
                            continue;
                    }
                }
            }
        }
    }

    public void a(j02 j02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8299c2", new Object[]{this, j02Var});
            return;
        }
        if (this.k == null) {
            this.k = new ArrayList(3);
        }
        ((ArrayList) this.k).add(j02Var);
        j02Var.A(this);
    }

    public CharSequence b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("e8b2025", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(m())) {
            sb.append(m());
        }
        List<j02> list = this.k;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                sb.append(((j02) it.next()).b());
            }
        }
        String sb2 = sb.toString();
        this.m = sb2;
        return sb2;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c819e12f", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.h = null;
        List<j02> list = this.k;
        if (list != null) {
            ((ArrayList) list).clear();
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbe599", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public Integer f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("7a6355db", new Object[]{this});
        }
        Integer num = this.f21675a;
        if (num != null) {
            return num;
        }
        c0e c0eVar = this.j;
        if (c0eVar != null) {
            return ((j02) c0eVar).f();
        }
        return null;
    }

    public CharSequence g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("a86bf930", new Object[]{this});
        }
        return this.m;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73773a10", new Object[]{this});
        }
        String str = this.b;
        if (str != null) {
            return str;
        }
        c0e c0eVar = this.j;
        if (c0eVar != null) {
            return ((j02) c0eVar).h();
        }
        return null;
    }

    public Float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("9e2f7a36", new Object[]{this});
        }
        Float f = this.c;
        if (f != null) {
            return f;
        }
        c0e c0eVar = this.j;
        if (c0eVar != null) {
            return ((j02) c0eVar).i();
        }
        return null;
    }

    public Integer j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("3b3aa2da", new Object[]{this});
        }
        Integer num = this.d;
        if (num != null) {
            return num;
        }
        c0e c0eVar = this.j;
        if (c0eVar != null) {
            return ((j02) c0eVar).j();
        }
        return null;
    }

    public Integer k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("22cea7cb", new Object[]{this});
        }
        Integer num = this.e;
        if (num != null) {
            return num;
        }
        c0e c0eVar = this.j;
        if (c0eVar != null) {
            return ((j02) c0eVar).k();
        }
        return null;
    }

    public Integer l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4e8da35f", new Object[]{this});
        }
        Integer num = this.f;
        if (num != null) {
            return num;
        }
        c0e c0eVar = this.j;
        if (c0eVar != null) {
            return ((j02) c0eVar).l();
        }
        return null;
    }

    public CharSequence m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("f53d46b8", new Object[]{this});
        }
        return this.h;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d8526fa", new Object[]{this});
        }
        String str = this.i;
        if (str != null) {
            return str;
        }
        c0e c0eVar = this.j;
        if (c0eVar != null) {
            return ((j02) c0eVar).n();
        }
        return str;
    }

    public void o(SpannableString spannableString, int i, int i2) {
        float f;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257f18e6", new Object[]{this, spannableString, new Integer(i), new Integer(i2)});
            return;
        }
        if (f() != null) {
            spannableString.setSpan(new ForegroundColorSpan(f().intValue()), i, i2, 33);
        }
        if (i() != null) {
            f = i().floatValue();
            spannableString.setSpan(new AbsoluteSizeSpan(Math.round(f)), i, i2, 33);
        } else {
            f = fxh.b(32);
        }
        if (e() != 0) {
            spannableString.setSpan(new BackgroundColorSpan(e()), i, i2, 33);
        }
        Integer l = l();
        if (l != null) {
            if (l.intValue() > 0) {
                i4 = l.intValue();
            } else {
                i4 = Math.round(f * (-l.intValue()));
            }
            spannableString.setSpan(new a(this, i4), i, i2, 33);
        }
        Integer j = j();
        Integer k = k();
        String h = h();
        if (!(j == null && k == null && h == null)) {
            int i5 = -1;
            if (j == null) {
                i3 = -1;
            } else {
                i3 = j.intValue();
            }
            if (k != null) {
                i5 = k.intValue();
            }
            spannableString.setSpan(new svh(i3, i5, h), i, i2, 33);
        }
        if (h != null) {
            this.l.addFontFamily(h);
        }
    }

    public void p(SpannableString spannableString, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881a6fb6", new Object[]{this, spannableString, new Integer(i)});
        } else if (this.k != null) {
            if (m() != null) {
                i2 = m().length();
            }
            Iterator it = ((ArrayList) this.k).iterator();
            while (it.hasNext()) {
                j02 j02Var = (j02) it.next();
                j02Var.q(spannableString, i + i2);
                CharSequence charSequence = j02Var.m;
                if (charSequence != null) {
                    i += charSequence.length();
                }
            }
        }
    }

    public abstract void q(SpannableString spannableString, int i);

    public void r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba54eb4", new Object[]{this, str, str2});
            return;
        }
        str.hashCode();
        if (str.equals("value")) {
            this.h = str2;
        }
    }

    public void s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31915824", new Object[]{this, str, str2});
        }
    }

    public final void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
        } else {
            this.f21675a = Integer.valueOf(i);
        }
    }

    public void v(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588e9962", new Object[]{this, charSequence});
        } else {
            this.m = charSequence;
        }
    }

    public final void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72598f66", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void x(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec360be7", new Object[]{this, new Float(f)});
        } else {
            this.c = Float.valueOf(f);
        }
    }

    public final void y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62088efc", new Object[]{this, new Integer(i)});
        } else {
            this.d = Integer.valueOf(i);
        }
    }

    public final void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0d9753", new Object[]{this, new Integer(i)});
        } else {
            this.e = Integer.valueOf(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r7.equals(tb.pg1.ATOM_EXT_wordBreak) == false) goto L_0x002b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean E(java.lang.String r7, com.taobao.android.weex_framework.MUSValue r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.j02.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "bf41927f"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001f:
            r7.hashCode()
            r3 = 0
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -515807685: goto L_0x0042;
                case 365601008: goto L_0x0037;
                case 863270933: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r0 = -1
            goto L_0x004d
        L_0x002d:
            java.lang.String r5 = "wordBreak"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x004d
            goto L_0x002b
        L_0x0037:
            java.lang.String r0 = "fontSize"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0040
            goto L_0x002b
        L_0x0040:
            r0 = 1
            goto L_0x004d
        L_0x0042:
            java.lang.String r0 = "lineHeight"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x004c
            goto L_0x002b
        L_0x004c:
            r0 = 0
        L_0x004d:
            switch(r0) {
                case 0: goto L_0x006e;
                case 1: goto L_0x005c;
                case 2: goto L_0x0051;
                default: goto L_0x0050;
            }
        L_0x0050:
            return r2
        L_0x0051:
            if (r8 != 0) goto L_0x0054
            goto L_0x0058
        L_0x0054:
            java.lang.String r3 = r8.convertToString()
        L_0x0058:
            r6.C(r3)
            return r1
        L_0x005c:
            com.taobao.android.weex_uikit.widget.richtext.RichText r7 = r6.l
            com.taobao.android.weex_framework.MUSDKInstance r7 = r7.getInstance()
            float r7 = r7.getRpxPerRem()
            float r7 = tb.fxh.d(r8, r7)
            r6.x(r7)
            return r1
        L_0x006e:
            if (r8 != 0) goto L_0x0073
            r6.f = r3
            return r1
        L_0x0073:
            boolean r7 = r8.isInt()
            if (r7 != 0) goto L_0x00d3
            boolean r7 = r8.isFloat()
            if (r7 == 0) goto L_0x0080
            goto L_0x00d3
        L_0x0080:
            boolean r7 = r8.isString()
            if (r7 == 0) goto L_0x00e2
            java.lang.String r7 = r8.getStringValue()
            int r8 = r7.length()
            if (r8 <= 0) goto L_0x00c3
            int r8 = r7.length()
            int r8 = r8 - r1
            char r8 = r7.charAt(r8)
            r0 = 120(0x78, float:1.68E-43)
            if (r8 == r0) goto L_0x00aa
            int r8 = r7.length()
            int r8 = r8 - r1
            char r8 = r7.charAt(r8)
            r0 = 109(0x6d, float:1.53E-43)
            if (r8 != r0) goto L_0x00c3
        L_0x00aa:
            com.taobao.android.weex_uikit.widget.richtext.RichText r8 = r6.l
            com.taobao.android.weex_framework.MUSDKInstance r8 = r8.getInstance()
            float r8 = r8.getRpxPerRem()
            float r7 = tb.fxh.f(r7, r8)
            int r7 = java.lang.Math.round(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.f = r7
            goto L_0x00e2
        L_0x00c3:
            float r7 = java.lang.Float.parseFloat(r7)
            float r7 = -r7
            int r7 = java.lang.Math.round(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.f = r7
            goto L_0x00e2
        L_0x00d3:
            float r7 = r8.convertToFloat()
            float r7 = -r7
            int r7 = java.lang.Math.round(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.f = r7
        L_0x00e2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j02.E(java.lang.String, com.taobao.android.weex_framework.MUSValue):boolean");
    }
}
