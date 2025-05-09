package tb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.huawei.nb.searchmanager.utils.logger.DSLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p5p implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public IBinder f25894a;
    public final qi4 b;

    public p5p(IBinder iBinder, qi4 qi4Var) {
        this.f25894a = iBinder;
        this.b = qi4Var;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f25894a = iBinder;
        qi4 qi4Var = this.b;
        if (qi4Var != null) {
            ((wq) qi4Var).c(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f25894a != null) {
            this.f25894a = null;
            qi4 qi4Var = this.b;
            if (qi4Var != null) {
                ((wq) qi4Var).d();
            }
            DSLog.et("SearchServiceConnection", "Connection to search service is disconnected unexpectedly.", new Object[0]);
        }
    }
}
