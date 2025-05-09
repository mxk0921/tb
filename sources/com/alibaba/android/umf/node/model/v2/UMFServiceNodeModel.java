package com.alibaba.android.umf.node.model.v2;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFServiceNodeModel extends UMFBaseNodeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, List<UMFServiceExtensionNodeModel>> extensionModelMap;
    @JSONField(name = "extensions")
    public Map<String, List<String>> extensions;

    static {
        t2o.a(79692010);
    }

    public static /* synthetic */ Object ipc$super(UMFServiceNodeModel uMFServiceNodeModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/model/v2/UMFServiceNodeModel");
    }

    public void addExtensionModel(String str, UMFServiceExtensionNodeModel uMFServiceExtensionNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8000e5a", new Object[]{this, str, uMFServiceExtensionNodeModel});
            return;
        }
        if (this.extensionModelMap == null) {
            this.extensionModelMap = new HashMap();
        }
        List<UMFServiceExtensionNodeModel> list = this.extensionModelMap.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.extensionModelMap.put(str, list);
        }
        if (!list.contains(uMFServiceExtensionNodeModel)) {
            list.add(uMFServiceExtensionNodeModel);
        }
    }

    public Map<String, List<UMFServiceExtensionNodeModel>> getExtensionModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a043a19c", new Object[]{this});
        }
        return this.extensionModelMap;
    }

    @Override // com.alibaba.android.umf.node.model.IUMFNodeModel
    public String getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35374867", new Object[]{this});
        }
        return "service";
    }
}
