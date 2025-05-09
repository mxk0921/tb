package com.etao.feimagesearch.mnn.featureextract;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import tb.a07;
import tb.agh;
import tb.ckf;
import tb.njg;
import tb.t2o;
import tb.wuc;
import tb.y39;
import tb.z39;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImgFeatureExtractUnit extends BaseMnnRunUnit<y39, z39> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FeatureExtract";
    public static final String TASK_NAME = "plt_mobile_rongzai";
    public static final a Companion = new a(null);
    public static final njg<ImgFeatureExtractUnit> p = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, ImgFeatureExtractUnit$Companion$instance$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297056);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final ImgFeatureExtractUnit a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImgFeatureExtractUnit) ipChange.ipc$dispatch("76f6c104", new Object[]{this});
            }
            return (ImgFeatureExtractUnit) ImgFeatureExtractUnit.L().getValue();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements MNNCVExecutor.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;
        public final /* synthetic */ wuc<z39> c;

        public b(long j, wuc<z39> wucVar) {
            this.b = j;
            this.c = wucVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.h
        public final void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                return;
            }
            if (mRTRuntimeException != null) {
                ImgFeatureExtractUnit imgFeatureExtractUnit = ImgFeatureExtractUnit.this;
                long j = this.b;
                wuc<z39> wucVar = this.c;
                agh.h(ImgFeatureExtractUnit.TAG, "----errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + ((Object) mRTRuntimeException.getMessage()));
                ImgFeatureExtractUnit.N(imgFeatureExtractUnit, "errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + ((Object) mRTRuntimeException.getMessage()), SystemClock.elapsedRealtime() - j, wucVar, -2);
            }
            this.c.onResult(z39.Companion.b(ImgFeatureExtractUnit.TASK_NAME, ImgFeatureExtractUnit.M(ImgFeatureExtractUnit.this), Long.valueOf(SystemClock.elapsedRealtime() - this.b), map));
        }
    }

    static {
        t2o.a(481297055);
    }

    public /* synthetic */ ImgFeatureExtractUnit(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ njg L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("59beb729", new Object[0]);
        }
        return p;
    }

    public static final /* synthetic */ String M(ImgFeatureExtractUnit imgFeatureExtractUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2612a28", new Object[]{imgFeatureExtractUnit});
        }
        return imgFeatureExtractUnit.v();
    }

    public static final /* synthetic */ void N(ImgFeatureExtractUnit imgFeatureExtractUnit, String str, long j, wuc wucVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c829a9", new Object[]{imgFeatureExtractUnit, str, new Long(j), wucVar, new Integer(i)});
        } else {
            imgFeatureExtractUnit.O(str, j, wucVar, i);
        }
    }

    public static /* synthetic */ Object ipc$super(ImgFeatureExtractUnit imgFeatureExtractUnit, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/mnn/featureextract/ImgFeatureExtractUnit");
    }

    public final void O(String str, long j, wuc<z39> wucVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192d7183", new Object[]{this, str, new Long(j), wucVar, new Integer(i)});
        } else {
            wucVar.onResult(z39.Companion.a(TASK_NAME, v(), str, Long.valueOf(j), i));
        }
    }

    public ImgFeatureExtractUnit() {
        super(TASK_NAME);
    }

    /* renamed from: P */
    public void b(y39 y39Var, Object obj, wuc<z39> wucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b83b5213", new Object[]{this, y39Var, obj, wucVar});
            return;
        }
        ckf.g(y39Var, "input");
        ckf.g(wucVar, "callback");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap<String, Object> g = com.etao.feimagesearch.mnn.utils.a.g(y39Var.a());
        if (g == null) {
            O("cannot find format of bitmap", SystemClock.elapsedRealtime() - elapsedRealtime, wucVar, -3);
        } else {
            E(g, false, new b(elapsedRealtime, wucVar));
        }
    }
}
