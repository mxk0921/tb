package com.taobao.homepage.pop.view.container.main;

import android.content.Context;
import android.graphics.Color;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import tb.e3b;
import tb.ezh;
import tb.pfw;
import tb.vfm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MainHierarchyPopContainer extends BasePopContainer {
    public MainHierarchyPopContainer(Context context, pfw pfwVar, int i, e3b e3bVar) {
        super(context, pfwVar, i, e3bVar);
        this.mPopTrigger = new ezh(this, pfwVar, e3bVar);
        if (vfm.a()) {
            setBackgroundColor(Color.parseColor("#ccffeedd"));
        }
    }
}
