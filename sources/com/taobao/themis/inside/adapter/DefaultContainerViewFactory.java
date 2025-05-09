package com.taobao.themis.inside.adapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.app.page.IContainerViewFactory;
import com.taobao.themis.container.title.titlebar.DefaultTitleBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import kotlin.Metadata;
import tb.bcs;
import tb.ckf;
import tb.dyd;
import tb.jds;
import tb.lxd;
import tb.mds;
import tb.mm4;
import tb.nds;
import tb.q9s;
import tb.t2o;
import tb.x5d;
import tb.y0e;
import tb.yxd;
import tb.ztd;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/inside/adapter/DefaultContainerViewFactory;", "Lcom/taobao/themis/container/app/page/IContainerViewFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Ltb/x5d;", "createPageContainer", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)Ltb/x5d;", "Ltb/y0e;", "createTitleBar", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)Ltb/y0e;", "Ltb/lxd;", "createTabBar", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)Ltb/lxd;", "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DefaultContainerViewFactory implements IContainerViewFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(837812254);
            int[] iArr = new int[TMSSolutionType.values().length];
            iArr[TMSSolutionType.WEB_SINGLE_PAGE.ordinal()] = 1;
            iArr[TMSSolutionType.UNIAPP.ordinal()] = 2;
            iArr[TMSSolutionType.WEEX.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(837812253);
        t2o.a(835715092);
    }

    @Override // com.taobao.themis.container.app.page.IContainerViewFactory
    public x5d createPageContainer(Context context, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x5d) ipChange.ipc$dispatch("5cc95015", new Object[]{this, context, iTMSPage});
        }
        ckf.g(context, "context");
        ckf.g(iTMSPage, "page");
        if (iTMSPage.getExtension(dyd.class) != null) {
            return new nds(context, iTMSPage);
        }
        ztd ztdVar = (ztd) iTMSPage.getExtension(ztd.class);
        if (ztdVar != null) {
            return ztdVar.getPageContainer();
        }
        if (iTMSPage.getExtension(yxd.class) != null) {
            return new mds(context, iTMSPage);
        }
        return new bcs(context, iTMSPage);
    }

    @Override // com.taobao.themis.container.app.page.IContainerViewFactory
    public lxd createTabBar(Context context, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lxd) ipChange.ipc$dispatch("cb0af22f", new Object[]{this, context, iTMSPage});
        }
        ckf.g(context, "context");
        ckf.g(iTMSPage, "page");
        mm4 N = iTMSPage.getInstance().N();
        TabBar e = N == null ? null : N.e();
        if (e == null) {
            return null;
        }
        jds jdsVar = new jds(context);
        jdsVar.s(e);
        return jdsVar;
    }

    @Override // com.taobao.themis.container.app.page.IContainerViewFactory
    public y0e createTitleBar(Context context, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y0e) ipChange.ipc$dispatch("8261358f", new Object[]{this, context, iTMSPage});
        }
        ckf.g(context, "context");
        ckf.g(iTMSPage, "page");
        TMSSolutionType a0 = iTMSPage.getInstance().a0();
        int i = a0 == null ? -1 : a.$EnumSwitchMapping$0[a0.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return new DefaultTitleBar(context);
            }
            return null;
        } else if (q9s.F0()) {
            return new DefaultTitleBar(context);
        } else {
            return null;
        }
    }
}
