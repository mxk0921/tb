package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.stat.MtopMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28420a = false;
    public static final int[] b = {2001};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends g2v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/mtop/UTMtopConfigExtend$1");
        }

        @Override // tb.g2v
        public int[] getAttentionEventIds() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this});
            }
            return t1v.access$000();
        }

        @Override // tb.g2v
        public String getPluginName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this});
            }
            return "UTMtopConfig";
        }

        @Override // tb.g2v
        public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
            }
            try {
                String utparamCnt = u1v.getUtparamCnt(str);
                if (hsq.f(utparamCnt)) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("utparam-cnt", utparamCnt);
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(utparamCnt);
                return hashMap;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        t2o.a(962593328);
    }

    public static /* synthetic */ int[] access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("ddeae84d", new Object[0]);
        }
        return b;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (b1v.bUTMtopConfig && !f28420a) {
            f28420a = true;
            try {
                MtopMonitor.addResponseHeaderMonitor(v1v.MTOP_HEAD, new v1v());
                i2v.getInstance().registerPlugin(new a());
            } catch (Throwable th) {
                nhh.u("UTMtopConfigExtend", th, "初始化UTMtopMonitor监听失败");
            }
        }
    }
}
