package com.alibaba.security.realidentity.ui.webview.adapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class IdentityWebAdapterWrapper implements IVerifyWebAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "IdentityWebAdapterWrapper";
    public IVerifyWebAdapter mIdentityAdapter = new VerifyWebAdapterImpl();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Singleton {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final IdentityWebAdapterWrapper INSTANCE = new IdentityWebAdapterWrapper();

        public static /* synthetic */ IdentityWebAdapterWrapper access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IdentityWebAdapterWrapper) ipChange.ipc$dispatch("a5ad54e0", new Object[0]);
            }
            return INSTANCE;
        }
    }

    public static IdentityWebAdapterWrapper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IdentityWebAdapterWrapper) ipChange.ipc$dispatch("bcf591e5", new Object[0]);
        }
        return Singleton.access$000();
    }

    @Override // com.alibaba.security.realidentity.ui.webview.adapter.IVerifyWebAdapter
    public BaseWebViewProxy getWebViewType(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseWebViewProxy) ipChange.ipc$dispatch("e15d986d", new Object[]{this, context, str});
        }
        IVerifyWebAdapter iVerifyWebAdapter = this.mIdentityAdapter;
        if (iVerifyWebAdapter != null) {
            return iVerifyWebAdapter.getWebViewType(context, str);
        }
        return null;
    }

    public void setAdapter(IVerifyWebAdapter iVerifyWebAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1f0ef2", new Object[]{this, iVerifyWebAdapter});
        } else {
            this.mIdentityAdapter = iVerifyWebAdapter;
        }
    }
}
