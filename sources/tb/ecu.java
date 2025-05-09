package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.util.TrackerType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ecu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$tracker$util$TrackerType;

        static {
            int[] iArr = new int[TrackerType.values().length];
            $SwitchMap$com$taobao$android$tracker$util$TrackerType = iArr;
            try {
                iArr[TrackerType.TrackerType_Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$tracker$util$TrackerType[TrackerType.TrackerType_Exposure.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        t2o.a(455082042);
    }

    public static boolean a(TrackerType trackerType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6ad1527", new Object[]{trackerType, str})).booleanValue();
        }
        int i = a.$SwitchMap$com$taobao$android$tracker$util$TrackerType[trackerType.ordinal()];
        if (i == 1) {
            return c(str);
        }
        if (i != 2) {
            return false;
        }
        return d(str);
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("794d8263", new Object[]{str})).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return (str.indexOf("click") == -1 || str.indexOf(ybu.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP) == -1) ? (str.indexOf("click") == -1 && str.indexOf(ybu.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP) != -1) ? 2001 : 2101 : ybu.EVENTID_PAG_AND_CLICK;
        }
        return 2101;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a8c93a8", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.indexOf("exposure") != -1) {
            return true;
        }
        return false;
    }

    public static vp8 e(acu acuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vp8) ipChange.ipc$dispatch("91d50189", new Object[]{acuVar});
        }
        if (acuVar == null) {
            return null;
        }
        vp8 vp8Var = new vp8();
        vp8Var.viewId = ydq.c(acuVar);
        vp8Var.block = acuVar.f;
        return vp8Var;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f146e251", new Object[]{str})).booleanValue();
        }
        return (!TextUtils.isEmpty(str) && str.indexOf("click") == -1 && str.indexOf(ybu.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP) == -1) ? false : true;
    }
}
