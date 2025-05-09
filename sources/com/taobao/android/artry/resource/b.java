package com.taobao.android.artry.resource;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.resource.a;
import java.io.File;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b implements a.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(396361806);
        t2o.a(396361793);
    }

    @Override // com.taobao.android.artry.resource.a.f
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e192d8d", new Object[]{this, str, str2});
        } else {
            new File(str2).setLastModified(System.currentTimeMillis());
        }
    }

    @Override // com.taobao.android.artry.resource.a.f
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d4d548", new Object[]{this});
        }
    }

    @Override // com.taobao.android.artry.resource.a.f
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e749322", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.artry.resource.a.f
    public void onError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.artry.resource.a.f
    public void onProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
        }
    }
}
