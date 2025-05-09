package com.taobao.share.ui.engine.weex;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.vessel.VesselView;
import com.ut.share.business.ShareBusiness;
import java.util.Map;
import tb.ask;
import tb.fwr;
import tb.g4w;
import tb.oj8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b implements ask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WebMaskView f11782a;
    public final c b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VesselView f11783a;

        public a(VesselView vesselView) {
            this.f11783a = vesselView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f11783a.removeAllViews();
            WebMaskView webMaskView = new WebMaskView(this.f11783a, b.a(b.this));
            this.f11783a.setOnLoadListener(new b(b.b(b.this), webMaskView, b.a(b.this)));
            webMaskView.setErrorTextVisible(true);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.share.ui.engine.weex.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface AbstractC0665b {
        void onDowngrade();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        AbstractC0665b getDowngradeListener();
    }

    static {
        t2o.a(667942971);
        t2o.a(967835662);
    }

    public b(c cVar, WebMaskView webMaskView, String str) {
        this.b = cVar;
        this.f11782a = webMaskView;
        this.c = str;
    }

    public static /* synthetic */ String a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4cd1acb", new Object[]{bVar});
        }
        return bVar.c;
    }

    public static /* synthetic */ c b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7a8066ce", new Object[]{bVar});
        }
        return bVar.b;
    }

    @Override // tb.ask
    public void onDowngrade(g4w g4wVar, Map<String, Object> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36618407", new Object[]{this, g4wVar, map});
            return;
        }
        StringBuilder sb = new StringBuilder("errorMsg=");
        String str2 = "";
        if (g4wVar != null) {
            str = g4wVar.b;
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(",map=");
        sb.append(map);
        TBS.Ext.commitEvent("Page_Share", 19999, "WeexPanelDowngrade", null, null, sb.toString());
        StringBuilder sb2 = new StringBuilder("onDowngrade:");
        if (g4wVar != null) {
            str2 = g4wVar.b;
        }
        sb2.append(str2);
        fwr.b("WeexSharePanel", sb2.toString());
        try {
            c cVar = this.b;
            if (cVar != null && cVar.getDowngradeListener() != null) {
                this.b.getDowngradeListener().onDowngrade();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            fwr.b("WeexSharePanel", "onDowngrade err:" + th.getMessage());
        }
    }

    @Override // tb.ask
    public void onLoadError(g4w g4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365c1211", new Object[]{this, g4wVar});
            return;
        }
        fwr.b("WeexSharePanel", "onLoadError");
        WebMaskView webMaskView = this.f11782a;
        if (webMaskView != null) {
            VesselView vesselView = webMaskView.getVesselView();
            vesselView.post(new a(vesselView));
        }
    }

    @Override // tb.ask
    public void onLoadFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
            return;
        }
        ShareBusiness.sShareUTArgs.put(ShareBusiness.WEEX_RENDER_END_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
        oj8.d().b();
        fwr.b("TIMECOST", "weex_render_end: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime));
        WebMaskView webMaskView = this.f11782a;
        if (webMaskView != null) {
            webMaskView.finish();
            this.f11782a.getVesselView().removeView(this.f11782a);
        }
    }

    @Override // tb.ask
    public void onLoadStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f829aa04", new Object[]{this});
        } else {
            ShareBusiness.sShareUTArgs.put(ShareBusiness.WEEX_RENDER_START_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
        }
    }
}
