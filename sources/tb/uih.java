package tb;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.alipay.mobile.accountauthbiz.IAlipayLoginService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.login.LoginFreeJsbridge;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uih {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29397a;
    public final Map<String, Boolean> b;
    public IAlipayLoginService c;
    public ajh d;
    public final ServiceConnection e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* JADX WARN: Finally extract failed */
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            StringBuilder sb;
            Exception e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            uih.b(uih.this, IAlipayLoginService.Stub.asInterface(iBinder));
            try {
                String loginInfo = uih.a(uih.this).getLoginInfo();
                if (uih.c(uih.this) != null) {
                    uih.c(uih.this).a(loginInfo);
                }
                esg.b(esg.ARG1_READ_LOGIN_FREE_FOR_TB, loginInfo, "", null);
                irg.a("link_tag", "LoginFreeCenter === onServiceConnected === 获取到的免登信息：" + loginInfo);
                if (uih.c(uih.this) != null) {
                    uih.c(uih.this).a("");
                }
                try {
                    uih.this.g(ypg.e().f32260a);
                } catch (Exception e2) {
                    e = e2;
                    sb = new StringBuilder("LoginFreeCenter === onServiceConnected === 解绑异常：");
                    sb.append(e);
                    irg.b("link_tag", sb.toString());
                }
            } catch (Throwable th) {
                try {
                    irg.b("link_tag", "LoginFreeCenter === onServiceConnected === 获取aidl信息异常：" + th);
                    if (uih.c(uih.this) != null) {
                        uih.c(uih.this).a("");
                    }
                    try {
                        uih.this.g(ypg.e().f32260a);
                    } catch (Exception e3) {
                        e = e3;
                        sb = new StringBuilder("LoginFreeCenter === onServiceConnected === 解绑异常：");
                        sb.append(e);
                        irg.b("link_tag", sb.toString());
                    }
                } catch (Throwable th2) {
                    if (uih.c(uih.this) != null) {
                        uih.c(uih.this).a("");
                    }
                    try {
                        uih.this.g(ypg.e().f32260a);
                    } catch (Exception e4) {
                        irg.b("link_tag", "LoginFreeCenter === onServiceConnected === 解绑异常：" + e4);
                    }
                    throw th2;
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            uih.b(uih.this, null);
            irg.b("link_tag", "LoginFreeCenter === onServiceDisconnected === 解绑服务：" + componentName);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final uih f29399a = new uih(null);

        static {
            t2o.a(1030750284);
        }

        public static /* synthetic */ uih a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uih) ipChange.ipc$dispatch("b9adcdc1", new Object[0]);
            }
            return f29399a;
        }
    }

    static {
        t2o.a(1030750282);
    }

    public /* synthetic */ uih(a aVar) {
        this();
    }

    public static /* synthetic */ IAlipayLoginService a(uih uihVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlipayLoginService) ipChange.ipc$dispatch("897bbc66", new Object[]{uihVar});
        }
        return uihVar.c;
    }

    public static /* synthetic */ IAlipayLoginService b(uih uihVar, IAlipayLoginService iAlipayLoginService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlipayLoginService) ipChange.ipc$dispatch("b4f7ad9", new Object[]{uihVar, iAlipayLoginService});
        }
        uihVar.c = iAlipayLoginService;
        return iAlipayLoginService;
    }

    public static /* synthetic */ ajh c(uih uihVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ajh) ipChange.ipc$dispatch("5cf057cc", new Object[]{uihVar});
        }
        return uihVar.d;
    }

    public static uih f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uih) ipChange.ipc$dispatch("e5bd93fc", new Object[0]);
        }
        return b.a();
    }

    public void e(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        fsw.h(LoginFreeJsbridge.CLASSNAME_LOGINFREEJSBRIDGE, LoginFreeJsbridge.class);
        irg.a("link_tag", "LoginFreeCenter === init === 免登模块初始化完成");
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a657bbf", new Object[]{this, context});
            return;
        }
        context.unbindService(this.e);
        irg.a("link_tag", "LoginFreeCenter === unBindLoginService === 解绑服务：" + this.e);
    }

    public uih() {
        this.b = new HashMap();
        this.e = new a();
    }

    public void d(Context context, ajh ajhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585fc0ca", new Object[]{this, context, ajhVar});
            return;
        }
        try {
            this.d = ajhVar;
            Intent intent = new Intent();
            intent.setAction("com.alipay.mobile.accountauthbiz.outer.AlipayAutoLoginService");
            intent.setPackage("com.eg.android.AlipayGphone");
            boolean bindService = context.bindService(intent, this.e, 1);
            irg.a("link_tag", "LoginFreeCenter === bindLoginService === 绑定服务：" + intent + " 绑定是否成功：" + bindService);
        } catch (Exception e) {
            irg.b("link_tag", "LoginFreeCenter === bindLoginService === 绑定服务异常：" + e);
        }
    }
}
