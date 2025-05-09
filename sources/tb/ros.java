package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.TTVesselWeexViewDecorator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ros implements ask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TTVesselWeexViewDecorator f27516a;

    public ros(TTVesselWeexViewDecorator tTVesselWeexViewDecorator) {
        this.f27516a = tTVesselWeexViewDecorator;
    }

    @Override // tb.ask
    public void onDowngrade(g4w g4wVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36618407", new Object[]{this, g4wVar, map});
            return;
        }
        TTVesselWeexViewDecorator.c(this.f27516a);
        TTVesselWeexViewDecorator tTVesselWeexViewDecorator = this.f27516a;
        TTVesselWeexViewDecorator.f(tTVesselWeexViewDecorator, TTVesselWeexViewDecorator.d(tTVesselWeexViewDecorator), TTVesselWeexViewDecorator.e(this.f27516a), g4wVar.f19727a, g4wVar.b, map);
    }

    @Override // tb.ask
    public void onLoadError(g4w g4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365c1211", new Object[]{this, g4wVar});
            return;
        }
        TTVesselWeexViewDecorator.c(this.f27516a);
        TTVesselWeexViewDecorator tTVesselWeexViewDecorator = this.f27516a;
        TTVesselWeexViewDecorator.f(tTVesselWeexViewDecorator, TTVesselWeexViewDecorator.d(tTVesselWeexViewDecorator), TTVesselWeexViewDecorator.e(this.f27516a), g4wVar.f19727a, g4wVar.b, null);
    }

    @Override // tb.ask
    public void onLoadFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
        } else {
            TTVesselWeexViewDecorator.c(this.f27516a);
        }
    }

    @Override // tb.ask
    public void onLoadStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f829aa04", new Object[]{this});
        }
    }
}
