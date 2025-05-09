package tb;

import android.app.Activity;
import android.content.DialogInterface;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class k63 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DialogInterface.OnClickListener f22427a;

        public a(DialogInterface.OnClickListener onClickListener) {
            this.f22427a = onClickListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            DialogInterface.OnClickListener onClickListener = this.f22427a;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    static {
        t2o.a(481296899);
    }

    public static void a(Activity activity, String str, DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e07d85", new Object[]{activity, str, onClickListener});
        } else if (activity != null && !activity.isFinishing()) {
            g9o.a(activity, Localization.q(R.string.taobao_app_1007_title), str, Localization.q(R.string.taobao_app_1007_confirm), new a(onClickListener), "", null);
        }
    }
}
