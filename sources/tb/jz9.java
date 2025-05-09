package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.business.expose.FreqControlExposeRequest;
import com.taobao.taolive.sdk.goodlist.TemplateListResponse;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jz9 extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698543);
    }

    public jz9(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(jz9 jz9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/guide/business/expose/FreqControlExposeBusiness");
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f212fdba", new Object[]{this, str});
            return;
        }
        FreqControlExposeRequest freqControlExposeRequest = new FreqControlExposeRequest();
        freqControlExposeRequest.key = str;
        HashMap hashMap = new HashMap();
        freqControlExposeRequest.extendParams = hashMap;
        hashMap.put("reportSource", up6.r(vx9.d()));
        C(0, freqControlExposeRequest, TemplateListResponse.class);
    }
}
