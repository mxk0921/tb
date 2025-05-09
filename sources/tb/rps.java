package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.NavigationTabIconSourceType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rps extends AsyncTask<com.taobao.tao.navigation.b, Void, List<com.taobao.tao.navigation.b>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f27536a;
    public long b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements s8d<b1m> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.s8d
        public boolean onHappen(b1m b1mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6b6cca12", new Object[]{this, b1mVar})).booleanValue();
            }
            rps.a(rps.this).countDown();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            rps.a(rps.this).countDown();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.tao.navigation.b f27539a;

        public c(com.taobao.tao.navigation.b bVar) {
            this.f27539a = bVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            rps.a(rps.this).countDown();
            rps.b(rps.this);
            this.f27539a.a0(succPhenixEvent.getDrawable());
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements s8d<b1m> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.s8d
        public boolean onHappen(b1m b1mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6b6cca12", new Object[]{this, b1mVar})).booleanValue();
            }
            rps.a(rps.this).countDown();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            rps.a(rps.this).countDown();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.tao.navigation.b f27542a;

        public f(com.taobao.tao.navigation.b bVar) {
            this.f27542a = bVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            rps.a(rps.this).countDown();
            rps.b(rps.this);
            this.f27542a.W(succPhenixEvent.getDrawable());
            return true;
        }
    }

    public rps(int i) {
        long j;
        CountDownLatch countDownLatch = new CountDownLatch(i);
        this.f27536a = countDownLatch;
        if (countDownLatch.getCount() <= 0) {
            j = -1;
        } else {
            j = countDownLatch.getCount();
        }
        this.b = j;
    }

    public static /* synthetic */ CountDownLatch a(rps rpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownLatch) ipChange.ipc$dispatch("f163dda3", new Object[]{rpsVar});
        }
        return rpsVar.f27536a;
    }

    public static /* synthetic */ long b(rps rpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4765551", new Object[]{rpsVar})).longValue();
        }
        long j = rpsVar.b;
        rpsVar.b = j - 1;
        return j;
    }

    public static /* synthetic */ Object ipc$super(rps rpsVar, String str, Object... objArr) {
        if (str.hashCode() == -1325021319) {
            super.onPostExecute(objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/navigation/TabBarImageLoadTask");
    }

    /* renamed from: c */
    public final List<com.taobao.tao.navigation.b> doInBackground(com.taobao.tao.navigation.b... bVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e5ba4abc", new Object[]{this, bVarArr});
        }
        if (bVarArr.length <= 0) {
            return null;
        }
        for (com.taobao.tao.navigation.b bVar : bVarArr) {
            s0m.B().T((String) bVar.k().first).succListener(new c(bVar)).failListener(new b()).cancelListener(new a()).fetch();
            s0m.B().T((String) bVar.k().second).succListener(new f(bVar)).failListener(new e()).cancelListener(new d()).fetch();
        }
        try {
            if (!this.f27536a.await(15L, TimeUnit.SECONDS)) {
                return null;
            }
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        return Arrays.asList(bVarArr);
    }

    /* renamed from: d */
    public void onPostExecute(List<com.taobao.tao.navigation.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598ba7ce", new Object[]{this, list});
            return;
        }
        super.onPostExecute(list);
        if (list != null) {
            if (this.b == 0) {
                synchronized (com.taobao.tao.navigation.a.class) {
                    try {
                        for (com.taobao.tao.navigation.b bVar : list) {
                            if (bVar.l() == NavigationTabIconSourceType.URL) {
                                bVar.L(NavigationTabIconSourceType.DRAWABLE2);
                                ArrayList<com.taobao.tao.navigation.b> arrayList = com.taobao.tao.navigation.a.f12555a;
                                int indexOf = arrayList.indexOf(bVar);
                                if (indexOf >= 0) {
                                    arrayList.set(indexOf, bVar);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            TLog.loge(y9a.c(), "TabBarImageLoadTask", "onPostExecute");
            com.taobao.tao.navigation.a.u0();
        }
    }
}
