package com.taobao.cameralink.manager.model.flowdata;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class AbsCLDataModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long nativePtr;
    private boolean needSync = true;
    private long sendTime;

    static {
        t2o.a(394264591);
    }

    public abstract void fetchDataFromNativeObj() throws Throwable;

    public abstract void formJson(String str);

    public long getNativePtr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("755f1c9c", new Object[]{this})).longValue();
        }
        return this.nativePtr;
    }

    public long getSendTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe3a66e6", new Object[]{this})).longValue();
        }
        return this.sendTime;
    }

    public final void makeNativeInstance() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b5762e1", new Object[]{this});
        } else {
            this.nativePtr = realMakeNativeInstance();
        }
    }

    public final boolean needRecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88f77b28", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean needSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c855d05c", new Object[]{this})).booleanValue();
        }
        return this.needSync;
    }

    public abstract long realMakeNativeInstance() throws Throwable;

    public abstract void releaseNativeInstance();

    public void setNativePtr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b5728", new Object[]{this, new Long(j)});
        } else {
            this.nativePtr = j;
        }
    }

    public AbsCLDataModel setNeedSync(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsCLDataModel) ipChange.ipc$dispatch("72828b75", new Object[]{this, new Boolean(z)});
        }
        this.needSync = z;
        return this;
    }

    public void setSendTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be95486", new Object[]{this, new Long(j)});
        } else {
            this.sendTime = j;
        }
    }

    public abstract String toJson();
}
