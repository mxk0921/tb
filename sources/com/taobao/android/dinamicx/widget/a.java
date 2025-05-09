package com.taobao.android.dinamicx.widget;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a implements t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.widget.t
    public String a(String str, int i, int i2, DXImageWidgetNode.g gVar) {
        ImageStrategyConfig.b bVar;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93037d9a", new Object[]{this, str, new Integer(i), new Integer(i2), gVar});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (TextUtils.isEmpty(gVar.e) || (i3 = gVar.f) <= -1) {
                bVar = ImageStrategyConfig.u(gVar.e);
            } else {
                bVar = ImageStrategyConfig.v(gVar.e, i3);
            }
            if (gVar.k() == 2) {
                bVar.g(true);
            }
            if (gVar.z() && "heightLimit".equals(gVar.j)) {
                bVar.l(ImageStrategyConfig.SizeLimitType.HEIGHT_LIMIT);
            }
            bVar.i(b.d(gVar));
            return ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), bVar.a());
        } catch (Throwable unused) {
            return null;
        }
    }
}
