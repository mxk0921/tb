package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.trigger.protocol.Cep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944731);
    }

    public static egu<?, ?, ?> a(String str, String str2, l45 l45Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (egu) ipChange.ipc$dispatch("d196bc03", new Object[]{str, str2, l45Var});
        }
        if (l45Var == null) {
            return null;
        }
        u6n u6nVar = new u6n(str, str2);
        if (l45Var instanceof n45) {
            return new t3v(str, new s3v((n45) l45Var), u6nVar, "");
        }
        if (l45Var instanceof k45) {
            try {
                return Cep.createFromConfigAndSink(((k45) l45Var).a(), str2, str);
            } catch (Exception e) {
                kgh.d("Cep", "create trigger failed", e);
                return null;
            }
        } else {
            if (l45Var instanceof m45) {
                try {
                    return Cep.createStreamProtocolFromConfigAndSink(((m45) l45Var).a(), str2, str);
                } catch (Exception e2) {
                    kgh.d("Stream_Cep", "create trigger failed", e2);
                }
            }
            return null;
        }
    }
}
