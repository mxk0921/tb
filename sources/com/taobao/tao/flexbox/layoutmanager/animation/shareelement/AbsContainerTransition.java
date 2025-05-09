package com.taobao.tao.flexbox.layoutmanager.animation.shareelement;

import android.transition.Transition;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.anl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class AbsContainerTransition extends Transition {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public int fadeMode = 0;
    public anl pageInterface;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface FadeMode {
    }

    static {
        t2o.a(503316670);
    }

    public static /* synthetic */ Object ipc$super(AbsContainerTransition absContainerTransition, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/shareelement/AbsContainerTransition");
    }

    public void setFadeMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c925cb3b", new Object[]{this, new Integer(i)});
        } else {
            this.fadeMode = i;
        }
    }

    public void setPageInterface(anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2448f2b", new Object[]{this, anlVar});
        } else {
            this.pageInterface = anlVar;
        }
    }
}
