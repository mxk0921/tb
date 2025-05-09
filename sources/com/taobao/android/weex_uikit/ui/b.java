package com.taobao.android.weex_uikit.ui;

import android.text.TextUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import tb.kmq;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FUNC_CUBIC_BEZIER = 6;
    public static final int FUNC_EASE = 4;
    public static final int FUNC_EASE_IN = 1;
    public static final int FUNC_EASE_IN_OUT = 3;
    public static final int FUNC_EASE_OUT = 2;
    public static final int FUNC_LINEAR = 0;
    public static final int FUNC_STEPS = 5;
    public static final int PROP_BACKGROUND_COLOR = 2;
    public static final int PROP_OPACITY = 1;
    public static final int PROP_TRANSFORM = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f10005a;
        public final long b;
        public final long c;
        public final int d;
        public final Object[] e;

        static {
            t2o.a(986710057);
        }

        public a(int i, long j, long j2, int i2, Object[] objArr) {
            this.f10005a = i;
            this.b = j;
            this.c = j2;
            this.d = i2;
            this.e = objArr;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TransitionProp{prop=" + this.f10005a + ", delayInMs=" + this.b + ", durationInMs=" + this.c + ", func=" + this.d + ", args=" + Arrays.toString(this.e) + '}';
        }
    }

    static {
        t2o.a(986710056);
    }

    public static Interpolator a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("3f1f7e13", new Object[]{aVar});
        }
        switch (aVar.d) {
            case 1:
                return PathInterpolatorCompat.create(0.42f, 0.0f, 1.0f, 1.0f);
            case 2:
                return PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f);
            case 3:
                return PathInterpolatorCompat.create(0.42f, 0.0f, 0.58f, 1.0f);
            case 4:
                return PathInterpolatorCompat.create(0.25f, 0.1f, 0.25f, 1.0f);
            case 5:
                return new kmq(((Integer) aVar.e[0]).intValue(), ((Integer) aVar.e[1]).intValue());
            case 6:
                return PathInterpolatorCompat.create(((Float) aVar.e[0]).floatValue(), ((Float) aVar.e[1]).floatValue(), ((Float) aVar.e[2]).floatValue(), ((Float) aVar.e[3]).floatValue());
            default:
                return new LinearInterpolator();
        }
    }

    public static String[] g(String str, char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("9b0f3eea", new Object[]{str, new Character(c)});
        }
        ArrayList arrayList = new ArrayList(4);
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '(') {
                z = true;
            } else if (charAt == ')') {
                z = false;
            } else if (!z && charAt == c) {
                if (i != i2) {
                    arrayList.add(str.substring(i, i2));
                }
                i = i2 + 1;
            }
        }
        arrayList.add(str.substring(i));
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static long f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da934f6", new Object[]{str})).longValue();
        }
        if (str.endsWith("ms")) {
            return Float.parseFloat(str.substring(0, str.length() - 2));
        }
        if (str.endsWith("s")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) * 1000.0f;
        }
        throw new IllegalArgumentException("Invalid transition time: ".concat(str));
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63325cf7", new Object[]{str})).intValue();
        }
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1267206133:
                    if (str.equals("opacity")) {
                        c = 0;
                        break;
                    }
                    break;
                case 605322756:
                    if (str.equals(pg1.ATOM_EXT_UDL_background_color)) {
                        c = 1;
                        break;
                    }
                    break;
                case 1052666732:
                    if (str.equals("transform")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1287124693:
                    if (str.equals("backgroundColor")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return 1;
                case 1:
                case 3:
                    return 2;
                case 2:
                    return 0;
                default:
                    throw new IllegalArgumentException("Invalid Transition prop: ".concat(str));
            }
        } else {
            throw new IllegalArgumentException("Invalid Transition prop: " + str);
        }
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe747518", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1965120668:
                if (str.equals("ease-in")) {
                    c = 0;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 1;
                    break;
                }
                break;
            case -789192465:
                if (str.equals("ease-out")) {
                    c = 2;
                    break;
                }
                break;
            case -361990811:
                if (str.equals("ease-in-out")) {
                    c = 3;
                    break;
                }
                break;
            case 3105774:
                if (str.equals(Constants.TimeFunction.EASE)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 0;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                if (str.startsWith("steps")) {
                    return 5;
                }
                return str.startsWith("cubic-bezier") ? 6 : 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        if (r9.equals("jump-both") == false) goto L_0x0050;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] b(java.lang.String r9, int r10) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.ui.b.b(java.lang.String, int):java.lang.Object[]");
    }

    public static List<a> e(String str, String str2, String str3, String str4, String str5) {
        String str6;
        long j;
        String str7;
        String str8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("319a6011", new Object[]{str, str2, str3, str4, str5});
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        String[] strArr = null;
        if (isEmpty && isEmpty2) {
            return null;
        }
        if (!isEmpty) {
            String trim = str.trim();
            if ("none".equals(trim) || pg1.ATOM_EXT_unset.equals(trim)) {
                return null;
            }
            String[] g = g(trim, ',');
            LinkedList linkedList = new LinkedList();
            for (String str9 : g) {
                String[] g2 = g(str9.trim(), ' ');
                if (g2.length == 3 || g2.length == 4) {
                    String trim2 = g2[0].trim();
                    String trim3 = g2[1].trim();
                    String trim4 = g2[2].trim();
                    long f = g2.length == 4 ? f(g2[3].trim()) : 0L;
                    int d = d(trim2);
                    int c = c(trim4);
                    linkedList.add(new a(d, f, f(trim3.trim()), c, b(trim4, c)));
                } else {
                    throw new IllegalArgumentException("split by space array's length != 3/4");
                }
            }
            return linkedList;
        } else if (TextUtils.isEmpty(str3)) {
            return null;
        } else {
            String[] split = str2.split(",");
            String[] split2 = str3.split(",");
            String[] split3 = TextUtils.isEmpty(str4) ? null : str4.split(",");
            String[] split4 = TextUtils.isEmpty(str5) ? null : str5.split(",");
            if (!(split2.length == 1 || split2.length == split.length)) {
                return null;
            }
            if (!(split3 == null || split3.length == 1 || split3.length == split.length)) {
                split3 = null;
            }
            if (split4 == null || split4.length == 1 || split4.length == split.length) {
                strArr = split4;
            }
            LinkedList linkedList2 = new LinkedList();
            for (int i = 0; i < split.length; i++) {
                int d2 = d(split[i].trim());
                if (split2.length != split.length) {
                    str6 = split2[0];
                } else {
                    str6 = split2[i];
                }
                long f2 = f(str6.trim());
                if (split3 != null) {
                    if (split3.length != split.length) {
                        str8 = split3[0];
                    } else {
                        str8 = split3[i];
                    }
                    j = f(str8.trim());
                } else {
                    j = 0;
                }
                if (strArr.length != split.length) {
                    str7 = strArr[0];
                } else {
                    str7 = strArr[i];
                }
                String trim5 = str7.trim();
                int c2 = c(trim5);
                linkedList2.add(new a(d2, j, f2, c2, b(trim5, c2)));
            }
            return linkedList2;
        }
    }
}
