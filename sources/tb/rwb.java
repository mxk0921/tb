package tb;

import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface rwb extends sod {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(DXRootView dXRootView, DXTemplateItem dXTemplateItem);

        void onFail();
    }

    void R0(DXRootView dXRootView, DXTemplateItem dXTemplateItem, l18 l18Var);

    DinamicXEngine d();

    void o1(DXTemplateItem dXTemplateItem, a aVar);
}
