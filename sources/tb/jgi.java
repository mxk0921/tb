package tb;

import android.graphics.Bitmap;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.taobaoavsdk.InterfaceUsageCounter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jgi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MediaPlayCenter f21987a;

    static {
        t2o.a(774897750);
    }

    public jgi(MediaPlayCenter mediaPlayCenter) {
        MediaPlayCenter mediaPlayCenter2 = this.f21987a;
        if (mediaPlayCenter2 != null) {
            mediaPlayCenter2.destroy();
        }
        this.f21987a = mediaPlayCenter;
    }

    public Bitmap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.avproxy_getCurrentFrame);
        MediaPlayCenter mediaPlayCenter = this.f21987a;
        if (mediaPlayCenter != null) {
            return mediaPlayCenter.getCurrentFrame();
        }
        return null;
    }

    public MediaPlayCenter b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaPlayCenter) ipChange.ipc$dispatch("1c96ce4", new Object[]{this});
        }
        return this.f21987a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbb989ea", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.avproxy_getPlayToken);
        MediaPlayCenter mediaPlayCenter = this.f21987a;
        if (mediaPlayCenter != null) {
            return mediaPlayCenter.getPlayToken();
        }
        return "";
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52506da3", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.avproxy_getVideoPlayUrl);
        return this.f21987a.getMediaPlayUrl();
    }

    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.avproxy_getView);
        return this.f21987a.getView();
    }
}
