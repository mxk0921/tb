package com.alibaba.wireless.security.open.initialize;

import android.content.Context;
import com.alibaba.wireless.security.framework.ISGPluginManager;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.IInitializeComponent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class a implements IInitializeComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f3434a;

    static {
        t2o.a(659554367);
        t2o.a(659554363);
    }

    public a() {
        this.f3434a = new b();
    }

    public int a(Context context, String str, boolean z) throws SecException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d51141dd", new Object[]{this, context, str, new Boolean(z)})).intValue() : this.f3434a.b(context, str, z, true);
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public int initialize(Context context) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1dcfb84", new Object[]{this, context})).intValue();
        }
        return loadLibrarySync(context);
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public void initializeAsync(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6a1fd5", new Object[]{this, context});
            return;
        }
        try {
            loadLibraryAsync(context);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public boolean isSoValid(Context context) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e723466f", new Object[]{this, context})).booleanValue();
        }
        return this.f3434a.a(context);
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public void loadLibraryAsync(Context context) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201a83fa", new Object[]{this, context});
        } else {
            loadLibraryAsync(context, null);
        }
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public int loadLibrarySync(Context context) throws SecException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3364d5e4", new Object[]{this, context})).intValue() : loadLibrarySync(context, null);
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public void registerInitFinishListener(IInitializeComponent.IInitFinishListener iInitFinishListener) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105c89d7", new Object[]{this, iInitFinishListener});
        } else {
            this.f3434a.a(iInitFinishListener);
        }
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public void unregisterInitFinishListener(IInitializeComponent.IInitFinishListener iInitFinishListener) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4331c3b0", new Object[]{this, iInitFinishListener});
        } else {
            this.f3434a.a(iInitFinishListener);
        }
    }

    public a(String str) {
        this.f3434a = new b(str);
    }

    public ISGPluginManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISGPluginManager) ipChange.ipc$dispatch("ac1cd9d0", new Object[]{this}) : this.f3434a.a();
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public void loadLibraryAsync(Context context, String str) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c86344", new Object[]{this, context, str});
        } else {
            this.f3434a.a(context, str, true, true);
        }
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public int loadLibrarySync(Context context, String str) throws SecException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("85e4c56e", new Object[]{this, context, str})).intValue() : this.f3434a.b(context, str, true, true);
    }
}
