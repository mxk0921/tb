package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.nb.searchmanager.utils.logger.DSLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class azn {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16097a;
    public qi4 b;

    public azn(Context context, String str, String str2) {
        this.f16097a = context;
        DSLog.it("RemoteServiceConnection", "create search ServiceConnection with package name", new Object[0]);
    }

    public final Intent a(String str, String str2) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        return intent;
    }

    public boolean b(qi4 qi4Var) {
        this.b = qi4Var;
        Intent a2 = a("com.huawei.searchservice", "com.huawei.searchservice.service.SearchService");
        a2.setType(GrsBaseInfo.CountryCodeSource.APP);
        a2.setType("HOSP");
        try {
            if (this.f16097a.bindService(a2, new p5p(null, this.b), 1)) {
                return true;
            }
            DSLog.et("RemoteServiceConnection", "Failed to connect to search service.", new Object[0]);
            return false;
        } catch (SecurityException unused) {
            DSLog.et("RemoteServiceConnection", "Failed to bind search service.", new Object[0]);
            return false;
        }
    }
}
