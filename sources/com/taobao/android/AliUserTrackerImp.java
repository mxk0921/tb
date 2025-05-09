package com.taobao.android;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliUserTrackerImp implements AliUserTrackerInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AliUserTrackerImp b = new AliUserTrackerImp();

    /* renamed from: a  reason: collision with root package name */
    public final UTTracker f6244a = UTAnalytics.getInstance().getDefaultTracker();

    public static CT b(AliUserTrackerCT aliUserTrackerCT) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CT) ipChange.ipc$dispatch("d233b4ee", new Object[]{aliUserTrackerCT});
        }
        return CT.valueOf(aliUserTrackerCT.toString());
    }

    public static AliUserTrackerImp getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUserTrackerImp) ipChange.ipc$dispatch("5afedf29", new Object[0]);
        }
        return b;
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b610b5c", new Object[]{this, str, new Integer(i), obj, obj2, obj3, strArr});
        } else {
            TBS.Ext.commitEvent(str, i, obj, obj2, obj3, strArr);
        }
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void d(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cac8b1", new Object[]{this, obj, str});
        } else {
            this.f6244a.pageAppear(obj, str);
        }
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void e(String str, AliUserTrackerCT aliUserTrackerCT, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850843b6", new Object[]{this, str, aliUserTrackerCT, str2, strArr});
        } else {
            TBS.Adv.ctrlClickedOnPage(str, b(aliUserTrackerCT), str2, strArr);
        }
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public Map<String, String> getPageAllProperties(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ea4a06bd", new Object[]{this, activity});
        }
        return this.f6244a.getPageAllProperties(activity);
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void pageDisAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{this, obj});
        } else {
            this.f6244a.pageDisAppear(obj);
        }
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void updatePageName(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{this, obj, str});
        } else {
            this.f6244a.updatePageName(obj, str);
        }
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void updatePageProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
        } else {
            this.f6244a.updatePageProperties(obj, map);
        }
    }
}
