package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
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
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class xj extends bp<UMFLinkageTrigger, AURANextRPCIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.service.linkage.adjust";
    public static final String HEADER_FEATURE_KEY = "feature";
    public static final String HEADER_FEATURE_VAL = "{\"gzip\":\"true\"}";

    static {
        t2o.a(81789137);
    }

    public static /* synthetic */ Object ipc$super(xj xjVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -576780562) {
            super.B((AURAInputData) objArr[0], (pt) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/service/AURALinkageAdjustService");
        }
    }

    public final Map<String, Object> L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2ab4c8f4", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("linkageType", "adjust");
        return hashMap;
    }

    @Override // tb.gn, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // tb.bp
    public void B(AURAInputData<UMFLinkageTrigger> aURAInputData, pt<AURANextRPCIO> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9f06ee", new Object[]{this, aURAInputData, ptVar});
            return;
        }
        super.B(aURAInputData, ptVar);
        UMFLinkageTrigger data = aURAInputData.getData();
        if (data == null) {
            mi miVar = new mi(0, "AURALinkagePluginDomain", "-1000_INVALID_TRIGGER", "回收插件服务输入的linkageTrigger为空");
            miVar.i(L());
            ptVar.b(miVar);
            return;
        }
        MultiTreeNode multiTreeNode = (MultiTreeNode) aURAInputData.getGlobalData().get(zj.GLOBAL_DATA_STATE_TREE, MultiTreeNode.class);
        UltronProtocol ultronProtocol = (UltronProtocol) aURAInputData.getGlobalData().get(zj.GLOBAL_DATA_PROTOCOL, UltronProtocol.class);
        HashMap hashMap = new HashMap();
        try {
            JSONObject c = LinkageUtils.c(multiTreeNode, ultronProtocol, data, true);
            if (c != null) {
                for (hs hsVar : r().f(hs.class)) {
                    hsVar.L(c);
                }
            }
            hashMap.put("params", yrq.a(JSON.toJSONString(c)));
            hashMap.put("feature", "{\"gzip\":\"true\"}");
        } catch (Throwable th) {
            ptVar.b(new mi(0, "AURALinkagePluginDomain", "-1000_INVALID_TRIGGER", th.getMessage()));
        }
        pbb pbbVar = (pbb) r().e(pbb.class);
        if (pbbVar == null) {
            mi miVar2 = new mi(0, "AURALinkagePluginDomain", "-2000_EMPTY_EXTENSION", "回收插件服务扩展点未实现");
            miVar2.i(L());
            ptVar.b(miVar2);
            return;
        }
        AURANextRPCEndpoint k = pbbVar.k();
        String d = pbbVar.d();
        if (k == null) {
            mi miVar3 = new mi(0, "AURALinkagePluginDomain", "-2001_EMPTY_EXTENSION_ENDPOINT", "回收插件服务扩展点未实现getEndpoint扩展点");
            miVar3.i(L());
            ptVar.b(miVar3);
            return;
        }
        k.appendParams(hashMap);
        ptVar.c(yk.a(new AURANextRPCIO(d, k), aURAInputData));
    }
}
