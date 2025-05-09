package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.Global;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.parse.stateTree.ccrc")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class em0 extends gt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CcrcBHService c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UltronProtocol f18670a;

        public a(UltronProtocol ultronProtocol) {
            this.f18670a = ultronProtocol;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                em0.x(em0.this, this.f18670a);
            } catch (Throwable th) {
                ck.g().e(th.toString());
            }
        }
    }

    static {
        t2o.a(301989942);
    }

    public static /* synthetic */ Object ipc$super(em0 em0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/AliBuyCCRCExtension");
    }

    public static /* synthetic */ void x(em0 em0Var, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31497d9", new Object[]{em0Var, ultronProtocol});
        } else {
            em0Var.B(ultronProtocol);
        }
    }

    public final void B(UltronProtocol ultronProtocol) {
        JSONObject detect;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaeefe17", new Object[]{this, ultronProtocol});
            return;
        }
        Global global = ultronProtocol.getGlobal();
        if (!(global == null || (detect = global.getDetect()) == null)) {
            HashMap hashMap = new HashMap();
            for (String str : detect.keySet()) {
                hashMap.put(str, detect.getString(str));
            }
            CcrcBHService ccrcBHService = this.c;
            if (ccrcBHService != null) {
                ccrcBHService.detect(hashMap);
            }
        }
    }

    @Override // tb.gt, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else if (i0r.c()) {
            CcrcBHService bHService = CcrcBHService.getBHService("ccrc_taobao_swindle_risk");
            this.c = bHService;
            bHService.activate();
        }
    }

    @Override // tb.gt, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        }
    }

    @Override // tb.gt, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        CcrcBHService ccrcBHService = this.c;
        if (ccrcBHService != null) {
            ccrcBHService.deActivate();
        }
    }

    @Override // tb.gt, tb.dcb
    public void p(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900fdd7", new Object[]{this, multiTreeNode, ultronProtocol});
        } else {
            cn.e(new a(ultronProtocol));
        }
    }
}
