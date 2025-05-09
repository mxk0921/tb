package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lgt implements mfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782158);
        t2o.a(486539313);
    }

    @Override // tb.mfc
    public void a(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684218b7", new Object[]{this, str, new Integer(i), str2, str3, str4, str5});
        } else {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, str5);
        }
    }

    @Override // tb.mfc
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b8e06e", new Object[]{this, str});
        } else {
            UTAnalytics.getInstance().getUTSceneTracker().endScene(str);
        }
    }

    @Override // tb.mfc
    public void c(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9834d145", new Object[]{this, str, map, map2, map3});
        } else {
            UTAnalytics.getInstance().getUTSceneTracker().beginScene(str, map, map2, map3);
        }
    }

    @Override // tb.mfc
    public void updateNextPageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    @Override // tb.mfc
    public void updateNextPageUtParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac44f4", new Object[]{this, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(str);
        }
    }

    @Override // tb.mfc
    public void updatePageProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
        }
    }
}
