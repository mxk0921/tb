package tao.reactivex.d.h;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.cyx;
import tb.r9y;
import tb.sxx;
import tb.t2o;
import tb.tzx;
import tb.wxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum g {
    COMPLETE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final sxx f15449a;

        static {
            t2o.a(628097493);
        }

        public a(sxx sxxVar) {
            this.f15449a = sxxVar;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "NotificationLite.Disposable[" + this.f15449a + "]";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f15450a;

        static {
            t2o.a(628097494);
        }

        public b(Throwable th) {
            this.f15450a = th;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (obj instanceof b) {
                return wxx.c(this.f15450a, ((b) obj).f15450a);
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.f15450a.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "NotificationLite.Error[" + this.f15450a + "]";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class c implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final tzx f15451a;

        static {
            t2o.a(628097495);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "NotificationLite.Subscription[" + this.f15451a + "]";
        }
    }

    public static Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[0]) : COMPLETE;
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/h/g");
    }

    public static g valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("c69eaf2", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(g.class, str);
        }
        return (g) valueOf;
    }

    @Override // java.lang.Enum
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "NotificationLite.Complete";
    }

    public static <T> Object a(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9798556e", new Object[]{t}) : t;
    }

    public static Object a(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1d40ca45", new Object[]{th}) : new b(th);
    }

    public static Object a(sxx sxxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("28920dd0", new Object[]{sxxVar}) : new a(sxxVar);
    }

    public static <T> boolean a(Object obj, cyx<? super T> cyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd64ca04", new Object[]{obj, cyxVar})).booleanValue();
        }
        if (obj == COMPLETE) {
            cyxVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            cyxVar.onError(((b) obj).f15450a);
            return true;
        } else if (obj instanceof c) {
            cyxVar.onSubscribe(((c) obj).f15451a);
            return false;
        } else {
            cyxVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean a(Object obj, r9y<? super T> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8525d8d4", new Object[]{obj, r9yVar})).booleanValue();
        }
        if (obj == COMPLETE) {
            r9yVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            r9yVar.onError(((b) obj).f15450a);
            return true;
        } else if (obj instanceof a) {
            r9yVar.onSubscribe(((a) obj).f15449a);
            return false;
        } else {
            r9yVar.onNext(obj);
            return false;
        }
    }
}
