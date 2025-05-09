package tb;

import android.app.Activity;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ioq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hqk f21483a;
    public final joq b;
    public final Map<String, qsd> c = new HashMap();
    public h7p d;
    public final wcc e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements hqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.ioq$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0949a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0949a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ioq.a(ioq.this).d();
                bqa.d("StraightSecondFloorController", "请求回来了");
            }
        }

        public a() {
        }

        @Override // tb.hqk
        public void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a114a6e", new Object[]{this, jSONObject, iContainerDataModel, str});
            } else {
                m5a.a().i(new RunnableC0949a());
            }
        }

        @Override // tb.hqk
        public void b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c0a53b0", new Object[]{this, jSONObject, str});
            }
        }
    }

    static {
        t2o.a(729810298);
    }

    public ioq(View view, wcc wccVar, Activity activity, IPullDownService.a aVar) {
        this.e = wccVar;
        joq joqVar = new joq(view, wccVar, activity);
        this.b = joqVar;
        g();
        d(wccVar, joqVar, aVar, activity);
    }

    public static /* synthetic */ joq a(ioq ioqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (joq) ipChange.ipc$dispatch("9976fdd0", new Object[]{ioqVar});
        }
        return ioqVar.b;
    }

    public final hqk b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hqk) ipChange.ipc$dispatch("656f8d08", new Object[]{this});
        }
        return new a();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.b.i();
        i();
        ((HashMap) this.c).clear();
        bqa.d("StraightSecondFloorController", "destroy");
    }

    public final void d(wcc wccVar, joq joqVar, IPullDownService.a aVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc882f5", new Object[]{this, wccVar, joqVar, aVar, activity});
            return;
        }
        phq phqVar = new phq(joqVar, wccVar);
        xtm xtmVar = new xtm(joqVar, activity);
        lhq lhqVar = new lhq(activity, wccVar);
        j7p j7pVar = new j7p(activity, joqVar, wccVar, aVar);
        vkg vkgVar = new vkg(activity, wccVar, aVar);
        qnq qnqVar = new qnq(joqVar, wccVar);
        ((HashMap) this.c).put("startPull", phqVar);
        ((HashMap) this.c).put("prepareToSecondFloor", xtmVar);
        ((HashMap) this.c).put("startEnterSecondFloor", lhqVar);
        ((HashMap) this.c).put("secondFloorEnd", j7pVar);
        ((HashMap) this.c).put("backToHome", vkgVar);
        ((HashMap) this.c).put("staticState", qnqVar);
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
        } else {
            this.b.o(i);
        }
    }

    public void f(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
            return;
        }
        bqa.d("StraightSecondFloorController", "onRefreshStateChanged oldState: " + refreshState + ", newState: " + refreshState2);
        if (((HashMap) this.c).isEmpty()) {
            bqa.d("StraightSecondFloorController", "onRefreshStateChanged mStatusProcessorMap == null");
        } else if (this.d == null) {
            bqa.d("StraightSecondFloorController", "onRefreshStateChanged mSecondFloorConfig == null");
        } else {
            for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                qsd qsdVar = (qsd) entry.getValue();
                if (qsdVar.b(refreshState, refreshState2)) {
                    qsdVar.a(this.d);
                }
            }
        }
    }

    public final void g() {
        IHomeDataService iHomeDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d81fc91d", new Object[]{this});
            return;
        }
        wcc wccVar = this.e;
        if (wccVar != null && (iHomeDataService = (IHomeDataService) wccVar.a(IHomeDataService.class)) != null) {
            hqk b = b();
            this.f21483a = b;
            iHomeDataService.addDataProcessListener(b);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d70e81", new Object[]{this});
        } else if (this.d == null) {
            bqa.d("StraightSecondFloorController", "secondBackHome mSecondFloorConfig == null");
        } else {
            qsd qsdVar = (qsd) ((HashMap) this.c).get("backToHome");
            if (qsdVar != null) {
                qsdVar.a(this.d);
            }
        }
    }

    public final void i() {
        IHomeDataService iHomeDataService;
        hqk hqkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435b1f44", new Object[]{this});
            return;
        }
        wcc wccVar = this.e;
        if (wccVar != null && (iHomeDataService = (IHomeDataService) wccVar.a(IHomeDataService.class)) != null && (hqkVar = this.f21483a) != null) {
            iHomeDataService.removeDataProcessListener(hqkVar);
        }
    }

    public void j(h7p h7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec0913f", new Object[]{this, h7pVar});
            return;
        }
        this.d = h7pVar;
        bqa.d("StraightSecondFloorController", "更新配置");
    }
}
