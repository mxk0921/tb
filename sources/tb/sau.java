package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class sau extends rau {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544439);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[0])).booleanValue();
        }
        try {
            sau sauVar = new sau();
            UTAnalytics.getInstance().registerPlugin(sauVar);
            c2v.addPageChangerListener(sauVar);
            return true;
        } catch (Throwable th) {
            ogh.h("TrackUTPluginV2", "UT插件注册失败", th);
            return false;
        }
    }

    public static /* synthetic */ Object ipc$super(sau sauVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/track/TrackUTPluginV2");
    }

    @Override // tb.rau
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return "TrackUTPluginV2";
    }

    @Override // tb.g2v
    public String getPluginName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this});
        }
        return "Yixiu";
    }
}
