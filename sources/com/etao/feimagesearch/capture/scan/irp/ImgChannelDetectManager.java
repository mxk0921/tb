package com.etao.feimagesearch.capture.scan.irp;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.channel.ChannelDetectUnit;
import com.etao.feimagesearch.nn.MNNManager;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.agh;
import tb.ckf;
import tb.njg;
import tb.oi3;
import tb.pi3;
import tb.t2o;
import tb.utm;
import tb.wuc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImgChannelDetectManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IRP_CHANNEL_DETECT_FLAG = 256;
    public static final String TAG = "ImgChannelDetectManager";

    /* renamed from: a  reason: collision with root package name */
    public final LimitLinkedHashMap<Integer, pi3> f4672a;
    public utm b;
    public static final a Companion = new a(null);
    public static final njg<ImgChannelDetectManager> c = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, ImgChannelDetectManager$Companion$instance$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296707);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final boolean a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("891c9e71", new Object[]{this, num})).booleanValue();
            }
            if (num != null && (num.intValue() & 256) > 0) {
                return true;
            }
            return false;
        }

        public final ImgChannelDetectManager b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImgChannelDetectManager) ipChange.ipc$dispatch("1c4c349b", new Object[]{this});
            }
            return (ImgChannelDetectManager) ImgChannelDetectManager.b().getValue();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements wuc<pi3> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        /* renamed from: a */
        public void onResult(pi3 pi3Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("602c8688", new Object[]{this, pi3Var});
                return;
            }
            ckf.g(pi3Var, "output");
            ImgChannelDetectManager.c(ImgChannelDetectManager.this).put(Integer.valueOf(this.b), pi3Var);
        }

        @Override // tb.wuc
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            ckf.g(th, "throwable");
            ImgChannelDetectManager.c(ImgChannelDetectManager.this).put(Integer.valueOf(this.b), new pi3(-2, "unit run error", 0L));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements MNNManager.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4674a;
        public final /* synthetic */ ImgChannelDetectManager b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements utm {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImgChannelDetectManager f4675a;

            public a(ImgChannelDetectManager imgChannelDetectManager) {
                this.f4675a = imgChannelDetectManager;
            }

            @Override // tb.utm
            public void a(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3030f401", new Object[]{this, new Integer(i), str});
                    return;
                }
                agh.r("PltCamera", ImgChannelDetectManager.TAG, "channel detect prepare failed errorCode=" + i + ", errorMsg=" + ((Object) str));
            }

            @Override // tb.utm
            public void onPrepareSuccess() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("625fbbc2", new Object[]{this});
                    return;
                }
                agh.r("PltCamera", ImgChannelDetectManager.TAG, "channel detect prepare success");
                utm a2 = ImgChannelDetectManager.a(this.f4675a);
                if (a2 != null) {
                    a2.onPrepareSuccess();
                }
            }
        }

        public c(String str, ImgChannelDetectManager imgChannelDetectManager) {
            this.f4674a = str;
            this.b = imgChannelDetectManager;
        }

        @Override // com.etao.feimagesearch.nn.MNNManager.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be56d7bc", new Object[]{this});
            } else {
                ChannelDetectUnit.Companion.a().c(new a(this.b), this.f4674a);
            }
        }
    }

    static {
        t2o.a(481296706);
    }

    public /* synthetic */ ImgChannelDetectManager(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ utm a(ImgChannelDetectManager imgChannelDetectManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (utm) ipChange.ipc$dispatch("4b1eb425", new Object[]{imgChannelDetectManager});
        }
        return imgChannelDetectManager.b;
    }

    public static final /* synthetic */ njg b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("59beb729", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ LimitLinkedHashMap c(ImgChannelDetectManager imgChannelDetectManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LimitLinkedHashMap) ipChange.ipc$dispatch("e8b5280c", new Object[]{imgChannelDetectManager});
        }
        return imgChannelDetectManager.f4672a;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60d430b", new Object[]{this, str});
            return;
        }
        ckf.g(str, "activityHashCode");
        this.b = null;
        ChannelDetectUnit.Companion.a().a(str);
        this.f4672a.clear();
    }

    public final void e(oi3 oi3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257b3616", new Object[]{this, oi3Var});
            return;
        }
        ckf.g(oi3Var, "channelDetectInput");
        int b2 = oi3Var.b();
        ChannelDetectUnit.a aVar = ChannelDetectUnit.Companion;
        if (!aVar.a().x()) {
            this.f4672a.put(Integer.valueOf(b2), new pi3(-1, "unit prepare error", 0L));
        } else {
            aVar.a().b(oi3Var, null, new b(b2));
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2784b858", new Object[]{this, str});
            return;
        }
        ckf.g(str, "activityHashCode");
        MNNManager.Companion.a().j(ChannelDetectUnit.TASK_NAME, new c(str, this));
    }

    public final pi3 g(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pi3) ipChange.ipc$dispatch("ec9cdc73", new Object[]{this, num});
        }
        if (num == null) {
            return new pi3(-5, "invalid client img token", 0L);
        }
        return this.f4672a.get(num);
    }

    public final void h(utm utmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0d9d67", new Object[]{this, utmVar});
            return;
        }
        ckf.g(utmVar, "callback");
        if (ChannelDetectUnit.Companion.a().x()) {
            utmVar.onPrepareSuccess();
        } else {
            this.b = utmVar;
        }
    }

    public final void i(utm utmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a34e176e", new Object[]{this, utmVar});
            return;
        }
        ckf.g(utmVar, "callback");
        if (ckf.b(utmVar, this.b)) {
            this.b = null;
        }
    }

    public ImgChannelDetectManager() {
        this.f4672a = new LimitLinkedHashMap<>(16);
    }
}
