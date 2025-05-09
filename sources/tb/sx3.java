package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.sync.SyncItem;
import com.taobao.orange.OrangeConfig;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sx3 implements rx3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d74258f7", new Object[]{this, str});
        }
        return OrangeConfig.getInstance().getConfig(ual.GROUP, str, "");
    }

    public zu7 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zu7) ipChange.ipc$dispatch("40850b90", new Object[]{this, str});
        }
        List<SyncItem> b = ual.a().b();
        if (b != null) {
            for (SyncItem syncItem : b) {
                if (str.endsWith(syncItem.url)) {
                    return syncItem.convert();
                }
            }
        }
        return new zu7(str);
    }
}
