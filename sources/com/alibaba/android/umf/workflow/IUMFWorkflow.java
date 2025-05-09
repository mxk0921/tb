package com.alibaba.android.umf.workflow;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.node.model.IUMFNodeModel;
import java.util.List;
import tb.hz;
import tb.txu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IUMFWorkflow<INPUT extends UMFBaseIO, OUTPUT extends UMFBaseIO> {
    void execute(List<IUMFNodeModel> list, INPUT input, txu txuVar, hz<OUTPUT> hzVar);
}
