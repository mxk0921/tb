package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.Global;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.parse.stateTree.abTest")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class pf extends gt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public lo c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UltronProtocol f26055a;

        public a(UltronProtocol ultronProtocol) {
            this.f26055a = ultronProtocol;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                pf.x(pf.this, this.f26055a);
            }
        }
    }

    static {
        t2o.a(81788953);
    }

    public static /* synthetic */ Object ipc$super(pf pfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/abTest/AURAAbTestParserExtension");
    }

    public static /* synthetic */ void x(pf pfVar, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db823ff", new Object[]{pfVar, ultronProtocol});
        } else {
            pfVar.B(ultronProtocol);
        }
    }

    public final void B(UltronProtocol ultronProtocol) {
        JSONObject jSONObject;
        lo loVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6260536", new Object[]{this, ultronProtocol});
            return;
        }
        Global global = ultronProtocol.getGlobal();
        if (global != null) {
            Object feature = global.getFeature();
            if ((feature instanceof JSONObject) && (jSONObject = ((JSONObject) feature).getJSONObject("otherParams")) != null) {
                String string = jSONObject.getString("dataTracks");
                if (!TextUtils.isEmpty(string) && (loVar = this.c) != null) {
                    UTABTest.activateServer(string, loVar.f());
                }
            }
        }
    }

    @Override // tb.gt, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.c = loVar;
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
        }
    }

    @Override // tb.gt, tb.dcb
    public void p(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900fdd7", new Object[]{this, multiTreeNode, ultronProtocol});
        } else {
            dn.h(new a(ultronProtocol));
        }
    }

    @Override // tb.gt
    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
