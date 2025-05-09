package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.searchbaseframe.ace.utils.AceEntryUtils;
import com.taobao.android.searchbaseframe.chitu.ChituPanelActivity;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.io.UnsupportedEncodingException;
import tb.f8b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wr3 implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SIGNAL = ":ChiTu";

    /* renamed from: a  reason: collision with root package name */
    public TUrlImageView f30866a;
    public TUrlImageView b;
    public View c;
    public Activity d;
    public String e;
    public int f;
    public int g;
    public GestureDetector h;
    public b i;
    public final yko j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends f8b.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/chitu/ChituToolBarModule$1");
        }

        @Override // tb.f8b.b
        public void b(nsj nsjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfadf5c0", new Object[]{this, nsjVar});
                return;
            }
            String str = "";
            try {
                if (nsjVar.a() != null) {
                    str = new String(nsjVar.a(), "utf-8");
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            wr3.a(wr3.this, ur3.a(str));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void M(View view);

        void e0();

        void e2();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(993001728);
        }

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 1575121015) {
                return new Boolean(super.onSingleTapUp((MotionEvent) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/chitu/ChituToolBarModule$GesListener");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
            } else if (wr3.f(wr3.this).e().a() && wr3.h(wr3.this) != null) {
                wr3.h(wr3.this).e2();
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
            }
            if (wr3.b(wr3.this) == wr3.c(wr3.this)) {
                Intent intent = new Intent(wr3.d(wr3.this), ChituPanelActivity.class);
                intent.putExtra("chituBiz", wr3.e(wr3.this));
                ChituPanelActivity.b = wr3.f(wr3.this);
                wr3.d(wr3.this).startActivity(intent);
            } else if (wr3.b(wr3.this) == wr3.g(wr3.this)) {
                AceEntryUtils.INSTANCE.f(wr3.d(wr3.this));
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    static {
        t2o.a(993001725);
    }

    public wr3(dr3 dr3Var, yko ykoVar) {
        this.j = ykoVar;
    }

    public static /* synthetic */ void a(wr3 wr3Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6082fa", new Object[]{wr3Var, str});
        } else {
            wr3Var.k(str);
        }
    }

    public static /* synthetic */ View b(wr3 wr3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f7bb3411", new Object[]{wr3Var});
        }
        return wr3Var.c;
    }

    public static /* synthetic */ TUrlImageView c(wr3 wr3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("501ceb4e", new Object[]{wr3Var});
        }
        return wr3Var.f30866a;
    }

    public static /* synthetic */ Activity d(wr3 wr3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("ea67027b", new Object[]{wr3Var});
        }
        return wr3Var.d;
    }

    public static /* synthetic */ String e(wr3 wr3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee86b74", new Object[]{wr3Var});
        }
        return wr3Var.e;
    }

    public static /* synthetic */ yko f(wr3 wr3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("e022e676", new Object[]{wr3Var});
        }
        return wr3Var.j;
    }

    public static /* synthetic */ TUrlImageView g(wr3 wr3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("b7442052", new Object[]{wr3Var});
        }
        return wr3Var.b;
    }

    public static /* synthetic */ b h(wr3 wr3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3dad839f", new Object[]{wr3Var});
        }
        return wr3Var.i;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b44a6546", new Object[]{this});
            return;
        }
        String str = this.j.d().c;
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("debugApp", "android");
        arrayMap.put("serviceType", ThemisConfig.SCENE_SELECT);
        arrayMap.put("utdid", this.j.g().getUtdid());
        f8b.c(this.j, new r7b(g6p.a(str, arrayMap)), new a());
        this.j.l().b("ChituToolBarModule", "check chitu white list");
    }

    public ImageView j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("9520647d", new Object[]{this});
        }
        return this.f30866a;
    }

    public void l(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0bba4cb", new Object[]{this, activity, str});
            return;
        }
        this.d = activity;
        this.e = str;
        if (this.h == null) {
            this.h = new GestureDetector(activity, new c());
        }
        if (this.j.e().a()) {
            n();
        } else if (!this.j.e().c() && this.j.e().b()) {
            i();
        }
    }

    public void m(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("632575c", new Object[]{this, bVar});
        } else {
            this.i = bVar;
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc59f67", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.e)) {
            if (this.f30866a == null) {
                TUrlImageView tUrlImageView = new TUrlImageView(this.d);
                this.f30866a = tUrlImageView;
                tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(p1p.a(43.0f), p1p.a(43.0f)));
                this.f30866a.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.f30866a.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01VDnCo422H6YnGF25K_!!6000000007094-2-tps-36-36.png");
                ((FrameLayout.LayoutParams) this.f30866a.getLayoutParams()).gravity = 80;
                ((FrameLayout.LayoutParams) this.f30866a.getLayoutParams()).setMargins(p1p.a(8.0f), 0, 0, p1p.a(48.0f));
                this.f30866a.setOnTouchListener(this);
            }
            this.f30866a.setVisibility(0);
            if (this.b == null) {
                TUrlImageView tUrlImageView2 = new TUrlImageView(this.d);
                this.b = tUrlImageView2;
                tUrlImageView2.setLayoutParams(new FrameLayout.LayoutParams(p1p.a(43.0f), p1p.a(43.0f)));
                this.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.b.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01F0qr7R1ckFl46yRb5_!!6000000003638-2-tps-61-60.png");
                ((FrameLayout.LayoutParams) this.b.getLayoutParams()).gravity = 80;
                ((FrameLayout.LayoutParams) this.b.getLayoutParams()).setMargins(p1p.a(8.0f), 0, 0, p1p.a(100.0f));
                this.b.setOnTouchListener(this);
            }
            this.b.setVisibility(0);
            b bVar = this.i;
            if (bVar != null) {
                bVar.e0();
                this.i.M(this.b);
            }
            oen.g(this.j.r().a().getString(TBSearchChiTuJSBridge.ABTEST, ""));
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int height = ((View) view.getParent()).getHeight();
        int width = ((View) view.getParent()).getWidth();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f = (int) motionEvent.getRawX();
            this.g = (int) motionEvent.getRawY();
        } else if (action == 1) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).setMargins(view.getLeft(), 0, 0, height - (view.getTop() + view.getHeight()));
        } else if (action == 2) {
            int top = view.getTop() + ((int) (motionEvent.getRawY() - this.g));
            int left = view.getLeft() + ((int) (motionEvent.getRawX() - this.f));
            if (top <= 0) {
                top = 0;
            }
            if (top >= height - view.getHeight()) {
                top = height - view.getHeight();
            }
            if (left > 0) {
                i = left;
            }
            if (i >= width - view.getWidth()) {
                i = width - view.getWidth();
            }
            view.layout(i, top, view.getWidth() + i, view.getHeight() + top);
            this.f = (int) motionEvent.getRawX();
            this.g = (int) motionEvent.getRawY();
        }
        this.c = view;
        this.h.onTouchEvent(motionEvent);
        return true;
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a1831b", new Object[]{this, str});
            return;
        }
        c4p l = this.j.l();
        l.b("ChituToolBarModule", "chitu white list:" + str);
        if ("success".equals(str)) {
            this.j.e().e(true);
            this.j.e().g(true);
            n();
            return;
        }
        this.j.e().d();
        Toast.makeText(this.d, str, 0).show();
    }
}
