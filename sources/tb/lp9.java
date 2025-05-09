package tb;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class lp9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Handler f23486a;
    public static final lp9 INSTANCE = new lp9();
    public static final List<mp9> b = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/floatbar/FloatingBtnManager$getFloatingBtnTrigger$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i;
            Bundle data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            ckf.g(message, "msg");
            if (!lp9.a().isEmpty()) {
                int i2 = -1;
                try {
                    data = message.getData();
                } catch (Throwable unused) {
                    i = -1;
                }
                if (ckf.b(l53.PLT_SCREENSHOT_FLOAT_WINDOW_BIZ_CODE, data.getString("bizCode"))) {
                    i = message.what;
                    if (i == 4) {
                        try {
                            i2 = data.getInt("status");
                        } catch (Throwable unused2) {
                        }
                        i = 4;
                    }
                    Iterator it = lp9.a().iterator();
                    while (it.hasNext()) {
                        mp9 mp9Var = (mp9) it.next();
                        mp9Var.b().invoke(Integer.valueOf(i), Integer.valueOf(i2));
                        if (mp9Var.a()) {
                            it.remove();
                        }
                    }
                    if (i == 3) {
                        lp9.b(null);
                        mno.h(caa.c(), l53.IS_PLT_SCREENSHOT_FLOAT_BAR_OPEN_DEFAULT, "false");
                    }
                }
            }
        }
    }

    static {
        t2o.a(481296938);
    }

    public static final /* synthetic */ List a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fb96d91", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ void b(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e04a744", new Object[]{handler});
        } else {
            f23486a = handler;
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98753ce5", new Object[]{this});
        } else {
            d().a(l53.PLT_SCREENSHOT_FLOAT_WINDOW_BIZ_CODE);
        }
    }

    public final hp9 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hp9) ipChange.ipc$dispatch("26b8e0", new Object[]{this});
        }
        if (f23486a == null) {
            f23486a = new a(Looper.getMainLooper());
        }
        hp9 a2 = gp9.a(caa.c(), f23486a);
        ckf.f(a2, "createPublicTrigger(\n   …ingBtnOptionHandler\n    )");
        return a2;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7470653", new Object[]{this});
            return;
        }
        hp9 d = d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "needToast", (String) Boolean.FALSE);
        xhv xhvVar = xhv.INSTANCE;
        d.c("client", l53.PLT_SCREENSHOT_FLOAT_WINDOW_BIZ_CODE, jSONObject);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8563daa", new Object[]{this});
        } else {
            d().b(l53.PLT_SCREENSHOT_FLOAT_WINDOW_BIZ_CODE);
        }
    }

    public final void g(mp9 mp9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10f2f56", new Object[]{this, mp9Var});
        } else if (mp9Var != null) {
            ((ArrayList) b).add(mp9Var);
        }
    }

    public final void h(mp9 mp9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4287023d", new Object[]{this, mp9Var});
        } else if (mp9Var != null) {
            ((ArrayList) b).remove(mp9Var);
        }
    }
}
