package com.taobao.android.ugc.uploader;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;
import tb.z6e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UploaderTask implements z6e, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bizType;
    public String filePath;
    public String fileType;
    public Map<String, String> metaInfo = new HashMap();

    static {
        t2o.a(758120530);
    }

    @Override // tb.z6e
    public String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.bizType;
    }

    @Override // tb.z6e
    public String getFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
        }
        return this.filePath;
    }

    @Override // tb.z6e
    public String getFileType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this});
        }
        return this.fileType;
    }

    @Override // tb.z6e
    public Map<String, String> getMetaInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this});
        }
        return this.metaInfo;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UploaderTask{bizType='" + this.bizType + "', filePath='" + this.filePath + "', fileType='" + this.fileType + "', metaInfo=" + this.metaInfo + '}';
    }
}
