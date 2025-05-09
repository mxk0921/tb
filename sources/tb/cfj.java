package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model.ErrorCardModel;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model.LoadingCardModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cfj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static BaseSectionModel f17028a;
    public static BaseSectionModel b;

    static {
        t2o.a(486539680);
    }

    public static BaseSectionModel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("48c74c2b", new Object[0]);
        }
        if (f17028a == null) {
            f17028a = new ErrorCardModel();
        }
        return f17028a;
    }

    public static BaseSectionModel b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("ba52c8f7", new Object[0]);
        }
        if (b == null) {
            b = new LoadingCardModel();
        }
        return b;
    }
}
