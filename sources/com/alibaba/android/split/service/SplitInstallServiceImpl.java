package com.alibaba.android.split.service;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.util.Pair;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import com.alibaba.android.split.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE;
import com.alibaba.android.split.service.SplitInstallServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.d62;
import tb.gyn;
import tb.iyn;
import tb.lxn;
import tb.mcq;
import tb.p97;
import tb.qcq;
import tb.rdq;
import tb.t2o;
import tb.wbq;
import tb.wnc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SplitInstallServiceImpl extends SplitInstallServiceStub implements BIND_SPLIT_INSTALL_SERVICE {
    private static final String CANCEL_INSTALL = "cancelInstall";
    private static final String DEFERRED_INSTALL = "deferrdInstall";
    private static final String GET_SESSION_STATE = "getSessionState";
    private static final String START_INSTALL = "startInstall";
    private final Context context;
    private wnc iLogger = (wnc) d62.b(wnc.class, "SplitInstallServiceImpl");
    private JobScheduler mJobScheduler;
    private static Map<List<String>, Runnable> sInstallTaskMap = new ConcurrentHashMap();
    private static AtomicInteger atomicInteger = new AtomicInteger(1);
    public static final Map<Integer, c> sesstionMap = new ConcurrentHashMap();
    private static Map<String, Handler> handlerMap = new ConcurrentHashMap();
    private static volatile int sJobId = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(SplitInstallServiceImpl splitInstallServiceImpl) {
        }

        @Override // com.alibaba.android.split.service.SplitInstallServiceImpl.b
        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9cae61a", new Object[]{this, cVar});
                return;
            }
            int i = cVar.f2244a;
            if (i == 3 || i == 6 || i == 5) {
                Collections.sort(cVar.g);
                SplitInstallServiceImpl.sInstallTaskMap.remove(cVar.g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void a(c cVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f2244a;
        public final int b;
        public final int c;
        public final String d;
        public final int e;
        public final int f;
        public final List<String> g;

        static {
            t2o.a(683671563);
        }

        public c(int i, int i2, int i3, String str, int i4, int i5, List<String> list) {
            this.f2244a = i;
            this.b = i2;
            this.c = i3;
            this.d = str;
            this.e = i4;
            this.f = i5;
            this.g = list;
        }

        public static c a(int i, int i2, int i3, String str, int i4, int i5, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("6e2968d4", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), str, new Integer(i4), new Integer(i5), list});
            }
            return new c(i, i2, i3, str, i4, i5, list);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TaskDetail{state=" + this.f2244a + ", taskId=" + this.b + ", errorCode=" + this.c + ", errorMessage='" + this.d + "', bytes_downloaded=" + this.e + ", total_bytes_to_download=" + this.f + ", fileInfos=" + this.g + '}';
        }
    }

    static {
        t2o.a(683671560);
        t2o.a(676331580);
    }

    public SplitInstallServiceImpl(Context context) {
        this.mJobScheduler = null;
        this.context = context;
        this.mJobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
    }

    public static boolean downloaded(List<String> list) {
        HashSet hashSet = new HashSet(list);
        for (c cVar : sesstionMap.values()) {
            if (cVar.f2244a == 3) {
                for (String str : cVar.g) {
                    if (hashSet.contains(str)) {
                        hashSet.remove(str);
                    }
                }
            }
        }
        if (hashSet.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean downloading(List<String> list) {
        HashSet hashSet = new HashSet(list);
        for (Map.Entry<Integer, c> entry : sesstionMap.entrySet()) {
            if (entry.getValue().f2244a == 2) {
                for (String str : entry.getValue().g) {
                    if (hashSet.contains(str)) {
                        hashSet.remove(str);
                    }
                }
            }
        }
        if (hashSet.size() == 0) {
            return true;
        }
        return false;
    }

    private boolean installed(List<String> list) {
        HashSet hashSet = new HashSet(list);
        for (c cVar : sesstionMap.values()) {
            if (cVar.f2244a == 5) {
                for (String str : cVar.g) {
                    if (hashSet.contains(str)) {
                        hashSet.remove(str);
                    }
                }
            }
        }
        if (hashSet.size() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startInstall$0(int i, c cVar) {
        sesstionMap.put(Integer.valueOf(i), cVar);
    }

    public static List<String> moduleNames(List<Bundle> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i).getString("module_name");
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    private Pair<Boolean, Integer> supended(List<String> list) {
        for (String str : list) {
            for (Map.Entry<Integer, c> entry : sesstionMap.entrySet()) {
                if (entry.getValue().f2244a == 8) {
                    for (String str2 : entry.getValue().g) {
                        if (str.equals(str2)) {
                            return new Pair<>(Boolean.TRUE, entry.getKey());
                        }
                    }
                    continue;
                }
            }
        }
        return new Pair<>(Boolean.FALSE, 0);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void cancelInstall(String str, int i, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        if (!handlerMap.containsKey(CANCEL_INSTALL)) {
            HandlerThread handlerThread = new HandlerThread(CANCEL_INSTALL);
            handlerThread.start();
            handlerMap.put(CANCEL_INSTALL, new Handler(handlerThread.getLooper()));
        }
        Map<Integer, c> map = sesstionMap;
        if (!map.containsKey(Integer.valueOf(i)) || map.get(Integer.valueOf(i)).f2244a != 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("error_code", -4);
            splitInstallResultCallback.onError(bundle2);
            return;
        }
        handlerMap.get(CANCEL_INSTALL).post(new lxn(this.context, str, i, map.get(Integer.valueOf(i)), bundle, splitInstallResultCallback));
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void deferredInstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        List<String> moduleNames = moduleNames(list);
        if (downloading(moduleNames) || downloaded(moduleNames) || installed(moduleNames)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("error_code", -17);
            splitInstallResultCallback.onDeferredInstall(bundle2);
            return;
        }
        int andIncrement = atomicInteger.getAndIncrement();
        ArrayList arrayList = new ArrayList();
        for (String str2 : moduleNames) {
            arrayList.add(((qcq) d62.a(qcq.class, new Object[0])).a(str2));
        }
        if (arrayList.size() == 0) {
            this.iLogger.c("deferredInstall INVALID_REQUEST", new Object[0]);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("error_code", -3);
            splitInstallResultCallback.onDeferredInstall(bundle3);
            return;
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putStringArray("module_names", (String[]) moduleNames.toArray(new String[0]));
        persistableBundle.putInt("version_code", bundle.getInt("version_code", 0));
        persistableBundle.putInt("sessionId", andIncrement);
        int i = sJobId;
        sJobId = i + 1;
        JobInfo.Builder builder = new JobInfo.Builder(i, new ComponentName(this.context, "fakeClass"));
        builder.setExtras(persistableBundle);
        rdq.b().a(new p97(this.context, builder.build()));
        Bundle bundle4 = new Bundle();
        bundle4.putInt("error_code", 0);
        splitInstallResultCallback.onDeferredInstall(bundle4);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void deferredUninstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        List<String> moduleNames = moduleNames(list);
        for (String str2 : mcq.a().a()) {
            if (moduleNames.contains(str2)) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("error_code", 0);
                splitInstallResultCallback.onDeferredUninstall(bundle2);
                return;
            }
        }
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void getSessionState(String str, int i, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        if (!handlerMap.containsKey(GET_SESSION_STATE)) {
            HandlerThread handlerThread = new HandlerThread(GET_SESSION_STATE);
            handlerThread.start();
            handlerMap.put(GET_SESSION_STATE, new Handler(handlerThread.getLooper()));
        }
        Map<Integer, c> map = sesstionMap;
        if (map.containsKey(Integer.valueOf(i))) {
            handlerMap.get(GET_SESSION_STATE).post(new gyn(this.context, i, map.get(Integer.valueOf(i)), splitInstallResultCallback));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", -4);
        splitInstallResultCallback.onError(bundle);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void startInstall(String str, List<Bundle> list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        if (!handlerMap.containsKey(START_INSTALL)) {
            HandlerThread handlerThread = new HandlerThread(START_INSTALL);
            handlerThread.start();
            handlerMap.put(START_INSTALL, new Handler(handlerThread.getLooper()));
        }
        List<String> moduleNames = moduleNames(list);
        Collections.sort(moduleNames);
        new Pair(Boolean.FALSE, 0);
        Pair<Boolean, Integer> supended = supended(moduleNames);
        if (((Boolean) supended.first).booleanValue()) {
            Integer num = (Integer) supended.second;
            final int intValue = num.intValue();
            iyn iynVar = new iyn(this.context, intValue, str, list, bundle, splitInstallResultCallback, new b() { // from class: tb.adq
                @Override // com.alibaba.android.split.service.SplitInstallServiceImpl.b
                public final void a(SplitInstallServiceImpl.c cVar) {
                    SplitInstallServiceImpl.lambda$startInstall$0(intValue, cVar);
                }
            }, true, sesstionMap.get(num));
            iynVar.g(wbq.l());
            handlerMap.get(START_INSTALL).post(iynVar);
            return;
        }
        iyn iynVar2 = new iyn(this.context, atomicInteger.getAndIncrement(), str, list, bundle, splitInstallResultCallback, new a(this), false, null);
        iynVar2.g(wbq.l());
        sInstallTaskMap.put(moduleNames, iynVar2);
        handlerMap.get(START_INSTALL).post(iynVar2);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void getSessionStates(String str, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void deferredLanguageInstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void deferredLanguageUninstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
    }
}
