package tb;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.mytaobao.newSettingV2.MtbTimePickerDialogFragment;
import com.taobao.mytaobao.newsetting.dx.MTBSettingSwitchEventHandler;
import com.taobao.tao.Globals;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ssh extends MTBSettingSwitchEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String EVENT_HANDLER_CLICK_PICKER = "eventhandler.mtb.widget.setting.click.picker";
    public static final String EVENT_HANDLER_SWITCH_PICKER = "eventhandler.mtb.widget.setting.switch.picker";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(745537858);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ServiceProvider b;
        public final /* synthetic */ CommandHandler c;
        public final /* synthetic */ String d;

        public b(ServiceProvider serviceProvider, CommandHandler commandHandler, String str) {
            this.b = serviceProvider;
            this.c = commandHandler;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PageService pageService;
            Activity activity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ServiceProvider serviceProvider = this.b;
            if (serviceProvider != null && (pageService = (PageService) serviceProvider.service(PageService.class)) != null && (activity = pageService.getActivity()) != null) {
                ssh.g(ssh.this, this.c, activity, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c<T> implements o32<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ CommandHandler c;

        public c(String str, CommandHandler commandHandler) {
            this.b = str;
            this.c = commandHandler;
        }

        /* renamed from: b */
        public final void a(boolean z, String str, JSONObject jSONObject) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bd050f5", new Object[]{this, new Boolean(z), str, jSONObject});
                return;
            }
            j9t e = j9t.e(Globals.getApplication(), "mytaobao");
            ckf.c(e, "TaobaoGlobalSettings\n   …MTBConstant.MTB_BIZ_NAME)");
            ehb c = e.c();
            String str3 = this.b + "Sub";
            if (jSONObject == null || (str2 = jSONObject.toJSONString()) == null) {
                str2 = "";
            }
            c.c("mytaobao", str3, str2, null);
            ssh.f(ssh.this, this.c);
        }
    }

    static {
        t2o.a(745537857);
    }

    public static final /* synthetic */ void f(ssh sshVar, CommandHandler commandHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8d20e", new Object[]{sshVar, commandHandler});
        } else {
            sshVar.h(commandHandler);
        }
    }

    public static final /* synthetic */ void g(ssh sshVar, CommandHandler commandHandler, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a516cf04", new Object[]{sshVar, commandHandler, activity, str});
        } else {
            sshVar.i(commandHandler, activity, str);
        }
    }

    public static /* synthetic */ Object ipc$super(ssh sshVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1224233213) {
            super.handle((Action) objArr[0], (ActionDispatcher) objArr[1], (CommandHandler) objArr[2], (ServiceProvider) objArr[3]);
            return null;
        } else if (hashCode == 254705856) {
            super.b((Action) objArr[0], (ActionDispatcher) objArr[1], (CommandHandler) objArr[2], (ServiceProvider) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/newsetting/dx/general/MTBSelectTimePickerEventHandler");
        }
    }

    @Override // com.taobao.mytaobao.newsetting.dx.MTBSettingSwitchEventHandler
    public void b(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e80c0", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        ckf.h(action, "action");
        super.b(action, actionDispatcher, commandHandler, serviceProvider);
        h(commandHandler);
    }

    public final void h(CommandHandler commandHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d7c630", new Object[]{this, commandHandler});
            return;
        }
        Command build = new Command.Build("settingStatusSource", "updateStatus").build();
        if (commandHandler != null) {
            commandHandler.handle(build);
        }
    }

    @Override // com.taobao.mytaobao.newsetting.dx.MTBSettingSwitchEventHandler, com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        JSONObject jSONObject2 = null;
        if (ckf.b(action != null ? action.getName() : null, EVENT_HANDLER_SWITCH_PICKER)) {
            super.handle(action, actionDispatcher, commandHandler, serviceProvider);
            return;
        }
        if (ckf.b(action != null ? action.getName() : null, EVENT_HANDLER_CLICK_PICKER) && !bwu.b()) {
            Object data = action.getData();
            if (data instanceof JSONObject) {
                jSONObject2 = data;
            }
            JSONObject jSONObject3 = jSONObject2;
            if (jSONObject3 != null && (jSONObject = jSONObject3.getJSONObject("settingItem")) != null && (string = jSONObject.getString("key")) != null) {
                uuu.a(new b(serviceProvider, commandHandler, string));
            }
        }
    }

    public final void i(CommandHandler commandHandler, Activity activity, String str) {
        FragmentManager supportFragmentManager;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239d2f32", new Object[]{this, commandHandler, activity, str});
            return;
        }
        if (!(activity instanceof FragmentActivity)) {
            activity = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
            try {
                j9t e = j9t.e(Globals.getApplication(), "mytaobao");
                ckf.c(e, "TaobaoGlobalSettings\n   …MTBConstant.MTB_BIZ_NAME)");
                JSONObject parseObject = JSON.parseObject((String) e.b().d("mytaobao", str + "Sub", "", null));
                i3 = parseObject.getIntValue("startHour");
                try {
                    i2 = parseObject.getIntValue("starMinute");
                    try {
                        i = parseObject.getIntValue("endHour");
                        try {
                            i4 = parseObject.getIntValue("endMinute");
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        i = 0;
                        MtbTimePickerDialogFragment.C2(i3, i2, i, i4, new c(str, commandHandler)).show(supportFragmentManager, "picker");
                    }
                } catch (Throwable unused3) {
                    i2 = 0;
                    i = 0;
                    MtbTimePickerDialogFragment.C2(i3, i2, i, i4, new c(str, commandHandler)).show(supportFragmentManager, "picker");
                }
            } catch (Throwable unused4) {
                i3 = 0;
            }
            MtbTimePickerDialogFragment.C2(i3, i2, i, i4, new c(str, commandHandler)).show(supportFragmentManager, "picker");
        }
    }
}
