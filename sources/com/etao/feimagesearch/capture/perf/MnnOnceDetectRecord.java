package com.etao.feimagesearch.capture.perf;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.qrl;
import tb.t2o;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MnnOnceDetectRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private long costTime;
    private boolean isDetectRegion;
    private long mnnInferTime;
    private long mnnLogicTime;
    private long mnnPostTime;
    private long mnnPreTime;
    private long mnnPreTransTime;
    private long mnnTime;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296691);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        @JvmStatic
        public final MnnOnceDetectRecord a(long j, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MnnOnceDetectRecord) ipChange.ipc$dispatch("842af5d", new Object[]{this, new Long(j), str, new Boolean(z)});
            }
            MnnOnceDetectRecord mnnOnceDetectRecord = new MnnOnceDetectRecord(j, 0L, 0L, 0L, 0L, 0L, 0L, z, 126, null);
            if (str != null && !TextUtils.isEmpty(str)) {
                for (String str2 : wsq.z0(str, new String[]{"|"}, false, 0, 6, null)) {
                    List z0 = wsq.z0(str2, new String[]{":"}, false, 0, 6, null);
                    if (z0.size() == 2) {
                        String str3 = (String) z0.get(0);
                        long d = qrl.d((String) z0.get(1), 0.0f) * 1000;
                        switch (str3.hashCode()) {
                            case -2062547186:
                                if (str3.equals("logic_time")) {
                                    mnnOnceDetectRecord.setMnnLogicTime(d);
                                    break;
                                } else {
                                    continue;
                                }
                            case -1294694679:
                                if (str3.equals("pre_time")) {
                                    mnnOnceDetectRecord.setMnnPreTime(d);
                                    break;
                                } else {
                                    continue;
                                }
                            case -233972706:
                                if (str3.equals("infer_time")) {
                                    mnnOnceDetectRecord.setMnnInferTime(d);
                                    break;
                                } else {
                                    continue;
                                }
                            case -207357399:
                                if (str3.equals("const_time")) {
                                    mnnOnceDetectRecord.setMnnPreTransTime(d);
                                    break;
                                } else {
                                    continue;
                                }
                            case 3560141:
                                if (str3.equals("time")) {
                                    mnnOnceDetectRecord.setMnnTime(d);
                                    break;
                                } else {
                                    continue;
                                }
                            case 2002966284:
                                if (str3.equals("post_time")) {
                                    mnnOnceDetectRecord.setMnnPostTime(d);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
            }
            return mnnOnceDetectRecord;
        }
    }

    static {
        t2o.a(481296690);
    }

    public MnnOnceDetectRecord(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        this.costTime = j;
        this.mnnTime = j2;
        this.mnnPreTime = j3;
        this.mnnInferTime = j4;
        this.mnnLogicTime = j5;
        this.mnnPostTime = j6;
        this.mnnPreTransTime = j7;
        this.isDetectRegion = z;
    }

    @JvmStatic
    public static final MnnOnceDetectRecord parse(long j, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MnnOnceDetectRecord) ipChange.ipc$dispatch("842af5d", new Object[]{new Long(j), str, new Boolean(z)});
        }
        return Companion.a(j, str, z);
    }

    public final long getCostTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dc5322b", new Object[]{this})).longValue();
        }
        return this.costTime;
    }

    public final long getMnnInferTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0c268bf", new Object[]{this})).longValue();
        }
        return this.mnnInferTime;
    }

    public final long getMnnLogicTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a0517cf", new Object[]{this})).longValue();
        }
        return this.mnnLogicTime;
    }

    public final long getMnnPostTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b0ad6df", new Object[]{this})).longValue();
        }
        return this.mnnPostTime;
    }

    public final long getMnnPreTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3bca9454", new Object[]{this})).longValue();
        }
        return this.mnnPreTime;
    }

    public final long getMnnPreTransTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc374384", new Object[]{this})).longValue();
        }
        return this.mnnPreTransTime;
    }

    public final long getMnnTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7422bd9f", new Object[]{this})).longValue();
        }
        return this.mnnTime;
    }

    public final boolean isDetectRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e1421cc", new Object[]{this})).booleanValue();
        }
        return this.isDetectRegion;
    }

    public final void setCostTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb7f1e1", new Object[]{this, new Long(j)});
        } else {
            this.costTime = j;
        }
    }

    public final void setDetectRegion(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400c71d4", new Object[]{this, new Boolean(z)});
        } else {
            this.isDetectRegion = z;
        }
    }

    public final void setMnnInferTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32133cd", new Object[]{this, new Long(j)});
        } else {
            this.mnnInferTime = j;
        }
    }

    public final void setMnnLogicTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23466bd", new Object[]{this, new Long(j)});
        } else {
            this.mnnLogicTime = j;
        }
    }

    public final void setMnnPostTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4d1245", new Object[]{this, new Long(j)});
        } else {
            this.mnnPostTime = j;
        }
    }

    public final void setMnnPreTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745f07d8", new Object[]{this, new Long(j)});
        } else {
            this.mnnPreTime = j;
        }
    }

    public final void setMnnPreTransTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2504d440", new Object[]{this, new Long(j)});
        } else {
            this.mnnPreTransTime = j;
        }
    }

    public final void setMnnTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("467e6985", new Object[]{this, new Long(j)});
        } else {
            this.mnnTime = j;
        }
    }

    public /* synthetic */ MnnOnceDetectRecord(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, int i, a07 a07Var) {
        this(j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4, (i & 16) != 0 ? 0L : j5, (i & 32) != 0 ? 0L : j6, (i & 64) != 0 ? 0L : j7, (i & 128) != 0 ? false : z);
    }
}
