package com.taobao.android.remoteso.api.assets;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CheckAssetsResult {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_NORMAL = 1;
    public static final int STATUS_REMOTE = 0;
    public static final int STATUS_UNKNOWN = 2;

    /* renamed from: a  reason: collision with root package name */
    public final String f9231a;
    public final int b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface AssetsStatus {
    }

    public CheckAssetsResult(String str, int i) {
        this.f9231a = str;
        this.b = i;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf69e69b", new Object[]{this})).booleanValue();
        }
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CheckAssetsResult{name='" + this.f9231a + "', status=" + this.b + '}';
    }
}
