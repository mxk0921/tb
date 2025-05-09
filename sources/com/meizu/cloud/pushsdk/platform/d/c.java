package com.meizu.cloud.pushsdk.platform.d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class c<T extends BasicPushStatus> {

    /* renamed from: a  reason: collision with root package name */
    private ScheduledExecutorService f5921a;
    protected final Context b;
    protected String c;
    protected String d;
    protected String e;
    protected final com.meizu.cloud.pushsdk.platform.c.a f;
    protected boolean g = true;
    protected boolean h = true;
    private String i = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.g();
        }
    }

    public c(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this.f5921a = scheduledExecutorService;
        this.b = context;
        this.c = str;
        this.d = str2;
        this.f = aVar;
    }

    private boolean k() {
        if (!this.h || this.b.getPackageName().equals(this.i)) {
            return false;
        }
        return true;
    }

    public abstract T a();

    public String a(Context context, String str) {
        String str2 = null;
        if (!TextUtils.isEmpty(str)) {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(str), 0);
            if (queryIntentServices != null) {
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ResolveInfo next = it.next();
                    if (PushConstants.PUSH_PACKAGE_NAME.equals(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        this.i = serviceInfo.packageName;
                        str2 = serviceInfo.name;
                        break;
                    }
                }
                if (TextUtils.isEmpty(str2) && queryIntentServices.size() > 0) {
                    this.i = queryIntentServices.get(0).serviceInfo.packageName;
                    str2 = queryIntentServices.get(0).serviceInfo.name;
                }
            }
        }
        DebugLogger.i("Strategy", "current process packageName " + this.i);
        return str2;
    }

    public abstract void b(T t);

    public void b(String str) {
        this.d = str;
    }

    public abstract T c();

    public void c(String str) {
        this.e = str;
    }

    public abstract boolean d();

    public abstract T e();

    public boolean f() {
        ScheduledExecutorService scheduledExecutorService = this.f5921a;
        if (scheduledExecutorService == null) {
            return g();
        }
        scheduledExecutorService.execute(new a());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.platform.d.c.g():boolean");
    }

    public abstract Intent h();

    public Intent[] i() {
        return null;
    }

    public abstract int j();

    public boolean l() {
        if (!this.h || !this.g || TextUtils.isEmpty(a(this.b, PushConstants.MZ_PUSH_MANAGER_SERVICE_ACTION))) {
            return false;
        }
        return true;
    }

    public void a(Intent intent) {
        try {
            intent.setPackage(this.i);
            intent.setAction(PushConstants.MZ_PUSH_MANAGER_SERVICE_ACTION);
            this.b.startService(intent);
        } catch (Exception e) {
            DebugLogger.e("Strategy", "start RemoteService error " + e.getMessage());
        }
    }

    public boolean b() {
        return 2 == j() || 32 == j();
    }

    public void a(String str) {
        this.c = str;
    }

    public void a(boolean z) {
        this.g = z;
    }

    private boolean a(int i) {
        return i >= 110000 && i <= 200000;
    }

    private boolean a(T t) {
        int intValue = Integer.valueOf(t.getCode()).intValue();
        return (intValue > 200 && intValue < 600) || (intValue > 1000 && intValue < 2000) || intValue == 0;
    }
}
