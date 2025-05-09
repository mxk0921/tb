package tb;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.compute.DAIComputeService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class o6n extends d0q<List<Map<String, String>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SINK_TYPE = "python_cep_task";
    public static final String TAG = "PythonCepTaskSink";
    public final String b;
    public final boolean c;

    static {
        t2o.a(1034944735);
    }

    public o6n(String str, String str2, boolean z) {
        super(str);
        this.b = str2;
        this.c = z;
    }

    public static /* synthetic */ Object ipc$super(o6n o6nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/trigger/protocol/cep/PythonCepTaskSink");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdf55e25", new Object[]{this});
        }
        return this.b;
    }

    /* renamed from: c */
    public void a(List<Map<String, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("effe2a83", new Object[]{this, list});
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.c) {
            hashMap.put("match_seq", JSON.toJSONString(list));
        } else if (list.size() > 0) {
            hashMap.putAll(list.get(0));
        } else {
            kgh.c("Cep", "cannot run PythonCepTaskSink because input is empty");
        }
        try {
            kzo.c().e().h(this.b, hashMap, DAIComputeService.TaskPriority.NORMAL, null, this.f17490a);
        } catch (Exception e) {
            Log.e(TAG, "run cep sink exception", e);
        }
    }
}
