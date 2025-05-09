package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oqv extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean b;
    public final String c;

    static {
        t2o.a(912261332);
    }

    public oqv(boolean z, String str) {
        this.b = z;
        this.c = str;
    }

    public static /* synthetic */ Object ipc$super(oqv oqvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bizmessage/UserClickVideoPlayIconMessage");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3af8041a", new Object[]{this});
        }
        return this.c;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d212982d", new Object[]{this})).booleanValue();
        }
        return this.b;
    }
}
