package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.ubee.core.UserBehaviorStorage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i5v implements f7e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092275);
        t2o.a(806354951);
    }

    @Override // tb.f7e
    public void a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("681fdf0f", new Object[]{this, str, str2, strArr});
            return;
        }
        UserBehaviorStorage a2 = h5v.b().a();
        if (a2 != null) {
            a2.d(str, str2, strArr);
        }
    }

    @Override // tb.f7e
    public void b(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce026f82", new Object[]{this, str, str2, str3, strArr});
            return;
        }
        UserBehaviorStorage a2 = h5v.b().a();
        if (a2 != null) {
            a2.f(str, str2, str3, strArr);
        }
    }

    @Override // tb.f7e
    public void commitEnter(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c564b847", new Object[]{this, str, str2, obj, strArr});
            return;
        }
        UserBehaviorStorage a2 = h5v.b().a();
        if (a2 != null) {
            a2.c(str, str2, obj, strArr);
        }
    }

    @Override // tb.f7e
    public void commitLeave(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38feac8", new Object[]{this, str, str2, obj, strArr});
            return;
        }
        UserBehaviorStorage a2 = h5v.b().a();
        if (a2 != null) {
            a2.e(str, str2, obj, strArr);
        }
    }

    @Override // tb.f7e
    public void commitTap(String str, String str2, String str3, String str4, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c09eea4", new Object[]{this, str, str2, str3, str4, strArr});
            return;
        }
        UserBehaviorStorage a2 = h5v.b().a();
        if (a2 != null) {
            a2.g(str, str2, str3, str4, strArr);
        }
    }
}
