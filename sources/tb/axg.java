package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class axg implements blc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public blc f16058a;
    public clc b;

    static {
        t2o.a(779093394);
        t2o.a(806355886);
    }

    @Override // tb.blc
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fb6b9a", new Object[]{this, str, map});
            return;
        }
        blc blcVar = this.f16058a;
        if (blcVar != null) {
            blcVar.a(str, map);
        }
    }

    @Override // tb.blc
    public String b(String str, String str2, String str3) {
        String str4;
        clc clcVar;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{this, str, str2, str3});
        }
        blc blcVar = this.f16058a;
        if (blcVar != null) {
            str4 = blcVar.b(str, str2, str3);
        } else {
            str4 = null;
        }
        if (wd0.a() && (clcVar = this.b) != null) {
            if (str4 != null) {
                str5 = str4;
            } else {
                str5 = "";
            }
            ((m3h) clcVar).k(str, str2, str5, str3);
        }
        return str4;
    }

    public void c(blc blcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381cfb0e", new Object[]{this, blcVar});
        } else {
            this.f16058a = blcVar;
        }
    }

    public void d(clc clcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90dda815", new Object[]{this, clcVar});
        } else {
            this.b = clcVar;
        }
    }

    @Override // tb.blc
    public String getStringSharedPreference(String str, String str2, String str3) {
        String str4;
        clc clcVar;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d3974", new Object[]{this, str, str2, str3});
        }
        blc blcVar = this.f16058a;
        if (blcVar != null) {
            str4 = blcVar.getStringSharedPreference(str, str2, str3);
        } else {
            str4 = null;
        }
        if (wd0.a() && (clcVar = this.b) != null) {
            if (str4 != null) {
                str5 = str4;
            } else {
                str5 = "";
            }
            ((m3h) clcVar).k(str, str2, str5, str3);
        }
        return str4;
    }
}
