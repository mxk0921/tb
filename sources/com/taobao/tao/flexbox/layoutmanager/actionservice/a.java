package com.taobao.tao.flexbox.layoutmanager.actionservice;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.http.HttpNetwork;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import tb.gtw;
import tb.t2o;
import tb.zca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static a b;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f11990a = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.actionservice.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0677a implements NetworkCallBack.InputStreamListener, NetworkCallBack.FinishListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11991a;
        public final /* synthetic */ b b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.actionservice.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0678a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0678a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b bVar = C0677a.this.b;
                if (bVar != null) {
                    bVar.onFailed();
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.actionservice.a$a$b */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ParcelableInputStream f11993a;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.tao.flexbox.layoutmanager.actionservice.a$a$b$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public class RunnableC0679a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ String f11994a;

                public RunnableC0679a(String str) {
                    this.f11994a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b bVar = C0677a.this.b;
                    if (bVar != null) {
                        bVar.onFinish(this.f11994a);
                    }
                }
            }

            /* compiled from: Taobao */
            /* renamed from: com.taobao.tao.flexbox.layoutmanager.actionservice.a$a$b$b  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public class RunnableC0680b implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public RunnableC0680b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b bVar = C0677a.this.b;
                    if (bVar != null) {
                        bVar.onFinish(null);
                    }
                }
            }

            public b(ParcelableInputStream parcelableInputStream) {
                this.f11993a = parcelableInputStream;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                ByteArrayOutputStream byteArrayOutputStream;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ByteArrayOutputStream byteArrayOutputStream2 = null;
                try {
                    try {
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream(this.f11993a.length());
                        } catch (IOException unused) {
                            return;
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = this.f11993a.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    String byteArrayOutputStream3 = byteArrayOutputStream.toString("utf-8");
                    Handler a2 = a.a(a.this);
                    a2.post(new RunnableC0679a(byteArrayOutputStream3));
                    byteArrayOutputStream.close();
                    byteArrayOutputStream2 = a2;
                } catch (Exception unused3) {
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    a.a(a.this).post(new RunnableC0680b());
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                        byteArrayOutputStream2 = byteArrayOutputStream2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
        }

        public C0677a(String str, b bVar) {
            this.f11991a = str;
            this.b = bVar;
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            } else if (finishEvent != null && finishEvent.getHttpCode() == 200) {
            } else {
                if (!this.f11991a.startsWith("https") || finishEvent.getHttpCode() != -402) {
                    a.a(a.this).post(new RunnableC0678a());
                } else {
                    a.this.b(gtw.b(this.f11991a), this.b);
                }
            }
        }

        @Override // anetwork.channel.NetworkCallBack.InputStreamListener
        public void onInputStreamGet(ParcelableInputStream parcelableInputStream, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91cf6995", new Object[]{this, parcelableInputStream, obj});
            } else {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new b(parcelableInputStream));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void onFailed();

        void onFinish(String str);
    }

    static {
        t2o.a(347078673);
    }

    public static /* synthetic */ Handler a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("2bd281ff", new Object[]{aVar});
        }
        return aVar.f11990a;
    }

    public static synchronized a c() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("afbf9634", new Object[0]);
            }
            if (b == null) {
                b = new a();
            }
            return b;
        }
    }

    public void b(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa2d487", new Object[]{this, str, bVar});
        } else if (!TextUtils.isEmpty(str)) {
            new HttpNetwork(zca.a()).asyncSend(new RequestImpl(str), null, null, new C0677a(str, bVar));
        }
    }
}
