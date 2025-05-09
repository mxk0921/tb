package com.taobao.munion.taosdk;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.cpm.ifs.IfsBuilder;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CpmIfsCommitter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Application mApplication;
    private Map<String, String> mArgs;

    static {
        t2o.a(1017118852);
    }

    public CpmIfsCommitter(Application application, Map<String, String> map) {
        this.mApplication = application;
        this.mArgs = map;
    }

    public void commitEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8c11f4", new Object[]{this, str});
        } else {
            new IfsBuilder(this.mApplication, str).withArgs(this.mArgs).commit();
        }
    }

    public String commitEventForResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cdfbaec", new Object[]{this, str});
        }
        return new IfsBuilder(this.mApplication, str).withArgs(this.mArgs).commit();
    }

    public void commitEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93426be", new Object[]{this, str, str2});
        } else {
            new IfsBuilder(this.mApplication, str2).withArgs(this.mArgs).commit();
        }
    }
}
