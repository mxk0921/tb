package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class g7l implements izb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19770a = false;

    static {
        t2o.a(147849240);
        t2o.a(147849225);
    }

    @Override // tb.izb
    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e11ddb22", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        if (!this.f19770a) {
            s3l.b(context);
            this.f19770a = true;
        }
        boolean c = s3l.c();
        shh.a("getOAID", "isSupported", Boolean.valueOf(c));
        if (!c) {
            return null;
        }
        return s3l.a(context);
    }
}
