package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bbr implements lfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dbr f16305a;
    public final UMLinkLogInterface b;

    static {
        t2o.a(491782147);
        t2o.a(486539312);
    }

    public bbr() {
        try {
            this.f16305a = new dbr();
            this.b = hdv.a();
        } catch (Throwable th) {
            bqa.b("InfoFlowUmbrella", " create error", th);
        }
    }

    @Override // tb.lfc
    public void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        UMLinkLogInterface uMLinkLogInterface = this.b;
        if (uMLinkLogInterface != null) {
            uMLinkLogInterface.commitFailure(str, str2, str3, str4, str5, map, str6, str7);
        }
        dbr dbrVar = this.f16305a;
        if (dbrVar != null) {
            dbrVar.a(str, str2, str4, map, str6);
        }
    }

    @Override // tb.lfc
    public void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        UMLinkLogInterface uMLinkLogInterface = this.b;
        if (uMLinkLogInterface != null) {
            uMLinkLogInterface.commitSuccess(str, str2, str3, str4, str5, map);
        }
        dbr dbrVar = this.f16305a;
        if (dbrVar != null) {
            dbrVar.a(str, str2, str4, map, null);
        }
    }
}
