package com.taobao.android.fluid.framework.adapter;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.taobao.android.fluid.core.FluidContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface INavAdapter extends IAdapter {
    public static final String ADAPTER_NAME = "INavAdapter";

    void nav(FluidContext fluidContext, Context context, String str, Bundle bundle);

    void nav(FluidContext fluidContext, Context context, String str, Bundle bundle, int i);

    void nav(FluidContext fluidContext, Context context, String str, Bundle bundle, int i, int i2);

    void nav(FluidContext fluidContext, Fragment fragment, String str, Bundle bundle, int i, int i2);

    void navDisableTransition(FluidContext fluidContext, Context context, String str, Bundle bundle);
}
