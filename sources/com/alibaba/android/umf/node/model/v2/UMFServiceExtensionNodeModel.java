package com.alibaba.android.umf.node.model.v2;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcConstants;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFServiceExtensionNodeModel extends UMFBaseNodeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "priority")
    public int priority;

    static {
        t2o.a(79692009);
    }

    public static /* synthetic */ Object ipc$super(UMFServiceExtensionNodeModel uMFServiceExtensionNodeModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/model/v2/UMFServiceExtensionNodeModel");
    }

    @Override // com.alibaba.android.umf.node.model.IUMFNodeModel
    public String getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35374867", new Object[]{this});
        }
        return TrtcConstants.TRTC_PARAMS_EXTENSION;
    }
}
