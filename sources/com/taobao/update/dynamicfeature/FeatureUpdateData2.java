package com.taobao.update.dynamicfeature;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.FeatureUpdateData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FeatureUpdateData2 implements Serializable {
    public String appDeployVersion;
    public String baseVersion;
    public List<UpdateFeatureInfo> updateFeatures = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class UpdateFeatureInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String baseVersion;
        public boolean beta;
        public boolean deployed;
        public String featureUpdateVersion;
        public List<FeatureUpdateData.FeatureInfo> features = new ArrayList();
        public String httpsUrl;
        public String md5;
        public boolean rollback;
        public long size;
        public int updateStrategy;
        public String url;

        static {
            t2o.a(951058441);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UpdateFeatureInfo updateFeatureInfo = (UpdateFeatureInfo) obj;
            if (this.baseVersion == updateFeatureInfo.baseVersion && this.deployed == updateFeatureInfo.deployed && this.rollback == updateFeatureInfo.rollback && this.size == updateFeatureInfo.size && this.beta == updateFeatureInfo.beta && this.updateStrategy == updateFeatureInfo.updateStrategy && this.featureUpdateVersion.equals(updateFeatureInfo.featureUpdateVersion) && this.httpsUrl.equals(updateFeatureInfo.httpsUrl) && this.md5.equals(updateFeatureInfo.md5) && this.features.equals(updateFeatureInfo.features) && this.url.equals(updateFeatureInfo.url)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return Objects.hash(this.featureUpdateVersion, this.baseVersion, Boolean.valueOf(this.deployed), this.httpsUrl, this.md5, Boolean.valueOf(this.rollback), Long.valueOf(this.size), Boolean.valueOf(this.beta), this.features, Integer.valueOf(this.updateStrategy), this.url);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "UpdateFeatureInfo{featureUpdateVersion='" + this.featureUpdateVersion + "', baseVersion='" + this.baseVersion + "', deployed=" + this.deployed + ", httpsUrl='" + this.httpsUrl + "', md5='" + this.md5 + "', rollback=" + this.rollback + ", size=" + this.size + ", beta=" + this.beta + ", features=" + this.features + ", updateStrategy=" + this.updateStrategy + ", url='" + this.url + "'}";
        }
    }

    static {
        t2o.a(951058440);
    }
}
