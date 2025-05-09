package com.taobao.weex.ui.action;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GraphicActionBatchAction extends BasicGraphicAction {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<BasicGraphicAction> mActions;

    static {
        t2o.a(985661663);
    }

    public GraphicActionBatchAction(WXSDKInstance wXSDKInstance, String str, List<BasicGraphicAction> list) {
        super(wXSDKInstance, str);
        this.mActions = new ArrayList(list);
    }

    public static /* synthetic */ Object ipc$super(GraphicActionBatchAction graphicActionBatchAction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/action/GraphicActionBatchAction");
    }

    @Override // com.taobao.weex.ui.action.IExecutable
    public void executeAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d76bd12", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mActions.size(); i++) {
            this.mActions.get(i).executeAction();
        }
    }
}
