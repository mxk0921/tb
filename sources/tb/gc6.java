package tb;

import android.app.Activity;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class gc6 implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ServiceProvider b;
        public final /* synthetic */ JSONObject c;

        public a(ServiceProvider serviceProvider, JSONObject jSONObject) {
            this.b = serviceProvider;
            this.c = jSONObject;
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
                String string = this.c.getString("simpleLinkUrl");
                if (string == null || string.length() == 0) {
                    String string2 = this.c.getString("url");
                    if (string2 != null && string2.length() != 0) {
                        if (ih4.a("verifyScheme", false)) {
                            string2 = gc6.a(gc6.this, string2);
                        }
                        if (ckf.b("https://m.taobao.com/go/mytaobao/newpaysettings", string2) || ckf.b("http://m.taobao.com/go/newmytaobaocommonsettings2", string2) || ckf.b("http://m.taobao.com/go/newmytaobaohelpsettings", string2)) {
                            Nav.from(activity).skipAllProcessors().toUri(string2);
                        } else {
                            Nav.from(activity).toUri(string2);
                        }
                    }
                } else {
                    Nav.from(activity).toUriSimple(string);
                }
            }
        }
    }

    static {
        t2o.a(745537836);
        t2o.a(537919601);
    }

    public static final /* synthetic */ String a(gc6 gc6Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26acde85", new Object[]{gc6Var, str});
        }
        return gc6Var.b(str);
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dcb4849c", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        ckf.c(parse, "Uri.parse(uri)");
        String scheme = parse.getScheme();
        if (scheme != null && (ckf.b("http", scheme) || ckf.b("https", scheme))) {
            return str;
        }
        return h1p.HTTPS_PREFIX + str;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
        } else if (!bwu.b()) {
            JSONObject jSONObject3 = null;
            Object data = action != null ? action.getData() : null;
            if (data instanceof JSONObject) {
                jSONObject3 = data;
            }
            JSONObject jSONObject4 = jSONObject3;
            if (jSONObject4 != null && (jSONObject = jSONObject4.getJSONObject("settingItem")) != null && (jSONObject2 = jSONObject.getJSONObject("linkStyle")) != null) {
                uuu.a(new a(serviceProvider, jSONObject2));
            }
        }
    }
}
