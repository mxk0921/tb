package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n6m extends Dialog implements DialogInterface.OnDismissListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f24539a = new Handler();
    public final Context b;
    public boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                n6m.this.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if ((n6m.a(n6m.this) instanceof Activity) && !((Activity) n6m.a(n6m.this)).isDestroyed()) {
                n6m.this.dismiss();
            }
        }
    }

    static {
        t2o.a(295699544);
    }

    public n6m(Context context) {
        super(context, R.style.TLLive_Permission_Dialog_AType);
        this.b = context;
        setContentView(R.layout.taolive_play_rate_guide_layout_flexalocal);
        setOnDismissListener(this);
    }

    public static /* synthetic */ Context a(n6m n6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("88a380c5", new Object[]{n6mVar});
        }
        return n6mVar.b;
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21bf2d54", new Object[0])).longValue();
        }
        return zqq.e(v2s.o().p().b("tblive", "playRateGuideRemoveDelayTime", "5")) * 1000.0f;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0899aa1", new Object[0]);
        }
        return v2s.o().p().b("tblive", "swipePlaySpeedGuideIcon", "https://gw.alicdn.com/imgextra/i4/O1CN01D4iB6U1HwyydNWc2x_!!6000000000823-2-tps-240-241.png");
    }

    public static /* synthetic */ Object ipc$super(n6m n6mVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/playspeed/PlaySpeedGuideDialog");
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13fe2389", new Object[]{this});
        }
        if (!vc.a() || !vc.f(this.b)) {
            if (this.c) {
                return "https://gw.alicdn.com/imgextra/i1/O1CN013cUG5r1TbhyCTgquj_!!6000000002401-2-tps-3248-1500.png";
            }
            return "https://gw.alicdn.com/imgextra/i4/O1CN01sbMf2X1ezUJ4mufEs_!!6000000003942-2-tps-1500-3248.png";
        } else if (vc.i(this.b)) {
            return "https://gw.alicdn.com/imgextra/i3/O1CN01UIehtE1EUBDuPn0KY_!!6000000000354-2-tps-4776-3248.png";
        } else {
            if (vc.d(this.b)) {
                return "https://gw.alicdn.com/imgextra/i1/O1CN0137pScx1T3MGTp5lV8_!!6000000002326-2-tps-2880-3250.png";
            }
            return "https://gw.alicdn.com/imgextra/i1/O1CN013cUG5r1TbhyCTgquj_!!6000000002401-2-tps-3248-1500.png";
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb83a50", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        if (z && !isShowing() && getWindow() != null) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.height = iw0.e(this.b);
            attributes.width = iw0.h(this.b);
            getWindow().setAttributes(attributes);
        }
        show();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (getWindow() != null) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.height = iw0.e(this.b);
            attributes.width = iw0.h(this.b);
            getWindow().setAttributes(attributes);
        }
        ViewProxy.setOnClickListener(findViewById(R.id.taolive_play_speed_root), new a());
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.taolive_play_speed_guide_bg);
        tUrlImageView.setSkipAutoSize(false);
        TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById(R.id.taolive_play_speed_guide_gesture_view);
        tUrlImageView2.setSkipAutoSize(false);
        tUrlImageView.setImageUrl(c());
        tUrlImageView2.setImageUrl(d());
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
        } else {
            this.f24539a.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        this.f24539a.postDelayed(new b(), b());
    }
}
