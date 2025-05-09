package com.ap.zlz.toyger.zdoc;

import com.alibaba.fastjson.JSON;
import com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.v5u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ToygerDocBlobConfig extends ToygerBlobConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String docType;
    public int pageNo;
    public float ratio;
    public v5u ss;
    public String subType;

    static {
        t2o.a(245366791);
    }

    public ToygerDocBlobConfig() {
    }

    public static ToygerDocBlobConfig from(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToygerDocBlobConfig) ipChange.ipc$dispatch("7fd3b30", new Object[]{str, str2});
        }
        ToygerDocBlobConfig toygerDocBlobConfig = (ToygerDocBlobConfig) JSON.parseObject(str, ToygerDocBlobConfig.class);
        toygerDocBlobConfig.pubkey = str2;
        return toygerDocBlobConfig;
    }

    public static /* synthetic */ Object ipc$super(ToygerDocBlobConfig toygerDocBlobConfig, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ap/zlz/toyger/zdoc/ToygerDocBlobConfig");
    }

    public float getCompressRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c747a874", new Object[]{this, new Integer(i)})).floatValue();
        }
        return this.ratio;
    }

    public Integer getDesiredWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("cbf35430", new Object[]{this});
        }
        return 1080;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ToygerDocBlobConfig{ratio=" + this.ratio + '}';
    }

    public ToygerDocBlobConfig(float f, String str) {
        this.ratio = f;
        this.pubkey = str;
    }
}
