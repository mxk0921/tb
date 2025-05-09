package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qo0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989990);
    }

    public static List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("63222d21", new Object[0]);
        }
        String k = i0r.k("aura_purchase_monitor", "eventClickWhiteNames", "Page_NewConfirmOrder_Button_collocation_whole-buyOneBusiness");
        if (!TextUtils.isEmpty(k)) {
            return Arrays.asList(k.split(","));
        }
        return null;
    }

    public static List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d97dd587", new Object[0]);
        }
        String k = i0r.k("aura_purchase_monitor", "eventBlackNames", "");
        if (!TextUtils.isEmpty(k)) {
            return Arrays.asList(k.split(","));
        }
        return null;
    }

    public static List<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("91919fd6", new Object[0]);
        }
        String k = i0r.k("aura_purchase_monitor", "eventExposureWhiteNames", "Page_NewConfirmOrder_Button_collocation_whole-buyOneBusiness");
        if (!TextUtils.isEmpty(k)) {
            return Arrays.asList(k.split(","));
        }
        return null;
    }

    public static List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2cd547e1", new Object[0]);
        }
        String k = i0r.k("aura_purchase_monitor", "mtopBlackNames", "F-10012-01-16-001,200IEC20000,0AEC20000,F-10012-01-16-114,420IEC20000,420AES10016,P-10000-11-17-021");
        if (!TextUtils.isEmpty(k)) {
            return Arrays.asList(k.split(","));
        }
        return null;
    }
}
