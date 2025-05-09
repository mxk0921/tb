package com.etao.feimagesearch.mnn;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.utils.MnnUtils;
import com.etao.feimagesearch.nn.MNNManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.a07;
import tb.agh;
import tb.caa;
import tb.ckf;
import tb.dph;
import tb.eqh;
import tb.i0u;
import tb.jzu;
import tb.lg4;
import tb.mzu;
import tb.oqh;
import tb.p73;
import tb.q7m;
import tb.t2o;
import tb.utm;
import tb.wsq;
import tb.wuc;
import tb.xhv;
import tb.xuc;
import tb.xz3;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BaseMnnRunUnit<INPUT, OUTPUT> implements xuc<INPUT, OUTPUT> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion = new Companion(null);
    public static final String KEY_BUCKET_ID = "bucketId";
    public static final String KEY_ERROR_CODE = "errorCode";
    public static final String KEY_ERROR_MSG = "errorMsg";
    public static final String KEY_EXTRA_INFO = "extraInfo";
    public static final String KEY_TASK_CID = "taskCid";
    public static final String KEY_TASK_NAME = "taskName";
    public static final String MONITOR_POINT_PREPARE_FAIL = "prepareFailed";
    public static final String MONITOR_POINT_PREPARE_SUCCESS = "prepareSuccess";
    public static final String VALUE_FAIL = "fail";
    public static final String VALUE_SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    public final String f4761a;
    public final String b;
    public volatile MNNCVExecutor c;
    public volatile boolean h;
    public boolean i;
    public boolean n;
    public volatile boolean o;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public final HashSet<String> j = new HashSet<>();
    public BaseUnitStatus k = BaseUnitStatus.EMPTY;
    public final CopyOnWriteArrayList<WeakReference<utm>> l = new CopyOnWriteArrayList<>();
    public final Handler m = new Handler(Looper.getMainLooper());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class BaseUnitStatus extends Enum<BaseUnitStatus> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int status;
        public static final BaseUnitStatus EMPTY = new BaseUnitStatus("EMPTY", 0, 0);
        public static final BaseUnitStatus ExecutorCreated = new BaseUnitStatus("ExecutorCreated", 1, 1);
        public static final BaseUnitStatus Preparing = new BaseUnitStatus("Preparing", 2, 2);
        public static final BaseUnitStatus PrepareSuccess = new BaseUnitStatus("PrepareSuccess", 3, 3);
        public static final BaseUnitStatus Destroying = new BaseUnitStatus("Destroying", 4, 4);
        private static final /* synthetic */ BaseUnitStatus[] $VALUES = $values();

        private static final /* synthetic */ BaseUnitStatus[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BaseUnitStatus[]) ipChange.ipc$dispatch("6a92f6ba", new Object[0]) : new BaseUnitStatus[]{EMPTY, ExecutorCreated, Preparing, PrepareSuccess, Destroying};
        }

        private BaseUnitStatus(String str, int i, int i2) {
            this.status = i2;
        }

        public static /* synthetic */ Object ipc$super(BaseUnitStatus baseUnitStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/mnn/BaseMnnRunUnit$BaseUnitStatus");
        }

        public static BaseUnitStatus valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("8d07bf65", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(BaseUnitStatus.class, str);
            }
            return (BaseUnitStatus) valueOf;
        }

        public static BaseUnitStatus[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("7b1ac896", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (BaseUnitStatus[]) clone;
        }

        public final int getStatus() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
            }
            return this.status;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class AlgoAction extends Enum<AlgoAction> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final String action;
            private final String utEventName;
            public static final AlgoAction INIT_ACTION = new AlgoAction("INIT_ACTION", 0, "init", "algoInitialize");
            public static final AlgoAction RESET_ACTION = new AlgoAction("RESET_ACTION", 1, DMComponent.RESET, "algoReset");
            public static final AlgoAction DESTROY_ACTION = new AlgoAction("DESTROY_ACTION", 2, "destroy", "algoDestroy");
            private static final /* synthetic */ AlgoAction[] $VALUES = $values();

            private static final /* synthetic */ AlgoAction[] $values() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (AlgoAction[]) ipChange.ipc$dispatch("cab6aaa0", new Object[0]) : new AlgoAction[]{INIT_ACTION, RESET_ACTION, DESTROY_ACTION};
            }

            private AlgoAction(String str, int i, String str2, String str3) {
                this.action = str2;
                this.utEventName = str3;
            }

            public static /* synthetic */ Object ipc$super(AlgoAction algoAction, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/mnn/BaseMnnRunUnit$Companion$AlgoAction");
            }

            public static AlgoAction valueOf(String str) {
                Object valueOf;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    valueOf = ipChange.ipc$dispatch("7a3f070b", new Object[]{str});
                } else {
                    valueOf = Enum.valueOf(AlgoAction.class, str);
                }
                return (AlgoAction) valueOf;
            }

            public static AlgoAction[] values() {
                Object clone;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    clone = ipChange.ipc$dispatch("8638a77c", new Object[0]);
                } else {
                    clone = $VALUES.clone();
                }
                return (AlgoAction[]) clone;
            }

            public final String getAction() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this});
                }
                return this.action;
            }

            public final String getUtEventName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("d9dadc9", new Object[]{this});
                }
                return this.utEventName;
            }
        }

        static {
            t2o.a(481296998);
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseMnnRunUnit<INPUT, OUTPUT> f4762a;
        public final /* synthetic */ utm b;
        public final /* synthetic */ String c;

        public a(BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit, utm utmVar, String str) {
            this.f4762a = baseMnnRunUnit;
            this.b = utmVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BaseMnnRunUnit.d(this.f4762a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseMnnRunUnit<INPUT, OUTPUT> f4763a;

        public b(BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit) {
            this.f4763a = baseMnnRunUnit;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (!TextUtils.isEmpty(BaseMnnRunUnit.h(this.f4763a))) {
                BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit = this.f4763a;
                if (!BaseMnnRunUnit.k(baseMnnRunUnit, BaseMnnRunUnit.h(baseMnnRunUnit))) {
                    String b = MnnUtils.b(BaseMnnRunUnit.j(this.f4763a), BaseMnnRunUnit.h(this.f4763a));
                    ckf.f(b, "getModelCacheDirectory(taskName, latestTaskCid)");
                    linkedHashSet.add(b);
                }
            }
            if (!TextUtils.isEmpty(BaseMnnRunUnit.g(this.f4763a))) {
                BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit2 = this.f4763a;
                if (!BaseMnnRunUnit.k(baseMnnRunUnit2, BaseMnnRunUnit.h(baseMnnRunUnit2))) {
                    String b2 = MnnUtils.b(BaseMnnRunUnit.j(this.f4763a), BaseMnnRunUnit.g(this.f4763a));
                    ckf.f(b2, "getModelCacheDirectory(taskName, cachedTaskCid)");
                    linkedHashSet.add(b2);
                }
            }
            String i = BaseMnnRunUnit.i(this.f4763a);
            agh.r("AutoDetect", i, "clearCacheFiles: cachedTaskCid=" + BaseMnnRunUnit.g(this.f4763a) + ", latestTaskCid=" + BaseMnnRunUnit.h(this.f4763a));
            if (linkedHashSet.size() > 0) {
                com.taobao.android.mnncv.a.e().c(BaseMnnRunUnit.j(this.f4763a), linkedHashSet);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements MNNCVExecutor.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.mnncv.MNNCVExecutor.h
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseMnnRunUnit<INPUT, OUTPUT> f4764a;
        public final /* synthetic */ String b;

        public d(BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit, String str) {
            this.f4764a = baseMnnRunUnit;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BaseMnnRunUnit.f(this.f4764a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements MNNCVExecutor.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f4765a;
        public final /* synthetic */ BaseMnnRunUnit<INPUT, OUTPUT> b;
        public final /* synthetic */ utm c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ BaseMnnRunUnit<INPUT, OUTPUT> f4766a;
            public final /* synthetic */ MRTRuntimeException b;
            public final /* synthetic */ utm c;
            public final /* synthetic */ long d;

            public a(BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit, MRTRuntimeException mRTRuntimeException, utm utmVar, long j) {
                this.f4766a = baseMnnRunUnit;
                this.b = mRTRuntimeException;
                this.c = utmVar;
                this.d = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    BaseMnnRunUnit.l(this.f4766a, this.b, this.c, this.d);
                }
            }
        }

        public e(long j, BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit, utm utmVar) {
            this.f4765a = j;
            this.b = baseMnnRunUnit;
            this.c = utmVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.g
        public final void onResult(MRTRuntimeException mRTRuntimeException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b72e6cf", new Object[]{this, mRTRuntimeException});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f4765a;
            BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit = this.b;
            BaseMnnRunUnit.m(baseMnnRunUnit, new a(baseMnnRunUnit, mRTRuntimeException, this.c, currentTimeMillis));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements dph {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MNNCVExecutor f4767a;
        public final /* synthetic */ BaseMnnRunUnit<INPUT, OUTPUT> b;

        public f(MNNCVExecutor mNNCVExecutor, BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit) {
            this.f4767a = mNNCVExecutor;
            this.b = baseMnnRunUnit;
        }

        @Override // tb.dph
        public final void onCompletion(String str, MRTRuntimeException mRTRuntimeException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2de5f2e6", new Object[]{this, str, mRTRuntimeException});
                return;
            }
            if (str != null) {
                BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit = this.b;
                agh.r("AutoDetect", BaseMnnRunUnit.i(baseMnnRunUnit), ckf.p("preload success, ", str));
                mzu.n(p73.f25916a, "MnnPreload", 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.j(baseMnnRunUnit), BaseMnnRunUnit.KEY_TASK_CID, baseMnnRunUnit.v(), "result", "success");
            }
            if (mRTRuntimeException != null) {
                BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit2 = this.b;
                String i = BaseMnnRunUnit.i(baseMnnRunUnit2);
                agh.r("AutoDetect", i, "preload failed " + BaseMnnRunUnit.j(baseMnnRunUnit2) + ", errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + ((Object) mRTRuntimeException.getMessage()));
                mzu.n(p73.f25916a, "MnnPreload", 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.j(baseMnnRunUnit2), BaseMnnRunUnit.KEY_TASK_CID, baseMnnRunUnit2.v(), "result", "fail", "errorCode", String.valueOf(mRTRuntimeException.errorCode), "errorMsg", mRTRuntimeException.getMessage());
            }
            this.f4767a.e();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseMnnRunUnit<INPUT, OUTPUT> f4768a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements MNNCVExecutor.i {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ BaseMnnRunUnit<INPUT, OUTPUT> f4769a;

            public a(BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit) {
                this.f4769a = baseMnnRunUnit;
            }

            @Override // com.taobao.android.mnncv.MNNCVExecutor.i
            public final void onError(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                    return;
                }
                agh.r("AutoDetect", BaseMnnRunUnit.i(this.f4769a), ckf.p("Save Error : ", str));
                mzu.n(p73.f25916a, "saveModelError", 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.j(this.f4769a), BaseMnnRunUnit.KEY_TASK_CID, BaseMnnRunUnit.h(this.f4769a));
                com.taobao.android.mnncv.a.e().c(BaseMnnRunUnit.j(this.f4769a), new HashSet(3));
            }
        }

        public g(BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit) {
            this.f4768a = baseMnnRunUnit;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                agh.r("AutoDetect", BaseMnnRunUnit.i(this.f4768a), ckf.p("justSaveLocalAlgoModel: latestTaskCid: ", BaseMnnRunUnit.h(this.f4768a)));
                boolean i = com.taobao.android.mnncv.a.e().i(BaseMnnRunUnit.j(this.f4768a), new a(this.f4768a));
                MRTTaskDescription g = com.taobao.android.mnncv.a.e().g(BaseMnnRunUnit.j(this.f4768a));
                String i2 = BaseMnnRunUnit.i(this.f4768a);
                agh.r("AutoDetect", i2, "justSaveLocalAlgoModel " + BaseMnnRunUnit.j(this.f4768a) + ", result: " + i + ", tmpDescription=" + ((Object) g.name));
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseMnnRunUnit<INPUT, OUTPUT> f4770a;

        public h(BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit) {
            this.f4770a = baseMnnRunUnit;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BaseMnnRunUnit.e(this.f4770a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j implements MNNCVExecutor.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseMnnRunUnit<INPUT, OUTPUT> f4772a;
        public final /* synthetic */ MNNCVExecutor b;

        public j(BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit, MNNCVExecutor mNNCVExecutor) {
            this.f4772a = baseMnnRunUnit;
            this.b = mNNCVExecutor;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.g
        public final void onResult(MRTRuntimeException mRTRuntimeException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b72e6cf", new Object[]{this, mRTRuntimeException});
                return;
            }
            if (mRTRuntimeException == null) {
                BaseMnnRunUnit.n(this.f4772a, true);
            }
            this.b.e();
        }
    }

    static {
        t2o.a(481296996);
        t2o.a(481297014);
    }

    public BaseMnnRunUnit(String str) {
        ckf.g(str, KEY_TASK_NAME);
        this.f4761a = str;
        this.b = "BaseMnnRunUnit_";
        String p = ckf.p("BaseMnnRunUnit_", str);
        this.b = p;
        agh.r("AutoDetect", p, "Starting");
        jzu.m(str, MONITOR_POINT_PREPARE_SUCCESS, xz3.e(HiAnalyticsConstant.BI_KEY_COST_TIME), yz3.l(KEY_TASK_CID, "bucketId"));
        jzu.m(str, MONITOR_POINT_PREPARE_FAIL, xz3.e(HiAnalyticsConstant.BI_KEY_COST_TIME), yz3.l(KEY_TASK_CID, "errorCode", "errorMsg", "bucketId"));
    }

    public static final /* synthetic */ void d(BaseMnnRunUnit baseMnnRunUnit, utm utmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95685fd4", new Object[]{baseMnnRunUnit, utmVar, str});
        } else {
            baseMnnRunUnit.s(utmVar, str);
        }
    }

    public static final /* synthetic */ void e(BaseMnnRunUnit baseMnnRunUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("443f3378", new Object[]{baseMnnRunUnit});
        } else {
            baseMnnRunUnit.t();
        }
    }

    public static final /* synthetic */ void f(BaseMnnRunUnit baseMnnRunUnit, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ed65af", new Object[]{baseMnnRunUnit, str});
        } else {
            baseMnnRunUnit.u(str);
        }
    }

    public static final /* synthetic */ String g(BaseMnnRunUnit baseMnnRunUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2e71f7", new Object[]{baseMnnRunUnit});
        }
        return baseMnnRunUnit.g;
    }

    public static final /* synthetic */ String h(BaseMnnRunUnit baseMnnRunUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11a52d32", new Object[]{baseMnnRunUnit});
        }
        return baseMnnRunUnit.f;
    }

    public static final /* synthetic */ String i(BaseMnnRunUnit baseMnnRunUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b54727da", new Object[]{baseMnnRunUnit});
        }
        return baseMnnRunUnit.b;
    }

    public static final /* synthetic */ String j(BaseMnnRunUnit baseMnnRunUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c14e339c", new Object[]{baseMnnRunUnit});
        }
        return baseMnnRunUnit.f4761a;
    }

    public static final /* synthetic */ boolean k(BaseMnnRunUnit baseMnnRunUnit, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8998b256", new Object[]{baseMnnRunUnit, str})).booleanValue();
        }
        return baseMnnRunUnit.z(str);
    }

    public static final /* synthetic */ void l(BaseMnnRunUnit baseMnnRunUnit, MRTRuntimeException mRTRuntimeException, utm utmVar, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828e69fb", new Object[]{baseMnnRunUnit, mRTRuntimeException, utmVar, new Long(j2)});
        } else {
            baseMnnRunUnit.C(mRTRuntimeException, utmVar, j2);
        }
    }

    public static final /* synthetic */ void m(BaseMnnRunUnit baseMnnRunUnit, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7742dae", new Object[]{baseMnnRunUnit, runnable});
        } else {
            baseMnnRunUnit.F(runnable);
        }
    }

    public static final /* synthetic */ void n(BaseMnnRunUnit baseMnnRunUnit, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c53c0b", new Object[]{baseMnnRunUnit, new Boolean(z)});
        } else {
            baseMnnRunUnit.n = z;
        }
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        return ckf.b(Looper.getMainLooper(), Looper.myLooper());
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b1c610", new Object[]{this});
        } else if (A()) {
            t();
        } else {
            this.m.post(new h(this));
        }
    }

    public final void F(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364bd9cb", new Object[]{this, runnable});
        } else if (this.o) {
            q7m.b(runnable);
        } else {
            this.m.post(runnable);
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41df3c70", new Object[]{this});
        } else if (ckf.b("plt_autodetect", this.f4761a) && lg4.b1()) {
            agh.r("AutoDetect", this.b, "saveLocalAlgoModelWithCreateNewExecutor");
            MNNCVExecutor mNNCVExecutor = new MNNCVExecutor(this.f4761a);
            mNNCVExecutor.g(new j(this, mNNCVExecutor));
        }
    }

    public final void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7a7278", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.e = str;
    }

    public final void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ef5988", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.d = str;
    }

    @Override // tb.xuc
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60d430b", new Object[]{this, str});
            return;
        }
        ckf.g(str, "activityHashCode");
        agh.h(this.b, ckf.p("destroy ", str));
        if (this.h) {
            H(Companion.AlgoAction.DESTROY_ACTION, new c());
        }
        F(new d(this, str));
    }

    @Override // tb.xuc
    public void b(INPUT input, Object obj, wuc<OUTPUT> wucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bf65e", new Object[]{this, input, obj, wucVar});
            return;
        }
        ckf.g(input, "input");
        ckf.g(wucVar, "callback");
    }

    @Override // tb.xuc
    public void c(utm utmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b97e5b96", new Object[]{this, utmVar, str});
            return;
        }
        ckf.g(utmVar, "callback");
        ckf.g(str, "activityHashCode");
        this.o = lg4.E();
        F(new a(this, utmVar, str));
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d21f4d0", new Object[]{this});
        } else if (lg4.Z() && ckf.b("plt_autodetect", this.f4761a)) {
            eqh.b().a(new b(this), 1000);
        }
    }

    public final void r(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d36e8ea", new Object[]{this, new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Double.valueOf(j2));
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put(KEY_TASK_CID, this.d);
        hashMap2.put("bucketId", this.e);
        jzu.d(this.f4761a, MONITOR_POINT_PREPARE_SUCCESS, hashMap, hashMap2);
    }

    public final void s(utm utmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433950cb", new Object[]{this, utmVar, str});
            return;
        }
        this.j.add(str);
        String str2 = this.b;
        agh.r("AutoDetect", str2, "build count = " + this.j.size() + " prepareSuccess " + this.h + " status = " + this.k);
        MNNCVExecutor o = o();
        if (this.h) {
            agh.r("AutoDetect", this.b, "doBuild onPrepareSuccess");
            utmVar.onPrepareSuccess();
            return;
        }
        BaseUnitStatus baseUnitStatus = this.k;
        BaseUnitStatus baseUnitStatus2 = BaseUnitStatus.Preparing;
        if (baseUnitStatus == baseUnitStatus2) {
            agh.r("AutoDetect", this.b, ckf.p("doBuild Preparing ", Boolean.valueOf(this.h)));
            this.l.add(new WeakReference<>(utmVar));
            return;
        }
        agh.r("AutoDetect", this.b, "doBuild prepareWithCallback");
        this.k = baseUnitStatus2;
        o.g(new e(System.currentTimeMillis(), this, utmVar));
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be50ac85", new Object[]{this});
            return;
        }
        try {
            agh.r("AutoDetect", this.b, "preload ");
            MNNCVExecutor mNNCVExecutor = new MNNCVExecutor(this.f4761a);
            mNNCVExecutor.f(new f(mNNCVExecutor, this));
        } catch (Exception unused) {
        }
    }

    public final String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd627216", new Object[]{this});
        }
        return this.d;
    }

    public void w(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d6461", new Object[]{this, hashMap});
        } else {
            ckf.g(hashMap, "args");
        }
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7168f90a", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50becdb", new Object[]{this});
        } else if (ckf.b("plt_autodetect", this.f4761a) && lg4.b1()) {
            this.n = false;
            VExecutors.defaultSharedThreadPool().execute(new g(this));
        }
    }

    public final void H(Companion.AlgoAction algoAction, MNNCVExecutor.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8ffc07", new Object[]{this, algoAction, hVar});
            return;
        }
        agh.r("AutoDetect", this.b, ckf.p("sendAction ", algoAction));
        Vector vector = new Vector(2);
        vector.add(algoAction.getAction());
        HashMap<String, Object> hashMap = new HashMap<>(5);
        hashMap.put(com.etao.feimagesearch.mnn.utils.a.KEY_ACTION, vector);
        if (lg4.o0() && !TextUtils.isEmpty(this.d) && ckf.b(this.f4761a, "plt_autodetect")) {
            hashMap.put(com.etao.feimagesearch.mnn.utils.a.KEY_CID, PltMnnBucketManager.Companion.a().b(this.f4761a, this.d));
        }
        w(hashMap);
        MNNCVExecutor mNNCVExecutor = this.c;
        if (mNNCVExecutor != null) {
            mNNCVExecutor.j(hashMap, new k(hVar, this, algoAction));
        }
    }

    public final void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1604f885", new Object[]{this, str});
        } else if (caa.q() && ckf.b("plt_autodetect", this.f4761a)) {
            i0u.f(caa.c(), str, 0);
        }
    }

    public final void q(String str, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6bea7c", new Object[]{this, str, str2, new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Double.valueOf(j2));
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put(KEY_TASK_CID, this.d);
        hashMap2.put("errorCode", str);
        hashMap2.put("errorMsg", str2);
        hashMap2.put("bucketId", this.e);
        jzu.d(this.f4761a, MONITOR_POINT_PREPARE_FAIL, hashMap, hashMap2);
    }

    public final void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b156c2", new Object[]{this, str});
            return;
        }
        this.j.remove(str);
        int size = this.j.size();
        String str2 = this.b;
        agh.r("AutoDetect", str2, "doRealDestroy: prepareSuccess = " + this.h + ", counter = " + size + ' ' + str);
        if (size <= 0 || !lg4.G0()) {
            this.l.clear();
            this.k = BaseUnitStatus.Destroying;
            MNNCVExecutor mNNCVExecutor = this.c;
            if (mNNCVExecutor != null) {
                mNNCVExecutor.e();
            }
            this.c = null;
            this.k = BaseUnitStatus.EMPTY;
            this.h = false;
            this.i = false;
            if (this.n) {
                B();
            }
            mzu.n(p73.f25916a, "destroyExecutor", 19999, KEY_TASK_NAME, this.f4761a);
            agh.r("AutoDetect", this.b, "destroyExecutor");
            p();
        }
    }

    public final void C(MRTRuntimeException mRTRuntimeException, utm utmVar, long j2) {
        xhv xhvVar;
        utm utmVar2;
        xhv xhvVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602f9c78", new Object[]{this, mRTRuntimeException, utmVar, new Long(j2)});
            return;
        }
        agh.r("AutoDetect", this.b, ckf.p("notifyListeners exception=", mRTRuntimeException));
        if (mRTRuntimeException == null) {
            xhvVar = null;
        } else {
            agh.r("AutoDetect", this.b, "onBuildResult: " + mRTRuntimeException.errorCode + ' ' + ((Object) mRTRuntimeException.getMessage()));
            this.k = BaseUnitStatus.ExecutorCreated;
            this.h = false;
            String valueOf = String.valueOf(mRTRuntimeException.errorCode);
            String message = mRTRuntimeException.getMessage();
            if (message == null) {
                message = "";
            }
            q(valueOf, message, j2);
            int i2 = mRTRuntimeException.errorCode;
            String message2 = mRTRuntimeException.getMessage();
            if (message2 == null) {
                message2 = "";
            }
            utmVar.a(i2, message2);
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            agh.r("AutoDetect", this.b, "onBuildResult success");
            if (!TextUtils.isEmpty(v())) {
                PltMnnBucketManager.Companion.a().f(this.f4761a, v());
            }
            r(j2);
            if (this.c == null) {
                agh.r("AutoDetect", this.b, "mnncvExecutor == null");
                return;
            }
            this.k = BaseUnitStatus.PrepareSuccess;
            this.h = true;
            utmVar.onPrepareSuccess();
            H(Companion.AlgoAction.INIT_ACTION, null);
        }
        if (!this.l.isEmpty()) {
            Iterator<WeakReference<utm>> it = this.l.iterator();
            ckf.f(it, "prepareResultListenerList.iterator()");
            agh.r("AutoDetect", this.b, "notify prepareResultListener");
            while (it.hasNext()) {
                WeakReference<utm> next = it.next();
                if (!(next == null || (utmVar2 = next.get()) == null)) {
                    if (mRTRuntimeException == null) {
                        xhvVar2 = null;
                    } else {
                        int i3 = mRTRuntimeException.errorCode;
                        String message3 = mRTRuntimeException.getMessage();
                        if (message3 == null) {
                            message3 = "";
                        }
                        utmVar2.a(i3, message3);
                        xhvVar2 = xhv.INSTANCE;
                    }
                    if (xhvVar2 == null) {
                        utmVar2.onPrepareSuccess();
                    }
                }
            }
            this.l.clear();
        }
    }

    public final void E(HashMap<String, Object> hashMap, boolean z, MNNCVExecutor.h hVar) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb68e6b8", new Object[]{this, hashMap, new Boolean(z), hVar});
            return;
        }
        ckf.g(hashMap, "args");
        ckf.g(hVar, "callback");
        if (!this.i) {
            this.i = true;
            mzu.n(p73.f25916a, "algoBeginSendData", 19999, KEY_TASK_NAME, this.f4761a, KEY_TASK_CID, this.d);
        }
        w(hashMap);
        if (z) {
            agh.r("AutoDetect", this.b, "processByMnnExecutor with reset");
            if (!hashMap.containsKey(com.etao.feimagesearch.mnn.utils.a.KEY_ACTION) || !(hashMap.get(com.etao.feimagesearch.mnn.utils.a.KEY_ACTION) instanceof Vector)) {
                Vector vector = new Vector(2);
                vector.add(Companion.AlgoAction.RESET_ACTION.getAction());
                hashMap.put(com.etao.feimagesearch.mnn.utils.a.KEY_ACTION, vector);
            } else {
                try {
                    Object obj = hashMap.get(com.etao.feimagesearch.mnn.utils.a.KEY_ACTION);
                    if (obj != null) {
                        ((Vector) obj).add(Companion.AlgoAction.RESET_ACTION.getAction());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.util.Vector<kotlin.String>");
                    }
                } catch (ClassCastException unused) {
                    Vector vector2 = new Vector(2);
                    vector2.add(Companion.AlgoAction.RESET_ACTION.getAction());
                    hashMap.put(com.etao.feimagesearch.mnn.utils.a.KEY_ACTION, vector2);
                }
            }
        }
        try {
            if (!this.h) {
                hVar.onResult(new MRTRuntimeException(-10003, "not prepared"), null);
                return;
            }
            MNNCVExecutor mNNCVExecutor = this.c;
            if (mNNCVExecutor == null) {
                xhvVar = null;
            } else {
                mNNCVExecutor.j(hashMap, new i(z, hVar, this));
                xhvVar = xhv.INSTANCE;
            }
            if (xhvVar == null) {
                hVar.onResult(new MRTRuntimeException(-10001, "executor is null"), null);
            }
        } catch (Exception unused2) {
            hVar.onResult(new MRTRuntimeException(-10002, "send data failed"), null);
        }
    }

    public final MNNCVExecutor o() {
        String str;
        MNNCVExecutor mNNCVExecutor;
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MNNCVExecutor) ipChange.ipc$dispatch("7168bcee", new Object[]{this});
        }
        MNNCVExecutor mNNCVExecutor2 = this.c;
        if (mNNCVExecutor2 != null) {
            return mNNCVExecutor2;
        }
        this.h = false;
        this.k = BaseUnitStatus.ExecutorCreated;
        String str3 = p73.f25916a;
        mzu.n(str3, "createNewExecutor", 19999, KEY_TASK_NAME, this.f4761a);
        agh.r("AutoDetect", this.b, "createNewExecutor");
        MRTTaskDescription e2 = oqh.d().e(this.f4761a);
        String str4 = "";
        if (e2 == null || (str = e2.cid) == null) {
            str = str4;
        }
        this.f = str;
        if (TextUtils.isEmpty(str) || !y(this.f4761a)) {
            String str5 = this.b;
            agh.r("AutoDetect", str5, "use backup construct " + this.f4761a + ' ' + this.f);
            this.n = lg4.N0();
            MNNCVExecutor mNNCVExecutor3 = new MNNCVExecutor(this.f4761a, lg4.F0());
            J(this.f);
            this.c = mNNCVExecutor3;
            K(ckf.p("旧兜底模式 cid=", this.f));
            return mNNCVExecutor3;
        }
        MRTTaskDescription g2 = com.taobao.android.mnncv.a.e().g(this.f4761a);
        if (!(g2 == null || (str2 = g2.cid) == null)) {
            str4 = str2;
        }
        this.g = str4;
        String str6 = this.b;
        agh.r("AutoDetect", str6, "cachedTask=" + this.g + ", latestTaskCid=" + this.f);
        if (TextUtils.isEmpty(this.g)) {
            this.n = true;
        } else if (!z(this.g)) {
            z = ckf.b(this.f, this.g);
        }
        if (z) {
            String str7 = this.b;
            agh.r("AutoDetect", str7, "use default construction " + this.f4761a + ' ' + this.f);
            mNNCVExecutor = new MNNCVExecutor(this.f4761a);
            J(this.f);
            mzu.n(str3, "noMnnCacheModel", 19999, KEY_TASK_NAME, this.f4761a, KEY_TASK_CID, v());
            this.c = mNNCVExecutor;
            K("使用" + this.f + ", cache=" + this.g);
        } else {
            String str8 = this.b;
            agh.r("AutoDetect", str8, "use cache " + this.f4761a + ' ' + this.g);
            mNNCVExecutor = new MNNCVExecutor(this.f4761a, this.g);
            J(this.g);
            mzu.n(str3, "useMnnCacheModel", 19999, KEY_TASK_NAME, this.f4761a, KEY_TASK_CID, v());
            this.c = mNNCVExecutor;
            K(ckf.p("命中缓存 cid=", this.g));
            G();
        }
        return mNNCVExecutor;
    }

    public final boolean y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0c66d38", new Object[]{this, str})).booleanValue();
        }
        if (str != null && !TextUtils.isEmpty(str) && lg4.H0()) {
            return ckf.b("plt_autodetect", str) || ckf.b("plt_smart_camera", str);
        }
        return false;
    }

    public final boolean z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ecbc603", new Object[]{this, str})).booleanValue();
        }
        String O2 = lg4.O2();
        if (O2 == null) {
            O2 = "";
        }
        return ckf.b("plt_autodetect", this.f4761a) && wsq.O(O2, str, false, 2, null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i implements MNNCVExecutor.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f4771a;
        public final /* synthetic */ MNNCVExecutor.h b;
        public final /* synthetic */ BaseMnnRunUnit<INPUT, OUTPUT> c;

        public i(boolean z, MNNCVExecutor.h hVar, BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit) {
            this.f4771a = z;
            this.b = hVar;
            this.c = baseMnnRunUnit;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.h
        public final void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                return;
            }
            if (this.f4771a) {
                if (mRTRuntimeException != null) {
                    BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit = this.c;
                    mzu.n(p73.f25916a, Companion.AlgoAction.RESET_ACTION.getUtEventName(), 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.j(baseMnnRunUnit), BaseMnnRunUnit.KEY_TASK_CID, baseMnnRunUnit.v(), "result", "fail", "extraInfo", "", "errorCode", String.valueOf(mRTRuntimeException.errorCode), "errorMsg", mRTRuntimeException.getMessage());
                }
                if (map != null) {
                    BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit2 = this.c;
                    mzu.n(p73.f25916a, Companion.AlgoAction.RESET_ACTION.getUtEventName(), 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.j(baseMnnRunUnit2), BaseMnnRunUnit.KEY_TASK_CID, baseMnnRunUnit2.v(), "result", "success", "extraInfo", com.etao.feimagesearch.mnn.utils.a.a(map));
                }
            }
            this.b.onResult(mRTRuntimeException, map);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class k implements MNNCVExecutor.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MNNCVExecutor.h f4773a;
        public final /* synthetic */ BaseMnnRunUnit<INPUT, OUTPUT> b;
        public final /* synthetic */ Companion.AlgoAction c;

        public k(MNNCVExecutor.h hVar, BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit, Companion.AlgoAction algoAction) {
            this.f4773a = hVar;
            this.b = baseMnnRunUnit;
            this.c = algoAction;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.h
        public final void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                return;
            }
            if (mRTRuntimeException != null) {
                BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit = this.b;
                Companion.AlgoAction algoAction = this.c;
                agh.r("AutoDetect", BaseMnnRunUnit.j(baseMnnRunUnit), ckf.p("sendAction exception = ", mRTRuntimeException));
                mzu.n(p73.f25916a, algoAction.getUtEventName(), 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.j(baseMnnRunUnit), BaseMnnRunUnit.KEY_TASK_CID, baseMnnRunUnit.v(), "result", "fail", "extraInfo", "", "errorCode", String.valueOf(mRTRuntimeException.errorCode), "errorMsg", mRTRuntimeException.getMessage(), "curTab", String.valueOf(MNNManager.Companion.a().g()));
            }
            if (map != null) {
                BaseMnnRunUnit<INPUT, OUTPUT> baseMnnRunUnit2 = this.b;
                Companion.AlgoAction algoAction2 = this.c;
                String a2 = com.etao.feimagesearch.mnn.utils.a.a(map);
                if (ckf.b("plt_autodetect", BaseMnnRunUnit.j(baseMnnRunUnit2))) {
                    AutoDetectExtraInfoCache a3 = AutoDetectExtraInfoCache.Companion.a();
                    ckf.f(a2, "extraInfo");
                    a3.d(a2);
                }
                agh.r("AutoDetect", BaseMnnRunUnit.j(baseMnnRunUnit2), ckf.p("sendAction extraInfo = ", a2));
                mzu.n(p73.f25916a, algoAction2.getUtEventName(), 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.j(baseMnnRunUnit2), BaseMnnRunUnit.KEY_TASK_CID, baseMnnRunUnit2.v(), "result", "success", "extraInfo", a2, "curTab", String.valueOf(MNNManager.Companion.a().g()));
            }
            MNNCVExecutor.h hVar = this.f4773a;
            if (hVar != null) {
                hVar.onResult(mRTRuntimeException, map);
            }
        }
    }
}
