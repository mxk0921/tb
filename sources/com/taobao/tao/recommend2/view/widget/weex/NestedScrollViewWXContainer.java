package com.taobao.tao.recommend2.view.widget.weex;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import java.util.Map;
import tb.t2o;
import tb.y9n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NestedScrollViewWXContainer extends WXVContainer<AutoDispatchScrollView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AutoDispatchScrollView container;

    static {
        t2o.a(729809642);
    }

    public NestedScrollViewWXContainer(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    public static /* synthetic */ Object ipc$super(NestedScrollViewWXContainer nestedScrollViewWXContainer, String str, Object... objArr) {
        if (str.hashCode() == -87098777) {
            super.addChild((WXComponent) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend2/view/widget/weex/NestedScrollViewWXContainer");
    }

    @Override // com.taobao.weex.ui.component.WXVContainer
    public void addChild(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("facefa67", new Object[]{this, wXComponent});
            return;
        }
        y9n.a(AutoDispatchScrollView.TAG, "addChild");
        super.addChild(wXComponent);
        this.container.addView(wXComponent.getHostView());
    }

    @WXComponentProp(name = "showContent")
    public void setShowParam(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdea3410", new Object[]{this, map});
        } else if (map != null && map.get("show") != null) {
            try {
                this.container.setShowParam(((Boolean) map.get("show")).booleanValue());
            } catch (Exception e) {
                y9n.d("Weex component param error.", e);
            }
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public AutoDispatchScrollView initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoDispatchScrollView) ipChange.ipc$dispatch("cb67dde9", new Object[]{this, context});
        }
        y9n.a(AutoDispatchScrollView.TAG, "initComponentHostView");
        AutoDispatchScrollView autoDispatchScrollView = new AutoDispatchScrollView(context);
        this.container = autoDispatchScrollView;
        return autoDispatchScrollView;
    }
}
