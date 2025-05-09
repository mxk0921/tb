package tb;

import com.alibaba.android.aura.AURAAliBuyCorePluginCenter;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.popupWindow.ext")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class kn0 implements hcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f22774a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends so0 {
        public a(kn0 kn0Var) {
        }
    }

    static {
        t2o.a(301989944);
        t2o.a(81789202);
    }

    @Override // tb.hcb
    public String E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af1569a1", new Object[]{this});
        }
        return null;
    }

    @Override // tb.hcb
    public IAURAPluginCenter[] I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAURAPluginCenter[]) ipChange.ipc$dispatch("d15e88bb", new Object[]{this});
        }
        IAURAPluginCenter[] d = ((so0) this.f22774a.h("aliBuyWorkFlowConfig", so0.class, new a(this))).d();
        if (d == null || d.length == 0) {
            return new IAURAPluginCenter[]{new AURAAliBuyCorePluginCenter()};
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AURAAliBuyCorePluginCenter());
        arrayList.addAll(Arrays.asList(d));
        IAURAPluginCenter[] iAURAPluginCenterArr = new IAURAPluginCenter[arrayList.size()];
        arrayList.toArray(iAURAPluginCenterArr);
        return iAURAPluginCenterArr;
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f22774a = loVar;
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

    @Override // tb.hcb
    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11a6d5ba", new Object[]{this});
        }
        return null;
    }

    @Override // tb.hcb
    public List<IAURAInputField> u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f7e946f9", new Object[]{this});
        }
        return null;
    }

    @Override // tb.hcb
    public lo v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("6246e0c0", new Object[]{this});
        }
        return new lo(this.f22774a.f(), this.f22774a.i());
    }
}
