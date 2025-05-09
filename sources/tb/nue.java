package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static bfc f24955a;

    static {
        t2o.a(486539280);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713dc6a4", new Object[]{dinamicXEngine});
            return;
        }
        bfc bfcVar = f24955a;
        if (bfcVar != null) {
            bfcVar.a(dinamicXEngine);
        }
    }

    public static void b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("614092cb", new Object[]{dinamicXEngine});
            return;
        }
        bfc bfcVar = f24955a;
        if (bfcVar != null) {
            bfcVar.b(dinamicXEngine);
        }
    }

    public static void c(bfc bfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b07907", new Object[]{bfcVar});
        } else {
            f24955a = bfcVar;
        }
    }
}
