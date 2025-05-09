package com.taobao.live.home.dinamic.sdk;

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
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.dinamic.ability.TBLFollowAbility;
import com.taobao.live.home.dinamic.event.DXTblMtopRefreshEventHandler;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tb.ae6;
import tb.arq;
import tb.bs5;
import tb.cr5;
import tb.dr5;
import tb.er5;
import tb.f26;
import tb.fir;
import tb.fr5;
import tb.gs5;
import tb.h26;
import tb.hr5;
import tb.hs5;
import tb.ie6;
import tb.iwb;
import tb.jir;
import tb.jr5;
import tb.k66;
import tb.ks5;
import tb.lir;
import tb.ls5;
import tb.m1h;
import tb.me6;
import tb.ms5;
import tb.oir;
import tb.os5;
import tb.qhr;
import tb.qht;
import tb.qyg;
import tb.r0h;
import tb.ra6;
import tb.re6;
import tb.rg6;
import tb.rzb;
import tb.t2o;
import tb.te6;
import tb.thr;
import tb.uhr;
import tb.vd6;
import tb.xr5;
import tb.yq5;
import tb.yr5;
import tb.zq5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DinamicSdkManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = DinamicSdkManager.class.getSimpleName();
    private static final int mMaxTemplateVersion = 100000;
    private DinamicXEngine mDinamicEngine;
    private c mDownloadCallback;
    private IDinamicRegister mIDinamicRegister;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface IDinamicRegister extends Serializable {
        void onRegister(DinamicXEngine dinamicXEngine);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements ra6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(DinamicSdkManager dinamicSdkManager) {
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final DinamicDataObject f10957a;
        public final Context b;
        public final rzb c;

        static {
            t2o.a(806355446);
        }

        public b(DinamicDataObject dinamicDataObject, Context context, rzb rzbVar) {
            this.f10957a = dinamicDataObject;
            this.b = context;
            this.c = rzbVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ConcurrentHashMap<String, ArrayList<b>> f10958a = new ConcurrentHashMap<>();

        static {
            t2o.a(806355448);
            t2o.a(444596939);
        }

        public c() {
        }

        public void a(String str, b bVar) {
            ConcurrentHashMap<String, ArrayList<b>> concurrentHashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbad425b", new Object[]{this, str, bVar});
            } else if (!arq.a(str) && bVar != null && (concurrentHashMap = this.f10958a) != null) {
                ArrayList<b> arrayList = concurrentHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f10958a.put(str, arrayList);
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
            ConcurrentHashMap<String, ArrayList<b>> concurrentHashMap = this.f10958a;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            this.f10958a = null;
        }

        public final void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6173380d", new Object[]{this, str});
            } else if (this.f10958a != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList<b> arrayList2 = this.f10958a.get(str);
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                if (arrayList.size() > 0) {
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            b bVar = (b) it.next();
                            if (bVar != null) {
                                DinamicSdkManager.this.inflateView(bVar.b, bVar.f10957a, bVar.c);
                            }
                        }
                    } catch (Exception e) {
                        r0h.c(DinamicSdkManager.access$000(), "Dinamic download callback.", e);
                    }
                    this.f10958a.remove(str);
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
                    r0h.c(DinamicSdkManager.access$000(), "TBLiveTemplateDownloadCallback.onNotificationListener", e);
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
                        r0h.c(DinamicSdkManager.access$000(), "TBLiveTemplateDownloadCallback.onNotificationListener", e2);
                    }
                }
            }
        }
    }

    static {
        t2o.a(806355444);
    }

    public DinamicSdkManager(String str, int i, String str2) {
        DinamicXEngine dinamicXEngine = new DinamicXEngine(new DXEngineConfig.b(str).X(i).Y(str2).H(true, true).F());
        this.mDinamicEngine = dinamicXEngine;
        dinamicXEngine.T0(new a(this));
        this.mDinamicEngine.e1(me6.DXTBLSLIDERLAYOUT_TBLSLIDERLAYOUT, new me6.a());
        this.mDinamicEngine.e1(vd6.DXTBLAUTOSCROLLSCROLLERLAYOUT_TBLAUTOSCROLLSCROLLERLAYOUT, new vd6.a());
        this.mDinamicEngine.e1(ie6.DXTBLLONGTEXTVIEW_TBLLONGTEXTVIEW, new ie6.a());
        this.mDinamicEngine.e1(vd6.DXTBLAUTOSCROLLSCROLLERLAYOUT_TBLAUTOSCROLLSCROLLERLAYOUT, new vd6.a());
        this.mDinamicEngine.e1(ae6.DXTBLFRAMELAYOUT_TBLFRAMELAYOUT, new ae6.a());
        this.mDinamicEngine.e1(re6.DXTBLVWEBVIEW_TBLVWEBVIEW, new re6.c());
        this.mDinamicEngine.e1(te6.DXTBLIVEVIEWPAGER_TBLIVEVIEWPAGER, new te6.a());
        this.mDinamicEngine.V0(os5.DX_PARSER_TBLVSTRTOMAP, new os5());
        this.mDinamicEngine.V0(jr5.DX_PARSER_TBLVTOARRAY, new jr5());
        this.mDinamicEngine.V0(xr5.DX_PARSER_TBLINDEXOFVALUE, new xr5());
        this.mDinamicEngine.W0(5360605235400031797L, new rg6());
        this.mDinamicEngine.W0(DXTblMtopRefreshEventHandler.DX_EVENT_TBLMTOPREFRESH, new DXTblMtopRefreshEventHandler());
        this.mDinamicEngine.W0(f26.DX_EVENT_LSCROLLEXPOSE, new f26());
        this.mDinamicEngine.W0(h26.DX_EVENT_LTAP, new h26());
        this.mDinamicEngine.M0("TBLCDNRequest", new qhr.b());
        this.mDinamicEngine.M0("tblvSyncTask", new qht.a());
        this.mDinamicEngine.M0("TBLCallEventChain", new thr.a());
        this.mDinamicEngine.M0("TBLCountdown", new uhr.a());
        this.mDinamicEngine.J0(qhr.TBLCDNREQUEST, new qhr.b());
        this.mDinamicEngine.J0(lir.TBLTLOG, new lir.a());
        this.mDinamicEngine.J0(fir.TBLPOSTMESSAGETOH5, new fir.a());
        this.mDinamicEngine.J0(thr.TBLCALLEVENTCHAIN, new thr.a());
        this.mDinamicEngine.J0(TBLFollowAbility.TBLFOLLOW, new TBLFollowAbility.a());
        this.mDinamicEngine.J0(jir.TBLSUBSCRIBE, new jir.e());
        this.mDinamicEngine.J0(uhr.TBLCOUNTDOWN, new uhr.a());
        this.mDinamicEngine.J0(qht.TBLVSYNCTASK, new qht.a());
        this.mDinamicEngine.J0(oir.TBLVIEWPAGERABILITY, new oir.a());
        this.mDinamicEngine.V0(er5.DX_PARSER_TBLFETCHUSERINFO, new er5());
        this.mDinamicEngine.V0(dr5.DX_PARSER_TBLFETCHTIMESTAMPINFO, new dr5());
        this.mDinamicEngine.V0(cr5.DX_PARSER_TBLFETCHMD5, new cr5());
        this.mDinamicEngine.V0(ms5.DX_PARSER_TBLVMAPTOJSON, new ms5());
        this.mDinamicEngine.V0(ls5.DX_PARSER_TBLVJSONTOMAP, new ls5());
        this.mDinamicEngine.V0(ks5.DX_PARSER_TBLVJSONTOARRAY, new ks5());
        this.mDinamicEngine.V0(gs5.DX_PARSER_TBLVARRAYTOJSON, new gs5());
        this.mDinamicEngine.V0(fr5.DX_PARSER_TBLURLENCODE, new fr5());
        this.mDinamicEngine.V0(yq5.DX_PARSER_TBLENCODECHINESE, new yq5());
        this.mDinamicEngine.V0(zq5.DX_PARSER_TBLFETCHBHXBUFSFEATURE, new zq5());
        this.mDinamicEngine.V0(yr5.DX_PARSER_TBLRECYCLERDELETEARRAY, new yr5());
        this.mDinamicEngine.V0(hs5.DX_PARSER_TBLVHANDLEMTOPDATA, new hs5());
        this.mDinamicEngine.V0(6916119436215133091L, new hr5());
        this.mDinamicEngine.V0(-521746365956793992L, new bs5());
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6a8f81", new Object[]{this, view, dinamicDataObject});
        } else if ((view instanceof DXRootView) && dinamicDataObject != null) {
            DXRootView dXRootView = (DXRootView) view;
            dXRootView.setTag(R.id.live_feedback_tag, dinamicDataObject);
            DinamicXEngine dinamicXEngine = this.mDinamicEngine;
            if (dinamicXEngine != null && (hashMap = dinamicDataObject.data) != null) {
                DXResult<DXRootView> j1 = dinamicXEngine.j1(dXRootView, hashMap.get("data"));
                if (j1.d()) {
                    String str = TAG;
                    r0h.b(str, "templateName=" + dinamicDataObject.templateName + ". bind data error: " + j1.a().toString());
                    StringBuilder sb = new StringBuilder("templateName=");
                    sb.append(dinamicDataObject.templateName);
                    m1h.a(m1h.DYNAMIC_X_BIND_DATA, sb.toString(), "", j1.a().toString());
                    return;
                }
                m1h.b(m1h.DYNAMIC_X_BIND_DATA, "templateName=" + dinamicDataObject.templateName);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.DXRootView createDX(android.content.Context r9, java.lang.String r10, tb.rzb r11) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.home.dinamic.sdk.DinamicSdkManager.createDX(android.content.Context, java.lang.String, tb.rzb):com.taobao.android.dinamicx.DXRootView");
    }

    public void downloadTemplates(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de36e489", new Object[]{this, list});
        } else if (this.mDinamicEngine != null && list != null && !list.isEmpty()) {
            this.mDinamicEngine.p(list);
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
            ipChange.ipc$dispatch("40d6b4f0", new Object[]{this, context, dinamicDataObject, rzbVar});
        } else if (context != null && dinamicDataObject != null && rzbVar != null) {
            TemplateObject templateObject = null;
            try {
                if (LiveHomeController.instance().getTemplateCardListOwner() != null) {
                    templateObject = LiveHomeController.instance().getTemplateCardListOwner().j(dinamicDataObject.templateName);
                }
            } catch (Exception e) {
                r0h.c(TAG, "inflateView getTemplate exp.", e);
            }
            if (templateObject == null) {
                templateObject = new TemplateObject();
                templateObject.name = dinamicDataObject.templateName;
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

    public void prefetchTemplate(Context context, String str, DinamicDataObject dinamicDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e643a877", new Object[]{this, context, str, dinamicDataObject});
        } else if (LiveHomeController.instance().getTemplateCardListOwner() != null) {
            TemplateObject j = LiveHomeController.instance().getTemplateCardListOwner().j(str);
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

    public boolean renderDX(Context context, DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bbcbf2c", new Object[]{this, context, dXRootView, jSONObject, dXRenderOptions})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.mDinamicEngine;
        if (dinamicXEngine == null || jSONObject == null) {
            return false;
        }
        DXResult<DXRootView> i1 = dinamicXEngine.i1(context, dXRootView, dXRootView.getDxTemplateItem(), jSONObject, 0, dXRenderOptions);
        if (i1.d()) {
            m1h.a(m1h.DYNAMIC_X_BIND_DATA, "templateName=" + dXRootView.getDxTemplateItem().f7343a, "", i1.a().toString());
            return false;
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
            ipChange.ipc$dispatch("b69af6cf", new Object[]{this, iDinamicRegister});
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

    public void setNeedParse(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f128510", new Object[]{this, view});
        } else if ((view instanceof DXRootView) && this.mDinamicEngine != null) {
            DXRootView dXRootView = (DXRootView) view;
            if (dXRootView.getFlattenWidgetNode() != null) {
                dXRootView.getFlattenWidgetNode().setNeedParse();
            }
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

    public boolean renderDX(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e594c82", new Object[]{this, dXRootView, jSONObject})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.mDinamicEngine;
        if (dinamicXEngine == null || jSONObject == null) {
            return false;
        }
        DXResult<DXRootView> j1 = dinamicXEngine.j1(dXRootView, jSONObject);
        if (j1.d()) {
            m1h.a(m1h.DYNAMIC_X_BIND_DATA, "templateName=" + dXRootView.getDxTemplateItem().f7343a, "", j1.a().toString());
            return false;
        }
        m1h.b(m1h.DYNAMIC_X_BIND_DATA, "templateName=" + dXRootView.getDxTemplateItem().f7343a);
        return true;
    }
}
