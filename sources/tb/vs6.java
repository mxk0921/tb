package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.service.lifecycle.EngineState;
import com.taobao.android.turbo.service.data.DataService;
import java.util.Map;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class vs6 implements o2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DataService f30218a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ j7j c;

    public vs6(DataService dataService, Map map, j7j j7jVar) {
        this.f30218a = dataService;
        this.b = map;
        this.c = j7jVar;
    }

    @Override // tb.o2c
    public void onReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1a118b", new Object[]{this});
        }
    }

    @Override // tb.o2c
    public void onStateChanged(EngineState engineState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66a0b34", new Object[]{this, engineState});
            return;
        }
        ckf.g(engineState, "state");
        if (engineState == EngineState.VISIBLE) {
            tpu.a.b(tpu.Companion, "DataService", "engine lifecycle is VISIBLE, updatePageData", null, 4, null);
            DataService.N1(this.f30218a, this.b, this.c);
        }
    }
}
