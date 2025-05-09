package com.taobao.weex.utils;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.InputDeviceCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.SingleFunctionParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import tb.f7l;
import tb.pg1;
import tb.t2o;
import tb.tkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXResourceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Integer> f14150a;
    public static final SingleFunctionParser.FlatMapper<Integer> b = new SingleFunctionParser.FlatMapper<Integer>() { // from class: com.taobao.weex.utils.WXResourceUtils.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.taobao.weex.utils.SingleFunctionParser.FlatMapper
        public Integer map(String str) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("930bd0d4", new Object[]{this, str});
            }
            int parseUnitOrPercent = WXUtils.parseUnitOrPercent(str, 255);
            if (parseUnitOrPercent >= 0) {
                i = parseUnitOrPercent > 255 ? 255 : parseUnitOrPercent;
            }
            return Integer.valueOf(i);
        }
    };
    public static final SingleFunctionParser.NonUniformMapper<Number> c = new SingleFunctionParser.NonUniformMapper<Number>() { // from class: com.taobao.weex.utils.WXResourceUtils.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.weex.utils.SingleFunctionParser.NonUniformMapper
        public List<Number> map(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6997ccf3", new Object[]{this, list});
            }
            ArrayList arrayList = new ArrayList(4);
            int i = 0;
            while (i < 3) {
                int i2 = 255;
                int parseUnitOrPercent = WXUtils.parseUnitOrPercent(list.get(i), 255);
                if (parseUnitOrPercent < 0) {
                    i2 = 0;
                } else if (parseUnitOrPercent <= 255) {
                    i2 = parseUnitOrPercent;
                }
                arrayList.add(Integer.valueOf(i2));
                i++;
            }
            arrayList.add(Float.valueOf(list.get(i)));
            return arrayList;
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum ColorConvertHandler {
        NAMED_COLOR_HANDLER { // from class: com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/utils/WXResourceUtils$ColorConvertHandler$1");
            }

            @Override // com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler
            public Pair<Boolean, Integer> handle(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Pair) ipChange.ipc$dispatch("52b330c3", new Object[]{this, str});
                }
                if (WXResourceUtils.access$100().containsKey(str)) {
                    return new Pair<>(Boolean.TRUE, WXResourceUtils.access$100().get(str));
                }
                return new Pair<>(Boolean.FALSE, 0);
            }
        },
        RGB_HANDLER { // from class: com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/utils/WXResourceUtils$ColorConvertHandler$2");
            }

            @Override // com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler
            public Pair<Boolean, Integer> handle(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Pair) ipChange.ipc$dispatch("52b330c3", new Object[]{this, str});
                }
                if (str.length() == 4) {
                    int parseInt = Integer.parseInt(str.substring(1, 2), 16);
                    int parseInt2 = Integer.parseInt(str.substring(2, 3), 16);
                    int parseInt3 = Integer.parseInt(str.substring(3, 4), 16);
                    return new Pair<>(Boolean.TRUE, Integer.valueOf(Color.rgb(parseInt + (parseInt << 4), parseInt2 + (parseInt2 << 4), parseInt3 + (parseInt3 << 4))));
                } else if (str.length() == 7 || str.length() == 9) {
                    return new Pair<>(Boolean.TRUE, Integer.valueOf(Color.parseColor(str)));
                } else {
                    return new Pair<>(Boolean.FALSE, 0);
                }
            }
        },
        FUNCTIONAL_RGB_HANDLER { // from class: com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/utils/WXResourceUtils$ColorConvertHandler$3");
            }

            @Override // com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler
            public Pair<Boolean, Integer> handle(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Pair) ipChange.ipc$dispatch("52b330c3", new Object[]{this, str});
                }
                List parse = new SingleFunctionParser(str, WXResourceUtils.access$200()).parse("rgb");
                if (parse == null || parse.size() != 3) {
                    return new Pair<>(Boolean.FALSE, 0);
                }
                return new Pair<>(Boolean.TRUE, Integer.valueOf(Color.rgb(((Integer) parse.get(0)).intValue(), ((Integer) parse.get(1)).intValue(), ((Integer) parse.get(2)).intValue())));
            }
        },
        FUNCTIONAL_RGBA_HANDLER { // from class: com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/utils/WXResourceUtils$ColorConvertHandler$4");
            }

            @Override // com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler
            public Pair<Boolean, Integer> handle(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Pair) ipChange.ipc$dispatch("52b330c3", new Object[]{this, str});
                }
                List parse = new SingleFunctionParser(str, WXResourceUtils.access$300()).parse("rgba");
                if (parse.size() == 4) {
                    return new Pair<>(Boolean.TRUE, Integer.valueOf(Color.argb(ColorConvertHandler.access$400(((Number) parse.get(3)).floatValue()), ((Number) parse.get(0)).intValue(), ((Number) parse.get(1)).intValue(), ((Number) parse.get(2)).intValue())));
                }
                return new Pair<>(Boolean.FALSE, 0);
            }
        };
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ int access$400(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7d700298", new Object[]{new Float(f)})).intValue();
            }
            return parseAlpha(f);
        }

        public static /* synthetic */ Object ipc$super(ColorConvertHandler colorConvertHandler, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/utils/WXResourceUtils$ColorConvertHandler");
        }

        private static int parseAlpha(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7a1a6081", new Object[]{new Float(f)})).intValue();
            }
            return (int) (f * 255.0f);
        }

        public static ColorConvertHandler valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorConvertHandler) ipChange.ipc$dispatch("ebc2348b", new Object[]{str});
            }
            return (ColorConvertHandler) Enum.valueOf(ColorConvertHandler.class, str);
        }

        public abstract Pair<Boolean, Integer> handle(String str);
    }

    public static /* synthetic */ Map access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]);
        }
        return f14150a;
    }

    public static /* synthetic */ SingleFunctionParser.FlatMapper access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SingleFunctionParser.FlatMapper) ipChange.ipc$dispatch("4accafc4", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ SingleFunctionParser.NonUniformMapper access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SingleFunctionParser.NonUniformMapper) ipChange.ipc$dispatch("3c031ed7", new Object[0]);
        }
        return c;
    }

    public static int getColor(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6826e071", new Object[]{str})).intValue() : getColor(str, Integer.MIN_VALUE);
    }

    public static Shader getShader(String str, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shader) ipChange.ipc$dispatch("9c7e2714", new Object[]{str, new Float(f), new Float(f2)});
        }
        List<String> b2 = b(str);
        if (b2 == null || b2.size() != 3) {
            return null;
        }
        float[] a2 = a(b2.get(0), f, f2);
        return new LinearGradient(a2[0], a2[1], a2[2], a2[3], getColor(b2.get(1), -1), getColor(b2.get(2), -1), Shader.TileMode.CLAMP);
    }

    public static boolean isNamedColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63faac09", new Object[]{str})).booleanValue();
        }
        return ((HashMap) f14150a).containsKey(str);
    }

    public static List<String> b(String str) {
        String nextToken;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7aeec4b1", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.trim();
        if (!str.startsWith("linear-gradient")) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str.substring(str.indexOf(f7l.BRACKET_START_STR) + 1, str.lastIndexOf(f7l.BRACKET_END_STR)), ",");
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str2 = null;
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
    }

    public static int getColor(String str, int i) {
        Pair<Boolean, Integer> handle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cb5a238", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        String trim = str.trim();
        Integer num = WXUtils.sCache.get(trim);
        if (num != null) {
            return num.intValue();
        }
        for (ColorConvertHandler colorConvertHandler : ColorConvertHandler.values()) {
            try {
                handle = colorConvertHandler.handle(trim);
            } catch (RuntimeException e) {
                WXLogUtils.v("Color_Parser", WXLogUtils.getStackTrace(e));
            }
            if (((Boolean) handle.first).booleanValue()) {
                Integer num2 = (Integer) handle.second;
                i = num2.intValue();
                WXUtils.sCache.put(trim, num2);
                break;
            }
            continue;
        }
        return i;
    }

    static {
        t2o.a(985661824);
        HashMap hashMap = new HashMap();
        f14150a = hashMap;
        hashMap.put("aliceblue", -984833);
        hashMap.put("antiquewhite", -332841);
        hashMap.put(pg1.ATOM_EXT_aqua, -16711681);
        hashMap.put("aquamarine", -8388652);
        hashMap.put("azure", -983041);
        hashMap.put("beige", -657956);
        hashMap.put("bisque", -6972);
        hashMap.put(pg1.ATOM_EXT_black, -16777216);
        hashMap.put("blanchedalmond", -5171);
        hashMap.put(pg1.ATOM_EXT_blue, Integer.valueOf((int) tkt.DEFAULT_LINK_COLOR));
        hashMap.put("blueviolet", -7722014);
        hashMap.put("brown", -5952982);
        hashMap.put("burlywood", -2180985);
        hashMap.put("cadetblue", -10510688);
        hashMap.put("chartreuse", -8388864);
        hashMap.put("chocolate", -2987746);
        hashMap.put("coral", -32944);
        hashMap.put("cornflowerblue", -10185235);
        hashMap.put("cornsilk", -1828);
        hashMap.put("crimson", -2354116);
        hashMap.put("cyan", -16711681);
        hashMap.put("darkblue", -16777077);
        hashMap.put("darkcyan", -16741493);
        hashMap.put("darkgoldenrod", -4684277);
        hashMap.put("darkgray", -5658199);
        hashMap.put("darkgreen", -16751616);
        hashMap.put("darkkhaki", -4343957);
        hashMap.put("darkmagenta", -7667573);
        hashMap.put("darkolivegreen", -11179217);
        hashMap.put("darkorange", -29696);
        hashMap.put("darkorchid", -6737204);
        hashMap.put("darkred", -7667712);
        hashMap.put("darksalmon", -1468806);
        hashMap.put("darkseagreen", -7357297);
        hashMap.put("darkslateblue", -12042869);
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        hashMap.put("darkturquoise", -16724271);
        hashMap.put("darkviolet", -7077677);
        hashMap.put("deeppink", -60269);
        hashMap.put("deepskyblue", -16728065);
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        hashMap.put("dodgerblue", -14774017);
        hashMap.put("firebrick", -5103070);
        hashMap.put("floralwhite", -1296);
        hashMap.put("forestgreen", -14513374);
        hashMap.put(pg1.ATOM_EXT_fuchsia, -65281);
        hashMap.put("gainsboro", -2302756);
        hashMap.put("ghostwhite", -460545);
        hashMap.put("gold", -10496);
        hashMap.put("goldenrod", -2448096);
        hashMap.put(pg1.ATOM_EXT_gray, -8355712);
        hashMap.put("grey", -8355712);
        hashMap.put(pg1.ATOM_EXT_green, -16744448);
        hashMap.put("greenyellow", -5374161);
        hashMap.put("honeydew", -983056);
        hashMap.put("hotpink", -38476);
        hashMap.put("indianred", -3318692);
        hashMap.put("indigo", -11861886);
        hashMap.put("ivory", -16);
        hashMap.put("khaki", -989556);
        hashMap.put("lavender", -1644806);
        hashMap.put("lavenderblush", -3851);
        hashMap.put("lawngreen", -8586240);
        hashMap.put("lemonchiffon", -1331);
        hashMap.put("lightblue", -5383962);
        hashMap.put("lightcoral", -1015680);
        hashMap.put("lightcyan", -2031617);
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgrey", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightpink", -18751);
        hashMap.put("lightsalmon", -24454);
        hashMap.put("lightseagreen", -14634326);
        hashMap.put("lightskyblue", -7876870);
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        hashMap.put("lightsteelblue", -5192482);
        hashMap.put("lightyellow", -32);
        hashMap.put(pg1.ATOM_EXT_lime, -16711936);
        hashMap.put("limegreen", -13447886);
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        hashMap.put(pg1.ATOM_EXT_maroon, -8388608);
        hashMap.put("mediumaquamarine", -10039894);
        hashMap.put("mediumblue", -16777011);
        hashMap.put("mediumorchid", -4565549);
        hashMap.put("mediumpurple", -7114533);
        hashMap.put("mediumseagreen", -12799119);
        hashMap.put("mediumslateblue", -8689426);
        hashMap.put("mediumspringgreen", -16713062);
        hashMap.put("mediumturquoise", -12004916);
        hashMap.put("mediumvioletred", -3730043);
        hashMap.put("midnightblue", -15132304);
        hashMap.put("mintcream", -655366);
        hashMap.put("mistyrose", -6943);
        hashMap.put("moccasin", -6987);
        hashMap.put("navajowhite", -8531);
        hashMap.put(pg1.ATOM_EXT_navy, -16777088);
        hashMap.put("oldlace", -133658);
        hashMap.put(pg1.ATOM_EXT_olive, -8355840);
        hashMap.put("olivedrab", -9728477);
        hashMap.put("orange", -23296);
        hashMap.put("orangered", -47872);
        hashMap.put("orchid", -2461482);
        hashMap.put("palegoldenrod", -1120086);
        hashMap.put("palegreen", -6751336);
        hashMap.put("paleturquoise", -5247250);
        hashMap.put("palevioletred", -2396013);
        hashMap.put("papayawhip", -4139);
        hashMap.put("peachpuff", -9543);
        hashMap.put("peru", -3308225);
        hashMap.put("pink", -16181);
        hashMap.put("plum", -2252579);
        hashMap.put("powderblue", -5185306);
        hashMap.put(pg1.ATOM_EXT_purple, -8388480);
        hashMap.put("rebeccapurple", -10079335);
        hashMap.put(pg1.ATOM_EXT_red, -65536);
        hashMap.put("rosybrown", -4419697);
        hashMap.put("royalblue", -12490271);
        hashMap.put("saddlebrown", -7650029);
        hashMap.put("salmon", -360334);
        hashMap.put("sandybrown", -744352);
        hashMap.put("seagreen", -13726889);
        hashMap.put("seashell", -2578);
        hashMap.put("sienna", -6270419);
        hashMap.put(pg1.ATOM_EXT_silver, -4144960);
        hashMap.put("skyblue", -7876885);
        hashMap.put("slateblue", -9807155);
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        hashMap.put("snow", -1286);
        hashMap.put("springgreen", -16711809);
        hashMap.put("steelblue", -12156236);
        hashMap.put(pg1.ATOM_EXT_tan, -2968436);
        hashMap.put(pg1.ATOM_EXT_teal, -16744320);
        hashMap.put("thistle", -2572328);
        hashMap.put("tomato", -40121);
        hashMap.put("turquoise", -12525360);
        hashMap.put("violet", -1146130);
        hashMap.put("wheat", -663885);
        hashMap.put(pg1.ATOM_EXT_white, -1);
        hashMap.put("whitesmoke", -657931);
        hashMap.put(pg1.ATOM_EXT_yellow, Integer.valueOf((int) InputDeviceCompat.SOURCE_ANY));
        hashMap.put("yellowgreen", -6632142);
        hashMap.put("transparent", 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        if (r8.equals("totop") == false) goto L_0x0050;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float[] a(java.lang.String r8, float r9, float r10) {
        /*
            r0 = 4
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 3
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.weex.utils.WXResourceUtils.$ipChange
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
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.utils.WXResourceUtils.a(java.lang.String, float, float):float[]");
    }
}
