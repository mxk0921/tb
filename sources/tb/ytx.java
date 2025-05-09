package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ytx extends ndt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean d;

    public ytx(String str, String str2, String str3, boolean z) {
        this.f24666a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public static /* synthetic */ Object ipc$super(ytx ytxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/uploader/implement/d/a");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "[retryable:" + this.d + " code:" + this.f24666a + " subcode:" + this.b + " info:" + this.c + "]";
    }
}
