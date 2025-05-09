package com.taobao.orange.model;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.OConstant;
import com.taobao.orange.util.OLog;
import java.io.Serializable;
import java.util.List;
import tb.eal;
import tb.fck;
import tb.gl4;
import tb.ibl;
import tb.jno;
import tb.t2o;
import tb.y0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NameSpaceDO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH_INIT = 0;
    public static final int HIGH_LAZY = 1;
    public static final String LEVEL_DEFAULT = "DEFAULT";
    public static final String LEVEL_HIGH = "HIGH";
    private static final String TAG = "NameSpaceDO";
    public static final String TYPE_CUSTOM = "CUSTOM";
    public static final String TYPE_STANDARD = "STANDARD";
    private static final long serialVersionUID = -4740785816043854483L;
    public List<CandidateDO> candidates;
    private String changeVersion;
    public String contentMd5;
    public transient CandidateDO curCandidateDO;
    public transient boolean hasChanged;
    public Integer highLazy = 0;
    public String loadLevel;
    public String md5;
    public String name;
    public String resourceId;
    public String type;
    public String version;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ConfigDO f11396a;

        public a(ConfigDO configDO) {
            this.f11396a = configDO;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ConfigDO configDO = this.f11396a;
            com.taobao.orange.util.a.f(configDO, configDO.name);
        }
    }

    static {
        t2o.a(613417089);
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
        NameSpaceDO nameSpaceDO = (NameSpaceDO) obj;
        String str = this.loadLevel;
        if (str == null ? nameSpaceDO.loadLevel != null : !str.equals(nameSpaceDO.loadLevel)) {
            return false;
        }
        String str2 = this.md5;
        if (str2 == null ? nameSpaceDO.md5 != null : !str2.equals(nameSpaceDO.md5)) {
            return false;
        }
        String str3 = this.name;
        if (str3 == null ? nameSpaceDO.name != null : !str3.equals(nameSpaceDO.name)) {
            return false;
        }
        String str4 = this.resourceId;
        if (str4 == null ? nameSpaceDO.resourceId != null : !str4.equals(nameSpaceDO.resourceId)) {
            return false;
        }
        String str5 = this.version;
        if (str5 == null ? nameSpaceDO.version != null : !str5.equals(nameSpaceDO.version)) {
            return false;
        }
        if (getChangeVersion() == null ? nameSpaceDO.getChangeVersion() != null : !getChangeVersion().equals(nameSpaceDO.getChangeVersion())) {
            return false;
        }
        List<CandidateDO> list = this.candidates;
        List<CandidateDO> list2 = nameSpaceDO.candidates;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public String getChangeVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b837ee7", new Object[]{this});
        }
        return this.changeVersion;
    }

    public void setChangeVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398c3fd7", new Object[]{this, str});
        } else {
            this.changeVersion = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "NameSpaceDO{loadLevel='" + this.loadLevel + "', name='" + this.name + "', version='" + this.version + "'}";
    }

    public boolean checkContentMd5Same(ConfigDO configDO) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54deb40c", new Object[]{this, configDO})).booleanValue();
        }
        if (!y0.a(OConstant.AB_CONTENT_MD5)) {
            return false;
        }
        CandidateDO candidateDO = this.curCandidateDO;
        if (candidateDO != null) {
            str2 = candidateDO.contentMd5;
            str = candidateDO.version;
            str3 = candidateDO.resourceId;
        } else {
            str2 = this.contentMd5;
            str = this.version;
            str3 = this.resourceId;
        }
        if (TextUtils.isEmpty(str2) || configDO == null || !TextUtils.equals(str2, configDO.contentMd5)) {
            return false;
        }
        OLog.i(TAG, "contentMD5 same", "name", this.name, "version", str, gl4.CONFIG_LOCAL_VERSION, configDO.getCurVersion(), OConstant.DIMEN_CONFIG_CHANGE_VERSION, this.changeVersion);
        configDO.resourceId = str3;
        configDO.version = str;
        configDO.candidate = this.curCandidateDO;
        configDO.setChangeVersion(this.changeVersion);
        if (ConfigCenter.getInstance().isAfterIdle.get()) {
            fck.g(new a(configDO));
        } else {
            configDO.persisted = false;
        }
        eal.i(configDO.name, str2, str, str3, this.changeVersion);
        return true;
    }

    private boolean skipCheckConfigValid(ConfigDO configDO, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9312da32", new Object[]{this, configDO, new Boolean(z)})).booleanValue();
        }
        if (!z) {
            if (TextUtils.isEmpty(com.taobao.orange.a.K)) {
                com.taobao.orange.a.K = (String) jno.b(com.taobao.orange.a.g, "appVersion", "");
            }
            if (TextUtils.isEmpty(com.taobao.orange.a.L)) {
                com.taobao.orange.a.L = (String) jno.b(com.taobao.orange.a.g, "osVersion", "");
            }
            if (!TextUtils.equals(com.taobao.orange.a.K, com.taobao.orange.a.j) || !TextUtils.equals(com.taobao.orange.a.L, String.valueOf(Build.VERSION.SDK_INT))) {
                if (configDO != null) {
                    configDO.setConfigStatus(2);
                    OLog.e(TAG, "skipCheckConfigValid localEnvironment changed", new Object[0]);
                    z = true;
                }
            } else if (configDO != null && configDO.getConfigStatus() == 2) {
                OLog.e(TAG, "skipCheckConfigValid update failed config", "name", configDO.name, gl4.CONFIG_LOCAL_VERSION, configDO.getCurVersion(), "localChangeVersion", configDO.getChangeVersion(), OConstant.DIMEN_CONFIG_CHANGE_VERSION, this.changeVersion);
                eal.j(OConstant.POINT_EXT_CFG_CHECK, OConstant.POINT_CONFIG_UPDATE_FAIL_COUNTS, configDO.name, 1.0d);
                z = true;
            }
        }
        long k = configDO == null ? 0L : ibl.k(configDO.getChangeVersion());
        return !(k == 0 && ibl.k(this.changeVersion) == 0) && k >= ibl.k(this.changeVersion) && !z;
    }

    public boolean checkValid(ConfigDO configDO, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26266c4f", new Object[]{this, configDO, new Boolean(z)})).booleanValue();
        }
        if (skipCheckConfigValid(configDO, z)) {
            if (configDO != null) {
                OLog.e(TAG, "skipCheckConfigValid", "name", configDO.name, OConstant.DIMEN_CONFIG_CHANGE_VERSION, this.changeVersion, "version", this.version, "localChangeVersion", configDO.getChangeVersion(), gl4.CONFIG_LOCAL_VERSION, configDO.getCurVersion());
            }
            return false;
        }
        long j = 0;
        long k = configDO == null ? 0L : ibl.k(configDO.getCurVersion());
        boolean z2 = (configDO == null || configDO.candidate == null) ? false : true;
        if (configDO != null && !z2) {
            j = ibl.k(configDO.version);
        }
        long k2 = ibl.k(this.version);
        List<CandidateDO> list = this.candidates;
        if (list != null && !list.isEmpty()) {
            if (OLog.isPrintLog(0)) {
                OLog.v(TAG, "checkCandidates start", "config", this.name, "candidates.size", Integer.valueOf(this.candidates.size()));
            }
            for (int i = 0; i < this.candidates.size(); i++) {
                CandidateDO candidateDO = this.candidates.get(i);
                if (OLog.isPrintLog(0)) {
                    OLog.v(TAG, "checkCandidate start", "index", Integer.valueOf(i), candidateDO);
                }
                if (candidateDO.checkValid() && candidateDO.checkMatch(this.name)) {
                    if (!z2 || ibl.k(candidateDO.version) != k) {
                        if (OLog.isPrintLog(1)) {
                            OLog.d(TAG, "checkCandidate match", "localV", Long.valueOf(k), "remoteV", candidateDO.version);
                        }
                        this.curCandidateDO = candidateDO;
                        return true;
                    } else {
                        if (OLog.isPrintLog(1)) {
                            OLog.d(TAG, "checkCandidate match but no version update", new Object[0]);
                        }
                        return false;
                    }
                }
            }
            if (OLog.isPrintLog(1)) {
                OLog.d(TAG, "checkCandidates finish", "not any match");
            }
        }
        boolean z3 = k2 != j;
        if (!z3 && OLog.isPrintLog(1)) {
            OLog.d(TAG, "checkValid", "no version update");
        }
        return z3;
    }
}
