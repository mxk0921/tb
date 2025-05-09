package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o4l extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public boolean c = false;

    static {
        t2o.a(912261322);
    }

    public static o4l a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o4l) ipChange.ipc$dispatch("366668b0", new Object[]{str, new Boolean(z)});
        }
        o4l o4lVar = new o4l();
        o4lVar.b = str;
        o4lVar.c = z;
        return o4lVar;
    }

    public static /* synthetic */ Object ipc$super(o4l o4lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bizmessage/OpenRateMessage");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.b;
    }

    public Boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3c8a2e48", new Object[]{this});
        }
        return Boolean.valueOf(this.c);
    }
}
