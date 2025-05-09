package com.taobao.android.mnncv;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.dph;
import tb.eph;
import tb.eqh;
import tb.if4;
import tb.kgh;
import tb.mqh;
import tb.oqh;
import tb.qqh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MNNCVExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final eph f8984a;
    public final String b;
    public final String c;
    public String d;
    public boolean e;
    public Object f;
    public MNNExecutorState g;
    public final CachePolicy h;
    public String i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum CachePolicy {
        NoCache,
        CacheManually,
        CacheConfigOnly
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum MNNExecutorState {
        MNNCVExecutorInited,
        MNNCVExecutorPreparing,
        MNNCVExecutorPrepared
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements qqh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f8985a;

        public a(g gVar) {
            this.f8985a = gVar;
        }

        @Override // tb.qqh
        public void a(int i, MRTRuntimeException mRTRuntimeException, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f20526d", new Object[]{this, new Integer(i), mRTRuntimeException, obj});
                return;
            }
            kgh.j("MNNCVExecutor", "[prepareWithCallback] code:" + i);
            if (mRTRuntimeException != null || !(obj instanceof Map)) {
                MNNCVExecutor.a(MNNCVExecutor.this, MNNExecutorState.MNNCVExecutorInited);
            } else {
                MNNCVExecutor.a(MNNCVExecutor.this, MNNExecutorState.MNNCVExecutorPrepared);
                Map map = (Map) obj;
                if (map.containsKey("MRT_INST")) {
                    MNNCVExecutor.this.f = map.remove("MRT_INST");
                }
            }
            g gVar = this.f8985a;
            if (gVar != null) {
                gVar.onResult(mRTRuntimeException);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f8986a;

        public b(g gVar) {
            this.f8986a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MRTTaskDescription g = com.taobao.android.mnncv.a.e().g(MNNCVExecutor.b(MNNCVExecutor.this));
            if (g == null) {
                this.f8986a.onResult(new MRTRuntimeException(60009, "local not ready"));
                return;
            }
            oqh.d().i(g);
            MNNCVExecutor.c(MNNCVExecutor.this, this.f8986a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements qqh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f8987a;

        public c(h hVar) {
            this.f8987a = hVar;
        }

        @Override // tb.qqh
        public void a(int i, MRTRuntimeException mRTRuntimeException, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f20526d", new Object[]{this, new Integer(i), mRTRuntimeException, obj});
                return;
            }
            kgh.j("MNNCVExecutor", "[onCompletion] result:" + obj);
            h hVar = this.f8987a;
            if (hVar == null) {
                return;
            }
            if (mRTRuntimeException != null) {
                hVar.onResult(mRTRuntimeException, null);
            } else if (obj == null || !(obj instanceof Map)) {
                hVar.onResult(new MRTRuntimeException(407, "result format error"), null);
            } else {
                hVar.onResult(mRTRuntimeException, (Map) obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object[] f8988a;
        public final /* synthetic */ CountDownLatch b;

        public d(Object[] objArr, CountDownLatch countDownLatch) {
            this.f8988a = objArr;
            this.b = countDownLatch;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.h
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                return;
            }
            if (mRTRuntimeException != null) {
                kgh.s("MNNCVExecutor", "[onCompletion] e:" + mRTRuntimeException.errorCode);
            }
            this.f8988a[0] = map;
            this.b.countDown();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements qqh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.qqh
        public void a(int i, MRTRuntimeException mRTRuntimeException, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f20526d", new Object[]{this, new Integer(i), mRTRuntimeException, obj});
            } else if (mRTRuntimeException != null) {
                kgh.t("MNNCVExecutor", "[destroy] python instance failed", mRTRuntimeException);
            } else {
                kgh.a("MNNCVExecutor", "[destroy] python instance success");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements qqh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dph f8990a;

        public f(dph dphVar) {
            this.f8990a = dphVar;
        }

        @Override // tb.qqh
        public void a(int i, MRTRuntimeException mRTRuntimeException, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f20526d", new Object[]{this, new Integer(i), mRTRuntimeException, obj});
            } else if (this.f8990a != null) {
                if (mRTRuntimeException == null) {
                    str = mqh.c + File.separator + MNNCVExecutor.d(MNNCVExecutor.this);
                } else {
                    str = null;
                }
                this.f8990a.onCompletion(str, mRTRuntimeException);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface g {
        void onResult(MRTRuntimeException mRTRuntimeException);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface h {
        void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface i {
        void onError(String str);
    }

    public MNNCVExecutor(String str) {
        this(str, false);
    }

    public static /* synthetic */ MNNExecutorState a(MNNCVExecutor mNNCVExecutor, MNNExecutorState mNNExecutorState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MNNExecutorState) ipChange.ipc$dispatch("31aa6213", new Object[]{mNNCVExecutor, mNNExecutorState});
        }
        mNNCVExecutor.g = mNNExecutorState;
        return mNNExecutorState;
    }

    public static /* synthetic */ String b(MNNCVExecutor mNNCVExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7223d22a", new Object[]{mNNCVExecutor});
        }
        return mNNCVExecutor.b;
    }

    public static /* synthetic */ void c(MNNCVExecutor mNNCVExecutor, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf0f6135", new Object[]{mNNCVExecutor, gVar});
        } else {
            mNNCVExecutor.h(gVar);
        }
    }

    public static /* synthetic */ String d(MNNCVExecutor mNNCVExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ee5d9e8", new Object[]{mNNCVExecutor});
        }
        return mNNCVExecutor.d;
    }

    public static native byte[] nativeGetByteArray(int[] iArr);

    public void f(dph dphVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b52e4ea", new Object[]{this, dphVar});
        } else {
            oqh.d().j(this.d, "__mrt_init__", null, true, this.i, null, new f(dphVar));
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            e();
        } catch (Throwable unused) {
            kgh.s("MNNCVExecutor", "destroy failed");
        }
        super.finalize();
    }

    public synchronized void g(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("893b9d93", new Object[]{this, gVar});
            return;
        }
        kgh.j("MNNCVExecutor", "[prepareWithCallback]");
        CachePolicy cachePolicy = this.h;
        CachePolicy cachePolicy2 = CachePolicy.CacheManually;
        if (cachePolicy == cachePolicy2) {
            this.d = this.b + "_" + this.c;
            this.i = MNNCV.mServiceIdCache;
        } else {
            this.d = this.b;
            this.i = MNNCV.mServiceId;
        }
        if (MNNCV.isCVDisabled()) {
            if (gVar != null) {
                gVar.onResult(new MRTRuntimeException(83, "MNNCV is disabled by orange"));
            }
            return;
        }
        MRTTaskDescription e2 = oqh.d().e(this.b);
        if (this.h == CachePolicy.CacheConfigOnly && e2 == null) {
            if4.b().c(this.b);
        }
        if (this.h == cachePolicy2) {
            eqh.b().a(new b(gVar), 0);
        } else {
            h(gVar);
        }
    }

    public final synchronized void h(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe795901", new Object[]{this, gVar});
        } else if (!MNNCV.isTaskRunnable(this.b)) {
            kgh.s("MNNCVExecutor", "task not register");
            if (gVar != null) {
                gVar.onResult(new MRTRuntimeException(209, "task not register"));
            }
        } else {
            MNNExecutorState mNNExecutorState = this.g;
            if (mNNExecutorState == MNNExecutorState.MNNCVExecutorPrepared) {
                if (gVar != null) {
                    gVar.onResult(null);
                }
                return;
            }
            MNNExecutorState mNNExecutorState2 = MNNExecutorState.MNNCVExecutorPreparing;
            if (mNNExecutorState == mNNExecutorState2) {
                if (gVar != null) {
                    gVar.onResult(new MRTRuntimeException(60006, ""));
                }
                return;
            }
            this.g = mNNExecutorState2;
            oqh.d().j(this.d, "__mrt_init__", null, false, this.i, this.f8984a, new a(gVar));
        }
    }

    public void j(Map<String, Object> map, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a08eb", new Object[]{this, map, hVar});
            return;
        }
        kgh.j("MNNCVExecutor", "[process]");
        if (MNNCV.isCVDisabled()) {
            kgh.s("MNNCVExecutor", "MNNCV is disabled by orange");
            if (hVar != null) {
                hVar.onResult(new MRTRuntimeException(83, "MNNCV is disabled by orange"), null);
            }
        } else if (!MNNCV.isTaskRunnable(this.b)) {
            kgh.s("MNNCVExecutor", "task not register");
            if (hVar != null) {
                hVar.onResult(new MRTRuntimeException(209, "task not register"), null);
            }
        } else if (this.g == MNNExecutorState.MNNCVExecutorPrepared) {
            ArrayList arrayList = new ArrayList();
            if (map == null) {
                map = new HashMap<>();
            }
            Object obj = this.f;
            if (obj != null) {
                map.put("MRT_INST", obj);
                arrayList.add(map);
                oqh.d().j(this.d, "__mrt_process__", arrayList, false, this.i, this.f8984a, new c(hVar));
                return;
            }
            kgh.s("MNNCVExecutor", "python instance value is invalid");
            if (hVar != null) {
                hVar.onResult(new MRTRuntimeException(60006, "python instance value is invalid"), null);
            }
        } else if (hVar != null) {
            hVar.onResult(new MRTRuntimeException(com.taobao.android.dinamicx.f.DX_TEMPLATE_UNZIP_ERROR, "not prepared"), null);
        }
    }

    @Deprecated
    public MNNCVExecutor(String str, boolean z) {
        this(str, z ? CachePolicy.CacheConfigOnly : CachePolicy.NoCache, null);
    }

    public synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.e) {
            kgh.j("MNNCVExecutor", "[destroy]");
            com.taobao.android.mnncv.a.e().h(this.d);
            if (MNNCV.isCVDisabled()) {
                kgh.s("MNNCVExecutor", "MNNCV is disabled by orange");
            } else if (!MNNCV.isTaskRunnable(this.b)) {
                kgh.s("MNNCVExecutor", "task not register");
            } else {
                this.e = true;
                if (this.g != MNNExecutorState.MNNCVExecutorPrepared) {
                    kgh.s("MNNCVExecutor", "call destroy before prepared !!!");
                } else if (this.f != null) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(hashMap);
                    hashMap.put("MRT_INST", this.f);
                    oqh.d().j(this.d, "__mrt_destroy__", arrayList, false, this.i, null, new e());
                    this.f = null;
                } else {
                    kgh.s("MNNCVExecutor", "python instance value is invalid");
                }
            }
        }
    }

    public MNNCVExecutor(String str, String str2) {
        this(str, TextUtils.isEmpty(str2) ? CachePolicy.NoCache : CachePolicy.CacheManually, str2);
    }

    @Deprecated
    public Map<String, Object> i(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("18930944", new Object[]{this, map});
        }
        Object[] objArr = {null};
        CountDownLatch countDownLatch = new CountDownLatch(1);
        j(map, new d(objArr, countDownLatch));
        try {
            countDownLatch.await(60L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            kgh.t("MNNCVExecutor", "", e2);
        }
        Object obj = objArr[0];
        if (obj != null && (obj instanceof Map)) {
            return (Map) obj;
        }
        kgh.s("MNNCVExecutor", "result is not a map");
        return null;
    }

    public MNNCVExecutor(String str, CachePolicy cachePolicy, String str2) {
        this.e = false;
        this.f = null;
        this.g = null;
        this.i = MNNCV.mServiceId;
        this.b = str;
        this.d = str;
        this.f8984a = new eph();
        this.g = MNNExecutorState.MNNCVExecutorInited;
        this.h = cachePolicy;
        this.c = str2;
    }
}
