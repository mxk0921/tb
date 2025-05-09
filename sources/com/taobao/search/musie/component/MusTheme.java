package com.taobao.search.musie.component;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import tb.ckf;
import tb.cpt;
import tb.t2o;
import tb.tot;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MusTheme extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792687);
    }

    public MusTheme(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MusTheme musTheme, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/component/MusTheme");
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
    }

    @Override // tb.hvu
    public Object createMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2275846d", new Object[]{this, context});
        }
        ckf.g(context, "context");
        ThemeFrameLayout b = cpt.c().b(context, new tot("search", 0));
        return b == null ? new View(context) : b;
    }
}
