package tb;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.hihonor.push.framework.aidl.DataBuffer;
import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.IPushInvoke;
import com.hihonor.push.framework.aidl.MessageCodec;
import com.hihonor.push.framework.aidl.entity.RequestHeader;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import com.hihonor.push.sdk.ipc.HonorApiAvailability;
import com.hihonor.push.sdk.r;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.jay;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o9y implements Handler.Callback {
    public static final o9y c = new o9y();

    /* renamed from: a  reason: collision with root package name */
    public final Handler f25238a;
    public final Map<z7y, a> b = new ConcurrentHashMap(5, 0.75f, 1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements jay.a {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<kby<?>> f25239a = new LinkedList();
        public final Queue<kby<?>> b = new LinkedList();
        public final jay c = new aby(this);
        public HonorPushErrorEnum d = null;
        public final z7y e;

        public a(z7y z7yVar) {
            this.e = z7yVar;
        }

        public void a() {
            zsx.g(o9y.this.f25238a);
            aby abyVar = (aby) this.c;
            int i = abyVar.f15651a.get();
            new StringBuilder("enter disconnect, connection Status: ").append(i);
            AtomicInteger atomicInteger = abyVar.f15651a;
            if (i == 3) {
                lby lbyVar = abyVar.d;
                if (lbyVar != null) {
                    lbyVar.c();
                }
                atomicInteger.set(1);
            } else if (i == 5) {
                atomicInteger.set(4);
            }
        }

        public final synchronized void b(HonorPushErrorEnum honorPushErrorEnum) {
            try {
                zsx.g(o9y.this.f25238a);
                for (kby<?> kbyVar : this.f25239a) {
                    kbyVar.b(honorPushErrorEnum.toApiException(), null);
                }
                ((LinkedList) this.f25239a).clear();
                this.d = honorPushErrorEnum;
                a();
                ((ConcurrentHashMap) o9y.this.b).remove(this.e);
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized void c(kby<?> kbyVar) {
            Class cls;
            Type type;
            try {
                ((LinkedList) this.b).add(kbyVar);
                jay jayVar = this.c;
                b bVar = new b(kbyVar);
                kbyVar.getClass();
                Object obj = null;
                try {
                    Type genericSuperclass = kbyVar.getClass().getGenericSuperclass();
                    if (genericSuperclass == null || (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]) == null) {
                        cls = null;
                    } else {
                        cls = (Class) type;
                    }
                    if (cls != null && !cls.isPrimitive()) {
                        obj = cls.newInstance();
                    }
                } catch (Exception e) {
                    twx.a("In newResponseInstance, instancing exception." + e.getMessage());
                }
                r rVar = new r(obj, bVar);
                IPushInvoke iPushInvoke = ((aby) jayVar).b;
                String str = kbyVar.f22553a;
                RequestHeader requestHeader = kbyVar.d;
                IMessageEntity iMessageEntity = kbyVar.b;
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                MessageCodec.formMessageEntity(requestHeader, bundle);
                MessageCodec.formMessageEntity(iMessageEntity, bundle2);
                DataBuffer dataBuffer = new DataBuffer(str, bundle, bundle2);
                if (iPushInvoke != null) {
                    try {
                        iPushInvoke.call(dataBuffer, rVar);
                    } catch (Exception e2) {
                        e2.toString();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized void d() {
            try {
                zsx.g(o9y.this.f25238a);
                this.d = null;
                for (kby<?> kbyVar : this.f25239a) {
                    c(kbyVar);
                }
                ((LinkedList) this.f25239a).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements zby {

        /* renamed from: a  reason: collision with root package name */
        public final kby<?> f25240a;

        public b(kby<?> kbyVar) {
            this.f25240a = kbyVar;
        }
    }

    public o9y() {
        HandlerThread handlerThread = new HandlerThread("HonorApiManager");
        handlerThread.start();
        this.f25238a = new Handler(handlerThread.getLooper(), this);
    }

    public <TResult> m9y a(kby<TResult> kbyVar) {
        ndy<TResult> ndyVar = new ndy<>();
        kbyVar.e = ndyVar;
        Handler handler = this.f25238a;
        handler.sendMessage(handler.obtainMessage(1, kbyVar));
        return ndyVar.f24669a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar;
        int i = message.what;
        if (i == 1) {
            kby<?> kbyVar = (kby) message.obj;
            z7y z7yVar = kbyVar.c;
            a aVar2 = (a) ((ConcurrentHashMap) this.b).get(z7yVar);
            if (aVar2 == null) {
                aVar2 = new a(z7yVar);
                ((ConcurrentHashMap) this.b).put(z7yVar, aVar2);
            }
            synchronized (aVar2) {
                try {
                    zsx.g(o9y.this.f25238a);
                    if (((aby) aVar2.c).b()) {
                        aVar2.c(kbyVar);
                    } else {
                        ((LinkedList) aVar2.f25239a).add(kbyVar);
                        HonorPushErrorEnum honorPushErrorEnum = aVar2.d;
                        if (honorPushErrorEnum == null || honorPushErrorEnum.getErrorCode() == 0) {
                            synchronized (aVar2) {
                                zsx.g(o9y.this.f25238a);
                                if (!((aby) aVar2.c).b() && ((aby) aVar2.c).f15651a.get() != 5) {
                                    aby abyVar = (aby) aVar2.c;
                                    abyVar.getClass();
                                    int i2 = abyVar.f15651a.get();
                                    if (!(i2 == 3 || i2 == 5 || i2 == 4)) {
                                        s4y s4yVar = s4y.e;
                                        int b2 = HonorApiAvailability.b(s4yVar.d());
                                        if (b2 == HonorPushErrorEnum.SUCCESS.getErrorCode()) {
                                            abyVar.f15651a.set(5);
                                            zyn a2 = HonorApiAvailability.a(s4yVar.d());
                                            lby lbyVar = new lby(a2);
                                            abyVar.d = lbyVar;
                                            lbyVar.f23241a = new vay(abyVar);
                                            if (!a2.a()) {
                                                Objects.toString(a2);
                                                lbyVar.b(8002004);
                                            } else {
                                                Intent intent = new Intent();
                                                String b3 = a2.b();
                                                String c2 = a2.c();
                                                if (!TextUtils.isEmpty(c2)) {
                                                    intent.setComponent(new ComponentName(b3, c2));
                                                } else {
                                                    intent.setAction(null);
                                                    intent.setPackage(b3);
                                                }
                                                synchronized (lby.e) {
                                                    if (s4yVar.d().bindService(intent, lbyVar, 1)) {
                                                        Handler handler = lbyVar.b;
                                                        if (handler != null) {
                                                            handler.removeMessages(1001);
                                                        } else {
                                                            lbyVar.b = new Handler(Looper.getMainLooper(), new eby(lbyVar));
                                                        }
                                                        lbyVar.b.sendEmptyMessageDelayed(1001, 10000L);
                                                    } else {
                                                        lbyVar.c = true;
                                                        lbyVar.b(8002001);
                                                    }
                                                }
                                            }
                                        } else {
                                            abyVar.a(b2);
                                        }
                                    }
                                }
                            }
                        } else {
                            aVar2.b(aVar2.d);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            kby kbyVar2 = (kby) message.obj;
            z7y z7yVar2 = kbyVar2.c;
            if (!(z7yVar2 == null || !((ConcurrentHashMap) this.b).containsKey(z7yVar2) || (aVar = (a) ((ConcurrentHashMap) this.b).get(z7yVar2)) == null)) {
                synchronized (aVar) {
                    try {
                        ((LinkedList) aVar.b).remove(kbyVar2);
                        if (((LinkedList) aVar.f25239a).peek() != null) {
                            if (((LinkedList) aVar.b).peek() == null) {
                            }
                        }
                        aVar.a();
                        ((ConcurrentHashMap) o9y.this.b).remove(aVar.e);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return true;
        }
    }
}
