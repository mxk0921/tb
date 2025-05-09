package tb;

import android.view.View;
import com.alibaba.android.ultron.vfw.web.WebMaskView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.VesselView;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lzw implements ask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WebMaskView f23679a;
    public final String b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VesselView f23680a;

        public a(VesselView vesselView) {
            this.f23680a = vesselView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f23680a.removeAllViews();
            WebMaskView webMaskView = new WebMaskView(this.f23680a, lzw.a(lzw.this));
            this.f23680a.setOnLoadListener(new lzw(webMaskView, lzw.a(lzw.this), lzw.b(lzw.this)));
            webMaskView.setErrorTextVisible(true);
        }
    }

    static {
        t2o.a(157286765);
        t2o.a(967835662);
    }

    public lzw(WebMaskView webMaskView, String str, String str2) {
        this.f23679a = webMaskView;
        this.b = str;
        this.c = str2;
    }

    public static /* synthetic */ String a(lzw lzwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31e16cab", new Object[]{lzwVar});
        }
        return lzwVar.b;
    }

    public static /* synthetic */ String b(lzw lzwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73f89a0a", new Object[]{lzwVar});
        }
        return lzwVar.c;
    }

    @Override // tb.ask
    public void onDowngrade(g4w g4wVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36618407", new Object[]{this, g4wVar, map});
        }
    }

    @Override // tb.ask
    public void onLoadError(g4w g4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365c1211", new Object[]{this, g4wVar});
            return;
        }
        WebMaskView webMaskView = this.f23679a;
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
        WebMaskView webMaskView = this.f23679a;
        if (webMaskView != null) {
            webMaskView.finish();
            this.f23679a.getVesselView().removeView(this.f23679a);
        }
    }

    @Override // tb.ask
    public void onLoadStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f829aa04", new Object[]{this});
            return;
        }
        WebMaskView webMaskView = this.f23679a;
        if (webMaskView != null) {
            webMaskView.bringToFront();
            this.f23679a.startLoading();
        }
    }
}
