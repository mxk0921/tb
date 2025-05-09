package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class nc5 implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ServiceProvider b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public a(ServiceProvider serviceProvider, String str, String str2) {
            this.b = serviceProvider;
            this.c = str;
            this.d = str2;
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
                nc5.a(nc5.this, activity, this.c, this.d);
            }
        }
    }

    static {
        t2o.a(745537834);
        t2o.a(537919601);
    }

    public static final /* synthetic */ void a(nc5 nc5Var, Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("195d0c07", new Object[]{nc5Var, context, str, str2});
        } else {
            nc5Var.b(context, str, str2);
        }
    }

    public final void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0be5b8", new Object[]{this, context, str, str2});
        } else if (str != null) {
            try {
                if (str.length() != 0) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    if (!(str2 == null || str2.length() == 0)) {
                        intent.setPackage(str2);
                    }
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
        } else if (!bwu.b()) {
            String str = null;
            Object data = action != null ? action.getData() : null;
            if (!(data instanceof JSONObject)) {
                data = null;
            }
            JSONObject jSONObject = (JSONObject) data;
            if (jSONObject != null && (string = jSONObject.getString("url")) != null) {
                Object data2 = action.getData();
                if (!(data2 instanceof JSONObject)) {
                    data2 = null;
                }
                JSONObject jSONObject2 = (JSONObject) data2;
                if (jSONObject2 != null) {
                    str = jSONObject2.getString("packageName");
                }
                uuu.a(new a(serviceProvider, string, str));
            }
        }
    }
}
