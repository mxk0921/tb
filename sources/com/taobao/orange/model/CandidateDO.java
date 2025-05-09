package com.taobao.orange.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.candidate.MultiAnalyze;
import com.taobao.orange.util.OLog;
import java.io.Serializable;
import tb.eal;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CandidateDO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CandidateDO";
    private static final long serialVersionUID = -5105708349446610873L;
    public volatile transient MultiAnalyze analyze;
    public String contentMd5;
    public String match;
    public String md5;
    public String resourceId;
    public String version;

    static {
        t2o.a(613417080);
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
        CandidateDO candidateDO = (CandidateDO) obj;
        String str = this.resourceId;
        if (str == null ? candidateDO.resourceId != null : !str.equals(candidateDO.resourceId)) {
            return false;
        }
        String str2 = this.match;
        if (str2 == null ? candidateDO.match != null : !str2.equals(candidateDO.match)) {
            return false;
        }
        String str3 = this.version;
        String str4 = candidateDO.version;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CandidateDO{match:'" + this.match + "', version:'" + this.version + "'}";
    }

    public boolean checkMatch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54d66072", new Object[]{this, str})).booleanValue();
        }
        try {
            synchronized (this) {
                if (this.analyze == null) {
                    this.analyze = MultiAnalyze.complie(this.match, true);
                }
            }
            boolean match = this.analyze.match();
            if (this.analyze.unitAnalyzes.size() == 1 && "did_hash".equals(this.analyze.unitAnalyzes.get(0).key)) {
                String str2 = str + ":" + this.version + ":" + this.match;
                if (match) {
                    eal.r(OConstant.MONITOR_MODULE, "did_hash", str2);
                } else {
                    eal.l(OConstant.MONITOR_MODULE, "did_hash", str2, null, null);
                }
            }
            return match;
        } catch (Exception e) {
            OLog.e(TAG, "checkMatch", e, new Object[0]);
            return false;
        }
    }

    public boolean checkValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.isEmpty(this.resourceId) && !TextUtils.isEmpty(this.match) && !TextUtils.isEmpty(this.version)) {
            return true;
        }
        OLog.w(TAG, "lack param", new Object[0]);
        return false;
    }
}
