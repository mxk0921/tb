package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dkg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static toc f17882a;

    static {
        t2o.a(511705207);
    }

    public static void a(String str, long j, boolean z, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596c0d3f", new Object[]{str, new Long(j), new Boolean(z), hashMap});
            return;
        }
        toc tocVar = f17882a;
        if (tocVar != null) {
            tocVar.a("LcMNN", str, j, z, hashMap);
        }
    }

    public static void b(toc tocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80c319c", new Object[]{tocVar});
        } else {
            f17882a = tocVar;
        }
    }
}
