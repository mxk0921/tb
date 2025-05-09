package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class c6z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16896a;
    public final List<j2z> b = new ArrayList();
    public final SparseArray<xgz> c = new SparseArray<>();

    static {
        t2o.a(598736900);
    }

    public c6z(String str) {
        ckf.g(str, "bizId");
        this.f16896a = str;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this});
        }
        return this.f16896a;
    }

    public final List<j2z> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b164734", new Object[]{this});
        }
        return this.b;
    }

    public final SparseArray<xgz> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("baf0a374", new Object[]{this});
        }
        return this.c;
    }
}
