package tb;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.parallelbiz.a;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kya extends stg implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView b;
    public TextView c;

    static {
        t2o.a(713031888);
    }

    public kya(Activity activity) {
        super(activity);
    }

    public static /* synthetic */ Object ipc$super(kya kyaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/search/ui/holder/itemholder/HistoryTipsHolder");
    }

    @Override // tb.uya
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return R.layout.babel_search_history_tips_holder;
    }

    @Override // tb.uya
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93576", new Object[]{this, view});
        } else if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.recommend_more_tv);
            this.b = textView;
            textView.setOnClickListener(this);
            this.c = (TextView) view.findViewById(R.id.history_tips_tv);
        }
    }

    @Override // tb.stg
    public void d(ka4 ka4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a066f9f5", new Object[]{this, ka4Var});
        } else if (ka4Var != null && (ka4Var instanceof jya)) {
            jya jyaVar = (jya) ka4Var;
            this.b.setText(jyaVar.b);
            this.c.setText(jyaVar.f22285a);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.recommend_more_tv) {
            hya.c(this.f29672a).b();
            a.c("Clear", null);
        }
    }
}
