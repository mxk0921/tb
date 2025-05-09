package tb;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ciq extends biq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Field c;
    public static final Field d;
    public static final Field e;
    public static final Field f;
    public static final Field g;

    static {
        Class<?> cls;
        try {
            c = biq.d(Class.forName("android.app.servertransaction.ClientTransaction"), "mActivityCallbacks");
            cls = Class.forName("android.app.servertransaction.LaunchActivityItem");
            d = biq.d(cls, "mIntent");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            g = biq.d(cls, "mReferrer");
            f = biq.d(cls, "mInfo");
            e = biq.f(cls, "mState");
        }
    }

    public static /* synthetic */ Object ipc$super(ciq ciqVar, String str, Object... objArr) {
        if (str.hashCode() == 823304320) {
            return super.b((Message) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/safemode/StartupManager9OrAbove");
    }

    @Override // tb.biq
    public xhq b(Message message) throws IllegalAccessException {
        Field field;
        List list;
        String str;
        String str2;
        boolean z;
        if (message.what != 159) {
            return super.b(message);
        }
        xhq xhqVar = null;
        Field field2 = c;
        if (field2 != null && (field = d) != null && (list = (List) field2.get(message.obj)) != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if ("android.app.servertransaction.LaunchActivityItem".equals(next.getClass().getName())) {
                    ActivityInfo activityInfo = (ActivityInfo) biq.e(f, next, null);
                    if (activityInfo != null) {
                        String str3 = activityInfo.processName;
                        str = activityInfo.packageName;
                        str2 = str3;
                    } else {
                        str2 = null;
                        str = null;
                    }
                    Intent intent = (Intent) biq.e(field, next, null);
                    String str4 = (String) biq.e(g, next, null);
                    if (biq.e(e, next, null) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    xhqVar = new xhq(str2, str, str4, intent, z);
                }
            }
        }
        return xhqVar;
    }
}
