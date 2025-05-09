package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class r2v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends g2v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/scene/UTSceneMgr$1");
        }

        @Override // tb.g2v
        public int[] getAttentionEventIds() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this});
            }
            return new int[]{2001};
        }

        @Override // tb.g2v
        public String getPluginName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this});
            }
            return "UTSceneTracker";
        }

        @Override // tb.g2v
        public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
            }
            return UTAnalytics.getInstance().getUTSceneTracker().eventDispatch(map);
        }
    }

    static {
        t2o.a(962593336);
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            i2v.getInstance().registerPlugin(new a());
        }
    }
}
