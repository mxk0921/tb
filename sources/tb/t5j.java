package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.OrangeConfigLocal;
import java.util.Map;
import mtopsdk.common.util.TBSdkLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class t5j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f28500a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            }
        }
    }

    static {
        try {
            IpChange ipChange = OrangeConfig.$ipChange;
            f28500a = true;
        } catch (Exception unused) {
            TBSdkLog.w("mtopsdk.OrangeAdapter", "load com.taobao.orange.OrangeConfig error,no orange sdk");
            f28500a = false;
        }
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{str, str2, str3});
        }
        if (f28500a) {
            return OrangeConfigLocal.getInstance().getConfig(str, str2, str3);
        }
        TBSdkLog.w("mtopsdk.OrangeAdapter", "[getConfig] getConfig error,no orange sdk");
        return str3;
    }

    public static Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{str});
        }
        if (f28500a) {
            return OrangeConfigLocal.getInstance().getConfigs(str);
        }
        TBSdkLog.w("mtopsdk.OrangeAdapter", "[getConfig] getConfigs by groupName error,no orange sdk");
        return null;
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (f28500a) {
            OrangeConfigLocal.getInstance().init(context);
        } else {
            TBSdkLog.w("mtopsdk.OrangeAdapter", "[init] init orange error,no orange sdk");
        }
    }

    public static void d(String[] strArr, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2009fb", new Object[]{strArr, aVar});
        } else if (f28500a) {
            OrangeConfigLocal.getInstance().registerListener(strArr, aVar);
        } else {
            TBSdkLog.w("mtopsdk.OrangeAdapter", "[registerListener] registerListener error,no orange sdk");
        }
    }
}
