package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class dz1 extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f18168a;
    public final boolean b;

    static {
        t2o.a(806355819);
    }

    public dz1(Context context) {
        this(context, gq0.k().a(), false);
    }

    public static /* synthetic */ Object ipc$super(dz1 dz1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/view/BasePopupWindow");
    }

    public abstract View a();

    public WindowManager.LayoutParams b(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("c9bf7551", new Object[]{this, displayMetrics});
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (this.b) {
            attributes.gravity = 53;
            int i = displayMetrics.heightPixels;
            attributes.width = i;
            attributes.height = i;
        } else {
            attributes.gravity = 83;
            attributes.width = displayMetrics.widthPixels;
        }
        return attributes;
    }

    public dz1(Context context, int i) {
        this(context, i, false);
    }

    public dz1(Context context, int i, boolean z) {
        super(context, i);
        this.f18168a = context;
        this.b = z;
        setContentView(a());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context instanceof Activity) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            displayMetrics = context.getResources().getDisplayMetrics();
        }
        getWindow().setAttributes(b(displayMetrics));
        setCanceledOnTouchOutside(true);
    }
}
