package com.etao.feimagesearch.mnn.realtime;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import kotlin.LazyThreadSafetyMode;
import tb.a07;
import tb.a49;
import tb.agh;
import tb.b49;
import tb.bs6;
import tb.ckf;
import tb.e0;
import tb.fne;
import tb.gd2;
import tb.hfn;
import tb.jzu;
import tb.kl0;
import tb.lg4;
import tb.ll0;
import tb.ml0;
import tb.njg;
import tb.p73;
import tb.sle;
import tb.t2o;
import tb.ukn;
import tb.utm;
import tb.wkn;
import tb.wuc;
import tb.xhv;
import tb.xkn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MnnRealtimeDetectUnit extends BaseMnnRunUnit<ukn, xkn> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "realtime_MnnRealtimeDetectUnit";
    public static final String TASK_NAME = "plt_search";
    public final int p;
    public final int q;
    public static final a Companion = new a(null);
    public static final njg<MnnRealtimeDetectUnit> r = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, MnnRealtimeDetectUnit$Companion$instance$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297070);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final MnnRealtimeDetectUnit a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MnnRealtimeDetectUnit) ipChange.ipc$dispatch("172200d7", new Object[]{this});
            }
            return (MnnRealtimeDetectUnit) MnnRealtimeDetectUnit.L().getValue();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements utm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ utm f4779a;

        public b(utm utmVar) {
            this.f4779a = utmVar;
        }

        @Override // tb.utm
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3030f401", new Object[]{this, new Integer(i), str});
                return;
            }
            ckf.g(str, "errorMsg");
            agh.c(MnnRealtimeDetectUnit.TAG, "plt_search errorCode: " + i + ", errorMsg: " + str);
            this.f4779a.a(i, str);
            jzu.n(p73.f25916a, "realtimeMnnBuildFailed", 19999, "errorCode", ckf.p("", Integer.valueOf(i)), "errorMsg", str);
        }

        @Override // tb.utm
        public void onPrepareSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("625fbbc2", new Object[]{this});
                return;
            }
            agh.h(MnnRealtimeDetectUnit.TAG, "onPrepareSuccess");
            jzu.n(p73.f25916a, "realtimeMnnBuildSuccess", 19999, new String[0]);
            this.f4779a.onPrepareSuccess();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements MNNCVExecutor.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ wuc<xkn> b;

        public c(wuc<xkn> wucVar) {
            this.b = wucVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.h
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
            } else {
                MnnRealtimeDetectUnit.M(MnnRealtimeDetectUnit.this, this.b, mRTRuntimeException, map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements MNNCVExecutor.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wuc<xkn> f4781a;

        public d(wuc<xkn> wucVar) {
            this.f4781a = wucVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.h
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                return;
            }
            String str = "";
            if (mRTRuntimeException != null) {
                wuc<xkn> wucVar = this.f4781a;
                wucVar.onResult(new xkn(null, null, new b49(str, "errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + ((Object) mRTRuntimeException.getMessage()))));
            } else if (map != null) {
                wuc<xkn> wucVar2 = this.f4781a;
                agh.h(MnnRealtimeDetectUnit.TAG, ckf.p("result = ", JSON.toJSONString(map)));
                if (map.get("feats") instanceof String) {
                    Object obj = map.get("feats");
                    if (obj != null) {
                        str = (String) obj;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                String a2 = com.etao.feimagesearch.mnn.utils.a.a(map);
                ckf.f(a2, "extraInfo");
                wucVar2.onResult(new xkn(null, null, new b49(str, a2)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements MNNCVExecutor.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float b;
        public final /* synthetic */ Bitmap c;
        public final /* synthetic */ wuc<xkn> d;

        public e(float f, Bitmap bitmap, wuc<xkn> wucVar) {
            this.b = f;
            this.c = bitmap;
            this.d = wucVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.h
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
            } else {
                MnnRealtimeDetectUnit.N(MnnRealtimeDetectUnit.this, this.b, this.c, this.d, mRTRuntimeException, map);
            }
        }
    }

    static {
        t2o.a(481297069);
    }

    public /* synthetic */ MnnRealtimeDetectUnit(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ njg L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("59beb729", new Object[0]);
        }
        return r;
    }

    public static final /* synthetic */ void M(MnnRealtimeDetectUnit mnnRealtimeDetectUnit, wuc wucVar, MRTRuntimeException mRTRuntimeException, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43fb276", new Object[]{mnnRealtimeDetectUnit, wucVar, mRTRuntimeException, map});
        } else {
            mnnRealtimeDetectUnit.Q(wucVar, mRTRuntimeException, map);
        }
    }

    public static final /* synthetic */ void N(MnnRealtimeDetectUnit mnnRealtimeDetectUnit, float f, Bitmap bitmap, wuc wucVar, MRTRuntimeException mRTRuntimeException, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169839a", new Object[]{mnnRealtimeDetectUnit, new Float(f), bitmap, wucVar, mRTRuntimeException, map});
        } else {
            mnnRealtimeDetectUnit.R(f, bitmap, wucVar, mRTRuntimeException, map);
        }
    }

    public static /* synthetic */ Object ipc$super(MnnRealtimeDetectUnit mnnRealtimeDetectUnit, String str, Object... objArr) {
        if (str.hashCode() == -1182901354) {
            super.c((utm) objArr[0], (String) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/mnn/realtime/MnnRealtimeDetectUnit");
    }

    public final Bitmap O(Bitmap bitmap, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d894270e", new Object[]{this, bitmap, rect});
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height(), new Matrix(), false);
        int i = this.p;
        int i2 = this.q;
        if (i * i2 == 0) {
            ckf.f(createBitmap, "{\n            cropImage\n        }");
        } else {
            createBitmap = gd2.n(createBitmap, hfn.c(this.p, this.q), hfn.f(i, i2));
            if (createBitmap == null) {
                return bitmap;
            }
        }
        return createBitmap;
    }

    /* renamed from: S */
    public void b(ukn uknVar, Object obj, wuc<xkn> wucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f236d233", new Object[]{this, uknVar, obj, wucVar});
            return;
        }
        ckf.g(uknVar, "input");
        ckf.g(wucVar, "callback");
        sle c2 = uknVar.c();
        if (c2 == null) {
            kl0 a2 = uknVar.a();
            if (a2 == null) {
                a49 b2 = uknVar.b();
                if (b2 == null) {
                    wucVar.onError(new RuntimeException("algoInput and imageInput is null"));
                } else {
                    U(b2, wucVar);
                }
            } else {
                T(a2, wucVar);
            }
        } else {
            V(c2, wucVar);
        }
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, tb.xuc
    public void c(utm utmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b97e5b96", new Object[]{this, utmVar, str});
            return;
        }
        ckf.g(utmVar, "callback");
        ckf.g(str, "activityHashCode");
        String c2 = e0.c(lg4.ADVANCE_AUTODETECT_EXPERIMENT);
        if (c2 == null) {
            c2 = "rsDefaultBucketId";
        }
        J(c2);
        super.c(new b(utmVar), str);
    }

    public MnnRealtimeDetectUnit() {
        super("plt_search");
        this.p = lg4.q3();
        this.q = lg4.p3();
    }

    public final void T(kl0 kl0Var, wuc<xkn> wucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9263db", new Object[]{this, kl0Var, wucVar});
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        String jSONString = JSON.toJSONString(kl0Var.a());
        ckf.f(jSONString, "toJSONString(input.algoMsgArray)");
        hashMap.put("_tppReturn", jSONString);
        agh.h(TAG, ckf.p("runInputAlgoMsg ", hashMap.get("_tppReturn")));
        E(hashMap, false, new c(wucVar));
    }

    public final void V(sle sleVar, wuc<xkn> wucVar) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1adc09e", new Object[]{this, sleVar, wucVar});
            return;
        }
        bs6.c a2 = bs6.a(sleVar.g(), sleVar.f(), sleVar.c(), sleVar.a(), sleVar.b());
        if (a2 != null) {
            Bitmap a3 = ((bs6.b) a2).b(sleVar.e(), sleVar.d()).a();
            if (a3 == null) {
                agh.c(TAG, "create bitmap failed");
                wucVar.onResult(new xkn(new fne(null, null, null, null), null, null));
                return;
            }
            float e2 = hfn.e(sleVar.e() / a3.getWidth(), sleVar.d() / a3.getHeight());
            HashMap<String, Object> g = com.etao.feimagesearch.mnn.utils.a.g(a3);
            if (g == null) {
                xhvVar = null;
            } else {
                agh.h(TAG, "prepare process...");
                E(g, false, new e(e2, a3, wucVar));
                xhvVar = xhv.INSTANCE;
            }
            if (xhvVar == null) {
                agh.c(TAG, "format is null");
                wucVar.onResult(new xkn(new fne(null, null, null, null), null, null));
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.util.DataProjector.CamDataInput");
    }

    public final void Q(wuc<xkn> wucVar, MRTRuntimeException mRTRuntimeException, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d5aead", new Object[]{this, wucVar, mRTRuntimeException, map});
        } else if (mRTRuntimeException != null) {
            agh.c(TAG, ckf.p("runInputAlgoMsg: ", mRTRuntimeException.getMessage()));
            jzu.n(p73.f25916a, "realtimeProcessAlgoException", 19999, "errorCode", String.valueOf(mRTRuntimeException.errorCode), "errorMsg", mRTRuntimeException.getMessage());
            wucVar.onResult(new xkn(null, new ll0(new ArrayList(1)), null));
        } else if (map != null) {
            jzu.n(p73.f25916a, "realtimeProcessAlgoSuccess", 19999, new String[0]);
            agh.h(TAG, ckf.p("runInputAlgoMsg ", JSON.toJSONString(map)));
            ArrayList arrayList = new ArrayList();
            Object obj = map.get("objects");
            if (obj != null) {
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof HashMap) {
                        Map map2 = (Map) next;
                        Object obj2 = map2.get("number");
                        if (obj2 != null) {
                            int intValue = ((Integer) obj2).intValue();
                            Object obj3 = map2.get("updateMuiseCard");
                            if (obj3 != null) {
                                arrayList.add(new ml0(intValue, ((Integer) obj3).intValue()));
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                    }
                }
                wucVar.onResult(new xkn(null, new ll0(arrayList), null));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
        }
    }

    public final void R(float f, Bitmap bitmap, wuc<xkn> wucVar, MRTRuntimeException mRTRuntimeException, Map<String, ? extends Object> map) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8fc765", new Object[]{this, new Float(f), bitmap, wucVar, mRTRuntimeException, map});
        } else if (mRTRuntimeException != null) {
            agh.c(TAG, "runtimeException " + mRTRuntimeException.errorCode + ' ' + ((Object) mRTRuntimeException.getMessage()));
            jzu.n(p73.f25916a, "realtimeProcessImageException", 19999, "errorCode", String.valueOf(mRTRuntimeException.errorCode), "errorMsg", mRTRuntimeException.getMessage());
            wucVar.onResult(new xkn(new fne(null, null, null, null), null, null));
        } else if (map != null) {
            jzu.n(p73.f25916a, "realtimeProcessImageSuccess", 19999, new String[0]);
            String jSONString = JSON.toJSONString(map);
            ckf.f(jSONString, "toJSONString(result)");
            agh.h(TAG, ckf.p("result = ", jSONString));
            try {
                Object obj = map.get("action");
                ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
                String a2 = com.etao.feimagesearch.mnn.utils.a.a(map);
                ArrayList arrayList2 = (ArrayList) map.get("objects");
                if (!(arrayList == null || arrayList2 == null || arrayList2.size() == 0)) {
                    ArrayList arrayList3 = new ArrayList(arrayList2.size());
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Map<String, ? extends Object> map2 = (Map) it.next();
                        ckf.f(map2, "rtObject");
                        wkn P = P(map2, bitmap, f);
                        if (P != null) {
                            arrayList3.add(P);
                            Integer c2 = P.c();
                            if (c2 != null && c2.intValue() == 1) {
                                z = true;
                            }
                        }
                    }
                    if (arrayList3.size() > 0) {
                        if (!z) {
                            bitmap = null;
                        }
                        wucVar.onResult(new xkn(new fne(arrayList, arrayList3, bitmap, a2), null, null));
                        return;
                    }
                    agh.h(TAG, "add no element");
                    wucVar.onResult(new xkn(new fne(null, null, null, null), null, null));
                    return;
                }
                wucVar.onResult(new xkn(new fne(null, null, null, null), null, null));
            } catch (Exception e2) {
                agh.c(TAG, ckf.p("--", e2.getMessage()));
                e2.printStackTrace();
                wucVar.onResult(new xkn(new fne(null, null, null, null), null, null));
            }
        }
    }

    public final void U(a49 a49Var, wuc<xkn> wucVar) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b459bd28", new Object[]{this, a49Var, wucVar});
            return;
        }
        HashMap<String, Object> g = com.etao.feimagesearch.mnn.utils.a.g(a49Var.a());
        if (g == null) {
            xhvVar = null;
        } else {
            Vector vector = new Vector(2);
            vector.add("wnk");
            g.put(com.etao.feimagesearch.mnn.utils.a.KEY_ACTION, vector);
            agh.h(TAG, ckf.p("params = ", JSON.toJSONString(g)));
            E(g, false, new d(wucVar));
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            wucVar.onResult(new xkn(null, null, new b49("", "")));
        }
    }

    public final wkn P(Map<String, ? extends Object> map, Bitmap bitmap, float f) {
        String str;
        String str2;
        Bitmap bitmap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wkn) ipChange.ipc$dispatch("ecdd74b5", new Object[]{this, map, bitmap, new Float(f)});
        }
        Object obj = map.get("bbox");
        if (obj != null) {
            ArrayList arrayList = (ArrayList) obj;
            if (arrayList.size() != 4) {
                return null;
            }
            Object obj2 = arrayList.get(2);
            ckf.f(obj2, "bbox[2]");
            float floatValue = ((Number) obj2).floatValue();
            Object obj3 = arrayList.get(0);
            ckf.f(obj3, "bbox[0]");
            if (floatValue <= ((Number) obj3).floatValue()) {
                return null;
            }
            Object obj4 = arrayList.get(3);
            ckf.f(obj4, "bbox[3]");
            float floatValue2 = ((Number) obj4).floatValue();
            Object obj5 = arrayList.get(1);
            ckf.f(obj5, "bbox[1]");
            if (floatValue2 <= ((Number) obj5).floatValue()) {
                return null;
            }
            Object obj6 = map.get("canRequest");
            if (obj6 != null) {
                Integer num = (Integer) obj6;
                int intValue = num.intValue();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (intValue == 1) {
                    float f2 = width;
                    Object obj7 = arrayList.get(0);
                    ckf.f(obj7, "bbox[0]");
                    float f3 = height;
                    str2 = "null cannot be cast to non-null type kotlin.Int";
                    Object obj8 = arrayList.get(1);
                    ckf.f(obj8, "bbox[1]");
                    str = "bbox[1]";
                    Object obj9 = arrayList.get(2);
                    ckf.f(obj9, "bbox[2]");
                    Object obj10 = arrayList.get(3);
                    ckf.f(obj10, "bbox[3]");
                    bitmap2 = O(bitmap, new Rect((int) (((Number) obj7).floatValue() * f2), (int) (((Number) obj8).floatValue() * f3), (int) (f2 * ((Number) obj9).floatValue()), (int) (f3 * ((Number) obj10).floatValue())));
                } else {
                    str2 = "null cannot be cast to non-null type kotlin.Int";
                    str = "bbox[1]";
                    bitmap2 = null;
                }
                float f4 = width;
                Object obj11 = arrayList.get(0);
                ckf.f(obj11, "bbox[0]");
                float f5 = height;
                Object obj12 = arrayList.get(1);
                ckf.f(obj12, str);
                Object obj13 = arrayList.get(2);
                ckf.f(obj13, "bbox[2]");
                Object obj14 = arrayList.get(3);
                ckf.f(obj14, "bbox[3]");
                Rect rect = new Rect((int) (((Number) obj11).floatValue() * f4 * f), (int) (((Number) obj12).floatValue() * f5 * f), (int) (f4 * ((Number) obj13).floatValue() * f), (int) (f5 * ((Number) obj14).floatValue() * f));
                Object obj15 = map.get("number");
                if (obj15 != null) {
                    int intValue2 = ((Integer) obj15).intValue();
                    Object obj16 = map.get("objectCategory");
                    if (obj16 != null) {
                        String str3 = (String) obj16;
                        Object obj17 = map.get("showCard");
                        if (obj17 != null) {
                            int intValue3 = ((Integer) obj17).intValue();
                            float floatValue3 = ((Number) arrayList.get(2)).floatValue();
                            Object obj18 = arrayList.get(0);
                            ckf.f(obj18, "bbox[0]");
                            float floatValue4 = floatValue3 - ((Number) obj18).floatValue();
                            float floatValue5 = ((Number) arrayList.get(3)).floatValue();
                            Object obj19 = arrayList.get(1);
                            ckf.f(obj19, str);
                            float floatValue6 = floatValue4 * (floatValue5 - ((Number) obj19).floatValue());
                            Object obj20 = arrayList.get(0);
                            ckf.f(obj20, "bbox[0]");
                            float floatValue7 = ((Number) obj20).floatValue();
                            Object obj21 = arrayList.get(1);
                            ckf.f(obj21, str);
                            float floatValue8 = ((Number) obj21).floatValue();
                            Object obj22 = arrayList.get(2);
                            ckf.f(obj22, "bbox[2]");
                            float floatValue9 = ((Number) obj22).floatValue();
                            Object obj23 = arrayList.get(3);
                            ckf.f(obj23, "bbox[3]");
                            return new wkn(rect, num, intValue2, str3, intValue3, bitmap2, System.currentTimeMillis(), floatValue6, new RectF(floatValue7, floatValue8, floatValue9, ((Number) obj23).floatValue()));
                        }
                        throw new NullPointerException(str2);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new NullPointerException(str2);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Float>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Float> }");
    }
}
