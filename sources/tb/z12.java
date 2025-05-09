package tb;

import android.app.Application;
import android.app.KeyguardManager;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.z12;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class z12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final com.taobao.desktop.channel.desktoplinktask.floatwindow.a f32455a = new com.taobao.desktop.channel.desktoplinktask.floatwindow.a();

    static {
        t2o.a(435159116);
    }

    public abstract void b(shx shxVar);

    public abstract JSONObject c(shx shxVar);

    public final void d(shx shxVar) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("498b6b0d", new Object[]{this, shxVar});
            return;
        }
        agu aguVar = shxVar.f28064a;
        if (!e(shxVar) || (b = lo9.d().b(aguVar.c)) == null || b.isEmpty()) {
            JSONObject c = c(shxVar);
            if (c != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(g());
                wd7.b("androidFloatWindow", arrayList, c, false, new a(aguVar, shxVar), null, null);
                b(shxVar);
                return;
            }
            return;
        }
        j(shxVar, b);
    }

    public abstract boolean e(shx shxVar);

    public abstract String g();

    public abstract void i(shx shxVar, String str);

    public abstract void j(shx shxVar, JSONObject jSONObject);

    public void k(agu aguVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6dab00", new Object[]{this, aguVar, str, str2, str3});
            return;
        }
        abu.e(aguVar.f15730a, aguVar.c, aguVar.d, str, str2, str3);
        try {
            yv8.e("TaskProcessor.onFailed.bizCode=%s.closeStep=%s.failReason=%s.failMessage=%s", aguVar.c, str, str2, str3);
            y2e y2eVar = aguVar.f;
            if (y2eVar != null) {
                y2eVar.a(aguVar, str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void l(shx shxVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce77fd7a", new Object[]{this, shxVar, str, str2, str3});
        } else if (shxVar != null) {
            k(shxVar.f28064a, str, str2, str3);
            ep9.h().f(shxVar);
        }
    }

    public void m(shx shxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46e84cc4", new Object[]{this, shxVar});
            return;
        }
        try {
            agu aguVar = shxVar.f28064a;
            yv8.e("TaskProcessor.onSuccess.bizCode=%s", aguVar.c);
            y2e y2eVar = aguVar.f;
            if (y2eVar != null) {
                y2eVar.c(aguVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void n(Messenger messenger, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9da624", new Object[]{this, messenger, new Integer(i), bundle});
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = i;
            if (bundle != null) {
                obtain.setData(bundle);
            }
            messenger.send(obtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void o(final agu aguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f91d475e", new Object[]{this, aguVar});
        } else {
            lst.a(new Runnable() { // from class: tb.x12
                @Override // java.lang.Runnable
                public final void run() {
                    z12.this.h(aguVar);
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements yyb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ agu f32456a;
        public final /* synthetic */ shx b;

        public a(agu aguVar, shx shxVar) {
            this.f32456a = aguVar;
            this.b = shxVar;
        }

        @Override // tb.yyb
        public void b(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad91c6f4", new Object[]{this, str});
                return;
            }
            final agu aguVar = this.f32456a;
            final shx shxVar = this.b;
            lst.a(new Runnable() { // from class: tb.y12
                @Override // java.lang.Runnable
                public final void run() {
                    z12.a.this.d(aguVar, shxVar, str);
                }
            });
        }

        @Override // tb.yyb
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da277f39", new Object[]{this, str});
                return;
            }
            try {
                yv8.e("requestData.onError.retMsg=%s", str);
                z12.this.i(this.b, str);
            } catch (Throwable th) {
                yv8.b("DesktopRequest.fetchDSL.MTOP.onError.error.", th);
            }
        }

        public final /* synthetic */ void d(agu aguVar, shx shxVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cda1bc8a", new Object[]{this, aguVar, shxVar, str});
                return;
            }
            try {
                abu.f(aguVar.f15730a, aguVar.c, aguVar.d);
                if (shxVar.a()) {
                    yv8.e("requestData.onSuccess.butIsClosed.bizCode=%s.", aguVar.c);
                    return;
                }
                yv8.e("requestData.onSuccess.response=%s", str);
                if (TextUtils.isEmpty(str)) {
                    z12.this.l(shxVar, abu.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.NoResponse", "");
                    return;
                }
                JSONObject c = lo9.d().c(JSON.parseObject(str));
                if (c == null) {
                    z12.this.l(shxVar, abu.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.NoContent", "");
                } else {
                    z12.this.j(shxVar, c);
                }
            } catch (Throwable th) {
                yv8.b("DesktopRequest.fetchDSL.MTOP.onSuccess.error.", th);
                z12.this.l(shxVar, abu.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.catchError", th.getMessage());
            }
        }
    }

    public boolean f(agu aguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fee2c86f", new Object[]{this, aguVar})).booleanValue();
        }
        Application a2 = sd7.d().a();
        if (zd7.f(a2)) {
            k(aguVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "filterWindowEnv.checkBackgroundFailed", "");
            return false;
        } else if (!zd7.a(a2)) {
            k(aguVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "filterWindowEnv.checkFloatPermissionNotPass", "");
            return false;
        } else {
            dhb b = j9t.e(sd7.d().a(), "desktop_service").b();
            if (b != null && !((Boolean) b.d("desktop_service", "desktop_float_window", Boolean.TRUE, null)).booleanValue()) {
                k(aguVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "filterWindowEnv.checkSettingsUserSwitchFailed", "");
                return false;
            } else if (!((PowerManager) a2.getSystemService("power")).isScreenOn()) {
                k(aguVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "filterWindowEnv.checkIsScreenOnFailed", "");
                return false;
            } else if (((KeyguardManager) a2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                k(aguVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "filterWindowEnv.checkIsScreenLockedFailed", "");
                return false;
            } else {
                Pair<Integer, Integer> e = zd7.e(a2);
                if (((Integer) e.second).intValue() > ((Integer) e.first).intValue()) {
                    return true;
                }
                k(aguVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "filterWindowEnv.checkIsDevicePortraitScapeFailed", "");
                return false;
            }
        }
    }

    public final /* synthetic */ void h(agu aguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d5eeb1", new Object[]{this, aguVar});
            return;
        }
        try {
            String str = aguVar.c;
            shx shxVar = new shx(aguVar);
            if (TextUtils.isEmpty(str) || ep9.h().c(shxVar)) {
                yv8.e("TaskProcessor.triggerType=%s", Integer.valueOf(aguVar.f15730a));
                d(shxVar);
                return;
            }
            yv8.a("popUpWindow.addNewRequestFailed.sameBizCode.AlreadyPopping.cancel.bizCode=%s", str);
            k(aguVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "triggerFailed.trigger.AlreadyPopping", "");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
