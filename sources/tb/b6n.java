package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.MessageConstant$CommandId;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.mcs.aidl.IMcsSdkService;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b6n {
    public static final int[] k = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115};
    public static final int[] l = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115, 115, 100, 107, 46, 97, 99, 116, 105, 111, 110, 46, 82, 69, 67, 69, 73, 86, 69, 95, 83, 68, 75, 95, 77, 69, 83, 83, 65, 71, 69};
    public static String m = "";
    public static int n = 0;
    public static String o;
    public static boolean p;

    /* renamed from: a  reason: collision with root package name */
    public Context f16209a;
    public final List<fzm> b;
    public final List<csl> c;
    public String d;
    public String e;
    public String f;
    public ICallBackResultService g;
    public ISetAppNotificationCallBackService h;
    public IGetAppNotificationCallBackService i;
    public final ConcurrentHashMap<Integer, k61> j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b6n f16211a = new b6n(null);

        static {
            t2o.a(612368390);
        }
    }

    static {
        t2o.a(612368388);
        t2o.a(612368385);
    }

    public /* synthetic */ b6n(a aVar) {
        this();
    }

    public static b6n s() {
        return b.f16211a;
    }

    public IGetAppNotificationCallBackService A() {
        return this.i;
    }

    public ISetAppNotificationCallBackService B() {
        return this.h;
    }

    public void C() {
        if (g()) {
            X(MessageConstant$CommandId.COMMAND_GET_PUSH_STATUS, null);
        } else if (z() != null) {
            z().onGetPushStatus(-2, 0);
        }
    }

    public int D() {
        if (!i()) {
            return 0;
        }
        Context context = this.f16209a;
        return yyv.c(context, u(context));
    }

    public String E() {
        if (!i()) {
            return "";
        }
        Context context = this.f16209a;
        return yyv.e(context, u(context));
    }

    public String F(Context context) {
        if (o == null) {
            v(context);
        }
        if (!p) {
            return yyv.a(l);
        }
        if (TextUtils.isEmpty(m)) {
            m = new String(vp1.k("Y29tLm1jcy5hY3Rpb24uUkVDRUlWRV9TREtfTUVTU0FHRQ=="));
        }
        return m;
    }

    public void G(JSONObject jSONObject) {
        if (i()) {
            X(MessageConstant$CommandId.COMMAND_REGISTER, jSONObject);
        } else if (z() != null) {
            z().onRegister(-2, null);
        }
    }

    public String H() {
        return this.f;
    }

    public b6n I(Context context, boolean z) {
        if (context != null) {
            J(context);
            new x9k().c(this.f16209a);
            dgh.d(z);
            return this;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    public void J(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f16209a = applicationContext;
        if (o == null) {
            String v = v(applicationContext);
            if (v == null) {
                o = yyv.a(k);
                p = false;
                return;
            }
            o = v;
            p = true;
        }
    }

    public boolean K(Context context) {
        return L(context);
    }

    public final boolean L(Context context) {
        if (this.f16209a == null) {
            this.f16209a = context.getApplicationContext();
        }
        String u = u(this.f16209a);
        return yyv.f(this.f16209a, u) && yyv.c(this.f16209a, u) >= 1019 && yyv.g(this.f16209a, u, "supportOpenPush");
    }

    public void M(JSONObject jSONObject) {
        if (g()) {
            X(MessageConstant$CommandId.COMMAND_SET_NOTIFICATION_SETTINGS, jSONObject);
        } else {
            dgh.c(dgh.TAG, "please call the register first!");
        }
    }

    public void N(JSONObject jSONObject) {
        if (g()) {
            X(MessageConstant$CommandId.COMMAND_PAUSE_PUSH, jSONObject);
        } else {
            dgh.c(dgh.TAG, "please call the register first!");
        }
    }

    public void P() {
        if (i()) {
            e(MessageConstant$CommandId.COMMAND_NOTIFICATION_ALLOWANCE);
        } else {
            dgh.c(dgh.TAG, "please call the register first!");
        }
    }

    public void Q(JSONObject jSONObject) {
        if (g()) {
            X(MessageConstant$CommandId.COMMAND_RESUME_PUSH, jSONObject);
        } else {
            dgh.c(dgh.TAG, "please call the register first!");
        }
    }

    public void R(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public void S(int i, JSONObject jSONObject) {
        if (g()) {
            W(MessageConstant$CommandId.COMMAND_SET_NOTIFICATION_TYPE, i + "", jSONObject);
            return;
        }
        dgh.c(dgh.TAG, "please call the register first!");
    }

    public void T(ICallBackResultService iCallBackResultService) {
        this.g = iCallBackResultService;
    }

    public void U(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject) throws IllegalArgumentException {
        if (g()) {
            if (list == null || list.size() <= 0 || i < 0 || i2 < 0 || i3 < i || i3 > 23 || i4 < i2 || i4 > 59) {
                throw new IllegalArgumentException("params are not all right,please check params");
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("weekDays", dv2.c(list));
                jSONObject2.put("startHour", i);
                jSONObject2.put("startMin", i2);
                jSONObject2.put("endHour", i3);
                jSONObject2.put("endMin", i4);
                W(MessageConstant$CommandId.COMMAND_SET_PUSH_TIME, jSONObject2.toString(), jSONObject);
            } catch (JSONException e) {
                dgh.c(dgh.TAG, e.getLocalizedMessage());
            }
        } else if (z() != null) {
            z().onSetPushTime(-2, "please call the register first!");
        }
    }

    public void V(String str) {
        this.f = str;
    }

    public final void W(int i, String str, JSONObject jSONObject) {
        if (h(i)) {
            ICallBackResultService iCallBackResultService = this.g;
            if (iCallBackResultService != null) {
                iCallBackResultService.onError(r(i), "api_call_too_frequently");
                return;
            }
            return;
        }
        try {
            this.f16209a.startService(t(i, str, jSONObject));
        } catch (Exception e) {
            dgh.b("startMcsService--Exception" + e.getMessage());
        }
    }

    public final void X(int i, JSONObject jSONObject) {
        W(i, "", jSONObject);
    }

    public void Y(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        this.d = str;
        this.e = str2;
        this.f16209a = context.getApplicationContext();
        this.g = iCallBackResultService;
        Z(jSONObject);
    }

    public void Z(JSONObject jSONObject) {
        if (i()) {
            X(MessageConstant$CommandId.COMMAND_UNREGISTER, jSONObject);
        } else if (z() != null) {
            z().onUnRegister(-2);
        }
    }

    public final k61 b(int i) {
        ConcurrentHashMap<Integer, k61> concurrentHashMap = this.j;
        if (concurrentHashMap.containsKey(Integer.valueOf(i))) {
            k61 k61Var = concurrentHashMap.get(Integer.valueOf(i));
            if (k(k61Var)) {
                k61Var.c(1);
                k61Var.d(System.currentTimeMillis());
                dgh.a("addCommandToMap : appLimitBean.setCount(1)");
                return k61Var;
            }
            k61Var.c(k61Var.a() + 1);
            dgh.a("addCommandToMap :appLimitBean.getCount() + 1");
            return k61Var;
        }
        k61 k61Var2 = new k61(System.currentTimeMillis(), 1);
        concurrentHashMap.put(Integer.valueOf(i), k61Var2);
        dgh.a("addCommandToMap :appBean is null");
        return k61Var2;
    }

    public final synchronized void c(csl cslVar) {
        if (cslVar != null) {
            this.c.add(cslVar);
        }
    }

    public final synchronized void d(fzm fzmVar) {
        if (fzmVar != null) {
            this.b.add(fzmVar);
        }
    }

    public void e(int i) {
        if (h(i)) {
            ICallBackResultService iCallBackResultService = this.g;
            if (iCallBackResultService != null) {
                iCallBackResultService.onError(r(i), "api_call_too_frequently");
                return;
            }
            return;
        }
        Intent t = t(i, "", null);
        this.f16209a.bindService(t, new a(t), 1);
    }

    public void f(JSONObject jSONObject) {
        if (g()) {
            X(MessageConstant$CommandId.COMMAND_CANCEL_NOTIFICATION, jSONObject);
        } else {
            dgh.c(dgh.TAG, "please call the register first!");
        }
    }

    public final boolean g() throws IllegalArgumentException {
        if (!i() || !j()) {
            return false;
        }
        return true;
    }

    public boolean h(int i) {
        k61 b2 = b(i);
        if (i == 12291 || i == 12312 || b2.a() <= 2) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        if (this.f16209a != null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public final boolean k(k61 k61Var) {
        long b2 = k61Var.b();
        long currentTimeMillis = System.currentTimeMillis();
        dgh.a("checkTimeNeedUpdate : lastedTime " + b2 + " currentTime:" + currentTimeMillis);
        if (currentTimeMillis - b2 > 1000) {
            return true;
        }
        return false;
    }

    public void l(JSONObject jSONObject) {
        if (g()) {
            X(MessageConstant$CommandId.COMMAND_CLEAR_NOTIFICATION_TYPE, jSONObject);
        } else {
            dgh.c(dgh.TAG, "please call the register first!");
        }
    }

    public void m(JSONObject jSONObject) {
        if (i()) {
            X(MessageConstant$CommandId.COMMAND_CLEAR_PKG_NOTIFICATION, jSONObject);
        } else {
            dgh.c(dgh.TAG, "please call the register first!");
        }
    }

    public void n(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        if (i()) {
            this.h = iSetAppNotificationCallBackService;
            X(MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_CLOSE, null);
        } else if (z() != null) {
            this.h.onSetAppNotificationSwitch(-2);
        }
    }

    public void o(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        if (i()) {
            this.h = iSetAppNotificationCallBackService;
            X(MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_OPEN, null);
            return;
        }
        ISetAppNotificationCallBackService iSetAppNotificationCallBackService2 = this.h;
        if (iSetAppNotificationCallBackService2 != null) {
            iSetAppNotificationCallBackService2.onSetAppNotificationSwitch(-2);
        }
    }

    public void p(IGetAppNotificationCallBackService iGetAppNotificationCallBackService) {
        if (i()) {
            this.i = iGetAppNotificationCallBackService;
            X(MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_GET, null);
            return;
        }
        IGetAppNotificationCallBackService iGetAppNotificationCallBackService2 = this.i;
        if (iGetAppNotificationCallBackService2 != null) {
            iGetAppNotificationCallBackService2.onGetAppNotificationSwitch(-2, 0);
        }
    }

    public Context q() {
        return this.f16209a;
    }

    public int r(int i) {
        switch (i) {
            case MessageConstant$CommandId.COMMAND_REGISTER /* 12289 */:
                return -1;
            case MessageConstant$CommandId.COMMAND_UNREGISTER /* 12290 */:
                return -2;
            case MessageConstant$CommandId.COMMAND_STATISTIC /* 12291 */:
                return -14;
            default:
                switch (i) {
                    case MessageConstant$CommandId.COMMAND_SET_PUSH_TIME /* 12298 */:
                        return -11;
                    case MessageConstant$CommandId.COMMAND_PAUSE_PUSH /* 12299 */:
                        return -3;
                    case MessageConstant$CommandId.COMMAND_RESUME_PUSH /* 12300 */:
                        return -4;
                    default:
                        switch (i) {
                            case MessageConstant$CommandId.COMMAND_GET_PUSH_STATUS /* 12306 */:
                                return -10;
                            case MessageConstant$CommandId.COMMAND_SET_NOTIFICATION_TYPE /* 12307 */:
                                return -6;
                            case MessageConstant$CommandId.COMMAND_CLEAR_NOTIFICATION_TYPE /* 12308 */:
                                return -7;
                            case MessageConstant$CommandId.COMMAND_GET_NOTIFICATION_STATUS /* 12309 */:
                                return -5;
                            case MessageConstant$CommandId.COMMAND_SET_NOTIFICATION_SETTINGS /* 12310 */:
                                return -8;
                            case MessageConstant$CommandId.COMMAND_CLEAR_PKG_NOTIFICATION /* 12311 */:
                                return -9;
                            case MessageConstant$CommandId.COMMAND_SEND_INSTANT_ACK /* 12312 */:
                                return -13;
                            case MessageConstant$CommandId.COMMAND_NOTIFICATION_ALLOWANCE /* 12313 */:
                                return -12;
                            default:
                                switch (i) {
                                    case MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_OPEN /* 12316 */:
                                        return -15;
                                    case MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_CLOSE /* 12317 */:
                                        return -16;
                                    case MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_GET /* 12318 */:
                                        return -17;
                                    default:
                                        return 0;
                                }
                        }
                }
        }
    }

    public final Intent t(int i, String str, JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.setAction(F(this.f16209a));
        intent.setPackage(u(this.f16209a));
        intent.putExtra("type", i);
        JSONObject jSONObject2 = new JSONObject();
        try {
            Context context = this.f16209a;
            jSONObject2.putOpt("versionName", yyv.e(context, context.getPackageName()));
            Context context2 = this.f16209a;
            jSONObject2.putOpt("versionCode", Integer.valueOf(yyv.c(context2, context2.getPackageName())));
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.get(next));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            intent.putExtra("extra", jSONObject2.toString());
            throw th;
        }
        intent.putExtra("extra", jSONObject2.toString());
        intent.putExtra("params", str);
        intent.putExtra("appPackage", this.f16209a.getPackageName());
        intent.putExtra("appKey", this.d);
        intent.putExtra("appSecret", this.e);
        intent.putExtra("registerID", this.f);
        intent.putExtra("sdkVersion", "3.1.0");
        return intent;
    }

    public String u(Context context) {
        if (o == null) {
            String v = v(context);
            if (v == null) {
                o = yyv.a(k);
                p = false;
            } else {
                o = v;
                p = true;
            }
        }
        return o;
    }

    public final String v(Context context) {
        boolean z;
        boolean z2;
        int packageUid;
        int packageUid2;
        if (TextUtils.isEmpty(m)) {
            m = new String(vp1.k("Y29tLm1jcy5hY3Rpb24uUkVDRUlWRV9TREtfTUVTU0FHRQ=="));
        }
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(m), 8192);
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            String str = resolveInfo.serviceInfo.packageName;
            try {
                z = false;
                if ((context.getPackageManager().getApplicationInfo(str, 0).flags & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                packageUid = context.getPackageManager().getPackageUid(str, 0);
                packageUid2 = context.getPackageManager().getPackageUid("android", 0);
                if (packageUid == packageUid2) {
                    z = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (z2 || z) {
                return str;
            }
        }
        return null;
    }

    public void w(JSONObject jSONObject) {
        if (g()) {
            X(MessageConstant$CommandId.COMMAND_GET_NOTIFICATION_STATUS, jSONObject);
        } else if (z() != null) {
            z().onGetNotificationStatus(-2, 0);
        }
    }

    public List<csl> x() {
        return this.c;
    }

    public List<fzm> y() {
        return this.b;
    }

    public ICallBackResultService z() {
        return this.g;
    }

    public b6n() {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = null;
        synchronized (b6n.class) {
            int i = n;
            if (i <= 0) {
                n = i + 1;
            } else {
                throw new RuntimeException("PushService can't create again!");
            }
        }
        c(new dr6());
        c(new ev2());
        d(new er6());
        d(new fv2());
        this.j = new ConcurrentHashMap<>();
    }

    public void O(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        if (context != null) {
            if (this.f16209a == null) {
                this.f16209a = context.getApplicationContext();
            }
            if (yyv.h(this.f16209a)) {
                this.d = str;
                this.e = str2;
                this.g = iCallBackResultService;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    jSONObject.putOpt(Constants.KEY_APP_VERSION_CODE, Integer.valueOf(yyv.b(context)));
                    jSONObject.putOpt(Constants.KEY_APP_VERSION_NAME, yyv.d(context));
                } catch (JSONException e) {
                    dgh.b("register-Exception:" + e.getMessage());
                }
                X(MessageConstant$CommandId.COMMAND_REGISTER, jSONObject);
            } else if (iCallBackResultService != null) {
                iCallBackResultService.onRegister(-2, null);
            }
        } else if (iCallBackResultService != null) {
            iCallBackResultService.onRegister(-2, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f16210a;

        public a(Intent intent) {
            this.f16210a = intent;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Bundle bundle = new Bundle();
            bundle.putAll(this.f16210a.getExtras());
            try {
                IMcsSdkService.Stub.asInterface(iBinder).process(bundle);
            } catch (Exception e) {
                dgh.a("bindMcsService exception:" + e);
            }
            b6n.this.f16209a.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
