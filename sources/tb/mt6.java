package tb;

import com.alibaba.android.ultron.vfw.instance.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mt6 implements a.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699191);
        t2o.a(157286653);
    }

    @Override // com.alibaba.android.ultron.vfw.instance.a.h
    public void a(List<IDMComponent> list, et6 et6Var, u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fe35e52", new Object[]{this, list, et6Var, u55Var});
            return;
        }
        IDMComponent rootComponent = u55Var.getRootComponent();
        if (rootComponent != null) {
            v7t.i("DataSourceProcessor", "root component" + rootComponent.getKey());
            for (IDMComponent iDMComponent : rootComponent.getChildren()) {
                if ("TaoLiveGoodsHeader".equals(iDMComponent.getKey())) {
                    if (iDMComponent.getChildren() != null) {
                        List<IDMComponent> children = iDMComponent.getChildren();
                        v7t.i("DataSourceProcessor", "header 区块个数：" + children.size());
                        et6Var.q(children);
                    }
                } else if ("GoodsItemList".equals(iDMComponent.getKey())) {
                    if (iDMComponent.getChildren() != null) {
                        List<IDMComponent> children2 = iDMComponent.getChildren();
                        v7t.i("DataSourceProcessor", "列表卡片种类：" + children2.size());
                        et6Var.l(children2);
                    }
                } else if ("TaoLiveGoodsTabContainer".equals(iDMComponent.getKey()) && iDMComponent.getChildren() != null && !iDMComponent.getChildren().isEmpty()) {
                    IDMComponent iDMComponent2 = iDMComponent.getChildren().get(0);
                    if ("TaoLiveGoodsTab".equals(iDMComponent2.getKey())) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(iDMComponent2);
                        et6Var.s(arrayList);
                    }
                }
            }
        }
    }
}
