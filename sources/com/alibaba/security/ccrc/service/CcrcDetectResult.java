package com.alibaba.security.ccrc.service;

import com.alibaba.security.ccrc.model.Label;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CcrcDetectResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> algoResults;
    public String dataID;
    public String errorMsg;
    public boolean isRisk;
    public final List<Label> labels;
    public String sampleID;
    public boolean success;

    public CcrcDetectResult(String str, String str2, boolean z, boolean z2, String str3, List<Label> list, Map<String, Object> map) {
        this.sampleID = str;
        this.dataID = str2;
        this.isRisk = z;
        this.success = z2;
        this.errorMsg = str3;
        this.labels = list;
        this.algoResults = map;
    }

    public Map<String, Object> getAlgoResults() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b37ca29", new Object[]{this});
        }
        return this.algoResults;
    }

    public String getDataID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b05f89e", new Object[]{this});
        }
        return this.dataID;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.errorMsg;
    }

    public List<Label> getLabels() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("889b35cb", new Object[]{this});
        }
        return this.labels;
    }

    public String getSampleID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25281e", new Object[]{this});
        }
        return this.sampleID;
    }

    public boolean isRisk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fa29724", new Object[]{this})).booleanValue();
        }
        return this.isRisk;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.success;
    }

    public void setAlgoResults(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ff21d", new Object[]{this, map});
        } else {
            this.algoResults = map;
        }
    }
}
