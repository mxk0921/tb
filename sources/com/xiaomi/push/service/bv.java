package com.xiaomi.push.service;

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
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bv implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ServiceClient f15085a;

    public bv(ServiceClient serviceClient) {
        this.f15085a = serviceClient;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        List<Message> list;
        List list2;
        Messenger messenger;
        synchronized (this.f15085a) {
            this.f15085a.f1495b = new Messenger(iBinder);
            this.f15085a.f1496b = false;
            list = this.f15085a.f1493a;
            for (Message message : list) {
                try {
                    messenger = this.f15085a.f1495b;
                    messenger.send(message);
                } catch (RemoteException e) {
                    b.a(e);
                }
            }
            list2 = this.f15085a.f1493a;
            list2.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f15085a.f1495b = null;
        this.f15085a.f1496b = false;
    }
}
