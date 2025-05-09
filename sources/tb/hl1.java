package tb;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hl1 extends ContentObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f20716a;
    public final ContentResolver b;
    public int c;
    public boolean d = false;

    public hl1(Handler handler, Activity activity, int i) {
        super(handler);
        this.f20716a = activity;
        this.b = activity.getContentResolver();
        this.c = i;
    }

    public static int b(ContentResolver contentResolver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3461e9ca", new Object[]{contentResolver})).intValue();
        }
        if (contentResolver == null) {
            return -2;
        }
        try {
            return Settings.System.getInt(contentResolver, "accelerometer_rotation");
        } catch (Settings.SettingNotFoundException e) {
            TLog.loge("TBAutoSize.AutoRotation", "getAccelerometerRotationState", e);
            return -3;
        }
    }

    public static hl1 c(Activity activity) {
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hl1) ipChange.ipc$dispatch("5899ff89", new Object[]{activity});
        }
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        int i = R.id.auto_rotation_operator;
        Object tag = decorView.getTag(i);
        if (tag instanceof hl1) {
            return (hl1) tag;
        }
        hl1 hl1Var = new hl1(new Handler(Looper.getMainLooper()), activity, activity.getRequestedOrientation());
        decorView.setTag(i, hl1Var);
        return hl1Var;
    }

    public static /* synthetic */ Object ipc$super(hl1 hl1Var, String str, Object... objArr) {
        if (str.hashCode() == -1222901218) {
            super.onChange(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/autosize/orientation/AutoRotationOperator");
    }

    public void a(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e37273f", new Object[]{this, new Integer(i)});
            return;
        }
        int b = b(this.b);
        if (ig4.m().v(this.f20716a)) {
            i2 = 14;
        } else {
            i2 = -1;
        }
        if (b == 0) {
            cfl.b(this.f20716a, i2);
            this.c = i;
        }
        if (b == 1) {
            cfl.b(this.f20716a, i);
            this.c = i;
        }
    }

    public final void d() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f62909", new Object[]{this});
            return;
        }
        int requestedOrientation = this.f20716a.getRequestedOrientation();
        if (requestedOrientation != 0 && requestedOrientation != 1) {
            int i2 = -1;
            if (ig4.m().v(this.f20716a) || requestedOrientation != -1) {
                int b = b(this.b);
                if (b == 0) {
                    if (ig4.m().v(this.f20716a)) {
                        i2 = 14;
                    }
                    if (requestedOrientation != i2) {
                        cfl.b(this.f20716a, i2);
                        this.c = requestedOrientation;
                    }
                }
                if (b == 1 && (i = this.c) != requestedOrientation) {
                    cfl.b(this.f20716a, i);
                }
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192411df", new Object[]{this});
            return;
        }
        this.b.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, this);
        this.d = true;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46e6e57f", new Object[]{this});
        } else if (this.d) {
            this.b.unregisterContentObserver(this);
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onChange(z);
        d();
    }
}
