package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class v2u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29752a;
    public final View b;
    public final AliUrlImageView c;
    public final AliUrlImageView d;
    public final AliUrlImageView e;
    public final AliUrlImageView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final LinearLayout j;
    public final b k;
    public final c l;
    public final ux9 m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int CERTIFICATE_ANIM_END = 2;
        public static final int CERTIFICATE_ANIM_MIDDLE = 1;
        public static final int CERTIFICATE_ANIM_START = 0;
        public static final int COMMENT_COUNT_ANIM_END = 5;
        public static final int COMMENT_COUNT_ANIM_MIDDLE = 4;
        public static final int COMMENT_COUNT_ANIM_START = 3;

        /* renamed from: a  reason: collision with root package name */
        private final int f29753a;

        static {
            t2o.a(295698608);
        }

        public a(int i) {
            this.f29753a = i;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            v2u.this.b.clearAnimation();
            animation.setAnimationListener(null);
            v2u.this.g(this.f29753a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    static {
        t2o.a(295698607);
    }

    public v2u(Context context, View view, b bVar, c cVar, ux9 ux9Var) {
        this.f29752a = context;
        this.k = bVar;
        this.l = cVar;
        this.m = ux9Var;
        this.j = (LinearLayout) view.findViewById(R.id.certificate_text);
        this.h = (TextView) view.findViewById(R.id.certificate_title);
        View findViewById = view.findViewById(R.id.certificate_layout);
        this.b = findViewById;
        this.d = (AliUrlImageView) view.findViewById(R.id.certificate_tag_icon);
        this.e = (AliUrlImageView) view.findViewById(R.id.brand_icon);
        this.g = (TextView) view.findViewById(R.id.certificate_tag_name);
        this.c = (AliUrlImageView) view.findViewById(R.id.certificate_background);
        this.i = (TextView) view.findViewById(R.id.comment_count_textview);
        AliUrlImageView aliUrlImageView = (AliUrlImageView) view.findViewById(R.id.atmosphere_icon);
        this.f = aliUrlImageView;
        aliUrlImageView.setSkipAutoSize(true);
        findViewById.setVisibility(8);
    }

    public void a(TopAtmosphereMessage topAtmosphereMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa33766", new Object[]{this, topAtmosphereMessage});
        } else if (topAtmosphereMessage != null && topAtmosphereMessage.data != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("msgSubType", topAtmosphereMessage.msgSubType + "");
            hashMap.put("data", JSON.toJSONString(topAtmosphereMessage.data));
            giv.f().p(this.m, z9u.SHOW_ATMOSPHERE, hashMap);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a08389", new Object[]{this, str});
            return;
        }
        this.i.setText(c(str));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setFillAfter(true);
        this.i.startAnimation(scaleAnimation);
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82190b2c", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "x" + str + "  ";
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view != null) {
            view.clearAnimation();
            this.b.setVisibility(8);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fad8305", new Object[]{this});
            return;
        }
        this.e.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
        layoutParams.setMargins(hw0.b(this.f29752a, 13.0f), layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
        this.j.setLayoutParams(layoutParams);
    }

    public abstract boolean f();

    public abstract void g(int i);

    public abstract void h(TopAtmosphereMessage topAtmosphereMessage);

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b92335a", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f29752a, R.anim.taolive_certification_in_flexalocal);
            this.b.setVisibility(0);
            loadAnimation.setDuration(500L);
            loadAnimation.setInterpolator(new DecelerateInterpolator());
            loadAnimation.setAnimationListener(new a(i));
            this.b.clearAnimation();
            this.b.startAnimation(loadAnimation);
        } catch (Throwable th) {
            o3s.b("TopAtmosphereView", "startAnimation e: " + th.getMessage());
        }
    }
}
