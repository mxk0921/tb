package com.taobao.themis.pub.extension;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.pub.menu.TMSTBMenu;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/taobao/themis/pub/menu/TMSTBMenu;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TBDefaultGlobalMenuPageExtension$menu$2 extends Lambda implements d1a<TMSTBMenu> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TBDefaultGlobalMenuPageExtension this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TBDefaultGlobalMenuPageExtension$menu$2(TBDefaultGlobalMenuPageExtension tBDefaultGlobalMenuPageExtension) {
        super(0);
        this.this$0 = tBDefaultGlobalMenuPageExtension;
    }

    public static /* synthetic */ Object ipc$super(TBDefaultGlobalMenuPageExtension$menu$2 tBDefaultGlobalMenuPageExtension$menu$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/extension/TBDefaultGlobalMenuPageExtension$menu$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final TMSTBMenu invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSTBMenu) ipChange.ipc$dispatch("e998cfa7", new Object[]{this}) : new TMSTBMenu(TBDefaultGlobalMenuPageExtension.f(this.this$0));
    }
}
