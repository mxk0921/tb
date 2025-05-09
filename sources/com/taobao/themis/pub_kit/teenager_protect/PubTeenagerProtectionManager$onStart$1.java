package com.taobao.themis.pub_kit.teenager_protect;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.pub_kit.teenager_protect.PubTimeLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/taobao/themis/pub_kit/teenager_protect/PubTimeLock$c;", "type", "Ltb/xhv;", "invoke-Aoh5qLo", "(I)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubTeenagerProtectionManager$onStart$1 extends Lambda implements g1a<PubTimeLock.c, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ PubTeenagerProtectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubTeenagerProtectionManager$onStart$1(PubTeenagerProtectionManager pubTeenagerProtectionManager) {
        super(1);
        this.this$0 = pubTeenagerProtectionManager;
    }

    public static /* synthetic */ Object ipc$super(PubTeenagerProtectionManager$onStart$1 pubTeenagerProtectionManager$onStart$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/teenager_protect/PubTeenagerProtectionManager$onStart$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(PubTimeLock.c cVar) {
        m335invokeAoh5qLo(cVar.j());
        return xhv.INSTANCE;
    }

    /* renamed from: invoke-Aoh5qLo  reason: not valid java name */
    public final void m335invokeAoh5qLo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286423d8", new Object[]{this, new Integer(i)});
            return;
        }
        PubTimeLock.c.a aVar = PubTimeLock.c.Companion;
        if (PubTimeLock.c.g(i, aVar.a())) {
            PubTeenagerProtectionManager.b(this.this$0).f(PubTeenagerProtectionManager.a(this.this$0), aVar.a());
        } else if (PubTimeLock.c.g(i, aVar.b())) {
            PubTeenagerProtectionManager.b(this.this$0).f(PubTeenagerProtectionManager.a(this.this$0), aVar.b());
        } else if (PubTimeLock.c.g(i, aVar.c())) {
            PubTimeLock.INSTANCE.E();
        }
    }
}
