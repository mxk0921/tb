package tb;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.order.core.subscriber.data.OperateFields;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class c2u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f16801a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wle f16802a;

        public a(wle wleVar) {
            this.f16802a = wleVar;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            wle wleVar = this.f16802a;
            StringBuilder sb = new StringBuilder("加载失败，phenix fail code is ");
            if (failPhenixEvent != null) {
                obj = Integer.valueOf(failPhenixEvent.getResultCode());
            } else {
                obj = "-1";
            }
            sb.append(obj);
            wleVar.a(new Exception(sb.toString()));
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wle f16803a;

        public b(wle wleVar) {
            this.f16803a = wleVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if ((succPhenixEvent == null || succPhenixEvent.getDrawable() != null) && !succPhenixEvent.isIntermediate()) {
                this.f16803a.b(succPhenixEvent.getUrl(), succPhenixEvent.getDrawable().getBitmap());
                return true;
            }
            this.f16803a.a(new Exception(Localization.q(R.string.app_load_failed)));
            return true;
        }
    }

    static {
        t2o.a(297795637);
    }

    public static String b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f31b0b24", new Object[]{str, jSONObject});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!(entry == null || TextUtils.isEmpty(entry.getKey()) || entry.getValue() == null)) {
                buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return buildUpon.build().toString();
    }

    public static Button c(Context context, OperateFields operateFields, int i, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("924fb21", new Object[]{context, operateFields, new Integer(i), onClickListener});
        }
        Button button = (Button) LayoutInflater.from(context).inflate(R.layout.order_list_item_button, (ViewGroup) null);
        button.setFocusable(false);
        button.setText(operateFields.getName());
        if (onClickListener != null) {
            button.setOnClickListener(onClickListener);
        }
        button.setVisibility(0);
        button.setTag(operateFields);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, context.getResources().getDimensionPixelSize(R.dimen.operate_btn_height));
        layoutParams.leftMargin = i;
        button.setLayoutParams(layoutParams);
        return button;
    }

    public static JSONObject d(b8v b8vVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91965a42", new Object[]{b8vVar});
        }
        if (b8vVar == null) {
            obj = null;
        } else {
            obj = b8vVar.f();
        }
        if (obj instanceof DMEvent) {
            return ((DMEvent) obj).getFields();
        }
        return null;
    }

    public static Intent f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("b8ee0a7d", new Object[]{context});
        }
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        return intent;
    }

    public static float g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb371fab", new Object[]{context})).floatValue();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.density;
        }
        return 2.0f;
    }

    public static int h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        return ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getHeight();
    }

    public static boolean i(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("543543f0", new Object[]{viewGroup})).booleanValue();
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ImageView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && i((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(fsb fsbVar) {
        JSONObject u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5d771fd", new Object[]{fsbVar})).booleanValue();
        }
        if (uel.a() && (fsbVar instanceof u55) && (u = ((u55) fsbVar).u()) != null) {
            return Boolean.parseBoolean(u.getString("degrade"));
        }
        return false;
    }

    public static boolean k(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7263359", new Object[]{activity})).booleanValue();
        }
        View findViewById = activity.findViewById(16908336);
        if (findViewById == null || 8 == findViewById.getVisibility() || 4 == findViewById.getVisibility()) {
            return false;
        }
        return true;
    }

    public static void l(String str, wle wleVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35711fa0", new Object[]{str, wleVar});
        } else {
            s0m.B().T(str).succListener(new b(wleVar)).failListener(new a(wleVar)).fetch();
        }
    }

    public static boolean m(List<JSONObject> list, fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd42b646", new Object[]{list, fsbVar})).booleanValue();
        }
        if (list == null || list.size() < 1) {
            return false;
        }
        for (JSONObject jSONObject : list) {
            mrl mrlVar = new mrl();
            if (fsbVar instanceof u55) {
                try {
                    mrlVar.a((u55) fsbVar, jSONObject, null);
                } catch (Throwable th) {
                    ldv.e(null, "ParseService-ERROR", th.toString(), null);
                    th.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }

    public static void n(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{runnable});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            jb6.n(runnable);
        }
    }

    public static int e(Activity activity) {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a70058bc", new Object[]{activity})).intValue();
        }
        if (activity == null || !k(activity) || (identifier = activity.getResources().getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return activity.getResources().getDimensionPixelSize(identifier);
    }

    public static int o(Context context) {
        WindowManager windowManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15d1a141", new Object[]{context})).intValue();
        }
        int i = f16801a;
        if (i != 0) {
            return i;
        }
        if (context == null || (windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window)) == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int i2 = point.y;
        f16801a = i2;
        return i2;
    }

    public static boolean a(Context context) {
        boolean areNotificationsEnabled;
        if (Build.VERSION.SDK_INT >= 24) {
            areNotificationsEnabled = ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled();
            return areNotificationsEnabled;
        }
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        try {
            String packageName = context.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (Throwable unused) {
            return true;
        }
    }
}
