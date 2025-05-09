package com.taobao.weex.ui.action;

import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.dom.transition.WXTransition;
import com.taobao.weex.ui.component.WXComponent;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GraphicActionUpdateStyle extends BasicGraphicAction {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WXComponent component;
    private boolean mIsBorderSet;
    private boolean mIsCausedByPesudo;
    private Map<String, Object> mStyle;

    static {
        t2o.a(985661664);
    }

    public GraphicActionUpdateStyle(WXSDKInstance wXSDKInstance, String str, Map<String, Object> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4) {
        this(wXSDKInstance, str, map, map2, map3, map4, false);
    }

    public static /* synthetic */ Object ipc$super(GraphicActionUpdateStyle graphicActionUpdateStyle, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/action/GraphicActionUpdateStyle");
    }

    @Override // com.taobao.weex.ui.action.IExecutable
    public void executeAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d76bd12", new Object[]{this});
            return;
        }
        WXComponent wXComponent = this.component;
        if (wXComponent != null) {
            if (this.mStyle != null) {
                if (wXComponent.getTransition() != null) {
                    this.component.getTransition().updateTranstionParams(this.mStyle);
                    if (this.component.getTransition().hasTransitionProperty(this.mStyle)) {
                        this.component.getTransition().startTransition(this.mStyle);
                        return;
                    }
                    return;
                }
                WXComponent wXComponent2 = this.component;
                wXComponent2.setTransition(WXTransition.fromMap(this.mStyle, wXComponent2));
                this.component.updateStyles(this.mStyle);
            } else if (this.mIsBorderSet) {
                wXComponent.updateStyles(wXComponent);
            }
        }
    }

    public GraphicActionUpdateStyle(WXSDKInstance wXSDKInstance, String str, Map<String, Object> map, CSSShorthand cSSShorthand, CSSShorthand cSSShorthand2, CSSShorthand cSSShorthand3, boolean z) {
        super(wXSDKInstance, str);
        this.mStyle = map;
        this.mIsCausedByPesudo = z;
        WXComponent wXComponent = WXSDKManager.getInstance().getWXRenderManager().getWXComponent(getPageId(), getRef());
        this.component = wXComponent;
        if (wXComponent != null) {
            Map<String, Object> map2 = this.mStyle;
            if (map2 != null) {
                wXComponent.updateStyle(map2, this.mIsCausedByPesudo);
                if (map.containsKey("transform") && this.component.getTransition() == null) {
                    ArrayMap arrayMap = new ArrayMap(2);
                    arrayMap.put("transform", map.get("transform"));
                    arrayMap.put("transformOrigin", map.get("transformOrigin"));
                    this.component.addAnimationForElement(arrayMap);
                }
            }
            if (cSSShorthand != null) {
                this.component.setPaddings(cSSShorthand);
            }
            if (cSSShorthand2 != null) {
                this.component.setMargins(cSSShorthand2);
            }
            if (cSSShorthand3 != null) {
                this.mIsBorderSet = true;
                this.component.setBorders(cSSShorthand3);
            }
        }
    }

    public GraphicActionUpdateStyle(WXSDKInstance wXSDKInstance, String str, Map<String, Object> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, boolean z) {
        super(wXSDKInstance, str);
        this.mStyle = map;
        this.mIsCausedByPesudo = z;
        WXComponent wXComponent = WXSDKManager.getInstance().getWXRenderManager().getWXComponent(getPageId(), getRef());
        this.component = wXComponent;
        if (wXComponent != null) {
            Map<String, Object> map5 = this.mStyle;
            if (map5 != null) {
                wXComponent.addStyle(map5, this.mIsCausedByPesudo);
                if (map.containsKey("transform") && this.component.getTransition() == null) {
                    ArrayMap arrayMap = new ArrayMap(2);
                    arrayMap.put("transform", map.get("transform"));
                    arrayMap.put("transformOrigin", map.get("transformOrigin"));
                    this.component.addAnimationForElement(arrayMap);
                    if (WXSDKManager.getInstance().getWXBridgeManager() != null) {
                        WXSDKManager.getInstance().getWXBridgeManager().markDirty(this.component.getInstanceId(), this.component.getRef(), true);
                    }
                }
            }
            if (map2 != null) {
                this.component.addShorthand(map2);
            }
            if (map3 != null) {
                this.component.addShorthand(map3);
            }
            if (map4 != null) {
                this.mIsBorderSet = true;
                this.component.addShorthand(map4);
            }
        }
    }
}
