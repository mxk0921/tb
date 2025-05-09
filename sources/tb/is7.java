package tb;

import android.text.TextUtils;
import anet.channel.strategy.HttpDnsAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class is7 implements hs7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f21545a;

    public is7() {
        HashSet hashSet = new HashSet(4);
        this.f21545a = hashSet;
        String config = OrangeConfig.getInstance().getConfig(ual.GROUP, "httpdns_hosts", "appdownload.alicdn.com");
        if (!TextUtils.isEmpty(config)) {
            List asList = Arrays.asList(config.split(","));
            hashSet.addAll(asList);
            HttpDnsAdapter.setHosts(new ArrayList(asList));
        }
    }

    public List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c55d1c1", new Object[]{this, str});
        }
        b(str);
        ArrayList<HttpDnsAdapter.HttpDnsOrigin> originsByHttpDns = HttpDnsAdapter.getOriginsByHttpDns(str);
        ArrayList arrayList = new ArrayList();
        if (originsByHttpDns != null) {
            for (HttpDnsAdapter.HttpDnsOrigin httpDnsOrigin : originsByHttpDns) {
                String originIP = httpDnsOrigin.getOriginIP();
                int originPort = httpDnsOrigin.getOriginPort();
                arrayList.add(originIP + ":" + originPort);
            }
        }
        return arrayList;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fc43b", new Object[]{this, str});
        } else if (!((HashSet) this.f21545a).contains(str)) {
            ((HashSet) this.f21545a).add(str);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            HttpDnsAdapter.setHosts(arrayList);
        }
    }
}
