package com.taobao.android.weex_uikit.widget.video;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.video.c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a implements a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UINode f10030a;
    public final c.d b;

    static {
        t2o.a(986710277);
        t2o.a(982516018);
    }

    public a(UINode uINode, c.d dVar) {
        this.f10030a = uINode;
        this.b = dVar;
    }

    @Override // com.taobao.android.weex_framework.a.b
    public void onNativeStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63f0e06", new Object[]{this, str, str2});
        } else if (TextUtils.equals(str, "visibility")) {
            if ("disappear".equals(str2)) {
                c.T(this.f10030a);
                if (!this.b.f10034a) {
                    c.c(this.f10030a, "pause", null);
                    this.b.f10034a = true;
                    return;
                }
                return;
            }
            UINode uINode = this.f10030a;
            c.W(uINode, uINode.getNativeState("videostatus"), this.b);
            c.V(this.f10030a, str2);
        } else if (!c.j(this.f10030a)) {
            c.W(this.f10030a, str2, this.b);
        }
    }
}
