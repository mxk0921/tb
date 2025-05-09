package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import com.opos.process.bridge.provider.BridgeExecuteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s3y extends axx {
    public IBinder h;
    public String[] i = null;
    public final AtomicInteger j = new AtomicInteger(-1);
    public String k = null;
    public String l = null;
    public final List<String> m = new ArrayList();
    public final b n = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements b {
        static {
            t2o.a(253755448);
            t2o.a(253755449);
        }

        public a() {
        }

        @Override // tb.s3y.b
        public void a(ComponentName componentName) {
            Objects.toString(componentName);
            s3y.this.getClass();
        }

        @Override // tb.s3y.b
        public void onServiceDisconnected(ComponentName componentName) {
            Objects.toString(componentName);
            s3y s3yVar = s3y.this;
            String str = s3yVar.k;
            s3yVar.h = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(ComponentName componentName);

        void onServiceDisconnected(ComponentName componentName);
    }

    static {
        t2o.a(253755447);
    }

    public s3y(Context context, IBridgeTargetIdentify iBridgeTargetIdentify, Bundle bundle) {
        this.f16066a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = iBridgeTargetIdentify;
        this.b = bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (i(r10) != false) goto L_0x0068;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (i(r10) != false) goto L_0x0068;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        k(r10);
     */
    @Override // tb.axx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle e(android.content.Context r10, java.lang.String r11, com.opos.process.bridge.annotation.IBridgeTargetIdentify r12, int r13, java.lang.Object... r14) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.s3y.e(android.content.Context, java.lang.String, com.opos.process.bridge.annotation.IBridgeTargetIdentify, int, java.lang.Object[]):android.os.Bundle");
    }

    public Intent g(String str, String str2, String str3, Bundle bundle) {
        Objects.toString(bundle);
        Intent intent = new Intent();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            intent.setComponent(new ComponentName(str, str2));
        }
        intent.setPackage(str);
        intent.setAction(str3);
        intent.putExtra("callingPackage", this.f16066a.getPackageName());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    public void h() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new BridgeExecuteException("MainThread call not allowed", 101000);
        }
    }

    public boolean i(Context context) {
        AtomicInteger atomicInteger = this.j;
        int i = atomicInteger.get();
        if (i < 0) {
            try {
                String b2 = s6y.b(context.getApplicationContext());
                ResolveInfo resolveService = context.getApplicationContext().getPackageManager().resolveService(g(this.k, l(), this.l, null), 128);
                if (resolveService != null && !TextUtils.isEmpty(resolveService.serviceInfo.processName) && resolveService.serviceInfo.processName.equals(b2)) {
                    atomicInteger.compareAndSet(-1, 0);
                    return false;
                }
            } catch (Exception unused) {
            }
            atomicInteger.compareAndSet(-1, 1);
            return true;
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    public Intent j() {
        if (TextUtils.isEmpty(this.k) || TextUtils.isEmpty(this.l)) {
            m(this.f16066a);
        }
        return g(this.k, l(), this.l, this.b);
    }

    public final void k(Context context) {
        if (this.h == null) {
            String str = this.k;
            this.h = d5y.b.a(context, g(str, l(), this.l, this.b), this.g, this.n);
        }
    }

    public String l() {
        return null;
    }

    public final void m(Context context) {
        c8y c8yVar;
        if (this.l == null || this.k == null) {
            PackageManager packageManager = this.f16066a.getPackageManager();
            List<String> list = this.m;
            ArrayList arrayList = (ArrayList) list;
            arrayList.clear();
            List<c8y> list2 = this.d;
            ArrayList arrayList2 = (ArrayList) list2;
            arrayList2.clear();
            String[] strArr = this.i;
            if (strArr != null) {
                arrayList.addAll(Arrays.asList(strArr));
            }
            swx.c(list);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str)) {
                    if (str.contains("${applicationId}")) {
                        str = str.replace("${applicationId}", context.getPackageName());
                    }
                    for (ResolveInfo resolveInfo : packageManager.queryIntentServices(g(this.k, l(), str, null), 128)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        if (serviceInfo != null && !TextUtils.isEmpty(serviceInfo.packageName)) {
                            ServiceInfo serviceInfo2 = resolveInfo.serviceInfo;
                            String str2 = serviceInfo2.packageName;
                            String str3 = serviceInfo2.name;
                            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                                c8yVar = null;
                            } else {
                                c8yVar = new c8y();
                                c8yVar.b = str2;
                                c8yVar.d = str;
                                c8yVar.f16918a = str3;
                            }
                            arrayList2.add(c8yVar);
                        }
                    }
                }
            }
            swx.c(list2);
            if (arrayList2.size() >= 1) {
                this.k = ((c8y) arrayList2.get(0)).b;
                this.l = ((c8y) arrayList2.get(0)).d;
                return;
            }
            throw new BridgeExecuteException("No target found for all actions", 101001);
        }
    }
}
