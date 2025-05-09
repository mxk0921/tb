package com.taobao.android.nanocompose.base.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.g1a;
import tb.haz;
import tb.p9z;
import tb.t2o;
import tb.waz;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NCComponentBox extends ViewGroup implements p9z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public waz layoutNode;

    static {
        t2o.a(598736919);
        t2o.a(598736916);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NCComponentBox(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static final /* synthetic */ void access$setMeasuredDimension(NCComponentBox nCComponentBox, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82fdce5", new Object[]{nCComponentBox, new Integer(i), new Integer(i2)});
        } else {
            nCComponentBox.setMeasuredDimension(i, i2);
        }
    }

    public static /* synthetic */ Object ipc$super(NCComponentBox nCComponentBox, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/base/component/NCComponentBox");
    }

    @Override // tb.p9z
    public void bindMeasureLayoutScope(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca244521", new Object[]{this, wazVar});
        } else {
            p9z.a.a(this, wazVar);
        }
    }

    @Override // tb.p9z
    public waz getLayoutNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (waz) ipChange.ipc$dispatch("96cd5d5e", new Object[]{this});
        }
        waz wazVar = this.layoutNode;
        if (wazVar != null) {
            return wazVar;
        }
        ckf.y("layoutNode");
        throw null;
    }

    public void onLayout(View view, boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beecb5f2", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            p9z.a.b(this, view, z, i, i2, i3, i4);
        }
    }

    public void onMeasure(View view, int i, int i2, g1a<? super haz, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651706b2", new Object[]{this, view, new Integer(i), new Integer(i2), g1aVar});
        } else {
            p9z.a.c(this, view, i, i2, g1aVar);
        }
    }

    @Override // tb.p9z
    public void setLayoutNode(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff371c6", new Object[]{this, wazVar});
            return;
        }
        ckf.g(wazVar, "<set-?>");
        this.layoutNode = wazVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            onLayout(this, z, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            onMeasure(this, i, i2, new NCComponentBox$onMeasure$1(this));
        }
    }
}
