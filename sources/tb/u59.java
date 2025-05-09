package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.task.Coordinator;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request.InfoFlowOverlayClient;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request.InfoFlowOverlayParams;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request.InfoFlowOverlayResult;
import com.taobao.tao.util.TaoHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.w4d;
import tb.x28;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u59 implements v4d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_POPDATA = "popData";
    public static final String REQUEST_OVERLAY_DATA = "requestOverlayData";

    /* renamed from: a  reason: collision with root package name */
    public final cfc f29154a;
    public w4d b;
    public final HashMap<String, w4d> c = new HashMap<>(4);
    public final String d;
    public volatile String e;
    public g6j f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29155a;
        public final /* synthetic */ BaseSectionModel b;
        public final /* synthetic */ View c;
        public final /* synthetic */ w4d.a d;
        public final /* synthetic */ String e;

        public a(String str, BaseSectionModel baseSectionModel, View view, w4d.a aVar, String str2) {
            this.f29155a = str;
            this.b = baseSectionModel;
            this.c = view;
            this.d = aVar;
            this.e = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InfoFlowOverlayParams infoFlowOverlayParams;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                infoFlowOverlayParams = u59.g(u59.this, this.f29155a, this.b);
            } catch (Throwable th) {
                if (cw6.b()) {
                    th.printStackTrace();
                }
                fve.c(u59.REQUEST_OVERLAY_DATA, "createInfoFlowOverlayParams error", th);
                infoFlowOverlayParams = null;
            }
            if (infoFlowOverlayParams == null) {
                fve.e(u59.REQUEST_OVERLAY_DATA, "param_create_error");
                uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, u59.REQUEST_OVERLAY_DATA, "param_create_error", "", "");
                return;
            }
            uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, u59.REQUEST_OVERLAY_DATA, "start", "", "");
            b bVar = new b(this.b, this.c, this.d, this.e);
            phg.i("requestOverlay");
            new InfoFlowOverlayClient().execute(infoFlowOverlayParams, bVar, TaoHelper.getTTID());
            phg.h("requestOverlay");
            u59.h(u59.this, bVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements g6j<InfoFlowOverlayResult> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f29156a;
        public final BaseSectionModel<?> b;
        public final w4d.a c;
        public final WeakReference<View> d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (b.c(b.this).get() != null) {
                    uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, u59.REQUEST_OVERLAY_DATA, "showOverlaySuccess", "", "");
                    phg.m("requestSucOverlay");
                    b bVar = b.this;
                    u59.this.e(b.d(bVar), (View) b.c(b.this).get(), b.e(b.this));
                    phg.l("requestSucOverlay");
                }
            }
        }

        static {
            t2o.a(491782458);
        }

        public b(BaseSectionModel<?> baseSectionModel, View view, w4d.a aVar, String str) {
            this.b = baseSectionModel;
            this.d = new WeakReference<>(view);
            this.c = aVar;
            this.f29156a = str;
        }

        public static /* synthetic */ WeakReference c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("a0f0f93d", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ BaseSectionModel d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseSectionModel) ipChange.ipc$dispatch("61c856ae", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ w4d.a e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w4d.a) ipChange.ipc$dispatch("2a206bd3", new Object[]{bVar});
            }
            return bVar.c;
        }

        @Override // tb.g6j
        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                return;
            }
            uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, u59.REQUEST_OVERLAY_DATA, "failed", "", "");
            fve.e("FeedbackOverlayPresenter", "requestOverlayData.onSystemFailure");
        }

        /* renamed from: f */
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb2ff8f7", new Object[]{this, mtopResponse});
                return;
            }
            uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, u59.REQUEST_OVERLAY_DATA, "failed", "", "");
            fve.e("FeedbackOverlayPresenter", "requestOverlayData.onFailure");
        }

        /* renamed from: g */
        public void onSuccess(InfoFlowOverlayResult infoFlowOverlayResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("474833c8", new Object[]{this, infoFlowOverlayResult});
            } else if (infoFlowOverlayResult != null && infoFlowOverlayResult.isValid()) {
                uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, u59.REQUEST_OVERLAY_DATA, "success", "", "");
                JSONObject subSection = this.b.getSubSection();
                if (subSection == null) {
                    subSection = new JSONObject();
                    this.b.put("subSection", (Object) subSection);
                }
                subSection.put("overlay", (Object) infoFlowOverlayResult.getOverlay());
                subSection.put(u59.KEY_POPDATA, (Object) infoFlowOverlayResult.popData);
                if (TextUtils.equals(this.f29156a, u59.f(u59.this))) {
                    get.a().h(new a());
                }
            }
        }
    }

    static {
        t2o.a(491782456);
        t2o.a(491782450);
    }

    public u59(cfc cfcVar, String str) {
        this.f29154a = cfcVar;
        this.d = str;
    }

    public static /* synthetic */ String f(u59 u59Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75a59763", new Object[]{u59Var});
        }
        return u59Var.e;
    }

    public static /* synthetic */ InfoFlowOverlayParams g(u59 u59Var, String str, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InfoFlowOverlayParams) ipChange.ipc$dispatch("97388465", new Object[]{u59Var, str, baseSectionModel});
        }
        return u59Var.i(str, baseSectionModel);
    }

    public static /* synthetic */ g6j h(u59 u59Var, g6j g6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g6j) ipChange.ipc$dispatch("9e3f1080", new Object[]{u59Var, g6jVar});
        }
        u59Var.f = g6jVar;
        return g6jVar;
    }

    @Override // tb.v4d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("356fedae", new Object[]{this});
            return;
        }
        w4d w4dVar = this.b;
        if (w4dVar != null) {
            w4dVar.a();
        }
    }

    @Override // tb.v4d
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4579905", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.v4d
    public void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4abc21da", new Object[]{this, view});
        }
    }

    @Override // tb.v4d
    public void hideOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4786e35", new Object[]{this});
            return;
        }
        w4d w4dVar = this.b;
        if (w4dVar != null) {
            w4dVar.hideOverlay();
        }
    }

    public final InfoFlowOverlayParams i(String str, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InfoFlowOverlayParams) ipChange.ipc$dispatch("fb52b51", new Object[]{this, str, baseSectionModel});
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null || parseObject.isEmpty()) {
            fve.e(REQUEST_OVERLAY_DATA, "param json error");
            return null;
        }
        JSONObject jSONObject = parseObject.getJSONObject("delParamsPath");
        if (jSONObject == null || jSONObject.isEmpty()) {
            fve.e(REQUEST_OVERLAY_DATA, "delParamsPath is null");
            return null;
        }
        String string = parseObject.getString("appId");
        String string2 = parseObject.getString("bizParams");
        String string3 = jSONObject.getString("utLogMap");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            fve.e(REQUEST_OVERLAY_DATA, "upload param is null");
            return null;
        }
        z73.f(baseSectionModel);
        Object b2 = kr8.b(string3, baseSectionModel);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("bizParams", (Object) string2);
        jSONObject2.put("utLogMap", b2);
        return new InfoFlowOverlayParams.a().b(string).c(JSON.toJSONString(jSONObject2)).a();
    }

    public final BaseSectionModel<?> k(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("cd7666cb", new Object[]{this, baseSectionModel});
        }
        BaseSubSectionModel subSection = baseSectionModel.getSubSection();
        if (subSection == null) {
            fve.e("FeedbackOverlayPresenter", "subsection == null");
            return null;
        } else if (!subSection.containsKey("overlay")) {
            return null;
        } else {
            return subSection.getOverlay();
        }
    }

    public final String l(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb8e140", new Object[]{this, baseSectionModel});
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext.getBooleanValue("popDXOverlayEnable")) {
            return "pop_dx_view";
        }
        if (ext.getBooleanValue("dxOverlayEnable")) {
            return "dx_view";
        }
        return "native_view";
    }

    public final w4d m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w4d) ipChange.ipc$dispatch("1385afe5", new Object[]{this, str});
        }
        w4d w4dVar = this.c.get(str);
        if (w4dVar != null) {
            return w4dVar;
        }
        w4d j = j(str);
        this.c.put(str, j);
        return j;
    }

    public final String n(BaseSectionModel<?> baseSectionModel, View view, w4d.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edb3a3dc", new Object[]{this, baseSectionModel, view, aVar, str});
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            fve.e(REQUEST_OVERLAY_DATA, "hostData ext is null");
            return "ext_is_null";
        }
        String string = ext.getString("delParams");
        if (TextUtils.isEmpty(string)) {
            fve.e(REQUEST_OVERLAY_DATA, "hostData delParams is null");
            return "delParams_is_null";
        }
        Coordinator.execute(new a(string, baseSectionModel, view, aVar, str));
        return "createRequest";
    }

    @Override // tb.v4d
    public void b(BaseSectionModel<?> baseSectionModel, View view, BaseSectionModel<?> baseSectionModel2, w4d.a aVar, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48a3a4a", new Object[]{this, baseSectionModel, view, baseSectionModel2, aVar, view2});
            return;
        }
        w4d m = m("dx_view");
        this.b = m;
        if (m == null) {
            fve.e("FeedbackOverlayPresenter", "mOverlayViewController == null");
            return;
        }
        x28.f fVar = new x28.f();
        fVar.f31096a = true;
        this.b.b(view, baseSectionModel, baseSectionModel2, aVar, view2, fVar);
        fve.e("FeedbackOverlayPresenter", "showOverlayWithOverlayData");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r6.equals("native_view") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.w4d j(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.u59.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "4e9878ff"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            tb.w4d r6 = (tb.w4d) r6
            return r6
        L_0x0018:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -158524542: goto L_0x003a;
                case 1751194061: goto L_0x0030;
                case 2082906992: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0045
        L_0x0025:
            java.lang.String r0 = "dx_view"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002e
            goto L_0x0023
        L_0x002e:
            r0 = 2
            goto L_0x0045
        L_0x0030:
            java.lang.String r1 = "native_view"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0045
            goto L_0x0023
        L_0x003a:
            java.lang.String r0 = "pop_dx_view"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0044
            goto L_0x0023
        L_0x0044:
            r0 = 0
        L_0x0045:
            switch(r0) {
                case 0: goto L_0x005a;
                case 1: goto L_0x0052;
                case 2: goto L_0x004a;
                default: goto L_0x0048;
            }
        L_0x0048:
            r6 = 0
            goto L_0x0061
        L_0x004a:
            tb.w28 r6 = new tb.w28
            tb.cfc r0 = r5.f29154a
            r6.<init>(r0)
            goto L_0x0061
        L_0x0052:
            tb.skj r6 = new tb.skj
            tb.cfc r0 = r5.f29154a
            r6.<init>(r0)
            goto L_0x0061
        L_0x005a:
            tb.jcm r6 = new tb.jcm
            tb.cfc r0 = r5.f29154a
            r6.<init>(r0)
        L_0x0061:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.u59.j(java.lang.String):tb.w4d");
    }

    @Override // tb.v4d
    public void e(BaseSectionModel<?> baseSectionModel, View view, w4d.a aVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edda9482", new Object[]{this, baseSectionModel, view, aVar});
            return;
        }
        w4d m = m(l(baseSectionModel));
        this.b = m;
        if (m == null) {
            fve.e("FeedbackOverlayPresenter", "mOverlayViewController == null");
            return;
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext != null) {
            z = ext.getBooleanValue("overlayDataSplitEnable");
        }
        String str = this.e;
        this.e = baseSectionModel.hashCode() + "_" + SystemClock.uptimeMillis();
        BaseSectionModel<?> k = k(baseSectionModel);
        uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, REQUEST_OVERLAY_DATA, "needShowOverlay", String.valueOf(z), "");
        if (k == null) {
            fve.e("FeedbackOverlayPresenter", "itemData == null, overlayDataSplitEnable:" + z);
            if (z) {
                if (!TextUtils.isEmpty(str)) {
                    if (str.startsWith(baseSectionModel.hashCode() + "_")) {
                        fve.e("FeedbackOverlayPresenter", "itemData == null, oldShowOverlayCode:".concat(str));
                        return;
                    }
                }
                uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, REQUEST_OVERLAY_DATA, n(baseSectionModel, view, aVar, this.e), "", "");
                return;
            }
            return;
        }
        uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, REQUEST_OVERLAY_DATA, "controllerShowOverlay", "", "");
        this.b.b(view, baseSectionModel, k, aVar, null, null);
        fve.e("FeedbackOverlayPresenter", "execute new feedback overlay process");
    }
}
