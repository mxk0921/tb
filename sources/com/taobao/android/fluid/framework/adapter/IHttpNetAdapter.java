package com.taobao.android.fluid.framework.adapter;

import android.os.Handler;
import android.os.Looper;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import tb.ir9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IHttpNetAdapter extends IAdapter {
    public static final String ADAPTER_NAME = "IHttpNetAdapter";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a<T> {
        T a(byte[] bArr, Class<T> cls);

        void b(byte[] bArr, T t);

        void onError(int i, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b<T> implements NetworkCallBack.FinishListener, NetworkCallBack.ResponseCodeListener, NetworkCallBack.ProgressListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final a<T> b;
        public final Class<T> c;

        /* renamed from: a  reason: collision with root package name */
        public final Handler f7755a = new Handler(Looper.getMainLooper());
        public final ByteArrayOutputStream d = new ByteArrayOutputStream();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f7756a;
            public final /* synthetic */ String b;

            public a(int i, String str) {
                this.f7756a = i;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.a(b.this).onError(this.f7756a, this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.fluid.framework.adapter.IHttpNetAdapter$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0416b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ byte[] f7757a;
            public final /* synthetic */ Object b;

            public RunnableC0416b(byte[] bArr, Object obj) {
                this.f7757a = bArr;
                this.b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.a(b.this).b(this.f7757a, this.b);
                }
            }
        }

        static {
            t2o.a(468713804);
            t2o.a(607125966);
            t2o.a(607125969);
            t2o.a(607125968);
        }

        public b(a<T> aVar, Class<T> cls) {
            this.b = aVar;
            this.c = cls;
        }

        public static /* synthetic */ a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("71a6c830", new Object[]{bVar});
            }
            return bVar.b;
        }

        public final void b(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89556f1e", new Object[]{this, new Integer(i), str});
            } else {
                this.f7755a.post(new a(i, str));
            }
        }

        public final void c(byte[] bArr, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f282ed", new Object[]{this, bArr, t});
            } else {
                this.f7755a.post(new RunnableC0416b(bArr, t));
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
            } else if (this.b != null) {
                try {
                    this.d.write(progressEvent.getBytedata(), 0, progressEvent.getSize());
                } catch (Exception e) {
                    ir9.c("NetCallback", "", e);
                }
            }
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                return;
            }
            try {
                if (this.b == null) {
                    try {
                        this.d.close();
                    } catch (IOException e) {
                        ir9.c("NetCallback", "", e);
                    }
                } else if (finishEvent == null) {
                    b(-1, "");
                    try {
                        this.d.close();
                    } catch (IOException e2) {
                        ir9.c("NetCallback", "", e2);
                    }
                } else if (finishEvent.getHttpCode() < 0) {
                    b(finishEvent.getHttpCode(), finishEvent.getDesc());
                    try {
                        this.d.close();
                    } catch (IOException e3) {
                        ir9.c("NetCallback", "", e3);
                    }
                } else {
                    byte[] byteArray = this.d.toByteArray();
                    if (byteArray == null) {
                        b(finishEvent.getHttpCode(), finishEvent.getDesc());
                        try {
                            this.d.close();
                        } catch (IOException e4) {
                            ir9.c("NetCallback", "", e4);
                        }
                    } else {
                        try {
                            c(byteArray, this.b.a(byteArray, this.c));
                        } catch (Exception unused) {
                            b(finishEvent.getHttpCode(), finishEvent.getDesc());
                        }
                        try {
                            this.d.close();
                        } catch (IOException e5) {
                            ir9.c("NetCallback", "", e5);
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    this.d.close();
                } catch (IOException e6) {
                    ir9.c("NetCallback", "", e6);
                }
                throw th;
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f7758a;

        static {
            t2o.a(468713807);
        }

        public c(String str) {
            this.f7758a = str;
        }
    }

    <T> void send(c cVar, a<T> aVar, Class<T> cls);
}
