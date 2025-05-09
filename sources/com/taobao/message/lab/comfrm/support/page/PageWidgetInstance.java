package com.taobao.message.lab.comfrm.support.page;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PageWidgetInstance extends WidgetInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout layout;

    static {
        t2o.a(537919856);
    }

    public static /* synthetic */ Object ipc$super(PageWidgetInstance pageWidgetInstance, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/page/PageWidgetInstance");
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(Context context, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.layout = linearLayout;
        linearLayout.setOrientation(1);
        return this.layout;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void bindData(Serializable serializable, EventDispatcher eventDispatcher) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdace18e", new Object[]{this, serializable, eventDispatcher});
            return;
        }
        if (this.layout.getChildCount() != 0) {
            z = false;
        }
        WidgetInstance createSlotWidgetIfNotExist = createSlotWidgetIfNotExist("navigator");
        if (createSlotWidgetIfNotExist != null) {
            bindSubViewData(createSlotWidgetIfNotExist, "navigator");
            if (createSlotWidgetIfNotExist.getView() != null && z) {
                this.layout.addView(createSlotWidgetIfNotExist.getView(), -1, -2);
            }
        }
        WidgetInstance createSlotWidgetIfNotExist2 = createSlotWidgetIfNotExist("content");
        if (createSlotWidgetIfNotExist2 != null) {
            bindSubViewData(createSlotWidgetIfNotExist2, "content");
            if (createSlotWidgetIfNotExist2.getView() != null && z) {
                createSlotWidgetIfNotExist2.getView().setBackgroundColor(-1);
                this.layout.addView(createSlotWidgetIfNotExist2.getView(), -1, -1);
            }
        }
    }
}
