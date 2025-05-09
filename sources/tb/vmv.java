package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vmv extends z24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context i = null;
    public String j = null;
    public String k = null;
    public String l = null;
    public Map<String, String> m;

    static {
        t2o.a(767557726);
    }

    public static /* synthetic */ Object ipc$super(vmv vmvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/upload/UploaderParam");
    }

    public void a(z24 z24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c01cdc", new Object[]{this, z24Var});
        } else if (z24Var != null) {
            this.f32478a = z24Var.f32478a;
            this.b = z24Var.b;
            this.c = z24Var.c;
            this.d = z24Var.d;
            this.e = z24Var.e;
            this.h = z24Var.h;
        }
    }
}
