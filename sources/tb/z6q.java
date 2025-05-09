package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartLayerStage;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.liveinteract.SmartLayerLiveInteractTemplateProcessor;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.liveinteract.SmartLiveInteractViewModel;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.recommend.SmartLayerRecommendPopTemplateProcessor;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.recommend.SmartRecommendPopViewModel;
import java.util.HashMap;
import tb.g6q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class z6q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SmartLayerTemplatePluginManager";
    public static volatile z6q b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, g6q> f32575a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements g6q.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(z6q z6qVar) {
        }

        public boolean a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6e23491a", new Object[]{this, context})).booleanValue();
            }
            if (vc.h(context) || vc.f(context)) {
                return false;
            }
            return true;
        }
    }

    static {
        t2o.a(295699782);
    }

    public static z6q a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6q) ipChange.ipc$dispatch("43b7f631", new Object[0]);
        }
        if (b == null) {
            synchronized (z6q.class) {
                try {
                    if (b == null) {
                        b = new z6q();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bee54ed5", new Object[]{this});
            return;
        }
        g6q g6qVar = new g6q();
        g6qVar.c = "LiveInteract";
        g6qVar.d = "PopLayer";
        g6qVar.i = SmartLiveInteractViewModel.class;
        g6qVar.j = SmartLayerLiveInteractTemplateProcessor.class;
        c(g6qVar);
        if (lvs.b()) {
            g6q g6qVar2 = new g6q();
            g6qVar2.c = "LiveRecommendPop";
            g6qVar2.d = "BottomLayer";
            g6qVar2.i = SmartRecommendPopViewModel.class;
            g6qVar2.j = SmartLayerRecommendPopTemplateProcessor.class;
            g6qVar2.e = "recommend_pop";
            g6qVar2.f = new a(this);
            c(g6qVar2);
        }
    }

    public void c(g6q g6qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e8ef67", new Object[]{this, g6qVar});
        } else if (g6qVar == null) {
            p6q.b(SmartLayerConstant$SmartLayerStage.SMART_INIT, TAG, "config为空");
        } else if (!g6qVar.e()) {
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_INIT, g6qVar, TAG, "config无效");
        } else {
            p6q.d(SmartLayerConstant$SmartLayerStage.SMART_INIT, g6qVar, TAG, "模板注册成功");
            this.f32575a.put(g6qVar.c, g6qVar);
        }
    }
}
