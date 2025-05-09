package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.bmi;
import tb.vrp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class dsp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dsp INSTANCE = new dsp();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b extends vrp.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ csp c;

        public b(csp cspVar) {
            this.c = cspVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 965972421) {
                return new Boolean(super.b((lr9) objArr[0], objArr[1]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/message/helper/ShortVideoTabMessageHelper$sendMessageToShortVideo$shortVideoMessageCallback$1");
        }

        @Override // tb.vrp.a
        public boolean b(lr9 lr9Var, Object obj) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("399391c5", new Object[]{this, lr9Var, obj})).booleanValue();
            }
            vgh.c(this, "ShortVideoTabMessageHelper", "收到视频Tab的消息结果回调，message=" + this.c);
            boolean b = super.b(lr9Var, obj);
            if (b) {
                if (obj instanceof Map) {
                    jSONObject = new JSONObject((Map) obj);
                } else {
                    vgh.c(this, "ShortVideoTabMessageHelper", "收到视频Tab的消息结果回调，result无效");
                    jSONObject = null;
                }
                bmi.a b2 = this.c.b();
                if (b2 != null) {
                    b2.onResult(jSONObject);
                }
            }
            return b;
        }
    }

    static {
        t2o.a(689963262);
    }

    public final void a(jmi jmiVar, vv1 vv1Var, String str, List<String> list, wa waVar, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd3a6a4", new Object[]{this, jmiVar, vv1Var, str, list, waVar, ypsVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(str, "sender");
        ckf.g(list, "names");
        ckf.g(waVar, "messageObserver");
        ckf.g(ypsVar, "tabBaseInfoManager");
        vgh.c(this, "ShortVideoTabMessageHelper", "注册来自视频Tab的消息，sender=" + str + "，names=" + list);
        if (!ckf.b(vv1Var.h(str), "video")) {
            vgh.c(this, "ShortVideoTabMessageHelper", "注册来自视频Tab的消息，sender无效");
            return;
        }
        jmiVar.d(str, list, waVar);
        b(jmiVar, vv1Var, str, ypsVar);
    }

    public final void b(jmi jmiVar, vv1 vv1Var, String str, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8debbd11", new Object[]{this, jmiVar, vv1Var, str, ypsVar});
            return;
        }
        vgh.c(this, "ShortVideoTabMessageHelper", "向Fluid实例注册事件处理器，sender=" + str);
        if (ypsVar.g(str) != null) {
            vgh.c(this, "ShortVideoTabMessageHelper", "向Fluid实例注册事件处理器，已注册");
            return;
        }
        a aVar = new a(jmiVar, str, vv1Var);
        String f = ypsVar.f(str);
        ur9.a(f, aVar);
        ypsVar.i(str, aVar);
        vgh.c(this, "ShortVideoTabMessageHelper", "向Fluid实例注册事件处理器，注册完成，fluidInstanceId=" + f + "，fluidMessageHandler=" + aVar);
    }

    public final void c(jmi jmiVar, vv1 vv1Var, JSONObject jSONObject, String str, bmi.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c36aa02", new Object[]{this, jmiVar, vv1Var, jSONObject, str, aVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(jSONObject, "args");
        ckf.g(str, "sender");
        vgh.c(this, "ShortVideoTabMessageHelper", "向互动发消息，sender=".concat(str));
        if (!ckf.b(vv1Var.h(str), "video")) {
            vgh.c(this, "ShortVideoTabMessageHelper", "向互动发消息，sender无效");
            return;
        }
        csp b2 = csp.Companion.b(jSONObject, System.currentTimeMillis(), str, "Interact", aVar);
        if (b2 != null) {
            jmiVar.e(b2);
        }
    }

    public final void d(vv1 vv1Var, JSONObject jSONObject, String str, bmi.a aVar, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("500eacf3", new Object[]{this, vv1Var, jSONObject, str, aVar, ypsVar});
            return;
        }
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(jSONObject, "args");
        ckf.g(str, bmi.KEY_RECEIVER);
        ckf.g(ypsVar, "tabBaseInfoManager");
        vgh.c(this, "ShortVideoTabMessageHelper", "向视频Tab发消息，receiver=".concat(str));
        csp b2 = csp.Companion.b(jSONObject, System.currentTimeMillis(), "Interact", str, aVar);
        if (b2 != null) {
            e(vv1Var, b2, ypsVar);
        }
    }

    public final void e(vv1 vv1Var, csp cspVar, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e785f77", new Object[]{this, vv1Var, cspVar, ypsVar});
            return;
        }
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(cspVar, "message");
        ckf.g(ypsVar, "tabBaseInfoManager");
        vgh.c(this, "ShortVideoTabMessageHelper", "向视频Tab发消息，message=" + cspVar);
        if (!ckf.b(vv1Var.h(cspVar.d()), "video")) {
            vgh.c(this, "ShortVideoTabMessageHelper", "向视频Tab发消息，receiver无效");
        } else {
            ur9.b(ypsVar.f(cspVar.d()), new vrp(cspVar.a(), new b(cspVar)));
        }
    }

    public final void f(jmi jmiVar, vv1 vv1Var, String str, List<String> list, wa waVar, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5af26b", new Object[]{this, jmiVar, vv1Var, str, list, waVar, ypsVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(str, "sender");
        ckf.g(list, "names");
        ckf.g(waVar, "messageObserver");
        ckf.g(ypsVar, "tabBaseInfoManager");
        vgh.c(this, "ShortVideoTabMessageHelper", "解注册来自视频Tab的消息，sender=" + str + "，names=" + list);
        if (!ckf.b(vv1Var.h(str), "video")) {
            vgh.c(this, "ShortVideoTabMessageHelper", "解注册来自视频Tab的消息，sender无效");
            return;
        }
        jmiVar.g(str, list, waVar);
        if (!jmiVar.a(str)) {
            h(str, ypsVar);
        }
    }

    public final void g(jmi jmiVar, vv1 vv1Var, String str, wa waVar, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da2a47c", new Object[]{this, jmiVar, vv1Var, str, waVar, ypsVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(str, "sender");
        ckf.g(waVar, "messageObserver");
        ckf.g(ypsVar, "tabBaseInfoManager");
        vgh.c(this, "ShortVideoTabMessageHelper", "解注册来自视频Tab的消息，sender=".concat(str));
        if (!ckf.b(vv1Var.h(str), "video")) {
            vgh.c(this, "ShortVideoTabMessageHelper", "解注册来自视频Tab的消息，sender无效");
            return;
        }
        jmiVar.h(str, waVar);
        if (!jmiVar.a(str)) {
            h(str, ypsVar);
        }
    }

    public final void h(String str, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1283cd", new Object[]{this, str, ypsVar});
            return;
        }
        vgh.c(this, "ShortVideoTabMessageHelper", "向Fluid实例解注册事件处理器，sender=" + str);
        lr9 g = ypsVar.g(str);
        if (g == null) {
            vgh.c(this, "ShortVideoTabMessageHelper", "向Fluid实例解注册事件处理器，未注册或已解注册");
            return;
        }
        String f = ypsVar.f(str);
        ur9.c(f, g);
        ypsVar.i(str, null);
        vgh.c(this, "ShortVideoTabMessageHelper", "向Fluid实例解注册事件处理器，解注册完成，fluidInstanceId=" + f + "，fluidMessageHandler=" + g);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements lr9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f18050a = "";
        public final /* synthetic */ jmi b;
        public final /* synthetic */ String c;
        public final /* synthetic */ vv1 d;

        public a(jmi jmiVar, String str, vv1 vv1Var) {
            this.b = jmiVar;
            this.c = str;
            this.d = vv1Var;
        }

        @Override // tb.lr9
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1e5941e2", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // tb.lr9
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("abcb7266", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // tb.lr9
        public void k(vrp vrpVar) {
            Map map;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff433aad", new Object[]{this, vrpVar});
                return;
            }
            vgh.c(this, "ShortVideoTabMessageHelper", "收到并处理视频Tab的消息，shortVideoMessage=" + vrpVar);
            if (vrpVar == null) {
                vgh.c(this, "ShortVideoTabMessageHelper", "收到并处理视频Tab的消息，shortVideoMessage为空");
                return;
            }
            Map a2 = vrpVar.a();
            if (a2 == null) {
                vgh.c(this, "ShortVideoTabMessageHelper", "收到并处理视频Tab的消息，shortVideoMessageMap为空");
                return;
            }
            if ("VSMSG_pageStateChanged".equals(vrpVar.c) && (map = vrpVar.h) != null) {
                Object obj = map.get("state");
                if (obj == null || (str = obj.toString()) == null) {
                    str = "";
                }
                if (str.equals(this.f18050a)) {
                    vgh.c(this, "ShortVideoTabMessageHelper", "收到并处理视频Tab的消息，过滤掉多余的pageState消息 ".concat(str));
                    return;
                }
                this.f18050a = str;
            }
            dsp.INSTANCE.c(this.b, this.d, new JSONObject(a2), this.c, null);
        }

        @Override // tb.lr9
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            }
        }

        @Override // tb.lr9
        public boolean j(vrp vrpVar) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("36367361", new Object[]{this, vrpVar})).booleanValue();
            }
            String str = vrpVar != null ? vrpVar.c : null;
            if (str == null || !this.b.b(this.c, str)) {
                z = false;
            }
            vgh.b(this, "ShortVideoTabMessageHelper", "过滤视频Tab的消息，name=" + str + "，result=" + z);
            return z;
        }
    }
}
