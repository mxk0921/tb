package com.flybird.worker;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0248a f5009a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final Handler c = new Handler(Looper.getMainLooper(), this);

    /* compiled from: Taobao */
    /* renamed from: com.flybird.worker.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface AbstractC0248a {
        void handleTick(b bVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f5010a;
        public int b;
        public boolean c;
        public long d;

        public b(a aVar) {
        }
    }

    public a(AbstractC0248a aVar) {
        this.f5009a = aVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        b bVar = (b) message.obj;
        this.f5009a.handleTick(bVar);
        if (bVar.c) {
            this.c.sendMessageDelayed(Message.obtain(message), bVar.b);
        }
        return true;
    }
}
