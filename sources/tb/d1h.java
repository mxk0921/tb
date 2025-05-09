package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.a;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d1h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements a.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17501a;
        public final /* synthetic */ jmi b;

        public a(String str, jmi jmiVar) {
            this.f17501a = str;
            this.b = jmiVar;
        }

        @Override // com.taobao.android.tab2liveroom.liveroom.a.f
        public void a(Map map, Map map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ff9944", new Object[]{this, map, map2});
                return;
            }
            b5h a2 = b5h.Companion.a(map, map2, System.currentTimeMillis(), this.f17501a, "Interact", null);
            if (a2 != null) {
                this.b.e(a2);
            }
        }
    }

    static {
        t2o.a(689963244);
    }

    public static void a(jmi jmiVar, vv1 vv1Var, String str, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d36124", new Object[]{jmiVar, vv1Var, str, ypsVar});
            return;
        }
        vgh.c(null, "LiveMessageHelper", "向直播注册事件处理器，sender:" + str);
        if (ypsVar.e(str) != null) {
            vgh.c(null, "LiveMessageHelper", "向直播注册事件处理器，已注册");
            return;
        }
        com.taobao.android.tab2liveroom.liveroom.a d = ypsVar.d(str);
        if (d == null) {
            vgh.c(null, "LiveMessageHelper", "向直播注册事件处理器，没有livecomponent");
            return;
        }
        a aVar = new a(str, jmiVar);
        d.W(aVar);
        ypsVar.h(str, aVar);
    }

    public static void b(jmi jmiVar, vv1 vv1Var, String str, List<String> list, wa waVar, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b432977", new Object[]{jmiVar, vv1Var, str, list, waVar, ypsVar});
            return;
        }
        vgh.c(null, "LiveMessageHelper", "注册来自视频Tab的消息，sender=" + str + "，names=" + list);
        if (!"live".equals(vv1Var.h(str))) {
            vgh.c(null, "LiveMessageHelper", "注册来自视频Tab的消息，sender无效");
            return;
        }
        jmiVar.d(str, list, waVar);
        a(jmiVar, vv1Var, str, ypsVar);
    }

    public static void c(String str, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e36a320", new Object[]{str, ypsVar});
            return;
        }
        vgh.c(null, "LiveMessageHelper", "向直播解注册事件处理器，sender:" + str);
        a.f e = ypsVar.e(str);
        if (e == null) {
            vgh.c(null, "LiveMessageHelper", "向直播解注册事件处理器，未注册或已解注册");
            return;
        }
        com.taobao.android.tab2liveroom.liveroom.a d = ypsVar.d(str);
        if (d == null) {
            vgh.c(null, "LiveMessageHelper", "向直播解注册事件处理器，没有livecomponent");
            return;
        }
        d.Y(e);
        ypsVar.h(str, null);
    }

    public static void d(jmi jmiVar, vv1 vv1Var, String str, List<String> list, wa waVar, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1204967e", new Object[]{jmiVar, vv1Var, str, list, waVar, ypsVar});
            return;
        }
        vgh.c(null, "LiveMessageHelper", "解注册来自直播Tab的消息，sender=" + str + "names=" + list);
        if (!"live".equals(vv1Var.h(str))) {
            vgh.c(null, "LiveMessageHelper", "解注册来自直播Tab的消息，sender无效");
            return;
        }
        jmiVar.g(str, list, waVar);
        if (!jmiVar.a(str)) {
            c(str, ypsVar);
        }
    }
}
