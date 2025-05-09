package com.alipay.android.app.smartpays.res.provider;

import android.content.Context;
import android.content.res.Resources;
import com.alipay.android.app.render.api.RenderEnv;
import com.alipay.android.app.smartpays.api.IResourceProvider;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ResourceProvider implements IResourceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String PACKAGE_NAME = "com.alipay.android.safepaysdk";
    public static String SDK_PACKAGE_NAME = "com.alipay.android.safepaysdk";

    /* renamed from: a  reason: collision with root package name */
    public final Context f3502a;

    public ResourceProvider(Context context) {
        this.f3502a = context;
    }

    @Override // com.alipay.android.app.smartpays.api.IResourceProvider
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f3502a;
    }

    @Override // com.alipay.android.app.smartpays.api.IResourceProvider
    public String getPackageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this});
        }
        if (RenderEnv.isWallet()) {
            return PACKAGE_NAME;
        }
        return SDK_PACKAGE_NAME;
    }

    @Override // com.alipay.android.app.smartpays.api.IResourceProvider
    public Resources getResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this});
        }
        return this.f3502a.getResources();
    }
}
