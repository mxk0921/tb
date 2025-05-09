package com.alibaba.ability.impl.screen;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ScreenOrientationChangeResult;
import kotlin.jvm.internal.Lambda;
import tb.cnd;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ScreenAbility$setOrientationListener$1 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ cnd $events;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cnd cndVar = ScreenAbility$setOrientationListener$1.this.$events;
            ScreenOrientationChangeResult screenOrientationChangeResult = new ScreenOrientationChangeResult();
            int i = this.b;
            if (i == 0) {
                str = "unspecified";
            } else if (i == 1) {
                str = "portrait";
            } else if (i != 2) {
                str = "unknown";
            } else {
                str = "landscape";
            }
            screenOrientationChangeResult.orientation = str;
            xhv xhvVar = xhv.INSTANCE;
            cndVar.Y0(screenOrientationChangeResult);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenAbility$setOrientationListener$1(cnd cndVar) {
        super(1);
        this.$events = cndVar;
    }

    public static /* synthetic */ Object ipc$super(ScreenAbility$setOrientationListener$1 screenAbility$setOrientationListener$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/screen/ScreenAbility$setOrientationListener$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num) {
        invoke(num.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
        } else {
            MegaUtils.C(new a(i));
        }
    }
}
