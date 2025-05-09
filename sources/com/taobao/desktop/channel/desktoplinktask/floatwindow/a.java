package com.taobao.desktop.channel.desktoplinktask.floatwindow;

import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.a;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.model.WindowStyleModel;
import tb.abu;
import tb.agu;
import tb.bp9;
import tb.ep9;
import tb.lst;
import tb.mg8;
import tb.sd7;
import tb.shx;
import tb.t2o;
import tb.yv8;
import tb.zd7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.desktop.channel.desktoplinktask.floatwindow.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0549a implements bp9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10321a;
        public final /* synthetic */ WindowStyleModel b;

        public C0549a(b bVar, WindowStyleModel windowStyleModel) {
            this.f10321a = bVar;
            this.b = windowStyleModel;
        }

        public final /* synthetic */ void g(shx shxVar, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af9b87e6", new Object[]{this, shxVar, bVar});
                return;
            }
            try {
                a.a(a.this, shxVar);
                if (bVar != null) {
                    bVar.d();
                }
            } catch (Throwable th) {
                yv8.b("popUpWindow.onNeedClosed.error", th);
            }
        }

        public static /* synthetic */ void j(shx shxVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("214692a7", new Object[]{shxVar, view});
                return;
            }
            try {
                if (shxVar == null) {
                    yv8.a("popUpWindow.onSwitchState.windowViewRef=null", new Object[0]);
                    return;
                }
                FloatWindow floatWindow = shxVar.b;
                if (floatWindow == null) {
                    yv8.e("popUpWindow.onSwitchState.floatWindow=null", new Object[0]);
                } else {
                    floatWindow.L(view);
                }
            } catch (Throwable th) {
                yv8.b("popUpWindow.onSwitchState.error", th);
            }
        }

        public final /* synthetic */ void h(shx shxVar, b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c7febe", new Object[]{this, shxVar, bVar, str});
                return;
            }
            try {
                if (shxVar == null) {
                    yv8.e("popUpWindow.onRenderFailed.windowViewRef=null", new Object[0]);
                    return;
                }
                boolean b = shxVar.b();
                a.a(a.this, shxVar);
                yv8.e("popUpWindow.onRenderFailed.close.", new Object[0]);
                if (!b && bVar != null) {
                    bVar.e(str);
                }
            } catch (Throwable th) {
                yv8.b("popUpWindow.onRenderFailed.error", th);
            }
        }

        public final /* synthetic */ void i(View view, WindowStyleModel windowStyleModel, final shx shxVar, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d369a769", new Object[]{this, view, windowStyleModel, shxVar, bVar});
                return;
            }
            try {
                FloatWindow b = a.b(a.this, sd7.d().a(), view, windowStyleModel, new FloatWindow.b() { // from class: tb.qo9
                    @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow.b
                    public final void a(int i, JSONObject jSONObject) {
                        a.C0549a.f(shx.this, i, jSONObject);
                    }
                });
                shxVar.b = b;
                if (b == null) {
                    bVar.e("popUpWindowFailed.onRenderSuccess.createFloatWindowFailed");
                } else if (shxVar.f28064a.a() || a.c(a.this, bVar)) {
                    boolean d = a.d(a.this, shxVar);
                    if (bVar != null) {
                        if (d) {
                            bVar.f();
                        } else {
                            a.a(a.this, shxVar);
                            bVar.e("displayFailed");
                        }
                    }
                    yv8.e("popUpWindow.onRenderSuccess.onViewAdded.", new Object[0]);
                }
            } catch (Throwable th) {
                yv8.b("popUpWindow.onRenderSuccess.error", th);
            }
        }

        public void n(final shx shxVar, final View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4531a94", new Object[]{this, shxVar, view});
                return;
            }
            yv8.e("popUpWindow.onSwitchState.", new Object[0]);
            lst.b(new Runnable() { // from class: tb.mo9
                @Override // java.lang.Runnable
                public final void run() {
                    a.C0549a.j(shx.this, view);
                }
            });
        }

        public void m(final shx shxVar, final View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0cae504", new Object[]{this, shxVar, view});
                return;
            }
            yv8.e("popUpWindow.onRenderSuccess.stateViewIsNotNull=%s", Boolean.valueOf(view != null));
            if (view == null) {
                this.f10321a.e("popUpWindowFailed.onRenderSuccess.viewIsNull");
                return;
            }
            final WindowStyleModel windowStyleModel = this.b;
            final b bVar = this.f10321a;
            lst.b(new Runnable() { // from class: tb.po9
                @Override // java.lang.Runnable
                public final void run() {
                    a.C0549a.this.i(view, windowStyleModel, shxVar, bVar);
                }
            });
        }

        public static /* synthetic */ void f(shx shxVar, int i, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3983b171", new Object[]{shxVar, new Integer(i), jSONObject});
                return;
            }
            try {
                yv8.a("FloatWindow.onGestureStatusChange.event=%s.params=%s", Integer.valueOf(i), jSONObject);
                if (!shxVar.a()) {
                    String b = mg8.b(i);
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sourceName", (Object) "FloatWindow");
                    jSONObject2.put("event", (Object) b);
                    jSONObject2.put("content", (Object) jSONObject);
                    bp9 bp9Var = shxVar.c;
                    if (bp9Var != null) {
                        bp9Var.N(b, jSONObject);
                        shxVar.c.J(mg8.a(i), jSONObject2);
                    }
                }
            } catch (Throwable th) {
                yv8.b("onGestureStatusChange.error", th);
            }
        }

        public void k(final shx shxVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8f930d5", new Object[]{this, shxVar, str, str2});
                return;
            }
            yv8.e("popUpWindow.onNeedClosed.reason=%s.closeMessage=%s", str, str2);
            final b bVar = this.f10321a;
            lst.b(new Runnable() { // from class: tb.oo9
                @Override // java.lang.Runnable
                public final void run() {
                    a.C0549a.this.g(shxVar, bVar);
                }
            });
        }

        public void l(final shx shxVar, final String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9af8b26", new Object[]{this, shxVar, str, str2});
                return;
            }
            yv8.e("popUpWindow.onRenderFailed.reason=%s.errorMessage=%s", str, str2);
            final b bVar = this.f10321a;
            lst.b(new Runnable() { // from class: tb.no9
                @Override // java.lang.Runnable
                public final void run() {
                    a.C0549a.this.h(shxVar, bVar, str);
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void d();

        void e(String str);

        void f();
    }

    static {
        t2o.a(435159064);
    }

    public static /* synthetic */ void a(a aVar, shx shxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fef699", new Object[]{aVar, shxVar});
        } else {
            aVar.f(shxVar);
        }
    }

    public static /* synthetic */ FloatWindow b(a aVar, Context context, View view, WindowStyleModel windowStyleModel, FloatWindow.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatWindow) ipChange.ipc$dispatch("1de92acf", new Object[]{aVar, context, view, windowStyleModel, bVar});
        }
        return aVar.g(context, view, windowStyleModel, bVar);
    }

    public static /* synthetic */ boolean c(a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("409f1c1b", new Object[]{aVar, bVar})).booleanValue();
        }
        return aVar.e(bVar);
    }

    public static /* synthetic */ boolean d(a aVar, shx shxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e5cd33a", new Object[]{aVar, shxVar})).booleanValue();
        }
        return aVar.h(shxVar);
    }

    public final void f(shx shxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb5098", new Object[]{this, shxVar});
        } else {
            ep9.h().f(shxVar);
        }
    }

    public final boolean h(shx shxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6657c6e6", new Object[]{this, shxVar})).booleanValue();
        }
        if (shxVar != null) {
            try {
                if (shxVar.d()) {
                    if (shxVar.a()) {
                        yv8.e("display.windowRequest.butIsClosed", new Object[0]);
                        return false;
                    }
                    shxVar.b.K();
                    shxVar.f(true);
                    agu aguVar = shxVar.f28064a;
                    abu.d(aguVar.f15730a, aguVar.c, aguVar.d);
                    return true;
                }
            } catch (Throwable th) {
                yv8.b("FloatWindowManager.display.byRequest.error", th);
                return false;
            }
        }
        yv8.e("display.windowRequest.invalid", new Object[0]);
        return false;
    }

    public final int i(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("355ded39", new Object[]{this, context, str})).intValue();
        }
        try {
            return (int) zd7.d(context, Float.parseFloat(str));
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public void j(shx shxVar, String str, String str2, WindowStyleModel windowStyleModel, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a966f473", new Object[]{this, shxVar, str, str2, windowStyleModel, bVar});
            return;
        }
        agu aguVar = shxVar.f28064a;
        if (aguVar != null && !TextUtils.isEmpty(aguVar.c)) {
            bp9 bp9Var = new bp9(sd7.d().a(), shxVar, str, str2, null, new C0549a(bVar, windowStyleModel));
            shxVar.c = bp9Var;
            bp9Var.L();
        }
    }

    public final boolean e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b2554a2", new Object[]{this, bVar})).booleanValue();
        }
        Application a2 = sd7.d().a();
        if (zd7.f(a2)) {
            bVar.e("checkEnvBeforeDisplay.checkBackgroundFailed");
            return false;
        } else if (!((PowerManager) a2.getSystemService("power")).isScreenOn()) {
            bVar.e("checkEnvBeforeDisplay.checkIsScreenOnFailed");
            return false;
        } else if (((KeyguardManager) a2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            bVar.e("checkEnvBeforeDisplay.checkIsScreenLockedFailed");
            return false;
        } else {
            Pair<Integer, Integer> e = zd7.e(a2);
            if (((Integer) e.second).intValue() > ((Integer) e.first).intValue()) {
                return true;
            }
            bVar.e("checkEnvBeforeDisplay.checkIsDevicePortraitScapeFailed");
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0105, code lost:
        if (r15 > 0.0f) goto L_0x0107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow g(android.content.Context r18, android.view.View r19, com.taobao.desktop.channel.desktoplinktask.floatwindow.model.WindowStyleModel r20, com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow.b r21) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.channel.desktoplinktask.floatwindow.a.g(android.content.Context, android.view.View, com.taobao.desktop.channel.desktoplinktask.floatwindow.model.WindowStyleModel, com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow$b):com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow");
    }
}
