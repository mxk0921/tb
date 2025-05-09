package com.taobao.video_remoteso.api;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LoadResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mLibName;

    static {
        t2o.a(968884230);
    }

    public LoadResult(String str) {
        this.mLibName = str;
    }

    public RSoException getException() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RSoException) ipChange.ipc$dispatch("c350a0f9", new Object[]{this});
        }
        return null;
    }

    public String getLibName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ff65cbf", new Object[]{this});
        }
        return this.mLibName;
    }

    public boolean isLoadSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f4973be", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.mLibName);
    }
}
