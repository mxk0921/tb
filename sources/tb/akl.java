package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class akl extends cy1<akl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(794820629);
    }

    public akl(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public static /* synthetic */ Object ipc$super(akl aklVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/common/kit/tracker/model/PVModel");
    }

    public akl j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (akl) ipChange.ipc$dispatch("a0f6fe02", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public akl k(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (akl) ipChange.ipc$dispatch("98478cbc", new Object[]{this, new Float(f)});
        }
        this.b = f;
        return this;
    }
}
