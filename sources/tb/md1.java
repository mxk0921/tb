package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.assistant.display.AssistantCheckService;
import com.taobao.wireless.link.assistant.jsbridge.AssistantCloseJsBridge;
import com.taobao.wireless.link.assistant.jsbridge.AssistantHomeJsBridge;
import com.taobao.wireless.link.assistant.jsbridge.AssistantOpenJsBridge;
import com.taobao.wireless.link.assistant.jsbridge.AssistantPermissionJsBridge;
import com.taobao.wireless.link.assistant.jsbridge.AssistantSupportJsBridge;
import com.taobao.wireless.link.model.MessageData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class md1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f23956a;
    public Map<String, nd1> b;
    public Map<String, String> c;
    public Map<String, Object> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23958a;

        public b(Context context) {
            this.f23958a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            irg.a("link_tag", "AssistantCenter === startAndShowAssistant === 当前设备支持小助手，强制渲染小助手");
            MessageData i = qd1.i(cno.b(this.f23958a));
            Context context = this.f23958a;
            nd1 e = qd1.e(context, cno.b(context), qd1.k(this.f23958a), md1.this.f(this.f23958a));
            if (!(e == null || (str = e.b) == null || (str2 = e.c) == null)) {
                i.activity_id = str;
                i.assistant_logo_url = str2;
            }
            br7.g(this.f23958a, i);
            cno b = cno.b(this.f23958a);
            b.d("growth_assistant_first_click_" + qd1.k(this.f23958a), Integer.valueOf(vt3.f30239a + 1));
            irg.a("link_tag", "AssistantCenter === startAndShowAssistant === 当前点击次数=" + vt3.f30239a + 1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23959a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ qgf c;

        public c(Context context, Map map, qgf qgfVar) {
            this.f23959a = context;
            this.b = map;
            this.c = qgfVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            irg.a("link_tag", "AssistantCenter === startAndShowAssistant === 调用权益交互模块");
            lh8.b(this.f23959a, this.b, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final md1 f23960a = new md1(null);

        static {
            t2o.a(1030750225);
        }

        public static /* synthetic */ md1 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (md1) ipChange.ipc$dispatch("e9ecb063", new Object[0]);
            }
            return f23960a;
        }
    }

    static {
        t2o.a(1030750221);
    }

    public /* synthetic */ md1(a aVar) {
        this();
    }

    public static /* synthetic */ void a(md1 md1Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1fbe4b", new Object[]{md1Var, context});
        } else {
            md1Var.k(context);
        }
    }

    public static md1 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (md1) ipChange.ipc$dispatch("5fe8e11e", new Object[0]);
        }
        return d.a();
    }

    public void b(Context context, Map<String, String> map, qgf qgfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f003ae18", new Object[]{this, context, map, qgfVar});
        } else {
            rqg.b.a(new c(context, map, qgfVar));
        }
    }

    public final void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280b3999", new Object[]{this, context});
            return;
        }
        try {
            br7.f(context);
            context.stopService(new Intent(context, AssistantCheckService.class));
        } catch (Throwable th) {
            irg.a("link_tag", "AssistantCenter === closeAssistanInner === 关闭小助手异常：" + th);
        }
    }

    public void d(Context context, String str) {
        Map<String, String> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6cc825", new Object[]{this, context, str});
            return;
        }
        irg.a("link_tag", "AssistantCenter === closeAssistant === 关闭小助手");
        if (!TextUtils.isEmpty(str) && (h = qd1.h(context)) != null) {
            h.remove(str);
            irg.a("link_tag", "AssistantCenter === closeAssistant === 关闭小助手，移除id=" + str);
            qd1.s(cno.b(context), h, qd1.k(context));
        }
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05f0360", new Object[]{this, context});
            return;
        }
        c(context);
        m(context, false);
    }

    public void g(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        irg.a("link_tag", "AssistantCenter === init === 小助手模块开始初始化");
        ypg.e().g(application);
        fsw.h(AssistantHomeJsBridge.CLASSNAME_ASSISTANT_HOME, AssistantHomeJsBridge.class);
        fsw.h(AssistantOpenJsBridge.CLASSNAME_ASSISTANT_OPEN, AssistantOpenJsBridge.class);
        fsw.h(AssistantCloseJsBridge.CLASSNAME_ASSISTANT_CLOSE, AssistantCloseJsBridge.class);
        fsw.h(AssistantPermissionJsBridge.CLASSNAME_ASSISTANT_PERMISSION, AssistantPermissionJsBridge.class);
        fsw.h(AssistantSupportJsBridge.CLASSNAME_ASSISTANT_SUPPORT, AssistantSupportJsBridge.class);
        j(application);
        irg.a("link_tag", "AssistantCenter === init === 小助手模块初始化结束");
    }

    public void i(Context context, String str, boolean z, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7922caa8", new Object[]{this, context, str, new Boolean(z), map});
            return;
        }
        this.d = map;
        irg.a("link_tag", "AssistantCenter === openAssistant === 小助手开通参数：id=" + str + " needEquity=" + z + " extraInfo=" + map);
        if (!qd1.r(context)) {
            irg.a("link_tag", "AssistantCenter === openAssistant === 当前设备不支持小助手，开启失败");
        } else if (context == null || TextUtils.isEmpty(str)) {
            irg.a("link_tag", "AssistantCenter === openAssistant === 活动id为空，开启失败");
        } else {
            cno b2 = cno.b(context);
            String k = qd1.k(context);
            Map<String, String> c2 = b2.c("growth_assistant_activityList_" + k);
            c2.put(str, String.valueOf(z));
            qd1.s(b2, c2, k);
            nd1 nd1Var = new nd1();
            nd1Var.b = str;
            nd1Var.d = jsg.f();
            if (map != null) {
                nd1Var.f24653a = (String) map.get("baseUrl");
                nd1Var.c = (String) map.get("assistantLogoUrl");
            }
            qd1.t(b2, str, k, nd1Var);
            qd1.w(context, str, k, nd1Var.d + "");
            qd1.C(context, b2);
            if (jsg.a(context)) {
                irg.a("link_tag", "AssistantCenter === openAssistant === 绘制小助手");
                br7.d(context);
                jsg.t(context);
                return;
            }
            qd1.a(context);
        }
    }

    public final void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253ae34a", new Object[]{this, context});
        } else {
            jsg.w(context, new a(context));
        }
    }

    public final void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961b5c55", new Object[]{this, context});
        } else if (qd1.b(context)) {
            irg.a("link_tag", "AssistantCenter === startAndShowAssistant === 当前设备支持小助手，开始绘制小助手");
            if (vt3.f30239a >= 3 || !vt3.b) {
                b(context, qd1.h(context), null);
                br7.d(context);
                return;
            }
            mr4.b().a().post(new b(context));
        } else if (jsg.r(context, AssistantCheckService.class.getName())) {
            irg.a("link_tag", "DisplayCenter === drawAssistant === service存活，不支持小助手，关闭service");
            try {
                context.stopService(new Intent(context, AssistantCheckService.class));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void m(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee20c70", new Object[]{this, context, new Boolean(z)});
            return;
        }
        mr4.b().m = z + "";
        String k = qd1.k(context);
        cno.b(context).d("growth_assistant_switch_open_" + k, z + "");
    }

    public md1() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public String f(Context context) {
        Map<String, String> l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47b92658", new Object[]{this, context});
        }
        try {
            l = qd1.l(context, qd1.k(context));
        } catch (Exception e) {
            irg.b("link_tag", "AssistantCenter === getRecentLyId === 获取最近的活动id异常：" + e);
        }
        if (l.size() == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<String, String>> entrySet = l.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            arrayList.add(entry.getValue());
        }
        Collections.sort(arrayList);
        for (Map.Entry<String, String> entry2 : entrySet) {
            if (entry2.getValue().equals(arrayList.get(0))) {
                return entry2.getKey();
            }
        }
        return "";
    }

    public void l(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b401a4", new Object[]{this, context, new Boolean(z)});
            return;
        }
        irg.a("link_tag", "AssistantCenter === writeAssistantSetting === isOpen=" + z);
        String f = f(context);
        esg.b(esg.ARG1_ASSISTANT_SWITCH_STATE, f, z + "", new HashMap());
        if (z) {
            m(context, true);
            k(context);
            return;
        }
        e(context);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements npk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23957a;

        public a(Context context) {
            this.f23957a = context;
        }

        @Override // tb.npk
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 2) {
                irg.a("link_tag", "AssistantCenter === registerBfMonitor === 后台切前台，检测小助手流程");
                md1.a(md1.this, this.f23957a);
            } else if (i == 1) {
                vt3.b = false;
                ypg.e().f = "HOT";
            }
        }
    }
}
