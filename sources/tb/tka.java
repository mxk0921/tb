package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tka {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "GroupChargeTotalData";

    /* renamed from: a  reason: collision with root package name */
    public String f28763a;
    public List<ska> b;

    static {
        t2o.a(479199459);
    }

    public List<ska> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5cd66034", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        String str = this.f28763a;
        if (str == null) {
            return "";
        }
        return str;
    }

    public void c(List<ska> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bb53b0", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.f28763a = str;
        }
    }
}
