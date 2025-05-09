package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.tao.Globals;
import java.net.URLDecoder;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ks0 implements ofb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092407);
        t2o.a(806354949);
    }

    @Override // tb.ofb
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321b3cb6", new Object[]{this, str, str2});
        } else {
            AlimamaAdvertising.instance().buildInteractTracking(URLDecoder.decode(str)).withArgPid(str2).withNameSpace("TargetQzt").commit();
        }
    }

    @Override // tb.ofb
    public void b(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0f8aca", new Object[]{this, str, str2, list});
        } else {
            AlimamaAdvertising.instance().handleAdUrlForClickid(str, str2, list);
        }
    }

    @Override // tb.ofb
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb959d34", new Object[]{this, str, str2, str3});
        } else {
            AlimamaAdvertising.instance().buildIfsExposure(Globals.getApplication(), str).withArgPid(str2).withArgNamespace(str3).commit();
        }
    }

    @Override // tb.ofb
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d585bcf", new Object[]{this, str});
        } else {
            AlimamaAdvertising.instance().handleAdUrlForClickid(str);
        }
    }
}
