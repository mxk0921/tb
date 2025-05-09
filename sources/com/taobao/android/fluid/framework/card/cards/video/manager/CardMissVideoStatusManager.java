package com.taobao.android.fluid.framework.card.cards.video.manager;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.ir9;
import tb.prp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CardMissVideoStatusManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final prp f7785a;
    public String b;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface CardMissVideoStatus {
    }

    static {
        t2o.a(468714039);
    }

    public CardMissVideoStatusManager(prp prpVar) {
        this.f7785a = prpVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdc2cb59", new Object[]{this})).booleanValue();
        }
        if (!this.f7785a.s1().d) {
            return false;
        }
        if (this.f7785a.y1().e0() <= 0 || Math.round((this.f7785a.y1().W() * 100.0f) / this.f7785a.y1().e0()) <= 95) {
            return true;
        }
        return false;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6dfe10", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            ir9.b("CardMissVideoStatusManager", "卡片消失，mCardMissVideoStatusStr已经清空");
            this.b = null;
        } else {
            this.b += "," + str;
        }
    }
}
