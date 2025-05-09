package tb;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t3x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int b = 0;

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<String> f28473a;

    static {
        t2o.a(468713797);
    }

    public void b(hmi hmiVar, String str, int i, int i2, Intent intent) {
        SparseArray<String> sparseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3780e38b", new Object[]{this, hmiVar, str, new Integer(i), new Integer(i2), intent});
        } else if ((65280 & i) == 256 && i2 == 1 && (sparseArray = this.f28473a) != null) {
            String str2 = sparseArray.get(i & 255);
            if (!TextUtils.isEmpty(str2)) {
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", str2);
                hashMap.put("action", me0.EVENT_TYPE);
                hmiVar.f(new vrp("VSMSG_skuAction", str, hashMap));
            }
        }
    }

    public void a(FluidContext fluidContext, Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("789da063", new Object[]{this, fluidContext, fragment, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (this.f28473a == null) {
                this.f28473a = new SparseArray<>();
            }
            int i = (b + 1) % 254;
            b = i;
            this.f28473a.put(i, str);
            int i2 = b + 256;
            Bundle bundle = new Bundle();
            bundle.putString("bizName", "taobaoVideo");
            FluidSDK.getNavAdapter().nav(fluidContext, fragment, "http://a.m.taobao.com/sku" + str + ".htm", bundle, 0, i2);
        }
    }
}
