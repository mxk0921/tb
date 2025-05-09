package android.taobao.windvane.embed;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Empty extends BaseEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855826);
    }

    public static /* synthetic */ Object ipc$super(Empty empty, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/embed/Empty");
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        TextView textView = new TextView(context);
        textView.setBackgroundColor(0);
        textView.setGravity(17);
        return textView;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        return "empty";
    }
}
