package anet.channel.util;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.InetSocketAddress;
import java.net.Proxy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ProxySetting {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ProxySetting proxySetting = null;
    private final String authAccount;
    private final String authPassword;
    private final Proxy proxy;

    static {
        t2o.a(607125954);
    }

    public ProxySetting(String str, int i, String str2, String str3) {
        this.proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i));
        this.authAccount = str2;
        this.authPassword = str3;
    }

    public static ProxySetting get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProxySetting) ipChange.ipc$dispatch("2270cab8", new Object[0]);
        }
        return proxySetting;
    }

    public static void set(ProxySetting proxySetting2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3919d848", new Object[]{proxySetting2});
        } else {
            proxySetting = proxySetting2;
        }
    }

    public String getBasicAuthorization() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9335dcb8", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.authAccount);
        sb.append(":");
        sb.append(this.authPassword);
        String encodeToString = Base64.encodeToString(sb.toString().getBytes(), 0);
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Basic ");
        sb2.append(encodeToString);
        return sb2.toString();
    }

    public Proxy getProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Proxy) ipChange.ipc$dispatch("8858e097", new Object[]{this});
        }
        return this.proxy;
    }
}
