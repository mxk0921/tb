package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ltv implements psd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23563a;

    static {
        t2o.a(758120550);
        t2o.a(758120485);
    }

    @Override // tb.psd
    public void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b610b5c", new Object[]{this, str, new Integer(i), obj, obj2, obj3, strArr});
        } else {
            TBS.Ext.commitEvent(str, i, obj, obj2, obj3, strArr);
        }
    }

    @Override // tb.psd
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b68c695", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f23563a)) {
            this.f23563a = c2v.getInstance().getCurrentPageName();
        }
        return this.f23563a;
    }

    @Override // tb.psd
    public void pageAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52025aa7", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(this);
        }
    }

    @Override // tb.psd
    public void pageDisAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        }
    }

    @Override // tb.psd
    public void updatePageName(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{this, obj, str});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(obj, str);
        this.f23563a = str;
    }

    @Override // tb.psd
    public void updatePageProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
        }
    }
}
