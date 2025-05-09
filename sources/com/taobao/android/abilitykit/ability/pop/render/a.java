package com.taobao.android.abilitykit.ability.pop.render;

import android.view.View;
import android.view.ViewGroup;
import tb.h9;
import tb.k8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface a<PARAMS extends h9, ABILITY_CONTEXT extends k8> {

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.abilitykit.ability.pop.render.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface AbstractC0327a {
        void c();

        void e();
    }

    void changeGravity(String str);

    void changeSize(float f, float f2, boolean z);

    void doDismissAnimation();

    void enableCorner(boolean z);

    boolean isBgTransparent();

    ViewGroup onCreateView(ABILITY_CONTEXT ability_context, PARAMS params, View view, AbstractC0327a aVar, IAKPopRender<PARAMS, ABILITY_CONTEXT> iAKPopRender);

    void onLevelChanged(boolean z, boolean z2, int i);

    boolean shouldIgnoreNotifyLevelChange();
}
