package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.tool.base.CaptureManager;
import com.etao.feimagesearch.capture.tool.bottom.CaptureToolBottomWidget;
import com.etao.feimagesearch.struct.ViewWidget;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class i73 extends ViewWidget<RelativeLayout, CaptureManager, i73> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile CaptureManager l;
    public volatile clb m;
    public volatile View n;
    public TUrlImageView o;
    public TextView p;
    public boolean q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                i73.this.E().finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            i73 i73Var = i73.this;
            i73.i0(i73Var, true ^ i73.h0(i73Var));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                i73.this.W().b().a("take_photo", i73.this.j0());
            }
        }
    }

    static {
        t2o.a(481296829);
        t2o.a(481296762);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i73(Activity activity, Object obj, CaptureManager captureManager, xfw xfwVar, clb clbVar) {
        super(activity, obj, captureManager, xfwVar, false, false, 48, null);
        ckf.g(activity, "activity");
        ckf.g(captureManager, "captureManager");
        ckf.g(xfwVar, "viewSetter");
        ckf.g(clbVar, "cameraOperateListener");
        this.l = captureManager;
        this.m = clbVar;
    }

    public static final /* synthetic */ boolean h0(i73 i73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7545e4fc", new Object[]{i73Var})).booleanValue();
        }
        return i73Var.q;
    }

    public static final /* synthetic */ void i0(i73 i73Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3450f80e", new Object[]{i73Var, new Boolean(z)});
        } else {
            i73Var.l0(z);
        }
    }

    public static /* synthetic */ Object ipc$super(i73 i73Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/ui/CaptureToolUIWidget");
    }

    public final clb j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (clb) ipChange.ipc$dispatch("8e46df20", new Object[]{this});
        }
        return this.m;
    }

    public final void l0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae5ddc3", new Object[]{this, new Boolean(z)});
        } else if (z != this.q) {
            mzu.i("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "5");
            if (z) {
                TUrlImageView tUrlImageView = this.o;
                if (tUrlImageView != null) {
                    tUrlImageView.setImageUrl("https://img.alicdn.com/tfs/TB1OVsH0hz1gK0jSZSgXXavwpXa-33-39.png");
                    TUrlImageView tUrlImageView2 = this.o;
                    if (tUrlImageView2 != null) {
                        tUrlImageView2.setContentDescription(Localization.q(R.string.taobao_app_1007_1_18931));
                        TextView textView = this.p;
                        if (textView != null) {
                            textView.setText(Localization.q(R.string.taobao_app_1007_1_18927));
                            this.l.b().a(r73.EVENT_OPERATE_FLASH_LIGHT, Boolean.TRUE);
                        } else {
                            ckf.y("tvFlash");
                            throw null;
                        }
                    } else {
                        ckf.y("ivFlash");
                        throw null;
                    }
                } else {
                    ckf.y("ivFlash");
                    throw null;
                }
            } else {
                TUrlImageView tUrlImageView3 = this.o;
                if (tUrlImageView3 != null) {
                    tUrlImageView3.setImageUrl("https://img.alicdn.com/tfs/TB1y83HnjMZ7e4jSZFOXXX7epXa-41-53.png");
                    TUrlImageView tUrlImageView4 = this.o;
                    if (tUrlImageView4 != null) {
                        tUrlImageView4.setContentDescription(Localization.q(R.string.taobao_app_1007_1_18913));
                        TextView textView2 = this.p;
                        if (textView2 != null) {
                            textView2.setText(Localization.q(R.string.taobao_app_1007_1_18937));
                            this.l.b().a(r73.EVENT_OPERATE_FLASH_LIGHT, Boolean.FALSE);
                        } else {
                            ckf.y("tvFlash");
                            throw null;
                        }
                    } else {
                        ckf.y("ivFlash");
                        throw null;
                    }
                } else {
                    ckf.y("ivFlash");
                    throw null;
                }
            }
            this.q = z;
        }
    }

    /* renamed from: k0 */
    public RelativeLayout b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("f5824c57", new Object[]{this});
        }
        View inflate = LayoutInflater.from(E()).inflate(R.layout.feis_view_capture_tool_ui, (ViewGroup) null, false);
        if (inflate != null) {
            RelativeLayout relativeLayout = (RelativeLayout) inflate;
            ((ImageView) relativeLayout.findViewById(R.id.feis_capture_btn_back)).setOnClickListener(new a());
            View findViewById = relativeLayout.findViewById(R.id.ll_flashlight);
            ViewProxy.setOnClickListener(findViewById, new b());
            ckf.f(findViewById, "findViewById<View>(R.id.…shOpen)\n        }\n      }");
            this.n = findViewById;
            View findViewById2 = relativeLayout.findViewById(R.id.feis_capture_btn_light);
            ckf.f(findViewById2, "findViewById(R.id.feis_capture_btn_light)");
            this.o = (TUrlImageView) findViewById2;
            View findViewById3 = relativeLayout.findViewById(R.id.feis_capture_btn_light_alert);
            ckf.f(findViewById3, "findViewById(R.id.feis_capture_btn_light_alert)");
            this.p = (TextView) findViewById3;
            ViewGroup.LayoutParams layoutParams = relativeLayout.findViewById(R.id.tab_pai).getLayoutParams();
            if (layoutParams != null) {
                ((RelativeLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, CaptureToolBottomWidget.Companion.b(E()) + p1p.a(10.0f));
                View findViewById4 = relativeLayout.findViewById(R.id.iv_take);
                TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
                tUrlImageView.setImageResource(R.drawable.feis_ic_take);
                tUrlImageView.setContentDescription(Localization.q(R.string.taobao_app_1007_1_18964));
                tUrlImageView.setOnClickListener(new c());
                ckf.f(findViewById4, "findViewById<TUrlImageVi…      )\n        }\n      }");
                TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById4;
                View findViewById5 = relativeLayout.findViewById(R.id.tv_user_hint);
                ckf.f(findViewById5, "findViewById(R.id.tv_user_hint)");
                TextView textView = (TextView) findViewById5;
                return relativeLayout;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
    }
}
