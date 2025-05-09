package tb;

import android.graphics.Paint;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.LimitLinkedHashMap;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.ovs.api.TMWI18nImageTranslate;
import com.taobao.android.ovs.api.TMWI18nImageTranslateModel;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class dnf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "IrpTranslateResultManager";
    public static final dnf INSTANCE = new dnf();

    /* renamed from: a  reason: collision with root package name */
    public static final LimitLinkedHashMap<Integer, a> f17962a = new LimitLinkedHashMap<>(16);
    public static final LimitLinkedHashMap<Integer, ArrayList<yeu>> b = new LimitLinkedHashMap<>(16);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void a(int i, ArrayList<yeu> arrayList);

        void onError(int i, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements TMWI18nImageTranslate.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f17963a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;
        public final /* synthetic */ Map<String, Boolean> f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f17964a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ String d;
            public final /* synthetic */ boolean e;
            public final /* synthetic */ TMWI18nImageTranslateModel f;
            public final /* synthetic */ Map<String, Boolean> g;
            public final /* synthetic */ long h;

            public a(int i, int i2, int i3, String str, boolean z, TMWI18nImageTranslateModel tMWI18nImageTranslateModel, Map<String, Boolean> map, long j) {
                this.f17964a = i;
                this.b = i2;
                this.c = i3;
                this.d = str;
                this.e = z;
                this.f = tMWI18nImageTranslateModel;
                this.g = map;
                this.h = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    dnf.a(dnf.INSTANCE, this.f17964a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
                }
            }
        }

        public b(long j, int i, int i2, int i3, String str, Map<String, Boolean> map) {
            this.f17963a = j;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = str;
            this.f = map;
        }

        @Override // com.taobao.android.ovs.api.TMWI18nImageTranslate.a
        public final void a(boolean z, TMWI18nImageTranslateModel tMWI18nImageTranslateModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2da30c22", new Object[]{this, new Boolean(z), tMWI18nImageTranslateModel});
            } else {
                z7m.c(new a(this.b, this.c, this.d, this.e, z, tMWI18nImageTranslateModel, this.f, System.currentTimeMillis() - this.f17963a));
            }
        }
    }

    public static final /* synthetic */ void a(dnf dnfVar, int i, int i2, int i3, String str, boolean z, TMWI18nImageTranslateModel tMWI18nImageTranslateModel, Map map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db677838", new Object[]{dnfVar, new Integer(i), new Integer(i2), new Integer(i3), str, new Boolean(z), tMWI18nImageTranslateModel, map, new Long(j)});
        } else {
            dnfVar.e(i, i2, i3, str, z, tMWI18nImageTranslateModel, map, j);
        }
    }

    public final float b(float f, float f2) {
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d295709d", new Object[]{this, new Float(f), new Float(f2)})).floatValue();
        }
        Paint paint = new Paint();
        paint.setTextSize(f);
        float ceil = (int) Math.ceil(Math.abs(paint.getFontMetrics().top) + Math.abs(paint.getFontMetrics().bottom));
        if (Math.abs(ceil - f2) <= 1.0f) {
            return f;
        }
        if (ceil >= f2) {
            f3 = 0.1f;
        } else {
            f3 = f;
            f = 500.0f;
        }
        while (f - f3 > 0.1f) {
            float f4 = (f + f3) / 2;
            paint.setTextSize(f4);
            float ceil2 = (int) Math.ceil(Math.abs(paint.getFontMetrics().top) + Math.abs(paint.getFontMetrics().bottom));
            if (Math.abs(ceil2 - f2) <= 1.0f) {
                return f4;
            }
            if (ceil2 <= f2) {
                f3 = f4;
            } else {
                f = f4;
            }
        }
        return f3;
    }

    public final void c(int i, ArrayList<yeu> arrayList, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa5980", new Object[]{this, new Integer(i), arrayList, aVar});
        } else if (arrayList == null) {
            aVar.onError(-1, "翻译出错了");
        } else {
            aVar.a(i, arrayList);
        }
    }

    public final void f(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe115f9e", new Object[]{this, new Integer(i), aVar});
            return;
        }
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        TLogTracker.i("Translate", TAG, ckf.p("registerTranslateResultListener: token=", Integer.valueOf(i)));
        LimitLinkedHashMap<Integer, ArrayList<yeu>> limitLinkedHashMap = b;
        if (limitLinkedHashMap.keySet().contains(Integer.valueOf(i))) {
            c(i, limitLinkedHashMap.remove(Integer.valueOf(i)), aVar);
        } else {
            f17962a.put(Integer.valueOf(i), aVar);
        }
    }

    public final void g(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43bd9c63", new Object[]{this, str, str2, str3, new Long(j)});
        } else {
            AppMonitor.Stat.commit("plt_translate", "tbpsTranslatePerformance", DimensionValueSet.create().setValue("vendor", str).setValue("extraInfo", str2).setValue("errorCode", str3), MeasureValueSet.create().setValue("costTime", j));
        }
    }

    static {
        t2o.a(481297531);
        AppMonitor.register("plt_translate", "tbpsTranslatePerformance", MeasureSet.create().addMeasure("costTime"), DimensionSet.create().addDimension("vendor").addDimension("extraInfo").addDimension("errorCode"));
    }

    public final ArrayList<yeu> d(int i, int i2, String str, String str2) {
        dnf dnfVar = this;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("5f22adc5", new Object[]{dnfVar, new Integer(i), new Integer(i2), str, str2});
        }
        ArrayList<yeu> arrayList = new ArrayList<>();
        JSONArray jSONArray = JSON.parseObject(str).getJSONArray("children");
        int size = jSONArray.size();
        while (i3 < size) {
            i3++;
            if (i3 != 0) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                String string = jSONObject.getString("content");
                if (!TextUtils.isEmpty(string)) {
                    int intValue = jSONObject.getIntValue("top");
                    int intValue2 = jSONObject.getIntValue("left");
                    int intValue3 = jSONObject.getIntValue("width");
                    int intValue4 = jSONObject.getIntValue("height");
                    int intValue5 = jSONObject.getIntValue("lineHeight");
                    if (!(intValue3 == 0 || intValue4 == 0 || intValue5 == 0)) {
                        jSONArray = jSONArray;
                        float f = h19.f(jSONObject, "fontSize", 10.0f);
                        float b2 = dnfVar.b(f, intValue5);
                        if (b2 <= f || f <= 0.0f) {
                            f = b2;
                        }
                        int i4 = intValue4 / intValue5;
                        float f2 = i;
                        float f3 = i2;
                        arrayList.add(new yeu(jSONObject.getString("backgroundColor"), jSONObject.getString("color"), string, jSONObject.getString("fontFamily"), f, jSONObject.getIntValue("id"), jSONObject.getString("label"), jSONObject.getIntValue(pg1.ATOM_EXT_letterSpacing), jSONObject.getIntValue("lineHeight"), jSONObject.getString("ocrContent"), jSONObject.getIntValue("pairId"), jSONObject.getString(Constants.Name.TEXT_ALIGN), jSONObject.getString("type"), jSONObject.getIntValue(pg1.ATOM_EXT_zIndex), intValue2 / f2, intValue / f3, (intValue2 + intValue3) / f2, (intValue + intValue4) / f3, i4 <= 0 ? 1 : i4));
                        dnfVar = this;
                    }
                }
            }
            jSONArray = jSONArray;
            dnfVar = this;
        }
        if (arrayList.size() == 0) {
            TLogTracker.f("Translate", TAG, "There is no child result");
        }
        return arrayList;
    }

    public final void h(int i, int i2, int i3, String str, String str2, String str3) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53bb870c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), str, str2, str3});
            return;
        }
        ckf.g(str, "base64");
        ckf.g(str2, "originLang");
        ckf.g(str3, "targetLang");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int L3 = lg4.L3();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("useLLM", Boolean.valueOf((L3 & 1) > 0));
        linkedHashMap2.put("privateResult", Boolean.valueOf((L3 & 2) > 0));
        linkedHashMap2.put("onlyNeedTextSmoothResult", Boolean.valueOf((4 & L3) > 0));
        String jSONString = JSON.toJSONString(linkedHashMap2);
        ckf.f(jSONString, "toJSONString(extraInfo)");
        linkedHashMap.put("mtExtParams", jSONString);
        int J3 = lg4.J3();
        linkedHashMap.put("needEditorData", String.valueOf((J3 & 1) > 0));
        if ((J3 & 2) > 0) {
            z = true;
        }
        linkedHashMap.put("ignoreEntityRecognize", String.valueOf(z));
        TMWI18nImageTranslate.a("", str, str2, str3, linkedHashMap, new b(System.currentTimeMillis(), i, i2, i3, str3, linkedHashMap2));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r14, int r15, int r16, java.lang.String r17, boolean r18, com.taobao.android.ovs.api.TMWI18nImageTranslateModel r19, java.util.Map<java.lang.String, ? extends java.lang.Object> r20, long r21) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dnf.e(int, int, int, java.lang.String, boolean, com.taobao.android.ovs.api.TMWI18nImageTranslateModel, java.util.Map, long):void");
    }
}
