package com.taobao.android.publisher.service.export.ayscpublish.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.ded;
import tb.f7l;
import tb.k4n;
import tb.oxv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class c implements com.taobao.android.publisher.service.export.ayscpublish.core.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP_DEFAULT_EXECUTOR = "DEFAULT";
    public static c e;
    public static final HashMap<String, ExecutorService> f = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final List<com.taobao.android.publisher.service.export.ayscpublish.core.a> f9203a = new ArrayList();
    public final Map<Class, List<com.taobao.android.publisher.service.export.ayscpublish.core.b>> b = new HashMap();
    public final Handler c = new Handler(Looper.getMainLooper());
    public l d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.publisher.service.export.ayscpublish.core.a f9204a;
        public final /* synthetic */ PublishError b;

        public a(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar, PublishError publishError) {
            this.f9204a = aVar;
            this.b = publishError;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (com.taobao.android.publisher.service.export.ayscpublish.core.b bVar : c.k(c.this, this.f9204a.getClass())) {
                bVar.i(this.f9204a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.publisher.service.export.ayscpublish.core.a f9205a;

        public b(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
            this.f9205a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (com.taobao.android.publisher.service.export.ayscpublish.core.b bVar : c.k(c.this, this.f9205a.getClass())) {
                bVar.b(this.f9205a);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.publisher.service.export.ayscpublish.core.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class RunnableC0473c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.publisher.service.export.ayscpublish.core.a f9206a;

        public RunnableC0473c(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
            this.f9206a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (com.taobao.android.publisher.service.export.ayscpublish.core.b bVar : c.k(c.this, this.f9206a.getClass())) {
                bVar.h(this.f9206a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f9207a = 1;
        public final /* synthetic */ String b;

        public d(c cVar, String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable);
            thread.setName("AyncPublishThread_" + this.b + "_" + this.f9207a);
            this.f9207a = this.f9207a + 1;
            return thread;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Class f9208a;
        public final /* synthetic */ com.taobao.android.publisher.service.export.ayscpublish.core.b b;

        public e(Class cls, com.taobao.android.publisher.service.export.ayscpublish.core.b bVar) {
            this.f9208a = cls;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            List list = (List) c.j(c.this).get(this.f9208a);
            if (list == null) {
                list = new ArrayList();
                c.j(c.this).put(this.f9208a, list);
            }
            if (list.contains(this.b)) {
                k4n.b().c().d("PublishServiceImp", "register failed, already exist.");
            } else {
                list.add(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.publisher.service.export.ayscpublish.core.a f9209a;

        public f(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
            this.f9209a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (com.taobao.android.publisher.service.export.ayscpublish.core.b bVar : c.k(c.this, this.f9209a.getClass())) {
                bVar.c(this.f9209a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.publisher.service.export.ayscpublish.core.a f9210a;

        public g(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
            this.f9210a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (com.taobao.android.publisher.service.export.ayscpublish.core.b bVar : c.k(c.this, this.f9210a.getClass())) {
                bVar.f(this.f9210a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.publisher.service.export.ayscpublish.core.a f9211a;

        public h(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
            this.f9211a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (com.taobao.android.publisher.service.export.ayscpublish.core.b bVar : c.k(c.this, this.f9211a.getClass())) {
                bVar.d(this.f9211a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.publisher.service.export.ayscpublish.core.a f9212a;
        public final /* synthetic */ float b;

        public i(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar, float f) {
            this.f9212a = aVar;
            this.b = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (com.taobao.android.publisher.service.export.ayscpublish.core.b bVar : c.k(c.this, this.f9212a.getClass())) {
                bVar.g(this.f9212a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.publisher.service.export.ayscpublish.core.a f9213a;
        public final /* synthetic */ APublishTask.b b;

        public j(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar, APublishTask.b bVar) {
            this.f9213a = aVar;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (com.taobao.android.publisher.service.export.ayscpublish.core.b bVar : c.k(c.this, this.f9213a.getClass())) {
                bVar.a(this.f9213a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.publisher.service.export.ayscpublish.core.a f9214a;

        public k(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
            this.f9214a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (com.taobao.android.publisher.service.export.ayscpublish.core.b bVar : c.k(c.this, this.f9214a.getClass())) {
                bVar.e(this.f9214a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface l {
        ThreadPoolExecutor a(String str);
    }

    public static /* synthetic */ Map j(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6fd85162", new Object[]{cVar});
        }
        return cVar.b;
    }

    public static /* synthetic */ List k(c cVar, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6242f498", new Object[]{cVar, cls});
        }
        return cVar.u(cls);
    }

    public static c t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("dfd1bba", new Object[0]);
        }
        if (e == null) {
            synchronized (c.class) {
                try {
                    if (e == null) {
                        e = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public void A(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51ba8c8a", new Object[]{this, lVar});
        } else {
            this.d = lVar;
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public void a(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar, APublishTask.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8acf75fb", new Object[]{this, aVar, bVar});
            return;
        }
        ded c = k4n.b().c();
        String obj = aVar.toString();
        c.f("PublishServiceImp", "task[" + obj + "] onPublishStepChanged,");
        this.c.post(new j(aVar, bVar));
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public synchronized void b(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc22699", new Object[]{this, aVar});
            return;
        }
        ded c = k4n.b().c();
        String obj = aVar.toString();
        c.a("PublishServiceImp", "task[" + obj + "] onRetry");
        this.c.post(new b(aVar));
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public void c(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae2dba2", new Object[]{this, aVar});
        } else if (!(aVar instanceof APublishTask) || !((APublishTask) aVar).p()) {
            ded c = k4n.b().c();
            String obj = aVar.toString();
            c.f("PublishServiceImp", "task[" + obj + "] onTaskCreate!");
            aVar.L();
            this.c.post(new f(aVar));
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public synchronized void d(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d1c9f70", new Object[]{this, aVar});
            return;
        }
        ded c = k4n.b().c();
        String obj = aVar.toString();
        c.f("PublishServiceImp", "task[" + obj + "] onPublishStart!");
        this.c.post(new h(aVar));
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public synchronized void e(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0a81af", new Object[]{this, aVar});
            return;
        }
        ded c = k4n.b().c();
        String obj = aVar.toString();
        c.f("PublishServiceImp", "task[" + obj + "] onPublishSuccess!");
        ((ArrayList) this.f9203a).remove(aVar);
        this.c.post(new k(aVar));
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public void f(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c1227ac", new Object[]{this, aVar});
            return;
        }
        ded c = k4n.b().c();
        String obj = aVar.toString();
        c.f("PublishServiceImp", "task[" + obj + "] onTaskDestory!");
        aVar.C();
        this.c.post(new g(aVar));
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public synchronized void h(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93fe9369", new Object[]{this, aVar});
            return;
        }
        ded c = k4n.b().c();
        String obj = aVar.toString();
        c.d("PublishServiceImp", "task[" + obj + "] onCancel");
        this.c.post(new RunnableC0473c(aVar));
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public synchronized void i(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar, PublishError publishError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58a1406", new Object[]{this, aVar, publishError});
            return;
        }
        ded c = k4n.b().c();
        String obj = aVar.toString();
        String str = publishError.errorCode;
        String str2 = publishError.errorMsg;
        c.d("PublishServiceImp", "task[" + obj + "] onPublishFailed errorCode=" + str + ", errorMsg=" + str2 + f7l.AND_NOT);
        ((ArrayList) this.f9203a).remove(aVar);
        this.c.post(new a(aVar, publishError));
    }

    public synchronized com.taobao.android.publisher.service.export.ayscpublish.core.a l(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.publisher.service.export.ayscpublish.core.a) ipChange.ipc$dispatch("a151973c", new Object[]{this, aVar});
        }
        ((ArrayList) this.f9203a).add(0, aVar);
        c(aVar);
        r(((APublishTask) aVar).i()).execute(aVar);
        return aVar;
    }

    public synchronized void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce7a573", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.f9203a).iterator();
        while (it.hasNext()) {
            com.taobao.android.publisher.service.export.ayscpublish.core.a aVar = (com.taobao.android.publisher.service.export.ayscpublish.core.a) it.next();
            aVar.C();
            aVar.cancel();
        }
        ((ArrayList) this.f9203a).clear();
    }

    public synchronized boolean n(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("182674c7", new Object[]{this, aVar})).booleanValue();
        } else if (aVar == null) {
            return false;
        } else {
            aVar.C();
            ((ArrayList) this.f9203a).remove(aVar);
            return aVar.cancel();
        }
    }

    public void o() {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf8b03d", new Object[]{this});
            return;
        }
        String userId = k4n.b().c().getUserId();
        if (TextUtils.isEmpty(userId)) {
            k4n.b().c().a("PublishServiceImp", "getIdleTasks, no session");
            return;
        }
        File file = new File(APublishTask.q);
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.getName().contains(userId)) {
                    file2.delete();
                }
            }
        }
    }

    public com.taobao.android.publisher.service.export.ayscpublish.core.a p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.publisher.service.export.ayscpublish.core.a) ipChange.ipc$dispatch("74f96bfa", new Object[]{this, str});
        }
        Iterator it = ((ArrayList) this.f9203a).iterator();
        while (it.hasNext()) {
            com.taobao.android.publisher.service.export.ayscpublish.core.a aVar = (com.taobao.android.publisher.service.export.ayscpublish.core.a) it.next();
            if (str.equals(aVar.E0())) {
                return aVar;
            }
        }
        List<APublishTask> s = s();
        if (s != null) {
            ArrayList arrayList = (ArrayList) s;
            if (arrayList.size() > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.taobao.android.publisher.service.export.ayscpublish.core.a aVar2 = (com.taobao.android.publisher.service.export.ayscpublish.core.a) it2.next();
                    if (str.equals(aVar2.E0())) {
                        return aVar2;
                    }
                }
            }
        }
        return null;
    }

    public List<com.taobao.android.publisher.service.export.ayscpublish.core.a> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("76bdcb30", new Object[]{this});
        }
        return this.f9203a;
    }

    public final ExecutorService r(String str) {
        ThreadPoolExecutor threadPoolExecutor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("c9032f41", new Object[]{this, str});
        }
        HashMap<String, ExecutorService> hashMap = f;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str);
        }
        l lVar = this.d;
        if (lVar != null) {
            threadPoolExecutor = lVar.a(str);
        } else {
            threadPoolExecutor = v(str);
        }
        hashMap.put(str, threadPoolExecutor);
        return threadPoolExecutor;
    }

    public final List<com.taobao.android.publisher.service.export.ayscpublish.core.b> u(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b40f14fa", new Object[]{this, cls});
        }
        Collection collection = (List) ((HashMap) this.b).get(null);
        if (collection == null) {
            collection = new ArrayList();
            ((HashMap) this.b).put(null, collection);
        }
        Collection collection2 = (List) ((HashMap) this.b).get(cls);
        if (collection2 == null) {
            collection2 = new ArrayList();
            ((HashMap) this.b).put(cls, collection2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        arrayList.addAll(collection2);
        return arrayList;
    }

    public final ThreadPoolExecutor v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("bbca4936", new Object[]{this, str});
        }
        return new ThreadPoolExecutor(0, 3, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new d(this, str));
    }

    public synchronized void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            B(true);
        }
    }

    public synchronized boolean x(com.taobao.android.publisher.service.export.ayscpublish.core.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e0e99bb", new Object[]{this, bVar})).booleanValue();
        }
        return y(null, bVar);
    }

    public <T extends com.taobao.android.publisher.service.export.ayscpublish.core.a<?>> boolean y(Class<T> cls, com.taobao.android.publisher.service.export.ayscpublish.core.b<T> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adefd3fc", new Object[]{this, cls, bVar})).booleanValue();
        }
        if (bVar == null) {
            return false;
        }
        this.c.post(new e(cls, bVar));
        return true;
    }

    public final void B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f80fb5", new Object[]{this, new Boolean(z)});
            return;
        }
        List<APublishTask> s = s();
        if (s != null) {
            ArrayList arrayList = (ArrayList) s;
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    APublishTask aPublishTask = (APublishTask) it.next();
                    if (z) {
                        aPublishTask.g = 0;
                    }
                    ((ArrayList) this.f9203a).add(0, aPublishTask);
                    r(aPublishTask.i()).execute(aPublishTask);
                }
                return;
            }
        }
        k4n.b().c().a("PublishServiceImp", "restore task, no task need restore");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10, types: [T extends java.io.Serializable, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask> s() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.publisher.service.export.ayscpublish.core.c.s():java.util.List");
    }

    public final APublishTask.StoreData z(File file) {
        ObjectInputStream objectInputStream;
        FileInputStream fileInputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (APublishTask.StoreData) ipChange.ipc$dispatch("9a80c17b", new Object[]{this, file});
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            fileInputStream = new FileInputStream(file);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    APublishTask.StoreData storeData = (APublishTask.StoreData) objectInputStream.readObject();
                    k4n.b().c().f("PublishServiceImp", String.format("task restore, cost %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                    return storeData;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        k4n.b().c().d("PublishServiceImp", "task restore failed, exception=" + th.toString());
                        return null;
                    } finally {
                        oxv.a(fileInputStream);
                        oxv.a(objectInputStream);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            objectInputStream = null;
            fileInputStream = null;
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public void g(com.taobao.android.publisher.service.export.ayscpublish.core.a aVar, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78cea8bb", new Object[]{this, aVar, new Float(f2)});
            return;
        }
        k4n.b().c().f("PublishServiceImp", String.format("task[%s] onPublishProgress, progress=%f", aVar.toString(), Float.valueOf(f2)));
        this.c.post(new i(aVar, f2));
    }
}
