package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g3v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static g3v b = null;

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f19715a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onH5JSCall(Object obj, Map<String, String> map);
    }

    static {
        t2o.a(962593300);
    }

    public static synchronized g3v getInstance() {
        synchronized (g3v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g3v) ipChange.ipc$dispatch("78d53cda", new Object[0]);
            }
            if (b == null) {
                b = new g3v();
            }
            return b;
        }
    }

    public void clearHost4Https(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c94db5", new Object[]{this, context});
        } else if (context != null) {
            iaq.b(context, l8b.TAG_HTTPS_HOST_PORT, null);
        }
    }

    public void clearHost4TimeAdjustService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9605487", new Object[]{this, context});
        } else if (context != null) {
            iaq.b(context, lut.TAG_TIME_ADJUST_HOST_PORT, null);
        }
    }

    public void clearHostPort4Http(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da44d5fb", new Object[]{this, context});
        } else if (context != null) {
            iaq.b(context, "http_host", null);
        }
    }

    public void clearHostPort4Tnet(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584f197a", new Object[]{this, context});
        } else if (context != null) {
            iaq.b(context, pzt.TAG_TNET_HOST_PORT, null);
        }
    }

    public void clearHostPort4TnetIpv6(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d05453", new Object[]{this, context});
        } else if (context != null) {
            iaq.b(context, "utanalytics_tnet_host_port_ipv6", null);
        }
    }

    public void clearIgnoreTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21db0a11", new Object[]{this, view});
        } else {
            sp8.clearIgnoreTagForExposureView(view);
        }
    }

    public void clearStaticHostPort4Tnet(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("997944c8", new Object[]{this, context});
        } else if (context != null) {
            iaq.b(context, uzt.TAG_STATIC_TNET_HOST_PORT, null);
        }
    }

    public void clearViewGroupTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7e9943", new Object[]{this, view});
        } else {
            sp8.clearViewGroupTagForExposureView(view);
        }
    }

    public void closeAuto1010Track() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b3cd0d", new Object[]{this});
        } else {
            wu3.c().i();
        }
    }

    public void dispatchH5JSCall(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323f8454", new Object[]{this, obj, map});
            return;
        }
        int size = ((ArrayList) this.f19715a).size();
        for (int i = 0; i < size; i++) {
            ((a) ((ArrayList) this.f19715a).get(i)).onH5JSCall(obj, map);
        }
    }

    public void dispatchLocalHits() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2516edf8", new Object[]{this});
        } else {
            UTAnalytics.getInstance().dispatchLocalHits();
        }
    }

    public up8 getExposureViewHandler(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (up8) ipChange.ipc$dispatch("c931bb82", new Object[]{this, activity});
        }
        return ccu.getInstance().getExposureViewHandle();
    }

    public String getUtsid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f70c80", new Object[]{this});
        }
        Context b2 = wu3.c().b();
        if (b2 == null) {
            return null;
        }
        try {
            long b3 = vep.a().b();
            String a2 = wu3.c().a();
            String utdid = UTDevice.getUtdid(b2);
            if (!hsq.f(a2) && !hsq.f(utdid)) {
                return utdid + "_" + a2 + "_" + b3;
            }
        } catch (Exception e) {
            nhh.u("", e, new Object[0]);
        }
        return null;
    }

    @Deprecated
    public void initialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0ba15b", new Object[]{this});
        }
    }

    public void registerExposureViewHandler(up8 up8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc219cf", new Object[]{this, up8Var});
        } else {
            ccu.getInstance().registerExposureViewHandler(up8Var);
        }
    }

    public void registerH5JSCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4f7e5e", new Object[]{this, aVar});
        } else if (aVar != null && !((ArrayList) this.f19715a).contains(aVar)) {
            ((ArrayList) this.f19715a).add(aVar);
        }
    }

    public void saveCacheDataToLocal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb3568", new Object[]{this});
        } else {
            UTAnalytics.getInstance().saveCacheDataToLocal();
        }
    }

    public void setExposureTagForWeex(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d290f2", new Object[]{this, view});
        } else {
            sp8.setExposureForWeex(view);
        }
    }

    public void setHost4Https(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934df3ca", new Object[]{this, context, str});
        } else if (context != null && !TextUtils.isEmpty(str)) {
            iaq.b(context, l8b.TAG_HTTPS_HOST_PORT, str);
        }
    }

    public void setHost4TimeAdjustService(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce1b19c", new Object[]{this, context, str});
        } else if (context != null && !TextUtils.isEmpty(str)) {
            iaq.b(context, lut.TAG_TIME_ADJUST_HOST_PORT, str);
        }
    }

    public void setHostPort4Http(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f331c79a", new Object[]{this, context, str});
        } else if (context != null && !TextUtils.isEmpty(str)) {
            iaq.b(context, "http_host", str);
        }
    }

    public void setHostPort4Tnet(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d921d4ca", new Object[]{this, context, str, new Integer(i)});
        } else if (context != null && !TextUtils.isEmpty(str)) {
            iaq.b(context, pzt.TAG_TNET_HOST_PORT, str + ":" + i);
        }
    }

    public void setHostPort4TnetIpv6(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851b13d1", new Object[]{this, context, str, new Integer(i)});
        } else if (context != null && !TextUtils.isEmpty(str)) {
            iaq.b(context, "utanalytics_tnet_host_port_ipv6", str + ":" + i);
        }
    }

    public void setIgnoreTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91698b5c", new Object[]{this, view});
        } else {
            sp8.setIgnoreTagForExposureView(view);
        }
    }

    public void setStaticHostPort4Tnet(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c43c267c", new Object[]{this, context, str, new Integer(i)});
        } else if (context != null && !TextUtils.isEmpty(str)) {
            iaq.b(context, uzt.TAG_STATIC_TNET_HOST_PORT, str + ":" + i);
        }
    }

    public void setToAliyunOsPlatform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa53712f", new Object[]{this});
        } else {
            UTAnalytics.getInstance().setToAliyunOsPlatform();
        }
    }

    public void setViewGroupTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f69018", new Object[]{this, view});
        } else {
            sp8.setViewGroupTagForExposureView(view);
        }
    }

    public boolean startExpoTrack(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34463e14", new Object[]{this, activity})).booleanValue();
        }
        return ccu.getInstance().addToTrack(activity);
    }

    public boolean stopExpoTrack(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75ff5674", new Object[]{this, activity})).booleanValue();
        }
        return ccu.getInstance().removeToTrack(activity);
    }

    public void turnOffRealTimeDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f108167d", new Object[]{this});
            return;
        }
        nhh.g();
        UTAnalytics.getInstance().turnOffRealTimeDebug();
    }

    public void turnOnRealTimeDebug(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee88af2", new Object[]{this, map});
            return;
        }
        nhh.f("UTTeamWork", "", map.entrySet().toArray());
        UTAnalytics.getInstance().turnOnRealTimeDebug(map);
    }

    public void unRegisterExposureViewHandler(up8 up8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32a9b88", new Object[]{this, up8Var});
        } else {
            ccu.getInstance().unRegisterExposureViewHandler(up8Var);
        }
    }

    public void unRegisterH5JSCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2f1a57", new Object[]{this, aVar});
        } else if (aVar != null) {
            ((ArrayList) this.f19715a).remove(aVar);
        }
    }
}
