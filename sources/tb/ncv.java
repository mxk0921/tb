package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.performence.model.UltronPerformanceFlowModel;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.bav;
import tb.dav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ncv extends mz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UMBRELLA_ARGS_PARAM_KEY = "auraPerformance";

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f24649a = pav.e(1, 1, 3, TimeUnit.SECONDS, z9v.TAG);
    public final ConcurrentHashMap<String, UltronPerformanceFlowModel> b = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, UltronPerformanceFlowModel> c = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Map<String, UltronPerformanceStageModel>> d = new ConcurrentHashMap<>();
    public String e;
    public String f;
    public String g;
    @Deprecated
    public cav h;
    public bav i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24650a;

        public a(String str) {
            this.f24650a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ncv.q(ncv.this, this.f24650a);
            }
        }
    }

    static {
        t2o.a(83886270);
    }

    public static /* synthetic */ Object ipc$super(ncv ncvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/performence/impl/UltronUTPerformance");
    }

    public static /* synthetic */ void q(ncv ncvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cbae277", new Object[]{ncvVar, str});
        } else {
            ncvVar.P(str);
        }
    }

    public final boolean A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b90b17ff", new Object[]{this, str})).booleanValue();
        }
        Map<String, UltronPerformanceStageModel> map = this.d.get(str);
        if (map == null) {
            return true;
        }
        for (UltronPerformanceStageModel ultronPerformanceStageModel : map.values()) {
            if (!ultronPerformanceStageModel.isRecordFinished()) {
                return false;
            }
        }
        return true;
    }

    public final boolean B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fa92e", new Object[]{this, str})).booleanValue();
        }
        return this.b.containsKey(str);
    }

    public final void C(UltronPerformanceFlowModel ultronPerformanceFlowModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19119ee0", new Object[]{this, ultronPerformanceFlowModel, new Boolean(z)});
            return;
        }
        String str = ultronPerformanceFlowModel.mFlowCode;
        if (z) {
            r(str);
        } else if (N(ultronPerformanceFlowModel)) {
            O(str);
        }
    }

    public final void D(UltronPerformanceStageModel ultronPerformanceStageModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e1624c", new Object[]{this, ultronPerformanceStageModel, new Boolean(z)});
        } else if (z) {
            J(ultronPerformanceStageModel);
        } else {
            String x = x();
            UltronPerformanceFlowModel y = y(x);
            if (y != null && N(y)) {
                O(x);
            }
        }
    }

    public final void E(UltronPerformanceStageModel ultronPerformanceStageModel) {
        Map<String, UltronPerformanceStageModel> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b108da1", new Object[]{this, ultronPerformanceStageModel});
            return;
        }
        String x = x();
        String stageCode = ultronPerformanceStageModel.getStageCode();
        if (y(x) != null && (map = this.d.get(x)) != null && !map.containsKey(stageCode)) {
            map.put(stageCode, ultronPerformanceStageModel);
        }
    }

    public final void F(UltronPerformanceStageModel ultronPerformanceStageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136de411", new Object[]{this, ultronPerformanceStageModel});
            return;
        }
        List<UltronPerformanceStageModel> childStages = ultronPerformanceStageModel.getChildStages();
        if (!(childStages == null || childStages.isEmpty())) {
            for (UltronPerformanceStageModel ultronPerformanceStageModel2 : childStages) {
                h(ultronPerformanceStageModel2, ultronPerformanceStageModel.getStageCode(), false);
                F(ultronPerformanceStageModel2);
            }
        }
    }

    public final void G(UltronPerformanceStageModel ultronPerformanceStageModel, pwl pwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced2ecc9", new Object[]{this, ultronPerformanceStageModel, pwlVar});
            return;
        }
        List<UltronPerformanceStageModel> childStages = ultronPerformanceStageModel.getChildStages();
        if (!(childStages == null || childStages.isEmpty())) {
            for (UltronPerformanceStageModel ultronPerformanceStageModel2 : childStages) {
                pwlVar.a(ultronPerformanceStageModel2.getStageCode(), ultronPerformanceStageModel2.getDurationMills());
                G(ultronPerformanceStageModel2, pwlVar);
            }
        }
    }

    public final void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36969ee2", new Object[]{this, str});
        } else {
            this.d.remove(str);
        }
    }

    public final void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("babf9b2", new Object[]{this, str});
        } else {
            this.b.remove(str);
        }
    }

    public final void J(UltronPerformanceStageModel ultronPerformanceStageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d8525", new Object[]{this, ultronPerformanceStageModel});
            return;
        }
        ultronPerformanceStageModel.removeFromParentStage();
        Map<String, UltronPerformanceStageModel> v = v();
        if (v != null) {
            v.remove(ultronPerformanceStageModel.getStageCode());
        }
    }

    public final void K(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb1b7aeb", new Object[]{this, ultronPerformanceFlowModel});
            return;
        }
        String str = ultronPerformanceFlowModel.mFlowCode;
        if (!this.d.containsKey(str)) {
            this.d.put(str, new ConcurrentHashMap());
        }
    }

    public final void L(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8850015", new Object[]{this, ultronPerformanceFlowModel});
        } else {
            this.b.put(ultronPerformanceFlowModel.mFlowCode, ultronPerformanceFlowModel);
        }
    }

    public void M(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12f7dd9", new Object[]{this, str, new Long(j), str2});
        } else {
            u(str, j, str2, false);
        }
    }

    public final boolean N(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7b08221", new Object[]{this, ultronPerformanceFlowModel})).booleanValue();
        }
        String str = ultronPerformanceFlowModel.mFlowCode;
        if (!ultronPerformanceFlowModel.isRecordFinished()) {
            return false;
        }
        boolean isForceFinish = ultronPerformanceFlowModel.isForceFinish();
        if (!isForceFinish && !A(str)) {
            return false;
        }
        if (!isForceFinish) {
            ultronPerformanceFlowModel.setEndMills(z(ultronPerformanceFlowModel));
        }
        this.c.put(str, ultronPerformanceFlowModel);
        r(str);
        return true;
    }

    public final void O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52fa231e", new Object[]{this, str});
            return;
        }
        hav.i(z9v.TAG, "流程结束，准备上报性能埋点");
        this.f24649a.execute(new a(str));
    }

    public final void Q(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f45700ab", new Object[]{this, ultronPerformanceFlowModel});
            return;
        }
        dav jSTrackerModel = ultronPerformanceFlowModel.getJSTrackerModel();
        if (jSTrackerModel != null) {
            String g = jSTrackerModel.g();
            String c = jSTrackerModel.c();
            if (!(TextUtils.isEmpty(g) || TextUtils.isEmpty(c))) {
                String str = ultronPerformanceFlowModel.mBizCode;
                if (TextUtils.isEmpty(g)) {
                    g = "27659-tracker";
                }
                if (TextUtils.isEmpty(c)) {
                    c = "http://taobao.com/jstracker/android/ultron.html";
                }
                pwl pwlVar = new pwl(str, g, c);
                List<UltronPerformanceStageModel> childStages = ultronPerformanceFlowModel.getChildStages();
                if (childStages != null) {
                    String f = jSTrackerModel.f();
                    if (TextUtils.isEmpty(f)) {
                        f = ultronPerformanceFlowModel.mFlowCode;
                    }
                    pwlVar.e(f);
                    for (UltronPerformanceStageModel ultronPerformanceStageModel : childStages) {
                        pwlVar.a(ultronPerformanceStageModel.getStageCode(), ultronPerformanceStageModel.getDurationMills());
                        G(ultronPerformanceStageModel, pwlVar);
                    }
                    pwlVar.a("totalStage", ultronPerformanceFlowModel.mDurationMills);
                    List<dav.a> e = jSTrackerModel.e();
                    if (e != null && !e.isEmpty()) {
                        for (dav.a aVar : e) {
                            if (aVar != null) {
                                pwlVar.b(aVar.a(), aVar.b());
                            }
                        }
                    }
                    pwlVar.sampling(jSTrackerModel.h());
                    bav.a d = this.i.d();
                    if (d == null || !d.c(ultronPerformanceFlowModel, pwlVar)) {
                        pwlVar.message(JSON.toJSONString(ultronPerformanceFlowModel.mCommonArgs));
                        f9v.t(pwlVar);
                        f9v.l(this.e);
                        if (n7v.a()) {
                            hav.f(z9v.TAG, "性能埋点上报到JSTracker", JSON.parseObject(JSON.toJSONString(pwlVar)));
                        }
                    }
                }
            }
        }
    }

    @Override // tb.lz
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f8c4aa", new Object[]{this, str, str2, str3});
            return;
        }
        UltronPerformanceFlowModel y = y(x());
        if (y != null) {
            y.ensureGetJSTrackerModel().a(str, str2, str3);
        }
    }

    @Override // tb.lz
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f17bfe", new Object[]{this, str, str2, str3});
            return;
        }
        UltronPerformanceFlowModel y = y(x());
        if (y != null && !y.isRecordFinished()) {
            y.ensureGetJSTrackerModel().b(new x7v(str, str2, str3));
        }
    }

    @Override // tb.lz
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4ee56c", new Object[]{this});
            return;
        }
        this.b.clear();
        this.d.clear();
    }

    @Override // tb.lz
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d53b83", new Object[]{this, str, str2});
            return;
        }
        UltronPerformanceFlowModel y = y(x());
        if (y != null) {
            y.addCommonArgs(str, str2);
        }
    }

    @Override // tb.lz
    public void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a283cdb6", new Object[]{this, map});
            return;
        }
        UltronPerformanceFlowModel y = y(x());
        if (y != null) {
            y.addCommonArgs(map);
        }
    }

    @Override // tb.lz
    @Deprecated
    public void g(cav cavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd0631d", new Object[]{this, cavVar});
            return;
        }
        this.h = cavVar;
        UltronPerformanceFlowModel y = y(x());
        if (y != null && !y.isRecordFinished()) {
            y.ensureGetJSTrackerModel().i(cavVar);
        }
    }

    @Override // tb.lz
    public void h(UltronPerformanceStageModel ultronPerformanceStageModel, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92315d3", new Object[]{this, ultronPerformanceStageModel, str, new Boolean(z)});
            return;
        }
        String stageCode = ultronPerformanceStageModel.getStageCode();
        long startMills = ultronPerformanceStageModel.getStartMills();
        long endMills = ultronPerformanceStageModel.getEndMills();
        Map<String, String> args = ultronPerformanceStageModel.getArgs();
        M(stageCode, startMills, str);
        Map<String, UltronPerformanceStageModel> v = v();
        if (v != null && v.get(stageCode) != null) {
            F(ultronPerformanceStageModel);
            l(stageCode, endMills, z, args);
        }
    }

    @Override // tb.lz
    public void i(String str, boolean z, boolean z2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28e8ea1", new Object[]{this, str, new Boolean(z), new Boolean(z2), map});
        } else if (str == null) {
            d();
        } else {
            UltronPerformanceFlowModel y = y(str);
            if (y != null && !y.isRecordFinished()) {
                y.setForceFinish(z2);
                y.setEndMills(System.currentTimeMillis());
                y.addCommonArgs(map);
                C(y, z);
            }
        }
    }

    @Override // tb.lz
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72c980a9", new Object[]{this})).booleanValue();
        }
        return true ^ this.b.isEmpty();
    }

    @Override // tb.lz
    public void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fc75e6", new Object[]{this, context});
            return;
        }
        try {
            d();
        } catch (Exception e) {
            f9v.q(xh8.a(z9v.TAG).c("onPerformanceDestroyException").message(e.getMessage()));
        }
    }

    @Override // tb.lz
    public void l(String str, long j, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d636e7", new Object[]{this, str, new Long(j), new Boolean(z), map});
        } else {
            t(str, j, z, map);
        }
    }

    @Override // tb.lz
    public void m(String str, long j, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c0f01b", new Object[]{this, str, new Long(j), str2, new Boolean(z)});
        } else {
            u(str, j, str2, z);
        }
    }

    @Override // tb.lz
    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{this, str});
        } else {
            o(str, System.currentTimeMillis());
        }
    }

    @Override // tb.lz
    public void o(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbdfbb1", new Object[]{this, str, new Long(j)});
        } else if (c(str)) {
            f9v.v(this.e);
            d();
            UltronPerformanceFlowModel ultronPerformanceFlowModel = new UltronPerformanceFlowModel(this.e, this.f, str);
            this.g = str;
            ultronPerformanceFlowModel.setStartMills(j);
            L(ultronPerformanceFlowModel);
            K(ultronPerformanceFlowModel);
            if (this.i.c() != null) {
                g(this.i.c());
            }
            cav cavVar = this.h;
            if (cavVar != null) {
                g(cavVar);
            }
        }
    }

    @Override // tb.mz
    public void p(Context context, bav bavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e340f3fd", new Object[]{this, context, bavVar});
            return;
        }
        this.i = bavVar;
        this.e = bavVar.a();
        this.f = bavVar.b();
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e60c36", new Object[]{this, str});
            return;
        }
        H(str);
        I(str);
    }

    public final UltronPerformanceFlowModel s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronPerformanceFlowModel) ipChange.ipc$dispatch("3fc6fcf6", new Object[]{this, str});
        }
        try {
            return this.c.remove(str);
        } catch (Exception e) {
            hav.b("Ultron", "consumePendingModelException", e.getMessage());
            return null;
        }
    }

    public final void t(String str, long j, boolean z, Map<String, String> map) {
        Map<String, UltronPerformanceStageModel> map2;
        UltronPerformanceStageModel ultronPerformanceStageModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292dc6dc", new Object[]{this, str, new Long(j), new Boolean(z), map});
            return;
        }
        String x = x();
        if (y(x) != null && (map2 = this.d.get(x)) != null && (ultronPerformanceStageModel = map2.get(str)) != null && !ultronPerformanceStageModel.isRecordFinished()) {
            ultronPerformanceStageModel.setArgs(map);
            ultronPerformanceStageModel.setEndMills(j);
            D(ultronPerformanceStageModel, z);
        }
    }

    public final void u(String str, long j, String str2, boolean z) {
        Map<String, UltronPerformanceStageModel> v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8de1146", new Object[]{this, str, new Long(j), str2, new Boolean(z)});
            return;
        }
        String x = x();
        UltronPerformanceFlowModel y = y(x);
        if (y != null && B(x) && (v = v()) != null && v.get(str) == null) {
            UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel(str);
            ultronPerformanceStageModel.setStartMills(j);
            ultronPerformanceStageModel.setFreeStage(z);
            if (str2 != null) {
                UltronPerformanceStageModel ultronPerformanceStageModel2 = v.get(str2);
                if (ultronPerformanceStageModel2 != null) {
                    ultronPerformanceStageModel2.addChildStage(ultronPerformanceStageModel);
                } else {
                    return;
                }
            } else {
                y.addChildStage(ultronPerformanceStageModel);
            }
            E(ultronPerformanceStageModel);
        }
    }

    public final Map<String, UltronPerformanceStageModel> v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f3b0330f", new Object[]{this});
        }
        return w(x());
    }

    public final Map<String, UltronPerformanceStageModel> w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df76d3a8", new Object[]{this, str});
        }
        return this.d.get(str);
    }

    public final String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9670bde8", new Object[]{this});
        }
        String str = this.g;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final UltronPerformanceFlowModel y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronPerformanceFlowModel) ipChange.ipc$dispatch("c925825f", new Object[]{this, str});
        }
        return this.b.get(str);
    }

    public final long z(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21443339", new Object[]{this, ultronPerformanceFlowModel})).longValue();
        }
        Map<String, UltronPerformanceStageModel> w = w(ultronPerformanceFlowModel.mFlowCode);
        long endMills = ultronPerformanceFlowModel.getEndMills();
        if (w != null && !w.isEmpty()) {
            for (UltronPerformanceStageModel ultronPerformanceStageModel : w.values()) {
                if (!ultronPerformanceStageModel.isFreeStage()) {
                    long endMills2 = ultronPerformanceStageModel.getEndMills();
                    if (endMills2 > endMills) {
                        endMills = endMills2;
                    }
                }
            }
        }
        return endMills;
    }

    public final void P(String str) {
        UltronPerformanceFlowModel s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a64dbb", new Object[]{this, str});
        } else if (v7v.a() && (s = s(str)) != null) {
            try {
                if (s.isRecordFinished()) {
                    if (n7v.a()) {
                        aav.a(s);
                    }
                    bav.a d = this.i.d();
                    if (d == null || !d.a(s)) {
                        Q(s);
                        if (vav.a(s.mBizCode, "uploadUltronPerformanceToUT", true)) {
                            if (d == null || !d.b(s)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put(UMBRELLA_ARGS_PARAM_KEY, JSON.toJSONString(s));
                                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("EndToEnd_Performance_Detection", 19997, this.e, "", "", hashMap).build());
                            }
                        }
                    }
                }
            } catch (Exception e) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("flowCode", this.g);
                hav.c(s.mBizCode, "UltronPerformanceException", e.getMessage(), hashMap2);
            }
        }
    }

    @Override // tb.lz
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7f34d55", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        UltronPerformanceFlowModel y = y(str);
        if (y == null) {
            return true;
        }
        return !vav.a(this.e, "skipDuplicatePerformanceStart", true) && System.currentTimeMillis() - y.getStartMills() > ((long) vav.e(this.e, "skipPerformanceStartIntervalMills", 500));
    }
}
