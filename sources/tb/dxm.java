package tb;

import android.text.TextUtils;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.interact.publish.service.PublishService;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dxm implements ie2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f18136a;
    public final Map<String, Integer> b;

    public dxm() {
        HashMap hashMap = new HashMap();
        this.f18136a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.put("taobaogame", 0);
        hashMap.put(PublishService.GROUP_NAME, 0);
        hashMap.put("lab", 0);
        hashMap.put("hotpatch", 20);
        hashMap.put("dexpatch", 20);
        hashMap.put("apkupdate", 20);
        hashMap.put("bundleupdate", 20);
        hashMap.put("lightapk", 19);
        hashMap.put("x86libsupdate", 20);
        hashMap.put("my3dZone", 0);
        hashMap.put("databord", 10);
        hashMap.put("windvane", 10);
        hashMap.put("taolib", 10);
        hashMap.put(DnsPreference.KEY_TRADE, 20);
        hashMap.put("silence", 10);
        hashMap.put("silence-buchang", 10);
        hashMap.put("remoteso", 20);
        hashMap.put("splitdownload", 20);
        hashMap2.put("taolivehome", 40);
        hashMap2.put("TBSubscribe", 40);
        hashMap2.put("libartc_engine", 40);
        hashMap2.put("ali_cart.so", 40);
        hashMap2.put("taobao_wangxin", 35);
        hashMap2.put("messagesdkwrapper", 35);
        hashMap2.put("libkernelu4_7z_uc.so", 35);
        hashMap2.put("triver_taobao", 30);
        hashMap2.put("libMNN.so", 25);
        hashMap2.put("libMNN_CL.so", 25);
        hashMap2.put("libMNN_Express.so", 25);
        hashMap2.put("libMNNOpenCV.so", 25);
        hashMap2.put("libmnnkitcore.so", 25);
        hashMap2.put("libAliNNPython.so", 25);
        hashMap2.put("libwalle_base.so", 25);
        hashMap2.put("libmnnpybridge.so", 25);
        hashMap2.put("libmnnface.so", 25);
    }

    public int a(List<onf> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1871313", new Object[]{this, list})).intValue();
        }
        if (!(list == null || list.size() == 0)) {
            try {
                for (onf onfVar : list) {
                    for (String str : ((HashMap) this.b).keySet()) {
                        if (onfVar.f25507a.contains(str)) {
                            return ((Integer) ((HashMap) this.b).get(str)).intValue();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 20;
    }

    public int b(upl uplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("232d59df", new Object[]{this, uplVar})).intValue();
        }
        if (uplVar != null && !TextUtils.isEmpty(uplVar.f29547a)) {
            return c(uplVar.f29547a);
        }
        throw new RuntimeException("request's bizId is Needed");
    }

    public int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3554421e", new Object[]{this, str})).intValue();
        }
        Integer num = (Integer) ((HashMap) this.f18136a).get(str);
        if (num == null) {
            OrangeConfig instance = OrangeConfig.getInstance();
            String config = instance.getConfig(ual.GROUP, "BIZ_" + str, "");
            if (!TextUtils.isEmpty(config) && TextUtils.isDigitsOnly(config)) {
                num = Integer.valueOf(config);
            }
        }
        if (num == null) {
            return 10;
        }
        return num.intValue();
    }
}
