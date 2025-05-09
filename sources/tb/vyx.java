package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import com.opos.process.bridge.provider.BridgeExecuteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vyx extends axx {
    public String h = null;
    public String i = null;
    public final List<String> j = new ArrayList();
    public String[] k = null;
    public final AtomicInteger l = new AtomicInteger(-1);

    static {
        t2o.a(253755446);
    }

    public vyx(Context context, IBridgeTargetIdentify iBridgeTargetIdentify, Bundle bundle) {
        this.f16066a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = iBridgeTargetIdentify;
        this.b = bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r1 == 1) goto L_0x0112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016a, code lost:
        if (r12 != null) goto L_0x016c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016c, code lost:
        r12.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
        if (r12 == null) goto L_0x017e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017e, code lost:
        return r13;
     */
    @Override // tb.axx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle e(android.content.Context r10, java.lang.String r11, com.opos.process.bridge.annotation.IBridgeTargetIdentify r12, int r13, java.lang.Object... r14) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vyx.e(android.content.Context, java.lang.String, com.opos.process.bridge.annotation.IBridgeTargetIdentify, int, java.lang.Object[]):android.os.Bundle");
    }

    public String g() {
        return null;
    }

    public final void h(Context context) {
        c8y c8yVar;
        if (this.i == null || this.h == null) {
            PackageManager packageManager = this.f16066a.getPackageManager();
            List<String> list = this.j;
            ArrayList arrayList = (ArrayList) list;
            arrayList.clear();
            List<c8y> list2 = this.d;
            ArrayList arrayList2 = (ArrayList) list2;
            arrayList2.clear();
            String[] strArr = this.k;
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
                    ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 128);
                    if (resolveContentProvider != null && !TextUtils.isEmpty(resolveContentProvider.packageName) && (TextUtils.isEmpty(g()) || resolveContentProvider.name.equals(g()))) {
                        String str2 = resolveContentProvider.packageName;
                        String str3 = resolveContentProvider.name;
                        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                            c8yVar = null;
                        } else {
                            c8yVar = new c8y();
                            c8yVar.b = str2;
                            c8yVar.c = str;
                            c8yVar.f16918a = str3;
                        }
                        arrayList2.add(c8yVar);
                    }
                }
            }
            swx.c(list2);
            if (arrayList2.size() >= 1) {
                this.h = ((c8y) arrayList2.get(0)).b;
                this.i = ((c8y) arrayList2.get(0)).c;
                return;
            }
            throw new BridgeExecuteException("No target found for all authorities", 101001);
        }
    }
}
