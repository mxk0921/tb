package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.assistant.display.AssistantCheckService;
import com.taobao.wireless.link.assistant.display.AssistantView;
import com.taobao.wireless.link.model.MessageData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class br7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16563a;
    public static AssistantView b;
    public static WindowManager.LayoutParams c;
    public static WindowManager d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16564a;

        public a(Context context) {
            this.f16564a = context;
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
            MessageData i = qd1.i(cno.b(this.f16564a));
            if (i.activity_id == null) {
                Context context = this.f16564a;
                nd1 e = qd1.e(context, cno.b(context), qd1.k(this.f16564a), md1.h().f(this.f16564a));
                if (!(e == null || (str = e.b) == null || (str2 = e.c) == null)) {
                    i.assistant_logo_url = str2;
                    i.activity_id = str;
                }
            }
            if (!jsg.o(this.f16564a) && br7.a() != null) {
                if (!vt3.b) {
                    br7.a().setVisibility(8);
                    return;
                } else if (vt3.f30239a >= 3) {
                    br7.a().setVisibility(8);
                    return;
                }
            }
            br7.g(this.f16564a, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16565a;
        public final /* synthetic */ MessageData b;

        public b(Context context, MessageData messageData) {
            this.f16565a = context;
            this.b = messageData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            irg.a("link_tag", "DisplayCenter === showAssistant === 开始复原");
            AssistantView.updateAssistantView(4, "", qd1.f(this.f16565a, this.b));
            br7.b(false);
        }
    }

    static {
        t2o.a(1030750241);
    }

    public static /* synthetic */ AssistantView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssistantView) ipChange.ipc$dispatch("1fe20140", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        f16563a = z;
        return z;
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2948567", new Object[]{context});
            return;
        }
        if (!jsg.r(context, AssistantCheckService.class.getName())) {
            irg.a("link_tag", "DisplayCenter === drawAssistant === service未存活，开启轮询");
            try {
                context.startService(new Intent(context, AssistantCheckService.class));
            } catch (Exception e) {
                irg.b("link_tag", "DisplayCenter === drawAssistant === service未存活，开启失败：" + e);
            }
        }
        mr4.b().a().post(new a(context));
    }

    public static WindowManager e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager) ipChange.ipc$dispatch("b86494d8", new Object[]{context});
        }
        if (d == null) {
            d = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        }
        return d;
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32419617", new Object[]{context});
            return;
        }
        try {
            if (b != null) {
                e(context).removeView(b);
                b = null;
            }
        } catch (Exception e) {
            irg.a("link_tag", "DisplayCenter === removeAssistantWindow === 移除小助手异常=" + e.getMessage());
            esg.b(esg.ARG1_ASSISTANT_REMOVE_EXCEPTION, "", "", null);
        }
    }

    public static void c(Context context, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cdc274a", new Object[]{context, messageData});
            return;
        }
        try {
            WindowManager e = e(context);
            int width = e.getDefaultDisplay().getWidth();
            int height = e.getDefaultDisplay().getHeight();
            if (b == null) {
                irg.a("link_tag", "DisplayCenter === createAssistantWindow === 小助手View不存在开始创建");
                b = new AssistantView(context);
                if (c == null) {
                    c = new WindowManager.LayoutParams();
                    if (Build.VERSION.SDK_INT >= 26) {
                        c.type = 2038;
                    } else {
                        c.type = 2003;
                    }
                    WindowManager.LayoutParams layoutParams = c;
                    layoutParams.format = 1;
                    layoutParams.flags = 40;
                    layoutParams.gravity = 51;
                    layoutParams.width = AssistantView.viewWidth;
                    c.height = AssistantView.viewHeight;
                    WindowManager.LayoutParams layoutParams2 = c;
                    layoutParams2.x = width;
                    layoutParams2.y = height / 2;
                }
                b.setParams(c);
                e.addView(b, c);
                irg.a("link_tag", "DisplayCenter === createAssistantWindow === 小助手View创建成功");
                esg.b(esg.ARG1_ASSISTANT_EXPOSE, messageData.activity_id, "", null);
            }
        } catch (Exception unused) {
            if (messageData != null) {
                esg.b(esg.ARG1_ASSISTANT_EXPOSE_EXCEPTION, messageData.message_id, "", null);
            }
        }
    }

    public static void g(Context context, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e928279b", new Object[]{context, messageData});
            return;
        }
        AssistantView assistantView = b;
        if (assistantView != null) {
            assistantView.setVisibility(0);
        }
        boolean z = messageData.activity_id == null || qd1.m(context, messageData) || !jsg.p(messageData.msg_arrive_time, messageData.validTime);
        irg.a("link_tag", "DisplayCenter === showAssistant === isDefault=" + z);
        c(context, messageData);
        if (!z) {
            f16563a = true;
            AssistantView.updateAssistantView(0, messageData.assistant_title, messageData.assistant_pic_url);
            mr4.b().a().postDelayed(new b(context, messageData), qd1.d(messageData));
        } else if (!f16563a) {
            AssistantView.updateAssistantView(4, messageData.assistant_title, qd1.f(context, messageData));
        }
        qd1.A(cno.b(context));
    }
}
