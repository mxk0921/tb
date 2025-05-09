package com.taobao.themis.container.app.page;

import android.content.Context;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import tb.lxd;
import tb.n8s;
import tb.x5d;
import tb.y0e;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/container/app/page/IContainerViewFactory;", "Ltb/n8s;", "Landroid/content/Context;", "context", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Ltb/x5d;", "createPageContainer", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)Ltb/x5d;", "Ltb/y0e;", "createTitleBar", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)Ltb/y0e;", "Ltb/lxd;", "createTabBar", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)Ltb/lxd;", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IContainerViewFactory extends n8s {
    x5d createPageContainer(Context context, ITMSPage iTMSPage);

    lxd createTabBar(Context context, ITMSPage iTMSPage);

    y0e createTitleBar(Context context, ITMSPage iTMSPage);
}
