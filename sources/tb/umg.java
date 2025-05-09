package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class umg implements izb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public j3l f29493a;
    public boolean b = false;
    public boolean c = false;

    static {
        t2o.a(147849237);
        t2o.a(147849225);
    }

    @Override // tb.izb
    public String a(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e11ddb22", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        if (!this.b) {
            j3l j3lVar = new j3l();
            this.f29493a = j3lVar;
            if (j3lVar.e(context, null) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.c = z;
            this.b = true;
        }
        shh.a("getOAID", "isSupported", Boolean.valueOf(this.c));
        if (!this.c || !this.f29493a.f()) {
            return null;
        }
        return this.f29493a.d();
    }
}
