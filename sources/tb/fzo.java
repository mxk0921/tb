package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fzo extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IDLE = "idle";
    public static final String SCROLLING = "scrolling";
    public final String b;

    static {
        t2o.a(912261329);
    }

    public fzo() {
    }

    public static /* synthetic */ Object ipc$super(fzo fzoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bizmessage/ScrollerLayoutMessage");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.b;
    }

    public fzo(String str) {
        this.b = str;
    }
}
