package com.taobao.android.detail.core.standard.widget.lightoff.vm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffItemModel;
import tb.gkc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface ILightOffViewModel {
    boolean allowPull();

    Drawable createSnapshot();

    String getType();

    View getView(Context context, LightOffItemModel lightOffItemModel, gkc gkcVar);
}
