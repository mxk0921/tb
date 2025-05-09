package com.taobao.aranger.utils;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.b5d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FakeServiceCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile FakeServiceCenter b = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, FakeService> f10074a = new ConcurrentHashMap();

    static {
        t2o.a(393216094);
    }

    public static FakeServiceCenter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FakeServiceCenter) ipChange.ipc$dispatch("7765f4a8", new Object[0]);
        }
        if (b == null) {
            synchronized (FakeServiceCenter.class) {
                try {
                    if (b == null) {
                        b = new FakeServiceCenter();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public FakeService b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FakeService) ipChange.ipc$dispatch("e148d61c", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (FakeService) ((ConcurrentHashMap) this.f10074a).get(str);
    }

    public FakeService c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FakeService) ipChange.ipc$dispatch("54866c2c", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (FakeService fakeService : ((ConcurrentHashMap) this.f10074a).values()) {
            if (str.equals(fakeService.c())) {
                return fakeService;
            }
        }
        return null;
    }

    public Collection<FakeService> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("d2fc1183", new Object[]{this});
        }
        return ((ConcurrentHashMap) this.f10074a).values();
    }

    public void e(String str, FakeService fakeService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e078bf", new Object[]{this, str, fakeService});
        } else {
            ((ConcurrentHashMap) this.f10074a).put(str, fakeService);
        }
    }

    public FakeService f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FakeService) ipChange.ipc$dispatch("8eea8b7c", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return (FakeService) ((ConcurrentHashMap) this.f10074a).remove(str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class FakeService extends Service {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f10075a;
        public final Service b;
        public final AtomicInteger c = new AtomicInteger();
        public final HashMap<Integer, List<Intent.FilterComparison>> d = new HashMap<>();
        public final HashMap<Intent.FilterComparison, IBinder> e = new HashMap<>();

        static {
            t2o.a(393216095);
        }

        public FakeService(String str, Service service) {
            this.f10075a = str;
            this.b = service;
        }

        public static /* synthetic */ Object ipc$super(FakeService fakeService, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/utils/FakeServiceCenter$FakeService");
        }

        public Pair<Boolean, Boolean> a(int i, Intent intent) {
            boolean z;
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("9aee5f46", new Object[]{this, new Integer(i), intent});
            }
            List<Intent.FilterComparison> list = this.d.get(Integer.valueOf(i));
            if (list != null) {
                z = true;
            } else {
                z = false;
            }
            Intent.FilterComparison filterComparison = new Intent.FilterComparison(intent);
            Iterator<List<Intent.FilterComparison>> it = this.d.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().contains(filterComparison)) {
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (list == null) {
                list = new ArrayList<>();
                this.d.put(Integer.valueOf(i), list);
            }
            if (!list.contains(filterComparison)) {
                list.add(filterComparison);
            }
            return Pair.create(Boolean.valueOf(z2), Boolean.valueOf(z));
        }

        public IBinder b(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IBinder) ipChange.ipc$dispatch("faed9959", new Object[]{this, intent});
            }
            return this.e.get(new Intent.FilterComparison(intent));
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            Service service = this.b;
            if (service == null) {
                return "";
            }
            return service.getClass().getName();
        }

        public Service d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Service) ipChange.ipc$dispatch("f1b3f190", new Object[]{this});
            }
            return this.b;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4b946cb9", new Object[]{this});
            }
            return this.f10075a;
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9deaabd2", new Object[]{this})).booleanValue();
            }
            if (this.c.get() == 0) {
                return true;
            }
            return false;
        }

        public void g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cfc6c6", new Object[]{this, new Integer(i)});
                return;
            }
            List<Intent.FilterComparison> remove = this.d.remove(Integer.valueOf(i));
            if (!(remove == null || remove.isEmpty())) {
                if (!this.d.isEmpty()) {
                    for (List<Intent.FilterComparison> list : this.d.values()) {
                        remove.removeAll(list);
                    }
                }
                for (Intent.FilterComparison filterComparison : remove) {
                    this.e.remove(filterComparison);
                    onUnbind(filterComparison.getIntent());
                }
            }
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
            }
            b5d.i("FakeServiceCenter", "Service.onBind()", "bindingCnt", Integer.valueOf(this.c.incrementAndGet()));
            IBinder onBind = this.b.onBind(intent);
            this.e.put(new Intent.FilterComparison(intent), onBind);
            return onBind;
        }

        @Override // android.app.Service, android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            } else {
                this.b.onConfigurationChanged(configuration);
            }
        }

        @Override // android.app.Service
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            b5d.i("FakeServiceCenter", "Service.onDestroy()", new Object[0]);
            this.b.onDestroy();
        }

        @Override // android.app.Service, android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            } else {
                this.b.onLowMemory();
            }
        }

        @Override // android.app.Service, android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            } else {
                this.b.onTrimMemory(i);
            }
        }

        @Override // android.app.Service
        public boolean onUnbind(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
            }
            b5d.i("FakeServiceCenter", "Service.onUnbind()", "bindingCnt", Integer.valueOf(this.c.decrementAndGet()));
            return this.b.onUnbind(intent);
        }

        @Override // android.app.Service
        public void onCreate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
                return;
            }
            b5d.i("FakeServiceCenter", "invoke Service.onCreate()", "service", this.b, "timeStamp", this.f10075a);
            this.b.onCreate();
        }
    }
}
