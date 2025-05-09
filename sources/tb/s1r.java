package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends fzn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ab/internal/switches/SwitchesFactory$1");
        }

        @Override // tb.fzn
        public r1r g(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (r1r) ipChange.ipc$dispatch("29d6a648", new Object[]{this, context});
            }
            return new x8l(context);
        }
    }

    public static r1r a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1r) ipChange.ipc$dispatch("c70e4ada", new Object[0]);
        }
        return new rk2();
    }

    public static r1r b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1r) ipChange.ipc$dispatch("7439b9a8", new Object[0]);
        }
        return new t1r(new v9h(), new rk2(), new sax(), new am8(), new a());
    }
}
