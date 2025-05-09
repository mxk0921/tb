package com.taobao.mrt.task;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPython;
import com.taobao.android.alinnpython.AliNNPythonThreadState;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.util.List;
import java.util.Map;
import tb.kgh;
import tb.pqh;
import tb.qqh;
import tb.t2o;
import tb.xqh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MRTJob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<String, Object>> f11140a;
    public final long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final qqh g;
    public final MRTTaskDescription h;
    public final String i;
    public final List j;
    public boolean k = false;
    public final pqh l;
    public final boolean m;

    static {
        t2o.a(577765421);
    }

    public MRTJob(MRTTaskDescription mRTTaskDescription, qqh qqhVar, String str, List list, boolean z, pqh pqhVar, Map<String, Map<String, Object>> map) {
        this.g = qqhVar;
        this.h = mRTTaskDescription;
        this.i = str;
        this.j = list;
        this.l = pqhVar;
        this.m = z;
        long currentTimeMillis = System.currentTimeMillis();
        this.b = currentTimeMillis;
        this.c = currentTimeMillis;
        this.d = currentTimeMillis;
        this.e = currentTimeMillis;
        this.f = currentTimeMillis;
        this.f11140a = map;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.k = true;
        a(this.g, new MRTRuntimeException(1001, "Job is cancelled"), null);
    }

    public final void c(int i, AliNNPythonThreadState aliNNPythonThreadState) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca8899b", new Object[]{this, new Integer(i), aliNNPythonThreadState});
            return;
        }
        long j = this.e;
        long j2 = this.d;
        long j3 = j - j2;
        long j4 = this.c;
        long j5 = j4 - this.b;
        long j6 = j2 - j4;
        long j7 = this.f - j;
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (j3 > 10000) {
            i3 = 153;
        } else {
            i3 = i;
        }
        MRTTaskDescription mRTTaskDescription = this.h;
        xqh.i(aliNNPythonThreadState, mRTTaskDescription.name, "", mRTTaskDescription.cid, this.i, i3, i2, 1 - i2, j5, j6, j3, j7, this.f11140a);
    }

    public void e(String str, AliNNPython aliNNPython) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a620f7b", new Object[]{this, str, aliNNPython});
        } else if (!TextUtils.isEmpty(str) && aliNNPython != null) {
            try {
                aliNNPython.reloadPackage(str);
            } catch (Exception e) {
                kgh.t("MRTJob", "reloadPackage failed", e);
            }
        }
    }

    public final void a(qqh qqhVar, MRTRuntimeException mRTRuntimeException, Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b8abc6", new Object[]{this, qqhVar, mRTRuntimeException, obj});
            return;
        }
        StringBuilder sb = new StringBuilder("任务 ");
        sb.append(this.h.name);
        sb.append(" 结果:");
        sb.append(mRTRuntimeException != null ? mRTRuntimeException : obj);
        kgh.k("MRTJob", sb.toString());
        if (qqhVar != null) {
            if (mRTRuntimeException != null) {
                i = mRTRuntimeException.errorCode;
            }
            qqhVar.a(i, mRTRuntimeException, obj);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:25|(1:27)|(5:63|28|(1:30)(1:33)|34|35)|(2:37|(13:39|41|(1:43)|44|(2:46|47)(1:48)|61|49|(1:51)|54|56|(1:58)|59|60))|40|41|(0)|44|(0)(0)|61|49|(0)|54|56|(0)|59|60) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x020f, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0210, code lost:
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0218, code lost:
        tb.kgh.t("MRTJob", "execute failed", r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cd A[Catch: Exception -> 0x0118, TryCatch #1 {Exception -> 0x0118, blocks: (B:28:0x0104, B:30:0x0108, B:34:0x011e, B:37:0x012c, B:39:0x0146, B:41:0x019b, B:43:0x01cd, B:46:0x01fb), top: B:63:0x0104 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fb A[Catch: Exception -> 0x0118, TRY_LEAVE, TryCatch #1 {Exception -> 0x0118, blocks: (B:28:0x0104, B:30:0x0108, B:34:0x011e, B:37:0x012c, B:39:0x0146, B:41:0x019b, B:43:0x01cd, B:46:0x01fb), top: B:63:0x0104 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0206 A[Catch: Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:49:0x0202, B:51:0x0206, B:54:0x0214), top: B:61:0x0202 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.taobao.android.alinnpython.AliNNPython r16) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mrt.task.MRTJob.d(com.taobao.android.alinnpython.AliNNPython):void");
    }
}
