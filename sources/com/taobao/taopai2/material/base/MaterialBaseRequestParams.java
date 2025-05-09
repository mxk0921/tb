package com.taobao.taopai2.material.base;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import mtopsdk.mtop.domain.MethodEnum;
import tb.erc;
import tb.f51;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class MaterialBaseRequestParams implements Serializable, erc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int DEFUALT_CLIENTVER = 4;
    public String bizLine;
    public String bizScene;
    private long cacheTime;
    public int clientVer;
    private MaterialRequestPolicy mRequestPolicy;

    static {
        t2o.a(782237856);
        t2o.a(782237855);
    }

    public MaterialBaseRequestParams() {
        this.clientVer = DEFUALT_CLIENTVER;
        this.cacheTime = f51.DEF_MAX_ASYNC_SECONDS;
        this.mRequestPolicy = MaterialRequestPolicy.CACHE_NET;
    }

    public static String adjustBizParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("578a6e26", new Object[]{str});
        }
        return TextUtils.isEmpty(str) ? "taopai" : str;
    }

    public static long adjustTemplateId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84ddad6d", new Object[]{new Long(j)})).longValue();
        }
        if (j == -1) {
            return 4001L;
        }
        return j;
    }

    @Override // tb.erc
    public abstract /* synthetic */ String getAPI();

    public String getBizLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26095428", new Object[]{this});
        }
        return this.bizLine;
    }

    @Override // tb.yqc
    public String getCachePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97112b88", new Object[]{this});
        }
        return null;
    }

    @Override // tb.yqc
    public long getCacheTimeS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f76f1835", new Object[]{this})).longValue();
        }
        return this.cacheTime * 1000;
    }

    @Override // tb.erc
    public MethodEnum getMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MethodEnum) ipChange.ipc$dispatch("2fddf0c4", new Object[]{this});
        }
        return MethodEnum.POST;
    }

    public MaterialRequestPriority getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaterialRequestPriority) ipChange.ipc$dispatch("146cc9b4", new Object[]{this});
        }
        return MaterialRequestPriority.DEFAULT;
    }

    public String getRequestName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e5c20f5", new Object[]{this});
        }
        return null;
    }

    @Override // tb.erc
    public MaterialRequestPolicy getRequestPolicy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaterialRequestPolicy) ipChange.ipc$dispatch("8e3e5ab5", new Object[]{this});
        }
        return this.mRequestPolicy;
    }

    @Override // tb.erc
    public boolean needLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c133777e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void setCacheTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd59e010", new Object[]{this, new Long(j)});
        } else {
            this.cacheTime = j;
        }
    }

    public void setRequestPolicy(MaterialRequestPolicy materialRequestPolicy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2acb56f7", new Object[]{this, materialRequestPolicy});
        } else {
            this.mRequestPolicy = materialRequestPolicy;
        }
    }

    public MaterialBaseRequestParams(String str, String str2, int i) {
        this.clientVer = DEFUALT_CLIENTVER;
        this.cacheTime = f51.DEF_MAX_ASYNC_SECONDS;
        this.mRequestPolicy = MaterialRequestPolicy.CACHE_NET;
        this.bizLine = str;
        this.bizScene = str2;
        this.clientVer = i;
    }
}
