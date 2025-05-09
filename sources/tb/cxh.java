package tb;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710113);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ed50340", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static xn1 b(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xn1) ipChange.ipc$dispatch("c34c4fe8", new Object[]{mUSValue});
        }
        String stringValue = mUSValue.getStringValue();
        if (!TextUtils.isEmpty(stringValue)) {
            List<String> f = f(stringValue);
            if (f != null && f.size() == 3) {
                return new xn1(f.get(0).trim(), c(f.get(1).trim()), c(f.get(2).trim()));
            }
            throw new IllegalArgumentException("backgroundImage is invalid string");
        }
        throw new IllegalArgumentException("backgroundImage is empty string");
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6826e071", new Object[]{str})).intValue();
        }
        if (str == null) {
            throw new IllegalArgumentException("Color is null");
        } else if (str.startsWith("#")) {
            return d(str);
        } else {
            if (str.startsWith("rgba(")) {
                return j(str);
            }
            if (str.startsWith("rgb(")) {
                return i(str);
            }
            return gvu.a(str);
        }
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{str})).intValue();
        }
        if (str.length() != 4) {
            return Color.parseColor(str);
        }
        int parseInt = Integer.parseInt(str.substring(1, 2), 16);
        int parseInt2 = Integer.parseInt(str.substring(2, 3), 16);
        int parseInt3 = Integer.parseInt(str.substring(3, 4), 16);
        return Color.rgb(parseInt + (parseInt << 4), parseInt2 + (parseInt2 << 4), parseInt3 + (parseInt3 << 4));
    }

    public static int g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20b562c9", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static int h(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("461c5433", new Object[]{str, new Integer(i)})).intValue();
        }
        return (int) ((Float.parseFloat(str) / 100.0f) * i);
    }

    public static int i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3ff501e", new Object[]{str})).intValue();
        }
        String[] split = str.substring(str.indexOf(f7l.BRACKET_START_STR) + 1, str.lastIndexOf(f7l.BRACKET_END_STR)).split(",");
        if (split.length == 3) {
            return Color.rgb(k(split[0].trim(), 255), k(split[1].trim(), 255), k(split[2].trim(), 255));
        }
        throw new IllegalArgumentException("Invalid rgb() format");
    }

    public static int j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb04e9cb", new Object[]{str})).intValue();
        }
        String[] split = str.substring(str.indexOf(f7l.BRACKET_START_STR) + 1, str.lastIndexOf(f7l.BRACKET_END_STR)).split(",");
        if (split.length == 4) {
            float parseFloat = Float.parseFloat(split[3].trim());
            if (parseFloat < 0.0f) {
                parseFloat = 0.0f;
            } else if (parseFloat > 1.0f) {
                parseFloat = 1.0f;
            }
            return Color.argb((int) (parseFloat * 255.0f), k(split[0].trim(), 255), k(split[1].trim(), 255), k(split[2].trim(), 255));
        }
        throw new IllegalArgumentException("Invalid rgba() format");
    }

    public static int k(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("634b525a", new Object[]{str, new Integer(i)})).intValue();
        }
        int lastIndexOf = str.lastIndexOf(37);
        if (lastIndexOf != -1) {
            return h(str.substring(0, lastIndexOf), i);
        }
        return (int) Float.parseFloat(str);
    }

    public static List<String> f(String str) {
        String nextToken;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7aeec4b1", new Object[]{str});
        }
        if (str.startsWith("linear-gradient")) {
            StringTokenizer stringTokenizer = new StringTokenizer(str.substring(str.indexOf(f7l.BRACKET_START_STR) + 1, str.lastIndexOf(f7l.BRACKET_END_STR)), ",");
            ArrayList arrayList = new ArrayList();
            String str2 = null;
            while (true) {
                while (stringTokenizer.hasMoreTokens()) {
                    nextToken = stringTokenizer.nextToken();
                    if (nextToken.contains(f7l.BRACKET_START_STR)) {
                        str2 = nextToken.concat(",");
                    } else if (nextToken.contains(f7l.BRACKET_END_STR)) {
                        break;
                    } else if (str2 != null) {
                        str2 = str2 + nextToken + ",";
                    } else {
                        arrayList.add(nextToken);
                    }
                }
                return arrayList;
                arrayList.add(str2 + nextToken);
            }
        } else {
            throw new IllegalArgumentException("backgroundImage only support linear-gradient");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        if (r8.equals("totop") == false) goto L_0x0050;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float[] e(java.lang.String r8, float r9, float r10) {
        /*
            r0 = 4
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 3
            com.android.alibaba.ip.runtime.IpChange r5 = tb.cxh.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0026
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r9)
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r3] = r8
            r10[r2] = r0
            r10[r1] = r9
            java.lang.String r8 = "2fe39c74"
            java.lang.Object r8 = r5.ipc$dispatch(r8, r10)
            float[] r8 = (float[]) r8
            return r8
        L_0x0026:
            float[] r5 = new float[r0]
            r6 = 0
            r5[r3] = r6
            r5[r2] = r6
            r5[r1] = r6
            r5[r4] = r6
            boolean r6 = android.text.TextUtils.isEmpty(r8)
            if (r6 != 0) goto L_0x0045
            java.lang.String r6 = "\\s*"
            java.lang.String r7 = ""
            java.lang.String r8 = r8.replaceAll(r6, r7)
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r6)
        L_0x0045:
            r8.hashCode()
            r6 = -1
            int r7 = r8.hashCode()
            switch(r7) {
                case -1352032154: goto L_0x008c;
                case -1137407871: goto L_0x0080;
                case -868157182: goto L_0x0074;
                case -172068863: goto L_0x0068;
                case 110550266: goto L_0x005e;
                case 1176531318: goto L_0x0052;
                default: goto L_0x0050;
            }
        L_0x0050:
            r0 = -1
            goto L_0x0097
        L_0x0052:
            java.lang.String r0 = "tobottomright"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x005c
            goto L_0x0050
        L_0x005c:
            r0 = 5
            goto L_0x0097
        L_0x005e:
            java.lang.String r7 = "totop"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0097
            goto L_0x0050
        L_0x0068:
            java.lang.String r0 = "totopleft"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0072
            goto L_0x0050
        L_0x0072:
            r0 = 3
            goto L_0x0097
        L_0x0074:
            java.lang.String r0 = "toleft"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x007e
            goto L_0x0050
        L_0x007e:
            r0 = 2
            goto L_0x0097
        L_0x0080:
            java.lang.String r0 = "toright"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x008a
            goto L_0x0050
        L_0x008a:
            r0 = 1
            goto L_0x0097
        L_0x008c:
            java.lang.String r0 = "tobottom"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0096
            goto L_0x0050
        L_0x0096:
            r0 = 0
        L_0x0097:
            switch(r0) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x00ab;
                case 2: goto L_0x00a8;
                case 3: goto L_0x00a3;
                case 4: goto L_0x00a0;
                case 5: goto L_0x009b;
                default: goto L_0x009a;
            }
        L_0x009a:
            goto L_0x00b0
        L_0x009b:
            r5[r1] = r9
            r5[r4] = r10
            goto L_0x00b0
        L_0x00a0:
            r5[r2] = r10
            goto L_0x00b0
        L_0x00a3:
            r5[r3] = r9
            r5[r2] = r10
            goto L_0x00b0
        L_0x00a8:
            r5[r3] = r9
            goto L_0x00b0
        L_0x00ab:
            r5[r1] = r9
            goto L_0x00b0
        L_0x00ae:
            r5[r4] = r10
        L_0x00b0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cxh.e(java.lang.String, float, float):float[]");
    }
}
