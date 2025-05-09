package com.taobao.themis.pub.menu;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.bac;
import tb.d1a;
import tb.xhv;
import tb.zz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTBMenu$addItems$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ List<bac.c> $item;
    public final /* synthetic */ TMSTBMenu this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List<bac.c> f13691a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends bac.c> list) {
            this.f13691a = list;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public final void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            } else if (tBPublicMenuItem != null) {
                Iterator<T> it = this.f13691a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((bac.c) obj).a() == tBPublicMenuItem.getId()) {
                        break;
                    }
                }
                bac.c cVar = (bac.c) obj;
                if (cVar != null) {
                    cVar.e();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TMSTBMenu$addItems$1(TMSTBMenu tMSTBMenu, List<? extends bac.c> list) {
        super(0);
        this.this$0 = tMSTBMenu;
        this.$item = list;
    }

    public static /* synthetic */ Object ipc$super(TMSTBMenu$addItems$1 tMSTBMenu$addItems$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/menu/TMSTBMenu$addItems$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        TBPublicMenu a2 = TMSTBMenu.a(this.this$0);
        List<bac.c> list = this.$item;
        ArrayList arrayList = new ArrayList(zz3.q(list, 10));
        for (bac.c cVar : list) {
            arrayList.add(cVar.d());
        }
        a2.addCustomMenus(arrayList, new a(this.$item));
    }
}
