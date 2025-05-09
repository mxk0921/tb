package tb;

import android.content.Context;
import android.util.AttributeSet;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.alilive.adapter.uikit.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.adapterimpl.uikit.TaoliveUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wbt implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092382);
        t2o.a(806354978);
    }

    @Override // com.alilive.adapter.uikit.b
    public AliUrlImageView.a a(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUrlImageView.a) ipChange.ipc$dispatch("107b3f42", new Object[]{this, context, attributeSet, new Integer(i)});
        }
        return new TaoliveUrlImageView(context, attributeSet, i);
    }
}
