package tb;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class mdv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mdv INSTANCE = new mdv();

    static {
        t2o.a(490733622);
    }

    public final Map<String, String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4e9dc03", new Object[]{this, str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("containerType", str);
        hashMap.put("pageUrl", str2);
        return hashMap;
    }

    public final void b(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec11ffa", new Object[]{this, str, str2, str3, str4, str5, str6});
            return;
        }
        ckf.g(str, TypedValues.CycleType.S_WAVE_PHASE);
        ckf.g(str2, "errorCode");
        ckf.g(str3, "errorMsg");
        ckf.g(str4, "businessId");
        ckf.g(str5, "solutionType");
        ckf.g(str6, "pageUrl");
        tve.b(str, "container", "1.0", nm4.MAIN_BIZ_NAME, str4, a(str5, str6), str2, str3);
    }

    public final void c(String str, String str2, TMSEmbedSolutionType tMSEmbedSolutionType, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4998430a", new Object[]{this, str, str2, tMSEmbedSolutionType, str3});
            return;
        }
        ckf.g(str, TypedValues.CycleType.S_WAVE_PHASE);
        ckf.g(str2, "businessId");
        ckf.g(tMSEmbedSolutionType, "solutionType");
        ckf.g(str3, "pageUrl");
        tve.c(str, "container", "1.0", nm4.MAIN_BIZ_NAME, str2, a(tMSEmbedSolutionType.name(), str3));
    }
}
