package com.taobao.accs.asp;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.d;
import com.taobao.accs.utl.ALog;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.exception.IPCException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bzv;
import tb.kf;
import tb.re;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PrefsIPCChannel implements IPrefsChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CORE_PROCESS_CREATED = "com.taobao.adaemon.CORE_PROCESS_CREATED";
    public static final String CORE_CONTENT_PROVIDER = "com.taobao.accs.AccsIPCProvider";
    private static final String TAG = "PrefsIPCChannel";
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<OnDataUpdateListener>> listeners = new ConcurrentHashMap<>();
    private final ARangerReceiver receiver = new ARangerReceiver();
    private final AtomicBoolean coreProcessReady = new AtomicBoolean(false);
    private volatile boolean isRegisterReceiver = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static volatile IPrefsChannel f6006a = null;

        static {
            t2o.a(343932988);
        }

        public static void a(ModifiedRecord modifiedRecord) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cc3610", new Object[]{modifiedRecord});
            } else if (modifiedRecord != null) {
                d.a aVar = new d.a(1);
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    b().commitToDiskRemote(modifiedRecord);
                    aVar.b = 1;
                } catch (IPCException e) {
                    ALog.e(PrefsIPCChannel.TAG, "[commitToDisk]IPC error.", e, new Object[0]);
                    aVar.b = 0;
                    f6006a = null;
                }
                aVar.c = System.currentTimeMillis() - currentTimeMillis;
                aVar.b();
            }
        }

        public static IPrefsChannel b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IPrefsChannel) ipChange.ipc$dispatch("63d4d224", new Object[0]);
            }
            if (f6006a == null) {
                synchronized (b.class) {
                    if (f6006a == null) {
                        try {
                            f6006a = (IPrefsChannel) re.q(new ComponentName(re.r(), "com.taobao.accs.AccsIPCProvider"), IPrefsChannel.class, new Pair[0]);
                        } catch (IPCException e) {
                            ALog.e(PrefsIPCChannel.TAG, "create ipc proxy error.", e, new Object[0]);
                        }
                    }
                }
            }
            return f6006a;
        }

        public static void c(String str, OnDataUpdateListener onDataUpdateListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9dd75820", new Object[]{str, onDataUpdateListener});
                return;
            }
            d.a aVar = new d.a(2);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                b().registerDataListenerRemote(str, onDataUpdateListener);
                aVar.b = 1;
            } catch (IPCException e) {
                ALog.e(PrefsIPCChannel.TAG, "[registerDataListener]IPC error.", e, new Object[0]);
                aVar.b = 0;
                f6006a = null;
            }
            aVar.c = System.currentTimeMillis() - currentTimeMillis;
            aVar.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final PrefsIPCChannel f6007a = new PrefsIPCChannel();

        static {
            t2o.a(343932989);
        }
    }

    static {
        t2o.a(343932984);
        t2o.a(343932980);
    }

    public static /* synthetic */ AtomicBoolean access$100(PrefsIPCChannel prefsIPCChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("2a007ced", new Object[]{prefsIPCChannel});
        }
        return prefsIPCChannel.coreProcessReady;
    }

    public static PrefsIPCChannel getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrefsIPCChannel) ipChange.ipc$dispatch("b13edaa7", new Object[0]);
        }
        return c.f6007a;
    }

    @Override // com.taobao.accs.asp.IPrefsChannel
    public void commitToDiskRemote(ModifiedRecord modifiedRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3803e536", new Object[]{this, modifiedRecord});
            return;
        }
        SharedPreferences multiProcessSharedPreferences = APreferencesManager.getMultiProcessSharedPreferences(modifiedRecord.name);
        if (multiProcessSharedPreferences instanceof com.taobao.accs.asp.a) {
            ((com.taobao.accs.asp.a) multiProcessSharedPreferences).i(modifiedRecord);
        }
    }

    public boolean isCoreProcessReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a198108", new Object[]{this})).booleanValue();
        }
        return this.coreProcessReady.get();
    }

    @Override // com.taobao.accs.asp.IPrefsChannel
    public void registerDataListenerRemote(String str, OnDataUpdateListener onDataUpdateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1822b7c6", new Object[]{this, str, onDataUpdateListener});
            return;
        }
        CopyOnWriteArrayList<OnDataUpdateListener> copyOnWriteArrayList = this.listeners.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        copyOnWriteArrayList.add(onDataUpdateListener);
        this.listeners.put(str, copyOnWriteArrayList);
    }

    public void unregister(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70c8265", new Object[]{this, context});
        } else if (this.isRegisterReceiver) {
            try {
                context.unregisterReceiver(this.receiver);
            } catch (Throwable th) {
                ALog.e(TAG, "asp unregister err", th, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ARangerReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b.f6006a = null;
                b.b();
            }
        }

        static {
            t2o.a(343932986);
        }

        public ARangerReceiver() {
        }

        public static /* synthetic */ Object ipc$super(ARangerReceiver aRangerReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/asp/PrefsIPCChannel$ARangerReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            String a2 = bzv.a();
            if (!TextUtils.isEmpty(a2)) {
                if (Constants.ACTION_DISCONNECT.equals(action)) {
                    String stringExtra = intent.getStringExtra("processName");
                    ALog.i(PrefsIPCChannel.TAG, "[onReceive] process disconnect.", "process", stringExtra);
                    if (a2.equals(stringExtra)) {
                        kf.f(new a());
                    }
                } else if (Constants.ACTION_CONNECT.equals(action)) {
                    String stringExtra2 = intent.getStringExtra("processName");
                    ALog.i(PrefsIPCChannel.TAG, "[onReceive] process connect.", "process", stringExtra2);
                    if (a2.equals(stringExtra2)) {
                        APreferencesManager.recoverPreferences();
                    }
                } else if (PrefsIPCChannel.ACTION_CORE_PROCESS_CREATED.equals(action)) {
                    PrefsIPCChannel.access$100(PrefsIPCChannel.this).set(true);
                }
            }
        }
    }

    public void register(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{this, context});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(Constants.ACTION_DISCONNECT);
            intentFilter.addAction(Constants.ACTION_CONNECT);
            if (bzv.c()) {
                this.coreProcessReady.set(true);
            } else {
                intentFilter.addAction(ACTION_CORE_PROCESS_CREATED);
                if (bzv.d()) {
                    this.coreProcessReady.set(true);
                }
            }
            context.registerReceiver(this.receiver, intentFilter);
            this.isRegisterReceiver = true;
        } catch (Throwable th) {
            ALog.e(TAG, "asp register err", th, new Object[0]);
        }
    }

    public void dataUpdateEvent(ModifiedRecord modifiedRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1efc88", new Object[]{this, modifiedRecord});
            return;
        }
        CopyOnWriteArrayList<OnDataUpdateListener> copyOnWriteArrayList = this.listeners.get(modifiedRecord.name);
        if (copyOnWriteArrayList != null) {
            Iterator<OnDataUpdateListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                OnDataUpdateListener next = it.next();
                if (next != null) {
                    d.a aVar = new d.a(3);
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        next.onDataUpdate(modifiedRecord);
                        aVar.b = 1;
                    } catch (IPCException e) {
                        ALog.e(TAG, "[dataUpdateEvent]error.", null, e);
                        aVar.b = 0;
                        int errorCode = e.getErrorCode();
                        if (errorCode == 5 || errorCode == 2) {
                            ALog.i(TAG, "remove listener", "result", Boolean.valueOf(copyOnWriteArrayList.remove(next)));
                        }
                    }
                    aVar.c = System.currentTimeMillis() - currentTimeMillis;
                    aVar.b();
                }
            }
        }
    }
}
