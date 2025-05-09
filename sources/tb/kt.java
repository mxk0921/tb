package tb;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class kt implements lcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f22897a;
    public hbb b;
    public AURAFlowData c;

    static {
        t2o.a(80740546);
        t2o.a(80740551);
    }

    @Override // tb.kcb
    public void E(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df0d417", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        }
    }

    @Override // tb.kcb
    public void N(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3c8047", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        }
    }

    @Override // tb.lcb
    public void l0(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52be7df", new Object[]{this, aURARenderComponentContainer, viewGroup, view, new Integer(i)});
        }
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f22897a = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.c = aURAFlowData;
        this.b = hbbVar;
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public AURAFlowData r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAFlowData) ipChange.ipc$dispatch("7ff539a0", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.lcb
    public void u(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("359fa8fc", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        }
    }

    public lo x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("fc4bf91a", new Object[]{this});
        }
        return this.f22897a;
    }
}
