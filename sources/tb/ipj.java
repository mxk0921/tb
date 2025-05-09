package tb;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ipj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ipj INSTANCE = new ipj();

    /* renamed from: a  reason: collision with root package name */
    public static int f21491a;

    static {
        t2o.a(481297629);
    }

    public final int a(AppCompatActivity appCompatActivity) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8b840e5", new Object[]{this, appCompatActivity})).intValue();
        }
        ckf.g(appCompatActivity, "activity");
        try {
            View findViewById = appCompatActivity.findViewById(R.id.action_bar);
            if (findViewById != null) {
                i = findViewById.getHeight();
                if (i == 0) {
                    i = f21491a;
                } else {
                    f21491a = i;
                }
            }
        } catch (Exception unused) {
        }
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            appCompatActivity.getTheme().resolveAttribute(16843499, typedValue, true);
            i = appCompatActivity.getResources().getDimensionPixelSize(typedValue.resourceId);
        }
        if (i == 0) {
            i = 182;
        }
        f21491a = i;
        return i;
    }

    public final Integer b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("e81a5592", new Object[]{this, activity});
        }
        ckf.g(activity, "activity");
        Resources resources = activity.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return Integer.valueOf(resources.getDimensionPixelSize(identifier));
        }
        return null;
    }
}
