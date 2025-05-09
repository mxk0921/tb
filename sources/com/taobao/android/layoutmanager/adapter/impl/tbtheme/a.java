package com.taobao.android.layoutmanager.adapter.impl.tbtheme;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.adapter.impl.tbtheme.TBDrawType;
import tb.sar;
import tb.t2o;
import tb.tar;
import tb.v2m;
import tb.xnr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final sar f8170a = new sar();
    public final tar b = new tar();

    static {
        t2o.a(502267977);
    }

    public int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9821d931", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        xnr.a("origin=" + Integer.toHexString(i2));
        if (i == 0) {
            int red = Color.red(i2);
            int green = Color.green(i2);
            int blue = Color.blue(i2);
            int alpha = Color.alpha(i2);
            if (red >= 250 && green >= 250 && blue >= 250 && alpha >= 125) {
                xnr.a("while text, do not change=" + Integer.toHexString(i2));
                return i2;
            }
        }
        v2m v2mVar = new v2m();
        this.f8170a.b(i2, v2mVar);
        if (v2mVar.f29747a) {
            xnr.a("found in colorMapping=" + Integer.toHexString(v2mVar.b));
            return v2mVar.b;
        }
        this.b.b(i2, v2mVar);
        if (v2mVar.f29747a) {
            xnr.a("wow found in colorRangeMapping=" + Integer.toHexString(v2mVar.b));
            return v2mVar.b;
        }
        xnr.a("draw type=" + TBDrawType.a.a(i) + "  ， color=" + Integer.toHexString(i2));
        return i2;
    }
}
