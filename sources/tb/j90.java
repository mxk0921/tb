package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.action.RequestAction;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j90 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashMap<String, w80> sActions;

    static {
        t2o.a(404750352);
        HashMap<String, w80> hashMap = new HashMap<>();
        sActions = hashMap;
        hashMap.put(t8k.NAME, new t8k());
        hashMap.put(csu.NAME_OLD, new csu());
        hashMap.put(csu.NAME, new csu());
        hashMap.put(RequestAction.NAME, new RequestAction());
    }

    public static w80 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w80) ipChange.ipc$dispatch("ce25478", new Object[]{str});
        }
        return sActions.get(str);
    }
}
