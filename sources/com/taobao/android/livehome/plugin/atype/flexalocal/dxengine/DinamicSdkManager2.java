package com.taobao.android.livehome.plugin.atype.flexalocal.dxengine;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.DinamicDataObject;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.TemplateObject;
import com.taobao.live.home.dinamic.ability.TBLFollowAbility;
import com.taobao.live.home.dinamic.event.DXTblMtopRefreshEventHandler;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tb.ae6;
import tb.b26;
import tb.be6;
import tb.br5;
import tb.ce6;
import tb.cr5;
import tb.cs5;
import tb.dr5;
import tb.er5;
import tb.f26;
import tb.fe6;
import tb.fir;
import tb.fr5;
import tb.gs5;
import tb.h26;
import tb.he6;
import tb.hs5;
import tb.ie6;
import tb.ir5;
import tb.iwb;
import tb.je6;
import tb.jir;
import tb.jr5;
import tb.js5;
import tb.k66;
import tb.ks5;
import tb.lir;
import tb.lrq;
import tb.ls5;
import tb.m1h;
import tb.me6;
import tb.ms5;
import tb.ne6;
import tb.nvs;
import tb.oe6;
import tb.og6;
import tb.oir;
import tb.os5;
import tb.p9m;
import tb.qhr;
import tb.qht;
import tb.qw0;
import tb.qyg;
import tb.r0h;
import tb.ra6;
import tb.re6;
import tb.rg6;
import tb.rh6;
import tb.rzb;
import tb.shr;
import tb.sj7;
import tb.t2o;
import tb.t3z;
import tb.te6;
import tb.thr;
import tb.ud6;
import tb.uhr;
import tb.ur5;
import tb.v2s;
import tb.vd6;
import tb.wd6;
import tb.xd6;
import tb.xr5;
import tb.yd6;
import tb.yh6;
import tb.yl7;
import tb.yq5;
import tb.yr5;
import tb.zd6;
import tb.zq5;
import tb.zr5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DinamicSdkManager2 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CHANNEL_DISCOVERY_TEMPLATE_NAME = "taolive_discover_tab_container_2024";
    private static final String TAG = DinamicSdkManager2.class.getSimpleName();
    private static final int mMaxTemplateVersion = 100000;
    private DinamicXEngine mDinamicEngine;
    private c mDownloadCallback;
    private IDinamicRegister mIDinamicRegister;
    private LiveHomeController2 mLiveHomeController2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface IDinamicRegister extends Serializable {
        void onRegister(DinamicXEngine dinamicXEngine);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ra6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(DinamicSdkManager2 dinamicSdkManager2) {
        }

        @Override // tb.ra6
        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("403ecf43", new Object[]{this})).longValue();
            }
            long serverTime = TimestampSynchronizer.getServerTime();
            if (serverTime <= 0) {
                return System.currentTimeMillis();
            }
            return serverTime;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final DinamicDataObject f8803a;
        public final Context b;
        public final rzb c;

        static {
            t2o.a(310378613);
        }

        public b(DinamicDataObject dinamicDataObject, Context context, rzb rzbVar) {
            this.f8803a = dinamicDataObject;
            this.b = context;
            this.c = rzbVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ConcurrentHashMap<String, ArrayList<b>> f8804a = new ConcurrentHashMap<>();

        static {
            t2o.a(310378615);
            t2o.a(444596939);
        }

        public c() {
        }

        public void a(String str, b bVar) {
            ConcurrentHashMap<String, ArrayList<b>> concurrentHashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4014e8e6", new Object[]{this, str, bVar});
            } else if (!lrq.a(str) && bVar != null && (concurrentHashMap = this.f8804a) != null) {
                ArrayList<b> arrayList = concurrentHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f8804a.put(str, arrayList);
                }
                arrayList.add(bVar);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            ConcurrentHashMap<String, ArrayList<b>> concurrentHashMap = this.f8804a;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            this.f8804a = null;
        }

        public final void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6173380d", new Object[]{this, str});
            } else if (this.f8804a != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList<b> arrayList2 = this.f8804a.get(str);
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                if (arrayList.size() > 0) {
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            b bVar = (b) it.next();
                            if (bVar != null) {
                                DinamicSdkManager2.this.inflateView(bVar.b, bVar.f8803a, bVar.c);
                            }
                        }
                    } catch (Exception e) {
                        r0h.c(DinamicSdkManager2.access$000(), "Dinamic download callback.", e);
                    }
                    this.f8804a.remove(str);
                }
            }
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            } else if (k66Var != null) {
                if (!k66Var.f22428a.isEmpty()) {
                    qyg.c().d("com.taobao.live.home.template_download_complete");
                }
                try {
                    for (DXTemplateItem dXTemplateItem : k66Var.f22428a) {
                        if (dXTemplateItem != null) {
                            m1h.b(m1h.DYNAMIC_X_DOWNLOAD, "templateName=" + dXTemplateItem.f7343a);
                            c(dXTemplateItem.f7343a);
                        }
                    }
                } catch (Exception e) {
                    r0h.c(DinamicSdkManager2.access$000(), "TBLiveTemplateDownloadCallback.onNotificationListener", e);
                }
                List<DXTemplateItem> list = k66Var.b;
                if (list != null) {
                    try {
                        for (DXTemplateItem dXTemplateItem2 : list) {
                            if (dXTemplateItem2 != null) {
                                m1h.a(m1h.DYNAMIC_X_DOWNLOAD, "templateName=" + dXTemplateItem2.f7343a, "", "");
                            }
                        }
                    } catch (Exception e2) {
                        r0h.c(DinamicSdkManager2.access$000(), "TBLiveTemplateDownloadCallback.onNotificationListener", e2);
                    }
                }
            }
        }
    }

    static {
        t2o.a(310378611);
    }

    public DinamicSdkManager2(String str, int i, String str2) {
        DXEngineConfig.ImageQuality imageQuality;
        DXEngineConfig.b Y = new DXEngineConfig.b(str).X(i).Y(str2);
        if (nvs.U()) {
            if (nvs.u()) {
                if (qw0.q()) {
                    imageQuality = null;
                } else if (qw0.a()) {
                    imageQuality = DXEngineConfig.ImageQuality.q50;
                } else {
                    imageQuality = DXEngineConfig.ImageQuality.q60;
                }
                Y.Z(imageQuality);
            }
            if (nvs.d() && qw0.a()) {
                Y.R(false);
            }
        }
        DinamicXEngine dinamicXEngine = new DinamicXEngine(Y.F());
        this.mDinamicEngine = dinamicXEngine;
        dinamicXEngine.T0(new a(this));
        this.mDinamicEngine.e1(xd6.DXTBLCOUNTDOWNVIEW_TBLCOUNTDOWNVIEW, new xd6.a());
        this.mDinamicEngine.e1(ud6.DXTBLANIMATEDVIEW_TBLANIMATEDVIEW, new ud6.b());
        this.mDinamicEngine.e1(fe6.DXTBLHOMEIMAGEVIEW_TBLHOMEIMAGEVIEW, new fe6.b());
        this.mDinamicEngine.e1(ce6.DXTBLHOMEANIMATEDVIEW_TBLHOMEANIMATEDVIEW, new ce6.a());
        this.mDinamicEngine.e1(he6.DXTBLIMAGEVIEW_TBLIMAGEVIEW, new he6.a());
        this.mDinamicEngine.e1(yd6.DXTBLFAVORVIEW_TBLFAVORVIEW, new yd6.a());
        this.mDinamicEngine.e1(je6.DXTBLMASKVIEW_TBLMASKVIEW, new je6.a());
        this.mDinamicEngine.e1(oe6.DXTBLTEXTVIEW_TBLTEXTVIEW, new oe6.a());
        this.mDinamicEngine.e1(wd6.DXTBLCOMMENTVIEW_TBLCOMMENTVIEW, new wd6.a());
        this.mDinamicEngine.e1(zd6.DXTBLFOLLOWVIEW_TBLFOLLOWVIEW, new zd6.b());
        this.mDinamicEngine.e1(be6.DXTBLGRIDLAYOUT_TBLGRIDLAYOUT, new be6.a());
        this.mDinamicEngine.e1(ne6.DXTBLSUBSCRIBEVIEW_TBLSUBSCRIBEVIEW, new ne6.a());
        this.mDinamicEngine.e1(me6.DXTBLSLIDERLAYOUT_TBLSLIDERLAYOUT, new me6.a());
        this.mDinamicEngine.e1(vd6.DXTBLAUTOSCROLLSCROLLERLAYOUT_TBLAUTOSCROLLSCROLLERLAYOUT, new vd6.a());
        this.mDinamicEngine.e1(ie6.DXTBLLONGTEXTVIEW_TBLLONGTEXTVIEW, new ie6.a());
        this.mDinamicEngine.e1(vd6.DXTBLAUTOSCROLLSCROLLERLAYOUT_TBLAUTOSCROLLSCROLLERLAYOUT, new vd6.a());
        this.mDinamicEngine.e1(ae6.DXTBLFRAMELAYOUT_TBLFRAMELAYOUT, new ae6.a());
        this.mDinamicEngine.e1(re6.DXTBLVWEBVIEW_TBLVWEBVIEW, new re6.c());
        this.mDinamicEngine.e1(te6.DXTBLIVEVIEWPAGER_TBLIVEVIEWPAGER, new te6.a());
        this.mDinamicEngine.V0(ur5.DX_PARSER_TBLDEVICELEVEL, new ur5());
        this.mDinamicEngine.V0(zr5.DX_PARSER_TBLTIMEFOMAT, new zr5());
        this.mDinamicEngine.V0(os5.DX_PARSER_TBLVSTRTOMAP, new os5());
        this.mDinamicEngine.V0(jr5.DX_PARSER_TBLVTOARRAY, new jr5());
        this.mDinamicEngine.V0(xr5.DX_PARSER_TBLINDEXOFVALUE, new xr5());
        this.mDinamicEngine.J0(qht.TBLVSYNCTASK, new qht.a());
        this.mDinamicEngine.J0(oir.TBLVIEWPAGERABILITY, new oir.a());
        this.mDinamicEngine.W0(5360605235400031797L, new rg6());
        this.mDinamicEngine.W0(DXTblMtopRefreshEventHandler.DX_EVENT_TBLMTOPREFRESH, new DXTblMtopRefreshEventHandler());
        this.mDinamicEngine.W0(f26.DX_EVENT_LSCROLLEXPOSE, new f26());
        this.mDinamicEngine.W0(h26.DX_EVENT_LTAP, new h26());
        this.mDinamicEngine.W0(rh6.DX_EVENT_TBLVNATIVECALLCHAIN, new rh6());
        this.mDinamicEngine.W0(og6.DX_EVENT_TBLDXNOTIFYNATIVE, new og6());
        this.mDinamicEngine.W0(b26.DX_EVENT_LNEWCHANNELTAP, new b26());
        this.mDinamicEngine.W0(t3z.DX_EVENT_LCHANNELSHOWMAIDIANLIST, new t3z());
        this.mDinamicEngine.M0("TBLCDNRequest", new qhr.b());
        this.mDinamicEngine.M0("tblvSyncTask", new qht.a());
        this.mDinamicEngine.M0("TBLCache", new shr.c());
        this.mDinamicEngine.M0("TBLCallEventChain", new thr.a());
        this.mDinamicEngine.M0("TBLCountdown", new uhr.a());
        this.mDinamicEngine.J0(qhr.TBLCDNREQUEST, new qhr.b());
        this.mDinamicEngine.J0(lir.TBLTLOG, new lir.a());
        this.mDinamicEngine.J0(shr.TBLCACHE, new shr.c());
        this.mDinamicEngine.J0(fir.TBLPOSTMESSAGETOH5, new fir.a());
        this.mDinamicEngine.J0(thr.TBLCALLEVENTCHAIN, new thr.a());
        this.mDinamicEngine.J0(TBLFollowAbility.TBLFOLLOW, new TBLFollowAbility.a());
        this.mDinamicEngine.J0(jir.TBLSUBSCRIBE, new jir.e());
        this.mDinamicEngine.J0(uhr.TBLCOUNTDOWN, new uhr.a());
        this.mDinamicEngine.V0(er5.DX_PARSER_TBLFETCHUSERINFO, new er5());
        this.mDinamicEngine.V0(dr5.DX_PARSER_TBLFETCHTIMESTAMPINFO, new dr5());
        this.mDinamicEngine.V0(cr5.DX_PARSER_TBLFETCHMD5, new cr5());
        this.mDinamicEngine.V0(br5.DX_PARSER_TBLFETCHDEVICEINFO, new br5());
        this.mDinamicEngine.V0(ms5.DX_PARSER_TBLVMAPTOJSON, new ms5());
        this.mDinamicEngine.V0(ls5.DX_PARSER_TBLVJSONTOMAP, new ls5());
        this.mDinamicEngine.V0(ks5.DX_PARSER_TBLVJSONTOARRAY, new ks5());
        this.mDinamicEngine.V0(gs5.DX_PARSER_TBLVARRAYTOJSON, new gs5());
        this.mDinamicEngine.V0(fr5.DX_PARSER_TBLURLENCODE, new fr5());
        this.mDinamicEngine.V0(yq5.DX_PARSER_TBLENCODECHINESE, new yq5());
        this.mDinamicEngine.V0(zq5.DX_PARSER_TBLFETCHBHXBUFSFEATURE, new zq5());
        this.mDinamicEngine.V0(yr5.DX_PARSER_TBLRECYCLERDELETEARRAY, new yr5());
        this.mDinamicEngine.V0(hs5.DX_PARSER_TBLVHANDLEMTOPDATA, new hs5());
        this.mDinamicEngine.V0(6916119436215133091L, new ir5());
        this.mDinamicEngine.V0(-521746365956793992L, new cs5());
        this.mDinamicEngine.V0(js5.DX_PARSER_TBLVINSERTBELOW, new js5());
        c cVar = new c();
        this.mDownloadCallback = cVar;
        this.mDinamicEngine.a1(cVar);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return TAG;
    }

    private void downloadTemplate(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda96292", new Object[]{this, dXTemplateItem});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(dXTemplateItem);
        downloadTemplates(arrayList);
    }

    public void bindData(View view, DinamicDataObject dinamicDataObject) {
        HashMap<String, JSONObject> hashMap;
        DXResult<DXRootView> dXResult;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f6408f", new Object[]{this, view, dinamicDataObject});
        } else if ((view instanceof DXRootView) && dinamicDataObject != null) {
            DXRootView dXRootView = (DXRootView) view;
            dXRootView.setTag(R.id.live_feedback_tag, dinamicDataObject);
            if (this.mDinamicEngine != null && (hashMap = dinamicDataObject.data) != null) {
                JSONObject jSONObject = hashMap.get("data");
                if (jSONObject != null && (i = dinamicDataObject.mPosition) > -1) {
                    jSONObject.put("realPos", (Object) String.valueOf(i));
                }
                if (dinamicDataObject.dxUserContext != null) {
                    dXResult = this.mDinamicEngine.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, dinamicDataObject.mPosition, new DXRenderOptions.b().E(dinamicDataObject.dxUserContext).q());
                } else {
                    dXResult = this.mDinamicEngine.j1(dXRootView, jSONObject);
                }
                if (dXResult.d()) {
                    String str = TAG;
                    r0h.b(str, "templateName=" + dinamicDataObject.templateName + ". bind data error: " + dXResult.a().toString());
                    StringBuilder sb = new StringBuilder("templateName=");
                    sb.append(dinamicDataObject.templateName);
                    m1h.a(m1h.DYNAMIC_X_BIND_DATA, sb.toString(), "", dXResult.a().toString());
                    return;
                }
                m1h.b(m1h.DYNAMIC_X_BIND_DATA, "templateName=" + dinamicDataObject.templateName);
            }
        }
    }

    public void downloadTemplates(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de36e489", new Object[]{this, list});
        } else if (this.mDinamicEngine != null && list != null && !list.isEmpty()) {
            this.mDinamicEngine.p(list);
        }
    }

    public void enableBusinessEnableDesignScale(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5b965b", new Object[]{this, context});
            return;
        }
        DinamicXEngine dinamicXEngine = this.mDinamicEngine;
        if (dinamicXEngine != null && dinamicXEngine.d() != null) {
            if (sj7.w(context) || sj7.s(context)) {
                this.mDinamicEngine.d().b(true, true);
            }
        }
    }

    public DinamicXEngine getDinamicEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("d88dea05", new Object[]{this});
        }
        return this.mDinamicEngine;
    }

    public void inflateView(Context context, DinamicDataObject dinamicDataObject, rzb rzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4abd127e", new Object[]{this, context, dinamicDataObject, rzbVar});
        } else if (context != null && dinamicDataObject != null && rzbVar != null) {
            TemplateObject templateObject = null;
            try {
                LiveHomeController2 liveHomeController2 = this.mLiveHomeController2;
                if (!(liveHomeController2 == null || liveHomeController2.getTemplateCardListOwner() == null)) {
                    templateObject = this.mLiveHomeController2.getTemplateCardListOwner().j(dinamicDataObject.templateName);
                }
            } catch (Exception e) {
                r0h.c(TAG, "inflateView getTemplate exp.", e);
            }
            if (templateObject == null) {
                templateObject = new TemplateObject();
                templateObject.name = dinamicDataObject.templateName;
                templateObject.version4Android = 100000L;
            }
            if (this.mDinamicEngine != null) {
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.c = templateObject.url4Android;
                dXTemplateItem.f7343a = templateObject.name;
                dXTemplateItem.b = templateObject.version4Android;
                DXTemplateItem u = this.mDinamicEngine.u(dXTemplateItem);
                if (u != null) {
                    if (!u.equals(dXTemplateItem)) {
                        m1h.a(m1h.DYNAMIC_X_FETCH, "template=" + dXTemplateItem.toString(), "", "item_not_match");
                        c cVar = this.mDownloadCallback;
                        if (cVar != null) {
                            cVar.a(templateObject.name, new b(dinamicDataObject, context, rzbVar));
                        }
                        downloadTemplate(dXTemplateItem);
                    }
                    m1h.b(m1h.DYNAMIC_X_FETCH, "template=" + dXTemplateItem.toString());
                    DXResult<DXRootView> o = this.mDinamicEngine.o(context, u);
                    if (o.d()) {
                        rzbVar.b();
                        String str = TAG;
                        r0h.b(str, "templateName=" + templateObject.name + "inflate view error: " + o.a());
                        StringBuilder sb = new StringBuilder("template=");
                        sb.append(dXTemplateItem.toString());
                        m1h.a(m1h.DYNAMIC_X_CREATE, sb.toString(), "createViewError", o.a().toString());
                        return;
                    }
                    m1h.b(m1h.DYNAMIC_X_CREATE, "template=" + dXTemplateItem.toString());
                    bindData(o.f7291a, dinamicDataObject);
                    rzbVar.a(o.f7291a);
                    return;
                }
                m1h.a(m1h.DYNAMIC_X_FETCH, "template=" + dXTemplateItem.toString(), "", "item_not_exits");
                c cVar2 = this.mDownloadCallback;
                if (cVar2 != null) {
                    cVar2.a(templateObject.name, new b(dinamicDataObject, context, rzbVar));
                }
                downloadTemplate(dXTemplateItem);
            }
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        DinamicXEngine dinamicXEngine = this.mDinamicEngine;
        if (dinamicXEngine != null) {
            dinamicXEngine.q0();
        }
        c cVar = this.mDownloadCallback;
        if (cVar != null) {
            cVar.b();
        }
        this.mIDinamicRegister = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.DXRootView preCreateDX(android.content.Context r9, java.lang.String r10, tb.rzb r11) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.DinamicSdkManager2.preCreateDX(android.content.Context, java.lang.String, tb.rzb):com.taobao.android.dinamicx.DXRootView");
    }

    public void preLoad(Context context, List<String> list) {
        LiveHomeController2 liveHomeController2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f819489", new Object[]{this, context, list});
        } else if (this.mDinamicEngine != null && context != null && list != null && list.size() > 0 && (liveHomeController2 = this.mLiveHomeController2) != null && liveHomeController2.getTemplateCardListOwner() != null) {
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                TemplateObject j = this.mLiveHomeController2.getTemplateCardListOwner().j(list.get(i));
                if (j == null) {
                    j = new TemplateObject();
                    j.name = list.get(i);
                }
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.c = j.url4Android;
                dXTemplateItem.f7343a = j.name;
                dXTemplateItem.b = j.version4Android;
                arrayList.add(dXTemplateItem);
            }
            this.mDinamicEngine.A0(arrayList);
        }
    }

    public void preRenderTemplate(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d069f58", new Object[]{this, context, str, jSONObject});
        } else if (this.mDinamicEngine != null && context != null && !lrq.a(str)) {
            TemplateObject templateObject = null;
            try {
                LiveHomeController2 liveHomeController2 = this.mLiveHomeController2;
                if (!(liveHomeController2 == null || liveHomeController2.getTemplateCardListOwner() == null)) {
                    templateObject = this.mLiveHomeController2.getTemplateCardListOwner().j(str);
                }
            } catch (Exception e) {
                r0h.c(TAG, "preRenderTemplate getTemplate exp.", e);
            }
            if (templateObject == null) {
                templateObject = new TemplateObject();
                templateObject.name = str;
            }
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.c = templateObject.url4Android;
            dXTemplateItem.f7343a = templateObject.name;
            dXTemplateItem.b = templateObject.version4Android;
            DXTemplateItem u = this.mDinamicEngine.u(dXTemplateItem);
            if (u != null) {
                this.mDinamicEngine.B0(context, u, jSONObject, 0, null);
            }
        }
    }

    public void prefetchTemplate(Context context, String str, DinamicDataObject dinamicDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c795585", new Object[]{this, context, str, dinamicDataObject});
            return;
        }
        LiveHomeController2 liveHomeController2 = this.mLiveHomeController2;
        if (liveHomeController2 != null && liveHomeController2.getTemplateCardListOwner() != null) {
            TemplateObject j = this.mLiveHomeController2.getTemplateCardListOwner().j(str);
            if (j == null) {
                j = new TemplateObject();
                j.name = dinamicDataObject.templateName;
            }
            if (this.mDinamicEngine != null) {
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.c = j.url4Android;
                dXTemplateItem.f7343a = j.name;
                dXTemplateItem.b = j.version4Android;
                this.mDinamicEngine.D0(context, dinamicDataObject.data.get("data"), dXTemplateItem, -1);
            }
        }
    }

    public boolean renderDX(Context context, DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions, yl7 yl7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43fb17db", new Object[]{this, context, dXRootView, jSONObject, dXRenderOptions, yl7Var})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.mDinamicEngine;
        if (dinamicXEngine == null || jSONObject == null) {
            return false;
        }
        DXResult<DXRootView> i1 = dinamicXEngine.i1(context, dXRootView, dXRootView.getDxTemplateItem(), jSONObject, 0, dXRenderOptions);
        if (i1.d()) {
            if (yl7Var != null) {
                yl7Var.b();
            }
            p9m.e("tbLiveHome_dxRender_fail");
            HashMap hashMap = new HashMap();
            if (dXRootView.getDxTemplateItem() != null) {
                hashMap.put(yh6.CONFIG_KEY_TEMPLATE_NAME, dXRootView.getDxTemplateItem().f7343a);
                hashMap.put("version", String.valueOf(dXRootView.getDxTemplateItem().b));
            }
            if (v2s.o().s() != null) {
                v2s.o().s().a("tbLiveHome_dxRender_fail", "Page_TaobaoLive", hashMap);
            }
            m1h.a(m1h.DYNAMIC_X_BIND_DATA, "templateName=" + dXRootView.getDxTemplateItem().f7343a, "", i1.a().toString());
            return false;
        }
        if (yl7Var != null) {
            yl7Var.a();
        }
        m1h.b(m1h.DYNAMIC_X_BIND_DATA, "templateName=" + dXRootView.getDxTemplateItem().f7343a);
        return true;
    }

    public void setDidEndDisplay(View view) {
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981fc067", new Object[]{this, view});
        } else if ((view instanceof DXRootView) && (dinamicXEngine = this.mDinamicEngine) != null) {
            dinamicXEngine.u0((DXRootView) view);
        }
    }

    public void setIDinamicRegister(IDinamicRegister iDinamicRegister) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6242f7f0", new Object[]{this, iDinamicRegister});
            return;
        }
        this.mIDinamicRegister = iDinamicRegister;
        if (iDinamicRegister != null) {
            try {
                iDinamicRegister.onRegister(this.mDinamicEngine);
            } catch (Exception e) {
                r0h.c(TAG, "on register dinamic exp.", e);
            }
        }
    }

    public void setLiveHomeController2(LiveHomeController2 liveHomeController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("915c7400", new Object[]{this, liveHomeController2});
        } else {
            this.mLiveHomeController2 = liveHomeController2;
        }
    }

    public void setWillDisplay(View view) {
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6986ce5d", new Object[]{this, view});
        } else if ((view instanceof DXRootView) && (dinamicXEngine = this.mDinamicEngine) != null) {
            dinamicXEngine.t0((DXRootView) view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.DXRootView createDX(android.content.Context r17, java.lang.String r18, tb.wl7 r19) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.DinamicSdkManager2.createDX(android.content.Context, java.lang.String, tb.wl7):com.taobao.android.dinamicx.DXRootView");
    }

    public void prefetchTemplate(Context context, String str, JSONObject jSONObject) {
        LiveHomeController2 liveHomeController2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387add36", new Object[]{this, context, str, jSONObject});
        } else if (this.mDinamicEngine != null && context != null && !lrq.a(str) && (liveHomeController2 = this.mLiveHomeController2) != null && liveHomeController2.getTemplateCardListOwner() != null) {
            TemplateObject j = this.mLiveHomeController2.getTemplateCardListOwner().j(str);
            if (j == null) {
                j = new TemplateObject();
                j.name = str;
            }
            if (this.mDinamicEngine != null) {
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.c = j.url4Android;
                dXTemplateItem.f7343a = j.name;
                dXTemplateItem.b = j.version4Android;
                this.mDinamicEngine.D0(context, jSONObject, dXTemplateItem, -1);
            }
        }
    }

    public boolean renderDX(DXRootView dXRootView, JSONObject jSONObject, yl7 yl7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c146031", new Object[]{this, dXRootView, jSONObject, yl7Var})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.mDinamicEngine;
        if (dinamicXEngine == null || jSONObject == null) {
            return false;
        }
        DXResult<DXRootView> j1 = dinamicXEngine.j1(dXRootView, jSONObject);
        if (j1.d()) {
            if (yl7Var != null) {
                yl7Var.b();
            }
            m1h.a(m1h.DYNAMIC_X_BIND_DATA, "templateName=" + dXRootView.getDxTemplateItem().f7343a, "", j1.a().toString());
            return false;
        }
        if (yl7Var != null) {
            yl7Var.a();
        }
        m1h.b(m1h.DYNAMIC_X_BIND_DATA, "templateName=" + dXRootView.getDxTemplateItem().f7343a);
        return true;
    }
}
