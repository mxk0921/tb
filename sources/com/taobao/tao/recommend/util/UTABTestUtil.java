package com.taobao.tao.recommend.util;

import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Vector;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class UTABTestUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Vector<ExperimentInfo> f12640a = new Vector<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class ExperimentInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String experimentBucketId;
        private String experimentId;
        private String experimentReleaseId;

        static {
            t2o.a(729809623);
        }

        public ExperimentInfo(String str, String str2, String str3) {
            this.experimentId = str;
            this.experimentReleaseId = str2;
            this.experimentBucketId = str3;
        }

        public boolean checkEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("18f5ff30", new Object[]{this})).booleanValue();
            }
            if (TextUtils.isEmpty(this.experimentId) || TextUtils.isEmpty(this.experimentReleaseId) || TextUtils.isEmpty(this.experimentBucketId)) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (obj != null && (obj instanceof ExperimentInfo)) {
                ExperimentInfo experimentInfo = (ExperimentInfo) obj;
                if (TextUtils.equals(this.experimentId, experimentInfo.getExperimentId()) && TextUtils.equals(this.experimentReleaseId, experimentInfo.getExperimentReleaseId()) && TextUtils.equals(this.experimentBucketId, experimentInfo.getExperimentBucketId())) {
                    return true;
                }
            }
            return false;
        }

        public String getExperimentBucketId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13499c41", new Object[]{this});
            }
            return this.experimentBucketId;
        }

        public String getExperimentId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("edc7734b", new Object[]{this});
            }
            return this.experimentId;
        }

        public String getExperimentReleaseId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2df17d8a", new Object[]{this});
            }
            return this.experimentReleaseId;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return (this.experimentId + this.experimentReleaseId + this.experimentBucketId).hashCode();
        }
    }

    static {
        t2o.a(729809622);
    }

    public static boolean a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d10c54", new Object[]{str, str2, str3, new Boolean(z)})).booleanValue();
        }
        Variation c = c(str, str2, str3);
        if (c == null) {
            return z;
        }
        return c.getValueAsBoolean(z);
    }

    public static int b(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d786b539", new Object[]{str, str2, str3, new Integer(i)})).intValue();
        }
        Variation c = c(str, str2, str3);
        if (c == null) {
            return i;
        }
        return c.getValueAsInt(i);
    }

    public static Variation c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Variation) ipChange.ipc$dispatch("872a536d", new Object[]{str, str2, str3});
        }
        VariationSet activate = UTABTest.activate(str, str2);
        if (activate == null) {
            return null;
        }
        d(activate);
        return activate.getVariation(str3);
    }

    public static void d(VariationSet variationSet) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84127f28", new Object[]{variationSet});
        } else if (variationSet != null) {
            String str3 = null;
            if (variationSet.getExperimentId() == 0) {
                str = null;
            } else {
                str = String.valueOf(variationSet.getExperimentId());
            }
            if (variationSet.getExperimentReleaseId() == 0) {
                str2 = null;
            } else {
                str2 = String.valueOf(variationSet.getExperimentReleaseId());
            }
            if (variationSet.getExperimentBucketId() != 0) {
                str3 = String.valueOf(variationSet.getExperimentBucketId());
            }
            ExperimentInfo experimentInfo = new ExperimentInfo(str, str2, str3);
            if (!experimentInfo.checkEmpty()) {
                Vector<ExperimentInfo> vector = f12640a;
                if (!vector.contains(experimentInfo)) {
                    vector.add(experimentInfo);
                }
            }
        }
    }
}
