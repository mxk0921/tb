package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface s5c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements s5c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(676331681);
            t2o.a(676331680);
        }

        @Override // tb.s5c
        public String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4723202a", new Object[]{this, str});
            }
            return null;
        }

        @Override // tb.s5c
        public boolean b(Context context, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("acc95f1c", new Object[]{this, context, str, str2})).booleanValue();
            }
            return false;
        }

        @Override // tb.s5c
        public boolean c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6fefed0e", new Object[]{this, str})).booleanValue();
            }
            return false;
        }
    }

    String a(String str);

    boolean b(Context context, String str, String str2);

    boolean c(String str);
}
