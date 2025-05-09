package com.taobao.android.litecreator.localization;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/HashMap;", "", "Lcom/alibaba/ability/localization/Localization$a;", "Lkotlin/collections/HashMap;", "invoke", "()Ljava/util/HashMap;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class UGCLocalizationManager$ugcChangeListenerMap$2 extends Lambda implements d1a<HashMap<Object, Localization.a>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final UGCLocalizationManager$ugcChangeListenerMap$2 INSTANCE = new UGCLocalizationManager$ugcChangeListenerMap$2();

    public UGCLocalizationManager$ugcChangeListenerMap$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(UGCLocalizationManager$ugcChangeListenerMap$2 uGCLocalizationManager$ugcChangeListenerMap$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/localization/UGCLocalizationManager$ugcChangeListenerMap$2");
    }

    @Override // tb.d1a
    public final HashMap<Object, Localization.a> invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("cd9860a2", new Object[]{this}) : new HashMap<>();
    }
}
