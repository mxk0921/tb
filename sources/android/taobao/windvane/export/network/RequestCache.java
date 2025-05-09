package android.taobao.windvane.export.network;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.lcn;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RequestCache extends RequestCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1764a = false;
    public final List<a> b = new ArrayList();
    public boolean c = false;
    public RequestCallback d;
    public final Request e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface EventType {
        public static final int ON_CUSTOM_EVENT = 5;
        public static final int ON_DATA_RECEIVED = 1;
        public static final int ON_ERROR = 2;
        public static final int ON_FINISHED = 3;
        public static final int ON_NETWORK_RESPONSE = 4;
        public static final int ON_RESPONSE = 0;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f1765a;
        public final Object[] b;

        static {
            t2o.a(989855885);
        }

        public a(int i, Object... objArr) {
            this.f1765a = i;
            this.b = objArr;
        }
    }

    static {
        t2o.a(989855883);
    }

    public RequestCache(Request request) {
        this.e = request;
    }

    public static /* synthetic */ Object ipc$super(RequestCache requestCache, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/export/network/RequestCache");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f7d54b", new Object[]{this});
        } else {
            ((ArrayList) this.b).clear();
        }
    }

    public boolean b(RequestCallback requestCallback) {
        Object[] objArr;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1728205a", new Object[]{this, requestCallback})).booleanValue();
        }
        synchronized (this) {
            try {
                if (this.c) {
                    lcn.f(RVLLevel.Error, "Themis/Performance/RequestPrefetch", "RequestCache has been consumed.");
                    return false;
                }
                this.c = true;
                this.d = requestCallback;
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar != null) {
                        int i = aVar.f1765a;
                        Map<String, List<String>> map = null;
                        r5 = null;
                        Object[] objArr2 = null;
                        String str = null;
                        if (!(i == 0 || 4 == i)) {
                            if (1 == i) {
                                onReceiveData((byte[]) aVar.b[0]);
                            } else if (2 == i) {
                                int intValue = ((Integer) aVar.b[0]).intValue();
                                Object obj2 = aVar.b[1];
                                if (obj2 != null) {
                                    str = (String) obj2;
                                }
                                onError(intValue, str);
                            } else if (3 == i) {
                                onFinish();
                            } else if (5 == i && (objArr = aVar.b) != null && objArr.length >= 1) {
                                int intValue2 = ((Integer) objArr[0]).intValue();
                                Object[] objArr3 = aVar.b;
                                if (objArr3.length > 1 && (obj = objArr3[1]) != null) {
                                    objArr2 = (Object[]) obj;
                                }
                                onCustomCallback(intValue2, objArr2);
                            }
                        }
                        int intValue3 = ((Integer) aVar.b[0]).intValue();
                        Object obj3 = aVar.b[1];
                        if (obj3 != null) {
                            map = (Map) obj3;
                        }
                        if (aVar.f1765a == 0) {
                            onResponse(intValue3, map);
                        } else {
                            onNetworkResponse(intValue3, map);
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Request c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("a4d10a0e", new Object[]{this});
        }
        return this.e;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16fe733a", new Object[]{this})).booleanValue();
        }
        return this.f1764a;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1906c91c", new Object[]{this, new Boolean(z)});
        } else {
            this.f1764a = z;
        }
    }

    @Override // android.taobao.windvane.export.network.RequestCallback
    public void onCustomCallback(int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c344bdea", new Object[]{this, new Integer(i), objArr});
            return;
        }
        synchronized (this) {
            try {
                if (this.c) {
                    if (i == 3) {
                        this.c = false;
                        b.l(this);
                        a();
                        return;
                    }
                    RequestCallback requestCallback = this.d;
                    if (requestCallback != null) {
                        requestCallback.onCustomCallback(i, objArr);
                    }
                } else if (i == 3) {
                    a();
                } else {
                    ((ArrayList) this.b).add(new a(5, Integer.valueOf(i), objArr));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.taobao.windvane.export.network.RequestCallback
    public void onError(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
            return;
        }
        synchronized (this) {
            try {
                if (this.c) {
                    RequestCallback requestCallback = this.d;
                    if (requestCallback != null) {
                        requestCallback.onError(i, str);
                    }
                    a();
                } else {
                    ((ArrayList) this.b).add(new a(2, Integer.valueOf(i), str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.taobao.windvane.export.network.RequestCallback
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                if (this.c) {
                    RequestCallback requestCallback = this.d;
                    if (requestCallback != null) {
                        requestCallback.onFinish();
                    }
                    a();
                } else {
                    ((ArrayList) this.b).add(new a(3, new Object[0]));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.taobao.windvane.export.network.RequestCallback
    public void onNetworkResponse(int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d71559", new Object[]{this, new Integer(i), map});
            return;
        }
        synchronized (this) {
            try {
                if (this.c) {
                    RequestCallback requestCallback = this.d;
                    if (requestCallback != null) {
                        requestCallback.onNetworkResponse(i, map);
                    }
                } else {
                    ((ArrayList) this.b).add(new a(4, Integer.valueOf(i), map));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.taobao.windvane.export.network.RequestCallback
    public void onResponse(int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb214fe9", new Object[]{this, new Integer(i), map});
            return;
        }
        synchronized (this) {
            try {
                if (this.c) {
                    RequestCallback requestCallback = this.d;
                    if (requestCallback != null) {
                        requestCallback.onResponse(i, map);
                    }
                } else {
                    ((ArrayList) this.b).add(new a(0, Integer.valueOf(i), map));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.taobao.windvane.export.network.RequestCallback
    public void onReceiveData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24c16dc", new Object[]{this, bArr});
            return;
        }
        synchronized (this) {
            try {
                if (this.c) {
                    RequestCallback requestCallback = this.d;
                    if (requestCallback != null) {
                        requestCallback.onReceiveData(bArr);
                    }
                } else {
                    ((ArrayList) this.b).add(new a(1, bArr));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
