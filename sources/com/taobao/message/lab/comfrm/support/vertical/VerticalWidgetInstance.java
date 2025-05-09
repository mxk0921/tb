package com.taobao.message.lab.comfrm.support.vertical;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.MonitorUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.support.Monitor;
import com.taobao.message.lab.comfrm.util.StyleUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR:\u0010\"\u001a&\u0012\u0004\u0012\u00020 \u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u001fj\u0012\u0012\u0004\u0012\u00020 \u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001`!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/taobao/message/lab/comfrm/support/vertical/VerticalWidgetInstance;", "Lcom/taobao/message/lab/comfrm/render/WidgetInstance;", "Lcom/alibaba/fastjson/JSONObject;", "<init>", "()V", "Landroid/view/View;", "view", "data", "Lcom/taobao/message/lab/comfrm/core/EventDispatcher;", "eventDispatcher", "Ltb/xhv;", "bindSelfData", "(Landroid/view/View;Lcom/alibaba/fastjson/JSONObject;Lcom/taobao/message/lab/comfrm/core/EventDispatcher;)V", "Landroid/content/Context;", "context", "Lcom/taobao/message/lab/comfrm/render/RenderTemplate;", "renderTemplate", "createView", "(Landroid/content/Context;Lcom/taobao/message/lab/comfrm/render/RenderTemplate;)Landroid/view/View;", "bindData", "(Lcom/alibaba/fastjson/JSONObject;Lcom/taobao/message/lab/comfrm/core/EventDispatcher;)V", "Lcom/taobao/message/lab/comfrm/core/Event;", "event", "postEvent", "(Lcom/taobao/message/lab/comfrm/core/Event;)V", "Landroid/widget/FrameLayout;", "frameLayout", "Landroid/widget/FrameLayout;", "Landroid/widget/LinearLayout;", "linearLayout", "Landroid/widget/LinearLayout;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "unique2WidgetInstanceMap", "Ljava/util/HashMap;", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class VerticalWidgetInstance extends WidgetInstance<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout frameLayout;
    private LinearLayout linearLayout;
    private HashMap<String, WidgetInstance<?>> unique2WidgetInstanceMap;

    static {
        t2o.a(537919872);
    }

    private final void bindSelfData(View view, JSONObject jSONObject, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("377bc544", new Object[]{this, view, jSONObject, eventDispatcher});
        } else {
            StyleUtil.processStyle(view, getViewObject().info.style);
        }
    }

    public static /* synthetic */ Object ipc$super(VerticalWidgetInstance verticalWidgetInstance, String str, Object... objArr) {
        if (str.hashCode() == -1283962764) {
            super.postEvent((Event) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/vertical/VerticalWidgetInstance");
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance, com.taobao.message.lab.comfrm.render.WidgetInterface
    public void postEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3784874", new Object[]{this, event});
            return;
        }
        super.postEvent(event);
        HashMap<String, WidgetInstance<?>> hashMap = this.unique2WidgetInstanceMap;
        if (hashMap != null) {
            for (WidgetInstance<?> widgetInstance : hashMap.values()) {
                widgetInstance.postEvent(event);
            }
            return;
        }
        ckf.y("unique2WidgetInstanceMap");
        throw null;
    }

    public void bindData(JSONObject jSONObject, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b185178e", new Object[]{this, jSONObject, eventDispatcher});
            return;
        }
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            bindSelfData(frameLayout, jSONObject, eventDispatcher);
            Object obj = getViewObject().children.get(Constants.Slot.DEF_SLOT);
            if (obj instanceof List) {
                for (ViewObject viewObject : (List) obj) {
                    if (viewObject.uniqueId != null || !ApplicationUtil.isDebug()) {
                        HashMap<String, WidgetInstance<?>> hashMap = this.unique2WidgetInstanceMap;
                        if (hashMap != null) {
                            WidgetInstance<?> widgetInstance = hashMap.get(viewObject.uniqueId);
                            if (widgetInstance == null) {
                                WidgetInstance<?> createSubView = createSubView(viewObject.info.renderTemplate);
                                HashMap<String, WidgetInstance<?>> hashMap2 = this.unique2WidgetInstanceMap;
                                if (hashMap2 != null) {
                                    String str = viewObject.uniqueId;
                                    ckf.f(str, "viewObject.uniqueId");
                                    ckf.f(createSubView, "widgetInstance");
                                    hashMap2.put(str, createSubView);
                                    createSubView.bindViewObject(viewObject, eventDispatcher);
                                    if (createSubView.getView() != null) {
                                        LinearLayout linearLayout = this.linearLayout;
                                        if (linearLayout != null) {
                                            linearLayout.addView(createSubView.getView());
                                        } else {
                                            ckf.y("linearLayout");
                                            throw null;
                                        }
                                    }
                                    View view = createSubView.getView();
                                    ckf.f(view, "widgetInstance.view");
                                    StyleUtil.processStyle(view, viewObject.info.style);
                                } else {
                                    ckf.y("unique2WidgetInstanceMap");
                                    throw null;
                                }
                            } else {
                                widgetInstance.bindViewObject(viewObject, eventDispatcher);
                            }
                        } else {
                            ckf.y("unique2WidgetInstanceMap");
                            throw null;
                        }
                    } else {
                        throw new IllegalArgumentException("VerticalWidgetInstance|viewObject.uniqueId|null");
                    }
                }
            }
            LinearLayout linearLayout2 = this.linearLayout;
            if (linearLayout2 == null) {
                ckf.y("linearLayout");
                throw null;
            } else if (linearLayout2.getChildCount() > 0) {
                MonitorUtil.commitSuccess(Monitor.MODULE_COMFRM, Monitor.POINT_LOAD_VERTICAL_COMPONENT_RATE, "vertical");
            } else {
                MonitorUtil.commitFail(Monitor.MODULE_COMFRM, Monitor.POINT_LOAD_VERTICAL_COMPONENT_RATE, "vertical", "CHILD_FAIL", "child count == 0");
            }
        } else {
            ckf.y("frameLayout");
            throw null;
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(Context context, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        ckf.g(context, "context");
        ckf.g(renderTemplate, "renderTemplate");
        this.frameLayout = new FrameLayout(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
            LinearLayout linearLayout2 = this.linearLayout;
            if (linearLayout2 != null) {
                linearLayout2.setOrientation(1);
                this.unique2WidgetInstanceMap = new HashMap<>(4);
                FrameLayout frameLayout2 = this.frameLayout;
                if (frameLayout2 != null) {
                    return frameLayout2;
                }
                ckf.y("frameLayout");
                throw null;
            }
            ckf.y("linearLayout");
            throw null;
        }
        ckf.y("frameLayout");
        throw null;
    }
}
