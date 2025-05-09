package com.taobao.themis_rum;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.ITMSRUMAdapter;
import com.taobao.themis.kernel.extension.page.rum.RUMPageExtension;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import tb.bbs;
import tb.ckf;
import tb.das;
import tb.pgd;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/themis_rum/TMSRUMAdapter;", "Lcom/taobao/themis/kernel/adapter/ITMSRUMAdapter;", "<init>", "()V", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Ltb/pgd;", "getRumPageExtension", "(Lcom/taobao/themis/kernel/page/ITMSPage;)Ltb/pgd;", "Ltb/bbs;", "instance", "Ltb/xhv;", "registerRumEmbedExtension", "(Ltb/bbs;)V", "themis_rum_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSRUMAdapter implements ITMSRUMAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(846200851);
        t2o.a(839909485);
    }

    @Override // com.taobao.themis.kernel.adapter.ITMSRUMAdapter
    public pgd getRumPageExtension(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pgd) ipChange.ipc$dispatch("d1d54869", new Object[]{this, iTMSPage});
        }
        ckf.g(iTMSPage, "page");
        return new RUMPageExtension(iTMSPage);
    }

    @Override // com.taobao.themis.kernel.adapter.ITMSRUMAdapter
    public void registerRumEmbedExtension(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ffeaf50", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        bbsVar.k0(new das(bbsVar));
    }
}
