package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltb/aaz;", "Ltb/na4;", "Lcom/alibaba/fastjson/JSONObject;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "tbi_uniContainer_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class aaz extends na4<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context h;

    static {
        t2o.a(804257832);
    }

    public aaz(Context context) {
        ckf.g(context, "context");
        this.h = context;
    }

    public static /* synthetic */ Object ipc$super(aaz aazVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/industry/tbiunicontainer/core/component/ImgTxtComponent");
    }

    @Override // tb.na4
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
        }
    }

    @Override // tb.na4
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // tb.na4
    public View d() {
        JSONObject a2;
        JSONObject a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        LinearLayout linearLayout = new LinearLayout(this.h);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        ImageView imageView = new ImageView(this.h);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        imageView.setLayoutParams(layoutParams);
        TextView textView = new TextView(this.h);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        textView.setLayoutParams(layoutParams2);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        mb4<JSONObject> b = b();
        String str = null;
        Integer integer = (b == null || (a3 = b.a()) == null) ? null : a3.getInteger("resId");
        mb4<JSONObject> b2 = b();
        if (!(b2 == null || (a2 = b2.a()) == null)) {
            str = a2.getString("text");
        }
        if (integer != null) {
            imageView.setImageResource(integer.intValue());
        }
        if (str != null) {
            textView.setText(str);
        }
        return linearLayout;
    }
}
