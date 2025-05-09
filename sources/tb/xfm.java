package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.wireless.link.pop.PopMessageData;
import com.taobao.wireless.link.pop.view.FullPopView;
import com.taobao.wireless.link.pop.view.TablePushView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xfm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static FullPopView f31356a;
    public static TablePushView b;
    public static WindowManager.LayoutParams c;
    public static WindowManager.LayoutParams d;
    public static WindowManager e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f31357a;
        public final /* synthetic */ PopMessageData b;

        public a(Context context, PopMessageData popMessageData) {
            this.f31357a = context;
            this.b = popMessageData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xfm.d(this.f31357a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f31358a;
        public final /* synthetic */ PopMessageData b;

        public b(Context context, PopMessageData popMessageData) {
            this.f31358a = context;
            this.b = popMessageData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xfm.d(this.f31358a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final xfm f31359a = new xfm(null);

        static {
            t2o.a(1030750314);
        }

        public static /* synthetic */ xfm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xfm) ipChange.ipc$dispatch("788e2797", new Object[0]);
            }
            return f31359a;
        }
    }

    static {
        t2o.a(1030750311);
    }

    public /* synthetic */ xfm(a aVar) {
        this();
    }

    public static WindowManager b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager) ipChange.ipc$dispatch("b86494d8", new Object[]{context});
        }
        if (e == null) {
            e = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        }
        return e;
    }

    public static xfm c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xfm) ipChange.ipc$dispatch("97e91dbc", new Object[0]);
        }
        return c.a();
    }

    public static void e(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("477a3c10", new Object[]{context, popMessageData});
            return;
        }
        a(context, popMessageData);
        FullPopView.updatePopView();
        mr4.b().a().postDelayed(new a(context, popMessageData), zhm.h(popMessageData));
    }

    public static void i(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd72696", new Object[]{context, popMessageData});
            return;
        }
        a(context, popMessageData);
        TablePushView.updateTablePush(context, popMessageData);
        mr4.b().a().postDelayed(new b(context, popMessageData), zhm.h(popMessageData));
    }

    public void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d23e317", new Object[]{this, context});
        } else {
            g(context, 0);
        }
    }

    public xfm() {
    }

    public static void a(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72cb840", new Object[]{context, popMessageData});
            return;
        }
        try {
            WindowManager b2 = b(context);
            int height = b2.getDefaultDisplay().getHeight();
            if (1 == popMessageData.messageType) {
                j(context, popMessageData, b2);
            } else {
                h(context, popMessageData, b2, height);
            }
        } catch (Throwable th) {
            if (popMessageData != null) {
                esg.b(esg.POP_EXPOSE_EXCEPTION, popMessageData.messageId, th.getMessage(), null);
            }
            irg.b("link_tag", "PopManager === createPop == 创建pop异常：" + th);
        }
    }

    public static void j(Context context, PopMessageData popMessageData, WindowManager windowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab704afd", new Object[]{context, popMessageData, windowManager});
            return;
        }
        if (b == null) {
            irg.a("link_tag", "PopManager === showTableView == 开始绘制桌面push");
            b = new TablePushView(context, popMessageData);
            if (d == null) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                d = layoutParams;
                layoutParams.x = zhm.b(10.0f);
                d.y = zhm.b(10.0f);
                if (Build.VERSION.SDK_INT >= 26) {
                    d.type = 2038;
                } else {
                    d.type = 2003;
                }
                WindowManager.LayoutParams layoutParams2 = d;
                layoutParams2.format = 1;
                layoutParams2.flags = 40;
                layoutParams2.gravity = 51;
                layoutParams2.width = TablePushView.viewWidth;
                d.height = TablePushView.viewHeight;
            }
            windowManager.addView(b, d);
        }
        esg.b(esg.TABLE_PUSH_EXPOSE, popMessageData.messageId, "", null);
        TaobaoRegister.exposureMessage(context, popMessageData.messageId, "");
        irg.a("link_tag", "PopManager === showTableView == 不需要绘制view");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.wireless.link.pop.view.FullPopView, java.util.Map, com.taobao.wireless.link.pop.view.TablePushView] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.content.Context r7, com.taobao.wireless.link.pop.PopMessageData r8) {
        /*
            r0 = 1
            r1 = 2
            java.lang.String r2 = "link_tag"
            java.lang.String r3 = "PopManager === removePopWindow == 移除桌面View异常:"
            java.lang.String r4 = "PopManager === removePopWindow == 移除桌面view,类型："
            com.android.alibaba.ip.runtime.IpChange r5 = tb.xfm.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001c
            java.lang.String r2 = "1559ec08"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r7
            r1[r0] = r8
            r5.ipc$dispatch(r2, r1)
            return
        L_0x001c:
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x0042
            r6.<init>(r4)     // Catch: all -> 0x0042
            int r4 = r8.messageType     // Catch: all -> 0x0042
            r6.append(r4)     // Catch: all -> 0x0042
            java.lang.String r4 = r6.toString()     // Catch: all -> 0x0042
            tb.irg.a(r2, r4)     // Catch: all -> 0x0042
            int r4 = r8.messageType     // Catch: all -> 0x0042
            if (r0 != r4) goto L_0x0044
            com.taobao.wireless.link.pop.view.TablePushView r0 = tb.xfm.b     // Catch: all -> 0x0042
            if (r0 == 0) goto L_0x0055
            android.view.WindowManager r7 = b(r7)     // Catch: all -> 0x0042
            com.taobao.wireless.link.pop.view.TablePushView r0 = tb.xfm.b     // Catch: all -> 0x0042
            r7.removeView(r0)     // Catch: all -> 0x0042
            tb.xfm.b = r5     // Catch: all -> 0x0042
            goto L_0x0055
        L_0x0042:
            r7 = move-exception
            goto L_0x005a
        L_0x0044:
            if (r1 != r4) goto L_0x0055
            com.taobao.wireless.link.pop.view.FullPopView r0 = tb.xfm.f31356a     // Catch: all -> 0x0042
            if (r0 == 0) goto L_0x0055
            android.view.WindowManager r7 = b(r7)     // Catch: all -> 0x0042
            com.taobao.wireless.link.pop.view.FullPopView r0 = tb.xfm.f31356a     // Catch: all -> 0x0042
            r7.removeView(r0)     // Catch: all -> 0x0042
            tb.xfm.f31356a = r5     // Catch: all -> 0x0042
        L_0x0055:
            tb.xfm.f31356a = r5
            tb.xfm.b = r5
            goto L_0x007b
        L_0x005a:
            if (r8 == 0) goto L_0x006b
            java.lang.String r0 = "pop_disappear_exception"
            java.lang.String r8 = r8.messageId     // Catch: all -> 0x0069
            java.lang.String r1 = r7.getMessage()     // Catch: all -> 0x0069
            tb.esg.b(r0, r8, r1, r5)     // Catch: all -> 0x0069
            goto L_0x006b
        L_0x0069:
            r7 = move-exception
            goto L_0x007c
        L_0x006b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: all -> 0x0069
            r8.<init>(r3)     // Catch: all -> 0x0069
            r8.append(r7)     // Catch: all -> 0x0069
            java.lang.String r7 = r8.toString()     // Catch: all -> 0x0069
            tb.irg.b(r2, r7)     // Catch: all -> 0x0069
            goto L_0x0055
        L_0x007b:
            return
        L_0x007c:
            tb.xfm.f31356a = r5
            tb.xfm.b = r5
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xfm.d(android.content.Context, com.taobao.wireless.link.pop.PopMessageData):void");
    }

    public void g(Context context, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5758f2cc", new Object[]{this, context, new Integer(i)});
            return;
        }
        irg.a("link_tag", "PopManager === showMessage == 开始消息校验");
        PopMessageData d2 = zhm.d(context);
        if (d2 != null) {
            int i2 = d2.messageType;
            if (i2 == 1) {
                str = aqg.g(context, "openPushMessageDispose", "true");
            } else if (i2 == 2) {
                str = aqg.g(context, "openPopMessageDispose", "true");
            } else {
                str = "true";
            }
            if (TextUtils.equals(str, "false")) {
                irg.a("link_tag", "PopManager === showMessage == 开关关闭，不展示pop消息");
                return;
            }
        }
        if (!agm.a().b(context, i, d2)) {
            irg.a("link_tag", "PopManager === showMessage == 校验失败，不展示pop消息");
            return;
        }
        if (!Boolean.parseBoolean(aqg.g(context, "popMessageInternalDisable", "true"))) {
            long j = 0;
            long longValue = ((Long) cno.b(context).a("msg_last_show_time", 0L)).longValue();
            try {
                j = Long.parseLong(aqg.g(context, "messageInterval", "10"));
            } catch (Exception e2) {
                irg.b("link_tag", "PopManager === showMessage == 类型转换异常：" + e2);
            }
            if (!ypg.e().f() && jsg.f() - longValue < 60000 * j) {
                irg.a("link_tag", "PopManager === showMessage == 距离上次显示小于" + j + "分钟，不显示pop");
                return;
            }
        }
        acm.a(d2.messageType).b(context, d2);
        zhm.a(context);
    }

    public static void h(Context context, PopMessageData popMessageData, WindowManager windowManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6a7883", new Object[]{context, popMessageData, windowManager, new Integer(i)});
        } else if (f31356a == null) {
            irg.a("link_tag", "PopManager === showTableView == 开始绘制全屏pop");
            f31356a = new FullPopView(context, popMessageData);
            if (c == null) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                c = layoutParams;
                layoutParams.x = 0;
                layoutParams.y = (i / 2) - (FullPopView.viewHeight / 2);
                if (Build.VERSION.SDK_INT >= 26) {
                    c.type = 2038;
                } else {
                    c.type = 2003;
                }
                WindowManager.LayoutParams layoutParams2 = c;
                layoutParams2.format = 1;
                layoutParams2.flags = 40;
                layoutParams2.gravity = 51;
                layoutParams2.width = FullPopView.viewWidth;
                c.height = FullPopView.viewHeight;
            }
            windowManager.addView(f31356a, c);
            esg.b(esg.ARG1_FULL_POP_EXPOSE, "", "", null);
            TaobaoRegister.exposureMessage(context, popMessageData.messageId, "");
        }
    }
}
