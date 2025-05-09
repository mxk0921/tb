package tb;

import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Pair;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IBindService;
import com.taobao.aranger.intf.IUnbindService;
import com.taobao.aranger.utils.FakeServiceCenter;
import com.taobao.atools.StaticHook;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wdp extends a02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Method d;
    public static Object e;
    public static Object f;
    public final String b;
    public final String c;

    static {
        t2o.a(393216040);
    }

    public wdp(Call call) throws IPCException {
        super(call);
        this.b = call.getServiceWrapper().getTimeStamp();
        this.c = call.getServiceWrapper().getName();
    }

    public static /* synthetic */ Object ipc$super(wdp wdpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/core/handler/reply/impl/ServiceReplyHandler");
    }

    @Override // tb.a02
    public Object b(final Object[] objArr) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("40032da0", new Object[]{this, objArr});
        }
        if (objArr == null || objArr.length == 0) {
            b5d.i("ServiceReplyHandler", "[ServiceReplyHandler][invoke] IllegalArgs", new Object[0]);
            return null;
        }
        g5d.b(true, true, new Runnable() { // from class: tb.vdp
            @Override // java.lang.Runnable
            public final void run() {
                wdp.this.e(objArr);
            }
        });
        return null;
    }

    public final void d(Service service) {
        try {
            if (d == null) {
                Field m = StaticHook.m(Class.forName(ProcessUtils.ACTIVITY_THREAD), "sCurrentActivityThread");
                m.setAccessible(true);
                f = m.get(null);
                Method g = StaticHook.g(ActivityManager.class, "getService", new Class[0]);
                if (g == null) {
                    g = StaticHook.g(Class.forName("android.app.ActivityManagerNative"), "getDefault", new Class[0]);
                }
                if (g != null) {
                    e = g.invoke(null, new Object[0]);
                }
                d = StaticHook.g(Service.class, Constants.Event.SLOT_LIFECYCLE.ATTACH, Context.class, ActivityThread.class, String.class, IBinder.class, Application.class, Object.class);
                b5d.i("ServiceReplyHandler", "attachService init", "amObj", e);
            }
            Method method = d;
            if (method == null) {
                b5d.i("ServiceReplyHandler", "attachService, attachMtd is null", new Object[0]);
            } else {
                method.invoke(service, re.r(), f, service.getClass().getName(), null, re.r(), e);
            }
        } catch (Throwable th) {
            b5d.h("ServiceReplyHandler", "attachService err", th, new Object[0]);
        }
    }

    public final /* synthetic */ void e(Object[] objArr) {
        IBinder iBinder;
        String str = this.c;
        String str2 = this.b;
        try {
            if (objArr.length == 3) {
                Object obj = objArr[0];
                if (obj instanceof Intent) {
                    Object obj2 = objArr[1];
                    if ((obj2 instanceof Integer) && (objArr[2] instanceof IBindService)) {
                        Intent intent = (Intent) obj;
                        int intValue = ((Integer) obj2).intValue();
                        IBindService iBindService = (IBindService) objArr[2];
                        FakeServiceCenter.FakeService c = FakeServiceCenter.a().c(str);
                        if (c == null) {
                            Service service = (Service) Class.forName(str).newInstance();
                            d(service);
                            FakeServiceCenter a2 = FakeServiceCenter.a();
                            FakeServiceCenter.FakeService fakeService = new FakeServiceCenter.FakeService(str2, service);
                            a2.e(str2, fakeService);
                            fakeService.onCreate();
                            c = fakeService;
                        }
                        Pair<Boolean, Boolean> a3 = c.a(intValue, intent);
                        b5d.i("ServiceReplyHandler", "invoke bind", "id", str2, "timeStamp", c.e(), "same intent", a3.first, "same conn", a3.second);
                        if (!((Boolean) a3.first).booleanValue()) {
                            iBinder = c.onBind(intent);
                        } else {
                            iBinder = c.b(intent);
                        }
                        if (!((Boolean) a3.second).booleanValue()) {
                            iBindService.onBind(c.e(), iBinder);
                            return;
                        }
                        return;
                    }
                }
            }
            if (objArr.length == 2) {
                Object obj3 = objArr[0];
                if ((obj3 instanceof Integer) && (objArr[1] instanceof IUnbindService)) {
                    int intValue2 = ((Integer) obj3).intValue();
                    IUnbindService iUnbindService = (IUnbindService) objArr[1];
                    FakeServiceCenter.FakeService b = FakeServiceCenter.a().b(str2);
                    if (b != null) {
                        b5d.i("ServiceReplyHandler", "invoke unbind", "timeStamp", str2);
                        b.g(intValue2);
                        if (b.f()) {
                            FakeServiceCenter.a().f(str2);
                            b.onDestroy();
                            iUnbindService.onDestroy();
                            return;
                        }
                        return;
                    }
                    b5d.i("ServiceReplyHandler", "invoke unbindService, FakeService not found", "timeStamp", str2);
                }
            }
        } catch (Throwable th) {
            b5d.h("ServiceReplyHandler", "[ServiceReplyHandler][invoke]", th, "timeStamp", str2);
        }
    }
}
