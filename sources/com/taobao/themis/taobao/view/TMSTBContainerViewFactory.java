package com.taobao.themis.taobao.view;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.title.titlebar.DefaultTitleBar;
import com.taobao.themis.inside.adapter.DefaultContainerViewFactory;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.pub.titlebar.PubTitleBar;
import kotlin.Metadata;
import tb.ckf;
import tb.jds;
import tb.kds;
import tb.lxd;
import tb.m8s;
import tb.mm4;
import tb.q9s;
import tb.t2o;
import tb.x5d;
import tb.y0e;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/taobao/view/TMSTBContainerViewFactory;", "Lcom/taobao/themis/inside/adapter/DefaultContainerViewFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Ltb/x5d;", "createPageContainer", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)Ltb/x5d;", "Ltb/y0e;", "createTitleBar", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)Ltb/y0e;", "Ltb/lxd;", "createTabBar", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)Ltb/lxd;", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTBContainerViewFactory extends DefaultContainerViewFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(847249551);
            int[] iArr = new int[TMSSolutionType.values().length];
            iArr[TMSSolutionType.WEB_SINGLE_PAGE.ordinal()] = 1;
            iArr[TMSSolutionType.WEEX.ordinal()] = 2;
            iArr[TMSSolutionType.UNIAPP.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(847249550);
    }

    public static /* synthetic */ Object ipc$super(TMSTBContainerViewFactory tMSTBContainerViewFactory, String str, Object... objArr) {
        if (str.hashCode() == 1556697109) {
            return super.createPageContainer((Context) objArr[0], (ITMSPage) objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/view/TMSTBContainerViewFactory");
    }

    @Override // com.taobao.themis.inside.adapter.DefaultContainerViewFactory, com.taobao.themis.container.app.page.IContainerViewFactory
    public x5d createPageContainer(Context context, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x5d) ipChange.ipc$dispatch("5cc95015", new Object[]{this, context, iTMSPage});
        }
        ckf.g(context, "context");
        ckf.g(iTMSPage, "page");
        return super.createPageContainer(context, iTMSPage);
    }

    @Override // com.taobao.themis.inside.adapter.DefaultContainerViewFactory, com.taobao.themis.container.app.page.IContainerViewFactory
    public lxd createTabBar(Context context, ITMSPage iTMSPage) {
        lxd lxdVar;
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
        if (e.isAct()) {
            lxdVar = new m8s(context);
        } else if (q9s.j2()) {
            lxdVar = new kds(context);
        } else {
            lxdVar = new jds(context);
        }
        lxdVar.s(e);
        return lxdVar;
    }

    @Override // com.taobao.themis.inside.adapter.DefaultContainerViewFactory, com.taobao.themis.container.app.page.IContainerViewFactory
    public y0e createTitleBar(Context context, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y0e) ipChange.ipc$dispatch("8261358f", new Object[]{this, context, iTMSPage});
        }
        ckf.g(context, "context");
        ckf.g(iTMSPage, "page");
        if (TMSInstanceExtKt.r(iTMSPage.getInstance())) {
            return new PubTitleBar(context);
        }
        TMSSolutionType a0 = iTMSPage.getInstance().a0();
        int i = a0 == null ? -1 : a.$EnumSwitchMapping$0[a0.ordinal()];
        if (i == 1 || i == 2) {
            if (q9s.F0()) {
                return new DefaultTitleBar(context);
            }
            return null;
        } else if (i != 3) {
            return new PubTitleBar(context);
        } else {
            return new DefaultTitleBar(context);
        }
    }
}
