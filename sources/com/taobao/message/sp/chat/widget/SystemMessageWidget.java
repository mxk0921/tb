package com.taobao.message.sp.chat.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.render.RenderResult;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SystemMessageWidget extends WidgetInstance<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SystemMessageWidget";
    private View itemView;
    private RenderResult mRenderResult;
    private TextView tvContent;

    static {
        t2o.a(551551027);
    }

    public static /* synthetic */ Object ipc$super(SystemMessageWidget systemMessageWidget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/chat/widget/SystemMessageWidget");
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(Context context, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.mp_chat_item_msg_system, (ViewGroup) null, false);
        this.itemView = inflate;
        this.tvContent = (TextView) inflate.findViewById(R.id.tv_chat_msg_sys);
        return this.itemView;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public RenderResult getRenderResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderResult) ipChange.ipc$dispatch("26051047", new Object[]{this});
        }
        return this.mRenderResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void bindData(com.alibaba.fastjson.JSONObject r13, final com.taobao.message.lab.comfrm.core.EventDispatcher r14) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.sp.chat.widget.SystemMessageWidget.bindData(com.alibaba.fastjson.JSONObject, com.taobao.message.lab.comfrm.core.EventDispatcher):void");
    }
}
