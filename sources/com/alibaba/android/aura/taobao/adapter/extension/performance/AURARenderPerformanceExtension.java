package com.alibaba.android.aura.taobao.adapter.extension.performance;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.cc5;
import tb.ck;
import tb.gcb;
import tb.hbb;
import tb.lo;
import tb.pm;
import tb.t2o;
import tb.th;
import tb.ucb;
import tb.yi;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.performance.render")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AURARenderPerformanceExtension implements ucb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public yi f2161a;

    static {
        t2o.a(81789178);
        t2o.a(80740554);
    }

    @Override // tb.ucb
    public void A0(AURAInputData<AURARenderIO> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc63fa5", new Object[]{this, aURAInputData});
            return;
        }
        for (gcb gcbVar : this.f2161a.f(gcb.class)) {
            gcbVar.f0("aura.stage.render.stable", "渲染稳定耗时", pm.RENDER_SERVICE_CODE);
        }
    }

    @Override // tb.ucb
    public void J(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400d63ee", new Object[]{this, aURARenderComponent});
        }
    }

    @Override // tb.ucb
    public void T(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e45c337b", new Object[]{this, list});
        }
    }

    @Override // tb.ucb
    public void W(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8a1e19", new Object[]{this, view});
        }
    }

    @Override // tb.ucb
    public void e0(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfd1a66", new Object[]{this, aURARenderComponent});
        }
    }

    @Override // tb.ncb
    public RecyclerView getContainerView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("6abd24f8", new Object[]{this, context});
        }
        return null;
    }

    @Override // tb.ncb
    public void onContentViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1c2042", new Object[]{this, view});
        }
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f2161a = yiVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.ucb
    public void z(View view, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5665e601", new Object[]{this, view, state});
            return;
        }
        List<gcb> f = this.f2161a.f(gcb.class);
        if (th.c()) {
            Log.e("PERFORMANCE", "onLayoutComplete ++ " + System.currentTimeMillis());
        }
        AURATraceUtil.a(1, "aura-render-complete");
        AURATraceUtil.b(1);
        ck.g().e("渲染稳定", ck.b.b().i("AURA/performance").d("time", System.currentTimeMillis()).a());
        for (gcb gcbVar : f) {
            gcbVar.U("aura.stage.render.stable", pm.RENDER_SERVICE_CODE, false, new HashMap<String, String>() { // from class: com.alibaba.android.aura.taobao.adapter.extension.performance.AURARenderPerformanceExtension.1
                {
                    put(cc5.DELAY_MILLIS, "500");
                }
            });
        }
    }
}
