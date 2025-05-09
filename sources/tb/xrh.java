package tb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import tb.trh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xrh implements ServiceConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31553a;
    public final idp b;
    public Object c;

    public xrh(String str, idp idpVar) {
        this.f31553a = str;
        this.b = idpVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            return;
        }
        idp idpVar = this.b;
        if (idpVar != null) {
            ((trh.b) idpVar).a(this.f31553a, iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            return;
        }
        idp idpVar = this.b;
        if (idpVar != null) {
            ((trh.b) idpVar).a(this.f31553a, null);
        }
    }
}
