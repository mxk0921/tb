package com.alibaba.security.realidentity.biz.start.model;

import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.biz.start.StartHttpResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StepItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String jsonAssist;
    public List<StartHttpResponse.Property> properties;
    public StepType stepType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class JsonAssist implements Serializable {
        public String bioColorfulConf;
        public List<Integer> bioStepsEx;
        public String livenessConfig;
        public boolean needActionImage = true;
        public boolean needFailVideo;
        public boolean needGaze;
        public boolean needOriginalImage;
        public boolean needSuccessVideo;
        public boolean needUserConfirm;
        public boolean onlyGaze;
        public int retryCount;
        public boolean showNav;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class StepTypeBean implements Serializable {
        public String code;
        public String desc;
        public String name;
    }

    public JsonAssist getJsonAssistBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonAssist) ipChange.ipc$dispatch("58dc408d", new Object[]{this});
        }
        return (JsonAssist) b.b(this.jsonAssist, JsonAssist.class);
    }
}
