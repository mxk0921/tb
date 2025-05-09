package com.taobao.adaemon;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.exception.IPCException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.mf;
import tb.re;
import tb.s55;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ProcessController implements IpcChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLEAR_STACK_ALL = "clearall";
    public static final String REMOTE_CONTENT_PROVIDER = "com.taobao.accs.AccsIPCProvider";
    private static final String TAG = "ProcC";
    private static final ConcurrentHashMap<String, d> S_PROCESSES = new ConcurrentHashMap<>();
    private static final CopyOnWriteArraySet<c> S_LISTENERS = new CopyOnWriteArraySet<>();
    private static final CopyOnWriteArraySet<ITrigger> S_TRIGGERS = new CopyOnWriteArraySet<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class IPC {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static volatile IpcChannel f6127a;

        static {
            t2o.a(349175860);
        }

        public static /* synthetic */ IpcChannel a(IpcChannel ipcChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IpcChannel) ipChange.ipc$dispatch("fb93bb70", new Object[]{ipcChannel});
            }
            f6127a = ipcChannel;
            return ipcChannel;
        }

        public static IpcChannel b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IpcChannel) ipChange.ipc$dispatch("4475f78f", new Object[0]);
            }
            if (f6127a == null) {
                synchronized (IPC.class) {
                    if (f6127a == null) {
                        final ComponentName componentName = new ComponentName(re.r(), "com.taobao.accs.AccsIPCProvider");
                        try {
                            f6127a = (IpcChannel) re.q(componentName, IpcChannel.class, new Pair[0]);
                        } catch (IPCException e) {
                            s55.h(ProcessController.TAG, "[getIpcCenter]", e, new Object[0]);
                        }
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction(Constants.ACTION_DISCONNECT);
                        re.r().registerReceiver(new BroadcastReceiver() { // from class: com.taobao.adaemon.ProcessController.IPC.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                                str.hashCode();
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/ProcessController$IPC$1");
                            }

                            @Override // android.content.BroadcastReceiver
                            public void onReceive(Context context, Intent intent) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                                } else {
                                    mf.l(new a(intent));
                                }
                            }

                            /* compiled from: Taobao */
                            /* renamed from: com.taobao.adaemon.ProcessController$IPC$1$a */
                            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
                            public class a implements Runnable {
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                /* renamed from: a  reason: collision with root package name */
                                public final /* synthetic */ Intent f6129a;

                                public a(Intent intent) {
                                    this.f6129a = intent;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange = $ipChange;
                                    if (ipChange instanceof IpChange) {
                                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    String stringExtra = this.f6129a.getStringExtra("processName");
                                    if (!TextUtils.isEmpty(stringExtra) && stringExtra.equals(g.m(re.r()))) {
                                        try {
                                            s55.h(ProcessController.TAG, "[onReceive]", null, "process", stringExtra);
                                            IPC.a((IpcChannel) re.q(componentName, IpcChannel.class, new Pair[0]));
                                        } catch (IPCException e) {
                                            s55.h(ProcessController.TAG, "[getIpcCenter]", null, e);
                                        }
                                    }
                                }
                            }
                        }, intentFilter);
                    }
                }
            }
            return f6127a;
        }

        public static void c(String str, IRemoteProcessHandler iRemoteProcessHandler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acc427f", new Object[]{str, iRemoteProcessHandler});
                return;
            }
            try {
                b().registerProcessToRemote(str, iRemoteProcessHandler);
            } catch (IPCException unused) {
                f6127a = null;
            }
        }

        public static void d(ITrigger iTrigger) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16724c99", new Object[]{iTrigger});
                return;
            }
            try {
                b().registerTriggerToRemote(iTrigger);
            } catch (IPCException unused) {
                f6127a = null;
            }
        }

        public static void e(String str, boolean z, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bfc09ec", new Object[]{str, new Boolean(z), str2});
                return;
            }
            try {
                b().updateLifecycleToRemote(str, z, str2);
            } catch (IPCException unused) {
                f6127a = null;
            }
        }

        public static void f(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72624302", new Object[]{str, new Integer(i)});
                return;
            }
            try {
                b().updateMemoryEventToRemote(str, i);
            } catch (IPCException unused) {
                f6127a = null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static final ProcessController S_INSTANCE = new ProcessController();

        static {
            t2o.a(349175859);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void a(String str, boolean z);

        void b(String str, int i);
    }

    static {
        t2o.a(349175857);
        t2o.a(349175834);
    }

    public static ProcessController getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcessController) ipChange.ipc$dispatch("489542e5", new Object[0]);
        }
        return b.S_INSTANCE;
    }

    public Map<String, d> getAllProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("560ed300", new Object[]{this});
        }
        return new HashMap(S_PROCESSES);
    }

    public Pair<Long, Long> getMainProcCpuTime(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("87c5007b", new Object[]{this, context});
        }
        d process = getProcess(context.getPackageName());
        if (process == null) {
            return null;
        }
        return process.b();
    }

    public d getProcess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("65aadca9", new Object[]{this, str});
        }
        return S_PROCESSES.get(str);
    }

    public int getProcessSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79e0f154", new Object[]{this})).intValue();
        }
        return S_PROCESSES.size();
    }

    public boolean isBgFromHomePage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3906a9dc", new Object[]{this, str})).booleanValue();
        }
        d dVar = S_PROCESSES.get(str);
        if (dVar == null) {
            return false;
        }
        return dVar.e();
    }

    public boolean isTinyProcess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5685889a", new Object[]{this, str})).booleanValue();
        }
        d dVar = S_PROCESSES.get(str);
        if (dVar == null) {
            return false;
        }
        return dVar.g();
    }

    public void registerProcessListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aeb7229", new Object[]{this, cVar});
        } else if (cVar != null) {
            S_LISTENERS.add(cVar);
        }
    }

    @Override // com.taobao.adaemon.IpcChannel
    public void registerTriggerToRemote(ITrigger iTrigger) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec5ef8", new Object[]{this, iTrigger});
            return;
        }
        s55.i(TAG, "[registerTriggerToRemote]", new Object[0]);
        S_TRIGGERS.add(iTrigger);
    }

    public void tryDumpMain(Context context, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0607b9", new Object[]{this, context, new Long(j), new Long(j2)});
            return;
        }
        d process = getProcess(context.getPackageName());
        if (process != null) {
            process.j(j, j2);
        }
    }

    public void unregisterProcessListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c190b0", new Object[]{this, cVar});
        } else {
            S_LISTENERS.remove(cVar);
        }
    }

    @Override // com.taobao.adaemon.IpcChannel
    public void unregisterProcessToRemote(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa535e5", new Object[]{this, str});
            return;
        }
        s55.i(TAG, "[unregisterProcessToRemote]process:" + str, new Object[0]);
        S_PROCESSES.remove(str);
    }

    @Override // com.taobao.adaemon.IpcChannel
    public void updateMemoryEventToRemote(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a97b21", new Object[]{this, str, new Integer(i)});
            return;
        }
        s55.i(TAG, "[updateMemoryEventToRemote]process:" + str + ", event:" + i, new Object[0]);
        Iterator<c> it = S_LISTENERS.iterator();
        while (it.hasNext()) {
            try {
                it.next().b(str, i);
            } catch (Exception e) {
                s55.h(TAG, "[updateMemoryEventToRemote]", null, e);
            }
        }
    }

    private ProcessController() {
    }

    public void triggerSchedule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5334c1c0", new Object[]{this, str});
            return;
        }
        Iterator<ITrigger> it = S_TRIGGERS.iterator();
        while (it.hasNext()) {
            ITrigger next = it.next();
            try {
                next.onTrigger(str);
            } catch (Throwable th) {
                if ((th instanceof IPCException) && th.getErrorCode() == 5) {
                    S_TRIGGERS.remove(next);
                    s55.i(TAG, "triggerSchedule remove", new Object[0]);
                }
            }
        }
    }

    public boolean clearActivityStack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df101", new Object[]{this, str})).booleanValue();
        }
        s55.i(TAG, "clear all stack", new Object[0]);
        for (d dVar : S_PROCESSES.values()) {
            if (dVar.f() && !dVar.a()) {
                s55.i(TAG, "clearActivityStack fail:" + dVar.c(), new Object[0]);
                return false;
            }
        }
        return true;
    }

    @Override // com.taobao.adaemon.IpcChannel
    public void updateLifecycleToRemote(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797d994b", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        s55.i(TAG, "[updateLifecycleToRemote]process:" + str + ", background:" + z, new Object[0]);
        d dVar = S_PROCESSES.get(str);
        if (dVar != null) {
            dVar.h(z);
        }
        if (!"init".equals(str2)) {
            if (z) {
                LocalProcessMonitor.h0().F0();
            } else {
                LocalProcessMonitor.h0().G0();
            }
            Iterator<c> it = S_LISTENERS.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(str, z);
                } catch (Exception e) {
                    s55.h(TAG, "[updateLifecycleToRemote]", null, e);
                }
            }
        }
    }

    @Override // com.taobao.adaemon.IpcChannel
    public void registerProcessToRemote(String str, IRemoteProcessHandler iRemoteProcessHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed2fd40", new Object[]{this, str, iRemoteProcessHandler});
            return;
        }
        s55.i(TAG, "[registerProcessToRemote]", "process", str);
        d dVar = new d(str);
        dVar.i(iRemoteProcessHandler);
        S_PROCESSES.put(str, dVar);
    }
}
