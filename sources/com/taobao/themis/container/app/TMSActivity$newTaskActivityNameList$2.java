package com.taobao.themis.container.app;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.obq;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSActivity$newTaskActivityNameList$2 extends Lambda implements d1a<ArrayList<String>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSActivity$newTaskActivityNameList$2 INSTANCE = new TMSActivity$newTaskActivityNameList$2();

    public TMSActivity$newTaskActivityNameList$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(TMSActivity$newTaskActivityNameList$2 tMSActivity$newTaskActivityNameList$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/app/TMSActivity$newTaskActivityNameList$2");
    }

    @Override // tb.d1a
    public final ArrayList<String> invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("634a3b59", new Object[]{this}) : yz3.g(obq.BIZ_NAME, "com.taobao.tao.welcome.Welcome");
    }
}
