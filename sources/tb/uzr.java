package tb;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbwaitpay.impl.render.recyclerView.provider")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class uzr implements ucb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USER_CONTEXT_CONTAINER = "userContextContainer";

    /* renamed from: a  reason: collision with root package name */
    public lo f29704a;

    static {
        t2o.a(725614615);
        t2o.a(80740554);
    }

    @Override // tb.ucb
    public void A0(AURAInputData<AURARenderIO> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc63fa5", new Object[]{this, aURAInputData});
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
        return r();
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
            this.f29704a = loVar;
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

    public final RecyclerView r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("41e52079", new Object[]{this});
        }
        lo loVar = this.f29704a;
        if (loVar == null) {
            return null;
        }
        return (RecyclerView) loVar.g(USER_CONTEXT_CONTAINER, RecyclerView.class);
    }

    @Override // tb.ucb
    public void z(View view, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5665e601", new Object[]{this, view, state});
        }
    }
}
