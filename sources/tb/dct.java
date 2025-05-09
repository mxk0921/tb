package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dct extends nvv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public dct(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(dct dctVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 287307264) {
            return super.getUpdatePageName();
        }
        if (hashCode == 820060925) {
            return super.getUpdatePageProperties();
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/oversea/homepage/litetao/service/biz/sceneservice/invoke/TaoteUtInvokerImpl");
    }

    @Override // tb.nvv, tb.e8e
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        String updatePageName = super.getUpdatePageName();
        if (TextUtils.isEmpty(updatePageName)) {
            return "Page_TMGTaote";
        }
        return updatePageName;
    }

    @Override // tb.nvv, tb.e8e
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        Map<String, String> updatePageProperties = super.getUpdatePageProperties();
        if (updatePageProperties == null) {
            updatePageProperties = new HashMap<>(16);
        }
        updatePageProperties.put("spm-cnt", "a2141.26469588.0.0");
        return updatePageProperties;
    }
}
