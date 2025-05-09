package tb;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class diq extends biq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Field c;
    public static final Field d;
    public static final Field e;
    public static final Field f;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("android.app.ActivityThread$ActivityClientRecord");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            e = biq.d(cls, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            c = biq.d(cls, "referrer");
            d = biq.d(cls, "activityInfo");
            f = biq.d(cls, "state");
        }
    }

    public static /* synthetic */ Object ipc$super(diq diqVar, String str, Object... objArr) {
        if (str.hashCode() == 823304320) {
            return super.b((Message) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/safemode/StartupManagerUnder9");
    }

    @Override // tb.biq
    public xhq b(Message message) throws IllegalAccessException {
        String str;
        String str2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhq) ipChange.ipc$dispatch("3112a080", new Object[]{this, message});
        }
        if (message.what != 100) {
            return super.b(message);
        }
        Field field = e;
        if (field == null) {
            return null;
        }
        Intent intent = (Intent) biq.e(field, message.obj, null);
        String str3 = (String) biq.e(c, message.obj, null);
        ActivityInfo activityInfo = (ActivityInfo) biq.e(d, message.obj, null);
        if (activityInfo != null) {
            String str4 = activityInfo.processName;
            str = activityInfo.packageName;
            str2 = str4;
        } else {
            str2 = null;
            str = null;
        }
        if (biq.e(f, message.obj, null) != null) {
            z = true;
        } else {
            z = false;
        }
        return new xhq(str2, str, str3, intent, z);
    }
}
