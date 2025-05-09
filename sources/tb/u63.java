package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.perf.CapturePerfRecord;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.m;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class u63 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIMENSION_BUCKET_ID = "bucket_id";
    public static final String DIMENSION_NEW_CAPTURE = "newCapture";
    public static final String DIMEN_DEVICE_LEVEL = "deviceLevel";
    public static final String DIMEN_HAS_ALBUM_PERMISSION = "hasAlbumPermission";
    public static final String DIMEN_HAS_DOWNGRADE = "hasDowngrade";
    public static final u63 INSTANCE = new u63();
    public static final String MEASURE_ALBUM_LOAD_COST_TIME = "albumLoadCostTime";
    public static final String MEASURE_FIRST_FRAME_COST_TIME = "firstFrameCostTime";
    public static final String MEASURE_INTERACTIVE_COST_TIME = "interactiveCostTime";
    public static final String MEASURE_MUISE_COST_TIME = "muiseCostTime";
    public static final String MEASURE_UI_COST_TIME = "uiCostTime";
    public static final String MODULE = "plt_capture";
    public static final String POINT_CAPTURE_LOAD = "render_result";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29173a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f29174a;

        public a(long j) {
            this.f29174a = j;
        }

        @Override // com.taobao.falco.m.a
        public final void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
            } else if (mVar != null) {
                mVar.h(Long.valueOf(this.f29174a));
            }
        }
    }

    static {
        t2o.a(481296688);
    }

    public static /* synthetic */ void b(u63 u63Var, Map map, String str, long j, Long l, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("916ff9a4", new Object[]{u63Var, map, str, new Long(j), l, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        u63Var.a(map, str, j, l);
    }

    public final void a(Map<String, Double> map, String str, long j, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b1a7aa", new Object[]{this, map, str, new Long(j), l});
        } else if (j > 0) {
            if (l == null || j <= l.longValue()) {
                map.put(str, Double.valueOf(j));
            }
        }
    }

    public final void e(CapturePerfRecord capturePerfRecord, Map<String, String> map) {
        String str;
        String bool;
        String bool2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2902a2aa", new Object[]{this, capturePerfRecord, map});
            return;
        }
        Boolean isNewCapture = capturePerfRecord.isNewCapture();
        String str2 = "null";
        if (!(isNewCapture == null || (bool2 = isNewCapture.toString()) == null)) {
            str2 = bool2;
        }
        map.put(DIMENSION_NEW_CAPTURE, str2);
        map.put("deviceLevel", ri7.a());
        Boolean hasDowngrade = capturePerfRecord.getHasDowngrade();
        String str3 = "unknown";
        if (hasDowngrade == null || (str = hasDowngrade.toString()) == null) {
            str = str3;
        }
        map.put(DIMEN_HAS_DOWNGRADE, str);
        Boolean hasAlbumPermission = capturePerfRecord.getHasAlbumPermission();
        if (!(hasAlbumPermission == null || (bool = hasAlbumPermission.toString()) == null)) {
            str3 = bool;
        }
        map.put(DIMEN_HAS_ALBUM_PERMISSION, str3);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e130d05", new Object[]{this});
        } else if (!f29173a) {
            f29173a = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add(MEASURE_FIRST_FRAME_COST_TIME);
            arrayList.add(MEASURE_MUISE_COST_TIME);
            arrayList.add(MEASURE_UI_COST_TIME);
            arrayList.add(MEASURE_ALBUM_LOAD_COST_TIME);
            arrayList.add(MEASURE_INTERACTIVE_COST_TIME);
            xhv xhvVar = xhv.INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("deviceLevel");
            arrayList2.add(DIMENSION_NEW_CAPTURE);
            arrayList2.add("bucket_id");
            arrayList2.add(DIMEN_HAS_DOWNGRADE);
            arrayList2.add(DIMEN_HAS_ALBUM_PERMISSION);
            jzu.m(MODULE, POINT_CAPTURE_LOAD, arrayList, arrayList2);
        }
    }

    @JvmStatic
    public static final void d(CapturePerfRecord capturePerfRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea040bf", new Object[]{capturePerfRecord});
        } else if (capturePerfRecord != null) {
            u63 u63Var = INSTANCE;
            u63Var.c();
            TLogTracker.f("CapturePerf", "perfNode", JSON.toJSONString(capturePerfRecord));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            u63Var.e(capturePerfRecord, linkedHashMap);
            HashMap hashMap = new HashMap();
            long cameraFirstFrameCall = capturePerfRecord.getCameraFirstFrameCall() - capturePerfRecord.getCaptureInitStart();
            b(u63Var, hashMap, MEASURE_FIRST_FRAME_COST_TIME, cameraFirstFrameCall, null, 8, null);
            long albumLoadEnd = capturePerfRecord.getAlbumLoadEnd() - capturePerfRecord.getCaptureInitStart();
            b(u63Var, hashMap, MEASURE_ALBUM_LOAD_COST_TIME, albumLoadEnd, null, 8, null);
            b(u63Var, hashMap, MEASURE_MUISE_COST_TIME, capturePerfRecord.getMuiseLoadEnd() - capturePerfRecord.getCaptureInitEnd(), null, 8, null);
            long uiLoadEnd = capturePerfRecord.getUiLoadEnd() - capturePerfRecord.getCaptureInitEnd();
            b(u63Var, hashMap, MEASURE_UI_COST_TIME, uiLoadEnd, null, 8, null);
            b(u63Var, hashMap, MEASURE_INTERACTIVE_COST_TIME, hfn.d(hfn.d(cameraFirstFrameCall, albumLoadEnd), uiLoadEnd), null, 8, null);
            jzu.d(MODULE, POINT_CAPTURE_LOAD, hashMap, linkedHashMap);
            FalcoGlobalTracer.get().j(new a(hfn.d(hfn.d(capturePerfRecord.getCameraFirstFrameCallWithSystemTime(), capturePerfRecord.getUiLoadEndWithSystemTime()), capturePerfRecord.getAlbumLoadEndWithSystemTime())));
            TLogTracker.f("CapturePerf", "Default", JSON.toJSONString(hashMap));
        }
    }
}
