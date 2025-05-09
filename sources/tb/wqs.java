package tb;

import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class wqs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TextView f30860a;
    public final TUrlImageView b;

    static {
        t2o.a(815793065);
    }

    public wqs(TextView textView, TUrlImageView tUrlImageView) {
        ckf.g(textView, "tabText");
        this.f30860a = textView;
        this.b = tUrlImageView;
    }

    public final TUrlImageView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("fa27079d", new Object[]{this});
        }
        return this.b;
    }

    public final TextView b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("caf1f027", new Object[]{this});
        }
        return this.f30860a;
    }
}
