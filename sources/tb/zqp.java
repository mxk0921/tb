package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static zqp c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f32951a;
    public WeakReference<ViewGroup> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f32952a;
        public final /* synthetic */ Context b;

        /* compiled from: Taobao */
        /* renamed from: tb.zqp$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C1117a implements fy0 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C1117a() {
            }

            @Override // tb.fy0
            public boolean onLoopCompleted(int i, int i2) {
                boolean z = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("a7565d93", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                }
                if (i == 0) {
                    z = true;
                }
                if (!z) {
                    a.this.f32952a.setVisibility(8);
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(a.this.b).edit();
                    edit.putBoolean("hasPlayedStoreFlower", true);
                    edit.apply();
                }
                return z;
            }
        }

        public a(zqp zqpVar, TUrlImageView tUrlImageView, Context context) {
            this.f32952a = tUrlImageView;
            this.b = context;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable instanceof cy0) {
                    ((cy0) drawable).A(new C1117a());
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(zqp zqpVar) {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            return false;
        }
    }

    static {
        t2o.a(912261818);
    }

    public static zqp a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zqp) ipChange.ipc$dispatch("6199d2e4", new Object[0]);
        }
        if (c == null) {
            c = new zqp();
        }
        return c;
    }

    public void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db7300b7", new Object[]{this, viewGroup});
        } else if (!this.f32951a) {
            this.b = new WeakReference<>(viewGroup);
        }
    }

    public final void c(Context context, String str) {
        WeakReference<ViewGroup> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ed440c4", new Object[]{this, context, str});
        } else if (!TextUtils.isEmpty(str) && (weakReference = this.b) != null) {
            ViewGroup viewGroup = weakReference.get();
            if (context != null) {
                try {
                    TUrlImageView tUrlImageView = new TUrlImageView(context);
                    viewGroup.addView(tUrlImageView, new ViewGroup.LayoutParams(-1, -1));
                    tUrlImageView.setScaleType(ImageView.ScaleType.FIT_START);
                    tUrlImageView.succListener(new a(this, tUrlImageView, context));
                    tUrlImageView.failListener(new b(this));
                    tUrlImageView.setImageUrl(str);
                } catch (Exception e) {
                    tgh.b("ShopTreasureFlowerHelper", "showFlowers falid=" + e.getMessage());
                }
            }
        }
    }

    public void d(Resource resource, Context context) {
        Resource.b animation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a429ac0", new Object[]{this, resource, context});
        } else if (resource != null && context != null && (animation = resource.getAnimation()) != null && !this.f32951a) {
            boolean z = PreferenceManager.getDefaultSharedPreferences(context).getBoolean("hasPlayedStoreFlower", false);
            this.f32951a = z;
            if (!z) {
                String c2 = animation.c();
                String b2 = animation.b();
                if ("flowers".equals(c2)) {
                    c(context, b2);
                }
            }
        }
    }
}
