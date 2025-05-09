package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f7445a = 0;
    public int b = 0;
    public int c = 0;
    public float d = 1.0f;
    public int e = 0;
    public DXWidgetNode.d f;

    static {
        t2o.a(444597329);
    }

    public m a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("9e5609b0", new Object[]{this});
        }
        m mVar = new m();
        mVar.f7445a = this.f7445a;
        mVar.b = this.b;
        mVar.c = this.c;
        mVar.d = this.d;
        mVar.e = this.e;
        mVar.f = this.f;
        return mVar;
    }
}
