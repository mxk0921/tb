package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class rm6 implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String EVENT_HANDLER_SETTING_VIDEO = "eventhandler.mtb.widget.setting.video";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(745537872);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(745537871);
        t2o.a(537919601);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
        } else if (!bwu.b()) {
            JSONObject jSONObject2 = null;
            Object data = action != null ? action.getData() : null;
            if (data instanceof JSONObject) {
                jSONObject2 = data;
            }
            JSONObject jSONObject3 = jSONObject2;
            if (jSONObject3 != null && (jSONObject = jSONObject3.getJSONObject("settingItem")) != null && (string = jSONObject.getString("key")) != null) {
                Command build = new Command.Build("getVideoItems", "changeSelect").data(string).build();
                if (commandHandler != null) {
                    commandHandler.handle(build);
                }
            }
        }
    }
}
