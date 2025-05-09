package com.taobao.taolive.room.ui.view.indicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.m7d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveIndicator extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private m7d mNavigator;

    static {
        t2o.a(779093297);
    }

    public LiveIndicator(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(LiveIndicator liveIndicator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/view/indicator/LiveIndicator");
    }

    public m7d getNavigator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m7d) ipChange.ipc$dispatch("956c2b4b", new Object[]{this});
        }
        return this.mNavigator;
    }

    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        m7d m7dVar = this.mNavigator;
        if (m7dVar != null) {
            m7dVar.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        m7d m7dVar = this.mNavigator;
        if (m7dVar != null) {
            m7dVar.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        m7d m7dVar = this.mNavigator;
        if (m7dVar != null) {
            m7dVar.onPageSelected(i);
        }
    }

    public void setNavigator(m7d m7dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d618e357", new Object[]{this, m7dVar});
            return;
        }
        m7d m7dVar2 = this.mNavigator;
        if (m7dVar2 != m7dVar) {
            if (m7dVar2 != null) {
                m7dVar2.a();
            }
            this.mNavigator = m7dVar;
            removeAllViews();
            if (this.mNavigator instanceof View) {
                addView((View) this.mNavigator, new FrameLayout.LayoutParams(-1, -1));
                this.mNavigator.b();
            }
        }
    }

    public LiveIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
