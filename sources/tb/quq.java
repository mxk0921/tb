package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class quq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, ISubService> f26940a = new HashMap<>(64);
    public final HashMap<Class, String> b = new HashMap<>(64);

    static {
        t2o.a(486539328);
    }

    public final void a(HashMap<String, ISubService> hashMap, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed51bf9", new Object[]{this, hashMap, list});
            return;
        }
        for (String str : list) {
            if (!hashMap.containsKey(str)) {
                k("子服务：" + str + " 必须注册！", null);
            }
        }
    }

    public final void b(String str, ISubService iSubService, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b681544", new Object[]{this, str, iSubService, cfcVar});
            return;
        }
        eve.c("createService", str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            iSubService.onCreateService(new pue(cfcVar, iSubService.getClass()));
        } catch (Exception unused) {
            ive.a(new zue("infoFlow", "subServiceCreate", cpr.MSG_TYPE_MEDIADATA, "sub service create failed", "子服务创建发生crash , serviceName: " + str + ", subService : " + iSubService));
            StringBuilder sb = new StringBuilder("子服务创建发生crash, serviceName: ");
            sb.append(str);
            Log.e("SubServiceManager", sb.toString());
        }
        eve.b("createService", str);
        fve.e("SubServiceManager", "创建服务: " + str + ", 耗时: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        StringBuilder sb2 = new StringBuilder("创建服务: ");
        sb2.append(str);
        Log.e("SubServiceManager", sb2.toString());
    }

    public final void c(String str, ISubService iSubService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b052e8fa", new Object[]{this, str, iSubService});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        iSubService.onDestroyService();
        fve.e("SubServiceManager", "销毁服务: " + str + ", 耗时: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        StringBuilder sb = new StringBuilder("销毁服务: ");
        sb.append(str);
        Log.e("SubServiceManager", sb.toString());
    }

    public <T extends ISubService> T d(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ISubService) ipChange.ipc$dispatch("3e2437be", new Object[]{this, cls}));
        }
        if (!cls.isInterface()) {
            fve.e("SubServiceManager", "findSubService error, classType 必须为 interface");
            return null;
        }
        String e = e(cls);
        if (TextUtils.isEmpty(e)) {
            fve.e("SubServiceManager", "不是符合服务定义，缺少 SERVICE_NAME 声明： ".concat(cls.getSimpleName()));
            return null;
        }
        T t = (T) this.f26940a.get(e);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public final String e(Class<? extends ISubService> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11060bf4", new Object[]{this, cls});
        }
        String str = this.b.get(cls);
        if (str != null) {
            return str;
        }
        String i = i(cls);
        this.b.put(cls, i);
        return i;
    }

    public void f(cfc cfcVar, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1de577b", new Object[]{this, cfcVar, list});
            return;
        }
        fve.e("SubServiceManager", "服务总数：" + this.f26940a.size());
        a(this.f26940a, list);
        for (String str : list) {
            ISubService iSubService = this.f26940a.get(str);
            if (iSubService == null) {
                Log.e("SubServiceManager", "异常，未注册服务：" + str);
                k("异常，未注册服务：" + str, new NullPointerException());
            } else {
                b(str, iSubService, cfcVar);
            }
        }
        for (Map.Entry<String, ISubService> entry : this.f26940a.entrySet()) {
            if (!list.contains(entry.getKey())) {
                b(entry.getKey(), entry.getValue(), cfcVar);
            }
        }
    }

    public void g(cfc cfcVar, List<ISubService> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff60c92", new Object[]{this, cfcVar, list});
            return;
        }
        fve.e("SubServiceManager", "自定义初始化服务数：" + list.size());
        for (ISubService iSubService : list) {
            String e = e(iSubService.getClass());
            if (!this.f26940a.containsKey(e)) {
                k("异常，未注册服务：" + e, new NullPointerException());
            }
            b(e, iSubService, cfcVar);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849f5a56", new Object[]{this});
            return;
        }
        for (Map.Entry<String, ISubService> entry : this.f26940a.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
        this.f26940a.clear();
    }

    public final String i(Class<? extends ISubService> cls) {
        try {
            Object obj = cls.getField("SERVICE_NAME").get(null);
            if (!(obj instanceof String)) {
                k("服务：" + cls.getSimpleName() + " SERVICE_NAME 不是字符串类型！", null);
                return null;
            }
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            k("服务：" + cls.getSimpleName() + " SERVICE_NAME 为空字符串！", null);
            return null;
        } catch (IllegalAccessException e) {
            k("服务：" + cls.getSimpleName() + " SERVICE_NAME 不是对象！", e);
            return null;
        } catch (NoSuchFieldException e2) {
            k("服务：" + cls.getSimpleName() + " 未声明服务名称！", e2);
            return null;
        }
    }

    public void j(List<ISubService> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2c066ad", new Object[]{this, list});
            return;
        }
        for (ISubService iSubService : list) {
            String e = e(iSubService.getClass());
            if (!TextUtils.isEmpty(e)) {
                this.f26940a.put(e, iSubService);
            }
        }
    }

    public final void k(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53b365b", new Object[]{this, str, th});
        } else if (eue.b()) {
            if (th != null) {
                th.printStackTrace();
            }
            throw new IllegalArgumentException(str);
        } else {
            fve.c("SubServiceManager", str, th);
        }
    }
}
