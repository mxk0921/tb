package tb;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import tb.o6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mbr extends o6c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f23924a = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements NetworkCallBack.InputStreamListener, NetworkCallBack.FinishListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23925a;
        public final /* synthetic */ o6c.a b;
        public final /* synthetic */ boolean c;

        /* compiled from: Taobao */
        /* renamed from: tb.mbr$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0990a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NetworkEvent.FinishEvent f23926a;

            public RunnableC0990a(NetworkEvent.FinishEvent finishEvent) {
                this.f23926a = finishEvent;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                o6c.a aVar = a.this.b;
                if (aVar != null) {
                    aVar.onFailed(this.f23926a.getDesc());
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ParcelableInputStream f23927a;

            /* compiled from: Taobao */
            /* renamed from: tb.mbr$a$b$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class RunnableC0991a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ byte[] f23928a;

                public RunnableC0991a(byte[] bArr) {
                    this.f23928a = bArr;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    o6c.a aVar = a.this.b;
                    if (aVar != null) {
                        aVar.a(this.f23928a);
                    }
                }
            }

            /* compiled from: Taobao */
            /* renamed from: tb.mbr$a$b$b  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class RunnableC0992b implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Exception f23929a;

                public RunnableC0992b(Exception exc) {
                    this.f23929a = exc;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    o6c.a aVar = a.this.b;
                    if (aVar != null) {
                        aVar.onFailed(this.f23929a.toString());
                    }
                }
            }

            public b(ParcelableInputStream parcelableInputStream) {
                this.f23927a = parcelableInputStream;
            }

            @Override // java.lang.Runnable
            public void run() {
                Throwable th;
                Exception e;
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
                            byteArrayOutputStream = new ByteArrayOutputStream(this.f23927a.length());
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = this.f23927a.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        a aVar = a.this;
                        if (aVar.c) {
                            mbr.d(mbr.this).post(new RunnableC0991a(byteArray));
                        } else {
                            o6c.a aVar2 = aVar.b;
                            if (aVar2 != null) {
                                aVar2.a(byteArray);
                            }
                        }
                        byteArrayOutputStream.close();
                    } catch (Exception e3) {
                        e = e3;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        a aVar3 = a.this;
                        if (aVar3.c) {
                            mbr.d(mbr.this).post(new RunnableC0992b(e));
                        } else {
                            o6c.a aVar4 = aVar3.b;
                            if (aVar4 != null) {
                                aVar4.onFailed(e.toString());
                            }
                        }
                        if (byteArrayOutputStream2 != null) {
                            byteArrayOutputStream2.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                }
            }
        }

        public a(String str, o6c.a aVar, boolean z) {
            this.f23925a = str;
            this.b = aVar;
            this.c = z;
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            } else if (finishEvent != null && finishEvent.getHttpCode() == 200) {
            } else {
                if (this.f23925a.startsWith("https") && finishEvent.getHttpCode() == -402) {
                    mbr.this.b(gtw.b(this.f23925a), this.b);
                } else if (this.c) {
                    mbr.d(mbr.this).post(new RunnableC0990a(finishEvent));
                } else {
                    o6c.a aVar = this.b;
                    if (aVar != null) {
                        aVar.onFailed(finishEvent.getDesc());
                    }
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

    static {
        t2o.a(502267939);
    }

    public static /* synthetic */ Handler d(mbr mbrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7d9d38b3", new Object[]{mbrVar});
        }
        return mbrVar.f23924a;
    }

    public static /* synthetic */ Object ipc$super(mbr mbrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/adapter/impl/TBDownloader");
    }

    @Override // tb.o6c
    public byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4d1e2e28", new Object[]{this, str});
        }
        return nwv.f0(iqx.getInputStreamByUrl(str));
    }

    @Override // tb.o6c
    public void b(String str, o6c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113b4b02", new Object[]{this, str, aVar});
        } else {
            c(str, true, aVar);
        }
    }

    @Override // tb.o6c
    public void c(String str, boolean z, o6c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383703e0", new Object[]{this, str, new Boolean(z), aVar});
        } else if (TextUtils.isEmpty(str)) {
            aVar.onFailed("download url is empty!");
        } else {
            DegradableNetwork degradableNetwork = new DegradableNetwork(o.J());
            RequestImpl requestImpl = new RequestImpl(str);
            int t = nwv.t(vfs.g().e("tnode", "tnode_download_timeout", "2000"), 2000);
            requestImpl.setReadTimeout(t);
            requestImpl.setConnectTimeout(t);
            degradableNetwork.asyncSend(requestImpl, null, null, new a(str, aVar, z));
        }
    }
}
