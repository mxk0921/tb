package tb;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ImagePopTask;
import com.etao.feimagesearch.TaoInit;
import com.etao.feimagesearch.guide.PltNewUser;
import com.etao.feimagesearch.ui.CornerImageView;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.StringUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eoe extends abx implements View.OnClickListener, ImagePopTask.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String m = "";

    /* renamed from: a  reason: collision with root package name */
    public final Handler f18728a = new Handler(Looper.getMainLooper());
    public final Runnable b = new a();
    public final Runnable c = new b();
    public PopupWindow d;
    public View e;
    public String f;
    public boolean g;
    public Map<String, String> h;
    public String i;
    public final View j;
    public final ViewGroup k;
    public final SearchBarWidget l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                eoe.this.u2();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (eoe.q2(eoe.this) != null && !eoe.s2(eoe.this).isFinishing() && eoe.t2(eoe.this) != null) {
                eoe.t2(eoe.this).dismiss();
            }
        }
    }

    static {
        t2o.a(815793227);
        t2o.a(481296397);
    }

    public eoe(Activity activity, SearchBarWidget searchBarWidget, View view, ViewGroup viewGroup) {
        super(activity, searchBarWidget);
        this.j = view;
        this.k = viewGroup;
        this.l = searchBarWidget;
        subscribeEvent(this);
    }

    public static /* synthetic */ Object ipc$super(eoe eoeVar, String str, Object... objArr) {
        if (str.hashCode() == 299066517) {
            super.onCtxPause();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/imagesearch/ImageSearchGuideWidget");
    }

    public static /* synthetic */ Activity q2(eoe eoeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c90ef942", new Object[]{eoeVar});
        }
        return eoeVar.mActivity;
    }

    public static /* synthetic */ Activity s2(eoe eoeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f2767221", new Object[]{eoeVar});
        }
        return eoeVar.mActivity;
    }

    public static /* synthetic */ PopupWindow t2(eoe eoeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("dbba130c", new Object[]{eoeVar});
        }
        return eoeVar.d;
    }

    public void A2(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f288cc0", new Object[]{this, activity});
            return;
        }
        View view = this.e;
        if (view == null || view.getVisibility() == 8) {
            try {
                caa.c();
            } catch (Exception unused) {
                TaoInit.init();
            }
            if (o4p.e1()) {
                new ImagePopTask(this, 0).execute();
            } else {
                new ImagePopTask(this, 1).execute();
            }
        }
    }

    public void B2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b30289", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    @Override // com.etao.feimagesearch.ImagePopTask.b
    public void J(String str, boolean z, Map<String, String> map) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fa97cd", new Object[]{this, str, new Boolean(z), map});
        } else if (getActivity() != null) {
            if (!TextUtils.isEmpty(str)) {
                x2(str, z, map);
            } else {
                z2 = y2();
            }
            postEvent(new mre(str, z2));
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "ImageSearchGuideWidget";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.preview_image) {
            if (this.mActivity != null) {
                View view2 = this.e;
                if (view2 != null && view2.getVisibility() == 0) {
                    this.e.setVisibility(8);
                }
                sen.e("PhotoRecently");
                ArrayMap arrayMap = new ArrayMap();
                Map<String, String> map = this.h;
                if (map != null) {
                    arrayMap.putAll(map);
                }
                if (this.g) {
                    sen.f("ImagePopLocal", arrayMap);
                    str = "ssklocal";
                } else {
                    sen.f("ImagePopRemote", arrayMap);
                    str = "sskremote";
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(h1p.PAILITAO_EDITOR_URL));
                Bundle bundle = new Bundle();
                if (this.f != null) {
                    String d = this.l.getModel().d();
                    if (!TextUtils.isEmpty(d)) {
                        str2 = "sskview-" + d;
                    } else {
                        str2 = "sskview";
                    }
                    bundle.putString(wxi.EXTRA_KEY_PIC_URI, this.f);
                    bundle.putString("pssource", str2);
                    bundle.putString(wxi.KEY_PHOTO_FROM, str);
                    intent.putExtra(wxi.EXTRA_KEY_BUNDLE_PARAM, bundle);
                    this.mActivity.startActivity(intent);
                    this.f = null;
                }
            }
        } else if (view.getId() == R.id.photo_preview_panel) {
            u2();
        }
    }

    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        PopupWindow popupWindow = this.d;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.f18728a.removeCallbacks(this.c);
            this.d = null;
        }
    }

    public void onEventMainThread(z1p z1pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e265ad0", new Object[]{this, z1pVar});
        } else if (!o4p.R0()) {
            v2(this.mActivity, z1pVar.f32465a);
        }
    }

    public void u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1a88e9", new Object[]{this});
            return;
        }
        View view = this.e;
        if (view != null && view.getVisibility() == 0) {
            this.e.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.e.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.e);
            }
            this.f = null;
        }
    }

    public void v2(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2505b49a", new Object[]{this, activity, new Boolean(z)});
        } else if (z) {
            A2(activity);
        } else {
            u2();
        }
    }

    public final void w2(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee9c81a", new Object[]{this, searchBarHintBean});
        } else if (searchBarHintBean != null) {
            B2(searchBarHintBean.displayText);
        }
    }

    public final void x2(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95eef0b", new Object[]{this, str, new Boolean(z), map});
            return;
        }
        Activity activity = getActivity();
        if (activity != null && this.j.getVisibility() == 0) {
            if (this.e == null) {
                this.e = LayoutInflater.from(activity).inflate(R.layout.image_search_photo_preview_layout, this.k, false);
            }
            View view = this.e;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    ((RelativeLayout.LayoutParams) layoutParams).addRule(6, R.id.tbsearch_searchbar_container);
                    this.f = str;
                    this.g = z;
                    this.h = map;
                    if (z) {
                        sen.l("Page_SearchDoor_Show-ImagePopLocal", map);
                    } else {
                        sen.l("Page_SearchDoor_Show-ImagePopRemote", map);
                    }
                    CornerImageView cornerImageView = (CornerImageView) this.e.findViewById(R.id.preview_image);
                    cornerImageView.setRadius(o1p.a(2.0f));
                    cornerImageView.setImageUrl(str);
                    cornerImageView.setOnClickListener(this);
                    ((LinearLayout) this.e.findViewById(R.id.photo_preview_panel)).setOnClickListener(this);
                    LinearLayout linearLayout = (LinearLayout) this.e.findViewById(R.id.photo_preview_layout);
                    linearLayout.setBackgroundResource(R.drawable.feis_capture_bg_up);
                    int[] iArr = new int[2];
                    this.j.getLocationOnScreen(iArr);
                    int measuredWidth = (iArr[0] + (this.j.getMeasuredWidth() / 2)) - (DensityUtil.dip2px(activity, 105.0f) / 2);
                    int dip2px = DensityUtil.dip2px(activity, 105.0f);
                    int dip2px2 = DensityUtil.dip2px(activity, 143.0f);
                    int dip2px3 = DensityUtil.dip2px(activity, 36.0f);
                    if ((getActivity() instanceof mec) && ((mec) getActivity()).o2()) {
                        dip2px3 += SystemBarDecorator.getStatusBarHeight(this.mActivity);
                    }
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(dip2px, dip2px2);
                    layoutParams2.setMargins(measuredWidth, dip2px3, 0, 0);
                    linearLayout.setLayoutParams(layoutParams2);
                    this.e.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) this.e.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.e);
                    }
                    this.k.addView(this.e);
                    this.f18728a.postDelayed(this.b, Constants.STARTUP_TIME_LEVEL_1);
                }
            }
        }
    }

    public boolean y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59b27760", new Object[]{this})).booleanValue();
        }
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing() || this.j == null || !z2()) {
            return false;
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.image_search_new_member_guide_layout, (ViewGroup) null);
        inflate.measure(0, 0);
        int measuredWidth = inflate.getMeasuredWidth();
        int measuredHeight = inflate.getMeasuredHeight();
        String M = o4p.M();
        if (!TextUtils.isEmpty(M)) {
            ((TextView) inflate.findViewById(R.id.tv_guide_text)).setText(M);
        }
        int measuredWidth2 = (this.j.getMeasuredWidth() / 2) - (measuredWidth / 2);
        PopupWindow popupWindow = new PopupWindow(inflate, measuredWidth, measuredHeight);
        this.d = popupWindow;
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        this.d.setOutsideTouchable(true);
        if (activity.isFinishing() || this.j.getVisibility() != 0) {
            return false;
        }
        this.d.showAsDropDown(this.j, measuredWidth2, 0);
        this.f18728a.postDelayed(this.c, Constants.STARTUP_TIME_LEVEL_1);
        SharedPreferences c = v4p.c(activity);
        if (c != null) {
            SharedPreferences.Editor edit = c.edit();
            edit.putBoolean(h1p.IMAGE_SEARCH_NEW_MEMBER_GUIDE_INIT, true);
            edit.putLong(h1p.IMAGE_SEARCH_NEW_USER_GUIDE_TIME, System.currentTimeMillis());
            edit.apply();
        }
        return true;
    }

    public boolean z2() {
        View view;
        SharedPreferences c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a7881ca", new Object[]{this})).booleanValue();
        }
        Activity activity = getActivity();
        if (activity == null || (view = this.j) == null || view.getVisibility() != 0 || (c = v4p.c(activity)) == null) {
            return false;
        }
        String string = c.getString(h1p.FORMER_IMAGE_SEARCH_GUIDE_KEYWORD, "");
        if (!StringUtil.isEmpty(this.i) && this.i.contains(h1p.PAILITAO_TEXT) && !this.i.equals(string)) {
            SharedPreferences c2 = v4p.c(activity);
            if (c2 != null) {
                SharedPreferences.Editor edit = c2.edit();
                edit.putString(h1p.FORMER_IMAGE_SEARCH_GUIDE_KEYWORD, this.i);
                edit.apply();
            }
            return true;
        } else if (!c.getBoolean(h1p.IMAGE_SEARCH_NEW_MEMBER_GUIDE_INIT, false)) {
            return true;
        } else {
            if (o4p.D1() || !PltNewUser.isNewUser(activity)) {
                return false;
            }
            if (System.currentTimeMillis() - v4p.c(activity).getLong(h1p.IMAGE_SEARCH_NEW_USER_GUIDE_TIME, 0L) >= o4p.N()) {
                return true;
            }
            return false;
        }
    }

    public void onEventMainThread(k0p k0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448a68e3", new Object[]{this, k0pVar});
        } else {
            w2(k0pVar.f22330a);
        }
    }

    public void onEventMainThread(l0p l0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b435cd", new Object[]{this, l0pVar});
        } else {
            w2(l0pVar.f23041a);
        }
    }
}
