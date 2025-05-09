package tb;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o84 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f25208a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f25209a;
        public final /* synthetic */ int b;
        public final /* synthetic */ RemoteViews c;
        public final /* synthetic */ List d;
        public final /* synthetic */ long e;

        public a(Map map, int i, RemoteViews remoteViews, List list, long j) {
            this.f25209a = map;
            this.b = i;
            this.c = remoteViews;
            this.d = list;
            this.e = j;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            try {
                this.f25209a.put(Integer.valueOf(this.b), succPhenixEvent.getDrawable().getBitmap());
                o84.this.g(this.c, this.d, this.e, this.f25209a);
            } catch (Exception e) {
                hgh.c(a.class, "loadImage error: " + e);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f25210a;
        public final /* synthetic */ int b;
        public final /* synthetic */ RemoteViews c;
        public final /* synthetic */ List d;
        public final /* synthetic */ long e;

        public b(Map map, int i, RemoteViews remoteViews, List list, long j) {
            this.f25210a = map;
            this.b = i;
            this.c = remoteViews;
            this.d = list;
            this.e = j;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            try {
                this.f25210a.put(Integer.valueOf(this.b), succPhenixEvent.getDrawable().getBitmap());
                o84.this.g(this.c, this.d, this.e, this.f25210a);
            } catch (Exception e) {
                hgh.c(b.class, "loadImage error: " + e);
            }
            return false;
        }
    }

    static {
        t2o.a(437256250);
    }

    public o84() {
        new HashMap();
    }

    public void c(RemoteViews remoteViews, List<Integer> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755f96ec", new Object[]{this, remoteViews, list, new Long(j)});
            return;
        }
        for (Integer num : list) {
            AppWidgetManager.getInstance(this.f25208a).updateAppWidget(num.intValue(), remoteViews);
        }
        obx.f(this.f25208a).q(list, j);
    }

    public Bitmap d(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("cc237851", new Object[]{this, drawable});
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return createBitmap;
    }

    public Bitmap e(String str, String str2, String str3, boolean z) {
        float measureText;
        int b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("55474524", new Object[]{this, str, str2, str3, new Boolean(z)});
        }
        try {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor(str), Color.parseColor(str2)});
            gradientDrawable.setCornerRadius(edx.b(20.0f));
            Paint paint = new Paint();
            paint.setTextSize(edx.b(9.0f));
            if (z) {
                measureText = paint.measureText(str3);
                b2 = edx.b(22.0f);
            } else {
                measureText = paint.measureText(str3);
                b2 = edx.b(11.0f);
            }
            gradientDrawable.setSize((int) (measureText + b2), edx.b(14.0f));
            return d(gradientDrawable);
        } catch (Exception e) {
            Class<?> cls = getClass();
            hgh.c(cls, "generateBitmapBg error：" + e.getMessage());
            return null;
        }
    }

    public void f(RemoteViews remoteViews, int i, String str, ad2 ad2Var, List<Integer> list, long j, Map<Integer, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7414722c", new Object[]{this, remoteViews, new Integer(i), str, ad2Var, list, new Long(j), map});
        } else if (ad2Var == null) {
            s0m.B().N0(this.f25208a).T(str).succListener(new a(map, i, remoteViews, list, j)).fetch();
        } else {
            s0m.B().N0(this.f25208a).T(str).bitmapProcessors(ad2Var).succListener(new b(map, i, remoteViews, list, j)).fetch();
        }
    }

    public void g(RemoteViews remoteViews, List<Integer> list, long j, Map<Integer, Object> map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd4623b", new Object[]{this, remoteViews, list, new Long(j), map});
            return;
        }
        for (Integer num : map.keySet()) {
            num.intValue();
            if (map.get(num) instanceof String) {
                z = false;
            }
        }
        if (z) {
            k(remoteViews, map);
            c(remoteViews, list, j);
            Class<?> cls = getClass();
            hgh.c(cls, "hasLoad widgetId：" + list);
        }
    }

    public void h(RemoteViews remoteViews, int i, String str) {
        PendingIntent pendingIntent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c08c9c", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent();
            intent.setData(Uri.parse(str));
            intent.setFlags(805339136);
            if (Build.VERSION.SDK_INT >= 31) {
                pendingIntent = ya.c(this.f25208a, 0, intent, 201326592);
            } else {
                pendingIntent = ya.c(this.f25208a, 0, intent, 134217728);
            }
            remoteViews.setOnClickPendingIntent(i, pendingIntent);
        }
    }

    public void i(RemoteViews remoteViews, int i, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73691a", new Object[]{this, remoteViews, new Integer(i), bitmap});
        } else if (bitmap != null) {
            remoteViews.setImageViewBitmap(i, bitmap);
            o(remoteViews, i);
        }
    }

    public void j(RemoteViews remoteViews, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe7e064", new Object[]{this, remoteViews, new Integer(i)});
        } else {
            remoteViews.setViewVisibility(i, 8);
        }
    }

    public void k(RemoteViews remoteViews, Map<Integer, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59018958", new Object[]{this, remoteViews, map});
            return;
        }
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            if (map.get(num) instanceof Bitmap) {
                remoteViews.setImageViewBitmap(intValue, (Bitmap) map.get(num));
            }
        }
    }

    public void l(RemoteViews remoteViews, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66e1e84", new Object[]{this, remoteViews, new Integer(i)});
        } else {
            remoteViews.setViewVisibility(i, 4);
        }
    }

    public void m(RemoteViews remoteViews, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3495e0", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (!TextUtils.isEmpty(str)) {
            o(remoteViews, i);
            remoteViews.setTextViewText(i, str);
        } else {
            j(remoteViews, i);
        }
    }

    public void n(RemoteViews remoteViews, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b9e25", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                remoteViews.setTextColor(i, Color.parseColor(str));
            } catch (Exception e) {
                Class<?> cls = getClass();
                hgh.c(cls, "parseColor error: " + e);
            }
        }
    }

    public void o(RemoteViews remoteViews, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a2901f", new Object[]{this, remoteViews, new Integer(i)});
        } else {
            remoteViews.setViewVisibility(i, 0);
        }
    }
}
