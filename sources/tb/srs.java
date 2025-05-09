package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.tao.Globals;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class srs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_LABEL_HEIGHT = 21;
    public static final int DEFAULT_LABEL_SELECT_HEIGHT = 24;
    public static final int DEFAULT_TAB_PADDING_AP = 7;
    public static final String LABEL_LOCATION_LEFT = "left";
    public static final String LABEL_LOCATION_RIGHT = "right";
    public int B;
    public int C;
    public int D;
    public int E;
    public final fuq H;
    public JSONObject I;

    /* renamed from: a  reason: collision with root package name */
    public int f28238a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String l;
    public boolean m;
    public boolean p;
    public boolean q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public float z;
    public int h = 14;
    public int i = 16;
    public int j = 57;
    public int k = 18;
    public int n = 7;
    public int o = 11;
    public final Map<Integer, b> A = new ConcurrentHashMap();
    public boolean F = true;
    public boolean G = true;
    public final oqs J = new oqs();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$autosize$WindowType;

        static {
            int[] iArr = new int[WindowType.values().length];
            $SwitchMap$com$taobao$android$autosize$WindowType = iArr;
            try {
                iArr[WindowType.MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f28239a;
        public String b;
        public float c;
        public float d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public boolean j;
        public boolean k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String q;
        public String r;
        public String s;
        public String t;
        public String w;
        public String x;
        public String y;
        public String z;
        public long p = 0;
        public String u = "right";
        public float v = 0.57f;
        public float A = 0.57f;

        static {
            t2o.a(729809488);
        }
    }

    static {
        t2o.a(729809486);
    }

    public srs(fuq fuqVar) {
        int parseColor = Color.parseColor("#111111");
        int parseColor2 = Color.parseColor("#FAFAFA");
        int parseColor3 = Color.parseColor("#FFFFFF");
        int parseColor4 = Color.parseColor("#FF5000");
        this.f28238a = parseColor;
        this.b = parseColor4;
        this.c = parseColor3;
        this.d = parseColor3;
        this.e = parseColor4;
        this.f = parseColor3;
        this.g = parseColor2;
        this.H = fuqVar;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[0])).booleanValue();
        }
        return oza.a(Globals.getApplication());
    }

    public void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233da763", new Object[]{this, str});
        } else {
            this.J.e(str);
        }
    }

    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29a7fd9d", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (str.endsWith("apng") || str.endsWith("gif")) {
                d9j.c("TabFatigue", "updateGifFatigue");
                this.J.f();
            }
        }
    }

    public final int a(Context context, List<JSONObject> list) {
        float f;
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b537356e", new Object[]{this, context, list})).intValue();
        }
        int s = pb6.s(context);
        int max = Math.max(Math.min(list.size(), e()), f());
        int t = t(context, Math.min(list.size(), max));
        if (b9b.h()) {
            f = 11.0f;
        } else {
            f = this.o;
        }
        int a2 = trs.a(context, f);
        if (!TextUtils.isEmpty(this.r)) {
            i2 = trs.a(context, 33.0f);
        }
        int i3 = ((s - t) - a2) - i2;
        if (b9b.h()) {
            i = max;
        } else {
            i = max - 1;
        }
        int round = Math.round(i3 / i);
        d9j.c("TabUiConfig", "calculateTabSpace: " + round + " tabContentWidth: " + t + " marginLeft: " + a2 + " marginRight: " + i2 + " tabShowCount: " + max);
        return Math.max(round, d());
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41331dd8", new Object[]{this})).booleanValue();
        }
        return f4b.b("dynamicTabSpace", true);
    }

    public String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3b7f12", new Object[]{this, new Integer(i)});
        }
        b bVar = (b) ((ConcurrentHashMap) this.A).get(Integer.valueOf(i));
        if (bVar == null || !this.J.b(this.H.t(i), this.E)) {
            return null;
        }
        boolean q = q();
        if (TextUtils.isEmpty(bVar.n) || TextUtils.isEmpty(bVar.o)) {
            if (TextUtils.isEmpty(bVar.l) || TextUtils.isEmpty(bVar.m)) {
                return null;
            }
            if (q) {
                return bVar.m;
            }
            return bVar.l;
        } else if (q) {
            return bVar.o;
        } else {
            return bVar.n;
        }
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("745322f7", new Object[]{this})).intValue();
        }
        int i = f4b.i("fallbackStrategySpace", 40);
        if (i <= 0) {
            return 40;
        }
        return i;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c748c5f1", new Object[]{this})).intValue();
        }
        int i = f4b.i("maxShowItemCount", 12);
        if (i <= 0) {
            return 12;
        }
        return i;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0e65546", new Object[]{this})).intValue();
        }
        int i = f4b.i("miniShowItemCount", 8);
        if (i <= 0) {
            return 8;
        }
        return i;
    }

    public String g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d291bb30", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            if (q() || p()) {
                return this.t;
            }
            return this.r;
        } else if (q() || p()) {
            return this.u;
        } else {
            return this.s;
        }
    }

    public Pair<String, String> h() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("fd692514", new Object[]{this});
        }
        boolean q = q();
        d9j.c("TabFatigue", "getRightTopImageUrl allowShowGif");
        boolean a2 = this.J.a(this.C, this.D);
        if (TextUtils.isEmpty(this.x) || TextUtils.equals(m0b.d(), "l") || !a2) {
            if (q) {
                str = this.w;
            } else {
                str = this.v;
            }
            return new Pair<>("img", str);
        }
        if (q) {
            str2 = this.y;
        } else {
            str2 = this.x;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = this.x;
        }
        d9j.c("TabFatigue", "getRightTopImageUrl updateGifFatigue");
        this.J.f();
        return new Pair<>("gif", str2);
    }

    public float i(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11f5a09c", new Object[]{this, new Integer(i), new Boolean(z)})).floatValue();
        }
        b bVar = (b) ((ConcurrentHashMap) this.A).get(Integer.valueOf(i));
        if (bVar == null) {
            return 2.7f;
        }
        if (z) {
            return bVar.c;
        }
        return bVar.d;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32b2f1b9", new Object[]{this})).intValue();
        }
        if (this.p) {
            return 0;
        }
        return this.g;
    }

    public String k(int i, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15bd67b5", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        boolean q = q();
        b bVar = (b) ((ConcurrentHashMap) this.A).get(Integer.valueOf(i));
        if (bVar == null) {
            return "";
        }
        d9j.c("TabFatigue", "getTabImageUrl selectPosition:" + i);
        boolean a2 = this.J.a(this.C, this.D);
        if (TextUtils.isEmpty(bVar.h) || TextUtils.equals(m0b.d(), "l") || !a2) {
            if (TextUtils.isEmpty(bVar.e)) {
                str = bVar.b;
            } else {
                str = bVar.e;
            }
            if (TextUtils.isEmpty(bVar.g)) {
                str2 = bVar.e;
            } else {
                str2 = bVar.g;
            }
            if (TextUtils.isEmpty(bVar.f)) {
                str3 = bVar.b;
            } else {
                str3 = bVar.f;
            }
            if (q) {
                if (z) {
                    return str2;
                }
                return str3;
            } else if (z) {
                return str;
            } else {
                return bVar.b;
            }
        } else {
            if (q) {
                str4 = bVar.i;
            } else {
                str4 = bVar.h;
            }
            if (TextUtils.isEmpty(str4)) {
                return bVar.h;
            }
            return str4;
        }
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69507fcd", new Object[]{this})).intValue();
        }
        if (q()) {
            return this.f;
        }
        return this.e;
    }

    public final int m(JSONObject jSONObject, Context context, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d2846b5", new Object[]{this, jSONObject, context, list})).intValue();
        }
        if (!r() || !b()) {
            return n(jSONObject, context);
        }
        int a2 = a(context, list);
        if (a2 <= 0) {
            return 7;
        }
        return trs.b(context, a2 / 2);
    }

    public int o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8aaace9", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (q()) {
            if (z) {
                return this.d;
            }
            return this.c;
        } else if (z) {
            return this.b;
        } else {
            return this.f28238a;
        }
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77b079f4", new Object[]{this})).booleanValue();
        }
        boolean x = x();
        String l = FestivalMgr.i().l("global", FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG);
        if (this.q || TextUtils.isEmpty(l)) {
            return x;
        }
        return TextUtils.equals(FestivalMgr.i().l("global", slo.KEY_NAVI_STYLE), "0");
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71df6e44", new Object[]{this})).booleanValue();
        }
        if (b9b.h() || (b9b.e() && !b9b.g(Globals.getApplication()))) {
            return true;
        }
        return false;
    }

    public boolean s(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bc8d350", new Object[]{this, bVar})).booleanValue();
        }
        if (bVar == null) {
            return false;
        }
        if (!TextUtils.isEmpty(bVar.b) && !TextUtils.isEmpty(bVar.e)) {
            return true;
        }
        if (TextUtils.isEmpty(bVar.h) || TextUtils.isEmpty(bVar.i)) {
            return false;
        }
        return true;
    }

    public final int t(Context context, int i) {
        int measureText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5517feb9", new Object[]{this, context, new Integer(i)})).intValue();
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(trs.a(context, this.h));
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            b bVar = (b) ((ConcurrentHashMap) this.A).get(Integer.valueOf(i3));
            if (bVar != null) {
                if (s(bVar)) {
                    measureText = trs.a(context, this.j);
                } else {
                    measureText = (int) textPaint.measureText(bVar.f28239a);
                }
                i2 += measureText;
            }
        }
        return i2;
    }

    public void v(Context context, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce666a3", new Object[]{this, context, list});
            return;
        }
        this.n = m(this.I, context, list);
        if (b9b.h()) {
            this.o = this.n + 7;
        }
    }

    public void w(JSONObject jSONObject, Context context) {
        List<JSONObject> x;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9796ada8", new Object[]{this, jSONObject, context});
        } else if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
            if (jSONObject2 != null) {
                this.p = jSONObject2.getBooleanValue(vaj.KEY_EMBED_SEARCH_BAR);
                this.q = jSONObject2.getBooleanValue(vaj.KEY_IS_FESTIVAL);
                this.C = jSONObject2.getIntValue(vaj.GIF_FATIGUE_PERIOD);
                this.D = jSONObject2.getIntValue(vaj.GIF_FATIGUE_COUNT);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("subSection");
            if (jSONObject3 != null) {
                this.B = vaj.i(jSONObject);
                this.v = vaj.r(jSONObject, "img");
                this.w = vaj.r(jSONObject, vaj.DARK_MODEL_IMG);
                this.x = vaj.r(jSONObject, "gif");
                this.y = vaj.r(jSONObject, vaj.DARK_MODEL_GIF);
                String r = vaj.r(jSONObject, "aspectRatio");
                try {
                    this.z = TextUtils.isEmpty(r) ? 2.4f : Float.parseFloat(r);
                } catch (Exception e) {
                    d9j.d("TabUiConfig", "parse rightTopImgAspectRatio error", e);
                    this.z = 2.4f;
                }
                Object k = a3b.k(jSONObject, vaj.PATH_DOWN_PANEL_ARROW_CONFIG);
                if (k instanceof JSONObject) {
                    JSONObject jSONObject4 = (JSONObject) k;
                    this.r = jSONObject4.getString(vaj.KEY_DOWN_PANEL_DOWN_IMG);
                    this.s = jSONObject4.getString(vaj.KEY_DOWN_PANEL_UP_IMG);
                    this.t = jSONObject4.getString(vaj.KEY_DOWN_PANEL_DARK_DOWN_IMG);
                    this.u = jSONObject4.getString(vaj.KEY_DOWN_PANEL_DARK_UP_IMG);
                } else {
                    this.r = null;
                    this.s = null;
                    this.t = null;
                    this.u = null;
                }
                JSONObject jSONObject5 = jSONObject3.getJSONObject("tabs");
                if (jSONObject5 != null && (x = vaj.x(jSONObject)) != null && !x.isEmpty()) {
                    u(x, this.A);
                    JSONObject jSONObject6 = jSONObject5.getJSONObject("ext");
                    if (jSONObject6 != null) {
                        try {
                            String string = jSONObject6.getString("textColor");
                            if (!TextUtils.isEmpty(string)) {
                                this.f28238a = Color.parseColor(string);
                            }
                            String string2 = jSONObject6.getString(vaj.KEY_TEXT_SELECT_COLOR);
                            if (!TextUtils.isEmpty(string2)) {
                                this.b = Color.parseColor(string2);
                            }
                            String string3 = jSONObject6.getString(vaj.KEY_BG_COLOR);
                            if (!TextUtils.isEmpty(string3)) {
                                this.g = Color.parseColor(string3);
                            }
                            this.h = jSONObject6.getIntValue("textSize");
                            this.i = jSONObject6.getIntValue(vaj.KEY_TEXT_SELECT_SIZE);
                            if (jSONObject6.getBoolean(vaj.KEY_SELECTED_IS_BOLD) == null) {
                                z = this.F;
                            } else {
                                z = jSONObject6.getBoolean(vaj.KEY_SELECTED_IS_BOLD).booleanValue();
                            }
                            this.F = z;
                            if (jSONObject6.getBoolean(vaj.KEY_UNSELECTED_IS_BOLD) == null) {
                                z2 = this.G;
                            } else {
                                z2 = jSONObject6.getBoolean(vaj.KEY_UNSELECTED_IS_BOLD).booleanValue();
                            }
                            this.G = z2;
                            this.k = jSONObject6.getIntValue(vaj.KEY_IMAGE_TAB_HEIGHT_AP) == 0 ? 18 : jSONObject6.getIntValue(vaj.KEY_IMAGE_TAB_HEIGHT_AP);
                            this.j = jSONObject6.getIntValue(vaj.KEY_IMAGE_TAB_WIDTH_AP) == 0 ? 57 : jSONObject6.getIntValue(vaj.KEY_IMAGE_TAB_WIDTH_AP);
                            this.l = jSONObject6.getString(vaj.KEY_BG_IMG);
                            this.m = jSONObject6.getBooleanValue(vaj.KEY_SHOW_TAB_INDICATOR);
                            String string4 = jSONObject6.getString(vaj.KEY_TAB_INDICATOR_COLOR);
                            if (!TextUtils.isEmpty(string4)) {
                                this.e = Color.parseColor(string4);
                            }
                            String string5 = jSONObject6.getString(vaj.KEY_TAB_INDICATOR_DARK_COLOR);
                            if (!TextUtils.isEmpty(string5)) {
                                this.f = Color.parseColor(string5);
                            }
                            String string6 = jSONObject6.getString(vaj.KEY_TAB_DARK_TEXT_COLOR);
                            if (!TextUtils.isEmpty(string6)) {
                                this.c = Color.parseColor(string6);
                            }
                            String string7 = jSONObject6.getString(vaj.KEY_DARK_TEXT_SELECT_COLOR);
                            if (!TextUtils.isEmpty(string7)) {
                                this.d = Color.parseColor(string7);
                            }
                            String string8 = jSONObject6.getString(vaj.KEY_TAB_SPACE_CONFIG);
                            if (TextUtils.isEmpty(string8)) {
                                string8 = "{\"min\":\"12\",\"small\":\"17\",\"medium\":\"21\",\"large\":\"38\",\"max\":\"55\"}";
                            }
                            int intValue = jSONObject6.getIntValue(vaj.KEY_TAB_MARGIN_LEFT);
                            this.o = intValue;
                            if (intValue <= 0) {
                                this.o = 11;
                            }
                            this.I = JSON.parseObject(string8);
                            v(context, x);
                            this.E = jSONObject6.getIntValue(vaj.BUBBLE_FATIGUE);
                        } catch (Exception e2) {
                            d9j.d("TabUiConfig", "parse tab config error", e2);
                        }
                    }
                }
            }
        }
    }

    public boolean x() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41528dd8", new Object[]{this})).booleanValue();
        }
        if (!this.p) {
            return false;
        }
        int o = this.H.o();
        if (o >= 0 || (o = this.B) >= 0) {
            i = o;
        }
        b bVar = (b) ((ConcurrentHashMap) this.A).get(Integer.valueOf(i));
        if (bVar == null) {
            return false;
        }
        return bVar.j;
    }

    public String y(int i, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fef9d6f6", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        boolean q = q();
        b bVar = (b) ((ConcurrentHashMap) this.A).get(Integer.valueOf(i));
        if (bVar == null) {
            return "";
        }
        if (z) {
            if (q) {
                str = bVar.x;
            } else {
                str = bVar.w;
            }
        } else if (q) {
            str = bVar.r;
        } else {
            str = bVar.q;
        }
        if (TextUtils.equals(m0b.d(), "l")) {
            return str;
        }
        if (z) {
            if (q) {
                str2 = bVar.z;
            } else {
                str2 = bVar.y;
            }
        } else if (q) {
            str2 = bVar.t;
        } else {
            str2 = bVar.s;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccd72adb", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void u(List<JSONObject> list, Map<Integer, b> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1518c9", new Object[]{this, list, map});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            JSONObject jSONObject2 = list.get(i);
            if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("content")) == null)) {
                b bVar = new b();
                bVar.f28239a = jSONObject.getString("text");
                float f = 2.7f;
                bVar.c = TextUtils.isEmpty(jSONObject.getString("aspectRatio")) ? 2.7f : Float.parseFloat(jSONObject.getString("aspectRatio"));
                if (!TextUtils.isEmpty(jSONObject.getString(vaj.UNSELECTED_ASPECT_RATIO))) {
                    f = Float.parseFloat(jSONObject.getString(vaj.UNSELECTED_ASPECT_RATIO));
                }
                bVar.d = f;
                bVar.b = jSONObject.getString(vaj.KEY_TAB_IMG_URL);
                bVar.e = jSONObject.getString(vaj.KEY_TAB_SELECTED_IMG);
                bVar.f = jSONObject.getString(vaj.KEY_DARK_TAB_IMG_URL);
                bVar.g = jSONObject.getString(vaj.KEY_DARK_TAB_SELECTED_IMG_URL);
                jSONObject.getString(vaj.KEY_TOP_BAR_BG_COLOR);
                jSONObject.getString(vaj.KEY_TOP_BAR_BG_IMG);
                bVar.h = jSONObject.getString(vaj.KEY_TAB_GIF_URL);
                bVar.i = jSONObject.getString(vaj.KEY_DARK_TAB_GIF_URL);
                bVar.j = jSONObject.getBooleanValue(vaj.KEY_IS_DEEP_COLOR);
                bVar.k = jSONObject.getBooleanValue(vaj.KEY_IS_STICKY_LEFT);
                bVar.l = jSONObject.getString(vaj.BUBBLE_IMG);
                bVar.m = jSONObject.getString(vaj.BUBBLE_DARK_IMG);
                bVar.n = jSONObject.getString(vaj.BUBBLE_GIF);
                bVar.o = jSONObject.getString(vaj.BUBBLE_DARK_GIF);
                jSONObject.getFloatValue(vaj.KEY_TAB_IMG_PADDING);
                bVar.p = jSONObject.getLongValue(vaj.KEY_TAB_GIF_DURATION);
                bVar.q = jSONObject.getString(vaj.KEY_TAB_LABEL_IMG);
                bVar.r = jSONObject.getString(vaj.KEY_TAB_LABEL_DARK_IMG);
                bVar.s = jSONObject.getString(vaj.KEY_TAB_LABEL_GIF);
                bVar.t = jSONObject.getString(vaj.KEY_TAB_LABEL_DARK_GIF);
                bVar.x = jSONObject.getString(vaj.KEY_DARK_TAB_SELECTED_IMG_URL);
                bVar.w = jSONObject.getString(vaj.KEY_TAB_LABEL_SELECT_IMG);
                bVar.y = jSONObject.getString(vaj.KEY_TAB_LABEL_SELECT_GIF);
                bVar.z = jSONObject.getString(vaj.KEY_TAB_LABEL_DARK_SELECT_GIF);
                bVar.u = jSONObject.getString(vaj.KEY_TAB_LABEL_LOCATION);
                float f2 = 0.57f;
                bVar.v = TextUtils.isEmpty(jSONObject.getString(vaj.KEY_TAB_LABEL_ASPECT_RATIO)) ? 0.57f : Float.parseFloat(jSONObject.getString(vaj.KEY_TAB_LABEL_ASPECT_RATIO));
                if (!TextUtils.isEmpty(jSONObject.getString(vaj.KEY_TAB_LABEL_SELECT_ASPECT_RATIO))) {
                    f2 = Float.parseFloat(jSONObject.getString(vaj.KEY_TAB_LABEL_SELECT_ASPECT_RATIO));
                }
                bVar.A = f2;
                map.put(Integer.valueOf(i), bVar);
            }
        }
    }

    public final int n(JSONObject jSONObject, Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd5b45a1", new Object[]{this, jSONObject, context})).intValue();
        }
        if (!(context instanceof Activity) || jSONObject == null) {
            return 7;
        }
        WindowType M = TBAutoSizeConfig.x().M((Activity) context);
        if (r()) {
            int i2 = a.$SwitchMap$com$taobao$android$autosize$WindowType[M.ordinal()];
            if (i2 == 1) {
                i = jSONObject.getIntValue("min");
            } else if (i2 == 2) {
                i = jSONObject.getIntValue("small");
            } else if (i2 == 3) {
                i = jSONObject.getIntValue("medium");
            } else if (i2 == 4) {
                i = jSONObject.getIntValue("large");
            } else if (i2 == 5) {
                i = jSONObject.getIntValue("max");
            }
        } else {
            i = jSONObject.getIntValue("phoneSpace");
        }
        if (i <= 0) {
            return 7;
        }
        return i / 2;
    }
}
