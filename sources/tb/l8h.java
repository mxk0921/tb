package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l8h implements tmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f23172a;
    public final kgd b;

    public l8h(Application application, kgd kgdVar) {
        this.f23172a = application;
        this.b = kgdVar;
    }

    @Override // tb.tmc
    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86fd28c7", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (trq.c(str)) {
            RSoLog.g("readBool(), use empty key =" + str);
            return z;
        }
        boolean b = pno.b(this.f23172a, "swallows_local_kv", str, z);
        RSoLog.d("localkv, read(" + str + ") = " + b + ", defaultValue=" + z);
        return b;
    }

    @Override // tb.tmc
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25d0298", new Object[]{this, str, str2});
        } else if (trq.c(str)) {
            RSoLog.g("save(), use empty key =" + str + ", value = " + str2);
        } else {
            pno.g(this.f23172a, "swallows_local_kv", str, str2);
            RSoLog.d("localkv, save(" + str + ", " + str2 + f7l.BRACKET_END_STR);
        }
    }

    @Override // tb.tmc
    public String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69dd333e", new Object[]{this, str, str2});
        }
        String str3 = this.b.g() + "_" + str;
        String string = this.f23172a.getSharedPreferences("swallows_app_ver_local_kv", 0).getString(str3, str2);
        RSoLog.d("localkv, readWithVer(" + str3 + ") = " + string + ", defaultValue=" + str2);
        return string;
    }
}
