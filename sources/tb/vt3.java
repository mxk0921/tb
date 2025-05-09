package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.wireless.link.model.MessageData;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vt3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f30239a = 0;
    public static boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f30240a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        public a(Context context, String str, int i) {
            this.f30240a = context;
            this.b = str;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Toast.makeText(this.f30240a, "长按2秒前往关闭小助手", 1).show();
            String str = this.b;
            esg.b(esg.ARG1_ASSISTANT_TOAST, str, this.c + "", new HashMap());
        }
    }

    static {
        t2o.a(1030750229);
    }

    public static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a68b5b6f", new Object[]{context, str, str2});
        }
        nd1 e = qd1.e(context, cno.b(context), qd1.k(context), str2);
        if (e == null || TextUtils.isEmpty(e.f24653a)) {
            return str;
        }
        return e.f24653a;
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd8835", new Object[]{context});
            return;
        }
        boolean uri = Nav.from(context).toUri("http://m.taobao.com/go/mytaobaocommonsettings");
        irg.a("link_tag", "ClickCenter === longClick === 跳设置页面结果=" + uri);
        String f = md1.h().f(context);
        esg.b(esg.ARG1_ASSISTANT_LONG_CLICK, f, uri + "", new HashMap());
    }

    public static void c(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef702fda", new Object[]{context});
        } else if (jsg.n(3000L)) {
            irg.a("link_tag", "NotificationBroadcastReceiver === onReceive 时间间隔小于5s，不处理");
        } else {
            MessageData g = qd1.g(cno.b(context));
            boolean m = qd1.m(context, g);
            if (TextUtils.isEmpty(g.activity_id)) {
                g.activity_id = md1.h().f(context);
            }
            if (m) {
                str = a(context, "https%3A%2F%2Fm.taobao.com%2Findex.htm", g.activity_id);
            } else if (!jsg.p(g.msg_arrive_time, g.validTime)) {
                str = a(context, "https%3A%2F%2Fm.taobao.com%2Findex.htm", "https%3A%2F%2Fm.taobao.com%2Findex.htm");
            } else {
                str = g.assistant_click_url;
            }
            irg.a("link_tag", "ClickCenter === performClick === 点击小助手，url=" + str);
            HashMap hashMap = new HashMap();
            hashMap.put("click_url", str);
            esg.b(esg.ARG1_ASSISTANT_CLICK, g.activity_id, g.message_id, hashMap);
            f30239a = ((Integer) cno.b(context).a("growth_assistant_first_click_" + qd1.k(context), 0)).intValue();
            irg.a("link_tag", "ClickCenter === performClick === 当前点击次数=" + f30239a);
            b = true;
            jsg.v(context, "tbopen://m.taobao.com/tbopen/index.html?source=auto&action=ali.open.nav&module=h5&bc_fl_src=growth_dhh_2200803434487_android-assistant-1069565676&h5Url=" + str, str, "assistant_" + g.activity_id, g.message_id);
            d(context, g.activity_id);
        }
    }

    public static void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b2e41", new Object[]{context, str});
            return;
        }
        String k = qd1.k(context);
        cno b2 = cno.b(context);
        int intValue = ((Integer) b2.a("growth_assistant_toast_" + k, 0)).intValue();
        irg.a("link_tag", "ClickCenter === showToast === toast显示次数=" + intValue);
        if (intValue < 3) {
            cno b3 = cno.b(context);
            b3.d("growth_assistant_toast_" + k, Integer.valueOf(1 + intValue));
            mr4.b().a().postDelayed(new a(context, str, intValue), Constants.STARTUP_TIME_LEVEL_1);
        }
    }
}
