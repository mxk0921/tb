package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.adapter.BehaviXAppAdapter;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k9t implements qja {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAMETER_APP_VERSION = "appVersion";

    static {
        t2o.a(404750704);
        t2o.a(404750703);
    }

    @Override // tb.qja
    public boolean a(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ceead4ad", new Object[]{this, hashMap})).booleanValue();
        }
        if (hashMap == null || hashMap.isEmpty()) {
            return false;
        }
        try {
            String[] split = ((String) hashMap.get("appVersion")).split("\\.");
            if (split == null || split.length != 4) {
                return false;
            }
            return c(split[3], 100);
        } catch (Throwable th) {
            TLog.loge("TaobaoGrayVersion", "TaobaoGrayVersion.isGayVersion ", th);
            return false;
        }
    }

    @Override // tb.qja
    public boolean b(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3aeab0b5", new Object[]{this, hashMap})).booleanValue();
        }
        return BehaviXAppAdapter.c(hashMap);
    }

    public final boolean c(String str, int i) throws NumberFormatException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        if (Integer.parseInt(str) < i) {
            return true;
        }
        return false;
    }
}
