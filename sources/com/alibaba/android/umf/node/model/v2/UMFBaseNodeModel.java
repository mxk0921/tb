package com.alibaba.android.umf.node.model.v2;

import com.alibaba.android.umf.node.model.IUMFNodeModel;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class UMFBaseNodeModel implements IUMFNodeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "code")
    public String code;
    @JSONField(name = "id")
    public String id;

    static {
        t2o.a(79692006);
        t2o.a(79692004);
    }

    @Override // com.alibaba.android.umf.node.model.IUMFNodeModel
    public String getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.code;
    }

    @Override // com.alibaba.android.umf.node.model.IUMFNodeModel
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.id;
    }

    @Override // com.alibaba.android.umf.node.model.IUMFNodeModel
    public void setCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f1cac0", new Object[]{this, str});
        } else {
            this.code = str;
        }
    }

    @Override // com.alibaba.android.umf.node.model.IUMFNodeModel
    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.id = str;
        }
    }
}
