package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexAdvanced;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d7b implements uec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.uec
    public void a(SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa69232", new Object[]{this, soIndexData, soIndexAdvanced});
            return;
        }
        RSoLog.d("HotfixIndexHook, hook(), do nothing, indexData.size=" + soIndexData.getEntries().size() + ", index2.size=" + soIndexAdvanced.getInfoMap().size());
    }

    @Override // tb.uec
    public void b(List<SoIndexData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0d1a1", new Object[]{this, list});
            return;
        }
        RSoLog.d("HotfixIndexHook, hookLastCache(), do nothing, lastIndexList.size=" + list.size());
    }
}
