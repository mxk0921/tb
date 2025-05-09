package com.alipay.android.app.render.api.result;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.session.standalone.model.PrepareResult;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspPrepareResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PrepareResult f3485a;
    public final boolean b;

    public MspPrepareResult() {
    }

    public PrepareResult getPrepareResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrepareResult) ipChange.ipc$dispatch("1fe6b0f2", new Object[]{this});
        }
        return this.f3485a;
    }

    public boolean isAsyncLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5b3fc7", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public MspPrepareResult(PrepareResult prepareResult, boolean z) {
        this.f3485a = prepareResult;
        this.b = z;
    }
}
