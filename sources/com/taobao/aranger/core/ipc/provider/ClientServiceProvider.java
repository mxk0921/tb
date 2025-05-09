package com.taobao.aranger.core.ipc.provider;

import android.os.Binder;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.annotation.method.UIThread;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Callback;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IClientService;
import com.taobao.aranger.utils.CallbackManager;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.b5d;
import tb.equ;
import tb.fql;
import tb.g5d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ClientServiceProvider extends Binder implements IClientService {
    private static final String TAG = ClientServiceProvider.class.getSimpleName();
    private static volatile ClientServiceProvider sInstance;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Callback f10067a;

        public a(Callback callback) {
            this.f10067a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ClientServiceProvider.this.sendCallback(this.f10067a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f10068a;

        public b(List list) {
            this.f10068a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                List<String> list = this.f10068a;
                if (list != null) {
                    ClientServiceProvider.this.recycle(list);
                }
            } catch (Exception e) {
                b5d.h(ClientServiceProvider.TAG, "[onTransact][recycle]", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Object f10069a;
        private CountDownLatch b;
        private final Method c;
        private final Object d;
        private final Object[] e;
        private Exception f;

        static {
            t2o.a(393216064);
        }

        public c(Method method, Object obj, Object[] objArr) {
            this.c = method;
            this.d = obj;
            this.e = objArr;
        }

        public Exception a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Exception) ipChange.ipc$dispatch("9ad20156", new Object[]{this});
            }
            return this.f;
        }

        public Object b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("5be12058", new Object[]{this});
            }
            return this.f10069a;
        }

        public void c(CountDownLatch countDownLatch) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d56243ba", new Object[]{this, countDownLatch});
            } else {
                this.b = countDownLatch;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            CountDownLatch countDownLatch;
            try {
                try {
                    this.f10069a = this.c.invoke(this.d, this.e);
                    countDownLatch = this.b;
                    if (countDownLatch == null) {
                        return;
                    }
                } catch (Exception e) {
                    b5d.h(ClientServiceProvider.TAG, "[CallbackRunnable][run]", e, new Object[0]);
                    this.f = e;
                    countDownLatch = this.b;
                    if (countDownLatch == null) {
                        return;
                    }
                }
                countDownLatch.countDown();
            } catch (Throwable th) {
                CountDownLatch countDownLatch2 = this.b;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                }
                throw th;
            }
        }
    }

    static {
        t2o.a(393216061);
        t2o.a(393216077);
    }

    private ClientServiceProvider() {
        attachInterface(this, Constants.CLIENT_SERVICE_DESCRIPTOR);
    }

    public static ClientServiceProvider getClientService() {
        if (sInstance == null) {
            synchronized (ClientServiceProvider.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new ClientServiceProvider();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 3) {
            if (i == 4) {
                g5d.b(false, false, new b(parcel.createStringArrayList()));
            }
            return true;
        }
        Callback createFromParcel = Callback.CREATOR.createFromParcel(parcel);
        if (i2 == 17 || i2 == 1) {
            g5d.b(false, false, new a(createFromParcel));
        } else {
            try {
                Reply sendCallback = sendCallback(createFromParcel);
                if (createFromParcel.getMethodWrapper().isVoid()) {
                    if (!sendCallback.isError()) {
                        if (sendCallback.getFlowParameterWrappers() != null) {
                        }
                    }
                }
                sendCallback.writeToParcel(parcel2, 0);
            } catch (Exception e) {
                Reply.obtain().setErrorCode(8).setErrorMessage(e.getMessage()).writeToParcel(parcel2, i2);
            }
        }
        return true;
    }

    @Override // com.taobao.aranger.intf.IService
    public void recycle(List<String> list) {
        for (String str : list) {
            CallbackManager.f().j(str);
        }
    }

    @Override // com.taobao.aranger.intf.IClientService
    public Reply sendCallback(Callback callback) {
        Class<?>[] interfaces;
        boolean z;
        long j;
        Exception e;
        Object b2;
        Object e2 = CallbackManager.f().e(callback.getTimeStamp());
        if (e2 == null) {
            return Reply.obtain().setErrorCode(6).setErrorMessage("can't find callback in current process");
        }
        try {
            ArrayList arrayList = new ArrayList();
            Method f = equ.e().f(e2.getClass(), callback.getMethodWrapper(), callback.getParameterWrappers());
            Object[] a2 = fql.a(callback.getParameterWrappers(), arrayList);
            boolean z2 = false;
            for (Class<?> cls : e2.getClass().getInterfaces()) {
                if (TypeUtils.a(cls.getAnnotations(), com.taobao.aranger.annotation.type.Callback.class)) {
                    z2 = TypeUtils.a(equ.e().f(cls, callback.getMethodWrapper(), callback.getParameterWrappers()).getAnnotations(), UIThread.class);
                }
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z = true;
            } else {
                z = false;
            }
            Reply obtain = Reply.obtain();
            boolean z3 = z ^ z2;
            ParameterWrapper[] parameterWrapperArr = null;
            if (z3) {
                try {
                    c cVar = new c(f, e2, a2);
                    if (!TypeUtils.o(f.getReturnType()) || !arrayList.isEmpty()) {
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        cVar.c(countDownLatch);
                        g5d.b(!z, false, cVar);
                        if (z) {
                            j = 1000;
                        } else {
                            j = 10000;
                        }
                        countDownLatch.await(j, TimeUnit.MILLISECONDS);
                        e = cVar.a();
                        b2 = cVar.b();
                    } else {
                        g5d.b(!z, false, cVar);
                        return obtain.setResult(null);
                    }
                } catch (Exception e3) {
                    return obtain.setErrorCode(7).setErrorMessage("callback invoke error: " + e3.getMessage());
                }
            } else {
                try {
                    b2 = f.invoke(e2, a2);
                    e = null;
                } catch (Exception e4) {
                    e = e4;
                    b2 = null;
                }
            }
            if (e == null) {
                if (!arrayList.isEmpty()) {
                    parameterWrapperArr = new ParameterWrapper[arrayList.size()];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        parameterWrapperArr[intValue] = ParameterWrapper.obtain().setData(a2[((Integer) arrayList.get(intValue)).intValue()]);
                    }
                }
                return obtain.setFlowParameterWrappers(parameterWrapperArr).setResult(b2);
            }
            throw new IPCException(4, e);
        } catch (IPCException e5) {
            b5d.h(TAG, "[sendCallback]", e5, new Object[0]);
            return Reply.obtain().setErrorCode(e5.getErrorCode()).setErrorMessage(e5.getMessage());
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
