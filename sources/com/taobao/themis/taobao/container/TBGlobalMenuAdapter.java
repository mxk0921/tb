package com.taobao.themis.taobao.container;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IGlobalMenuAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.pub.extension.TBDefaultGlobalMenuPageExtension;
import kotlin.Metadata;
import tb.bac;
import tb.btc;
import tb.cbr;
import tb.ckf;
import tb.lli;
import tb.mli;
import tb.nli;
import tb.pli;
import tb.qli;
import tb.sbs;
import tb.sli;
import tb.t2o;
import tb.xwt;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/taobao/container/TBGlobalMenuAdapter;", "Lcom/taobao/themis/kernel/adapter/IGlobalMenuAdapter;", "<init>", "()V", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Ltb/btc;", "getMoreAction", "(Lcom/taobao/themis/kernel/page/ITMSPage;)Ltb/btc;", "Ltb/bac;", "getGlobalMenu", "(Lcom/taobao/themis/kernel/page/ITMSPage;)Ltb/bac;", "Ltb/bac$b;", "type", "Ltb/bac$c;", "createMenuItem-vVa9PYU", "(Lcom/taobao/themis/kernel/page/ITMSPage;Ljava/lang/String;)Ltb/bac$c;", "createMenuItem", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TBGlobalMenuAdapter implements IGlobalMenuAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249417);
        t2o.a(839909469);
    }

    @Override // com.taobao.themis.kernel.adapter.IGlobalMenuAdapter
    /* renamed from: createMenuItem-vVa9PYU */
    public bac.c mo333createMenuItemvVa9PYU(ITMSPage iTMSPage, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bac.c) ipChange.ipc$dispatch("2248cb12", new Object[]{this, iTMSPage, str});
        }
        ckf.g(iTMSPage, "page");
        ckf.g(str, "type");
        sbs sbsVar = sbs.INSTANCE;
        if (bac.b.b(str, sbsVar.i())) {
            return new sli(iTMSPage);
        }
        if (bac.b.b(str, sbsVar.a())) {
            return new lli(iTMSPage);
        }
        if (bac.b.b(str, sbsVar.d())) {
            return new pli(iTMSPage);
        }
        if (bac.b.b(str, sbsVar.b())) {
            return new mli(iTMSPage);
        }
        if (bac.b.b(str, sbsVar.c())) {
            return new nli(iTMSPage);
        }
        if (bac.b.b(str, sbsVar.g())) {
            return new qli(iTMSPage);
        }
        return null;
    }

    @Override // com.taobao.themis.kernel.adapter.IGlobalMenuAdapter
    public bac getGlobalMenu(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bac) ipChange.ipc$dispatch("2f4268f3", new Object[]{this, iTMSPage});
        }
        ckf.g(iTMSPage, "page");
        if (TMSInstanceExtKt.r(iTMSPage.getInstance())) {
            return new xwt(iTMSPage);
        }
        return new TBDefaultGlobalMenuPageExtension(iTMSPage);
    }

    @Override // com.taobao.themis.kernel.adapter.IGlobalMenuAdapter
    public btc getMoreAction(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (btc) ipChange.ipc$dispatch("702c6557", new Object[]{this, iTMSPage});
        }
        ckf.g(iTMSPage, "page");
        return new cbr();
    }
}
