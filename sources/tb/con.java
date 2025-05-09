package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class con implements jim {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ux9 f17205a;

    static {
        t2o.a(779092977);
        t2o.a(295699679);
    }

    public con(ux9 ux9Var) {
        this.f17205a = ux9Var;
    }

    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c44cfe", new Object[]{this, hashMap});
        } else {
            sj9.c(this.f17205a, hashMap);
        }
    }

    public void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26bf09ea", new Object[]{this, hashMap});
        } else {
            sj9.d(this.f17205a, hashMap);
        }
    }

    public void c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f9fda9", new Object[]{this, hashMap});
        } else {
            sj9.e(this.f17205a, hashMap);
        }
    }

    public void d(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfaa61f3", new Object[]{this, hashMap});
        } else {
            sj9.f(this.f17205a, hashMap);
        }
    }
}
