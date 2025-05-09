package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.xiaomi.channel.commonutils.logger.b;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class as implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ao f14721a;

    public as(ao aoVar) {
        this.f14721a = aoVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        List<Message> list;
        List list2;
        Messenger messenger;
        synchronized (this.f14721a) {
            this.f14721a.f683a = new Messenger(iBinder);
            this.f14721a.c = false;
            list = this.f14721a.f686a;
            for (Message message : list) {
                try {
                    messenger = this.f14721a.f683a;
                    messenger.send(message);
                } catch (RemoteException e) {
                    b.a(e);
                }
            }
            list2 = this.f14721a.f686a;
            list2.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f14721a.f683a = null;
        this.f14721a.c = false;
    }
}
