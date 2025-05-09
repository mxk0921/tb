package com.taobao.tinct.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ABChangeInfo extends BaseChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "bid")
    public String bucketId;
    @JSONField(name = "eid")
    public String experimentId;
    @JSONField(name = MspDBHelper.BizEntry.COLUMN_NAME_PID)
    public String publishId;

    public ABChangeInfo() {
        this(null, null, null);
    }

    public static ABChangeInfo builder(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABChangeInfo) ipChange.ipc$dispatch("32bc6a94", new Object[]{str, str2, str3});
        }
        return new ABChangeInfo(str, str2, str3);
    }

    public static /* synthetic */ Object ipc$super(ABChangeInfo aBChangeInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tinct/model/ABChangeInfo");
    }

    public String getBucketId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c33edfbe", new Object[]{this});
        }
        return this.bucketId;
    }

    public String getExperimentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edc7734b", new Object[]{this});
        }
        return this.experimentId;
    }

    public String getPublishId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c260ba5", new Object[]{this});
        }
        return this.publishId;
    }

    @Override // com.taobao.tinct.model.BaseChangeInfo
    public String getTinctTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this});
        }
        String str = this.experimentId;
        String str2 = this.bucketId;
        return "ab|" + str + "|" + str2;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.experimentId;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.bucketId;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public ABChangeInfo setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABChangeInfo) ipChange.ipc$dispatch("a5142e21", new Object[]{this, str});
        }
        this.bizName = str;
        return this;
    }

    public ABChangeInfo setBucketId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABChangeInfo) ipChange.ipc$dispatch("22501e0c", new Object[]{this, str});
        }
        this.bucketId = str;
        return this;
    }

    public ABChangeInfo setExperimentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABChangeInfo) ipChange.ipc$dispatch("7bf3c89f", new Object[]{this, str});
        }
        this.experimentId = str;
        return this;
    }

    public ABChangeInfo setPublishId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABChangeInfo) ipChange.ipc$dispatch("a54f3ed", new Object[]{this, str});
        }
        this.publishId = str;
        return this;
    }

    private ABChangeInfo(String str, String str2, String str3) {
        super(ChangeType.AB);
        this.experimentId = str;
        this.bucketId = str2;
        this.publishId = str3;
    }
}
