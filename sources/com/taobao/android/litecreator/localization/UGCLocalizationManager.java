package com.taobao.android.litecreator.localization;

import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.a;
import tb.ckf;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class UGCLocalizationManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final UGCLocalizationManager INSTANCE = new UGCLocalizationManager();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f8272a = a.b(UGCLocalizationManager$ugcChangeListenerMap$2.INSTANCE);

    static {
        t2o.a(511705228);
        t2o.a(511705231);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1981fe8d", new Object[]{this});
        }
        Language h = Localization.h();
        ckf.f(h, "Localization.getLanguage()");
        String tag = h.getTag();
        ckf.f(tag, "Localization.getLanguage().tag");
        return tag;
    }

    public String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef325385", new Object[]{this, new Integer(i)});
        }
        String q = Localization.q(i);
        ckf.f(q, "Localization.localizedString(resourceId)");
        return q;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6a02bc1", new Object[]{this})).booleanValue();
        }
        return Localization.o();
    }
}
