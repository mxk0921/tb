package tb;

import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.aidl.ParcelableInputStream;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.network.NetworkCallbackAdapter;
import mtopsdk.mtop.util.JsonUtil;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.network.domain.NetworkStats;
import tb.nrf;
import tb.o9o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class rtj implements NetworkCallBack.ResponseCodeListener, NetworkCallBack.InputStreamListener, NetworkCallBack.FinishListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, List<String>> f27598a;
    public final String b;
    public final boolean g;
    public final zu2 n;
    public final htj o;
    public volatile boolean c = false;
    public NetworkEvent.FinishEvent d = null;
    public boolean e = false;
    public ByteArrayOutputStream f = null;
    public nrf.b h = null;
    public nrf.c<BaseOutDo> i = null;
    public long j = -1;
    public long k = -1;
    public boolean l = false;
    public int m = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ParcelableInputStream f27599a;
        public final /* synthetic */ Object b;

        public a(ParcelableInputStream parcelableInputStream, Object obj) {
            this.f27599a = parcelableInputStream;
            this.b = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00e9, code lost:
            if (r0 != null) goto L_0x00eb;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
            r0.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0109, code lost:
            if (r0 == null) goto L_0x00ee;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 306
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.rtj.a.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NetworkEvent.FinishEvent f27600a;
        public final /* synthetic */ Object b;

        public b(NetworkEvent.FinishEvent finishEvent, Object obj) {
            this.f27600a = finishEvent;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                rtj.this.g(this.f27600a, this.b);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    String str = rtj.this.b;
                    TBSdkLog.d("mtopsdk.NetworkListenerAdapter", str, "[callFinish] execute onFinishTask time[ms] " + (System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (Exception e) {
                TBSdkLog.e("mtopsdk.NetworkListenerAdapter", rtj.this.b, "[callFinish]execute onFinishTask error.", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c extends q9o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ byte[] b;

        public c(rtj rtjVar, byte[] bArr) {
            this.b = bArr;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/network/impl/NetworkListenerAdapter$3");
        }

        @Override // tb.q9o
        public InputStream a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputStream) ipChange.ipc$dispatch("9a7074b2", new Object[]{this});
            }
            return null;
        }

        @Override // tb.q9o
        public long b() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("905069ba", new Object[]{this})).longValue();
            }
            byte[] bArr = this.b;
            if (bArr != null) {
                return bArr.length;
            }
            return 0L;
        }

        @Override // tb.q9o
        public byte[] c() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("3e6c8fa1", new Object[]{this});
            }
            return this.b;
        }
    }

    static {
        t2o.a(589300041);
        t2o.a(607125969);
        t2o.a(607125967);
        t2o.a(607125966);
    }

    public rtj(zu2 zu2Var, htj htjVar, String str) {
        boolean z = false;
        this.g = false;
        this.n = zu2Var;
        this.o = htjVar;
        this.b = str;
        if (SwitchConfig.getInstance().isStreamJsonEnable() && zu2Var.request().z) {
            z = true;
        }
        this.g = z;
        if (z && zu2Var.request().A != null) {
            this.g = SwitchConfig.getInstance().isStreamJsonParseObjectEnable();
        }
    }

    public static /* synthetic */ boolean a(rtj rtjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11e2510", new Object[]{rtjVar})).booleanValue();
        }
        return rtjVar.g;
    }

    public static /* synthetic */ nrf.c b(rtj rtjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nrf.c) ipChange.ipc$dispatch("3e5a9ead", new Object[]{rtjVar});
        }
        return rtjVar.i;
    }

    public static /* synthetic */ nrf.c c(rtj rtjVar, nrf.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nrf.c) ipChange.ipc$dispatch("96f6410b", new Object[]{rtjVar, cVar});
        }
        rtjVar.i = cVar;
        return cVar;
    }

    public static /* synthetic */ nrf.b d(rtj rtjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nrf.b) ipChange.ipc$dispatch("40a4fa6d", new Object[]{rtjVar});
        }
        return rtjVar.h;
    }

    public static /* synthetic */ nrf.b e(rtj rtjVar, nrf.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nrf.b) ipChange.ipc$dispatch("ca439e4e", new Object[]{rtjVar, bVar});
        }
        rtjVar.h = bVar;
        return bVar;
    }

    public void f(NetworkEvent.FinishEvent finishEvent, Object obj) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31be3c8", new Object[]{this, finishEvent, obj});
            return;
        }
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = hashCode();
        }
        MtopSDKThreadPoolExecutorFactory.submitCallbackTask(i, new b(finishEvent, obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19, types: [mtopsdk.mtop.domain.BaseOutDo] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r8v7, types: [mtopsdk.mtop.domain.BaseOutDo] */
    public void g(NetworkEvent.FinishEvent finishEvent, Object obj) {
        byte[] bArr;
        BaseOutDo baseOutDo;
        Exception e;
        long currentTimeMillis;
        JSONObject jSONObject;
        BaseOutDo baseOutDo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51432122", new Object[]{this, finishEvent, obj});
        } else if (this.o == null) {
            TBSdkLog.e("mtopsdk.NetworkListenerAdapter", this.b, "[onFinishTask]networkCallback is null");
        } else {
            ByteArrayOutputStream byteArrayOutputStream = this.f;
            JSONObject jSONObject2 = null;
            if (byteArrayOutputStream != null) {
                bArr = byteArrayOutputStream.toByteArray();
            } else {
                bArr = null;
            }
            if (this.g) {
                try {
                    currentTimeMillis = System.currentTimeMillis();
                    nrf.b bVar = this.h;
                    if (bVar != null) {
                        bVar.c();
                        jSONObject = this.h.d();
                    } else {
                        jSONObject = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    baseOutDo = null;
                }
                try {
                    nrf.c<BaseOutDo> cVar = this.i;
                    if (cVar != null) {
                        cVar.c();
                        jSONObject2 = this.i.d();
                    }
                    if (!(jSONObject2 == null && jSONObject == null)) {
                        this.j = System.currentTimeMillis() - currentTimeMillis;
                        if (bArr != null && bArr.length > 0) {
                            this.k = bArr.length;
                        }
                        TBSdkLog.e("mtopsdk.NetworkListenerAdapter", this.b, "[stream-json]cost = " + this.j + ", size = " + this.k);
                    }
                    baseOutDo2 = jSONObject2;
                    jSONObject2 = jSONObject;
                } catch (Exception e3) {
                    e = e3;
                    baseOutDo = jSONObject2;
                    jSONObject2 = jSONObject;
                    this.l = true;
                    TBSdkLog.e("mtopsdk.NetworkListenerAdapter", this.b, "[stream-json]failed.", e);
                    baseOutDo2 = baseOutDo;
                    c cVar2 = new c(this, bArr);
                    NetworkStats a2 = xb.a(finishEvent.getStatisticData());
                    a2.streamParseTime = this.j;
                    a2.streamParseSize = this.k;
                    a2.streamParseException = this.l;
                    this.o.onResponse(this.n, new o9o.b().l(this.n.request()).g(finishEvent.getHttpCode()).i(finishEvent.getDesc()).h(this.f27598a).d(cVar2).j(jSONObject2).k(baseOutDo2).m(a2).e());
                }
                c cVar22 = new c(this, bArr);
                NetworkStats a22 = xb.a(finishEvent.getStatisticData());
                a22.streamParseTime = this.j;
                a22.streamParseSize = this.k;
                a22.streamParseException = this.l;
                this.o.onResponse(this.n, new o9o.b().l(this.n.request()).g(finishEvent.getHttpCode()).i(finishEvent.getDesc()).h(this.f27598a).d(cVar22).j(jSONObject2).k(baseOutDo2).m(a22).e());
            } else if (this.n.request().z) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (this.n.request().A != null) {
                    jSONObject = null;
                    jSONObject2 = JsonUtil.parseObject(bArr, this.n.request().A);
                } else {
                    jSONObject = JsonUtil.parse(bArr);
                }
                if (!(jSONObject2 == null && jSONObject == null)) {
                    this.j = System.currentTimeMillis() - currentTimeMillis2;
                    if (bArr != null && bArr.length > 0) {
                        this.k = bArr.length;
                    }
                    TBSdkLog.e("mtopsdk.NetworkListenerAdapter", this.b, "[fast-json]cost = " + this.j + ", size = " + this.k);
                }
                baseOutDo2 = jSONObject2;
                jSONObject2 = jSONObject;
                c cVar222 = new c(this, bArr);
                NetworkStats a222 = xb.a(finishEvent.getStatisticData());
                a222.streamParseTime = this.j;
                a222.streamParseSize = this.k;
                a222.streamParseException = this.l;
                this.o.onResponse(this.n, new o9o.b().l(this.n.request()).g(finishEvent.getHttpCode()).i(finishEvent.getDesc()).h(this.f27598a).d(cVar222).j(jSONObject2).k(baseOutDo2).m(a222).e());
            } else {
                baseOutDo2 = null;
                c cVar2222 = new c(this, bArr);
                NetworkStats a2222 = xb.a(finishEvent.getStatisticData());
                a2222.streamParseTime = this.j;
                a2222.streamParseSize = this.k;
                a2222.streamParseException = this.l;
                this.o.onResponse(this.n, new o9o.b().l(this.n.request()).g(finishEvent.getHttpCode()).i(finishEvent.getDesc()).h(this.f27598a).d(cVar2222).j(jSONObject2).k(baseOutDo2).m(a2222).e());
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
        synchronized (this) {
            try {
                this.d = finishEvent;
                if (!this.e) {
                    if (!this.c) {
                    }
                }
                f(finishEvent, obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // anetwork.channel.NetworkCallBack.InputStreamListener
    public void onInputStreamGet(ParcelableInputStream parcelableInputStream, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cf6995", new Object[]{this, parcelableInputStream, obj});
            return;
        }
        this.c = true;
        MtopSDKThreadPoolExecutorFactory.submitRequestTask(new a(parcelableInputStream, obj));
    }

    @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
    public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
        }
        this.f27598a = map;
        try {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "content-length");
            if (StringUtils.isBlank(singleHeaderFieldByKey)) {
                singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(this.f27598a, HttpHeaderConstant.X_BIN_LENGTH);
            }
            if (StringUtils.isNotBlank(singleHeaderFieldByKey)) {
                this.m = Integer.parseInt(singleHeaderFieldByKey);
            }
        } catch (Exception unused) {
            TBSdkLog.e("mtopsdk.NetworkListenerAdapter", this.b, "[onResponseCode]parse Response HeaderField ContentLength error ");
        }
        htj htjVar = this.o;
        if (htjVar instanceof NetworkCallbackAdapter) {
            ((NetworkCallbackAdapter) htjVar).onHeader();
        }
        return false;
    }
}
