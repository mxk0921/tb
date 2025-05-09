package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cxl extends cv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(cxl cxlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/PerformMonitor");
    }

    @Override // tb.cv
    public void a(String str, DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73050d2c", new Object[]{this, str, dinamicTemplate});
        } else if (dinamicTemplate != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("templateId", dinamicTemplate.name + "_" + dinamicTemplate.version);
            hashMap.put("module", str);
            hashMap.put("renderType", "bindData");
            lq6.a().e(tl7.TAG, hashMap);
        }
    }

    @Override // tb.cv
    public void b(String str, DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a266", new Object[]{this, str, dinamicTemplate});
        } else if (dinamicTemplate != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("templateId", dinamicTemplate.name + "_" + dinamicTemplate.version);
            hashMap.put("module", str);
            hashMap.put("renderType", "createView");
            lq6.a().e(tl7.TAG, hashMap);
        }
    }
}
