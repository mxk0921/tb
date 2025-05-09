package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.GoodListSearchResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.getredpacket.GetPacketRequest;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v7a extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698915);
    }

    public v7a(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(v7a v7aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/getredpacket/GetPacketBusiness");
    }

    public void K(GetPacketRequest getPacketRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e1bfc3", new Object[]{this, getPacketRequest});
            return;
        }
        if (!TextUtils.isEmpty(getPacketRequest.asac)) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("asac", getPacketRequest.asac);
            A(hashMap);
        }
        C(1, getPacketRequest, GoodListSearchResponse.class);
    }
}
