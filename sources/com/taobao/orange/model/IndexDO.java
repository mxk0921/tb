package com.taobao.orange.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.a;
import com.taobao.orange.util.OLog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.dq3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class IndexDO implements Serializable, dq3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "IndexDO";
    private static final long serialVersionUID = -1896208418187285387L;
    public String appIndexVersion;
    public String appKey;
    public String appVersion;
    public String baseVersion;
    public String cdn;
    public String createTime;
    public String id;
    public String md5;
    public List<NameSpaceDO> mergedNamespaces = new ArrayList();
    public List<String> offlineNamespaces = new ArrayList();
    public String protocol;
    public int totalCnt;
    public String version;
    public String versionIndexVersion;

    static {
        t2o.a(613417088);
        t2o.a(613417081);
    }

    public IndexDO() {
    }

    @Override // tb.dq3
    public boolean checkValid() {
        List<NameSpaceDO> list;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.appKey) || TextUtils.isEmpty(this.appVersion) || TextUtils.isEmpty(this.appIndexVersion) || TextUtils.isEmpty(this.versionIndexVersion) || TextUtils.isEmpty(this.id) || TextUtils.isEmpty(this.cdn) || TextUtils.isEmpty(this.version) || (list = this.mergedNamespaces) == null || list.isEmpty()) {
            OLog.w(TAG, "lack param", new Object[0]);
            return false;
        }
        if ((!this.appVersion.equals("*") && !this.appVersion.equals(a.j)) || !this.appKey.equals(a.h)) {
            z = false;
        }
        if (!z) {
            OLog.w(TAG, "invaild", new Object[0]);
        }
        return z;
    }

    public IndexDO(IndexDO indexDO) {
        this.appKey = indexDO.appKey;
        this.appVersion = indexDO.appVersion;
        this.appIndexVersion = indexDO.appIndexVersion;
        this.versionIndexVersion = indexDO.versionIndexVersion;
        this.createTime = indexDO.createTime;
        this.protocol = indexDO.protocol;
        this.id = indexDO.id;
        this.cdn = indexDO.cdn;
        this.version = indexDO.version;
        this.mergedNamespaces.addAll(indexDO.mergedNamespaces);
        this.baseVersion = indexDO.baseVersion;
        this.offlineNamespaces.addAll(indexDO.offlineNamespaces);
        this.md5 = indexDO.md5;
        this.totalCnt = indexDO.totalCnt;
    }
}
