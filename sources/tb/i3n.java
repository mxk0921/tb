package tb;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.pub_kit.guide.model.PubAuthConfigModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;
import tb.y2n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class i3n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final i3n INSTANCE = new i3n();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<BridgeCallback, String> f21073a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements y2n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f21074a;
        public final /* synthetic */ bbs b;
        public final /* synthetic */ String c;

        public a(BridgeCallback bridgeCallback, bbs bbsVar, String str) {
            this.f21074a = bridgeCallback;
            this.b = bbsVar;
            this.c = str;
        }

        @Override // tb.y2n.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            PubAuthConfigModel pubAuthConfigModel;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                return;
            }
            if (pubUserGuideModule == null) {
                pubAuthConfigModel = null;
            } else {
                pubAuthConfigModel = pubUserGuideModule.getAuthConfig();
            }
            if (pubAuthConfigModel == null) {
                this.f21074a.sendBridgeResponse(BridgeResponse.SUCCESS);
                i3n.a(i3n.INSTANCE, this.b, this.c);
                return;
            }
            List<String> apiBlackList = pubAuthConfigModel.getApiBlackList();
            if (apiBlackList == null || !apiBlackList.contains(this.c)) {
                this.f21074a.sendBridgeResponse(BridgeResponse.SUCCESS);
                i3n.a(i3n.INSTANCE, this.b, this.c);
                return;
            }
            this.f21074a.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        }
    }

    static {
        t2o.a(832569346);
    }

    public static final /* synthetic */ void a(i3n i3nVar, bbs bbsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b057a85", new Object[]{i3nVar, bbsVar, str});
        } else {
            i3nVar.b(bbsVar, str);
        }
    }

    @JvmStatic
    public static final void c(bbs bbsVar, BridgeCallback bridgeCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e6a3ac", new Object[]{bbsVar, bridgeCallback, str});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(bridgeCallback, "callback");
        ckf.g(str, "apiName");
        fbs.c(bbsVar, new a(bridgeCallback, bbsVar, str));
    }

    @JvmStatic
    public static final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
        } else {
            f21073a.clear();
        }
    }

    public final void b(bbs bbsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("284450d4", new Object[]{this, bbsVar, str});
            return;
        }
        if (bbsVar.g(o2n.class) == null) {
            bbsVar.k(o2n.class, new o2n());
        }
        o2n o2nVar = (o2n) bbsVar.g(o2n.class);
        if (o2nVar != null) {
            o2nVar.a(str);
        }
    }
}
