package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static yxb f32943a;

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5242d63c", new Object[]{str, objArr});
            return;
        }
        yxb yxbVar = f32943a;
        if (yxbVar != null) {
            ((aih) yxbVar).b(str, null, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0f980a", new Object[]{str, objArr});
            return;
        }
        yxb yxbVar = f32943a;
        if (yxbVar != null) {
            ((aih) yxbVar).b(str, "event", objArr);
        }
    }

    public static void d(yxb yxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde1d172", new Object[]{yxbVar});
        } else {
            f32943a = yxbVar;
        }
    }
}
