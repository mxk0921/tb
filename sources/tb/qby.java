package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qby implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public Messenger f26663a;
    public Bundle b;
    public Context c;

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f26663a = new Messenger(iBinder);
        Message obtain = Message.obtain();
        obtain.setData(this.b);
        try {
            this.f26663a.send(obtain);
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            this.c.unbindService(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f26663a = null;
        this.b = null;
        this.c = null;
    }
}
