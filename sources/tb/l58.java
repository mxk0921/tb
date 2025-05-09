package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import com.taobao.oversea.homepage.dynamictab.service.DynamicSceneService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class l58 implements vkd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f23118a;
    public a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    public l58(cfc cfcVar) {
        this.f23118a = cfcVar;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971c3f18", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // tb.vkd
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        IRocketSubService iRocketSubService = (IRocketSubService) this.f23118a.a(IRocketSubService.class);
        if (iRocketSubService == null) {
            return false;
        }
        return iRocketSubService.isOnRocketState();
    }

    @Override // tb.vkd
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
        } else {
            ((DynamicSceneService.a) this.b).a();
        }
    }
}
