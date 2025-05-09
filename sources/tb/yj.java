package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.lifeCycle.linkage")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class yj extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789117);
    }

    public static /* synthetic */ Object ipc$super(yj yjVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1335413541) {
            super.beforeFlowExecute((AURAInputData) objArr[0], (cg) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/AURALinkageLifeCycleExtension");
        }
    }

    public final void P0(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ecffe49", new Object[]{this, jSONObject, str});
            return;
        }
        AURAGlobalData L0 = L0();
        if (L0 != null) {
            L0.update("floatRawProtocol", JSON.parseObject(jSONObject.toJSONString()));
            L0.update("floatRootKey", str);
        }
    }

    @Override // tb.ms, tb.xab
    public void beforeFlowExecute(AURAInputData aURAInputData, cg cgVar) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f98cb25", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeFlowExecute(aURAInputData, cgVar);
        if ("aura.workflow.float".equals(cgVar.a())) {
            Serializable data = aURAInputData.getData();
            if (data instanceof AURAParseIO) {
                AURAParseIO aURAParseIO = (AURAParseIO) data;
                List<rl> data2 = aURAParseIO.getData();
                if (!bh.a(data2)) {
                    String rootKey = aURAParseIO.getRootKey();
                    if (!TextUtils.isEmpty(rootKey) && (b = data2.get(0).b()) != null) {
                        P0(b, rootKey);
                    }
                }
            }
        }
    }

    @Override // tb.ms, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
