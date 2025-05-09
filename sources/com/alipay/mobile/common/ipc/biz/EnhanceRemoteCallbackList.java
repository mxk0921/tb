package com.alipay.mobile.common.ipc.biz;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EnhanceRemoteCallbackList<E extends IInterface> extends RemoteCallbackList<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f3924a = new AtomicBoolean(false);
    public final Object b = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(EnhanceRemoteCallbackList enhanceRemoteCallbackList, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2007922500:
                return new Boolean(super.register((IInterface) objArr[0], objArr[1]));
            case 510024620:
                return new Integer(super.getRegisteredCallbackCount());
            case 1144202900:
                return super.getBroadcastItem(((Number) objArr[0]).intValue());
            case 1418148519:
                return new Boolean(super.unregister((IInterface) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/ipc/biz/EnhanceRemoteCallbackList");
        }
    }

    @Override // android.os.RemoteCallbackList
    public E getBroadcastItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ((IInterface) ipChange.ipc$dispatch("44332694", new Object[]{this, new Integer(i)}));
        }
        if (this.f3924a.get()) {
            synchronized (this.f3924a) {
                try {
                    LogCatUtil.info("IPC_EnhanceRemoteCallbackList", " getBroadcastItem wait.. ");
                    for (int i2 = 0; this.f3924a.get() && i2 < 3; i2++) {
                        this.b.wait(1000L);
                    }
                    LogCatUtil.info("IPC_EnhanceRemoteCallbackList", " getBroadcastItem wakeup.. ");
                }
            }
        }
        try {
            return (E) super.getBroadcastItem(i);
        } catch (Throwable th) {
            LogCatUtil.error("IPC_EnhanceRemoteCallbackList", " getBroadcastItem exception. ", th);
            return null;
        }
    }

    @Override // android.os.RemoteCallbackList
    public int getRegisteredCallbackCount() {
        try {
            return super.getRegisteredCallbackCount();
        } catch (Throwable th) {
            LogCatUtil.error("IPC_EnhanceRemoteCallbackList", "A serious problem1 ", th);
            try {
                Field declaredField = RemoteCallbackList.class.getDeclaredField("mCallbacks");
                declaredField.setAccessible(true);
                return ((Map) declaredField.get(this)).size();
            } catch (Throwable th2) {
                LogCatUtil.error("IPC_EnhanceRemoteCallbackList", "A serious problem2 ", th2);
                return 0;
            }
        }
    }

    @Override // android.os.RemoteCallbackList
    public void onCallbackDied(E e) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c608617", new Object[]{this, e});
            return;
        }
        refreshActiveCallback();
        StringBuilder sb = new StringBuilder("onCallbackDied  callback=[");
        if (e != null) {
            str = e.getClass().getName();
        } else {
            str = " is null !";
        }
        sb.append(str);
        sb.append("]");
        LogCatUtil.warn("IPC_EnhanceRemoteCallbackList", sb.toString());
    }

    public void refreshActiveCallback() {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ecbe2ad", new Object[]{this});
            return;
        }
        LogCatUtil.info("IPC_EnhanceRemoteCallbackList", " refreshActiveCallback start ");
        if (this.f3924a.get()) {
            LogCatUtil.info("IPC_EnhanceRemoteCallbackList", " refreshActiveCallback refreshing");
            return;
        }
        this.f3924a.set(true);
        try {
            try {
                beginBroadcast();
                LogCatUtil.info("IPC_EnhanceRemoteCallbackList", " beginBroadcast finish! ");
                this.f3924a.set(false);
                try {
                    this.b.notifyAll();
                    LogCatUtil.info("IPC_EnhanceRemoteCallbackList", " refreshLock notifyAll ");
                } catch (Exception e) {
                    e = e;
                    sb = new StringBuilder(" notifyAll exception. ");
                    sb.append(e.toString());
                    LogCatUtil.warn("IPC_EnhanceRemoteCallbackList", sb.toString());
                }
            } catch (Exception e2) {
                LogCatUtil.warn("IPC_EnhanceRemoteCallbackList", " beginBroadcast exception. " + e2.toString());
                try {
                    finishBroadcast();
                    LogCatUtil.info("IPC_EnhanceRemoteCallbackList", " finishBroadcast finish! ");
                } catch (Exception e3) {
                    LogCatUtil.warn("IPC_EnhanceRemoteCallbackList", " finishBroadcast exception. " + e3.toString());
                }
                try {
                    beginBroadcast();
                    LogCatUtil.info("IPC_EnhanceRemoteCallbackList", " beginBroadcast2 finish! ");
                } catch (Exception e4) {
                    LogCatUtil.warn("IPC_EnhanceRemoteCallbackList", " beginBroadcast exception. " + e4.toString());
                }
                this.f3924a.set(false);
                try {
                    this.b.notifyAll();
                    LogCatUtil.info("IPC_EnhanceRemoteCallbackList", " refreshLock notifyAll ");
                } catch (Exception e5) {
                    e = e5;
                    sb = new StringBuilder(" notifyAll exception. ");
                    sb.append(e.toString());
                    LogCatUtil.warn("IPC_EnhanceRemoteCallbackList", sb.toString());
                }
            }
        } catch (Throwable th) {
            this.f3924a.set(false);
            try {
                this.b.notifyAll();
                LogCatUtil.info("IPC_EnhanceRemoteCallbackList", " refreshLock notifyAll ");
            } catch (Exception e6) {
                LogCatUtil.warn("IPC_EnhanceRemoteCallbackList", " notifyAll exception. " + e6.toString());
            }
            throw th;
        }
    }

    @Override // android.os.RemoteCallbackList
    public boolean register(E e, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("885188bc", new Object[]{this, e, obj})).booleanValue();
        }
        boolean register = super.register(e, obj);
        refreshActiveCallback();
        LogCatUtil.info("IPC_EnhanceRemoteCallbackList", "register");
        return register;
    }

    @Override // android.os.RemoteCallbackList
    public boolean unregister(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54873aa7", new Object[]{this, e})).booleanValue();
        }
        boolean unregister = super.unregister(e);
        refreshActiveCallback();
        return unregister;
    }
}
