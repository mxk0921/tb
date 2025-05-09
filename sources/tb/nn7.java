package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286729);
    }

    public static String a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e570aaf", new Object[]{fVar});
        }
        StringBuilder sb = new StringBuilder();
        if (fVar == null) {
            sb.append("dxError is null");
            return sb.toString();
        }
        for (f.a aVar : fVar.c) {
            sb.append(aVar.toString());
        }
        return sb.toString();
    }
}
