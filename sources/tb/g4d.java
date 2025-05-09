package tb;

import android.content.Context;
import android.view.View;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.order.map.model.OrderMapBubbleModel;
import com.taobao.android.order.map.model.OrderMapLifeCycleModel;
import com.taobao.android.order.map.model.OrderMapStatusModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface g4d {
    void L1(OrderMapLifeCycleModel orderMapLifeCycleModel);

    View V0(Context context, OrderMapBubbleModel orderMapBubbleModel, DXRuntimeContext dXRuntimeContext, icl iclVar);

    void j1(String str, Object obj);

    Object u0(String str);

    List<OrderMapBubbleModel> v2(Context context, DXRuntimeContext dXRuntimeContext);

    void y(OrderMapStatusModel orderMapStatusModel);
}
