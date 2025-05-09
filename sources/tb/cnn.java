package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.oversea.homepage.common.aiservice.AbstractAiService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cnn extends AbstractAiService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(cnn cnnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/common/aiservice/RecommendAiService");
    }

    @Override // com.taobao.oversea.homepage.common.aiservice.AbstractAiService
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fffb991c", new Object[]{this});
        }
        return "mtop.taobao.wireless.home.newface.awesome.get";
    }

    @Override // com.taobao.oversea.homepage.common.aiservice.AbstractAiService
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("123f729e", new Object[]{this});
        }
        return "1.0";
    }
}
