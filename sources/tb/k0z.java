package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class k0z implements zpz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static k0z f22333a = null;

    static {
        t2o.a(352321998);
        t2o.a(352322031);
    }

    public static k0z c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k0z) ipChange.ipc$dispatch("ca780829", new Object[0]);
        }
        k0z k0zVar = f22333a;
        if (k0zVar != null) {
            return k0zVar;
        }
        k0z k0zVar2 = new k0z();
        f22333a = k0zVar2;
        return k0zVar2;
    }

    public static zpz d(zpz zpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zpz) ipChange.ipc$dispatch("9dbe6ccb", new Object[]{zpzVar});
        }
        if (zpzVar == null) {
            return c();
        }
        return zpzVar;
    }

    public static zpz e(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zpz) ipChange.ipc$dispatch("58f0c0eb", new Object[]{aqzVar});
        }
        zpz zpzVar = aqzVar.l;
        if (zpzVar == null) {
            return c();
        }
        return zpzVar;
    }

    @Override // tb.zpz
    public void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91eb9ae1", new Object[]{this, str, str2, th});
        } else if (th == null) {
            Log.e(str, str2);
        } else {
            Log.e(str, str2, th);
        }
    }

    @Override // tb.zpz
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acf5affc", new Object[]{this});
        }
        return "无极缩放Default";
    }
}
