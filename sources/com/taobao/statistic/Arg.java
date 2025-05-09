package com.taobao.statistic;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Arg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Object mArg1;
    private Object mArg2;
    private Object mArg3;
    private String[] mArgs;

    static {
        t2o.a(962593117);
    }

    public Arg(Object obj, Object obj2, Object obj3, String... strArr) {
        this.mArg1 = obj;
        this.mArg2 = obj2;
        this.mArg3 = obj3;
        this.mArgs = strArr;
    }

    public Object getArg1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7e9a1d1a", new Object[]{this});
        }
        return this.mArg1;
    }

    public Object getArg2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("51fd7b9", new Object[]{this});
        }
        return this.mArg2;
    }

    public Object getArg3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8ba59258", new Object[]{this});
        }
        return this.mArg3;
    }

    public String[] getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("53970da9", new Object[]{this});
        }
        return this.mArgs;
    }

    public void setArg1(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1405d00", new Object[]{this, obj});
        } else {
            this.mArg1 = obj;
        }
    }

    public void setArg2(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b71f641", new Object[]{this, obj});
        } else {
            this.mArg2 = obj;
        }
    }

    public void setArg3(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a38f82", new Object[]{this, obj});
        } else {
            this.mArg3 = obj;
        }
    }

    public void setArgs(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46751f9", new Object[]{this, strArr});
        } else {
            this.mArgs = strArr;
        }
    }
}
