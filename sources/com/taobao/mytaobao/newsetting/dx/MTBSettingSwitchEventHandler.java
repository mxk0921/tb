package com.taobao.mytaobao.newsetting.dx;

import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.mytaobao.ability.MtbMtopAbility;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.Map;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ckf;
import tb.e3j;
import tb.e6a;
import tb.r0k;
import tb.t2o;
import tb.uj3;
import tb.uuu;
import tb.wvc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MTBSettingSwitchEventHandler implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public e6a f11255a;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Action d;
        public final /* synthetic */ ActionDispatcher e;
        public final /* synthetic */ CommandHandler f;
        public final /* synthetic */ ServiceProvider g;

        public a(String str, boolean z, Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
            this.b = str;
            this.c = z;
            this.d = action;
            this.e = actionDispatcher;
            this.f = commandHandler;
            this.g = serviceProvider;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MTBSettingSwitchEventHandler.this.e(this.b, this.c);
            MTBSettingSwitchEventHandler.this.b(this.d, this.e, this.f, this.g);
        }
    }

    static {
        t2o.a(745537846);
        t2o.a(537919601);
    }

    public static final /* synthetic */ void a(MTBSettingSwitchEventHandler mTBSettingSwitchEventHandler, String str, boolean z, boolean z2, CommandHandler commandHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15dad96d", new Object[]{mTBSettingSwitchEventHandler, str, new Boolean(z), new Boolean(z2), commandHandler});
        } else {
            mTBSettingSwitchEventHandler.c(str, z, z2, commandHandler);
        }
    }

    public void b(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e80c0", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
        } else {
            ckf.h(action, "action");
        }
    }

    public final void c(String str, boolean z, boolean z2, CommandHandler commandHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee91fca5", new Object[]{this, str, new Boolean(z), new Boolean(z2), commandHandler});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("refresh", (Object) Boolean.valueOf(z2));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(str, (Object) Boolean.valueOf(z));
        jSONObject.put("kvs", (Object) jSONObject2);
        Command build = new Command.Build("settingStatusSource", "updateRuntimeSwitchState").data(jSONObject).build();
        if (commandHandler != null) {
            commandHandler.handle(build);
        }
    }

    public void e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c455432", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ckf.h(str, "key");
        r0k.P(str, Boolean.valueOf(z));
        if (this.f11255a == null) {
            this.f11255a = new e6a();
        }
        e6a e6aVar = this.f11255a;
        if (e6aVar != null) {
            e6aVar.e(str, z, true);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        String str = null;
        Object data = action != null ? action.getData() : null;
        if (!(data instanceof JSONObject)) {
            data = null;
        }
        JSONObject jSONObject2 = (JSONObject) data;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("settingItem")) != null && (string = jSONObject.getString("key")) != null) {
            Map<String, Object> context = action.getContext();
            Object obj = context != null ? context.get("event") : null;
            if (!(obj instanceof Event)) {
                obj = null;
            }
            Event event = (Event) obj;
            Object data2 = event != null ? event.getData() : null;
            if (!(data2 instanceof Map)) {
                data2 = null;
            }
            Map map = (Map) data2;
            Object obj2 = map != null ? map.get("isOn") : null;
            if (!(obj2 instanceof Boolean)) {
                obj2 = null;
            }
            Boolean bool = (Boolean) obj2;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                JSONObject jSONObject3 = jSONObject.getJSONObject("apiInfo");
                JSONObject jSONObject4 = jSONObject.getJSONObject("switchStyle");
                if (jSONObject4 != null) {
                    str = jSONObject4.getString("remoteSwitchState");
                }
                if (str == null || jSONObject3 == null) {
                    uuu.a(new a(string, booleanValue, action, actionDispatcher, commandHandler, serviceProvider));
                } else {
                    d(string, booleanValue, jSONObject3, commandHandler);
                }
            }
        }
    }

    public final void d(final String str, final boolean z, JSONObject jSONObject, final CommandHandler commandHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98867d", new Object[]{this, str, new Boolean(z), jSONObject, commandHandler});
            return;
        }
        c(str, z, false, commandHandler);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("open", (Object) Boolean.valueOf(z));
        MtbMtopAbility.INSTANCE.a(jSONObject, jSONObject2, new IRemoteBaseListener() { // from class: com.taobao.mytaobao.newsetting.dx.MTBSettingSwitchEventHandler$saveRemoteSwitch$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                JSONObject jSONObject3;
                String string;
                wvc a2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                ckf.h(mtopResponse, p1.d);
                try {
                    MTBSettingSwitchEventHandler.a(MTBSettingSwitchEventHandler.this, str, z, false, commandHandler);
                    byte[] bytedata = mtopResponse.getBytedata();
                    ckf.c(bytedata, "p1.bytedata");
                    JSONObject parseObject = JSON.parseObject(new String(bytedata, uj3.UTF_8));
                    if (parseObject != null && (jSONObject3 = parseObject.getJSONObject("data")) != null && (string = jSONObject3.getString("notifyAction")) != null && (a2 = e3j.INSTANCE.a("notify")) != null) {
                        a2.a(string, null);
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                MTBSettingSwitchEventHandler.a(MTBSettingSwitchEventHandler.this, str, !z, true, commandHandler);
                Toast.makeText(Globals.getApplication(), "操作失败，请稍后重试", 0).show();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                MTBSettingSwitchEventHandler.a(MTBSettingSwitchEventHandler.this, str, !z, true, commandHandler);
                Toast.makeText(Globals.getApplication(), "操作失败，请稍后重试", 0).show();
            }
        });
    }
}
