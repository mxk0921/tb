package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class byr implements m4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092394);
        t2o.a(806355948);
    }

    @Override // tb.m4e
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff07c6", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(obj);
        }
    }

    @Override // tb.m4e
    public Map<String, String> c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97847fb0", new Object[]{this, obj});
        }
        return UTAnalytics.getInstance().getDefaultTracker().getPageProperties(obj);
    }

    @Override // tb.m4e
    public Map<String, String> getPageAllProperties(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ea4a06bd", new Object[]{this, activity});
        }
        return UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(activity);
    }

    @Override // tb.m4e
    public void pageAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52025aa7", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(obj);
        }
    }

    @Override // tb.m4e
    public void pageDisAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(obj);
        }
    }

    @Override // tb.m4e
    public void skipPage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ec0ed1", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(obj);
        }
    }

    @Override // tb.m4e
    public void track4Click(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b70f26b", new Object[]{this, str, str2, map});
            return;
        }
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str, "Button-" + str2);
        uTHitBuilders$UTControlHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
    }

    @Override // tb.m4e
    public void track4Show(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9fba64", new Object[]{this, str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", map).build());
        }
    }

    @Override // tb.m4e
    public void trackCustom(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60e9531", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
        }
    }

    @Override // tb.m4e
    public void updateNextPageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    @Override // tb.m4e
    public void updateNextPageUtParam(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b002a09b", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(map));
        }
    }

    @Override // tb.m4e
    public void updatePageName(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{this, obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(obj, str);
        }
    }

    @Override // tb.m4e
    public void updatePageProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
        }
    }

    @Override // tb.m4e
    public void updatePageUtparam(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c541ce3", new Object[]{this, obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(obj, str);
        }
    }

    @Override // tb.m4e
    public void trackCustom(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d98bbee", new Object[]{this, str, str2, map});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str2);
        uTHitBuilders$UTCustomHitBuilder.setEventPage(str);
        uTHitBuilders$UTCustomHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    @Override // tb.m4e
    public void track4Click(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6bc7905", new Object[]{this, str, str2, strArr});
        } else {
            TBS.Adv.ctrlClicked(str, CT.Button, str2, strArr);
        }
    }
}
