package com.tmall.android.dai.internal.config;

import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.ru1;
import tb.t2o;
import tb.vs3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Config implements Serializable {
    @JSONField(name = "ut2201WhiteArg1s")
    public List<String> ut2201WhiteArg1s;
    @JSONField(name = "utArgsWhiteKeys")
    public List<String> utArgsWhiteKeys;
    @JSONField(name = "utDbBlacklist")
    public int[] utDbBlacklist;
    @JSONField(name = "ute")
    public int[] utEventIds;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Model implements Serializable {
        @JSONField(name = "async")
        public boolean async;
        @JSONField(name = "cid")
        public String cid;
        @JSONField(name = "cln")
        public String classmame;
        @JSONField(name = "deviceLevels")
        public List<String> deviceLevels;
        @JSONField(name = "ea1")
        public String extendArg1;
        @JSONField(name = ru1.FEATURE_NAME)
        public String featureName;
        @JSONField(name = "furl")
        public String fileUrl;
        @JSONField(name = "modelConfigSrc")
        public String modelConfigSrc;
        @JSONField(name = "mmd5")
        public String modelFileMd5;
        @JSONField(name = "n")
        public String name;
        @JSONField(name = "oldRes")
        public int oldRes;
        @JSONField(name = "or")
        public List<ModelResource> optionalResource;
        @JSONField(name = "priority")
        public int priority = 0;
        @JSONField(name = Constants.SEND_TYPE_RES)
        public List<ModelResource> res;
        @JSONField(name = "r")
        public ModelResource resource;
        @JSONField(name = "timeout")
        public int timeout;
        @JSONField(name = "triIdForAlias")
        public String triIdForAlias;
        @JSONField(name = "t")
        public List<ModelTrigger> triggers;

        static {
            t2o.a(1034944622);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ModelResource implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "fmd5")
        public String fileMd5;
        @JSONField(name = "furl")
        public String fileUrl;
        @JSONField(name = vs3.FILES_DIR_NAME)
        public Map<String, String> files;
        @JSONField(name = "versions")
        public Map<String, String> versions;

        static {
            t2o.a(1034944623);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return super.toString() + "&fileUrl=" + this.fileUrl + "&fileMd5=" + this.fileMd5 + "&files=" + this.files + "&versions=" + this.versions;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ModelTrigger implements Serializable {
        @JSONField(name = "d")
        public Map<String, Object> data;
        @JSONField(name = "dataCep")
        public String dataCep;
        @JSONField(name = ErrorType.DATA)
        public ModelTriggerMatchRuleForUT dataExtend;
        @JSONField(name = "id")
        public String triId;
        @JSONField(name = "t")
        public String type;

        static {
            t2o.a(1034944624);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ModelTriggerMatchRuleForUT implements Serializable {
        @JSONField(name = "arg1in")
        public List<String> arg1InList;
        @JSONField(name = "arg1nin")
        public List<String> arg1NotInList;
        @JSONField(name = "arg2in")
        public List<String> arg2InList;
        @JSONField(name = "arg3in")
        public List<String> arg3InList;
        @JSONField(name = "argsin")
        public Map<String, List<String>> argsInMap;
        @JSONField(name = "argsnin")
        public Map<String, List<String>> argsNotInMap;
        @JSONField(name = "batch")
        public int batch;
        @JSONField(name = "eid")
        public int eventId;
        @JSONField(name = "owner_id")
        public String ownerId;
        @JSONField(name = "pgin")
        public List<String> pageInList;
        @JSONField(name = "pgnin")
        public List<String> pageNotInList;

        static {
            t2o.a(1034944625);
        }
    }

    static {
        t2o.a(1034944621);
    }
}
