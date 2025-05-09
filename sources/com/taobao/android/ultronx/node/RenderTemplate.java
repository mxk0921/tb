package com.taobao.android.ultronx.node;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultronx.base.CPointer;
import tb.fr2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RenderTemplate extends fr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mContainerType;
    private String mName;
    private String mUrl;
    private String mVersion;

    static {
        t2o.a(939524110);
    }

    public RenderTemplate(CPointer cPointer) {
        super(cPointer);
    }

    public static /* synthetic */ Object ipc$super(RenderTemplate renderTemplate, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultronx/node/RenderTemplate");
    }

    public native String _getContainerType(long j);

    public native String _getName(long j);

    public native String _getUrl(long j);

    public native String _getVersion(long j);

    public String getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6db7474", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return "";
        }
        if (this.mContainerType == null) {
            this.mContainerType = _getContainerType(j);
        }
        return this.mContainerType;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return "";
        }
        if (this.mName == null) {
            this.mName = _getName(j);
        }
        return this.mName;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return "";
        }
        if (this.mUrl == null) {
            this.mUrl = _getUrl(j);
        }
        return this.mUrl;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return "";
        }
        if (this.mVersion == null) {
            this.mVersion = _getVersion(j);
        }
        return this.mVersion;
    }
}
