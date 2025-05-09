package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class et implements vbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f18799a;
    public AURAGlobalData b;
    public AURAFlowData c;
    public yi d;
    public hbb e;

    static {
        t2o.a(80740474);
        t2o.a(80740476);
    }

    public AURAGlobalData B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("3078f400", new Object[]{this});
        }
        return this.b;
    }

    public lo L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("fc4bf91a", new Object[]{this});
        }
        return this.f18799a;
    }

    @Override // tb.vbb
    public void Q(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0f0ad2", new Object[]{this, aURANextRPCEndpoint});
        }
    }

    @Override // tb.vbb
    public void S(kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de231dc7", new Object[]{this, kkVar});
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.vbb
    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return null;
    }

    @Override // tb.vbb
    public void j0(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501f871f", new Object[]{this, aURANextRPCEndpoint});
        }
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        this.f18799a = loVar;
        this.d = yiVar;
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.c = aURAFlowData;
        this.b = aURAGlobalData;
        this.e = hbbVar;
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public yi r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yi) ipChange.ipc$dispatch("369fbe0", new Object[]{this});
        }
        return this.d;
    }

    public AURAFlowData x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAFlowData) ipChange.ipc$dispatch("7ff539a0", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.vbb
    public Map<String, String> y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("42c19ec2", new Object[]{this});
        }
        return null;
    }
}
