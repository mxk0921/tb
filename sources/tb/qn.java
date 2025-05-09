package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = qn.CODE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class qn extends et {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BRANCH_CODE_ENABLE_SUBMIT_UPLOAD_TRIGGER = "aura.branch.enableSubmitUploadTrigger";
    public static final String CODE = "aura.impl.nextrpc.submit";
    public static final String HEADER_FEATURE_KEY = "feature";
    public static final String HEADER_FEATURE_VAL = "{\"gzip\":\"true\"}";
    public MultiTreeNode f;
    public UltronProtocol g;
    public hbb h;

    static {
        t2o.a(81789119);
    }

    public static /* synthetic */ Object ipc$super(qn qnVar, String str, Object... objArr) {
        if (str.hashCode() == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/AURASubmitLinkageExtension");
    }

    @Override // tb.et, tb.vbb
    public void S(kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de231dc7", new Object[]{this, kkVar});
        }
    }

    @Override // tb.et, tb.vbb
    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return null;
    }

    @Override // tb.et, tb.vbb
    public void j0(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501f871f", new Object[]{this, aURANextRPCEndpoint});
        }
    }

    @Override // tb.et, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.h = hbbVar;
        this.f = (MultiTreeNode) aURAGlobalData.get(zj.GLOBAL_DATA_STATE_TREE, MultiTreeNode.class);
        this.g = (UltronProtocol) aURAGlobalData.get(zj.GLOBAL_DATA_PROTOCOL, UltronProtocol.class);
    }

    @Override // tb.et, tb.vbb
    public Map<String, String> y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("42c19ec2", new Object[]{this});
        }
        try {
            JSONObject c = LinkageUtils.c(this.f, this.g, null, false);
            if (c != null) {
                for (rt rtVar : r().f(rt.class)) {
                    rtVar.L(c);
                }
            }
            String jSONString = JSON.toJSONString(c);
            HashMap hashMap = new HashMap();
            hashMap.put("params", yrq.a(jSONString));
            hashMap.put("feature", "{\"gzip\":\"true\"}");
            return hashMap;
        } catch (Throwable th) {
            hbb hbbVar = this.h;
            if (hbbVar != null) {
                hbbVar.b(new mi(1, "AURALinkagePluginDomain", "-3001_SUBMIT_CREATE_PARAM", th.getMessage()));
            }
            return null;
        }
    }
}
