package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.aspect.error.umbrella.monitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class io extends ls {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public UMLinkLogInterface c;

    static {
        t2o.a(81788960);
    }

    public static /* synthetic */ Object ipc$super(io ioVar, String str, Object... objArr) {
        if (str.hashCode() == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/aspect/AURAUmbrellaMonitorExtension");
    }

    public final HashMap<String, String> B(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b4a89f1b", new Object[]{this, miVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("bizCode", x().d());
        Map<String, Object> d = miVar.d();
        if (d != null) {
            for (Map.Entry<String, Object> entry : d.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        ni a2 = miVar.a();
        if (a2 != null) {
            hashMap.put("serviceCode", a2.b());
            hashMap.put("flowCode", a2.a());
        }
        return hashMap;
    }

    @Override // tb.wab
    public void b(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            return;
        }
        String d = x().d();
        String c = miVar.c();
        String str = c + "_" + miVar.b();
        String e = miVar.e();
        HashMap hashMap = new HashMap();
        HashMap<String, String> B = B(miVar);
        this.c.logError("AURAMonitor", d, c, null, str, e, hashMap, cyu.b(B));
        this.c.commitFailure(c, "AURAMonitor", "1.0", "AURAMonitor", d, B, str, e);
        ck.g().b(ck.AURA_LOGGER, "onError", d + "|" + c + "|" + str + "|" + e + "|" + B);
    }

    @Override // tb.ls, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.c = hdv.a();
    }
}
