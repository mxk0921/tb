package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class bkl extends dy1<bkl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886306);
    }

    public bkl(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public static /* synthetic */ Object ipc$super(bkl bklVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/tracker/model/PVModel");
    }

    /* renamed from: a */
    public bkl message(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bkl) ipChange.ipc$dispatch("9462918b", new Object[]{this, str});
        }
        this.message = str;
        return this;
    }

    /* renamed from: b */
    public bkl sampling(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bkl) ipChange.ipc$dispatch("161b86c5", new Object[]{this, new Float(f)});
        }
        this.sampling = f;
        return this;
    }
}
