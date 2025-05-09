package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface uhc extends zrb<uhc> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438817);
        }

        public static /* synthetic */ boolean a(uhc uhcVar, String str, boolean z, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a2c07661", new Object[]{uhcVar, str, new Boolean(z), new Integer(i), obj})).booleanValue();
            }
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return uhcVar.getBoolean(str, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoolean");
        }
    }

    String F(String str, String str2);

    boolean I(String str, String str2, boolean z);

    String b(String str, String str2, String str3);

    boolean getBoolean(String str, boolean z);

    int getInt(String str, int i);

    int o(String str, String str2, int i);
}
