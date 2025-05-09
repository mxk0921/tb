package tb;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oer extends nv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final uyb f25333a;

    static {
        t2o.a(440401987);
    }

    public oer(fdc fdcVar) {
        super(fdcVar);
        this.f25333a = a(this, fdcVar);
    }

    public static /* synthetic */ Object ipc$super(oer oerVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 151698896:
                super.onPageSelected();
                return null;
            case 1101850916:
                super.onClickRocket();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/hourlydelivery/TBHourDeliveryViewController");
        }
    }

    public final uyb a(nv nvVar, fdc fdcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uyb) ipChange.ipc$dispatch("12843218", new Object[]{this, nvVar, fdcVar});
        }
        return new vb7(nvVar, fdcVar);
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        wfr.INSTANCE.a("TBHourDeliveryViewController", "createView");
        return this.f25333a.createView(context);
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabSearchBoxData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6e039d89", new Object[]{this});
        }
        return this.f25333a.getSubTabSearchBoxData();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        return this.f25333a.getUpdatePageName();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        return this.f25333a.getUpdatePageProperties();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageUtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4393099", new Object[]{this});
        }
        return this.f25333a.getUpdatePageUtParam();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        return this.f25333a.isEnablePullReFresh();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        return this.f25333a.isOnRocketState();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyOutLinkParams(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
            return;
        }
        wfr.INSTANCE.a("TBHourDeliveryViewController", "notifyOutLinkParams");
        this.f25333a.notifyOutLinkParams(intent, str);
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        super.onClickRocket();
        this.f25333a.onClickRocket();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        wfr.INSTANCE.a("TBHourDeliveryViewController", "onDestroy");
        this.f25333a.onDestroy();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        super.onPageSelected();
        this.f25333a.onPageSelected();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
        } else {
            this.f25333a.onPullRefresh();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.f25333a.onResume();
    }
}
